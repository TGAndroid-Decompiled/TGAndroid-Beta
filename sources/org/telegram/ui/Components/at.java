package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class at extends View {
    public final Paint f24572a;
    public final Matrix f24573b;
    public LinearGradient f24574c;
    public int d;
    public float f24575e;
    public float f24576f;

    public at(Context context) {
        super(context);
        this.f24572a = new Paint(1);
        this.f24573b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f24575e + this.f24576f, this.f24572a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f24574c = linearGradient;
            this.f24572a.setShader(linearGradient);
            this.f24574c.setLocalMatrix(this.f24573b);
            invalidate();
        }
    }
}
