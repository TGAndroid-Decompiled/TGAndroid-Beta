package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c60 extends View {
    public int[] f34740a;
    public int f34741b;
    public final Paint f34742c;
    public float d;
    public final n60 e;

    public c60(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = n60Var;
        Paint paint = new Paint(1);
        this.f34742c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n60 n60Var = this.e;
        if (n60Var.f38548z2 && n60Var.a2.f30283c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f34742c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f34740a;
        Paint paint = this.f34742c;
        boolean z10 = true;
        n60 n60Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f34740a = iArr;
            if (n60Var.f38472h1 != null) {
                float f7 = n60Var.f38476i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f34740a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (n60Var.f38476i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, n60Var.U0.getMeasuredHeight(), this.f34740a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f34741b != n60Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, n60Var.V1);
            this.f34741b = n60Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        n60Var.A1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f34742c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
