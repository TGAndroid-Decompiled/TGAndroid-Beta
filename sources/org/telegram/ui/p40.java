package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class p40 extends View {
    public int[] f40366a;
    public int f40367b;
    public final Paint f40368c;
    public float d;
    public final a50 e;

    public p40(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = a50Var;
        Paint paint = new Paint(1);
        this.f40368c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a50 a50Var = this.e;
        if (a50Var.f35650q4 && a50Var.R3.f31794c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f40368c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f40366a;
        Paint paint = this.f40368c;
        boolean z10 = true;
        a50 a50Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f40366a = iArr;
            if (a50Var.Y2 != null) {
                float f7 = a50Var.Z2;
                if (f7 != 1.0f) {
                    iArr[0] = i0.b.o(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f40366a;
                    iArr3[1] = i0.b.o(iArr3[1], (int) (a50Var.Z2 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, a50Var.L2.getMeasuredHeight(), this.f40366a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f40367b != a50Var.M3) {
            paint.setShadowLayer(org.telegram.messenger.i0.L(36.0f), 0.0f, this.d, a50Var.M3);
            this.f40367b = a50Var.M3;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        a50Var.B1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f40368c.setShadowLayer(org.telegram.messenger.i0.L(36.0f), 0.0f, this.d, this.e.M3);
            this.d = f7;
            invalidate();
        }
    }
}
