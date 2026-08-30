package org.telegram.ui;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.R;
public final class f implements org.telegram.ui.ActionBar.k6 {
    public final int f34112a;
    public final Object f34113b;

    public f(Object obj, int i10) {
        this.f34112a = i10;
        this.f34113b = obj;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f34112a;
    }

    @Override
    public final void b() {
        androidx.activity.o[] oVarArr;
        s5.m[] mVarArr;
        vg.b bVar;
        vg.a aVar;
        pg.b bVar2;
        int i10;
        switch (this.f34112a) {
            case 0:
                ((i) this.f34113b).c0();
                return;
            case 1:
                gv gvVar = ((b7) this.f34113b).Q;
                if (gvVar != null) {
                    gvVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19977h5, false));
                    return;
                }
                return;
            case 2:
                l9.U((l9) this.f34113b);
                return;
            case 3:
                nd ndVar = (nd) this.f34113b;
                LinearLayout linearLayout = ndVar.I;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ndVar.I.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f21412n, nVar.f21411f);
                            nVar.f21408a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                xn xnVar = (xn) this.f34113b;
                fj fjVar = xnVar.f40219w;
                if (fjVar != null) {
                    fjVar.b();
                }
                fj fjVar2 = xnVar.f40233x;
                if (fjVar2 != null) {
                    fjVar2.b();
                }
                jk jkVar = xnVar.V;
                if (jkVar != null) {
                    jkVar.e();
                }
                nh.t2 t2Var = xnVar.G1;
                if (t2Var != null) {
                    t2Var.c1();
                }
                qj qjVar = xnVar.f40193u0;
                if (qjVar != null) {
                    int childCount2 = qjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = xnVar.f40193u0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            ((org.telegram.ui.Cells.v0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                lh.e1 e1Var = xnVar.I3;
                if (e1Var != null) {
                    int childCount3 = e1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = xnVar.I3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (xnVar.P8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.g1[] g1VarArr = xnVar.P8;
                        if (i14 < g1VarArr.length) {
                            g1VarArr[i14].c(xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8));
                            xnVar.P8[i14].setSelectorColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
                if (p1Var != null) {
                    View contentView = p1Var.getContentView();
                    contentView.setBackgroundColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.ag0 ag0Var = xnVar.f40222w2;
                if (ag0Var != null) {
                    ag0Var.d();
                }
                lk lkVar = xnVar.W;
                if (lkVar != null && lkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.ed edVar : xnVar.W.getEditView().f24256a) {
                        edVar.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.f39997e0;
                if (w0Var != null) {
                    w0Var.N();
                }
                dk dkVar = xnVar.U1;
                if (dkVar != null) {
                    dkVar.p();
                }
                lj ljVar = xnVar.X0;
                if (ljVar != null) {
                    org.telegram.ui.ActionBar.f6 f6Var = ljVar.f31385a0;
                    org.telegram.ui.Components.mw0 mw0Var = ljVar.K;
                    if (mw0Var != null) {
                        mw0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20125pa, f6Var));
                    }
                    Drawable drawable = ljVar.f31401n0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.j5 j5Var = ljVar.f31390d0;
                    if (j5Var != null) {
                        j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
                    }
                    org.telegram.ui.Components.j5 j5Var2 = ljVar.f31389c0;
                    if (j5Var2 != null) {
                        j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
                    }
                    Drawable drawable2 = ljVar.f31402o0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = ljVar.f31403p0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    ljVar.invalidate();
                }
                pm pmVar = xnVar.U0;
                if (pmVar != null) {
                    pmVar.N();
                    eg.h0 h0Var = xnVar.U0.I;
                    if (h0Var != null) {
                        h0Var.invalidate();
                    }
                }
                org.telegram.ui.Components.sg sgVar = xnVar.J0;
                if (sgVar != null) {
                    pg.b bVar3 = sgVar.f28707s;
                    if (bVar3 != null) {
                        bVar3.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                    sgVar.invalidate();
                }
                org.telegram.ui.Components.qy0 qy0Var = xnVar.f39946a1;
                if (qy0Var != null) {
                    org.telegram.ui.ActionBar.f6 f6Var2 = qy0Var.f28305b;
                    Paint paint = qy0Var.L;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Be, f6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.j6.E4;
                    int i15 = org.telegram.ui.ActionBar.j6.Be;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.j6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, f6Var2), mode));
                }
                lj ljVar2 = xnVar.X0;
                if (ljVar2 != null && ljVar2.getTimeItem() != null) {
                    xnVar.X0.getTimeItem().invalidate();
                }
                ug.f fVar = xnVar.P;
                if (fVar != null) {
                    fVar.f45521f.u();
                    fVar.h.u();
                    fVar.invalidate();
                }
                wg.g gVar = xnVar.f40023g1;
                if (gVar != null) {
                    for (s5.m mVar : gVar.e) {
                        if (mVar != null && (aVar = (bVar = (vg.b) mVar.f44088b).f45771b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                ok okVar = xnVar.L0;
                if (okVar != null) {
                    for (androidx.activity.o oVar : okVar.f46554a) {
                        if (oVar != null) {
                            ((vg.a) oVar.f318b).g();
                        }
                    }
                }
                Iterator it = xnVar.B.iterator();
                while (it.hasNext()) {
                    ((pg.b) it.next()).u();
                }
                xnVar.n9();
                return;
            case 5:
                nh.y3 y3Var = ((po) this.f34113b).e;
                if (y3Var != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
            case 6:
                dp dpVar = (dp) this.f34113b;
                LinearLayout linearLayout2 = dpVar.f33770x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = dpVar.f33770x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.f21412n, nVar2.f21411f);
                            nVar2.f21408a.invalidate();
                        }
                    }
                }
                dpVar.D.f();
                org.telegram.ui.Components.s60 s60Var = dpVar.m0;
                if (s60Var != null) {
                    s60Var.b0();
                    return;
                }
                return;
            case 7:
                qp qpVar = (qp) this.f34113b;
                org.telegram.ui.Components.sl0 sl0Var = qpVar.f37804b;
                if (sl0Var != null) {
                    int childCount5 = sl0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = qpVar.f37804b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((xp) this.f34113b).W();
                return;
            case 9:
                jq jqVar = (jq) this.f34113b;
                lh.e1 e1Var2 = jqVar.f35432b;
                if (e1Var2 != null) {
                    int childCount6 = e1Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = jqVar.f35432b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                pr prVar = (pr) this.f34113b;
                lh.e1 e1Var3 = prVar.f37450c;
                if (e1Var3 != null) {
                    int childCount7 = e1Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = prVar.f37450c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ns.W((ns) this.f34113b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f34113b);
                return;
            case 13:
                b10 b10Var = (b10) this.f34113b;
                lh.e1 e1Var4 = b10Var.f32759a;
                if (e1Var4 != null) {
                    int childCount8 = e1Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = b10Var.f32759a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                nh.a3 a3Var = ((t10) this.f34113b).f38485j0;
                if (a3Var != null && (bVar2 = (pg.b) a3Var.f15051c) != null) {
                    bVar2.u();
                    return;
                }
                return;
            case 15:
                ((l20) this.f34113b).v0();
                return;
            case 16:
                y60 y60Var = (y60) this.f34113b;
                org.telegram.ui.Components.sl0 sl0Var2 = y60Var.f40427n;
                if (sl0Var2 != null) {
                    int childCount9 = sl0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = y60Var.f40427n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.c20 c20Var = y60Var.f40419f;
                if (c20Var != null) {
                    c20Var.e();
                }
                org.telegram.ui.Components.z10 z10Var = y60Var.f40437y;
                if (z10Var != null) {
                    z10Var.g();
                    return;
                }
                return;
            case 17:
                e70 e70Var = (e70) this.f34113b;
                org.telegram.ui.Components.sl0 sl0Var3 = e70Var.f33916b;
                if (sl0Var3 != null) {
                    int childCount10 = sl0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = e70Var.f33916b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.z10 z10Var2 = e70Var.v;
                if (z10Var2 != null) {
                    z10Var2.g();
                    return;
                }
                return;
            case 18:
                ((u70) this.f34113b).V(true);
                return;
            case 19:
                c80 c80Var = (c80) this.f34113b;
                org.telegram.ui.Components.sl0 sl0Var4 = c80Var.h;
                if (sl0Var4 != null) {
                    int childCount11 = sl0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = c80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                nb0 nb0Var = (nb0) this.f34113b;
                org.telegram.ui.Cells.a9 a9Var = nb0Var.D;
                if (a9Var != null) {
                    a9Var.getContext();
                    jb0 jb0Var = nb0Var.C;
                    int i24 = org.telegram.ui.ActionBar.j6.G6;
                    jb0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    jb0 jb0Var2 = nb0Var.C;
                    int i25 = org.telegram.ui.ActionBar.j6.f20281y6;
                    jb0Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    nb0Var.f36569w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    nb0Var.f36569w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    org.telegram.ui.Cells.aa aaVar = nb0Var.F;
                    if (aaVar != null) {
                        aaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20122p7, false));
                    }
                    nb0Var.J.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    nb0Var.H.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    nb0Var.H.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                ad0 ad0Var = (ad0) this.f34113b;
                ad0Var.d.setIconColor(ad0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ui));
                ad0Var.d.B(ad0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                ad0Var.d.G(ad0Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
                ad0Var.d.G(ad0Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
                ad0Var.f32544s.setColorFilter(new PorterDuffColorFilter(ad0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5), PorterDuff.Mode.MULTIPLY));
                ad0Var.v.invalidate();
                if (ad0Var.F != null) {
                    if (AndroidUtilities.computePerceivedBrightness(ad0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!ad0Var.X) {
                            ad0Var.X = true;
                            ad0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = ad0Var.L;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                ad0Var.L.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ad0Var.X) {
                        ad0Var.X = false;
                        ad0Var.F.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = ad0Var.L;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            ad0Var.L.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((ng0) this.f34113b).y1();
                return;
            case 23:
                ((vg0) this.f34113b).e0();
                return;
            case 24:
                ph0 ph0Var = (ph0) this.f34113b;
                org.telegram.ui.Components.sl0 sl0Var5 = ph0Var.f37319b;
                if (sl0Var5 != null) {
                    int childCount12 = sl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = ph0Var.f37319b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.x80) {
                            ((org.telegram.ui.Components.x80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.s60 s60Var2 = ph0Var.f37329i0;
                if (s60Var2 != null) {
                    s60Var2.b0();
                    return;
                }
                return;
            case 25:
                aj0 aj0Var = (aj0) this.f34113b;
                org.telegram.ui.Components.sl0 sl0Var6 = aj0Var.f32651f;
                if (sl0Var6 != null) {
                    int childCount13 = sl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        aj0Var.d0(aj0Var.f32651f.getChildAt(i27));
                    }
                    int hiddenChildCount = aj0Var.f32651f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        aj0Var.d0(aj0Var.f32651f.V(i28));
                    }
                    int cachedChildCount = aj0Var.f32651f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        aj0Var.d0(aj0Var.f32651f.P(i29));
                    }
                    int attachedScrapChildCount = aj0Var.f32651f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        aj0Var.d0(aj0Var.f32651f.O(i30));
                    }
                    aj0Var.f32651f.getRecycledViewPool().a();
                }
                vf.f fVar2 = aj0Var.Z;
                if (fVar2 != null) {
                    fVar2.f45685g = true;
                }
                View subtitleTextView = aj0Var.Y.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.k5) {
                    ((org.telegram.ui.ActionBar.k5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, aj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f34113b;
                org.telegram.ui.Components.sl0 sl0Var7 = notificationsCustomSettingsActivity.f31662a;
                if (sl0Var7 != null) {
                    int childCount14 = sl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f31662a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((gp0) this.f34113b).z0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f34113b).u0();
                return;
            default:
                mx0 mx0Var = (mx0) this.f34113b;
                org.telegram.ui.Components.sl0 sl0Var8 = mx0Var.f36400a;
                if (sl0Var8 != null) {
                    int childCount15 = sl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = mx0Var.f36400a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt14).c(0);
                        }
                    }
                    return;
                }
                return;
        }
    }

    private final void A(float f10) {
    }

    private final void B(float f10) {
    }

    private final void C(float f10) {
    }

    private final void D(float f10) {
    }

    private final void E(float f10) {
    }

    private final void F(float f10) {
    }

    private final void c(float f10) {
    }

    private final void d(float f10) {
    }

    private final void e(float f10) {
    }

    private final void f(float f10) {
    }

    private final void g(float f10) {
    }

    private final void h(float f10) {
    }

    private final void i(float f10) {
    }

    private final void j(float f10) {
    }

    private final void k(float f10) {
    }

    private final void l(float f10) {
    }

    private final void m(float f10) {
    }

    private final void n(float f10) {
    }

    private final void o(float f10) {
    }

    private final void p(float f10) {
    }

    private final void q(float f10) {
    }

    private final void r(float f10) {
    }

    private final void s(float f10) {
    }

    private final void t(float f10) {
    }

    private final void u(float f10) {
    }

    private final void v(float f10) {
    }

    private final void w(float f10) {
    }

    private final void x(float f10) {
    }

    private final void y(float f10) {
    }

    private final void z(float f10) {
    }
}
