package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import androidx.core.graphics.ColorUtils;

public final class DialogsActivityTopBubblesFadeView extends View {
    public float fadeHeight;
    public float fadeStart;
    public int lastColor;
    public final Matrix matrix;
    public final Paint paint;
    public LinearGradient shader;

    public DialogsActivityTopBubblesFadeView(Context context) {
        super(context);
        this.paint = new Paint(1);
        this.matrix = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.fadeStart + this.fadeHeight, this.paint);
    }

    public void setColor(int i) {
        if (this.lastColor != i) {
            this.lastColor = i;
            int iAlpha = Color.alpha(i);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{ColorUtils.setAlphaComponent(i, (iAlpha * 232) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 192) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 144) / 255), ColorUtils.setAlphaComponent(i, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.shader = linearGradient;
            this.paint.setShader(linearGradient);
            this.shader.setLocalMatrix(this.matrix);
            invalidate();
        }
    }
}
