package org.telegram.ui.Cells;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.pg0;
public final class r4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.q9 f31726a;
    public final org.telegram.ui.ActionBar.m5 f31727b;
    public final org.telegram.ui.ActionBar.m5 f31728c;
    public final org.telegram.ui.Components.b9 d;
    public final op f31729e;
    public org.telegram.messenger.f5 f31730f;
    public CharSequence h;
    public int f31731n;

    public r4(Context context, boolean z10) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        this.d = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f31726a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(23.0f));
        if (hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(q9Var, c8.ma.d(46, 46.0f, i7 | 48, 13.0f, 6.0f, 13.0f, 6.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        boolean z11 = hd.f24444a0;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 72;
        }
        addView(linearLayout, c8.ma.d(-1, -1.0f, 119, i10, 0.0f, z11 ? 72 : 0, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, c8.ma.l(1.0f, 0, 58));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f31727b = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(15);
        if (hd.f24444a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        m5Var.setGravity(i11 | 48);
        if (hd.f24444a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout.addView(m5Var, c8.ma.d(-1, 20.0f, i12 | 48, 0.0f, 9.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f31728c = m5Var2;
        m5Var2.setTextSize(13);
        if (hd.f24444a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        m5Var2.setGravity(i13 | 48);
        if (hd.f24444a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        frameLayout.addView(m5Var2, c8.ma.d(-1, 20.0f, i14 | 48, 0.0f, 33.0f, 0.0f, 0.0f));
        if (z10) {
            op opVar = new op(21, context, null);
            this.f31729e = opVar;
            opVar.b(-1, org.telegram.ui.ActionBar.m6.f29381d6, org.telegram.ui.ActionBar.m6.f29511k7);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
            boolean z12 = hd.f24444a0;
            int i15 = (z12 ? 5 : 3) | 48;
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 40.0f;
            }
            addView(opVar, c8.ma.d(24, 24.0f, i15, f10, 32.0f, z12 ? 39.0f : 0.0f, 0.0f));
            return;
        }
        this.f31729e = null;
        pg0 pg0Var = new pg0(context);
        pg0Var.setText(hd.N0(2131748981, null));
        pg0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(pg0Var, org.telegram.ui.ActionBar.m6.Ji, null);
        pg0Var.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ei, false));
        int i16 = org.telegram.ui.ActionBar.m6.Yl;
        y e10 = org.telegram.ui.ActionBar.a6.e(org.telegram.ui.ActionBar.m6.x0(null, i16, false), 16.0f);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
        org.telegram.ui.ActionBar.p6 e11 = org.telegram.ui.ActionBar.t6.e(i16);
        pg0Var.setBackground(e10);
        org.telegram.ui.ActionBar.t6.j(pg0Var, e10, M, e11, null);
        pg0Var.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        linearLayout.addView(pg0Var, c8.ma.q(-2, 28, 0.0f, 16, 18, 0, 18, 0));
        pg0Var.setOnClickListener(new a(this, 6));
    }

    public final void a(org.telegram.messenger.f5 f5Var, CharSequence charSequence) {
        this.f31730f = f5Var;
        this.h = charSequence;
        if (f5Var == null) {
            return;
        }
        String str = f5Var.f23866i;
        String str2 = f5Var.f23867j;
        org.telegram.ui.Components.b9 b9Var = this.d;
        b9Var.k(f5Var.f23860a, str, str2, null);
        CharSequence charSequence2 = this.h;
        org.telegram.ui.ActionBar.m5 m5Var = this.f31727b;
        if (charSequence2 != null) {
            m5Var.l(charSequence2, true);
        } else {
            org.telegram.messenger.f5 f5Var2 = this.f31730f;
            m5Var.l(org.telegram.messenger.i5.m(0, f5Var2.f23866i, f5Var2.f23867j), false);
        }
        int i7 = org.telegram.ui.ActionBar.m6.f29773y6;
        Integer valueOf = Integer.valueOf(i7);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.f31728c;
        m5Var2.setTag(valueOf);
        org.telegram.ui.ActionBar.t6.X(m5Var2, i7, null);
        org.telegram.messenger.f5 f5Var3 = this.f31730f;
        int i10 = f5Var3.f23869l;
        if (i10 > 0) {
            m5Var2.l(hd.G(i10, "TelegramContacts", new Object[0]), false);
        } else {
            m5Var2.l((CharSequence) f5Var3.f23863e.get(0), false);
        }
        this.f31726a.setImageDrawable(b9Var);
    }

    public org.telegram.messenger.f5 getContact() {
        return this.f31730f;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = (((((((((((((org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J7, false) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.O7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Q7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.R7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.S7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T7, false)) * 31) + org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.U7, false);
            if (x02 != this.f31731n) {
                this.f31731n = x02;
                org.telegram.ui.Components.q9 q9Var = this.f31726a;
                if (q9Var != null) {
                    q9Var.invalidate();
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
