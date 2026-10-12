package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class hl implements LayoutTransition.TransitionListener {
    public gl f38454a;
    public int f38455b;
    public final org.telegram.ui.ActionBar.y f38456c;
    public final eo d;

    public hl(eo eoVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = eoVar;
        this.f38456c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f38455b - 1;
        this.f38455b = i11;
        if (i11 == 0 && this.f38454a != null) {
            this.f38456c.getViewTreeObserver().removeOnPreDrawListener(this.f38454a);
            this.f38454a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f38455b == 0 && this.f38454a == null) {
            this.f38454a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.m2) hl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f38456c.getViewTreeObserver().addOnPreDrawListener(this.f38454a);
        }
        this.f38455b++;
    }
}
