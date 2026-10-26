package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class vs extends View {
    public final Paint f34254a;
    public final Matrix f34255b;
    public LinearGradient f34256c;
    public int d;
    public float e;
    public float f34257f;

    public vs(Context context) {
        super(context);
        this.f34254a = new Paint(1);
        this.f34255b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f34257f, this.f34254a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i10, (alpha * 232) / 255), i0.a.o(i10, (alpha * 192) / 255), i0.a.o(i10, (alpha * 144) / 255), i0.a.o(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f34256c = linearGradient;
            this.f34254a.setShader(linearGradient);
            this.f34256c.setLocalMatrix(this.f34255b);
            invalidate();
        }
    }
}
