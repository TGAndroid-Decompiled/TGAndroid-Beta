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
    public final Paint f24661a;
    public final Matrix f24662b;
    public LinearGradient f24663c;
    public int d;
    public float f24664e;
    public float f24665f;

    public at(Context context) {
        super(context);
        this.f24661a = new Paint(1);
        this.f24662b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f24664e + this.f24665f, this.f24661a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f24663c = linearGradient;
            this.f24661a.setShader(linearGradient);
            this.f24663c.setLocalMatrix(this.f24662b);
            invalidate();
        }
    }
}
