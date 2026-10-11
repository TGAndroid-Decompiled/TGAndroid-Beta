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
public final class e implements org.telegram.ui.ActionBar.i6 {
    public final int f37161a;
    public final Object f37162b;

    public e(Object obj, int i10) {
        this.f37161a = i10;
        this.f37162b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f37161a;
    }

    @Override
    public final void b() {
        androidx.activity.n[] nVarArr;
        aa.a[] aVarArr;
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        int i10;
        switch (this.f37161a) {
            case 0:
                ((h) this.f37162b).b0();
                return;
            case 1:
                hv hvVar = ((x6) this.f37162b).T;
                if (hvVar != null) {
                    hvVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false));
                    return;
                }
                return;
            case 2:
                i9.U((i9) this.f37162b);
                return;
            case 3:
                ld ldVar = (ld) this.f37162b;
                LinearLayout linearLayout = ldVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ldVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f22475n, nVar.f22474f);
                            nVar.f22470a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                zn znVar = (zn) this.f37162b;
                kj kjVar = znVar.f44974w;
                if (kjVar != null) {
                    kjVar.b();
                }
                kj kjVar2 = znVar.f44988x;
                if (kjVar2 != null) {
                    kjVar2.b();
                }
                ok okVar = znVar.Y;
                if (okVar != null) {
                    okVar.e();
                }
                ai.h4 h4Var = znVar.J1;
                if (h4Var != null) {
                    h4Var.e1();
                }
                wj wjVar = znVar.f44989x0;
                if (wjVar != null) {
                    int childCount2 = wjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = znVar.f44989x0.getChildAt(i12);
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
                        org.telegram.ui.ActionBar.e1[] e1VarArr = znVar.S8;
                        if (i14 < e1VarArr.length) {
                            e1VarArr[i14].c(znVar.getThemedColor(org.telegram.ui.ActionBar.h6.E8), znVar.getThemedColor(org.telegram.ui.ActionBar.h6.F8));
                            znVar.S8[i14].setSelectorColor(znVar.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = znVar.Q8;
                if (m1Var != null) {
                    View contentView = m1Var.getContentView();
                    contentView.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.zg0 zg0Var = znVar.f45015z2;
                if (zg0Var != null) {
                    zg0Var.d();
                }
                pk pkVar = znVar.Z;
                if (pkVar != null && pkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.rd rdVar : znVar.Z.getEditView().f30141a) {
                        rdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.u0 u0Var = znVar.f44788h0;
                if (u0Var != null) {
                    u0Var.N();
                }
                ik ikVar = znVar.X1;
                if (ikVar != null) {
                    ikVar.q();
                }
                qj qjVar = znVar.f44701a1;
                if (qjVar != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = qjVar.f31513d0;
                    org.telegram.ui.Components.qx0 qx0Var = qjVar.N;
                    if (qx0Var != null) {
                        qx0Var.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21010pa, d6Var));
                    }
                    Drawable drawable = qjVar.f31528q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21200zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.q5 q5Var = qjVar.f31518g0;
                    if (q5Var != null) {
                        q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21200zh, d6Var)));
                    }
                    org.telegram.ui.Components.q5 q5Var2 = qjVar.f31517f0;
                    if (q5Var2 != null) {
                        q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21200zh, d6Var)));
                    }
                    Drawable drawable2 = qjVar.f31530r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21200zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = qjVar.f31532s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    qjVar.invalidate();
                }
                sm smVar = znVar.X0;
                if (smVar != null) {
                    smVar.N();
                    ci.bb bbVar = znVar.X0.L;
                    if (bbVar != null) {
                        bbVar.invalidate();
                    }
                }
                org.telegram.ui.Components.fh fhVar = znVar.M0;
                if (fhVar != null) {
                    ch.d dVar2 = fhVar.f26350s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
                    fhVar.invalidate();
                }
                org.telegram.ui.Components.qz0 qz0Var = znVar.f44740d1;
                if (qz0Var != null) {
                    org.telegram.ui.ActionBar.d6 d6Var2 = qz0Var.f30270b;
                    Paint paint = qz0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Be, d6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.h6.E4;
                    int i15 = org.telegram.ui.ActionBar.h6.Be;
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i15, d6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    org.telegram.ui.ActionBar.h6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i15, d6Var2), mode));
                }
                qj qjVar2 = znVar.f44701a1;
                if (qjVar2 != null && qjVar2.getTimeItem() != null) {
                    znVar.f44701a1.getTimeItem().invalidate();
                }
                hh.f fVar = znVar.S;
                if (fVar != null) {
                    fVar.f11503f.v();
                    fVar.h.v();
                    fVar.invalidate();
                }
                jh.h hVar = znVar.f44814j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.f14199e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.f384b).f12229b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                sk skVar = znVar.O0;
                if (skVar != null) {
                    for (androidx.activity.n nVar2 : skVar.f14176a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.f2148c).g();
                        }
                    }
                }
                Iterator it = znVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                znVar.s9();
                return;
            case 5:
                ai.z5 z5Var = ((uo) this.f37162b).f42661e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    return;
                }
                return;
            case 6:
                ip ipVar = (ip) this.f37162b;
                LinearLayout linearLayout2 = ipVar.f38763x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = ipVar.f38763x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.f22475n, nVar3.f22474f);
                            nVar3.f22470a.invalidate();
                        }
                    }
                }
                ipVar.G.f();
                org.telegram.ui.Components.u70 u70Var = ipVar.f38755p0;
                if (u70Var != null) {
                    u70Var.e();
                    return;
                }
                return;
            case 7:
                up upVar = (up) this.f37162b;
                org.telegram.ui.Components.sm0 sm0Var = upVar.f42735b;
                if (sm0Var != null) {
                    int childCount5 = sm0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = upVar.f42735b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((bq) this.f37162b).W();
                return;
            case 9:
                nq nqVar = (nq) this.f37162b;
                ai.w0 w0Var2 = nqVar.f40309b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = nqVar.f40309b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.wa) {
                            ((org.telegram.ui.Cells.wa) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                sr srVar = (sr) this.f37162b;
                ai.w0 w0Var3 = srVar.f41790c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = srVar.f41790c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ps.W((ps) this.f37162b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f37162b);
                return;
            case 13:
                e10 e10Var = (e10) this.f37162b;
                ai.w0 w0Var4 = e10Var.f37169a;
                if (w0Var4 != null) {
                    int childCount8 = w0Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = e10Var.f37169a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.xa) {
                            ((org.telegram.ui.Cells.xa) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ai.o4 o4Var = ((v10) this.f37162b).m0;
                if (o4Var != null && (dVar = (ch.d) o4Var.f1527c) != null) {
                    dVar.v();
                    return;
                }
                return;
            case 15:
                ((o20) this.f37162b).w0();
                return;
            case 16:
                c70 c70Var = (c70) this.f37162b;
                org.telegram.ui.Components.sm0 sm0Var2 = c70Var.f36601n;
                if (sm0Var2 != null) {
                    int childCount9 = sm0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = c70Var.f36601n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.t20 t20Var = c70Var.f36593f;
                if (t20Var != null) {
                    t20Var.e();
                }
                org.telegram.ui.Components.q20 q20Var = c70Var.f36614y;
                if (q20Var != null) {
                    q20Var.g();
                    return;
                }
                return;
            case 17:
                j70 j70Var = (j70) this.f37162b;
                org.telegram.ui.Components.sm0 sm0Var3 = j70Var.f38863b;
                if (sm0Var3 != null) {
                    int childCount10 = sm0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = j70Var.f38863b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.q20 q20Var2 = j70Var.v;
                if (q20Var2 != null) {
                    q20Var2.g();
                    return;
                }
                return;
            case 18:
                ((c80) this.f37162b).V(true);
                return;
            case 19:
                k80 k80Var = (k80) this.f37162b;
                org.telegram.ui.Components.sm0 sm0Var4 = k80Var.h;
                if (sm0Var4 != null) {
                    int childCount11 = sm0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = k80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                ub0 ub0Var = (ub0) this.f37162b;
                org.telegram.ui.Cells.e9 e9Var = ub0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    qb0 qb0Var = ub0Var.F;
                    int i24 = org.telegram.ui.ActionBar.h6.G6;
                    qb0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    qb0 qb0Var2 = ub0Var.F;
                    int i25 = org.telegram.ui.ActionBar.h6.f21171y6;
                    qb0Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i25, false));
                    ub0Var.f42512w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    ub0Var.f42512w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i25, false));
                    org.telegram.ui.Cells.ca caVar = ub0Var.I;
                    if (caVar != null) {
                        caVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21007p7, false));
                    }
                    ub0Var.M.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    ub0Var.K.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    ub0Var.K.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i25, false));
                    return;
                }
                return;
            case 21:
                gd0 gd0Var = (gd0) this.f37162b;
                gd0Var.d.setIconColor(gd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ui));
                gd0Var.d.B(gd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                gd0Var.d.G(gd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
                gd0Var.d.G(gd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
                gd0Var.f38037s.setColorFilter(new PorterDuffColorFilter(gd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20857h5), PorterDuff.Mode.MULTIPLY));
                gd0Var.v.invalidate();
                if (gd0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(gd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!gd0Var.f38014a0) {
                            gd0Var.f38014a0 = true;
                            gd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = gd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                gd0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (gd0Var.f38014a0) {
                        gd0Var.f38014a0 = false;
                        gd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = gd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            gd0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((vg0) this.f37162b).y1();
                return;
            case 23:
                ((eh0) this.f37162b).e0();
                return;
            case 24:
                yh0 yh0Var = (yh0) this.f37162b;
                org.telegram.ui.Components.sm0 sm0Var5 = yh0Var.f44405b;
                if (sm0Var5 != null) {
                    int childCount12 = sm0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = yh0Var.f44405b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.y90) {
                            ((org.telegram.ui.Components.y90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.u70 u70Var2 = yh0Var.f44419l0;
                if (u70Var2 != null) {
                    u70Var2.e();
                    return;
                }
                return;
            case 25:
                kj0 kj0Var = (kj0) this.f37162b;
                org.telegram.ui.Components.sm0 sm0Var6 = kj0Var.f39358f;
                if (sm0Var6 != null) {
                    int childCount13 = sm0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        kj0Var.d0(kj0Var.f39358f.getChildAt(i27));
                    }
                    int hiddenChildCount = kj0Var.f39358f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        kj0Var.d0(kj0Var.f39358f.V(i28));
                    }
                    int cachedChildCount = kj0Var.f39358f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        kj0Var.d0(kj0Var.f39358f.P(i29));
                    }
                    int attachedScrapChildCount = kj0Var.f39358f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        kj0Var.d0(kj0Var.f39358f.O(i30));
                    }
                    kj0Var.f39358f.getRecycledViewPool().a();
                }
                ig.f fVar2 = kj0Var.f39354c0;
                if (fVar2 != null) {
                    fVar2.f12139g = true;
                }
                View subtitleTextView = kj0Var.f39352b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
                    ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Pi, kj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f37162b;
                org.telegram.ui.Components.sm0 sm0Var7 = notificationsCustomSettingsActivity.f33855a;
                if (sm0Var7 != null) {
                    int childCount14 = sm0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f33855a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.xa) {
                            ((org.telegram.ui.Cells.xa) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((zp0) this.f37162b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f37162b).u0();
                return;
            default:
                fy0 fy0Var = (fy0) this.f37162b;
                org.telegram.ui.Components.sm0 sm0Var8 = fy0Var.f37804a;
                if (sm0Var8 != null) {
                    int childCount15 = sm0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = fy0Var.f37804a.getChildAt(i32);
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
