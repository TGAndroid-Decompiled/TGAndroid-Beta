package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class j50 extends View {
    public int[] f38463a;
    public int f38464b;
    public final Paint f38465c;
    public float d;
    public final u50 e;

    public j50(u50 u50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = u50Var;
        Paint paint = new Paint(1);
        this.f38465c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        u50 u50Var = this.e;
        if (u50Var.f42277z2 && u50Var.a2.f31702c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38465c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f38463a;
        Paint paint = this.f38465c;
        boolean z10 = true;
        u50 u50Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f38463a = iArr;
            if (u50Var.f42201h1 != null) {
                float f7 = u50Var.f42205i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f38463a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (u50Var.f42205i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, u50Var.U0.getMeasuredHeight(), this.f38463a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f38464b != u50Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, u50Var.V1);
            this.f38464b = u50Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        u50Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f38465c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
