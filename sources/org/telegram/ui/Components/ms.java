package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class ms extends View {
    public final Paint f28693a;
    public final Matrix f28694b;
    public LinearGradient f28695c;
    public int d;
    public float f28696e;
    public float f28697f;

    public ms(Context context) {
        super(context);
        this.f28693a = new Paint(1);
        this.f28694b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f28696e + this.f28697f, this.f28693a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f28695c = linearGradient;
            this.f28693a.setShader(linearGradient);
            this.f28695c.setLocalMatrix(this.f28694b);
            invalidate();
        }
    }
}
