package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class nr extends View {
    public final Paint f36362a;
    public final Matrix f36363b;
    public LinearGradient f36364c;
    public int d;
    public float f36365e;
    public float f36366f;

    public nr(Context context) {
        super(context);
        this.f36362a = new Paint(1);
        this.f36363b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f36365e + this.f36366f, this.f36362a);
    }

    public void setColor(int i7) {
        if (this.d != i7) {
            this.d = i7;
            int alpha = Color.alpha(i7);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, (alpha * 232) / 255), i0.a.o(i7, (alpha * 192) / 255), i0.a.o(i7, (alpha * 144) / 255), i0.a.o(i7, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f36364c = linearGradient;
            this.f36362a.setShader(linearGradient);
            this.f36364c.setLocalMatrix(this.f36363b);
            invalidate();
        }
    }
}
