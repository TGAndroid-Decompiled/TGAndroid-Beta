package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class cl implements LayoutTransition.TransitionListener {
    public bl f35195a;
    public int f35196b;
    public final org.telegram.ui.ActionBar.z f35197c;
    public final co d;

    public cl(co coVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = coVar;
        this.f35197c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f35196b - 1;
        this.f35196b = i11;
        if (i11 == 0 && this.f35195a != null) {
            this.f35197c.getViewTreeObserver().removeOnPreDrawListener(this.f35195a);
            this.f35195a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f35196b == 0 && this.f35195a == null) {
            this.f35195a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) cl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f35197c.getViewTreeObserver().addOnPreDrawListener(this.f35195a);
        }
        this.f35196b++;
    }
}
