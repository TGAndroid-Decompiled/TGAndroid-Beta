package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class or extends View {
    public final Paint f36924a;
    public final Matrix f36925b;
    public LinearGradient f36926c;
    public int d;
    public float f36927e;
    public float f36928f;

    public or(Context context) {
        super(context);
        this.f36924a = new Paint(1);
        this.f36925b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f36927e + this.f36928f, this.f36924a);
    }

    public void setColor(int i3) {
        if (this.d != i3) {
            this.d = i3;
            int alpha = Color.alpha(i3);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i3, (alpha * 232) / 255), i0.a.o(i3, (alpha * 192) / 255), i0.a.o(i3, (alpha * 144) / 255), i0.a.o(i3, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f36926c = linearGradient;
            this.f36924a.setShader(linearGradient);
            this.f36926c.setLocalMatrix(this.f36925b);
            invalidate();
        }
    }
}
