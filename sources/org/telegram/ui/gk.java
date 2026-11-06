package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class gk implements LayoutTransition.TransitionListener {
    public fk f46018a;
    public int f46019b;
    public final org.telegram.ui.ActionBar.y f46020c;
    public final an d;

    public gk(an anVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = anVar;
        this.f46020c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        int i10 = this.f46019b - 1;
        this.f46019b = i10;
        if (i10 == 0 && this.f46018a != null) {
            this.f46020c.getViewTreeObserver().removeOnPreDrawListener(this.f46018a);
            this.f46018a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i7) {
        if (this.f46019b == 0 && this.f46018a == null) {
            this.f46018a = new fk(this, 0);
            this.f46020c.getViewTreeObserver().addOnPreDrawListener(this.f46018a);
        }
        this.f46019b++;
    }
}
