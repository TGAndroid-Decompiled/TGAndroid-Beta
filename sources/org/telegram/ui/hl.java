package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class hl implements LayoutTransition.TransitionListener {
    public gl f36876a;
    public int f36877b;
    public final org.telegram.ui.ActionBar.y f36878c;
    public final fo d;

    public hl(fo foVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = foVar;
        this.f36878c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f36877b - 1;
        this.f36877b = i11;
        if (i11 == 0 && this.f36876a != null) {
            this.f36878c.getViewTreeObserver().removeOnPreDrawListener(this.f36876a);
            this.f36876a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f36877b == 0 && this.f36876a == null) {
            this.f36876a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.m2) hl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f36878c.getViewTreeObserver().addOnPreDrawListener(this.f36876a);
        }
        this.f36877b++;
    }
}
