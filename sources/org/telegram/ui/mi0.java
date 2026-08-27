package org.telegram.ui;

import android.content.Context;

public final class mi0 extends org.telegram.ui.Cells.s1 {
    public int Be;
    public int Ce;
    public int De;
    public final ni0 Ee;

    public mi0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, true, null, c6Var);
        this.Ee = ni0Var;
        this.Be = Integer.MAX_VALUE;
        this.Ce = Integer.MAX_VALUE;
        this.De = -1;
    }

    @Override
    public final boolean isPressed() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.Vc.f25186w0 || i11 == 0 || this.Be == Integer.MAX_VALUE || i13 == 0 || this.Ce == Integer.MAX_VALUE) {
            return;
        }
        if (this.De == (getMessageObject() == null ? 0 : getMessageObject().getId())) {
            if (!this.Ee.f40865s0) {
                setTranslationY(-(i11 - this.Be));
                animate().translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.er.h).start();
            }
            this.Be = getTop();
            this.Ce = getBottom();
            this.De = getMessageObject() != null ? getMessageObject().getId() : 0;
        }
    }

    @Override
    public final eh.j v3() {
        return eh.j.d(1, this, this.Ee.B);
    }
}
