package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
public final class au extends org.telegram.ui.Components.sa {
    public final zt T1;
    public final r6 U1;
    public final k8.a V1;
    public l6 W1;
    public final org.telegram.ui.Components.ow0[] X1;
    public final org.telegram.ui.Cells.c2[] Y1;
    public final LinearLayout Z1;
    public final i6 f45673a2;
    public final long f45674b2;
    public final ei.c f45675c2;

    public au(x6 x6Var, r6 r6Var, ei.c cVar, k8.a aVar) {
        super((org.telegram.ui.ActionBar.h2) x6Var, false, !cVar.h(), (org.telegram.ui.ActionBar.i6) null);
        String M0;
        int i7;
        Activity activity;
        long j3;
        String str;
        ?? r62 = 1;
        String str2 = null;
        int i10 = 8;
        this.X1 = new org.telegram.ui.Components.ow0[8];
        this.Y1 = new org.telegram.ui.Cells.c2[8];
        this.V1 = aVar;
        this.U1 = r6Var;
        this.f45675c2 = cVar;
        this.f45674b2 = r6Var.f51511a;
        this.f30223r0 = false;
        c1();
        this.f30223r0 = true;
        this.f39541v1 = 0.2f;
        Activity parentActivity = x6Var.getParentActivity();
        O();
        this.f30230w0 = false;
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Z1 = linearLayout;
        linearLayout.setOrientation(1);
        zt ztVar = new zt(getContext(), r6Var.f51511a, aVar);
        this.T1 = ztVar;
        linearLayout.addView(ztVar, c8.ma.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.c2 c2Var = null;
        while (i11 < i10) {
            if (i11 == 0) {
                M0 = org.telegram.messenger.gd.M0(2131748571, str2);
                i7 = org.telegram.ui.ActionBar.n6.ck;
            } else if (i11 == r62) {
                M0 = org.telegram.messenger.gd.M0(2131748567, str2);
                i7 = org.telegram.ui.ActionBar.n6.Yj;
            } else if (i11 == 2) {
                M0 = org.telegram.messenger.gd.M0(2131748576, str2);
                i7 = org.telegram.ui.ActionBar.n6.Zj;
            } else if (i11 == 3) {
                M0 = org.telegram.messenger.gd.M0(2131748573, str2);
                i7 = org.telegram.ui.ActionBar.n6.ak;
            } else if (i11 == 4) {
                M0 = org.telegram.messenger.gd.M0(2131748583, str2);
                i7 = org.telegram.ui.ActionBar.n6.dk;
            } else if (i11 == 5) {
                M0 = org.telegram.messenger.gd.M0(2131748569, str2);
                i7 = org.telegram.ui.ActionBar.n6.ek;
            } else if (i11 == 7) {
                M0 = org.telegram.messenger.gd.M0(2131748568, str2);
                i7 = org.telegram.ui.ActionBar.n6.fk;
            } else {
                M0 = org.telegram.messenger.gd.M0(2131748574, str2);
                i7 = org.telegram.ui.ActionBar.n6.gk;
            }
            String str3 = M0;
            int i12 = i7;
            s6 s6Var = (s6) r6Var.d.get(i11);
            if (s6Var != null) {
                activity = parentActivity;
                j3 = s6Var.f51913a;
            } else {
                activity = parentActivity;
                j3 = 0;
            }
            if (j3 > 0) {
                org.telegram.ui.Components.ow0[] ow0VarArr = this.X1;
                ?? obj = new Object();
                Paint paint = new Paint((int) r62);
                obj.f38185e = paint;
                obj.f38184c = r62;
                obj.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(org.telegram.messenger.g0.L(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                ow0VarArr[i11] = obj;
                org.telegram.ui.Components.ow0 ow0Var = this.X1[i11];
                ow0Var.f38182a = j3;
                ow0Var.f38183b = i12;
                parentActivity = activity;
                org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(parentActivity, 4, 21, false, null);
                c2Var2.setTag(Integer.valueOf(i11));
                c2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                this.Z1.addView(c2Var2, c8.ma.o(-1, 50));
                c2Var2.e(str3, org.telegram.messenger.g0.i0(j3, false, false), true, true, false);
                if (c2Var2.getTextView() != null) {
                    org.telegram.ui.ActionBar.u6.U(c2Var2.getTextView(), org.telegram.ui.ActionBar.n6.f29504j5, null);
                } else {
                    c2Var2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29504j5, false));
                }
                int i13 = org.telegram.ui.ActionBar.n6.f29526k7;
                org.telegram.ui.Components.mp mpVar = c2Var2.f30461r;
                if (mpVar != null) {
                    mpVar.b(i12, i12, i13);
                }
                c2Var2.setOnClickListener(new org.telegram.ui.Components.c31(11, this, cVar));
                this.Y1[i11] = c2Var2;
                c2Var = c2Var2;
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
        if (c2Var != null) {
            c2Var.setNeedDivider(false);
        }
        zt ztVar2 = this.T1;
        org.telegram.ui.Components.ow0[] ow0VarArr2 = this.X1;
        ztVar2.f38581b = ow0VarArr2;
        ztVar2.G = cVar;
        ztVar2.invalidate();
        ztVar2.f38582c = new float[ow0VarArr2.length];
        ztVar2.d = new float[ow0VarArr2.length];
        ztVar2.f38583e = new float[ow0VarArr2.length];
        ztVar2.c(false);
        if (ztVar2.E > 1) {
            ztVar2.f38584f = 0.0f;
        } else {
            ztVar2.f38584f = 1.0f;
        }
        i6 i6Var = new i6(this, getContext(), x6Var);
        this.f45673a2 = i6Var;
        int L = org.telegram.messenger.g0.L(80.0f);
        if (i6Var.f51926x == null) {
            i6Var.f51925w = L;
            int i14 = 0;
            while (true) {
                org.telegram.ui.Components.g71 g71Var = i6Var.f51922n;
                if (i14 >= g71Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.ck0 c10 = i6Var.c(g71Var.getViewPages()[i14]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), L);
                }
                i14++;
            }
        }
        this.f45673a2.setCacheModel(cVar);
        this.f45673a2.setDelegate(new ji.j(this, cVar, false, 16));
        org.telegram.ui.Components.la laVar = this.f39540u1;
        if (laVar != null) {
            laVar.setChildLayout(this.f45673a2);
        } else {
            e1();
            this.Z1.addView(this.W1, c8.ma.r(-1, 72, 80));
        }
        if (this.W1 != null) {
            this.W1.a(this.T1.a(), true);
        }
    }

    @Override
    public final org.telegram.ui.Components.bk0 M0(org.telegram.ui.Components.ck0 ck0Var) {
        return new di.l4(this, 6);
    }

    @Override
    public final CharSequence P0() {
        return this.f39538s1.getMessagesController().e1(this.f45674b2);
    }

    @Override
    public final void V0(org.telegram.ui.Components.au0 au0Var) {
        this.f39534o1.j(new g3(this, 10));
        if (this.f39540u1 != null) {
            e1();
            au0Var.addView(this.W1, c8.ma.e(-1, 72, 80));
        }
    }

    public final void e1() {
        l6 l6Var = new l6(getContext());
        this.W1 = l6Var;
        l6Var.f49456a.setOnClickListener(new a(this, 19));
        zt ztVar = this.T1;
        if (ztVar != null) {
            this.W1.a(ztVar.a(), true);
        }
    }
}
