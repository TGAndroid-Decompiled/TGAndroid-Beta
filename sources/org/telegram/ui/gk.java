package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class gk implements LayoutTransition.TransitionListener {
    public fk f47457a;
    public int f47458b;
    public final org.telegram.ui.ActionBar.y f47459c;
    public final an d;

    public gk(an anVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = anVar;
        this.f47459c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f47458b - 1;
        this.f47458b = i10;
        if (i10 == 0 && this.f47457a != null) {
            this.f47459c.getViewTreeObserver().removeOnPreDrawListener(this.f47457a);
            this.f47457a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f47458b == 0 && this.f47457a == null) {
            this.f47457a = new fk(this, 0);
            this.f47459c.getViewTreeObserver().addOnPreDrawListener(this.f47457a);
        }
        this.f47458b++;
    }
}
