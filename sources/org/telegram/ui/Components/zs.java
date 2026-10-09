package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class zs extends View {
    public final Paint f33631a;
    public final Matrix f33632b;
    public LinearGradient f33633c;
    public int d;
    public float f33634e;
    public float f33635f;

    public zs(Context context) {
        super(context);
        this.f33631a = new Paint(1);
        this.f33632b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f33634e + this.f33635f, this.f33631a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f33633c = linearGradient;
            this.f33631a.setShader(linearGradient);
            this.f33633c.setLocalMatrix(this.f33632b);
            invalidate();
        }
    }
}
