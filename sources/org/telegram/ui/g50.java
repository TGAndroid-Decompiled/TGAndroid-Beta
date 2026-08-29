package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g50 extends View {
    public int[] f38462a;
    public int f38463b;
    public final Paint f38464c;
    public float d;
    public final r50 f38465e;

    public g50(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f38465e = r50Var;
        Paint paint = new Paint(1);
        this.f38464c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        r50 r50Var = this.f38465e;
        if (r50Var.f41957v2 && r50Var.W1.f33798c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38464c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f38462a;
        Paint paint = this.f38464c;
        boolean z10 = true;
        r50 r50Var = this.f38465e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f38462a = iArr;
            if (r50Var.f41881d1 != null) {
                float f9 = r50Var.f41886e1;
                if (f9 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f9 * 255.0f));
                    int[] iArr3 = this.f38462a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (r50Var.f41886e1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, r50Var.Q0.getMeasuredHeight(), this.f38462a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f38463b != r50Var.R1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, r50Var.R1);
            this.f38463b = r50Var.R1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        r50Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f9 = i10;
        if (this.d != f9) {
            this.f38464c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.f38465e.R1);
            this.d = f9;
            invalidate();
        }
    }
}
