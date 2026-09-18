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
public final class e implements org.telegram.ui.ActionBar.k6 {
    public final int f33136a;
    public final Object f33137b;

    public e(Object obj, int i10) {
        this.f33136a = i10;
        this.f33137b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f33136a;
    }

    @Override
    public final void b() {
        androidx.activity.n[] nVarArr;
        aa.a[] aVarArr;
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        int i10;
        switch (this.f33136a) {
            case 0:
                ((h) this.f33137b).c0();
                return;
            case 1:
                kv kvVar = ((z6) this.f33137b).X;
                if (kvVar != null) {
                    kvVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19133h5, false));
                    return;
                }
                return;
            case 2:
                l9.U((l9) this.f33137b);
                return;
            case 3:
                md mdVar = (md) this.f33137b;
                LinearLayout linearLayout = mdVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = mdVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f20625n, nVar.f20624f);
                            nVar.f20621a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                zn znVar = (zn) this.f33137b;
                ij ijVar = znVar.f40474w;
                if (ijVar != null) {
                    ijVar.d();
                }
                ij ijVar2 = znVar.f40487x;
                if (ijVar2 != null) {
                    ijVar2.d();
                }
                lk lkVar = znVar.Y;
                if (lkVar != null) {
                    lkVar.e();
                }
                ai.g4 g4Var = znVar.J1;
                if (g4Var != null) {
                    g4Var.c1();
                }
                tj tjVar = znVar.f40488x0;
                if (tjVar != null) {
                    int childCount2 = tjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = znVar.f40488x0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.w0 w0Var = znVar.L3;
                if (w0Var != null) {
                    int childCount3 = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = znVar.L3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
                if (znVar.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = znVar.S8;
                        if (i14 < f1VarArr.length) {
                            f1VarArr[i14].c(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), znVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8));
                            znVar.S8[i14].setSelectorColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.eg0 eg0Var = znVar.f40515z2;
                if (eg0Var != null) {
                    eg0Var.d();
                }
                nk nkVar = znVar.Z;
                if (nkVar != null && nkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.nd ndVar : znVar.Z.getEditView().f26399a) {
                        ndVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = znVar.f40288h0;
                if (v0Var != null) {
                    v0Var.N();
                }
                gk gkVar = znVar.X1;
                if (gkVar != null) {
                    gkVar.q();
                }
                oj ojVar = znVar.f40201a1;
                if (ojVar != null) {
                    org.telegram.ui.ActionBar.e6 e6Var = ojVar.f23919d0;
                    org.telegram.ui.Components.xw0 xw0Var = ojVar.N;
                    if (xw0Var != null) {
                        xw0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19286pa, e6Var));
                    }
                    Drawable drawable = ojVar.f23933q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19475zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.o5 o5Var = ojVar.f23923g0;
                    if (o5Var != null) {
                        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19475zh, e6Var)));
                    }
                    org.telegram.ui.Components.o5 o5Var2 = ojVar.f23922f0;
                    if (o5Var2 != null) {
                        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19475zh, e6Var)));
                    }
                    Drawable drawable2 = ojVar.f23935r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19475zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = ojVar.f23937s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    ojVar.invalidate();
                }
                rm rmVar = znVar.X0;
                if (rmVar != null) {
                    rmVar.N();
                    ci.eb ebVar = znVar.X0.L;
                    if (ebVar != null) {
                        ebVar.invalidate();
                    }
                }
                org.telegram.ui.Components.ch chVar = znVar.M0;
                if (chVar != null) {
                    ch.d dVar2 = chVar.f23269s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
                    chVar.invalidate();
                }
                org.telegram.ui.Components.zy0 zy0Var = znVar.f40240d1;
                if (zy0Var != null) {
                    org.telegram.ui.ActionBar.e6 e6Var2 = zy0Var.f30907b;
                    Paint paint = zy0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Be, e6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.j6.E4;
                    int i15 = org.telegram.ui.ActionBar.j6.Be;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i15, e6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.j6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i15, e6Var2), mode));
                }
                oj ojVar2 = znVar.f40201a1;
                if (ojVar2 != null && ojVar2.getTimeItem() != null) {
                    znVar.f40201a1.getTimeItem().invalidate();
                }
                hh.g gVar = znVar.S;
                if (gVar != null) {
                    gVar.f10527f.v();
                    gVar.h.v();
                    gVar.invalidate();
                }
                jh.h hVar = znVar.f40314j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.f359b).f11200b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                qk qkVar = znVar.O0;
                if (qkVar != null) {
                    for (androidx.activity.n nVar2 : qkVar.f13018a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.f1909c).g();
                        }
                    }
                }
                Iterator it = znVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                znVar.n9();
                return;
            case 5:
                ai.z5 z5Var = ((uo) this.f33137b).e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    return;
                }
                return;
            case 6:
                ip ipVar = (ip) this.f33137b;
                LinearLayout linearLayout2 = ipVar.f34597x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = ipVar.f34597x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.f20625n, nVar3.f20624f);
                            nVar3.f20621a.invalidate();
                        }
                    }
                }
                ipVar.G.f();
                org.telegram.ui.Components.a70 a70Var = ipVar.f34589p0;
                if (a70Var != null) {
                    a70Var.b0();
                    return;
                }
                return;
            case 7:
                up upVar = (up) this.f33137b;
                org.telegram.ui.Components.wl0 wl0Var = upVar.f38071b;
                if (wl0Var != null) {
                    int childCount5 = wl0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = upVar.f38071b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((bq) this.f33137b).W();
                return;
            case 9:
                nq nqVar = (nq) this.f33137b;
                ai.w0 w0Var2 = nqVar.f36002b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = nqVar.f36002b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                sr srVar = (sr) this.f33137b;
                ai.w0 w0Var3 = srVar.f37398c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = srVar.f37398c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ss.W((ss) this.f33137b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f33137b);
                return;
            case 13:
                f10 f10Var = (f10) this.f33137b;
                ai.w0 w0Var4 = f10Var.f33390a;
                if (w0Var4 != null) {
                    int childCount8 = w0Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = f10Var.f33390a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ai.n4 n4Var = ((x10) this.f33137b).m0;
                if (n4Var != null && (dVar = (ch.d) n4Var.f1287c) != null) {
                    dVar.v();
                    return;
                }
                return;
            case 15:
                ((r20) this.f33137b).v0();
                return;
            case 16:
                e70 e70Var = (e70) this.f33137b;
                org.telegram.ui.Components.wl0 wl0Var2 = e70Var.f33206n;
                if (wl0Var2 != null) {
                    int childCount9 = wl0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = e70Var.f33206n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.b20 b20Var = e70Var.f33198f;
                if (b20Var != null) {
                    b20Var.e();
                }
                org.telegram.ui.Components.y10 y10Var = e70Var.f33219y;
                if (y10Var != null) {
                    y10Var.g();
                    return;
                }
                return;
            case 17:
                l70 l70Var = (l70) this.f33137b;
                org.telegram.ui.Components.wl0 wl0Var3 = l70Var.f35268b;
                if (wl0Var3 != null) {
                    int childCount10 = wl0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = l70Var.f35268b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.y10 y10Var2 = l70Var.v;
                if (y10Var2 != null) {
                    y10Var2.g();
                    return;
                }
                return;
            case 18:
                ((d80) this.f33137b).V(true);
                return;
            case 19:
                l80 l80Var = (l80) this.f33137b;
                org.telegram.ui.Components.wl0 wl0Var4 = l80Var.h;
                if (wl0Var4 != null) {
                    int childCount11 = wl0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = l80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                yb0 yb0Var = (yb0) this.f33137b;
                org.telegram.ui.Cells.e9 e9Var = yb0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    ub0 ub0Var = yb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.j6.G6;
                    ub0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    ub0 ub0Var2 = yb0Var.F;
                    int i25 = org.telegram.ui.ActionBar.j6.f19445y6;
                    ub0Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    yb0Var.f39778w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    yb0Var.f39778w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    org.telegram.ui.Cells.ea eaVar = yb0Var.I;
                    if (eaVar != null) {
                        eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19283p7, false));
                    }
                    yb0Var.M.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    yb0Var.K.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    yb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                jd0 jd0Var = (jd0) this.f33137b;
                jd0Var.d.setIconColor(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ui));
                jd0Var.d.B(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                jd0Var.d.G(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
                jd0Var.d.G(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
                jd0Var.f34834s.setColorFilter(new PorterDuffColorFilter(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19133h5), PorterDuff.Mode.MULTIPLY));
                jd0Var.v.invalidate();
                if (jd0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(jd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!jd0Var.f34812a0) {
                            jd0Var.f34812a0 = true;
                            jd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = jd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                jd0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (jd0Var.f34812a0) {
                        jd0Var.f34812a0 = false;
                        jd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = jd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            jd0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((xg0) this.f33137b).y1();
                return;
            case 23:
                ((fh0) this.f33137b).e0();
                return;
            case 24:
                zh0 zh0Var = (zh0) this.f33137b;
                org.telegram.ui.Components.wl0 wl0Var5 = zh0Var.f40148b;
                if (wl0Var5 != null) {
                    int childCount12 = wl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = zh0Var.f40148b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.e90) {
                            ((org.telegram.ui.Components.e90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.a70 a70Var2 = zh0Var.f40161l0;
                if (a70Var2 != null) {
                    a70Var2.b0();
                    return;
                }
                return;
            case 25:
                kj0 kj0Var = (kj0) this.f33137b;
                org.telegram.ui.Components.wl0 wl0Var6 = kj0Var.f35127f;
                if (wl0Var6 != null) {
                    int childCount13 = wl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        kj0Var.d0(kj0Var.f35127f.getChildAt(i27));
                    }
                    int hiddenChildCount = kj0Var.f35127f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        kj0Var.d0(kj0Var.f35127f.W(i28));
                    }
                    int cachedChildCount = kj0Var.f35127f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        kj0Var.d0(kj0Var.f35127f.Q(i29));
                    }
                    int attachedScrapChildCount = kj0Var.f35127f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        kj0Var.d0(kj0Var.f35127f.P(i30));
                    }
                    kj0Var.f35127f.getRecycledViewPool().a();
                }
                ig.f fVar = kj0Var.f35124c0;
                if (fVar != null) {
                    fVar.f11114g = true;
                }
                View subtitleTextView = kj0Var.f35122b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, kj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f33137b;
                org.telegram.ui.Components.wl0 wl0Var7 = notificationsCustomSettingsActivity.f31108a;
                if (wl0Var7 != null) {
                    int childCount14 = wl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f31108a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((cq0) this.f33137b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f33137b).u0();
                return;
            default:
                hy0 hy0Var = (hy0) this.f33137b;
                org.telegram.ui.Components.wl0 wl0Var8 = hy0Var.f34263a;
                if (wl0Var8 != null) {
                    int childCount15 = wl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = hy0Var.f34263a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt14).c(0);
                        }
                    }
                    return;
                }
                return;
        }
    }

    private final void A(float f7) {
    }

    private final void B(float f7) {
    }

    private final void C(float f7) {
    }

    private final void D(float f7) {
    }

    private final void E(float f7) {
    }

    private final void F(float f7) {
    }

    private final void c(float f7) {
    }

    private final void d(float f7) {
    }

    private final void e(float f7) {
    }

    private final void f(float f7) {
    }

    private final void g(float f7) {
    }

    private final void h(float f7) {
    }

    private final void i(float f7) {
    }

    private final void j(float f7) {
    }

    private final void k(float f7) {
    }

    private final void l(float f7) {
    }

    private final void m(float f7) {
    }

    private final void n(float f7) {
    }

    private final void o(float f7) {
    }

    private final void p(float f7) {
    }

    private final void q(float f7) {
    }

    private final void r(float f7) {
    }

    private final void s(float f7) {
    }

    private final void t(float f7) {
    }

    private final void u(float f7) {
    }

    private final void v(float f7) {
    }

    private final void w(float f7) {
    }

    private final void x(float f7) {
    }

    private final void y(float f7) {
    }

    private final void z(float f7) {
    }
}
