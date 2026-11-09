package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class ik implements LayoutTransition.TransitionListener {
    public hk f46681a;
    public int f46682b;
    public final org.telegram.ui.ActionBar.y f46683c;
    public final cn d;

    public ik(cn cnVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = cnVar;
        this.f46683c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f46682b - 1;
        this.f46682b = i10;
        if (i10 == 0 && this.f46681a != null) {
            this.f46683c.getViewTreeObserver().removeOnPreDrawListener(this.f46681a);
            this.f46681a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f46682b == 0 && this.f46681a == null) {
            this.f46681a = new hk(this, 0);
            this.f46683c.getViewTreeObserver().addOnPreDrawListener(this.f46681a);
        }
        this.f46682b++;
    }
}
