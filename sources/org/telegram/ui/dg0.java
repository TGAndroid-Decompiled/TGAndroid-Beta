package org.telegram.ui;

import android.content.Context;
public final class dg0 extends org.telegram.ui.Cells.q1 {
    public int f44977ld;
    public int f44978md;
    public int f44979nd;
    public final eg0 f44980od;

    public dg0(eg0 eg0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, true, null, h6Var);
        this.f44980od = eg0Var;
        this.f44977ld = Integer.MAX_VALUE;
        this.f44978md = Integer.MAX_VALUE;
        this.f44979nd = -1;
    }

    @Override
    public final xh.e V2() {
        return xh.e.d(1, this, this.f44980od.E);
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int e12;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f29887hb.f30878x0 && i10 != 0 && this.f44977ld != Integer.MAX_VALUE && i12 != 0 && this.f44978md != Integer.MAX_VALUE) {
            int i13 = this.f44979nd;
            int i14 = 0;
            if (getMessageObject() == null) {
                e12 = 0;
            } else {
                e12 = getMessageObject().e1();
            }
            if (i13 == e12) {
                if (!this.f44980od.f45296v0) {
                    setTranslationY(-(i10 - this.f44977ld));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.wq.h).start();
                }
                this.f44977ld = getTop();
                this.f44978md = getBottom();
                if (getMessageObject() != null) {
                    i14 = getMessageObject().e1();
                }
                this.f44979nd = i14;
            }
        }
    }
}
