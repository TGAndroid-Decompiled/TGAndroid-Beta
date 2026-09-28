package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class ls extends View {
    public final Paint f26075a;
    public final Matrix f26076b;
    public LinearGradient f26077c;
    public int d;
    public float e;
    public float f26078f;

    public ls(Context context) {
        super(context);
        this.f26075a = new Paint(1);
        this.f26076b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f26078f, this.f26075a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f26077c = linearGradient;
            this.f26075a.setShader(linearGradient);
            this.f26077c.setLocalMatrix(this.f26076b);
            invalidate();
        }
    }
}
