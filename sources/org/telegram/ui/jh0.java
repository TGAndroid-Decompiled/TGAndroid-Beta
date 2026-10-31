package org.telegram.ui;

import android.content.Context;
public final class jh0 extends org.telegram.ui.Cells.q1 {
    public int f38527hd;
    public int f38528id;
    public int f38529jd;
    public final kh0 f38530kd;

    public jh0(kh0 kh0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, true, null, p6Var);
        this.f38530kd = kh0Var;
        this.f38527hd = Integer.MAX_VALUE;
        this.f38528id = Integer.MAX_VALUE;
        this.f38529jd = -1;
    }

    @Override
    public final nh.h S2() {
        return nh.h.d(1, this, this.f38530kd.E);
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int f12;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.gb.f23554x0 && i11 != 0 && this.f38527hd != Integer.MAX_VALUE && i13 != 0 && this.f38528id != Integer.MAX_VALUE) {
            int i14 = this.f38529jd;
            int i15 = 0;
            if (getMessageObject() == null) {
                f12 = 0;
            } else {
                f12 = getMessageObject().f1();
            }
            if (i14 == f12) {
                if (!this.f38530kd.f38855v0) {
                    setTranslationY(-(i11 - this.f38527hd));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                }
                this.f38527hd = getTop();
                this.f38528id = getBottom();
                if (getMessageObject() != null) {
                    i15 = getMessageObject().f1();
                }
                this.f38529jd = i15;
            }
        }
    }
}
