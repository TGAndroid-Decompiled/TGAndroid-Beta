package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class cl implements LayoutTransition.TransitionListener {
    public bl f36479a;
    public int f36480b;
    public final org.telegram.ui.ActionBar.y f36481c;
    public final un d;

    public cl(un unVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = unVar;
        this.f36481c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f36480b - 1;
        this.f36480b = i11;
        if (i11 == 0 && this.f36479a != null) {
            this.f36481c.getViewTreeObserver().removeOnPreDrawListener(this.f36479a);
            this.f36479a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f36480b == 0 && this.f36479a == null) {
            this.f36479a = new bl(this, 0);
            this.f36481c.getViewTreeObserver().addOnPreDrawListener(this.f36479a);
        }
        this.f36480b++;
    }
}
