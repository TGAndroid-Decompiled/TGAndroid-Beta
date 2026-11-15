package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class ax extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int f33100a;
    public boolean f33101b;
    public final FrameLayout f33102c;
    public final ly d;

    public ax(ly lyVar, Context context) {
        super(context);
        this.d = lyVar;
        org.telegram.ui.ActionBar.p6 p6Var = org.telegram.ui.ActionBar.q6.f29534a;
        h6 h6Var = new h6(getContext(), false, false, false);
        h6Var.b(0.3f, 250L, er.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int i7 = org.telegram.ui.ActionBar.j6.Ji;
        org.telegram.ui.ActionBar.e6 e6Var = lyVar.f36931a2;
        org.telegram.ui.ActionBar.q6.Y(h6Var, i7, e6Var);
        h6Var.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f33102c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.y5.e(lyVar.z(org.telegram.ui.ActionBar.j6.Fi), 8.0f));
        frameLayout.addView(h6Var, c8.ja.e(-1, -2, 17));
        addView(frameLayout, c8.ja.c(-1.0f, -1));
        ug.q0 q0Var = new ug.q0(getContext(), e6Var, false);
        q0Var.setIcon(2131624315);
        addView(q0Var, c8.ja.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + org.telegram.messenger.g0.L(44.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int z10 = this.d.z(org.telegram.ui.ActionBar.j6.Fi);
            FrameLayout frameLayout = this.f33102c;
            if (frameLayout != null) {
                if (z10 == this.f33100a) {
                    if (this.f33101b != org.telegram.ui.ActionBar.j6.I.q()) {
                    }
                }
                this.f33101b = org.telegram.ui.ActionBar.j6.I.q();
                this.f33100a = z10;
                org.telegram.ui.ActionBar.j6.H1(frameLayout.getBackground(), z10, false);
                org.telegram.ui.ActionBar.j6.H1(frameLayout.getBackground(), org.telegram.ui.ActionBar.y5.b(z10), true);
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
