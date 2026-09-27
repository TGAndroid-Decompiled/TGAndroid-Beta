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
    public final int f33069a;
    public final Object f33070b;

    public e(Object obj, int i10) {
        this.f33069a = i10;
        this.f33070b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f33069a;
    }

    @Override
    public final void b() {
        androidx.activity.n[] nVarArr;
        aa.a[] aVarArr;
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        int i10;
        switch (this.f33069a) {
            case 0:
                ((h) this.f33070b).c0();
                return;
            case 1:
                hv hvVar = ((b7) this.f33070b).X;
                if (hvVar != null) {
                    hvVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19128h5, false));
                    return;
                }
                return;
            case 2:
                n9.U((n9) this.f33070b);
                return;
            case 3:
                nd ndVar = (nd) this.f33070b;
                LinearLayout linearLayout = ndVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ndVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f20663n, nVar.f20662f);
                            nVar.f20659a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                xn xnVar = (xn) this.f33070b;
                ij ijVar = xnVar.f39963w;
                if (ijVar != null) {
                    ijVar.d();
                }
                ij ijVar2 = xnVar.f39976x;
                if (ijVar2 != null) {
                    ijVar2.d();
                }
                lk lkVar = xnVar.Y;
                if (lkVar != null) {
                    lkVar.e();
                }
                ai.g4 g4Var = xnVar.J1;
                if (g4Var != null) {
                    g4Var.a1();
                }
                tj tjVar = xnVar.f39977x0;
                if (tjVar != null) {
                    int childCount2 = tjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = xnVar.f39977x0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.w0 w0Var = xnVar.L3;
                if (w0Var != null) {
                    int childCount3 = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = xnVar.L3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
                if (xnVar.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.g1[] g1VarArr = xnVar.S8;
                        if (i14 < g1VarArr.length) {
                            g1VarArr[i14].c(xnVar.getThemedColor(org.telegram.ui.ActionBar.i6.E8), xnVar.getThemedColor(org.telegram.ui.ActionBar.i6.F8));
                            xnVar.S8[i14].setSelectorColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.o1 o1Var = xnVar.Q8;
                if (o1Var != null) {
                    View contentView = o1Var.getContentView();
                    contentView.setBackgroundColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.gg0 gg0Var = xnVar.f40004z2;
                if (gg0Var != null) {
                    gg0Var.d();
                }
                nk nkVar = xnVar.Z;
                if (nkVar != null && nkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.od odVar : xnVar.Z.getEditView().f26808a) {
                        odVar.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.f39777h0;
                if (w0Var2 != null) {
                    w0Var2.N();
                }
                gk gkVar = xnVar.X1;
                if (gkVar != null) {
                    gkVar.q();
                }
                oj ojVar = xnVar.f39690a1;
                if (ojVar != null) {
                    org.telegram.ui.ActionBar.e6 e6Var = ojVar.f24611d0;
                    org.telegram.ui.Components.yw0 yw0Var = ojVar.N;
                    if (yw0Var != null) {
                        yw0Var.b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19281pa, e6Var));
                    }
                    Drawable drawable = ojVar.f24625q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19472zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.o5 o5Var = ojVar.f24615g0;
                    if (o5Var != null) {
                        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19472zh, e6Var)));
                    }
                    org.telegram.ui.Components.o5 o5Var2 = ojVar.f24614f0;
                    if (o5Var2 != null) {
                        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19472zh, e6Var)));
                    }
                    Drawable drawable2 = ojVar.f24627r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19472zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = ojVar.f24629s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Ah, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    ojVar.invalidate();
                }
                qm qmVar = xnVar.X0;
                if (qmVar != null) {
                    qmVar.N();
                    ci.ab abVar = xnVar.X0.L;
                    if (abVar != null) {
                        abVar.invalidate();
                    }
                }
                org.telegram.ui.Components.dh dhVar = xnVar.M0;
                if (dhVar != null) {
                    ch.d dVar2 = dhVar.f23658s;
                    if (dVar2 != null) {
                        dVar2.g();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
                    dhVar.invalidate();
                }
                org.telegram.ui.Components.zy0 zy0Var = xnVar.f39729d1;
                if (zy0Var != null) {
                    org.telegram.ui.ActionBar.e6 e6Var2 = zy0Var.f31002b;
                    Paint paint = zy0Var.O;
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
                oj ojVar2 = xnVar.f39690a1;
                if (ojVar2 != null && ojVar2.getTimeItem() != null) {
                    xnVar.f39690a1.getTimeItem().invalidate();
                }
                hh.g gVar = xnVar.S;
                if (gVar != null) {
                    gVar.f10515f.g();
                    gVar.h.g();
                    gVar.invalidate();
                }
                jh.h hVar = xnVar.f39803j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.f359b).f11190b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                qk qkVar = xnVar.O0;
                if (qkVar != null) {
                    for (androidx.activity.n nVar2 : qkVar.f13010a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.f1903c).g();
                        }
                    }
                }
                Iterator it = xnVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).g();
                }
                xnVar.n9();
                return;
            case 5:
                ai.y5 y5Var = ((so) this.f33070b).e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    return;
                }
                return;
            case 6:
                gp gpVar = (gp) this.f33070b;
                LinearLayout linearLayout2 = gpVar.f34012x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = gpVar.f34012x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.f20663n, nVar3.f20662f);
                            nVar3.f20659a.invalidate();
                        }
                    }
                }
                gpVar.G.f();
                org.telegram.ui.Components.e70 e70Var = gpVar.f34004p0;
                if (e70Var != null) {
                    e70Var.b0();
                    return;
                }
                return;
            case 7:
                sp spVar = (sp) this.f33070b;
                org.telegram.ui.Components.yl0 yl0Var = spVar.f37541b;
                if (yl0Var != null) {
                    int childCount5 = yl0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = spVar.f37541b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((zp) this.f33070b).W();
                return;
            case 9:
                lq lqVar = (lq) this.f33070b;
                ai.w0 w0Var3 = lqVar.f35405b;
                if (w0Var3 != null) {
                    int childCount6 = w0Var3.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = lqVar.f35405b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                qr qrVar = (qr) this.f33070b;
                ai.w0 w0Var4 = qrVar.f36823c;
                if (w0Var4 != null) {
                    int childCount7 = w0Var4.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = qrVar.f36823c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ps.W((ps) this.f33070b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f33070b);
                return;
            case 13:
                e10 e10Var = (e10) this.f33070b;
                ai.w0 w0Var5 = e10Var.f33088a;
                if (w0Var5 != null) {
                    int childCount8 = w0Var5.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = e10Var.f33088a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ai.n4 n4Var = ((w10) this.f33070b).m0;
                if (n4Var != null && (dVar = (ch.d) n4Var.f1296c) != null) {
                    dVar.g();
                    return;
                }
                return;
            case 15:
                ((p20) this.f33070b).v0();
                return;
            case 16:
                c70 c70Var = (c70) this.f33070b;
                org.telegram.ui.Components.yl0 yl0Var2 = c70Var.f32551n;
                if (yl0Var2 != null) {
                    int childCount9 = yl0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = c70Var.f32551n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.e20 e20Var = c70Var.f32543f;
                if (e20Var != null) {
                    e20Var.e();
                }
                org.telegram.ui.Components.b20 b20Var = c70Var.f32564y;
                if (b20Var != null) {
                    b20Var.g();
                    return;
                }
                return;
            case 17:
                j70 j70Var = (j70) this.f33070b;
                org.telegram.ui.Components.yl0 yl0Var3 = j70Var.f34645b;
                if (yl0Var3 != null) {
                    int childCount10 = yl0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = j70Var.f34645b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.b20 b20Var2 = j70Var.v;
                if (b20Var2 != null) {
                    b20Var2.g();
                    return;
                }
                return;
            case 18:
                ((b80) this.f33070b).V(true);
                return;
            case 19:
                j80 j80Var = (j80) this.f33070b;
                org.telegram.ui.Components.yl0 yl0Var4 = j80Var.h;
                if (yl0Var4 != null) {
                    int childCount11 = yl0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = j80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                ub0 ub0Var = (ub0) this.f33070b;
                org.telegram.ui.Cells.e9 e9Var = ub0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    qb0 qb0Var = ub0Var.F;
                    int i24 = org.telegram.ui.ActionBar.i6.G6;
                    qb0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    qb0 qb0Var2 = ub0Var.F;
                    int i25 = org.telegram.ui.ActionBar.i6.f19442y6;
                    qb0Var2.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i25, false));
                    ub0Var.f38200w.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    ub0Var.f38200w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i25, false));
                    org.telegram.ui.Cells.ea eaVar = ub0Var.I;
                    if (eaVar != null) {
                        eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19278p7, false));
                    }
                    ub0Var.M.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    ub0Var.K.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i24, false));
                    ub0Var.K.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                fd0 fd0Var = (fd0) this.f33070b;
                fd0Var.d.setIconColor(fd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ui));
                fd0Var.d.B(fd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                fd0Var.d.G(fd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.F8), true);
                fd0Var.d.G(fd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false);
                fd0Var.f33509s.setColorFilter(new PorterDuffColorFilter(fd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19128h5), PorterDuff.Mode.MULTIPLY));
                fd0Var.v.invalidate();
                if (fd0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(fd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!fd0Var.f33487a0) {
                            fd0Var.f33487a0 = true;
                            fd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = fd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                fd0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (fd0Var.f33487a0) {
                        fd0Var.f33487a0 = false;
                        fd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = fd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            fd0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((tg0) this.f33070b).y1();
                return;
            case 23:
                ((bh0) this.f33070b).e0();
                return;
            case 24:
                vh0 vh0Var = (vh0) this.f33070b;
                org.telegram.ui.Components.yl0 yl0Var5 = vh0Var.f38584b;
                if (yl0Var5 != null) {
                    int childCount12 = yl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = vh0Var.f38584b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.i90) {
                            ((org.telegram.ui.Components.i90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.e70 e70Var2 = vh0Var.f38597l0;
                if (e70Var2 != null) {
                    e70Var2.b0();
                    return;
                }
                return;
            case 25:
                gj0 gj0Var = (gj0) this.f33070b;
                org.telegram.ui.Components.yl0 yl0Var6 = gj0Var.f33962f;
                if (yl0Var6 != null) {
                    int childCount13 = yl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        gj0Var.d0(gj0Var.f33962f.getChildAt(i27));
                    }
                    int hiddenChildCount = gj0Var.f33962f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        gj0Var.d0(gj0Var.f33962f.W(i28));
                    }
                    int cachedChildCount = gj0Var.f33962f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        gj0Var.d0(gj0Var.f33962f.Q(i29));
                    }
                    int attachedScrapChildCount = gj0Var.f33962f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        gj0Var.d0(gj0Var.f33962f.P(i30));
                    }
                    gj0Var.f33962f.getRecycledViewPool().a();
                }
                ig.f fVar = gj0Var.f33959c0;
                if (fVar != null) {
                    fVar.f11104g = true;
                }
                View subtitleTextView = gj0Var.f33957b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Pi, gj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f33070b;
                org.telegram.ui.Components.yl0 yl0Var7 = notificationsCustomSettingsActivity.f31152a;
                if (yl0Var7 != null) {
                    int childCount14 = yl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f31152a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((wp0) this.f33070b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f33070b).u0();
                return;
            default:
                ay0 ay0Var = (ay0) this.f33070b;
                org.telegram.ui.Components.yl0 yl0Var8 = ay0Var.f32174a;
                if (yl0Var8 != null) {
                    int childCount15 = yl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = ay0Var.f32174a.getChildAt(i32);
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
