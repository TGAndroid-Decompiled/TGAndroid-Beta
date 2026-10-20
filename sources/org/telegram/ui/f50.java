package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class f50 extends View {
    public int[] f36897a;
    public int f36898b;
    public final Paint f36899c;
    public float d;
    public final q50 e;

    public f50(q50 q50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = q50Var;
        Paint paint = new Paint(1);
        this.f36899c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        q50 q50Var = this.e;
        if (q50Var.f40482z2 && q50Var.a2.f31516c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f36899c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f36897a;
        Paint paint = this.f36899c;
        boolean z10 = true;
        q50 q50Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f36897a = iArr;
            if (q50Var.f40406h1 != null) {
                float f7 = q50Var.f40410i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f36897a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (q50Var.f40410i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, q50Var.U0.getMeasuredHeight(), this.f36897a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f36898b != q50Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, q50Var.V1);
            this.f36898b = q50Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        q50Var.A1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f36899c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
