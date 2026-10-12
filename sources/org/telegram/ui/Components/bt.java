package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class bt extends View {
    public final Paint f24731a;
    public final Matrix f24732b;
    public LinearGradient f24733c;
    public int d;
    public float f24734e;
    public float f24735f;

    public bt(Context context) {
        super(context);
        this.f24731a = new Paint(1);
        this.f24732b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f24734e + this.f24735f, this.f24731a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f24733c = linearGradient;
            this.f24731a.setShader(linearGradient);
            this.f24733c.setLocalMatrix(this.f24732b);
            invalidate();
        }
    }
}
