package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class ur extends View {
    public final Paint f40149a;
    public final Matrix f40150b;
    public LinearGradient f40151c;
    public int d;
    public float f40152e;
    public float f40153f;

    public ur(Context context) {
        super(context);
        this.f40149a = new Paint(1);
        this.f40150b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f40152e + this.f40153f, this.f40149a);
    }

    public void setColor(int i7) {
        if (this.d != i7) {
            this.d = i7;
            int alpha = Color.alpha(i7);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, (alpha * 232) / 255), i0.a.o(i7, (alpha * 192) / 255), i0.a.o(i7, (alpha * 144) / 255), i0.a.o(i7, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f40151c = linearGradient;
            this.f40149a.setShader(linearGradient);
            this.f40151c.setLocalMatrix(this.f40150b);
            invalidate();
        }
    }
}
