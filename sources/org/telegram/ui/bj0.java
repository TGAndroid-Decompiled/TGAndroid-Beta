package org.telegram.ui;

import android.content.Context;
public final class bj0 extends org.telegram.ui.Cells.t1 {
    public int Fe;
    public int Ge;
    public int He;
    public final cj0 Ie;

    public bj0(cj0 cj0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, true, null, f6Var);
        this.Ie = cj0Var;
        this.Fe = Integer.MAX_VALUE;
        this.Ge = Integer.MAX_VALUE;
        this.He = -1;
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int id2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Zc.f22829w0 && i11 != 0 && this.Fe != Integer.MAX_VALUE && i13 != 0 && this.Ge != Integer.MAX_VALUE) {
            int i14 = this.He;
            int i15 = 0;
            if (getMessageObject() == null) {
                id2 = 0;
            } else {
                id2 = getMessageObject().getId();
            }
            if (i14 == id2) {
                if (!this.Ie.f35184w0) {
                    setTranslationY(-(i11 - this.Fe));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                }
                this.Fe = getTop();
                this.Ge = getBottom();
                if (getMessageObject() != null) {
                    i15 = getMessageObject().getId();
                }
                this.He = i15;
            }
        }
    }

    @Override
    public final wh.g w3() {
        return wh.g.d(1, this, this.Ie.F);
    }
}
