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
    public final int f35899a;
    public final Object f35900b;

    public e(Object obj, int i10) {
        this.f35899a = i10;
        this.f35900b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f35899a;
    }

    @Override
    public final void b() {
        androidx.activity.o[] oVarArr;
        aa.a[] aVarArr;
        jh.b bVar;
        jh.a aVar;
        dh.d dVar;
        int i10;
        switch (this.f35899a) {
            case 0:
                ((h) this.f35900b).c0();
                return;
            case 1:
                kv kvVar = ((z6) this.f35900b).T;
                if (kvVar != null) {
                    kvVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false));
                    return;
                }
                return;
            case 2:
                k9.U((k9) this.f35900b);
                return;
            case 3:
                md mdVar = (md) this.f35900b;
                LinearLayout linearLayout = mdVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = mdVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f22313n, nVar.f22312f);
                            nVar.f22308a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                co coVar = (co) this.f35900b;
                jj jjVar = coVar.f35459w;
                if (jjVar != null) {
                    jjVar.b();
                }
                jj jjVar2 = coVar.f35472x;
                if (jjVar2 != null) {
                    jjVar2.b();
                }
                mk mkVar = coVar.Y;
                if (mkVar != null) {
                    mkVar.d();
                }
                bi.t3 t3Var = coVar.J1;
                if (t3Var != null) {
                    t3Var.c1();
                }
                uj ujVar = coVar.f35473x0;
                if (ujVar != null) {
                    int childCount2 = ujVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = coVar.f35473x0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                bi.o0 o0Var = coVar.L3;
                if (o0Var != null) {
                    int childCount3 = o0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = coVar.L3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (coVar.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = coVar.S8;
                        if (i14 < f1VarArr.length) {
                            f1VarArr[i14].c(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), coVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8));
                            coVar.S8[i14].setSelectorColor(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = coVar.Q8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.vf0 vf0Var = coVar.f35500z2;
                if (vf0Var != null) {
                    vf0Var.d();
                }
                ok okVar = coVar.Z;
                if (okVar != null && okVar.getEditView() != null) {
                    for (org.telegram.ui.Components.od odVar : coVar.Z.getEditView().f28731a) {
                        odVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = coVar.f35273h0;
                if (v0Var != null) {
                    v0Var.N();
                }
                hk hkVar = coVar.X1;
                if (hkVar != null) {
                    hkVar.p();
                }
                pj pjVar = coVar.f35186a1;
                if (pjVar != null) {
                    org.telegram.ui.ActionBar.f6 f6Var = pjVar.f25044d0;
                    org.telegram.ui.Components.kw0 kw0Var = pjVar.N;
                    if (kw0Var != null) {
                        kw0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20883pa, f6Var));
                    }
                    Drawable drawable = pjVar.f25059q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21072zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.o5 o5Var = pjVar.f25049g0;
                    if (o5Var != null) {
                        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21072zh, f6Var)));
                    }
                    org.telegram.ui.Components.o5 o5Var2 = pjVar.f25048f0;
                    if (o5Var2 != null) {
                        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21072zh, f6Var)));
                    }
                    Drawable drawable2 = pjVar.f25061r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21072zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = pjVar.f25063s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    pjVar.invalidate();
                }
                um umVar = coVar.X0;
                if (umVar != null) {
                    umVar.N();
                    di.eb ebVar = coVar.X0.L;
                    if (ebVar != null) {
                        ebVar.invalidate();
                    }
                }
                org.telegram.ui.Components.dh dhVar = coVar.M0;
                if (dhVar != null) {
                    dh.d dVar2 = dhVar.f25382s;
                    if (dVar2 != null) {
                        dVar2.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
                    dhVar.invalidate();
                }
                org.telegram.ui.Components.my0 my0Var = coVar.f35225d1;
                if (my0Var != null) {
                    org.telegram.ui.ActionBar.f6 f6Var2 = my0Var.f28557b;
                    Paint paint = my0Var.O;
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
                pj pjVar2 = coVar.f35186a1;
                if (pjVar2 != null && pjVar2.getTimeItem() != null) {
                    coVar.f35186a1.getTimeItem().invalidate();
                }
                ih.g gVar = coVar.S;
                if (gVar != null) {
                    gVar.f12333f.u();
                    gVar.h.u();
                    gVar.invalidate();
                }
                kh.h hVar = coVar.f35299j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.f14967e) {
                        if (aVar2 != null && (aVar = (bVar = (jh.b) aVar2.f371b).f13728b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                rk rkVar = coVar.O0;
                if (rkVar != null) {
                    for (androidx.activity.o oVar : rkVar.f14944a) {
                        if (oVar != null) {
                            ((jh.a) oVar.f884c).g();
                        }
                    }
                }
                Iterator it = coVar.E.iterator();
                while (it.hasNext()) {
                    ((dh.d) it.next()).u();
                }
                coVar.n9();
                return;
            case 5:
                bi.i5 i5Var = ((xo) this.f35900b).f42774e;
                if (i5Var != null) {
                    i5Var.invalidate();
                    return;
                }
                return;
            case 6:
                lp lpVar = (lp) this.f35900b;
                LinearLayout linearLayout2 = lpVar.f38451x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = lpVar.f38451x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.f22313n, nVar2.f22312f);
                            nVar2.f22308a.invalidate();
                        }
                    }
                }
                lpVar.G.f();
                org.telegram.ui.Components.r60 r60Var = lpVar.f38443p0;
                if (r60Var != null) {
                    r60Var.b0();
                    return;
                }
                return;
            case 7:
                xp xpVar = (xp) this.f35900b;
                org.telegram.ui.Components.ll0 ll0Var = xpVar.f42848b;
                if (ll0Var != null) {
                    int childCount5 = ll0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = xpVar.f42848b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((eq) this.f35900b).W();
                return;
            case 9:
                qq qqVar = (qq) this.f35900b;
                bi.o0 o0Var2 = qqVar.f39936b;
                if (o0Var2 != null) {
                    int childCount6 = o0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = qqVar.f39936b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                vr vrVar = (vr) this.f35900b;
                bi.o0 o0Var3 = vrVar.f41635c;
                if (o0Var3 != null) {
                    int childCount7 = o0Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = vrVar.f41635c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ss.W((ss) this.f35900b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f35900b);
                return;
            case 13:
                f10 f10Var = (f10) this.f35900b;
                bi.o0 o0Var4 = f10Var.f36222a;
                if (o0Var4 != null) {
                    int childCount8 = o0Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = f10Var.f36222a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                bi.a4 a4Var = ((x10) this.f35900b).m0;
                if (a4Var != null && (dVar = (dh.d) a4Var.f2752c) != null) {
                    dVar.u();
                    return;
                }
                return;
            case 15:
                ((r20) this.f35900b).v0();
                return;
            case 16:
                f70 f70Var = (f70) this.f35900b;
                org.telegram.ui.Components.ll0 ll0Var2 = f70Var.f36295n;
                if (ll0Var2 != null) {
                    int childCount9 = ll0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = f70Var.f36295n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.b20 b20Var = f70Var.f36287f;
                if (b20Var != null) {
                    b20Var.d();
                }
                org.telegram.ui.Components.y10 y10Var = f70Var.f36308y;
                if (y10Var != null) {
                    y10Var.g();
                    return;
                }
                return;
            case 17:
                l70 l70Var = (l70) this.f35900b;
                org.telegram.ui.Components.ll0 ll0Var3 = l70Var.f38208b;
                if (ll0Var3 != null) {
                    int childCount10 = ll0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = l70Var.f38208b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt10).f(0);
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
                ((d80) this.f35900b).V(true);
                return;
            case 19:
                l80 l80Var = (l80) this.f35900b;
                org.telegram.ui.Components.ll0 ll0Var4 = l80Var.h;
                if (ll0Var4 != null) {
                    int childCount11 = ll0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = l80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                xb0 xb0Var = (xb0) this.f35900b;
                org.telegram.ui.Cells.e9 e9Var = xb0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    tb0 tb0Var = xb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.j6.G6;
                    tb0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    tb0 tb0Var2 = xb0Var.F;
                    int i25 = org.telegram.ui.ActionBar.j6.f21042y6;
                    tb0Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    xb0Var.f42679w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    xb0Var.f42679w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    org.telegram.ui.Cells.ea eaVar = xb0Var.I;
                    if (eaVar != null) {
                        eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20880p7, false));
                    }
                    xb0Var.M.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    xb0Var.K.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    xb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                id0 id0Var = (id0) this.f35900b;
                id0Var.d.setIconColor(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ui));
                id0Var.d.B(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                id0Var.d.G(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
                id0Var.d.G(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
                id0Var.f37327s.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20734h5), PorterDuff.Mode.MULTIPLY));
                id0Var.v.invalidate();
                if (id0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(id0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!id0Var.f37304a0) {
                            id0Var.f37304a0 = true;
                            id0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = id0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                id0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (id0Var.f37304a0) {
                        id0Var.f37304a0 = false;
                        id0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = id0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            id0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((wg0) this.f35900b).y1();
                return;
            case 23:
                ((eh0) this.f35900b).e0();
                return;
            case 24:
                yh0 yh0Var = (yh0) this.f35900b;
                org.telegram.ui.Components.ll0 ll0Var5 = yh0Var.f43121b;
                if (ll0Var5 != null) {
                    int childCount12 = ll0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = yh0Var.f43121b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.w80) {
                            ((org.telegram.ui.Components.w80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.r60 r60Var2 = yh0Var.f43135l0;
                if (r60Var2 != null) {
                    r60Var2.b0();
                    return;
                }
                return;
            case 25:
                lj0 lj0Var = (lj0) this.f35900b;
                org.telegram.ui.Components.ll0 ll0Var6 = lj0Var.f38388f;
                if (ll0Var6 != null) {
                    int childCount13 = ll0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        lj0Var.d0(lj0Var.f38388f.getChildAt(i27));
                    }
                    int hiddenChildCount = lj0Var.f38388f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        lj0Var.d0(lj0Var.f38388f.V(i28));
                    }
                    int cachedChildCount = lj0Var.f38388f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        lj0Var.d0(lj0Var.f38388f.P(i29));
                    }
                    int attachedScrapChildCount = lj0Var.f38388f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        lj0Var.d0(lj0Var.f38388f.O(i30));
                    }
                    lj0Var.f38388f.getRecycledViewPool().a();
                }
                jg.f fVar = lj0Var.f38384c0;
                if (fVar != null) {
                    fVar.f13638g = true;
                }
                View subtitleTextView = lj0Var.f38382b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, lj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f35900b;
                org.telegram.ui.Components.ll0 ll0Var7 = notificationsCustomSettingsActivity.f33473a;
                if (ll0Var7 != null) {
                    int childCount14 = ll0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f33473a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((bq0) this.f35900b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f35900b).u0();
                return;
            default:
                hy0 hy0Var = (hy0) this.f35900b;
                org.telegram.ui.Components.ll0 ll0Var8 = hy0Var.f37130a;
                if (ll0Var8 != null) {
                    int childCount15 = ll0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = hy0Var.f37130a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt14).c(0);
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
