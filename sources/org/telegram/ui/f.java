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
public final class f implements org.telegram.ui.ActionBar.h6 {
    public final int f37937a;
    public final Object f37938b;

    public f(Object obj, int i10) {
        this.f37937a = i10;
        this.f37938b = obj;
    }

    @Override
    public final void a(float f9) {
        int i10 = this.f37937a;
    }

    @Override
    public final void b() {
        androidx.activity.n[] nVarArr;
        l3.g0[] g0VarArr;
        tg.b bVar;
        tg.a aVar;
        ng.d dVar;
        int i10;
        switch (this.f37937a) {
            case 0:
                ((i) this.f37938b).c0();
                return;
            case 1:
                yu yuVar = ((x6) this.f37938b).P;
                if (yuVar != null) {
                    yuVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
                    return;
                }
                return;
            case 2:
                h9.U((h9) this.f37938b);
                return;
            case 3:
                hd hdVar = (hd) this.f37938b;
                LinearLayout linearLayout = hdVar.H;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = hdVar.H.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f24727n, nVar.f24726f);
                            nVar.f24722a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                tn tnVar = (tn) this.f37938b;
                aj ajVar = tnVar.f43012w;
                if (ajVar != null) {
                    ajVar.b();
                }
                aj ajVar2 = tnVar.f43026x;
                if (ajVar2 != null) {
                    ajVar2.b();
                }
                dk dkVar = tnVar.U;
                if (dkVar != null) {
                    dkVar.e();
                }
                lh.s2 s2Var = tnVar.F1;
                if (s2Var != null) {
                    s2Var.c1();
                }
                lj ljVar = tnVar.f42973t0;
                if (ljVar != null) {
                    int childCount2 = ljVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = tnVar.f42973t0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                            ((org.telegram.ui.Cells.s1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            ((org.telegram.ui.Cells.v0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                jh.e1 e1Var = tnVar.H3;
                if (e1Var != null) {
                    int childCount3 = e1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = tnVar.H3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.p2) {
                            ((org.telegram.ui.Cells.p2) childAt3).b0(0, true);
                        }
                    }
                }
                if (tnVar.O8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.g1[] g1VarArr = tnVar.O8;
                        if (i14 < g1VarArr.length) {
                            g1VarArr[i14].c(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.E8), tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.F8));
                            tnVar.O8[i14].setSelectorColor(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.o1 o1Var = tnVar.M8;
                if (o1Var != null) {
                    View contentView = o1Var.getContentView();
                    contentView.setBackgroundColor(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.rf0 rf0Var = tnVar.f43001v2;
                if (rf0Var != null) {
                    rf0Var.d();
                }
                fk fkVar = tnVar.V;
                if (fkVar != null && fkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.hd hdVar2 : tnVar.V.getEditView().f28871a) {
                        hdVar2.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42775d0;
                if (w0Var != null) {
                    w0Var.N();
                }
                yj yjVar = tnVar.T1;
                if (yjVar != null) {
                    yjVar.p();
                }
                gj gjVar = tnVar.W0;
                if (gjVar != null) {
                    org.telegram.ui.ActionBar.c6 c6Var = gjVar.W;
                    org.telegram.ui.Components.dw0 dw0Var = gjVar.J;
                    if (dw0Var != null) {
                        dw0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23282pa, c6Var));
                    }
                    Drawable drawable = gjVar.m0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.n5 n5Var = gjVar.f34788c0;
                    if (n5Var != null) {
                        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
                    }
                    org.telegram.ui.Components.n5 n5Var2 = gjVar.f34786b0;
                    if (n5Var2 != null) {
                        n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
                    }
                    Drawable drawable2 = gjVar.f34801n0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = gjVar.f34802o0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    gjVar.invalidate();
                }
                km kmVar = tnVar.T0;
                if (kmVar != null) {
                    kmVar.N();
                    cg.h0 h0Var = tnVar.T0.H;
                    if (h0Var != null) {
                        h0Var.invalidate();
                    }
                }
                org.telegram.ui.Components.vg vgVar = tnVar.I0;
                if (vgVar != null) {
                    ng.d dVar2 = vgVar.f33554s;
                    if (dVar2 != null) {
                        dVar2.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                    vgVar.invalidate();
                }
                org.telegram.ui.Components.fy0 fy0Var = tnVar.Z0;
                if (fy0Var != null) {
                    org.telegram.ui.ActionBar.c6 c6Var2 = fy0Var.f28564b;
                    Paint paint = fy0Var.K;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Be, c6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.g6.E4;
                    int i15 = org.telegram.ui.ActionBar.g6.Be;
                    int v02 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.g6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i15, c6Var2), mode));
                }
                gj gjVar2 = tnVar.W0;
                if (gjVar2 != null && gjVar2.getTimeItem() != null) {
                    tnVar.W0.getTimeItem().invalidate();
                }
                sg.f fVar = tnVar.O;
                if (fVar != null) {
                    fVar.f48052f.u();
                    fVar.h.u();
                    fVar.invalidate();
                }
                ug.g gVar = tnVar.f42803f1;
                if (gVar != null) {
                    for (l3.g0 g0Var : gVar.f49236e) {
                        if (g0Var != null && (aVar = (bVar = (tg.b) g0Var.f14096b).f48324b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                ik ikVar = tnVar.K0;
                if (ikVar != null) {
                    for (androidx.activity.n nVar2 : ikVar.f49216a) {
                        if (nVar2 != null) {
                            ((tg.a) nVar2.f881b).g();
                        }
                    }
                }
                Iterator it = tnVar.A.iterator();
                while (it.hasNext()) {
                    ((ng.d) it.next()).u();
                }
                tnVar.n9();
                return;
            case 5:
                lh.y3 y3Var = ((ko) this.f37938b).f39945e;
                if (y3Var != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
            case 6:
                yo yoVar = (yo) this.f37938b;
                LinearLayout linearLayout2 = yoVar.f44939x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = yoVar.f44939x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.f24727n, nVar3.f24726f);
                            nVar3.f24722a.invalidate();
                        }
                    }
                }
                yoVar.C.f();
                org.telegram.ui.Components.n60 n60Var = yoVar.f44931l0;
                if (n60Var != null) {
                    n60Var.b0();
                    return;
                }
                return;
            case 7:
                kp kpVar = (kp) this.f37938b;
                org.telegram.ui.Components.jl0 jl0Var = kpVar.f39978b;
                if (jl0Var != null) {
                    int childCount5 = jl0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = kpVar.f39978b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.z4) {
                            ((org.telegram.ui.Cells.z4) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((rp) this.f37938b).W();
                return;
            case 9:
                dq dqVar = (dq) this.f37938b;
                jh.e1 e1Var2 = dqVar.f37575b;
                if (e1Var2 != null) {
                    int childCount6 = e1Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = dqVar.f37575b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ra) {
                            ((org.telegram.ui.Cells.ra) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                jr jrVar = (jr) this.f37938b;
                jh.e1 e1Var3 = jrVar.f39624c;
                if (e1Var3 != null) {
                    int childCount7 = e1Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = jrVar.f39624c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.z4) {
                            ((org.telegram.ui.Cells.z4) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                hs.W((hs) this.f37938b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f37938b);
                return;
            case 13:
                p00 p00Var = (p00) this.f37938b;
                jh.e1 e1Var4 = p00Var.f41260a;
                if (e1Var4 != null) {
                    int childCount8 = e1Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = p00Var.f41260a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.sa) {
                            ((org.telegram.ui.Cells.sa) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                lh.z2 z2Var = ((h10) this.f37938b).f38731i0;
                if (z2Var != null && (dVar = (ng.d) z2Var.f16452c) != null) {
                    dVar.u();
                    return;
                }
                return;
            case 15:
                ((z10) this.f37938b).v0();
                return;
            case 16:
                m60 m60Var = (m60) this.f37938b;
                org.telegram.ui.Components.jl0 jl0Var2 = m60Var.f40458n;
                if (jl0Var2 != null) {
                    int childCount9 = jl0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = m60Var.f40458n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.x10 x10Var = m60Var.f40450f;
                if (x10Var != null) {
                    x10Var.e();
                }
                org.telegram.ui.Components.u10 u10Var = m60Var.f40467y;
                if (u10Var != null) {
                    u10Var.g();
                    return;
                }
                return;
            case 17:
                t60 t60Var = (t60) this.f37938b;
                org.telegram.ui.Components.jl0 jl0Var3 = t60Var.f42558b;
                if (jl0Var3 != null) {
                    int childCount10 = jl0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = t60Var.f42558b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.e4) {
                            ((org.telegram.ui.Cells.e4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.u10 u10Var2 = t60Var.v;
                if (u10Var2 != null) {
                    u10Var2.g();
                    return;
                }
                return;
            case 18:
                ((k70) this.f37938b).V(true);
                return;
            case 19:
                s70 s70Var = (s70) this.f37938b;
                org.telegram.ui.Components.jl0 jl0Var4 = s70Var.h;
                if (jl0Var4 != null) {
                    int childCount11 = jl0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = s70Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.n4) {
                            ((org.telegram.ui.Cells.n4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                eb0 eb0Var = (eb0) this.f37938b;
                org.telegram.ui.Cells.y8 y8Var = eb0Var.C;
                if (y8Var != null) {
                    y8Var.getContext();
                    ab0 ab0Var = eb0Var.B;
                    int i24 = org.telegram.ui.ActionBar.g6.G6;
                    ab0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    ab0 ab0Var2 = eb0Var.B;
                    int i25 = org.telegram.ui.ActionBar.g6.f23433y6;
                    ab0Var2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i25, false));
                    eb0Var.f37782w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    eb0Var.f37782w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i25, false));
                    org.telegram.ui.Cells.y9 y9Var = eb0Var.E;
                    if (y9Var != null) {
                        y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23279p7, false));
                    }
                    eb0Var.I.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    eb0Var.G.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    eb0Var.G.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                rc0 rc0Var = (rc0) this.f37938b;
                rc0Var.d.setIconColor(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ui));
                rc0Var.d.B(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                rc0Var.d.G(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true);
                rc0Var.d.G(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
                rc0Var.f42056s.setColorFilter(new PorterDuffColorFilter(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5), PorterDuff.Mode.MULTIPLY));
                rc0Var.v.invalidate();
                if (rc0Var.E != null) {
                    if (AndroidUtilities.computePerceivedBrightness(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!rc0Var.W) {
                            rc0Var.W = true;
                            rc0Var.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = rc0Var.K;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                rc0Var.K.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (rc0Var.W) {
                        rc0Var.W = false;
                        rc0Var.E.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = rc0Var.K;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            rc0Var.K.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((fg0) this.f37938b).y1();
                return;
            case 23:
                ((ng0) this.f37938b).e0();
                return;
            case 24:
                hh0 hh0Var = (hh0) this.f37938b;
                org.telegram.ui.Components.jl0 jl0Var5 = hh0Var.f38914b;
                if (jl0Var5 != null) {
                    int childCount12 = jl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = hh0Var.f38914b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.z4) {
                            ((org.telegram.ui.Cells.z4) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.r80) {
                            ((org.telegram.ui.Components.r80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.n60 n60Var2 = hh0Var.f38924h0;
                if (n60Var2 != null) {
                    n60Var2.b0();
                    return;
                }
                return;
            case 25:
                si0 si0Var = (si0) this.f37938b;
                org.telegram.ui.Components.jl0 jl0Var6 = si0Var.f42406f;
                if (jl0Var6 != null) {
                    int childCount13 = jl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        si0Var.d0(si0Var.f42406f.getChildAt(i27));
                    }
                    int hiddenChildCount = si0Var.f42406f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        si0Var.d0(si0Var.f42406f.V(i28));
                    }
                    int cachedChildCount = si0Var.f42406f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        si0Var.d0(si0Var.f42406f.P(i29));
                    }
                    int attachedScrapChildCount = si0Var.f42406f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        si0Var.d0(si0Var.f42406f.O(i30));
                    }
                    si0Var.f42406f.getRecycledViewPool().a();
                }
                tf.f fVar2 = si0Var.Y;
                if (fVar2 != null) {
                    fVar2.f48233g = true;
                }
                View subtitleTextView = si0Var.X.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
                    ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Pi, si0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f37938b;
                org.telegram.ui.Components.jl0 jl0Var7 = notificationsCustomSettingsActivity.f35610a;
                if (jl0Var7 != null) {
                    int childCount14 = jl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f35610a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.sa) {
                            ((org.telegram.ui.Cells.sa) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((yo0) this.f37938b).z0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f37938b).u0();
                return;
            default:
                bx0 bx0Var = (bx0) this.f37938b;
                org.telegram.ui.Components.jl0 jl0Var8 = bx0Var.f36931a;
                if (jl0Var8 != null) {
                    int childCount15 = jl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = bx0Var.f36931a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.z4) {
                            ((org.telegram.ui.Cells.z4) childAt14).c(0);
                        }
                    }
                    return;
                }
                return;
        }
    }

    private final void A(float f9) {
    }

    private final void B(float f9) {
    }

    private final void C(float f9) {
    }

    private final void D(float f9) {
    }

    private final void E(float f9) {
    }

    private final void F(float f9) {
    }

    private final void c(float f9) {
    }

    private final void d(float f9) {
    }

    private final void e(float f9) {
    }

    private final void f(float f9) {
    }

    private final void g(float f9) {
    }

    private final void h(float f9) {
    }

    private final void i(float f9) {
    }

    private final void j(float f9) {
    }

    private final void k(float f9) {
    }

    private final void l(float f9) {
    }

    private final void m(float f9) {
    }

    private final void n(float f9) {
    }

    private final void o(float f9) {
    }

    private final void p(float f9) {
    }

    private final void q(float f9) {
    }

    private final void r(float f9) {
    }

    private final void s(float f9) {
    }

    private final void t(float f9) {
    }

    private final void u(float f9) {
    }

    private final void v(float f9) {
    }

    private final void w(float f9) {
    }

    private final void x(float f9) {
    }

    private final void y(float f9) {
    }

    private final void z(float f9) {
    }
}
