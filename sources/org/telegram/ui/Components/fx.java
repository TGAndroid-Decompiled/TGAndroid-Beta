package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class fx extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int f35216a;
    public boolean f35217b;
    public final FrameLayout f35218c;
    public final qy d;

    public fx(qy qyVar, Context context) {
        super(context);
        this.d = qyVar;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30163a;
        n6 n6Var = new n6(getContext(), false, false, false);
        n6Var.b(0.3f, 250L, kr.h);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.n6.Ji;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.f39037a2;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, i6Var);
        n6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f35218c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.b6.e(qyVar.z(org.telegram.ui.ActionBar.n6.Fi), 8.0f));
        frameLayout.addView(n6Var, c8.na.e(-1, -2, 17));
        addView(frameLayout, c8.na.c(-1.0f, -1));
        ug.r0 r0Var = new ug.r0(getContext(), i6Var, false);
        r0Var.setIcon(2131624315);
        addView(r0Var, c8.na.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int z10 = this.d.z(org.telegram.ui.ActionBar.n6.Fi);
            FrameLayout frameLayout = this.f35218c;
            if (frameLayout != null) {
                if (z10 == this.f35216a) {
                    if (this.f35217b != org.telegram.ui.ActionBar.n6.I.q()) {
                    }
                }
                this.f35217b = org.telegram.ui.ActionBar.n6.I.q();
                this.f35216a = z10;
                org.telegram.ui.ActionBar.n6.H1(frameLayout.getBackground(), z10, false);
                org.telegram.ui.ActionBar.n6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.b6.b(z10), true);
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
