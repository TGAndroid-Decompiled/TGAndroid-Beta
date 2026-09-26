package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class ls extends View {
    public final Paint f26155a;
    public final Matrix f26156b;
    public LinearGradient f26157c;
    public int d;
    public float e;
    public float f26158f;

    public ls(Context context) {
        super(context);
        this.f26155a = new Paint(1);
        this.f26156b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f26158f, this.f26155a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f26157c = linearGradient;
            this.f26155a.setShader(linearGradient);
            this.f26157c.setLocalMatrix(this.f26156b);
            invalidate();
        }
    }
}
