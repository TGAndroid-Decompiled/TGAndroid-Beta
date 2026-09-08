package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class cl implements LayoutTransition.TransitionListener {
    public bl f35194a;
    public int f35195b;
    public final org.telegram.ui.ActionBar.z f35196c;
    public final co d;

    public cl(co coVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = coVar;
        this.f35196c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f35195b - 1;
        this.f35195b = i11;
        if (i11 == 0 && this.f35194a != null) {
            this.f35196c.getViewTreeObserver().removeOnPreDrawListener(this.f35194a);
            this.f35194a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f35195b == 0 && this.f35194a == null) {
            this.f35194a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) cl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f35196c.getViewTreeObserver().addOnPreDrawListener(this.f35194a);
        }
        this.f35195b++;
    }
}
