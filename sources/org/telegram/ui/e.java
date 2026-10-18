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
    public final int f36315a;
    public final Object f36316b;

    public e(Object obj, int i10) {
        this.f36315a = i10;
        this.f36316b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f36315a;
    }

    @Override
    public final void b() {
        androidx.activity.o[] oVarArr;
        androidx.biometric.e[] eVarArr;
        jh.b bVar;
        jh.a aVar;
        dh.d dVar;
        int i10;
        switch (this.f36315a) {
            case 0:
                ((h) this.f36316b).b0();
                return;
            case 1:
                xu xuVar = ((c7) this.f36316b).T;
                if (xuVar != null) {
                    xuVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false));
                    return;
                }
                return;
            case 2:
                m9.U((m9) this.f36316b);
                return;
            case 3:
                od odVar = (od) this.f36316b;
                LinearLayout linearLayout = odVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = odVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f22618n, nVar.f22617f);
                            nVar.f22614a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                sn snVar = (sn) this.f36316b;
                dj djVar = snVar.f41405w;
                if (djVar != null) {
                    djVar.b();
                }
                dj djVar2 = snVar.f41418x;
                if (djVar2 != null) {
                    djVar2.b();
                }
                hk hkVar = snVar.Y;
                if (hkVar != null) {
                    hkVar.d();
                }
                ci.a3 a3Var = snVar.J1;
                if (a3Var != null) {
                    a3Var.e1();
                }
                pj pjVar = snVar.f41419x0;
                if (pjVar != null) {
                    int childCount2 = pjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = snVar.f41419x0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.u1 u1Var = snVar.L3;
                if (u1Var != null) {
                    int childCount3 = u1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = snVar.L3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (snVar.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.e1[] e1VarArr = snVar.S8;
                        if (i14 < e1VarArr.length) {
                            e1VarArr[i14].c(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.E8), snVar.getThemedColor(org.telegram.ui.ActionBar.h6.F8));
                            snVar.S8[i14].setSelectorColor(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = snVar.Q8;
                if (m1Var != null) {
                    View contentView = m1Var.getContentView();
                    contentView.setBackgroundColor(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.pg0 pg0Var = snVar.f41446z2;
                if (pg0Var != null) {
                    pg0Var.d();
                }
                ik ikVar = snVar.Z;
                if (ikVar != null && ikVar.getEditView() != null) {
                    for (org.telegram.ui.Components.nd ndVar : snVar.Z.getEditView().f28504a) {
                        ndVar.d();
                    }
                }
                org.telegram.ui.ActionBar.u0 u0Var = snVar.f41219h0;
                if (u0Var != null) {
                    u0Var.N();
                }
                bk bkVar = snVar.X1;
                if (bkVar != null) {
                    bkVar.q();
                }
                jj jjVar = snVar.f41131a1;
                if (jjVar != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = jjVar.f29018d0;
                    org.telegram.ui.Components.fx0 fx0Var = jjVar.N;
                    if (fx0Var != null) {
                        fx0Var.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21209pa, d6Var));
                    }
                    Drawable drawable = jjVar.f29032q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21401zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.p5 p5Var = jjVar.f29022g0;
                    if (p5Var != null) {
                        p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21401zh, d6Var)));
                    }
                    org.telegram.ui.Components.p5 p5Var2 = jjVar.f29021f0;
                    if (p5Var2 != null) {
                        p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21401zh, d6Var)));
                    }
                    Drawable drawable2 = jjVar.f29034r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21401zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = jjVar.f29036s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    jjVar.invalidate();
                }
                lm lmVar = snVar.X0;
                if (lmVar != null) {
                    lmVar.N();
                    ai.ic icVar = snVar.X0.L;
                    if (icVar != null) {
                        icVar.invalidate();
                    }
                }
                org.telegram.ui.Components.ch chVar = snVar.M0;
                if (chVar != null) {
                    dh.d dVar2 = chVar.f25239s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                    chVar.invalidate();
                }
                org.telegram.ui.Components.gz0 gz0Var = snVar.f41171d1;
                if (gz0Var != null) {
                    org.telegram.ui.ActionBar.d6 d6Var2 = gz0Var.f26705b;
                    Paint paint = gz0Var.O;
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
                jj jjVar2 = snVar.f41131a1;
                if (jjVar2 != null && jjVar2.getTimeItem() != null) {
                    snVar.f41131a1.getTimeItem().invalidate();
                }
                ih.f fVar = snVar.S;
                if (fVar != null) {
                    fVar.f13132f.v();
                    fVar.h.v();
                    fVar.invalidate();
                }
                kh.h hVar = snVar.f41243j1;
                if (hVar != null) {
                    for (androidx.biometric.e eVar : hVar.e) {
                        if (eVar != null && (aVar = (bVar = (jh.b) eVar.f2819b).f14515b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                lk lkVar = snVar.O0;
                if (lkVar != null) {
                    for (androidx.activity.o oVar : lkVar.f15068a) {
                        if (oVar != null) {
                            ((jh.a) oVar.f2672b).g();
                        }
                    }
                }
                Iterator it = snVar.E.iterator();
                while (it.hasNext()) {
                    ((dh.d) it.next()).v();
                }
                snVar.s9();
                return;
            case 5:
                ci.j4 j4Var = ((ko) this.f36316b).e;
                if (j4Var != null) {
                    j4Var.invalidate();
                    return;
                }
                return;
            case 6:
                yo yoVar = (yo) this.f36316b;
                LinearLayout linearLayout2 = yoVar.f43449x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = yoVar.f43449x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.f22618n, nVar2.f22617f);
                            nVar2.f22614a.invalidate();
                        }
                    }
                }
                yoVar.G.f();
                org.telegram.ui.Components.l70 l70Var = yoVar.f43441p0;
                if (l70Var != null) {
                    l70Var.d();
                    return;
                }
                return;
            case 7:
                kp kpVar = (kp) this.f36316b;
                org.telegram.ui.Components.im0 im0Var = kpVar.f38584b;
                if (im0Var != null) {
                    int childCount5 = im0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = kpVar.f38584b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((rp) this.f36316b).W();
                return;
            case 9:
                dq dqVar = (dq) this.f36316b;
                ai.u1 u1Var2 = dqVar.f36232b;
                if (u1Var2 != null) {
                    int childCount6 = u1Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = dqVar.f36232b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                jr jrVar = (jr) this.f36316b;
                ai.u1 u1Var3 = jrVar.f38264c;
                if (u1Var3 != null) {
                    int childCount7 = u1Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = jrVar.f38264c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                hs.W((hs) this.f36316b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f36316b);
                return;
            case 13:
                p00 p00Var = (p00) this.f36316b;
                ai.u1 u1Var4 = p00Var.f39900a;
                if (u1Var4 != null) {
                    int childCount8 = u1Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = p00Var.f39900a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ci.h3 h3Var = ((g10) this.f36316b).m0;
                if (h3Var != null && (dVar = (dh.d) h3Var.f5392c) != null) {
                    dVar.v();
                    return;
                }
                return;
            case 15:
                ((a20) this.f36316b).w0();
                return;
            case 16:
                n60 n60Var = (n60) this.f36316b;
                org.telegram.ui.Components.im0 im0Var2 = n60Var.f39329n;
                if (im0Var2 != null) {
                    int childCount9 = im0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = n60Var.f39329n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.k20 k20Var = n60Var.f39321f;
                if (k20Var != null) {
                    k20Var.d();
                }
                org.telegram.ui.Components.h20 h20Var = n60Var.f39342y;
                if (h20Var != null) {
                    h20Var.g();
                    return;
                }
                return;
            case 17:
                u60 u60Var = (u60) this.f36316b;
                org.telegram.ui.Components.im0 im0Var3 = u60Var.f41865b;
                if (im0Var3 != null) {
                    int childCount10 = im0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = u60Var.f41865b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.h20 h20Var2 = u60Var.v;
                if (h20Var2 != null) {
                    h20Var2.g();
                    return;
                }
                return;
            case 18:
                ((l70) this.f36316b).V(true);
                return;
            case 19:
                t70 t70Var = (t70) this.f36316b;
                org.telegram.ui.Components.im0 im0Var4 = t70Var.h;
                if (im0Var4 != null) {
                    int childCount11 = im0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = t70Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                cb0 cb0Var = (cb0) this.f36316b;
                org.telegram.ui.Cells.d9 d9Var = cb0Var.G;
                if (d9Var != null) {
                    d9Var.getContext();
                    ya0 ya0Var = cb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.h6.G6;
                    ya0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    ya0 ya0Var2 = cb0Var.F;
                    int i25 = org.telegram.ui.ActionBar.h6.f21374y6;
                    ya0Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i25, false));
                    cb0Var.f35871w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    cb0Var.f35871w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i25, false));
                    org.telegram.ui.Cells.ba baVar = cb0Var.I;
                    if (baVar != null) {
                        baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207p7, false));
                    }
                    cb0Var.M.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    cb0Var.K.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    cb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i25, false));
                    return;
                }
                return;
            case 21:
                pc0 pc0Var = (pc0) this.f36316b;
                pc0Var.d.setIconColor(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ui));
                pc0Var.d.B(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                pc0Var.d.G(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
                pc0Var.d.G(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
                pc0Var.f40040s.setColorFilter(new PorterDuffColorFilter(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21057h5), PorterDuff.Mode.MULTIPLY));
                pc0Var.v.invalidate();
                if (pc0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(pc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!pc0Var.f40018a0) {
                            pc0Var.f40018a0 = true;
                            pc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = pc0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                pc0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (pc0Var.f40018a0) {
                        pc0Var.f40018a0 = false;
                        pc0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = pc0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            pc0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((eg0) this.f36316b).y1();
                return;
            case 23:
                ((og0) this.f36316b).e0();
                return;
            case 24:
                jh0 jh0Var = (jh0) this.f36316b;
                org.telegram.ui.Components.im0 im0Var5 = jh0Var.f38144b;
                if (im0Var5 != null) {
                    int childCount12 = im0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = jh0Var.f38144b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.q90) {
                            ((org.telegram.ui.Components.q90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.l70 l70Var2 = jh0Var.f38157l0;
                if (l70Var2 != null) {
                    l70Var2.d();
                    return;
                }
                return;
            case 25:
                vi0 vi0Var = (vi0) this.f36316b;
                org.telegram.ui.Components.im0 im0Var6 = vi0Var.f42205f;
                if (im0Var6 != null) {
                    int childCount13 = im0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        vi0Var.d0(vi0Var.f42205f.getChildAt(i27));
                    }
                    int hiddenChildCount = vi0Var.f42205f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        vi0Var.d0(vi0Var.f42205f.V(i28));
                    }
                    int cachedChildCount = vi0Var.f42205f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        vi0Var.d0(vi0Var.f42205f.P(i29));
                    }
                    int attachedScrapChildCount = vi0Var.f42205f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        vi0Var.d0(vi0Var.f42205f.O(i30));
                    }
                    vi0Var.f42205f.getRecycledViewPool().a();
                }
                jg.f fVar2 = vi0Var.f42202c0;
                if (fVar2 != null) {
                    fVar2.f14425a = true;
                }
                View subtitleTextView = vi0Var.f42200b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Pi, vi0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f36316b;
                org.telegram.ui.Components.im0 im0Var7 = notificationsCustomSettingsActivity.f33193a;
                if (im0Var7 != null) {
                    int childCount14 = im0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f33193a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((kp0) this.f36316b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f36316b).u0();
                return;
            default:
                mx0 mx0Var = (mx0) this.f36316b;
                org.telegram.ui.Components.im0 im0Var8 = mx0Var.f39245a;
                if (im0Var8 != null) {
                    int childCount15 = im0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = mx0Var.f39245a.getChildAt(i32);
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
