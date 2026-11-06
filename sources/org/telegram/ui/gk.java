package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class gk implements LayoutTransition.TransitionListener {
    public fk f45992a;
    public int f45993b;
    public final org.telegram.ui.ActionBar.y f45994c;
    public final an d;

    public gk(an anVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = anVar;
        this.f45994c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f45993b - 1;
        this.f45993b = i10;
        if (i10 == 0 && this.f45992a != null) {
            this.f45994c.getViewTreeObserver().removeOnPreDrawListener(this.f45992a);
            this.f45992a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f45993b == 0 && this.f45992a == null) {
            this.f45992a = new fk(this, 0);
            this.f45994c.getViewTreeObserver().addOnPreDrawListener(this.f45992a);
        }
        this.f45993b++;
    }
}
