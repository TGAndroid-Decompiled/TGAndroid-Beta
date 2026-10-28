package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m50 extends View {
    public int[] f41336a;
    public int f41337b;
    public final Paint f41338c;
    public float d;
    public final x50 e;

    public m50(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = x50Var;
        Paint paint = new Paint(1);
        this.f41338c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        x50 x50Var = this.e;
        if (x50Var.f45597z2 && x50Var.a2.f34010c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f41338c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f41336a;
        Paint paint = this.f41338c;
        boolean z10 = true;
        x50 x50Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f41336a = iArr;
            if (x50Var.f45521h1 != null) {
                float f7 = x50Var.f45525i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f41336a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (x50Var.f45525i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, x50Var.U0.getMeasuredHeight(), this.f41336a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f41337b != x50Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, x50Var.V1);
            this.f41337b = x50Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        x50Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f41338c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
