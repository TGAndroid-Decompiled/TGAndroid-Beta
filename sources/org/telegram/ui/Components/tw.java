package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class tw extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int f38565a;
    public boolean f38566b;
    public final FrameLayout f38567c;
    public final ey d;

    public tw(ey eyVar, Context context) {
        super(context);
        this.d = eyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28514a;
        h6 h6Var = new h6(getContext(), false, false, false);
        h6Var.b(0.3f, 250L, xq.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int i3 = org.telegram.ui.ActionBar.k6.Gi;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.f33520a2;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i3, e6Var);
        h6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f38567c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(eyVar.z(org.telegram.ui.ActionBar.k6.Ci), 8.0f));
        frameLayout.addView(h6Var, b8.mf.e(-1, -2, 17));
        addView(frameLayout, b8.mf.c(-1.0f, -1));
        vg.o0 o0Var = new vg.o0(getContext(), e6Var, false);
        o0Var.setIcon(2131624314);
        addView(o0Var, b8.mf.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int z10 = this.d.z(org.telegram.ui.ActionBar.k6.Ci);
            FrameLayout frameLayout = this.f38567c;
            if (frameLayout != null) {
                if (z10 == this.f38565a) {
                    if (this.f38566b != org.telegram.ui.ActionBar.k6.I.q()) {
                    }
                }
                this.f38566b = org.telegram.ui.ActionBar.k6.I.q();
                this.f38565a = z10;
                org.telegram.ui.ActionBar.k6.H1(frameLayout.getBackground(), z10, false);
                org.telegram.ui.ActionBar.k6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.y5.b(z10), true);
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
