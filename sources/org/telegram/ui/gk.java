package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class gk implements LayoutTransition.TransitionListener {
    public fk f47467a;
    public int f47468b;
    public final org.telegram.ui.ActionBar.y f47469c;
    public final an d;

    public gk(an anVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = anVar;
        this.f47469c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f47468b - 1;
        this.f47468b = i10;
        if (i10 == 0 && this.f47467a != null) {
            this.f47469c.getViewTreeObserver().removeOnPreDrawListener(this.f47467a);
            this.f47467a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f47468b == 0 && this.f47467a == null) {
            this.f47467a = new fk(this, 0);
            this.f47469c.getViewTreeObserver().addOnPreDrawListener(this.f47467a);
        }
        this.f47468b++;
    }
}
