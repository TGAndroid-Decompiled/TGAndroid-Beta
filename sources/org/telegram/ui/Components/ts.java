package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class ts extends View {
    public final Paint f30712a;
    public final Matrix f30713b;
    public LinearGradient f30714c;
    public int d;
    public float e;
    public float f30715f;

    public ts(Context context) {
        super(context);
        this.f30712a = new Paint(1);
        this.f30713b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f30715f, this.f30712a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i10, (alpha * 232) / 255), i0.a.o(i10, (alpha * 192) / 255), i0.a.o(i10, (alpha * 144) / 255), i0.a.o(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f30714c = linearGradient;
            this.f30712a.setShader(linearGradient);
            this.f30714c.setLocalMatrix(this.f30713b);
            invalidate();
        }
    }
}
