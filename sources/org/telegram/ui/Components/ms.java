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
    public final Paint f28687a;
    public final Matrix f28688b;
    public LinearGradient f28689c;
    public int d;
    public float f28690e;
    public float f28691f;

    public ms(Context context) {
        super(context);
        this.f28687a = new Paint(1);
        this.f28688b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f28690e + this.f28691f, this.f28687a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f28689c = linearGradient;
            this.f28687a.setShader(linearGradient);
            this.f28689c.setLocalMatrix(this.f28688b);
            invalidate();
        }
    }
}
