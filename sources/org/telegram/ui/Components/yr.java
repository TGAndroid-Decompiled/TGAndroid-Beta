package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class yr extends View {
    public final Paint f32892a;
    public final Matrix f32893b;
    public LinearGradient f32894c;
    public int d;
    public float e;
    public float f32895f;

    public yr(Context context) {
        super(context);
        this.f32892a = new Paint(1);
        this.f32893b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f32895f, this.f32892a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.b.o(i10, (alpha * 232) / 255), i0.b.o(i10, (alpha * 192) / 255), i0.b.o(i10, (alpha * 144) / 255), i0.b.o(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f32894c = linearGradient;
            this.f32892a.setShader(linearGradient);
            this.f32894c.setLocalMatrix(this.f32893b);
            invalidate();
        }
    }
}
