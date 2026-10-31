package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class q40 extends View {
    public int[] f40863a;
    public int f40864b;
    public final Paint f40865c;
    public float d;
    public final b50 e;

    public q40(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = b50Var;
        Paint paint = new Paint(1);
        this.f40865c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b50 b50Var = this.e;
        if (b50Var.f36066q4 && b50Var.R3.f31714c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f40865c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f40863a;
        Paint paint = this.f40865c;
        boolean z10 = true;
        b50 b50Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f40863a = iArr;
            if (b50Var.Y2 != null) {
                float f7 = b50Var.Z2;
                if (f7 != 1.0f) {
                    iArr[0] = i0.b.o(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f40863a;
                    iArr3[1] = i0.b.o(iArr3[1], (int) (b50Var.Z2 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b50Var.L2.getMeasuredHeight(), this.f40863a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f40864b != b50Var.M3) {
            paint.setShadowLayer(org.telegram.messenger.i0.L(36.0f), 0.0f, this.d, b50Var.M3);
            this.f40864b = b50Var.M3;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        b50Var.B1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f40865c.setShadowLayer(org.telegram.messenger.i0.L(36.0f), 0.0f, this.d, this.e.M3);
            this.d = f7;
            invalidate();
        }
    }
}
