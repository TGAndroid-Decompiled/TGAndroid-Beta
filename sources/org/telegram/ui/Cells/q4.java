package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.wo;
public final class q4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.l9 f30129a;
    public final org.telegram.ui.ActionBar.l5 f30130b;
    public final org.telegram.ui.ActionBar.l5 f30131c;
    public final org.telegram.ui.Components.w8 d;
    public final wo f30132e;
    public org.telegram.messenger.d5 f30133f;
    public CharSequence h;
    public int f30134n;

    public q4(Context context, boolean z9) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        this.d = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f30129a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(l9Var, c8.ha.d(46, 46.0f, i7 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z10 = id.f23157a0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 72;
        }
        addView(linearLayout, c8.ha.d(-1, -1.0f, 119, i10, 0.0f, z10 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, c8.ha.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f30130b = l5Var;
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, null);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        l5Var.setTextSize(15);
        if (id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        l5Var.setGravity(i11 | 48);
        if (id.f23157a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout.addView(l5Var, c8.ha.d(-1, 20.0f, i12 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.f30131c = l5Var2;
        l5Var2.setTextSize(13);
        if (id.f23157a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        l5Var2.setGravity(i13 | 48);
        if (id.f23157a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        frameLayout.addView(l5Var2, c8.ha.d(-1, 20.0f, i14 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z9) {
            wo woVar = new wo(21, context, null);
            this.f30132e = woVar;
            woVar.b(-1, org.telegram.ui.ActionBar.l6.f27865d6, org.telegram.ui.ActionBar.l6.f27995k7);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(3);
            boolean z11 = id.f23157a0;
            int i15 = (z11 ? 5 : 3) | 48;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 40.0f;
            }
            addView(woVar, c8.ha.d(24, 24.0f, i15, f10, 32.0f, z11 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.f30132e = null;
        bg0 bg0Var = new bg0(context);
        bg0Var.setText(id.M0(2131749174, null));
        bg0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(bg0Var, org.telegram.ui.ActionBar.l6.Gi, null);
        bg0Var.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Bi, false));
        int i16 = org.telegram.ui.ActionBar.l6.Vl;
        y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.l6.x0(null, i16, false), 16.0f);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i16);
        org.telegram.ui.ActionBar.o6 e11 = org.telegram.ui.ActionBar.s6.e(i16);
        bg0Var.setBackground(e10);
        org.telegram.ui.ActionBar.s6.j(bg0Var, e10, M, e11, null);
        bg0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        linearLayout.addView(bg0Var, c8.ha.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        bg0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(org.telegram.messenger.d5 d5Var, CharSequence charSequence) {
        this.f30133f = d5Var;
        this.h = charSequence;
        if (d5Var == null) {
            return;
        }
        String str = d5Var.f21992i;
        String str2 = d5Var.f21993j;
        org.telegram.ui.Components.w8 w8Var = this.d;
        w8Var.k(d5Var.f21986a, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.l5 l5Var = this.f30130b;
        if (charSequence2 != null) {
            l5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.d5 d5Var2 = this.f30133f;
            l5Var.l(org.telegram.messenger.g5.m(0, d5Var2.f21992i, d5Var2.f21993j), false);
        }
        int i7 = org.telegram.ui.ActionBar.l6.f28257y6;
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.ActionBar.l5 l5Var2 = this.f30131c;
        l5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.s6.X(l5Var2, i7, null);
        org.telegram.messenger.d5 d5Var3 = this.f30133f;
        int i10 = d5Var3.f21995l;
        if (i10 > 0) {
            l5Var2.l(id.G(i10, "TelegramContacts", new Object[0]), false);
        } else {
            l5Var2.l((CharSequence) d5Var3.f21989e.get(0), false);
        }
        this.f30129a.setImageDrawable(w8Var);
    }

    public org.telegram.messenger.d5 getContact() {
        return this.f30133f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.J7, false) * 31) + org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.O7, false)) * 31) + org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.P7, false)) * 31) + org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Q7, false)) * 31) + org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.R7, false)) * 31) + org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.S7, false)) * 31) + org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.T7, false)) * 31) + org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.U7, false);
            if (x02 != this.f30134n) {
                this.f30134n = x02;
                org.telegram.ui.Components.l9 l9Var = this.f30129a;
                if (l9Var != null) {
                    l9Var.invalidate();
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
