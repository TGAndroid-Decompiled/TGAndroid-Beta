package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class js extends View {
    public final Paint f25404a;
    public final Matrix f25405b;
    public LinearGradient f25406c;
    public int d;
    public float e;
    public float f25407f;

    public js(Context context) {
        super(context);
        this.f25404a = new Paint(1);
        this.f25405b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f25407f, this.f25404a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f25406c = linearGradient;
            this.f25404a.setShader(linearGradient);
            this.f25406c.setLocalMatrix(this.f25405b);
            invalidate();
        }
    }
}
