package org.telegram.ui;

import android.content.Context;
public final class hh0 extends org.telegram.ui.Cells.q1 {
    public int f37816hd;
    public int f37817id;
    public int f37818jd;
    public final ih0 f37819kd;

    public hh0(ih0 ih0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, true, null, p6Var);
        this.f37819kd = ih0Var;
        this.f37816hd = Integer.MAX_VALUE;
        this.f37817id = Integer.MAX_VALUE;
        this.f37818jd = -1;
    }

    @Override
    public final nh.h S2() {
        return nh.h.d(1, this, this.f37819kd.E);
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int f12;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.gb.f23555x0 && i11 != 0 && this.f37816hd != Integer.MAX_VALUE && i13 != 0 && this.f37817id != Integer.MAX_VALUE) {
            int i14 = this.f37818jd;
            int i15 = 0;
            if (getMessageObject() == null) {
                f12 = 0;
            } else {
                f12 = getMessageObject().f1();
            }
            if (i14 == f12) {
                if (!this.f37819kd.f38085v0) {
                    setTranslationY(-(i11 - this.f37816hd));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                }
                this.f37816hd = getTop();
                this.f37817id = getBottom();
                if (getMessageObject() != null) {
                    i15 = getMessageObject().f1();
                }
                this.f37818jd = i15;
            }
        }
    }
}
