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
public final class e implements org.telegram.ui.ActionBar.j6 {
    public final int f33176a;
    public final Object f33177b;

    public e(Object obj, int i10) {
        this.f33176a = i10;
        this.f33177b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f33176a;
    }

    @Override
    public final void b() {
        androidx.activity.n[] nVarArr;
        aa.a[] aVarArr;
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        int i10;
        switch (this.f33176a) {
            case 0:
                ((h) this.f33177b).c0();
                return;
            case 1:
                jv jvVar = ((z6) this.f33177b).T;
                if (jvVar != null) {
                    jvVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18907h5, false));
                    return;
                }
                return;
            case 2:
                k9.U((k9) this.f33177b);
                return;
            case 3:
                ld ldVar = (ld) this.f33177b;
                LinearLayout linearLayout = ldVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ldVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f20451n, nVar.f20450f);
                            nVar.f20447a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                bo boVar = (bo) this.f33177b;
                jj jjVar = boVar.f32510w;
                if (jjVar != null) {
                    jjVar.d();
                }
                jj jjVar2 = boVar.f32523x;
                if (jjVar2 != null) {
                    jjVar2.d();
                }
                mk mkVar = boVar.Y;
                if (mkVar != null) {
                    mkVar.e();
                }
                ai.g4 g4Var = boVar.J1;
                if (g4Var != null) {
                    g4Var.c1();
                }
                uj ujVar = boVar.f32524x0;
                if (ujVar != null) {
                    int childCount2 = ujVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = boVar.f32524x0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.w0 w0Var = boVar.L3;
                if (w0Var != null) {
                    int childCount3 = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = boVar.L3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (boVar.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = boVar.S8;
                        if (i14 < f1VarArr.length) {
                            f1VarArr[i14].c(boVar.getThemedColor(org.telegram.ui.ActionBar.i6.E8), boVar.getThemedColor(org.telegram.ui.ActionBar.i6.F8));
                            boVar.S8[i14].setSelectorColor(boVar.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = boVar.Q8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(boVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.vf0 vf0Var = boVar.f32551z2;
                if (vf0Var != null) {
                    vf0Var.d();
                }
                ok okVar = boVar.Z;
                if (okVar != null && okVar.getEditView() != null) {
                    for (org.telegram.ui.Components.md mdVar : boVar.Z.getEditView().f25905a) {
                        mdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = boVar.f32324h0;
                if (v0Var != null) {
                    v0Var.N();
                }
                hk hkVar = boVar.X1;
                if (hkVar != null) {
                    hkVar.p();
                }
                pj pjVar = boVar.f32237a1;
                if (pjVar != null) {
                    org.telegram.ui.ActionBar.e6 e6Var = pjVar.f23705d0;
                    org.telegram.ui.Components.lw0 lw0Var = pjVar.N;
                    if (lw0Var != null) {
                        lw0Var.b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19059pa, e6Var));
                    }
                    Drawable drawable = pjVar.f23719q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19248zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.m5 m5Var = pjVar.f23709g0;
                    if (m5Var != null) {
                        m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19248zh, e6Var)));
                    }
                    org.telegram.ui.Components.m5 m5Var2 = pjVar.f23708f0;
                    if (m5Var2 != null) {
                        m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19248zh, e6Var)));
                    }
                    Drawable drawable2 = pjVar.f23721r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19248zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = pjVar.f23723s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ah, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    pjVar.invalidate();
                }
                tm tmVar = boVar.X0;
                if (tmVar != null) {
                    tmVar.N();
                    ci.eb ebVar = boVar.X0.L;
                    if (ebVar != null) {
                        ebVar.invalidate();
                    }
                }
                org.telegram.ui.Components.bh bhVar = boVar.M0;
                if (bhVar != null) {
                    ch.d dVar2 = bhVar.f22779s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
                    bhVar.invalidate();
                }
                org.telegram.ui.Components.ny0 ny0Var = boVar.f32276d1;
                if (ny0Var != null) {
                    org.telegram.ui.ActionBar.e6 e6Var2 = ny0Var.f26616b;
                    Paint paint = ny0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Be, e6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.i6.E4;
                    int i15 = org.telegram.ui.ActionBar.i6.Be;
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i15, e6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.i6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i15, e6Var2), mode));
                }
                pj pjVar2 = boVar.f32237a1;
                if (pjVar2 != null && pjVar2.getTimeItem() != null) {
                    boVar.f32237a1.getTimeItem().invalidate();
                }
                hh.g gVar = boVar.S;
                if (gVar != null) {
                    gVar.f10522f.v();
                    gVar.h.v();
                    gVar.invalidate();
                }
                jh.h hVar = boVar.f32350j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.f357b).f11197b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                rk rkVar = boVar.O0;
                if (rkVar != null) {
                    for (androidx.activity.n nVar2 : rkVar.f13015a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.f1904c).g();
                        }
                    }
                }
                Iterator it = boVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                boVar.n9();
                return;
            case 5:
                ai.z5 z5Var = ((wo) this.f33177b).e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    return;
                }
                return;
            case 6:
                kp kpVar = (kp) this.f33177b;
                LinearLayout linearLayout2 = kpVar.f35237x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = kpVar.f35237x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.f20451n, nVar3.f20450f);
                            nVar3.f20447a.invalidate();
                        }
                    }
                }
                kpVar.G.f();
                org.telegram.ui.Components.r60 r60Var = kpVar.f35229p0;
                if (r60Var != null) {
                    r60Var.b0();
                    return;
                }
                return;
            case 7:
                wp wpVar = (wp) this.f33177b;
                org.telegram.ui.Components.ll0 ll0Var = wpVar.f39348b;
                if (ll0Var != null) {
                    int childCount5 = ll0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = wpVar.f39348b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((dq) this.f33177b).W();
                return;
            case 9:
                pq pqVar = (pq) this.f33177b;
                ai.w0 w0Var2 = pqVar.f36634b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = pqVar.f36634b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                ur urVar = (ur) this.f33177b;
                ai.w0 w0Var3 = urVar.f38099c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = urVar.f38099c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ss.W((ss) this.f33177b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f33177b);
                return;
            case 13:
                f10 f10Var = (f10) this.f33177b;
                ai.w0 w0Var4 = f10Var.f33441a;
                if (w0Var4 != null) {
                    int childCount8 = w0Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = f10Var.f33441a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ai.n4 n4Var = ((x10) this.f33177b).m0;
                if (n4Var != null && (dVar = (ch.d) n4Var.f1282c) != null) {
                    dVar.v();
                    return;
                }
                return;
            case 15:
                ((r20) this.f33177b).v0();
                return;
            case 16:
                e70 e70Var = (e70) this.f33177b;
                org.telegram.ui.Components.ll0 ll0Var2 = e70Var.f33247n;
                if (ll0Var2 != null) {
                    int childCount9 = ll0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = e70Var.f33247n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.b20 b20Var = e70Var.f33239f;
                if (b20Var != null) {
                    b20Var.e();
                }
                org.telegram.ui.Components.y10 y10Var = e70Var.f33260y;
                if (y10Var != null) {
                    y10Var.g();
                    return;
                }
                return;
            case 17:
                l70 l70Var = (l70) this.f33177b;
                org.telegram.ui.Components.ll0 ll0Var3 = l70Var.f35356b;
                if (ll0Var3 != null) {
                    int childCount10 = ll0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = l70Var.f35356b.getChildAt(i22);
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
                ((d80) this.f33177b).V(true);
                return;
            case 19:
                l80 l80Var = (l80) this.f33177b;
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
                xb0 xb0Var = (xb0) this.f33177b;
                org.telegram.ui.Cells.e9 e9Var = xb0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    tb0 tb0Var = xb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.i6.G6;
                    tb0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    tb0 tb0Var2 = xb0Var.F;
                    int i25 = org.telegram.ui.ActionBar.i6.f19218y6;
                    tb0Var2.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i25, false));
                    xb0Var.f39574w.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    xb0Var.f39574w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i25, false));
                    org.telegram.ui.Cells.ea eaVar = xb0Var.I;
                    if (eaVar != null) {
                        eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19056p7, false));
                    }
                    xb0Var.M.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    xb0Var.K.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    xb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                id0 id0Var = (id0) this.f33177b;
                id0Var.d.setIconColor(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ui));
                id0Var.d.B(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                id0Var.d.G(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.F8), true);
                id0Var.d.G(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false);
                id0Var.f34635s.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18907h5), PorterDuff.Mode.MULTIPLY));
                id0Var.v.invalidate();
                if (id0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(id0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!id0Var.f34613a0) {
                            id0Var.f34613a0 = true;
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
                    } else if (id0Var.f34613a0) {
                        id0Var.f34613a0 = false;
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
                ((wg0) this.f33177b).y1();
                return;
            case 23:
                ((eh0) this.f33177b).e0();
                return;
            case 24:
                yh0 yh0Var = (yh0) this.f33177b;
                org.telegram.ui.Components.ll0 ll0Var5 = yh0Var.f39884b;
                if (ll0Var5 != null) {
                    int childCount12 = ll0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = yh0Var.f39884b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.v80) {
                            ((org.telegram.ui.Components.v80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.r60 r60Var2 = yh0Var.f39897l0;
                if (r60Var2 != null) {
                    r60Var2.b0();
                    return;
                }
                return;
            case 25:
                jj0 jj0Var = (jj0) this.f33177b;
                org.telegram.ui.Components.ll0 ll0Var6 = jj0Var.f34923f;
                if (ll0Var6 != null) {
                    int childCount13 = ll0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        jj0Var.d0(jj0Var.f34923f.getChildAt(i27));
                    }
                    int hiddenChildCount = jj0Var.f34923f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        jj0Var.d0(jj0Var.f34923f.V(i28));
                    }
                    int cachedChildCount = jj0Var.f34923f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        jj0Var.d0(jj0Var.f34923f.P(i29));
                    }
                    int attachedScrapChildCount = jj0Var.f34923f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        jj0Var.d0(jj0Var.f34923f.O(i30));
                    }
                    jj0Var.f34923f.getRecycledViewPool().a();
                }
                ig.f fVar = jj0Var.f34920c0;
                if (fVar != null) {
                    fVar.f11111g = true;
                }
                View subtitleTextView = jj0Var.f34918b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Pi, jj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f33177b;
                org.telegram.ui.Components.ll0 ll0Var7 = notificationsCustomSettingsActivity.f30864a;
                if (ll0Var7 != null) {
                    int childCount14 = ll0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f30864a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((aq0) this.f33177b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f33177b).u0();
                return;
            default:
                gy0 gy0Var = (gy0) this.f33177b;
                org.telegram.ui.Components.ll0 ll0Var8 = gy0Var.f34037a;
                if (ll0Var8 != null) {
                    int childCount15 = ll0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = gy0Var.f34037a.getChildAt(i32);
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
