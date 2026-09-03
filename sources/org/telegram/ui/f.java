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
public final class f implements org.telegram.ui.ActionBar.k6 {
    public final int f33882a;
    public final Object f33883b;

    public f(Object obj, int i10) {
        this.f33882a = i10;
        this.f33883b = obj;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f33882a;
    }

    @Override
    public final void b() {
        androidx.activity.o[] oVarArr;
        s5.m[] mVarArr;
        vg.b bVar;
        vg.a aVar;
        pg.b bVar2;
        int i10;
        switch (this.f33882a) {
            case 0:
                ((i) this.f33883b).c0();
                return;
            case 1:
                iv ivVar = ((d7) this.f33883b).Q;
                if (ivVar != null) {
                    ivVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false));
                    return;
                }
                return;
            case 2:
                n9.U((n9) this.f33883b);
                return;
            case 3:
                pd pdVar = (pd) this.f33883b;
                LinearLayout linearLayout = pdVar.I;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = pdVar.I.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f21387n, nVar.f21386f);
                            nVar.f21383a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                zn znVar = (zn) this.f33883b;
                hj hjVar = znVar.f40785w;
                if (hjVar != null) {
                    hjVar.b();
                }
                hj hjVar2 = znVar.f40799x;
                if (hjVar2 != null) {
                    hjVar2.b();
                }
                lk lkVar = znVar.V;
                if (lkVar != null) {
                    lkVar.e();
                }
                nh.t2 t2Var = znVar.G1;
                if (t2Var != null) {
                    t2Var.c1();
                }
                sj sjVar = znVar.f40759u0;
                if (sjVar != null) {
                    int childCount2 = sjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = znVar.f40759u0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                            ((org.telegram.ui.Cells.s1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            ((org.telegram.ui.Cells.v0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                lh.e1 e1Var = znVar.I3;
                if (e1Var != null) {
                    int childCount3 = e1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = znVar.I3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.q2) {
                            ((org.telegram.ui.Cells.q2) childAt3).b0(0, true);
                        }
                    }
                }
                if (znVar.P8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.g1[] g1VarArr = znVar.P8;
                        if (i14 < g1VarArr.length) {
                            g1VarArr[i14].c(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), znVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8));
                            znVar.P8[i14].setSelectorColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = znVar.N8;
                if (p1Var != null) {
                    View contentView = p1Var.getContentView();
                    contentView.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.bg0 bg0Var = znVar.f40788w2;
                if (bg0Var != null) {
                    bg0Var.d();
                }
                nk nkVar = znVar.W;
                if (nkVar != null && nkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.ed edVar : znVar.W.getEditView().f24247a) {
                        edVar.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var = znVar.f40563e0;
                if (w0Var != null) {
                    w0Var.N();
                }
                fk fkVar = znVar.U1;
                if (fkVar != null) {
                    fkVar.p();
                }
                nj njVar = znVar.X0;
                if (njVar != null) {
                    org.telegram.ui.ActionBar.f6 f6Var = njVar.f31056a0;
                    org.telegram.ui.Components.mw0 mw0Var = njVar.K;
                    if (mw0Var != null) {
                        mw0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20100pa, f6Var));
                    }
                    Drawable drawable = njVar.f31072n0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.j5 j5Var = njVar.f31061d0;
                    if (j5Var != null) {
                        j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
                    }
                    org.telegram.ui.Components.j5 j5Var2 = njVar.f31060c0;
                    if (j5Var2 != null) {
                        j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var)));
                    }
                    Drawable drawable2 = njVar.f31073o0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = njVar.f31074p0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    njVar.invalidate();
                }
                rm rmVar = znVar.U0;
                if (rmVar != null) {
                    rmVar.N();
                    eg.h0 h0Var = znVar.U0.I;
                    if (h0Var != null) {
                        h0Var.invalidate();
                    }
                }
                org.telegram.ui.Components.sg sgVar = znVar.J0;
                if (sgVar != null) {
                    pg.b bVar3 = sgVar.f28737s;
                    if (bVar3 != null) {
                        bVar3.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                    sgVar.invalidate();
                }
                org.telegram.ui.Components.qy0 qy0Var = znVar.f40512a1;
                if (qy0Var != null) {
                    org.telegram.ui.ActionBar.f6 f6Var2 = qy0Var.f28319b;
                    Paint paint = qy0Var.L;
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
                nj njVar2 = znVar.X0;
                if (njVar2 != null && njVar2.getTimeItem() != null) {
                    znVar.X0.getTimeItem().invalidate();
                }
                ug.f fVar = znVar.P;
                if (fVar != null) {
                    fVar.f45585f.u();
                    fVar.h.u();
                    fVar.invalidate();
                }
                wg.g gVar = znVar.f40589g1;
                if (gVar != null) {
                    for (s5.m mVar : gVar.e) {
                        if (mVar != null && (aVar = (bVar = (vg.b) mVar.f44153b).f45849b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                qk qkVar = znVar.L0;
                if (qkVar != null) {
                    for (androidx.activity.o oVar : qkVar.f46623a) {
                        if (oVar != null) {
                            ((vg.a) oVar.f333b).g();
                        }
                    }
                }
                Iterator it = znVar.B.iterator();
                while (it.hasNext()) {
                    ((pg.b) it.next()).u();
                }
                znVar.n9();
                return;
            case 5:
                nh.y3 y3Var = ((ro) this.f33883b).e;
                if (y3Var != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
            case 6:
                fp fpVar = (fp) this.f33883b;
                LinearLayout linearLayout2 = fpVar.f34201x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = fpVar.f34201x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.f21387n, nVar2.f21386f);
                            nVar2.f21383a.invalidate();
                        }
                    }
                }
                fpVar.D.f();
                org.telegram.ui.Components.t60 t60Var = fpVar.m0;
                if (t60Var != null) {
                    t60Var.b0();
                    return;
                }
                return;
            case 7:
                sp spVar = (sp) this.f33883b;
                org.telegram.ui.Components.rl0 rl0Var = spVar.f38282b;
                if (rl0Var != null) {
                    int childCount5 = rl0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = spVar.f38282b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((zp) this.f33883b).W();
                return;
            case 9:
                lq lqVar = (lq) this.f33883b;
                lh.e1 e1Var2 = lqVar.f35865b;
                if (e1Var2 != null) {
                    int childCount6 = e1Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = lqVar.f35865b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ta) {
                            ((org.telegram.ui.Cells.ta) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                rr rrVar = (rr) this.f33883b;
                lh.e1 e1Var3 = rrVar.f37961c;
                if (e1Var3 != null) {
                    int childCount7 = e1Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = rrVar.f37961c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ps.W((ps) this.f33883b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f33883b);
                return;
            case 13:
                c10 c10Var = (c10) this.f33883b;
                lh.e1 e1Var4 = c10Var.f32976a;
                if (e1Var4 != null) {
                    int childCount8 = e1Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = c10Var.f32976a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                nh.a3 a3Var = ((u10) this.f33883b).f38651j0;
                if (a3Var != null && (bVar2 = (pg.b) a3Var.f15031c) != null) {
                    bVar2.u();
                    return;
                }
                return;
            case 15:
                ((n20) this.f33883b).v0();
                return;
            case 16:
                a70 a70Var = (a70) this.f33883b;
                org.telegram.ui.Components.rl0 rl0Var2 = a70Var.f32499n;
                if (rl0Var2 != null) {
                    int childCount9 = rl0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = a70Var.f32499n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.d20 d20Var = a70Var.f32491f;
                if (d20Var != null) {
                    d20Var.e();
                }
                org.telegram.ui.Components.a20 a20Var = a70Var.f32509y;
                if (a20Var != null) {
                    a20Var.g();
                    return;
                }
                return;
            case 17:
                g70 g70Var = (g70) this.f33883b;
                org.telegram.ui.Components.rl0 rl0Var3 = g70Var.f34341b;
                if (rl0Var3 != null) {
                    int childCount10 = rl0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = g70Var.f34341b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.a20 a20Var2 = g70Var.v;
                if (a20Var2 != null) {
                    a20Var2.g();
                    return;
                }
                return;
            case 18:
                ((w70) this.f33883b).V(true);
                return;
            case 19:
                e80 e80Var = (e80) this.f33883b;
                org.telegram.ui.Components.rl0 rl0Var4 = e80Var.h;
                if (rl0Var4 != null) {
                    int childCount11 = rl0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = e80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.o4) {
                            ((org.telegram.ui.Cells.o4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                pb0 pb0Var = (pb0) this.f33883b;
                org.telegram.ui.Cells.z8 z8Var = pb0Var.D;
                if (z8Var != null) {
                    z8Var.getContext();
                    lb0 lb0Var = pb0Var.C;
                    int i24 = org.telegram.ui.ActionBar.j6.G6;
                    lb0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    lb0 lb0Var2 = pb0Var.C;
                    int i25 = org.telegram.ui.ActionBar.j6.f20256y6;
                    lb0Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    pb0Var.f37067w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    pb0Var.f37067w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    org.telegram.ui.Cells.z9 z9Var = pb0Var.F;
                    if (z9Var != null) {
                        z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false));
                    }
                    pb0Var.J.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    pb0Var.H.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    pb0Var.H.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                cd0 cd0Var = (cd0) this.f33883b;
                cd0Var.d.setIconColor(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ui));
                cd0Var.d.B(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                cd0Var.d.G(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
                cd0Var.d.G(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
                cd0Var.f33106s.setColorFilter(new PorterDuffColorFilter(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5), PorterDuff.Mode.MULTIPLY));
                cd0Var.v.invalidate();
                if (cd0Var.F != null) {
                    if (AndroidUtilities.computePerceivedBrightness(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!cd0Var.X) {
                            cd0Var.X = true;
                            cd0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = cd0Var.L;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                cd0Var.L.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (cd0Var.X) {
                        cd0Var.X = false;
                        cd0Var.F.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = cd0Var.L;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            cd0Var.L.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((pg0) this.f33883b).y1();
                return;
            case 23:
                ((xg0) this.f33883b).e0();
                return;
            case 24:
                rh0 rh0Var = (rh0) this.f33883b;
                org.telegram.ui.Components.rl0 rl0Var5 = rh0Var.f37844b;
                if (rl0Var5 != null) {
                    int childCount12 = rl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = rh0Var.f37844b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.x80) {
                            ((org.telegram.ui.Components.x80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.t60 t60Var2 = rh0Var.f37854i0;
                if (t60Var2 != null) {
                    t60Var2.b0();
                    return;
                }
                return;
            case 25:
                cj0 cj0Var = (cj0) this.f33883b;
                org.telegram.ui.Components.rl0 rl0Var6 = cj0Var.f33172f;
                if (rl0Var6 != null) {
                    int childCount13 = rl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        cj0Var.d0(cj0Var.f33172f.getChildAt(i27));
                    }
                    int hiddenChildCount = cj0Var.f33172f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        cj0Var.d0(cj0Var.f33172f.V(i28));
                    }
                    int cachedChildCount = cj0Var.f33172f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        cj0Var.d0(cj0Var.f33172f.P(i29));
                    }
                    int attachedScrapChildCount = cj0Var.f33172f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        cj0Var.d0(cj0Var.f33172f.O(i30));
                    }
                    cj0Var.f33172f.getRecycledViewPool().a();
                }
                vf.f fVar2 = cj0Var.Z;
                if (fVar2 != null) {
                    fVar2.f45763g = true;
                }
                View subtitleTextView = cj0Var.Y.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.k5) {
                    ((org.telegram.ui.ActionBar.k5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, cj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f33883b;
                org.telegram.ui.Components.rl0 rl0Var7 = notificationsCustomSettingsActivity.f31636a;
                if (rl0Var7 != null) {
                    int childCount14 = rl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f31636a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((np0) this.f33883b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f33883b).u0();
                return;
            default:
                tx0 tx0Var = (tx0) this.f33883b;
                org.telegram.ui.Components.rl0 rl0Var8 = tx0Var.f38603a;
                if (rl0Var8 != null) {
                    int childCount15 = rl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = tx0Var.f38603a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.a5) {
                            ((org.telegram.ui.Cells.a5) childAt14).c(0);
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
