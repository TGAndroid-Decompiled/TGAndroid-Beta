package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
public final class yu extends qu {
    public final Paint W;

    public yu(vv vvVar, Rect rect, int i10) {
        super(vvVar, rect, i10);
        this.W = new Paint(1);
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return i0.L(12.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return i0.L(32.0f);
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        vv vvVar = this.f17621a;
        int i11 = vvVar.C;
        int i12 = vvVar.S;
        int i13 = i11 + i12 + vvVar.T;
        Rect rect = this.f17622b;
        int i14 = rect.left;
        int i15 = (i13 - i14) - rect.right;
        int i16 = i15 / 2;
        float f7 = (((i15 - i16) / 2.0f) - i12) + i14;
        float L = (i0.L(12.0f) - i0.L(1.0f)) / 2.0f;
        if (vvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.kl;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.jl;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, vvVar.D);
        Paint paint = this.W;
        paint.setColor(w02);
        RectF rectF = i0.P;
        rectF.set(f7, L, i16 + f7, i0.L(1.0f) + L);
        canvas.drawRoundRect(rectF, i0.L(0.5f), i0.L(0.5f), paint);
    }
}
