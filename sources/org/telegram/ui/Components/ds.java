package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class ds extends View {
    public final Paint f34551a;
    public final Matrix f34552b;
    public LinearGradient f34553c;
    public int d;
    public float f34554e;
    public float f34555f;

    public ds(Context context) {
        super(context);
        this.f34551a = new Paint(1);
        this.f34552b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f34554e + this.f34555f, this.f34551a);
    }

    public void setColor(int i7) {
        if (this.d != i7) {
            this.d = i7;
            int alpha = Color.alpha(i7);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, (alpha * 232) / 255), i0.a.o(i7, (alpha * 192) / 255), i0.a.o(i7, (alpha * 144) / 255), i0.a.o(i7, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f34553c = linearGradient;
            this.f34551a.setShader(linearGradient);
            this.f34553c.setLocalMatrix(this.f34552b);
            invalidate();
        }
    }
}
