package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class vw extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int f39817a;
    public boolean f39818b;
    public final FrameLayout f39819c;
    public final hy d;

    public vw(hy hyVar, Context context) {
        super(context);
        this.d = hyVar;
        org.telegram.ui.ActionBar.r6 r6Var = org.telegram.ui.ActionBar.s6.f28500a;
        j6 j6Var = new j6(getContext(), false, false, false);
        j6Var.b(0.3f, 250L, xq.h);
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.l6.Gi;
        org.telegram.ui.ActionBar.g6 g6Var = hyVar.Z1;
        org.telegram.ui.ActionBar.s6.Y(j6Var, i7, g6Var);
        j6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f39819c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.a6.e(hyVar.z(org.telegram.ui.ActionBar.l6.Ci), 8.0f));
        frameLayout.addView(j6Var, c8.ha.e(-1, -2, 17));
        addView(frameLayout, c8.ha.c(-1.0f, -1));
        ug.p0 p0Var = new ug.p0(getContext(), g6Var, false);
        p0Var.setIcon(2131624314);
        addView(p0Var, c8.ha.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int z9 = this.d.z(org.telegram.ui.ActionBar.l6.Ci);
            FrameLayout frameLayout = this.f39819c;
            if (frameLayout != null) {
                if (z9 == this.f39817a) {
                    if (this.f39818b != org.telegram.ui.ActionBar.l6.I.q()) {
                    }
                }
                this.f39818b = org.telegram.ui.ActionBar.l6.I.q();
                this.f39817a = z9;
                org.telegram.ui.ActionBar.l6.H1(frameLayout.getBackground(), z9, false);
                org.telegram.ui.ActionBar.l6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.a6.b(z9), true);
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
