package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class h50 extends View {

    public int[] f38682a;

    public int f38683b;

    public final Paint f38684c;
    public float d;

    public final s50 f38685e;

    public h50(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f38685e = s50Var;
        Paint paint = new Paint(1);
        this.f38684c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        s50 s50Var = this.f38685e;
        if (!s50Var.f42499v2 || s50Var.W1.f33650c >= 0.1d) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38684c);
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f38682a;
        Paint paint = this.f38684c;
        boolean z10 = true;
        s50 s50Var = this.f38685e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f38682a = iArr;
            if (s50Var.f42423d1 != null) {
                float f10 = s50Var.f42428e1;
                if (f10 != 1.0f) {
                    iArr[0] = i0.b.k(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f38682a;
                    iArr3[1] = i0.b.k(iArr3[1], (int) (s50Var.f42428e1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, s50Var.Q0.getMeasuredHeight(), this.f38682a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f38683b != s50Var.R1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, s50Var.R1);
            this.f38683b = s50Var.R1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        s50Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f10 = i10;
        if (this.d != f10) {
            this.f38684c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.f38685e.R1);
            this.d = f10;
            invalidate();
        }
    }
}
