package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class h50 extends View {
    public int[] f37433a;
    public int f37434b;
    public final Paint f37435c;
    public float d;
    public final s50 e;

    public h50(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = s50Var;
        Paint paint = new Paint(1);
        this.f37435c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        s50 s50Var = this.e;
        if (s50Var.f41019z2 && s50Var.a2.f31556c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f37435c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f37433a;
        Paint paint = this.f37435c;
        boolean z10 = true;
        s50 s50Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f37433a = iArr;
            if (s50Var.f40943h1 != null) {
                float f7 = s50Var.f40947i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.b.o(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f37433a;
                    iArr3[1] = i0.b.o(iArr3[1], (int) (s50Var.f40947i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, s50Var.U0.getMeasuredHeight(), this.f37433a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f37434b != s50Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, s50Var.V1);
            this.f37434b = s50Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        s50Var.A1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f37435c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
