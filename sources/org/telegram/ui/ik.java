package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class ik implements LayoutTransition.TransitionListener {
    public hk f46654a;
    public int f46655b;
    public final org.telegram.ui.ActionBar.y f46656c;
    public final cn d;

    public ik(cn cnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = cnVar;
        this.f46656c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f46655b - 1;
        this.f46655b = i10;
        if (i10 == 0 && this.f46654a != null) {
            this.f46656c.getViewTreeObserver().removeOnPreDrawListener(this.f46654a);
            this.f46654a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f46655b == 0 && this.f46654a == null) {
            this.f46654a = new hk(this, 0);
            this.f46656c.getViewTreeObserver().addOnPreDrawListener(this.f46654a);
        }
        this.f46655b++;
    }
}
