package org.telegram.ui;

import android.content.Context;
public final class ag0 extends org.telegram.ui.Cells.q1 {
    public int f43647ld;
    public int f43648md;
    public int f43649nd;
    public final bg0 f43650od;

    public ag0(bg0 bg0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, true, null, f6Var);
        this.f43650od = bg0Var;
        this.f43647ld = Integer.MAX_VALUE;
        this.f43648md = Integer.MAX_VALUE;
        this.f43649nd = -1;
    }

    @Override
    public final xh.e V2() {
        return xh.e.d(1, this, this.f43650od.E);
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int f12;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f29872hb.f30863x0 && i10 != 0 && this.f43647ld != Integer.MAX_VALUE && i12 != 0 && this.f43648md != Integer.MAX_VALUE) {
            int i13 = this.f43649nd;
            int i14 = 0;
            if (getMessageObject() == null) {
                f12 = 0;
            } else {
                f12 = getMessageObject().f1();
            }
            if (i13 == f12) {
                if (!this.f43650od.f44346v0) {
                    setTranslationY(-(i10 - this.f43647ld));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                }
                this.f43647ld = getTop();
                this.f43648md = getBottom();
                if (getMessageObject() != null) {
                    i14 = getMessageObject().f1();
                }
                this.f43649nd = i14;
            }
        }
    }
}
