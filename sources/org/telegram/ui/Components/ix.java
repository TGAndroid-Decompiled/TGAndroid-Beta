package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ix extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int f36329a;
    public boolean f36330b;
    public final FrameLayout f36331c;
    public final ty d;

    public ix(ty tyVar, Context context) {
        super(context);
        this.d = tyVar;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.f30068a;
        o6 o6Var = new o6(getContext(), false, false, false);
        o6Var.b(0.3f, 250L, nr.h);
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.m6.Ji;
        org.telegram.ui.ActionBar.h6 h6Var = tyVar.f40082a2;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i7, h6Var);
        o6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f36331c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.a6.e(tyVar.z(org.telegram.ui.ActionBar.m6.Fi), 8.0f));
        frameLayout.addView(o6Var, c8.ma.e(-1, -2, 17));
        addView(frameLayout, c8.ma.c(-1.0f, -1));
        ug.r0 r0Var = new ug.r0(getContext(), h6Var, false);
        r0Var.setIcon(2131624315);
        addView(r0Var, c8.ma.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int z10 = this.d.z(org.telegram.ui.ActionBar.m6.Fi);
            FrameLayout frameLayout = this.f36331c;
            if (frameLayout != null) {
                if (z10 == this.f36329a) {
                    if (this.f36330b != org.telegram.ui.ActionBar.m6.I.q()) {
                    }
                }
                this.f36330b = org.telegram.ui.ActionBar.m6.I.q();
                this.f36329a = z10;
                org.telegram.ui.ActionBar.m6.H1(frameLayout.getBackground(), z10, false);
                org.telegram.ui.ActionBar.m6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.a6.b(z10), true);
                frameLayout.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
