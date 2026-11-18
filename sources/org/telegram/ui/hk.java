package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class hk implements LayoutTransition.TransitionListener {
    public gk f48366a;
    public int f48367b;
    public final org.telegram.ui.ActionBar.z f48368c;
    public final bn d;

    public hk(bn bnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = bnVar;
        this.f48368c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f48367b - 1;
        this.f48367b = i10;
        if (i10 == 0 && this.f48366a != null) {
            this.f48368c.getViewTreeObserver().removeOnPreDrawListener(this.f48366a);
            this.f48366a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f48367b == 0 && this.f48366a == null) {
            this.f48366a = new gk(this, 0);
            this.f48368c.getViewTreeObserver().addOnPreDrawListener(this.f48366a);
        }
        this.f48367b++;
    }
}
