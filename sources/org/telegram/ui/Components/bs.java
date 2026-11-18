package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class bs extends View {
    public final Paint f33761a;
    public final Matrix f33762b;
    public LinearGradient f33763c;
    public int d;
    public float f33764e;
    public float f33765f;

    public bs(Context context) {
        super(context);
        this.f33761a = new Paint(1);
        this.f33762b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f33764e + this.f33765f, this.f33761a);
    }

    public void setColor(int i7) {
        if (this.d != i7) {
            this.d = i7;
            int alpha = Color.alpha(i7);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, (alpha * 232) / 255), i0.a.o(i7, (alpha * 192) / 255), i0.a.o(i7, (alpha * 144) / 255), i0.a.o(i7, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f33763c = linearGradient;
            this.f33761a.setShader(linearGradient);
            this.f33763c.setLocalMatrix(this.f33762b);
            invalidate();
        }
    }
}
