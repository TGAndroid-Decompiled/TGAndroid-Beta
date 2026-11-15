package org.telegram.ui.Components;

import android.content.Context;
public final class o50 extends org.telegram.ui.Cells.y8 {
    public final p50 E;
    public final zj f37841x;
    public boolean f37842y;

    public o50(p50 p50Var, Context context) {
        super(context);
        this.E = p50Var;
        this.f37841x = new zj(this, 9);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zj zjVar = this.f37841x;
        org.telegram.messenger.g0.r(zjVar);
        if (this.f37842y) {
            org.telegram.messenger.g0.i3(zjVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f37841x);
    }
}
