package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k50 extends View {
    public int[] f40802a;
    public int f40803b;
    public final Paint f40804c;
    public float d;
    public final v50 e;

    public k50(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = v50Var;
        Paint paint = new Paint(1);
        this.f40804c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        v50 v50Var = this.e;
        if (v50Var.f44716z2 && v50Var.a2.f33905c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f40804c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f40802a;
        Paint paint = this.f40804c;
        boolean z10 = true;
        v50 v50Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f40802a = iArr;
            if (v50Var.f44640h1 != null) {
                float f7 = v50Var.f44644i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f40802a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (v50Var.f44644i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, v50Var.U0.getMeasuredHeight(), this.f40802a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f40803b != v50Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, v50Var.V1);
            this.f40803b = v50Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        v50Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f40804c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
