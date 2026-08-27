package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

public final class yr extends View {

    public final Paint f34950a;

    public final Matrix f34951b;

    public LinearGradient f34952c;
    public int d;

    public float f34953e;

    public float f34954f;

    public yr(Context context) {
        super(context);
        this.f34950a = new Paint(1);
        this.f34951b = new Matrix();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f34953e + this.f34954f, this.f34950a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int iAlpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.b.k(i10, (iAlpha * 232) / 255), i0.b.k(i10, (iAlpha * 192) / 255), i0.b.k(i10, (iAlpha * 144) / 255), i0.b.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.f34952c = linearGradient;
            this.f34950a.setShader(linearGradient);
            this.f34952c.setLocalMatrix(this.f34951b);
            invalidate();
        }
    }
}
