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

public final class e implements org.telegram.ui.ActionBar.h6 {

    public final int f37575a;

    public final Object f37576b;

    public e(Object obj, int i10) {
        this.f37575a = i10;
        this.f37576b = obj;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f37575a;
    }

    @Override
    public final void b() {
        rg.b bVar;
        rg.a aVar;
        lg.d dVar;
        switch (this.f37575a) {
            case 0:
                ((h) this.f37576b).c0();
                break;
            case 1:
                av avVar = ((z6) this.f37576b).P;
                if (avVar != null) {
                    avVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                }
                break;
            case 2:
                j9.U((j9) this.f37576b);
                break;
            case 3:
                id idVar = (id) this.f37576b;
                LinearLayout linearLayout = idVar.H;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = idVar.H.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f24700n, nVar.f24699f);
                            nVar.f24695a.invalidate();
                        }
                    }
                }
                break;
            case 4:
                rn rnVar = (rn) this.f37576b;
                zi ziVar = rnVar.f42251w;
                if (ziVar != null) {
                    ziVar.b();
                }
                zi ziVar2 = rnVar.f42263x;
                if (ziVar2 != null) {
                    ziVar2.b();
                }
                ck ckVar = rnVar.U;
                if (ckVar != null) {
                    ckVar.d();
                }
                jh.t2 t2Var = rnVar.F1;
                if (t2Var != null) {
                    t2Var.c1();
                }
                kj kjVar = rnVar.f42213t0;
                if (kjVar != null) {
                    int childCount2 = kjVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = rnVar.f42213t0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                            ((org.telegram.ui.Cells.s1) childAt2).r1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            ((org.telegram.ui.Cells.v0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                hh.f1 f1Var = rnVar.H3;
                if (f1Var != null) {
                    int childCount3 = f1Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = rnVar.H3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.p2) {
                            ((org.telegram.ui.Cells.p2) childAt3).b0(0, true);
                        }
                    }
                }
                if (rnVar.O8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = rnVar.O8;
                        if (i13 < f1VarArr.length) {
                            f1VarArr[i13].c(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.E8), rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.F8));
                            rnVar.O8[i13].setSelectorColor(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = rnVar.M8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.if0 if0Var = rnVar.f42241v2;
                if (if0Var != null) {
                    if0Var.d();
                }
                ek ekVar = rnVar.V;
                if (ekVar != null && ekVar.getEditView() != null) {
                    for (org.telegram.ui.Components.ad adVar : rnVar.V.getEditView().f35221a) {
                        adVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = rnVar.f42013d0;
                if (v0Var != null) {
                    v0Var.N();
                }
                xj xjVar = rnVar.T1;
                if (xjVar != null) {
                    xjVar.p();
                }
                fj fjVar = rnVar.W0;
                if (fjVar != null) {
                    org.telegram.ui.ActionBar.c6 c6Var = fjVar.W;
                    org.telegram.ui.Components.vv0 vv0Var = fjVar.J;
                    if (vv0Var != null) {
                        vv0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23271pa, c6Var));
                    }
                    Drawable drawable = fjVar.m0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.i5 i5Var = fjVar.f32215c0;
                    if (i5Var != null) {
                        i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
                    }
                    org.telegram.ui.Components.i5 i5Var2 = fjVar.f32213b0;
                    if (i5Var2 != null) {
                        i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var)));
                    }
                    Drawable drawable2 = fjVar.f32228n0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = fjVar.f32229o0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    fjVar.invalidate();
                }
                jm jmVar = rnVar.T0;
                if (jmVar != null) {
                    jmVar.N();
                    ag.s0 s0Var = rnVar.T0.H;
                    if (s0Var != null) {
                        s0Var.invalidate();
                    }
                }
                org.telegram.ui.Components.og ogVar = rnVar.I0;
                if (ogVar != null) {
                    lg.d dVar2 = ogVar.f31277s;
                    if (dVar2 != null) {
                        dVar2.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                    ogVar.invalidate();
                }
                org.telegram.ui.Components.wx0 wx0Var = rnVar.Z0;
                if (wx0Var != null) {
                    org.telegram.ui.ActionBar.c6 c6Var2 = wx0Var.f34364b;
                    Paint paint = wx0Var.K;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Be, c6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.g6.E4;
                    int i14 = org.telegram.ui.ActionBar.g6.Be;
                    int iV0 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(iV0, mode));
                    org.telegram.ui.ActionBar.g6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, c6Var2), mode));
                }
                fj fjVar2 = rnVar.W0;
                if (fjVar2 != null && fjVar2.getTimeItem() != null) {
                    rnVar.W0.getTimeItem().invalidate();
                }
                qg.g gVar = rnVar.O;
                if (gVar != null) {
                    gVar.f46542f.u();
                    gVar.h.u();
                    gVar.invalidate();
                }
                sg.g gVar2 = rnVar.f42041f1;
                if (gVar2 != null) {
                    for (j9.a aVar2 : gVar2.f47920e) {
                        if (aVar2 != null && (aVar = (bVar = (rg.b) aVar2.f12863b).f47024b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                hk hkVar = rnVar.K0;
                if (hkVar != null) {
                    for (androidx.activity.n nVar2 : hkVar.f47900a) {
                        if (nVar2 != null) {
                            ((rg.a) nVar2.f894b).g();
                        }
                    }
                }
                Iterator it = rnVar.A.iterator();
                while (it.hasNext()) {
                    ((lg.d) it.next()).u();
                }
                rnVar.n9();
                break;
            case 5:
                jh.z3 z3Var = ((jo) this.f37576b).f39410e;
                if (z3Var != null) {
                    z3Var.invalidate();
                }
                break;
            case 6:
                xo xoVar = (xo) this.f37576b;
                LinearLayout linearLayout2 = xoVar.f44572x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = xoVar.f44572x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.f24700n, nVar3.f24699f);
                            nVar3.f24695a.invalidate();
                        }
                    }
                }
                xoVar.C.f();
                org.telegram.ui.Components.f60 f60Var = xoVar.f44564l0;
                if (f60Var != null) {
                    f60Var.b0();
                }
                break;
            case 7:
                jp jpVar = (jp) this.f37576b;
                org.telegram.ui.Components.zk0 zk0Var = jpVar.f39451b;
                if (zk0Var != null) {
                    int childCount5 = zk0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = jpVar.f39451b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.y4) {
                            ((org.telegram.ui.Cells.y4) childAt5).c(0);
                        }
                    }
                }
                break;
            case 8:
                ((qp) this.f37576b).W();
                break;
            case 9:
                dq dqVar = (dq) this.f37576b;
                hh.f1 f1Var2 = dqVar.f37492b;
                if (f1Var2 != null) {
                    int childCount6 = f1Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = dqVar.f37492b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ra) {
                            ((org.telegram.ui.Cells.ra) childAt6).b();
                        }
                    }
                }
                break;
            case 10:
                lr lrVar = (lr) this.f37576b;
                hh.f1 f1Var3 = lrVar.f40185c;
                if (f1Var3 != null) {
                    int childCount7 = f1Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = lrVar.f40185c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.y4) {
                            ((org.telegram.ui.Cells.y4) childAt7).c(0);
                        }
                    }
                }
                break;
            case 11:
                js.W((js) this.f37576b);
                break;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f37576b);
                break;
            case 13:
                q00 q00Var = (q00) this.f37576b;
                hh.f1 f1Var4 = q00Var.f41471a;
                if (f1Var4 != null) {
                    int childCount8 = f1Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = q00Var.f41471a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.sa) {
                            ((org.telegram.ui.Cells.sa) childAt8).j(0);
                        }
                    }
                }
                break;
            case 14:
                jh.a3 a3Var = ((i10) this.f37576b).f38947i0;
                if (a3Var != null && (dVar = (lg.d) a3Var.f13032c) != null) {
                    dVar.u();
                    break;
                }
                break;
            case 15:
                ((a20) this.f37576b).v0();
                break;
            case 16:
                o60 o60Var = (o60) this.f37576b;
                org.telegram.ui.Components.zk0 zk0Var2 = o60Var.f41010n;
                if (zk0Var2 != null) {
                    int childCount9 = zk0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = o60Var.f41010n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.p10 p10Var = o60Var.f41002f;
                if (p10Var != null) {
                    p10Var.d();
                }
                org.telegram.ui.Components.m10 m10Var = o60Var.f41019y;
                if (m10Var != null) {
                    m10Var.g();
                }
                break;
            case 17:
                u60 u60Var = (u60) this.f37576b;
                org.telegram.ui.Components.zk0 zk0Var3 = u60Var.f43134b;
                if (zk0Var3 != null) {
                    int childCount10 = zk0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = u60Var.f43134b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.m10 m10Var2 = u60Var.v;
                if (m10Var2 != null) {
                    m10Var2.g();
                }
                break;
            case 18:
                ((l70) this.f37576b).V(true);
                break;
            case 19:
                t70 t70Var = (t70) this.f37576b;
                org.telegram.ui.Components.zk0 zk0Var4 = t70Var.h;
                if (zk0Var4 != null) {
                    int childCount11 = zk0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = t70Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.m4) {
                            ((org.telegram.ui.Cells.m4) childAt11).a();
                        }
                    }
                }
                break;
            case 20:
                fb0 fb0Var = (fb0) this.f37576b;
                org.telegram.ui.Cells.x8 x8Var = fb0Var.C;
                if (x8Var != null) {
                    x8Var.getContext();
                    bb0 bb0Var = fb0Var.B;
                    int i23 = org.telegram.ui.ActionBar.g6.G6;
                    bb0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
                    bb0 bb0Var2 = fb0Var.B;
                    int i24 = org.telegram.ui.ActionBar.g6.f23423y6;
                    bb0Var2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    fb0Var.f38062w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
                    fb0Var.f38062w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                    org.telegram.ui.Cells.x9 x9Var = fb0Var.E;
                    if (x9Var != null) {
                        x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
                    }
                    fb0Var.I.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    fb0Var.G.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
                    fb0Var.G.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i24, false));
                }
                break;
            case 21:
                tc0 tc0Var = (tc0) this.f37576b;
                tc0Var.d.setIconColor(tc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ui));
                tc0Var.d.B(tc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                tc0Var.d.G(tc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true);
                tc0Var.d.G(tc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
                tc0Var.f42879s.setColorFilter(new PorterDuffColorFilter(tc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5), PorterDuff.Mode.MULTIPLY));
                tc0Var.v.invalidate();
                if (tc0Var.E != null) {
                    int i25 = AndroidUtilities.computePerceivedBrightness(tc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                    if (i25 != 0) {
                        if (!tc0Var.W) {
                            tc0Var.W = true;
                            tc0Var.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i25));
                            IMapsProvider.ICircle iCircle = tc0Var.K;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                tc0Var.K.setFillColor(553648127);
                            }
                        }
                    } else if (tc0Var.W) {
                        tc0Var.W = false;
                        tc0Var.E.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = tc0Var.K;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            tc0Var.K.setFillColor(536870912);
                        }
                    }
                }
                break;
            case 22:
                ((ig0) this.f37576b).y1();
                break;
            case 23:
                ((qg0) this.f37576b).e0();
                break;
            case 24:
                kh0 kh0Var = (kh0) this.f37576b;
                org.telegram.ui.Components.zk0 zk0Var5 = kh0Var.f39738b;
                if (zk0Var5 != null) {
                    int childCount12 = zk0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = kh0Var.f39738b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.y4) {
                            ((org.telegram.ui.Cells.y4) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.i80) {
                            ((org.telegram.ui.Components.i80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.f60 f60Var2 = kh0Var.f39748h0;
                if (f60Var2 != null) {
                    f60Var2.b0();
                }
                break;
            case 25:
                vi0 vi0Var = (vi0) this.f37576b;
                org.telegram.ui.Components.zk0 zk0Var6 = vi0Var.f43472f;
                if (zk0Var6 != null) {
                    int childCount13 = zk0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        vi0Var.d0(vi0Var.f43472f.getChildAt(i27));
                    }
                    int hiddenChildCount = vi0Var.f43472f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        vi0Var.d0(vi0Var.f43472f.V(i28));
                    }
                    int cachedChildCount = vi0Var.f43472f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        vi0Var.d0(vi0Var.f43472f.P(i29));
                    }
                    int attachedScrapChildCount = vi0Var.f43472f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        vi0Var.d0(vi0Var.f43472f.O(i30));
                    }
                    vi0Var.f43472f.getRecycledViewPool().a();
                }
                rf.f fVar = vi0Var.Y;
                if (fVar != null) {
                    fVar.f46933g = true;
                }
                View subtitleTextView = vi0Var.X.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
                    ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Pi, vi0Var.getResourceProvider()));
                }
                break;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f37576b;
                org.telegram.ui.Components.zk0 zk0Var7 = notificationsCustomSettingsActivity.f35546a;
                if (zk0Var7 != null) {
                    int childCount14 = zk0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f35546a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.sa) {
                            ((org.telegram.ui.Cells.sa) childAt13).j(0);
                        }
                    }
                }
                break;
            case 27:
                ((ap0) this.f37576b).z0();
                break;
            case 28:
                ((PremiumPreviewFragment) this.f37576b).u0();
                break;
            default:
                cx0 cx0Var = (cx0) this.f37576b;
                org.telegram.ui.Components.zk0 zk0Var8 = cx0Var.f37180a;
                if (zk0Var8 != null) {
                    int childCount15 = zk0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = cx0Var.f37180a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.y4) {
                            ((org.telegram.ui.Cells.y4) childAt14).c(0);
                        }
                    }
                }
                break;
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
