package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.fp;
public final class q4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.i9 f31273a;
    public final org.telegram.ui.ActionBar.j5 f31274b;
    public final org.telegram.ui.ActionBar.j5 f31275c;
    public final org.telegram.ui.Components.t8 d;
    public final fp f31276e;
    public org.telegram.messenger.d5 f31277f;
    public CharSequence h;
    public int f31278n;

    public q4(Context context, boolean z10) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        this.d = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f31273a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(i9Var, c8.ja.d(46, 46.0f, i7 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = hd.f24104a0;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 72;
        }
        addView(linearLayout, c8.ja.d(-1, -1.0f, 119, i10, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, c8.ja.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f31274b = j5Var;
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, null);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(15);
        if (hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        j5Var.setGravity(i11 | 48);
        if (hd.f24104a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout.addView(j5Var, c8.ja.d(-1, 20.0f, i12 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f31275c = j5Var2;
        j5Var2.setTextSize(13);
        if (hd.f24104a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        j5Var2.setGravity(i13 | 48);
        if (hd.f24104a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        frameLayout.addView(j5Var2, c8.ja.d(-1, 20.0f, i14 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            fp fpVar = new fp(21, context, null);
            this.f31276e = fpVar;
            fpVar.b(-1, org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f28979k7);
            fpVar.setDrawUnchecked(false);
            fpVar.setDrawBackgroundAsArc(3);
            boolean z12 = hd.f24104a0;
            int i15 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 40.0f;
            }
            addView(fpVar, c8.ja.d(24, 24.0f, i15, f10, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.f31276e = null;
        dg0 dg0Var = new dg0(context);
        dg0Var.setText(hd.M0(2131749174, null));
        dg0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(dg0Var, org.telegram.ui.ActionBar.j6.Ji, null);
        dg0Var.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ei, false));
        int i16 = org.telegram.ui.ActionBar.j6.Yl;
        y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.x0(null, i16, false), 16.0f);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i16);
        org.telegram.ui.ActionBar.m6 e11 = org.telegram.ui.ActionBar.q6.e(i16);
        dg0Var.setBackground(e10);
        org.telegram.ui.ActionBar.q6.j(dg0Var, e10, M, e11, null);
        dg0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        linearLayout.addView(dg0Var, c8.ja.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        dg0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(org.telegram.messenger.d5 d5Var, CharSequence charSequence) {
        this.f31277f = d5Var;
        this.h = charSequence;
        if (d5Var == null) {
            return;
        }
        String str = d5Var.f23045i;
        String str2 = d5Var.f23046j;
        org.telegram.ui.Components.t8 t8Var = this.d;
        t8Var.k(d5Var.f23039a, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.j5 j5Var = this.f31274b;
        if (charSequence2 != null) {
            j5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.d5 d5Var2 = this.f31277f;
            j5Var.l(org.telegram.messenger.g5.m(0, d5Var2.f23045i, d5Var2.f23046j), false);
        }
        int i7 = org.telegram.ui.ActionBar.j6.f29241y6;
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f31275c;
        j5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.q6.X(j5Var2, i7, null);
        org.telegram.messenger.d5 d5Var3 = this.f31277f;
        int i10 = d5Var3.f23048l;
        if (i10 > 0) {
            j5Var2.l(hd.G(i10, "TelegramContacts", new Object[0]), false);
        } else {
            j5Var2.l((CharSequence) d5Var3.f23042e.get(0), false);
        }
        this.f31273a.setImageDrawable(t8Var);
    }

    public org.telegram.messenger.d5 getContact() {
        return this.f31277f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.J7, false) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.O7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.P7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Q7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.R7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.S7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.T7, false)) * 31) + org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.U7, false);
            if (x02 != this.f31278n) {
                this.f31278n = x02;
                org.telegram.ui.Components.i9 i9Var = this.f31273a;
                if (i9Var != null) {
                    i9Var.invalidate();
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
