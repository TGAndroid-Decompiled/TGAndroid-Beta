package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class hk implements LayoutTransition.TransitionListener {
    public gk f48409a;
    public int f48410b;
    public final org.telegram.ui.ActionBar.y f48411c;
    public final bn d;

    public hk(bn bnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = bnVar;
        this.f48411c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f48410b - 1;
        this.f48410b = i10;
        if (i10 == 0 && this.f48409a != null) {
            this.f48411c.getViewTreeObserver().removeOnPreDrawListener(this.f48409a);
            this.f48409a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f48410b == 0 && this.f48409a == null) {
            this.f48409a = new gk(this, 0);
            this.f48411c.getViewTreeObserver().addOnPreDrawListener(this.f48409a);
        }
        this.f48410b++;
    }
}
