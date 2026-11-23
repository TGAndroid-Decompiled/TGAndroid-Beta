package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class hk implements LayoutTransition.TransitionListener {
    public gk f48413a;
    public int f48414b;
    public final org.telegram.ui.ActionBar.y f48415c;
    public final bn d;

    public hk(bn bnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = bnVar;
        this.f48415c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f48414b - 1;
        this.f48414b = i10;
        if (i10 == 0 && this.f48413a != null) {
            this.f48415c.getViewTreeObserver().removeOnPreDrawListener(this.f48413a);
            this.f48413a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f48414b == 0 && this.f48413a == null) {
            this.f48413a = new gk(this, 0);
            this.f48415c.getViewTreeObserver().addOnPreDrawListener(this.f48413a);
        }
        this.f48414b++;
    }
}
