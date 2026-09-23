package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class ks extends View {
    public final Paint f25679a;
    public final Matrix f25680b;
    public LinearGradient f25681c;
    public int d;
    public float e;
    public float f25682f;

    public ks(Context context) {
        super(context);
        this.f25679a = new Paint(1);
        this.f25680b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f25682f, this.f25679a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f25681c = linearGradient;
            this.f25679a.setShader(linearGradient);
            this.f25681c.setLocalMatrix(this.f25680b);
            invalidate();
        }
    }
}
