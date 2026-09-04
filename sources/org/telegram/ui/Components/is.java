package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class is extends View {
    public final Paint f27248a;
    public final Matrix f27249b;
    public LinearGradient f27250c;
    public int d;
    public float f27251e;
    public float f27252f;

    public is(Context context) {
        super(context);
        this.f27248a = new Paint(1);
        this.f27249b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f27251e + this.f27252f, this.f27248a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f27250c = linearGradient;
            this.f27248a.setShader(linearGradient);
            this.f27250c.setLocalMatrix(this.f27249b);
            invalidate();
        }
    }
}
