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
    public final Paint f26889a;
    public final Matrix f26890b;
    public LinearGradient f26891c;
    public int d;
    public float f26892e;
    public float f26893f;

    public as(Context context) {
        super(context);
        this.f26889a = new Paint(1);
        this.f26890b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f26892e + this.f26893f, this.f26889a);
    }

    public void setColor(int i9) {
        if (this.d != i9) {
            this.d = i9;
            int alpha = Color.alpha(i9);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i9, (alpha * 232) / 255), i0.a.k(i9, (alpha * 192) / 255), i0.a.k(i9, (alpha * 144) / 255), i0.a.k(i9, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f26891c = linearGradient;
            this.f26889a.setShader(linearGradient);
            this.f26891c.setLocalMatrix(this.f26890b);
            invalidate();
        }
    }
}
