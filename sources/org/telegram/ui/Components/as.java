package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class as extends View {
    public final Paint f33541a;
    public final Matrix f33542b;
    public LinearGradient f33543c;
    public int d;
    public float f33544e;
    public float f33545f;

    public as(Context context) {
        super(context);
        this.f33541a = new Paint(1);
        this.f33542b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f33544e + this.f33545f, this.f33541a);
    }

    public void setColor(int i7) {
        if (this.d != i7) {
            this.d = i7;
            int alpha = Color.alpha(i7);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, (alpha * 232) / 255), i0.a.o(i7, (alpha * 192) / 255), i0.a.o(i7, (alpha * 144) / 255), i0.a.o(i7, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f33543c = linearGradient;
            this.f33541a.setShader(linearGradient);
            this.f33543c.setLocalMatrix(this.f33542b);
            invalidate();
        }
    }
}
