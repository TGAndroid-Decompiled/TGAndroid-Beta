package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.ep;
public final class s4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.g9 f23008a;
    public final org.telegram.ui.ActionBar.u5 f23009b;
    public final org.telegram.ui.ActionBar.u5 f23010c;
    public final org.telegram.ui.Components.r8 d;
    public final ep e;
    public org.telegram.messenger.f5 f23011f;
    public CharSequence h;
    public int f23012n;

    public s4(Context context, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        this.d = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f23008a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(23.0f));
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(g9Var, w7.b6.d(46, 46.0f, i10 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = dd.X;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 72;
        }
        addView(linearLayout, w7.b6.d(-1, -1.0f, 119, i11, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, w7.b6.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f23009b = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(15);
        if (dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        u5Var.setGravity(i12 | 48);
        if (dd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        frameLayout.addView(u5Var, w7.b6.d(-1, 20.0f, i13 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.f23010c = u5Var2;
        u5Var2.setTextSize(13);
        if (dd.X) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        u5Var2.setGravity(i14 | 48);
        if (dd.X) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        frameLayout.addView(u5Var2, w7.b6.d(-1, 20.0f, i15 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            ep epVar = new ep(21, context, null);
            this.e = epVar;
            epVar.b(-1, org.telegram.ui.ActionBar.t6.f20930d6, org.telegram.ui.ActionBar.t6.f21060k7);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(3);
            boolean z12 = dd.X;
            int i16 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 40.0f;
            }
            addView(epVar, w7.b6.d(24, 24.0f, i16, f7, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.e = null;
        dh0 dh0Var = new dh0(context);
        dh0Var.setText(dd.L0(2131749184, null));
        dh0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(dh0Var, org.telegram.ui.ActionBar.t6.Gi, null);
        dh0Var.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bi, false));
        int i17 = org.telegram.ui.ActionBar.t6.Vl;
        y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.x0(null, i17, false), 16.0f);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i17);
        org.telegram.ui.ActionBar.w6 f10 = org.telegram.ui.ActionBar.a7.f(i17);
        dh0Var.setBackground(e);
        org.telegram.ui.ActionBar.a7.k(dh0Var, e, N, f10, null);
        dh0Var.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        linearLayout.addView(dh0Var, w7.b6.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        dh0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(org.telegram.messenger.f5 f5Var, CharSequence charSequence) {
        this.f23011f = f5Var;
        this.h = charSequence;
        if (f5Var == null) {
            return;
        }
        String str = f5Var.f15697i;
        String str2 = f5Var.f15698j;
        org.telegram.ui.Components.r8 r8Var = this.d;
        r8Var.k(f5Var.f15692a, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.u5 u5Var = this.f23009b;
        if (charSequence2 != null) {
            u5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.f5 f5Var2 = this.f23011f;
            u5Var.l(org.telegram.messenger.i5.m(0, f5Var2.f15697i, f5Var2.f15698j), false);
        }
        int i10 = org.telegram.ui.ActionBar.t6.f21312y6;
        Integer valueOf = Integer.valueOf(i10);
        org.telegram.ui.ActionBar.u5 u5Var2 = this.f23010c;
        u5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.a7.Y(u5Var2, i10, null);
        org.telegram.messenger.f5 f5Var3 = this.f23011f;
        int i11 = f5Var3.f15700l;
        if (i11 > 0) {
            u5Var2.l(dd.G(i11, "TelegramContacts", new Object[0]), false);
        } else {
            u5Var2.l((CharSequence) f5Var3.e.get(0), false);
        }
        this.f23008a.setImageDrawable(r8Var);
    }

    public org.telegram.messenger.f5 getContact() {
        return this.f23011f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J7, false) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Q7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.R7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.S7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T7, false)) * 31) + org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.U7, false);
            if (x02 != this.f23012n) {
                this.f23012n = x02;
                org.telegram.ui.Components.g9 g9Var = this.f23008a;
                if (g9Var != null) {
                    g9Var.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
