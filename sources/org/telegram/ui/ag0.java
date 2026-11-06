package org.telegram.ui;

import android.content.Context;
public final class ag0 extends org.telegram.ui.Cells.q1 {
    public int f43641kd;
    public int f43642ld;
    public int f43643md;
    public final bg0 f43644nd;

    public ag0(bg0 bg0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, true, null, f6Var);
        this.f43644nd = bg0Var;
        this.f43641kd = Integer.MAX_VALUE;
        this.f43642ld = Integer.MAX_VALUE;
        this.f43643md = -1;
    }

    @Override
    public final xh.e V2() {
        return xh.e.d(1, this, this.f43644nd.E);
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int f12;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f29869hb.f30859x0 && i10 != 0 && this.f43641kd != Integer.MAX_VALUE && i12 != 0 && this.f43642ld != Integer.MAX_VALUE) {
            int i13 = this.f43643md;
            int i14 = 0;
            if (getMessageObject() == null) {
                f12 = 0;
            } else {
                f12 = getMessageObject().f1();
            }
            if (i13 == f12) {
                if (!this.f43644nd.f44343v0) {
                    setTranslationY(-(i10 - this.f43641kd));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                }
                this.f43641kd = getTop();
                this.f43642ld = getBottom();
                if (getMessageObject() != null) {
                    i14 = getMessageObject().f1();
                }
                this.f43643md = i14;
            }
        }
    }
}
