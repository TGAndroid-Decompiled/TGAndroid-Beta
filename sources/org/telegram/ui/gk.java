package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class gk implements LayoutTransition.TransitionListener {
    public fk f46020a;
    public int f46021b;
    public final org.telegram.ui.ActionBar.y f46022c;
    public final an d;

    public gk(an anVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = anVar;
        this.f46022c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f46021b - 1;
        this.f46021b = i10;
        if (i10 == 0 && this.f46020a != null) {
            this.f46022c.getViewTreeObserver().removeOnPreDrawListener(this.f46020a);
            this.f46020a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f46021b == 0 && this.f46020a == null) {
            this.f46020a = new fk(this, 0);
            this.f46022c.getViewTreeObserver().addOnPreDrawListener(this.f46020a);
        }
        this.f46021b++;
    }
}
