package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class hk implements LayoutTransition.TransitionListener {
    public gk f48377a;
    public int f48378b;
    public final org.telegram.ui.ActionBar.y f48379c;
    public final bn d;

    public hk(bn bnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = bnVar;
        this.f48379c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f48378b - 1;
        this.f48378b = i10;
        if (i10 == 0 && this.f48377a != null) {
            this.f48379c.getViewTreeObserver().removeOnPreDrawListener(this.f48377a);
            this.f48377a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f48378b == 0 && this.f48377a == null) {
            this.f48377a = new gk(this, 0);
            this.f48379c.getViewTreeObserver().addOnPreDrawListener(this.f48377a);
        }
        this.f48378b++;
    }
}
