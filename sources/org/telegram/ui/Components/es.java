package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class es extends View {
    public final Paint f28166a;
    public final Matrix f28167b;
    public LinearGradient f28168c;
    public int d;
    public float f28169e;
    public float f28170f;

    public es(Context context) {
        super(context);
        this.f28166a = new Paint(1);
        this.f28167b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f28169e + this.f28170f, this.f28166a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f28168c = linearGradient;
            this.f28166a.setShader(linearGradient);
            this.f28168c.setLocalMatrix(this.f28167b);
            invalidate();
        }
    }
}
