package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class m30 extends View {
    public int[] f47491a;
    public int f47492b;
    public final Paint f47493c;
    public float d;
    public final x30 f47494e;

    public m30(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f47494e = x30Var;
        Paint paint = new Paint(1);
        this.f47493c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        x30 x30Var = this.f47494e;
        if (x30Var.f51790r4 && x30Var.S3.f39672c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f47493c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f47491a;
        Paint paint = this.f47493c;
        boolean z10 = true;
        x30 x30Var = this.f47494e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f47491a = iArr;
            if (x30Var.Z2 != null) {
                float f10 = x30Var.f51717a3;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f47491a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (x30Var.f51717a3 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, x30Var.M2.getMeasuredHeight(), this.f47491a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f47492b != x30Var.N3) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, x30Var.N3);
            this.f47492b = x30Var.N3;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        x30Var.B1();
    }

    public void setShadowOffset(int i3) {
        float f10 = i3;
        if (this.d != f10) {
            this.f47493c.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, this.f47494e.N3);
            this.d = f10;
            invalidate();
        }
    }
}
