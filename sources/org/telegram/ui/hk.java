package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class hk implements LayoutTransition.TransitionListener {
    public gk f48410a;
    public int f48411b;
    public final org.telegram.ui.ActionBar.z f48412c;
    public final bn d;

    public hk(bn bnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = bnVar;
        this.f48412c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f48411b - 1;
        this.f48411b = i10;
        if (i10 == 0 && this.f48410a != null) {
            this.f48412c.getViewTreeObserver().removeOnPreDrawListener(this.f48410a);
            this.f48410a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f48411b == 0 && this.f48410a == null) {
            this.f48410a = new gk(this, 0);
            this.f48412c.getViewTreeObserver().addOnPreDrawListener(this.f48410a);
        }
        this.f48411b++;
    }
}
