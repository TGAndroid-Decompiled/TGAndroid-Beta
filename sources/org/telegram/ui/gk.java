package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class gk implements LayoutTransition.TransitionListener {
    public fk f46019a;
    public int f46020b;
    public final org.telegram.ui.ActionBar.y f46021c;
    public final an d;

    public gk(an anVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = anVar;
        this.f46021c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f46020b - 1;
        this.f46020b = i10;
        if (i10 == 0 && this.f46019a != null) {
            this.f46021c.getViewTreeObserver().removeOnPreDrawListener(this.f46019a);
            this.f46019a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f46020b == 0 && this.f46019a == null) {
            this.f46019a = new fk(this, 0);
            this.f46021c.getViewTreeObserver().addOnPreDrawListener(this.f46019a);
        }
        this.f46020b++;
    }
}
