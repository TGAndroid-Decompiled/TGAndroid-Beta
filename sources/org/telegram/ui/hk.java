package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class hk implements LayoutTransition.TransitionListener {
    public gk f48567a;
    public int f48568b;
    public final org.telegram.ui.ActionBar.y f48569c;
    public final bn d;

    public hk(bn bnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = bnVar;
        this.f48569c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f48568b - 1;
        this.f48568b = i10;
        if (i10 == 0 && this.f48567a != null) {
            this.f48569c.getViewTreeObserver().removeOnPreDrawListener(this.f48567a);
            this.f48567a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f48568b == 0 && this.f48567a == null) {
            this.f48567a = new gk(this, 0);
            this.f48569c.getViewTreeObserver().addOnPreDrawListener(this.f48567a);
        }
        this.f48568b++;
    }
}
