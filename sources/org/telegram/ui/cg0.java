package org.telegram.ui;

import android.content.Context;
public final class cg0 extends org.telegram.ui.Cells.q1 {
    public int f44304ld;
    public int f44305md;
    public int f44306nd;
    public final dg0 f44307od;

    public cg0(dg0 dg0Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i7, true, null, g6Var);
        this.f44307od = dg0Var;
        this.f44304ld = Integer.MAX_VALUE;
        this.f44305md = Integer.MAX_VALUE;
        this.f44306nd = -1;
    }

    @Override
    public final xh.e V2() {
        return xh.e.d(1, this, this.f44307od.E);
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int e12;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f29876hb.f30867x0 && i10 != 0 && this.f44304ld != Integer.MAX_VALUE && i12 != 0 && this.f44305md != Integer.MAX_VALUE) {
            int i13 = this.f44306nd;
            int i14 = 0;
            if (getMessageObject() == null) {
                e12 = 0;
            } else {
                e12 = getMessageObject().e1();
            }
            if (i13 == e12) {
                if (!this.f44307od.f44975v0) {
                    setTranslationY(-(i10 - this.f44304ld));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                }
                this.f44304ld = getTop();
                this.f44305md = getBottom();
                if (getMessageObject() != null) {
                    i14 = getMessageObject().e1();
                }
                this.f44306nd = i14;
            }
        }
    }
}
