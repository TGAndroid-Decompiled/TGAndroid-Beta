package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.og0;
public final class r4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.p9 f31776a;
    public final org.telegram.ui.ActionBar.n5 f31777b;
    public final org.telegram.ui.ActionBar.n5 f31778c;
    public final org.telegram.ui.Components.a9 d;
    public final lp f31779e;
    public org.telegram.messenger.f5 f31780f;
    public CharSequence h;
    public int f31781n;

    public r4(Context context, boolean z10) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        this.d = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f31776a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(p9Var, c8.na.d(46, 46.0f, i7 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = gd.f24314a0;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 72;
        }
        addView(linearLayout, c8.na.d(-1, -1.0f, 119, i10, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, c8.na.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f31777b = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(15);
        if (gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        n5Var.setGravity(i11 | 48);
        if (gd.f24314a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout.addView(n5Var, c8.na.d(-1, 20.0f, i12 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f31778c = n5Var2;
        n5Var2.setTextSize(13);
        if (gd.f24314a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        n5Var2.setGravity(i13 | 48);
        if (gd.f24314a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        frameLayout.addView(n5Var2, c8.na.d(-1, 20.0f, i14 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            lp lpVar = new lp(21, context, null);
            this.f31779e = lpVar;
            lpVar.b(-1, org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.f29581k7);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(3);
            boolean z12 = gd.f24314a0;
            int i15 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 40.0f;
            }
            addView(lpVar, c8.na.d(24, 24.0f, i15, f10, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.f31779e = null;
        og0 og0Var = new og0(context);
        og0Var.setText(gd.N0(2131748981, null));
        og0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(og0Var, org.telegram.ui.ActionBar.n6.Ji, null);
        og0Var.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ei, false));
        int i16 = org.telegram.ui.ActionBar.n6.Yl;
        y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.x0(null, i16, false), 16.0f);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i16);
        org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i16);
        og0Var.setBackground(e10);
        org.telegram.ui.ActionBar.u6.j(og0Var, e10, M, e11, null);
        og0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        linearLayout.addView(og0Var, c8.na.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        og0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(org.telegram.messenger.f5 f5Var, CharSequence charSequence) {
        this.f31780f = f5Var;
        this.h = charSequence;
        if (f5Var == null) {
            return;
        }
        String str = f5Var.f23954i;
        String str2 = f5Var.f23955j;
        org.telegram.ui.Components.a9 a9Var = this.d;
        a9Var.k(f5Var.f23948a, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.n5 n5Var = this.f31777b;
        if (charSequence2 != null) {
            n5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.f5 f5Var2 = this.f31780f;
            n5Var.l(org.telegram.messenger.i5.m(0, f5Var2.f23954i, f5Var2.f23955j), false);
        }
        int i7 = org.telegram.ui.ActionBar.n6.f29843y6;
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f31778c;
        n5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.u6.X(n5Var2, i7, null);
        org.telegram.messenger.f5 f5Var3 = this.f31780f;
        int i10 = f5Var3.f23957l;
        if (i10 > 0) {
            n5Var2.l(gd.G(i10, "TelegramContacts", new Object[0]), false);
        } else {
            n5Var2.l((CharSequence) f5Var3.f23951e.get(0), false);
        }
        this.f31776a.setImageDrawable(a9Var);
    }

    public org.telegram.messenger.f5 getContact() {
        return this.f31780f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.J7, false) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.O7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.P7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Q7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.R7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.S7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T7, false)) * 31) + org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.U7, false);
            if (x02 != this.f31781n) {
                this.f31781n = x02;
                org.telegram.ui.Components.p9 p9Var = this.f31776a;
                if (p9Var != null) {
                    p9Var.invalidate();
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
