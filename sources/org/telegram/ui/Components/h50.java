package org.telegram.ui.Components;

import android.content.Context;
public final class h50 extends org.telegram.ui.Cells.y8 {
    public final i50 E;
    public final lt f34303x;
    public boolean f34304y;

    public h50(i50 i50Var, Context context) {
        super(context);
        this.E = i50Var;
        this.f34303x = new lt(this, 5);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lt ltVar = this.f34303x;
        org.telegram.messenger.g0.r(ltVar);
        if (this.f34304y) {
            org.telegram.messenger.g0.i3(ltVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f34303x);
    }
}
