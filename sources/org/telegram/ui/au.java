package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
public final class au extends org.telegram.ui.Components.sa {
    public final zt T1;
    public final r6 U1;
    public final k8.a V1;
    public l6 W1;
    public final org.telegram.ui.Components.qw0[] X1;
    public final org.telegram.ui.Cells.d2[] Y1;
    public final LinearLayout Z1;
    public final i6 f45699a2;
    public final long f45700b2;
    public final ei.c f45701c2;

    public au(x6 x6Var, r6 r6Var, ei.c cVar, k8.a aVar) {
        super((org.telegram.ui.ActionBar.g2) x6Var, false, !cVar.h(), (org.telegram.ui.ActionBar.h6) null);
        String N0;
        int i7;
        Activity activity;
        long j3;
        String str;
        ?? r62 = 1;
        String str2 = null;
        int i10 = 8;
        this.X1 = new org.telegram.ui.Components.qw0[8];
        this.Y1 = new org.telegram.ui.Cells.d2[8];
        this.V1 = aVar;
        this.U1 = r6Var;
        this.f45701c2 = cVar;
        this.f45700b2 = r6Var.f51460a;
        this.f30204r0 = false;
        c1();
        this.f30204r0 = true;
        this.f39546v1 = 0.2f;
        Activity parentActivity = x6Var.getParentActivity();
        O();
        this.f30211w0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Z1 = linearLayout;
        linearLayout.setOrientation(1);
        zt ztVar = new zt(getContext(), r6Var.f51460a, aVar);
        this.T1 = ztVar;
        linearLayout.addView(ztVar, c8.ma.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.d2 d2Var = null;
        while (i11 < i10) {
            if (i11 == 0) {
                N0 = org.telegram.messenger.gd.N0(2131748570, str2);
                i7 = org.telegram.ui.ActionBar.m6.ck;
            } else if (i11 == r62) {
                N0 = org.telegram.messenger.gd.N0(2131748566, str2);
                i7 = org.telegram.ui.ActionBar.m6.Yj;
            } else if (i11 == 2) {
                N0 = org.telegram.messenger.gd.N0(2131748575, str2);
                i7 = org.telegram.ui.ActionBar.m6.Zj;
            } else if (i11 == 3) {
                N0 = org.telegram.messenger.gd.N0(2131748572, str2);
                i7 = org.telegram.ui.ActionBar.m6.ak;
            } else if (i11 == 4) {
                N0 = org.telegram.messenger.gd.N0(2131748582, str2);
                i7 = org.telegram.ui.ActionBar.m6.dk;
            } else if (i11 == 5) {
                N0 = org.telegram.messenger.gd.N0(2131748568, str2);
                i7 = org.telegram.ui.ActionBar.m6.ek;
            } else if (i11 == 7) {
                N0 = org.telegram.messenger.gd.N0(2131748567, str2);
                i7 = org.telegram.ui.ActionBar.m6.fk;
            } else {
                N0 = org.telegram.messenger.gd.N0(2131748573, str2);
                i7 = org.telegram.ui.ActionBar.m6.gk;
            }
            String str3 = N0;
            int i12 = i7;
            s6 s6Var = (s6) r6Var.d.get(i11);
            if (s6Var != null) {
                activity = parentActivity;
                j3 = s6Var.f51942a;
            } else {
                activity = parentActivity;
                j3 = 0;
            }
            if (j3 > 0) {
                org.telegram.ui.Components.qw0[] qw0VarArr = this.X1;
                ?? obj = new Object();
                Paint paint = new Paint((int) r62);
                obj.f39015e = paint;
                obj.f39014c = r62;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                qw0VarArr[i11] = obj;
                org.telegram.ui.Components.qw0 qw0Var = this.X1[i11];
                qw0Var.f39012a = j3;
                qw0Var.f39013b = i12;
                parentActivity = activity;
                org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(parentActivity, 4, 21, false, null);
                d2Var2.setTag(Integer.valueOf(i11));
                d2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(false));
                this.Z1.addView(d2Var2, c8.ma.o(-1, 50));
                d2Var2.e(str3, org.telegram.messenger.g0.i0(j3, false, false), true, true, false);
                if (d2Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.t6.U(d2Var2.getTextView(), org.telegram.ui.ActionBar.m6.f29486j5, null);
                } else {
                    d2Var2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29486j5, false));
                }
                int i13 = org.telegram.ui.ActionBar.m6.f29508k7;
                org.telegram.ui.Components.op opVar = d2Var2.f30559r;
                if (opVar != null) {
                    opVar.b(i12, i12, i13);
                }
                d2Var2.setOnClickListener(new org.telegram.ui.Components.q31(9, this, cVar));
                this.Y1[i11] = d2Var2;
                d2Var = d2Var2;
                str = null;
            } else {
                parentActivity = activity;
                str = null;
                this.X1[i11] = null;
                this.Y1[i11] = null;
            }
            i11++;
            str2 = str;
            i10 = 8;
            r62 = 1;
        }
        if (d2Var != null) {
            d2Var.setNeedDivider(false);
        }
        zt ztVar2 = this.T1;
        org.telegram.ui.Components.qw0[] qw0VarArr2 = this.X1;
        ztVar2.f39348b = qw0VarArr2;
        ztVar2.G = cVar;
        ztVar2.invalidate();
        ztVar2.f39349c = new float[qw0VarArr2.length];
        ztVar2.d = new float[qw0VarArr2.length];
        ztVar2.f39350e = new float[qw0VarArr2.length];
        ztVar2.c(false);
        if (ztVar2.E > 1) {
            ztVar2.f39351f = 0.0f;
        } else {
            ztVar2.f39351f = 1.0f;
        }
        i6 i6Var = new i6(this, getContext(), x6Var);
        this.f45699a2 = i6Var;
        int L = org.telegram.messenger.g0.L(80.0f);
        if (i6Var.f51955x == null) {
            i6Var.f51954w = L;
            int i14 = 0;
            while (true) {
                org.telegram.ui.Components.j71 j71Var = i6Var.f51951n;
                if (i14 >= j71Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.ek0 c10 = i6Var.c(j71Var.getViewPages()[i14]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), L);
                }
                i14++;
            }
        }
        this.f45699a2.setCacheModel(cVar);
        this.f45699a2.setDelegate(new ji.l(this, cVar, false, 16));
        org.telegram.ui.Components.la laVar = this.f39545u1;
        if (laVar != null) {
            laVar.setChildLayout(this.f45699a2);
        } else {
            e1();
            this.Z1.addView(this.W1, c8.ma.r(-1, 72, 80));
        }
        if (this.W1 != null) {
            this.W1.a(this.T1.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        return new di.l4(this, 6);
    }

    @Override
    public final CharSequence P0() {
        return this.f39543s1.getMessagesController().e1(this.f45700b2);
    }

    @Override
    public final void V0(org.telegram.ui.Components.du0 du0Var) {
        this.f39539o1.j(new g3(this, 10));
        if (this.f39545u1 != null) {
            e1();
            du0Var.addView(this.W1, c8.ma.e(-1, 72, 80));
        }
    }

    public final void e1() {
        l6 l6Var = new l6(getContext());
        this.W1 = l6Var;
        l6Var.f49500a.setOnClickListener(new a(this, 19));
        zt ztVar = this.T1;
        if (ztVar != null) {
            this.W1.a(ztVar.a(), true);
        }
    }
}
