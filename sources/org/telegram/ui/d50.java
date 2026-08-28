package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d50 extends View {
    public int[] f37415a;
    public int f37416b;
    public final Paint f37417c;
    public float d;
    public final o50 f37418e;

    public d50(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f37418e = o50Var;
        Paint paint = new Paint(1);
        this.f37417c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o50 o50Var = this.f37418e;
        if (o50Var.f40970v2 && o50Var.W1.f33600c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f37417c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f37415a;
        Paint paint = this.f37417c;
        boolean z10 = true;
        o50 o50Var = this.f37418e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f37415a = iArr;
            if (o50Var.f40894d1 != null) {
                float f10 = o50Var.f40899e1;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f37415a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (o50Var.f40899e1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, o50Var.Q0.getMeasuredHeight(), this.f37415a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f37416b != o50Var.R1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, o50Var.R1);
            this.f37416b = o50Var.R1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        o50Var.z1();
    }

    public void setShadowOffset(int i9) {
        float f10 = i9;
        if (this.d != f10) {
            this.f37417c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.f37418e.R1);
            this.d = f10;
            invalidate();
        }
    }
}
