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
    public final int f36471a;
    public final Object f36472b;

    public e(Object obj, int i10) {
        this.f36471a = i10;
        this.f36472b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f36471a;
    }

    @Override
    public final void b() {
        androidx.activity.o[] oVarArr;
        androidx.biometric.e[] eVarArr;
        jh.b bVar;
        jh.a aVar;
        dh.d dVar;
        int i10;
        switch (this.f36471a) {
            case 0:
                ((h) this.f36472b).b0();
                return;
            case 1:
                vu vuVar = ((c7) this.f36472b).T;
                if (vuVar != null) {
                    vuVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21060h5, false));
                    return;
                }
                return;
            case 2:
                m9.U((m9) this.f36472b);
                return;
            case 3:
                md mdVar = (md) this.f36472b;
                LinearLayout linearLayout = mdVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = mdVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f22621n, nVar.f22620f);
                            nVar.f22617a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                qn qnVar = (qn) this.f36472b;
                bj bjVar = qnVar.f40889w;
                if (bjVar != null) {
                    bjVar.b();
                }
                bj bjVar2 = qnVar.f40902x;
                if (bjVar2 != null) {
                    bjVar2.b();
                }
                fk fkVar = qnVar.Y;
                if (fkVar != null) {
                    fkVar.d();
                }
                ci.b3 b3Var = qnVar.J1;
                if (b3Var != null) {
                    b3Var.e1();
                }
                nj njVar = qnVar.f40903x0;
                if (njVar != null) {
                    int childCount2 = njVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = qnVar.f40903x0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.u1 u1Var = qnVar.L3;
                if (u1Var != null) {
                    int childCount3 = u1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = qnVar.L3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (qnVar.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.e1[] e1VarArr = qnVar.S8;
                        if (i14 < e1VarArr.length) {
                            e1VarArr[i14].c(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.E8), qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.F8));
                            qnVar.S8[i14].setSelectorColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = qnVar.Q8;
                if (m1Var != null) {
                    View contentView = m1Var.getContentView();
                    contentView.setBackgroundColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.pg0 pg0Var = qnVar.f40930z2;
                if (pg0Var != null) {
                    pg0Var.d();
                }
                gk gkVar = qnVar.Z;
                if (gkVar != null && gkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.nd ndVar : qnVar.Z.getEditView().f28519a) {
                        ndVar.d();
                    }
                }
                org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40703h0;
                if (u0Var != null) {
                    u0Var.N();
                }
                zj zjVar = qnVar.X1;
                if (zjVar != null) {
                    zjVar.q();
                }
                hj hjVar = qnVar.f40615a1;
                if (hjVar != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = hjVar.f29046d0;
                    org.telegram.ui.Components.gx0 gx0Var = hjVar.N;
                    if (gx0Var != null) {
                        gx0Var.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21212pa, d6Var));
                    }
                    Drawable drawable = hjVar.f29060q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21404zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.p5 p5Var = hjVar.f29050g0;
                    if (p5Var != null) {
                        p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21404zh, d6Var)));
                    }
                    org.telegram.ui.Components.p5 p5Var2 = hjVar.f29049f0;
                    if (p5Var2 != null) {
                        p5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21404zh, d6Var)));
                    }
                    Drawable drawable2 = hjVar.f29062r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21404zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = hjVar.f29064s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    hjVar.invalidate();
                }
                jm jmVar = qnVar.X0;
                if (jmVar != null) {
                    jmVar.N();
                    ai.ic icVar = qnVar.X0.L;
                    if (icVar != null) {
                        icVar.invalidate();
                    }
                }
                org.telegram.ui.Components.ch chVar = qnVar.M0;
                if (chVar != null) {
                    dh.d dVar2 = chVar.f25217s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
                    chVar.invalidate();
                }
                org.telegram.ui.Components.hz0 hz0Var = qnVar.f40655d1;
                if (hz0Var != null) {
                    org.telegram.ui.ActionBar.d6 d6Var2 = hz0Var.f26952b;
                    Paint paint = hz0Var.O;
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
                hj hjVar2 = qnVar.f40615a1;
                if (hjVar2 != null && hjVar2.getTimeItem() != null) {
                    qnVar.f40615a1.getTimeItem().invalidate();
                }
                ih.f fVar = qnVar.S;
                if (fVar != null) {
                    fVar.f13134f.v();
                    fVar.h.v();
                    fVar.invalidate();
                }
                kh.h hVar = qnVar.f40727j1;
                if (hVar != null) {
                    for (androidx.biometric.e eVar : hVar.e) {
                        if (eVar != null && (aVar = (bVar = (jh.b) eVar.f2817b).f14517b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                jk jkVar = qnVar.O0;
                if (jkVar != null) {
                    for (androidx.activity.o oVar : jkVar.f15071a) {
                        if (oVar != null) {
                            ((jh.a) oVar.f2670b).g();
                        }
                    }
                }
                Iterator it = qnVar.E.iterator();
                while (it.hasNext()) {
                    ((dh.d) it.next()).v();
                }
                qnVar.s9();
                return;
            case 5:
                ci.k4 k4Var = ((io) this.f36472b).e;
                if (k4Var != null) {
                    k4Var.invalidate();
                    return;
                }
                return;
            case 6:
                wo woVar = (wo) this.f36472b;
                LinearLayout linearLayout2 = woVar.f42928x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = woVar.f42928x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.f22621n, nVar2.f22620f);
                            nVar2.f22617a.invalidate();
                        }
                    }
                }
                woVar.G.f();
                org.telegram.ui.Components.l70 l70Var = woVar.f42920p0;
                if (l70Var != null) {
                    l70Var.d();
                    return;
                }
                return;
            case 7:
                ip ipVar = (ip) this.f36472b;
                org.telegram.ui.Components.im0 im0Var = ipVar.f38062b;
                if (im0Var != null) {
                    int childCount5 = im0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = ipVar.f38062b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((pp) this.f36472b).W();
                return;
            case 9:
                bq bqVar = (bq) this.f36472b;
                ai.u1 u1Var2 = bqVar.f35687b;
                if (u1Var2 != null) {
                    int childCount6 = u1Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = bqVar.f35687b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                hr hrVar = (hr) this.f36472b;
                ai.u1 u1Var3 = hrVar.f37744c;
                if (u1Var3 != null) {
                    int childCount7 = u1Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = hrVar.f37744c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                fs.W((fs) this.f36472b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f36472b);
                return;
            case 13:
                n00 n00Var = (n00) this.f36472b;
                ai.u1 u1Var4 = n00Var.f39373a;
                if (u1Var4 != null) {
                    int childCount8 = u1Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = n00Var.f39373a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ci.i3 i3Var = ((e10) this.f36472b).m0;
                if (i3Var != null && (dVar = (dh.d) i3Var.f5488c) != null) {
                    dVar.v();
                    return;
                }
                return;
            case 15:
                ((y10) this.f36472b).w0();
                return;
            case 16:
                l60 l60Var = (l60) this.f36472b;
                org.telegram.ui.Components.im0 im0Var2 = l60Var.f38812n;
                if (im0Var2 != null) {
                    int childCount9 = im0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = l60Var.f38812n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.k20 k20Var = l60Var.f38804f;
                if (k20Var != null) {
                    k20Var.d();
                }
                org.telegram.ui.Components.h20 h20Var = l60Var.f38825y;
                if (h20Var != null) {
                    h20Var.g();
                    return;
                }
                return;
            case 17:
                s60 s60Var = (s60) this.f36472b;
                org.telegram.ui.Components.im0 im0Var3 = s60Var.f41371b;
                if (im0Var3 != null) {
                    int childCount10 = im0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = s60Var.f41371b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.h20 h20Var2 = s60Var.v;
                if (h20Var2 != null) {
                    h20Var2.g();
                    return;
                }
                return;
            case 18:
                ((j70) this.f36472b).V(true);
                return;
            case 19:
                r70 r70Var = (r70) this.f36472b;
                org.telegram.ui.Components.im0 im0Var4 = r70Var.h;
                if (im0Var4 != null) {
                    int childCount11 = im0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = r70Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                ab0 ab0Var = (ab0) this.f36472b;
                org.telegram.ui.Cells.d9 d9Var = ab0Var.G;
                if (d9Var != null) {
                    d9Var.getContext();
                    wa0 wa0Var = ab0Var.F;
                    int i24 = org.telegram.ui.ActionBar.h6.G6;
                    wa0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    wa0 wa0Var2 = ab0Var.F;
                    int i25 = org.telegram.ui.ActionBar.h6.f21377y6;
                    wa0Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i25, false));
                    ab0Var.f35326w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    ab0Var.f35326w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i25, false));
                    org.telegram.ui.Cells.ba baVar = ab0Var.I;
                    if (baVar != null) {
                        baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21210p7, false));
                    }
                    ab0Var.M.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    ab0Var.K.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i24, false));
                    ab0Var.K.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i25, false));
                    return;
                }
                return;
            case 21:
                nc0 nc0Var = (nc0) this.f36472b;
                nc0Var.d.setIconColor(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ui));
                nc0Var.d.B(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                nc0Var.d.G(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
                nc0Var.d.G(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
                nc0Var.f39519s.setColorFilter(new PorterDuffColorFilter(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21060h5), PorterDuff.Mode.MULTIPLY));
                nc0Var.v.invalidate();
                if (nc0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(nc0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20989d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!nc0Var.f39497a0) {
                            nc0Var.f39497a0 = true;
                            nc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = nc0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                nc0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (nc0Var.f39497a0) {
                        nc0Var.f39497a0 = false;
                        nc0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = nc0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            nc0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((cg0) this.f36472b).y1();
                return;
            case 23:
                ((mg0) this.f36472b).e0();
                return;
            case 24:
                hh0 hh0Var = (hh0) this.f36472b;
                org.telegram.ui.Components.im0 im0Var5 = hh0Var.f37624b;
                if (im0Var5 != null) {
                    int childCount12 = im0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = hh0Var.f37624b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.q90) {
                            ((org.telegram.ui.Components.q90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.l70 l70Var2 = hh0Var.f37637l0;
                if (l70Var2 != null) {
                    l70Var2.d();
                    return;
                }
                return;
            case 25:
                ti0 ti0Var = (ti0) this.f36472b;
                org.telegram.ui.Components.im0 im0Var6 = ti0Var.f41692f;
                if (im0Var6 != null) {
                    int childCount13 = im0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        ti0Var.d0(ti0Var.f41692f.getChildAt(i27));
                    }
                    int hiddenChildCount = ti0Var.f41692f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        ti0Var.d0(ti0Var.f41692f.V(i28));
                    }
                    int cachedChildCount = ti0Var.f41692f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        ti0Var.d0(ti0Var.f41692f.P(i29));
                    }
                    int attachedScrapChildCount = ti0Var.f41692f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        ti0Var.d0(ti0Var.f41692f.O(i30));
                    }
                    ti0Var.f41692f.getRecycledViewPool().a();
                }
                jg.f fVar2 = ti0Var.f41689c0;
                if (fVar2 != null) {
                    fVar2.f14427a = true;
                }
                View subtitleTextView = ti0Var.f41687b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Pi, ti0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f36472b;
                org.telegram.ui.Components.im0 im0Var7 = notificationsCustomSettingsActivity.f33199a;
                if (im0Var7 != null) {
                    int childCount14 = im0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f33199a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((ip0) this.f36472b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f36472b).u0();
                return;
            default:
                kx0 kx0Var = (kx0) this.f36472b;
                org.telegram.ui.Components.im0 im0Var8 = kx0Var.f38676a;
                if (im0Var8 != null) {
                    int childCount15 = im0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = kx0Var.f38676a.getChildAt(i32);
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
