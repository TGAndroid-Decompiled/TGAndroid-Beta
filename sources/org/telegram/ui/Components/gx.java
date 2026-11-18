package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class gx extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int f35662a;
    public boolean f35663b;
    public final FrameLayout f35664c;
    public final ry d;

    public gx(ry ryVar, Context context) {
        super(context);
        this.d = ryVar;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30084a;
        n6 n6Var = new n6(getContext(), false, false, false);
        n6Var.b(0.3f, 250L, lr.h);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.n6.Ji;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.f39335a2;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, i6Var);
        n6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f35664c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.b6.e(ryVar.z(org.telegram.ui.ActionBar.n6.Fi), 8.0f));
        frameLayout.addView(n6Var, c8.ma.e(-1, -2, 17));
        addView(frameLayout, c8.ma.c(-1.0f, -1));
        ug.s0 s0Var = new ug.s0(getContext(), i6Var, false);
        s0Var.setIcon(2131624315);
        addView(s0Var, c8.ma.c(-1.0f, -1));
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
            FrameLayout frameLayout = this.f35664c;
            if (frameLayout != null) {
                if (z10 == this.f35662a) {
                    if (this.f35663b != org.telegram.ui.ActionBar.n6.I.q()) {
                    }
                }
                this.f35663b = org.telegram.ui.ActionBar.n6.I.q();
                this.f35662a = z10;
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
