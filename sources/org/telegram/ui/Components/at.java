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
    public final Paint f24619a;
    public final Matrix f24620b;
    public LinearGradient f24621c;
    public int d;
    public float f24622e;
    public float f24623f;

    public at(Context context) {
        super(context);
        this.f24619a = new Paint(1);
        this.f24620b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f24622e + this.f24623f, this.f24619a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f24621c = linearGradient;
            this.f24619a.setShader(linearGradient);
            this.f24621c.setLocalMatrix(this.f24620b);
            invalidate();
        }
    }
}
