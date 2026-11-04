package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.wo;
public final class q4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.k9 f30197a;
    public final org.telegram.ui.ActionBar.k5 f30198b;
    public final org.telegram.ui.ActionBar.k5 f30199c;
    public final org.telegram.ui.Components.u8 d;
    public final wo f30200e;
    public org.telegram.messenger.d5 f30201f;
    public CharSequence h;
    public int f30202n;

    public q4(Context context, boolean z10) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        this.d = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f30197a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(k9Var, mf.d(46, 46.0f, i3 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = bd.f21784a0;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 72;
        }
        addView(linearLayout, mf.d(-1, -1.0f, 119, i10, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, mf.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f30198b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(15);
        if (bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k5Var.setGravity(i11 | 48);
        if (bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout.addView(k5Var, mf.d(-1, 20.0f, i12 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f30199c = k5Var2;
        k5Var2.setTextSize(13);
        if (bd.f21784a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        k5Var2.setGravity(i13 | 48);
        if (bd.f21784a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        frameLayout.addView(k5Var2, mf.d(-1, 20.0f, i14 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            wo woVar = new wo(21, context, null);
            this.f30200e = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.k6.f27878d6, org.telegram.ui.ActionBar.k6.f28008k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z12 = bd.f21784a0;
            int i15 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 40.0f;
            }
            addView(woVar, mf.d(24, 24.0f, i15, f10, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.f30200e = null;
        dg0 dg0Var = new dg0(context);
        dg0Var.setText(bd.M0(2131749182, null));
        dg0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(dg0Var, org.telegram.ui.ActionBar.k6.Gi, null);
        dg0Var.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bi, false));
        int i16 = org.telegram.ui.ActionBar.k6.Vl;
        y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.k6.x0(null, i16, false), 16.0f);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
        org.telegram.ui.ActionBar.n6 f11 = org.telegram.ui.ActionBar.r6.f(i16);
        dg0Var.setBackground(e10);
        org.telegram.ui.ActionBar.r6.k(dg0Var, e10, N, f11, null);
        dg0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        linearLayout.addView(dg0Var, mf.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        dg0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(org.telegram.messenger.d5 d5Var, CharSequence charSequence) {
        this.f30201f = d5Var;
        this.h = charSequence;
        if (d5Var == null) {
            return;
        }
        String str = d5Var.f22153i;
        String str2 = d5Var.f22154j;
        org.telegram.ui.Components.u8 u8Var = this.d;
        u8Var.k(d5Var.f22147a, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.k5 k5Var = this.f30198b;
        if (charSequence2 != null) {
            k5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.d5 d5Var2 = this.f30201f;
            k5Var.l(org.telegram.messenger.g5.m(0, d5Var2.f22153i, d5Var2.f22154j), false);
        }
        int i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        Integer valueOf = Integer.valueOf(i3);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f30199c;
        k5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i3, null);
        org.telegram.messenger.d5 d5Var3 = this.f30201f;
        int i10 = d5Var3.f22156l;
        if (i10 > 0) {
            k5Var2.l(bd.G(i10, "TelegramContacts", new Object[0]), false);
        } else {
            k5Var2.l((CharSequence) d5Var3.f22150e.get(0), false);
        }
        this.f30197a.setImageDrawable(u8Var);
    }

    public org.telegram.messenger.d5 getContact() {
        return this.f30201f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J7, false) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.R7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T7, false)) * 31) + org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U7, false);
            if (x02 != this.f30202n) {
                this.f30202n = x02;
                org.telegram.ui.Components.k9 k9Var = this.f30197a;
                if (k9Var != null) {
                    k9Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
