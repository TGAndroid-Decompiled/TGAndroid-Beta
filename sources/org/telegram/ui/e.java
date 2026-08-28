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
public final class e implements org.telegram.ui.ActionBar.g6 {
    public final int f37762a;
    public final Object f37763b;

    public e(Object obj, int i9) {
        this.f37762a = i9;
        this.f37763b = obj;
    }

    @Override
    public final void a(float f10) {
        int i9 = this.f37762a;
    }

    @Override
    public final void b() {
        androidx.activity.o[] oVarArr;
        j4.c[] cVarArr;
        qg.b bVar;
        qg.a aVar;
        kg.d dVar;
        int i9;
        switch (this.f37762a) {
            case 0:
                ((h) this.f37763b).b0();
                return;
            case 1:
                xu xuVar = ((y6) this.f37763b).P;
                if (xuVar != null) {
                    xuVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
                    return;
                }
                return;
            case 2:
                i9.T((i9) this.f37763b);
                return;
            case 3:
                id idVar = (id) this.f37763b;
                LinearLayout linearLayout = idVar.H;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = idVar.H.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f24728n, nVar.f24727f);
                            nVar.f24723a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                qn qnVar = (qn) this.f37763b;
                xi xiVar = qnVar.f42113w;
                if (xiVar != null) {
                    xiVar.b();
                }
                xi xiVar2 = qnVar.f42126x;
                if (xiVar2 != null) {
                    xiVar2.b();
                }
                ak akVar = qnVar.U;
                if (akVar != null) {
                    akVar.d();
                }
                ih.u2 u2Var = qnVar.F1;
                if (u2Var != null) {
                    u2Var.c1();
                }
                ij ijVar = qnVar.f42077t0;
                if (ijVar != null) {
                    int childCount2 = ijVar.getChildCount();
                    for (int i11 = 0; i11 < childCount2; i11++) {
                        View childAt2 = qnVar.f42077t0.getChildAt(i11);
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                gh.f1 f1Var = qnVar.H3;
                if (f1Var != null) {
                    int childCount3 = f1Var.getChildCount();
                    for (int i12 = 0; i12 < childCount3; i12++) {
                        View childAt3 = qnVar.H3.getChildAt(i12);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).a0(0, true);
                        }
                    }
                }
                if (qnVar.O8 != null) {
                    int i13 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.g1[] g1VarArr = qnVar.O8;
                        if (i13 < g1VarArr.length) {
                            g1VarArr[i13].c(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.E8), qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.F8));
                            qnVar.O8[i13].setSelectorColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.I5));
                            i13++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.o1 o1Var = qnVar.M8;
                if (o1Var != null) {
                    View contentView = o1Var.getContentView();
                    contentView.setBackgroundColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.ef0 ef0Var = qnVar.f42105v2;
                if (ef0Var != null) {
                    ef0Var.d();
                }
                ck ckVar = qnVar.V;
                if (ckVar != null && ckVar.getEditView() != null) {
                    for (org.telegram.ui.Components.dd ddVar : qnVar.V.getEditView().f27468a) {
                        ddVar.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41878d0;
                if (w0Var != null) {
                    w0Var.N();
                }
                vj vjVar = qnVar.T1;
                if (vjVar != null) {
                    vjVar.p();
                }
                dj djVar = qnVar.W0;
                if (djVar != null) {
                    org.telegram.ui.ActionBar.b6 b6Var = djVar.W;
                    org.telegram.ui.Components.tv0 tv0Var = djVar.J;
                    if (tv0Var != null) {
                        tv0Var.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23214pa, b6Var));
                    }
                    Drawable drawable = djVar.m0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, b6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.i5 i5Var = djVar.f32729c0;
                    if (i5Var != null) {
                        i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, b6Var)));
                    }
                    org.telegram.ui.Components.i5 i5Var2 = djVar.f32727b0;
                    if (i5Var2 != null) {
                        i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, b6Var)));
                    }
                    Drawable drawable2 = djVar.f32742n0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, b6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = djVar.f32743o0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ah, b6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    djVar.invalidate();
                }
                im imVar = qnVar.T0;
                if (imVar != null) {
                    imVar.N();
                    fh.l2 l2Var = qnVar.T0.H;
                    if (l2Var != null) {
                        l2Var.invalidate();
                    }
                }
                org.telegram.ui.Components.sg sgVar = qnVar.I0;
                if (sgVar != null) {
                    kg.d dVar2 = sgVar.f32458s;
                    if (dVar2 != null) {
                        dVar2.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                    sgVar.invalidate();
                }
                org.telegram.ui.Components.ux0 ux0Var = qnVar.Z0;
                if (ux0Var != null) {
                    org.telegram.ui.ActionBar.b6 b6Var2 = ux0Var.f33159b;
                    Paint paint = ux0Var.K;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Be, b6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.f6.E4;
                    int i14 = org.telegram.ui.ActionBar.f6.Be;
                    int v02 = org.telegram.ui.ActionBar.f6.v0(i14, b6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.f6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i14, b6Var2), mode));
                }
                dj djVar2 = qnVar.W0;
                if (djVar2 != null && djVar2.getTimeItem() != null) {
                    qnVar.W0.getTimeItem().invalidate();
                }
                pg.f fVar = qnVar.O;
                if (fVar != null) {
                    fVar.f45872f.u();
                    fVar.h.u();
                    fVar.invalidate();
                }
                rg.g gVar = qnVar.f41905f1;
                if (gVar != null) {
                    for (j4.c cVar : gVar.f47199e) {
                        if (cVar != null && (aVar = (bVar = (qg.b) cVar.f13431b).f46265b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                fk fkVar = qnVar.K0;
                if (fkVar != null) {
                    for (androidx.activity.o oVar : fkVar.f47179a) {
                        if (oVar != null) {
                            ((qg.a) oVar.f388b).g();
                        }
                    }
                }
                Iterator it = qnVar.A.iterator();
                while (it.hasNext()) {
                    ((kg.d) it.next()).u();
                }
                qnVar.n9();
                return;
            case 5:
                ih.d4 d4Var = ((ho) this.f37763b).f38842e;
                if (d4Var != null) {
                    d4Var.invalidate();
                    return;
                }
                return;
            case 6:
                vo voVar = (vo) this.f37763b;
                LinearLayout linearLayout2 = voVar.f43548x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i15 = 0; i15 < childCount4; i15++) {
                        View childAt4 = voVar.f43548x.getChildAt(i15);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.f24728n, nVar2.f24727f);
                            nVar2.f24723a.invalidate();
                        }
                    }
                }
                voVar.C.f();
                org.telegram.ui.Components.a60 a60Var = voVar.f43540l0;
                if (a60Var != null) {
                    a60Var.a0();
                    return;
                }
                return;
            case 7:
                hp hpVar = (hp) this.f37763b;
                org.telegram.ui.Components.wk0 wk0Var = hpVar.f38882b;
                if (wk0Var != null) {
                    int childCount5 = wk0Var.getChildCount();
                    for (int i16 = 0; i16 < childCount5; i16++) {
                        View childAt5 = hpVar.f38882b.getChildAt(i16);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((op) this.f37763b).V();
                return;
            case 9:
                bq bqVar = (bq) this.f37763b;
                gh.f1 f1Var2 = bqVar.f36921b;
                if (f1Var2 != null) {
                    int childCount6 = f1Var2.getChildCount();
                    for (int i17 = 0; i17 < childCount6; i17++) {
                        View childAt6 = bqVar.f36921b.getChildAt(i17);
                        if (childAt6 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                jr jrVar = (jr) this.f37763b;
                gh.f1 f1Var3 = jrVar.f39563c;
                if (f1Var3 != null) {
                    int childCount7 = f1Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount7; i18++) {
                        View childAt7 = jrVar.f39563c.getChildAt(i18);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                is.V((is) this.f37763b);
                return;
            case 12:
                ContactsActivity.U((ContactsActivity) this.f37763b);
                return;
            case 13:
                n00 n00Var = (n00) this.f37763b;
                gh.f1 f1Var4 = n00Var.f40564a;
                if (f1Var4 != null) {
                    int childCount8 = f1Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount8; i19++) {
                        View childAt8 = n00Var.f40564a.getChildAt(i19);
                        if (childAt8 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ih.b3 b3Var = ((f10) this.f37763b).f38098i0;
                if (b3Var != null && (dVar = (kg.d) b3Var.f11260c) != null) {
                    dVar.u();
                    return;
                }
                return;
            case 15:
                ((x10) this.f37763b).u0();
                return;
            case 16:
                k60 k60Var = (k60) this.f37763b;
                org.telegram.ui.Components.wk0 wk0Var2 = k60Var.f39742n;
                if (wk0Var2 != null) {
                    int childCount9 = wk0Var2.getChildCount();
                    for (int i20 = 0; i20 < childCount9; i20++) {
                        View childAt9 = k60Var.f39742n.getChildAt(i20);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.m10 m10Var = k60Var.f39734f;
                if (m10Var != null) {
                    m10Var.d();
                }
                org.telegram.ui.Components.j10 j10Var = k60Var.f39751y;
                if (j10Var != null) {
                    j10Var.g();
                    return;
                }
                return;
            case 17:
                r60 r60Var = (r60) this.f37763b;
                org.telegram.ui.Components.wk0 wk0Var3 = r60Var.f42278b;
                if (wk0Var3 != null) {
                    int childCount10 = wk0Var3.getChildCount();
                    for (int i21 = 0; i21 < childCount10; i21++) {
                        View childAt10 = r60Var.f42278b.getChildAt(i21);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.j10 j10Var2 = r60Var.v;
                if (j10Var2 != null) {
                    j10Var2.g();
                    return;
                }
                return;
            case 18:
                ((i70) this.f37763b).U(true);
                return;
            case 19:
                q70 q70Var = (q70) this.f37763b;
                org.telegram.ui.Components.wk0 wk0Var4 = q70Var.h;
                if (wk0Var4 != null) {
                    int childCount11 = wk0Var4.getChildCount();
                    for (int i22 = 0; i22 < childCount11; i22++) {
                        View childAt11 = q70Var.h.getChildAt(i22);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                bb0 bb0Var = (bb0) this.f37763b;
                org.telegram.ui.Cells.b9 b9Var = bb0Var.C;
                if (b9Var != null) {
                    b9Var.getContext();
                    xa0 xa0Var = bb0Var.B;
                    int i23 = org.telegram.ui.ActionBar.f6.G6;
                    xa0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i23, false));
                    xa0 xa0Var2 = bb0Var.B;
                    int i24 = org.telegram.ui.ActionBar.f6.f23369y6;
                    xa0Var2.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i24, false));
                    bb0Var.f36816w.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i23, false));
                    bb0Var.f36816w.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i24, false));
                    org.telegram.ui.Cells.ba baVar = bb0Var.E;
                    if (baVar != null) {
                        baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23212p7, false));
                    }
                    bb0Var.I.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                    bb0Var.G.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i23, false));
                    bb0Var.G.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i24, false));
                    return;
                }
                return;
            case 21:
                pc0 pc0Var = (pc0) this.f37763b;
                pc0Var.d.setIconColor(pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.ui));
                pc0Var.d.B(pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
                pc0Var.d.G(pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.F8), true);
                pc0Var.d.G(pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.E8), false);
                pc0Var.f41465s.setColorFilter(new PorterDuffColorFilter(pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5), PorterDuff.Mode.MULTIPLY));
                pc0Var.v.invalidate();
                if (pc0Var.E != null) {
                    if (AndroidUtilities.computePerceivedBrightness(pc0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6)) < 0.721f) {
                        i9 = R.raw.mapstyle_night;
                    } else {
                        i9 = 0;
                    }
                    if (i9 != 0) {
                        if (!pc0Var.W) {
                            pc0Var.W = true;
                            pc0Var.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i9));
                            IMapsProvider.ICircle iCircle = pc0Var.K;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                pc0Var.K.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (pc0Var.W) {
                        pc0Var.W = false;
                        pc0Var.E.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = pc0Var.K;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            pc0Var.K.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((fg0) this.f37763b).y1();
                return;
            case 23:
                ((ng0) this.f37763b).d0();
                return;
            case 24:
                hh0 hh0Var = (hh0) this.f37763b;
                org.telegram.ui.Components.wk0 wk0Var5 = hh0Var.f38793b;
                if (wk0Var5 != null) {
                    int childCount12 = wk0Var5.getChildCount();
                    for (int i25 = 0; i25 < childCount12; i25++) {
                        View childAt12 = hh0Var.f38793b.getChildAt(i25);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.e80) {
                            ((org.telegram.ui.Components.e80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.a60 a60Var2 = hh0Var.f38803h0;
                if (a60Var2 != null) {
                    a60Var2.a0();
                    return;
                }
                return;
            case 25:
                ti0 ti0Var = (ti0) this.f37763b;
                org.telegram.ui.Components.wk0 wk0Var6 = ti0Var.f43015f;
                if (wk0Var6 != null) {
                    int childCount13 = wk0Var6.getChildCount();
                    for (int i26 = 0; i26 < childCount13; i26++) {
                        ti0Var.c0(ti0Var.f43015f.getChildAt(i26));
                    }
                    int hiddenChildCount = ti0Var.f43015f.getHiddenChildCount();
                    for (int i27 = 0; i27 < hiddenChildCount; i27++) {
                        ti0Var.c0(ti0Var.f43015f.V(i27));
                    }
                    int cachedChildCount = ti0Var.f43015f.getCachedChildCount();
                    for (int i28 = 0; i28 < cachedChildCount; i28++) {
                        ti0Var.c0(ti0Var.f43015f.P(i28));
                    }
                    int attachedScrapChildCount = ti0Var.f43015f.getAttachedScrapChildCount();
                    for (int i29 = 0; i29 < attachedScrapChildCount; i29++) {
                        ti0Var.c0(ti0Var.f43015f.O(i29));
                    }
                    ti0Var.f43015f.getRecycledViewPool().a();
                }
                qf.f fVar2 = ti0Var.Y;
                if (fVar2 != null) {
                    fVar2.f46174g = true;
                }
                View subtitleTextView = ti0Var.X.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
                    ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Pi, ti0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f37763b;
                org.telegram.ui.Components.wk0 wk0Var7 = notificationsCustomSettingsActivity.f35543a;
                if (wk0Var7 != null) {
                    int childCount14 = wk0Var7.getChildCount();
                    for (int i30 = 0; i30 < childCount14; i30++) {
                        View childAt13 = notificationsCustomSettingsActivity.f35543a.getChildAt(i30);
                        if (childAt13 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((zo0) this.f37763b).y0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f37763b).t0();
                return;
            default:
                cx0 cx0Var = (cx0) this.f37763b;
                org.telegram.ui.Components.wk0 wk0Var8 = cx0Var.f37339a;
                if (wk0Var8 != null) {
                    int childCount15 = wk0Var8.getChildCount();
                    for (int i31 = 0; i31 < childCount15; i31++) {
                        View childAt14 = cx0Var.f37339a.getChildAt(i31);
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
