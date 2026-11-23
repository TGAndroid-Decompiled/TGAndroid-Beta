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
    public final Paint f34530a;
    public final Matrix f34531b;
    public LinearGradient f34532c;
    public int d;
    public float f34533e;
    public float f34534f;

    public ds(Context context) {
        super(context);
        this.f34530a = new Paint(1);
        this.f34531b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f34533e + this.f34534f, this.f34530a);
    }

    public void setColor(int i7) {
        if (this.d != i7) {
            this.d = i7;
            int alpha = Color.alpha(i7);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, (alpha * 232) / 255), i0.a.o(i7, (alpha * 192) / 255), i0.a.o(i7, (alpha * 144) / 255), i0.a.o(i7, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f34532c = linearGradient;
            this.f34530a.setShader(linearGradient);
            this.f34532c.setLocalMatrix(this.f34531b);
            invalidate();
        }
    }
}
