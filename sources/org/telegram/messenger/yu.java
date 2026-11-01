package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
public final class yu extends ru {
    public final Paint W;

    public yu(wv wvVar, Rect rect, int i10) {
        super(wvVar, rect, i10);
        this.W = new Paint(1);
    }

    @Override
    public final int H() {
        Rect rect = this.f17968b;
        return m5.C(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.f17968b;
        return i0.L(32.0f) + rect.left + rect.right;
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        wv wvVar = this.f17967a;
        if (wvVar.E()) {
            i10 = org.telegram.ui.ActionBar.t6.ul;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.tl;
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, wvVar.D);
        Paint paint = this.W;
        paint.setColor(w02);
        float f10 = -wvVar.S;
        int i12 = wvVar.C + wvVar.T;
        Rect rect = this.f17968b;
        float f11 = (i12 - rect.left) - rect.right;
        float f12 = 0.0f;
        if (wvVar.f19344s) {
            if (this.R) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.Q) {
                f12 = 1.0f;
            }
            f12 = i0.T1(f7, f12, wvVar.f19345t);
        } else if (this.Q) {
            f12 = 1.0f;
        }
        xu xuVar = this.L;
        if (xuVar != null) {
            i11 = xuVar.f17968b.bottom;
        } else {
            i11 = 0;
        }
        float T1 = i0.T1((-1.0f) - i11, i0.L(6.0f), f12);
        canvas.drawRect(f10, T1, f11, T1 + 1.0f, paint);
    }
}
