package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class ds extends View {
    public final Paint f34556a;
    public final Matrix f34557b;
    public LinearGradient f34558c;
    public int d;
    public float f34559e;
    public float f34560f;

    public ds(Context context) {
        super(context);
        this.f34556a = new Paint(1);
        this.f34557b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f34559e + this.f34560f, this.f34556a);
    }

    public void setColor(int i7) {
        if (this.d != i7) {
            this.d = i7;
            int alpha = Color.alpha(i7);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, (alpha * 232) / 255), i0.a.o(i7, (alpha * 192) / 255), i0.a.o(i7, (alpha * 144) / 255), i0.a.o(i7, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f34558c = linearGradient;
            this.f34556a.setShader(linearGradient);
            this.f34558c.setLocalMatrix(this.f34557b);
            invalidate();
        }
    }
}
