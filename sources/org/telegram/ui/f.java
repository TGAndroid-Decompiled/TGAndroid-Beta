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
public final class f implements org.telegram.ui.ActionBar.l6 {
    public final int f36712a;
    public final Object f36713b;

    public f(Object obj, int i10) {
        this.f36712a = i10;
        this.f36713b = obj;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f36712a;
    }

    @Override
    public final void b() {
        androidx.activity.o[] oVarArr;
        s5.m[] mVarArr;
        wg.b bVar;
        wg.a aVar;
        qg.b bVar2;
        int i10;
        switch (this.f36712a) {
            case 0:
                ((i) this.f36713b).c0();
                return;
            case 1:
                hv hvVar = ((b7) this.f36713b).Q;
                if (hvVar != null) {
                    hvVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21731h5, false));
                    return;
                }
                return;
            case 2:
                l9.U((l9) this.f36713b);
                return;
            case 3:
                nd ndVar = (nd) this.f36713b;
                LinearLayout linearLayout = ndVar.I;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ndVar.I.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f23187n, nVar.f23186f);
                            nVar.f23182a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                xn xnVar = (xn) this.f36713b;
                fj fjVar = xnVar.f43388w;
                if (fjVar != null) {
                    fjVar.b();
                }
                fj fjVar2 = xnVar.f43402x;
                if (fjVar2 != null) {
                    fjVar2.b();
                }
                jk jkVar = xnVar.V;
                if (jkVar != null) {
                    jkVar.e();
                }
                oh.u2 u2Var = xnVar.G1;
                if (u2Var != null) {
                    u2Var.c1();
                }
                qj qjVar = xnVar.f43362u0;
                if (qjVar != null) {
                    int childCount2 = qjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = xnVar.f43362u0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            ((org.telegram.ui.Cells.v0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                mh.d1 d1Var = xnVar.I3;
                if (d1Var != null) {
                    int childCount3 = d1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = xnVar.I3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (xnVar.P8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.g1[] g1VarArr = xnVar.P8;
                        if (i14 < g1VarArr.length) {
                            g1VarArr[i14].c(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.E8), xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.F8));
                            xnVar.P8[i14].setSelectorColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
                if (p1Var != null) {
                    View contentView = p1Var.getContentView();
                    contentView.setBackgroundColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.cg0 cg0Var = xnVar.f43391w2;
                if (cg0Var != null) {
                    cg0Var.d();
                }
                lk lkVar = xnVar.W;
                if (lkVar != null && lkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.ed edVar : xnVar.W.getEditView().f26256a) {
                        edVar.d();
                    }
                }
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.f43166e0;
                if (w0Var != null) {
                    w0Var.N();
                }
                dk dkVar = xnVar.U1;
                if (dkVar != null) {
                    dkVar.p();
                }
                lj ljVar = xnVar.X0;
                if (ljVar != null) {
                    org.telegram.ui.ActionBar.g6 g6Var = ljVar.f25662a0;
                    org.telegram.ui.Components.nw0 nw0Var = ljVar.K;
                    if (nw0Var != null) {
                        nw0Var.b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21879pa, g6Var));
                    }
                    Drawable drawable = ljVar.f25679n0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, g6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.j5 j5Var = ljVar.f25667d0;
                    if (j5Var != null) {
                        j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, g6Var)));
                    }
                    org.telegram.ui.Components.j5 j5Var2 = ljVar.f25666c0;
                    if (j5Var2 != null) {
                        j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, g6Var)));
                    }
                    Drawable drawable2 = ljVar.f25680o0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, g6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = ljVar.f25681p0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ah, g6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    ljVar.invalidate();
                }
                pm pmVar = xnVar.U0;
                if (pmVar != null) {
                    pmVar.N();
                    fg.h0 h0Var = xnVar.U0.I;
                    if (h0Var != null) {
                        h0Var.invalidate();
                    }
                }
                org.telegram.ui.Components.sg sgVar = xnVar.J0;
                if (sgVar != null) {
                    qg.b bVar3 = sgVar.f31055s;
                    if (bVar3 != null) {
                        bVar3.u();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                    sgVar.invalidate();
                }
                org.telegram.ui.Components.ry0 ry0Var = xnVar.f43114a1;
                if (ry0Var != null) {
                    org.telegram.ui.ActionBar.g6 g6Var2 = ry0Var.f30899b;
                    Paint paint = ry0Var.L;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Be, g6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.k6.E4;
                    int i15 = org.telegram.ui.ActionBar.k6.Be;
                    int v02 = org.telegram.ui.ActionBar.k6.v0(i15, g6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.k6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i15, g6Var2), mode));
                }
                lj ljVar2 = xnVar.X0;
                if (ljVar2 != null && ljVar2.getTimeItem() != null) {
                    xnVar.X0.getTimeItem().invalidate();
                }
                vg.f fVar = xnVar.P;
                if (fVar != null) {
                    fVar.f49287f.u();
                    fVar.h.u();
                    fVar.invalidate();
                }
                xg.g gVar = xnVar.f43192g1;
                if (gVar != null) {
                    for (s5.m mVar : gVar.f50585e) {
                        if (mVar != null && (aVar = (bVar = (wg.b) mVar.f47062b).f49612b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                ok okVar = xnVar.L0;
                if (okVar != null) {
                    for (androidx.activity.o oVar : okVar.f50565a) {
                        if (oVar != null) {
                            ((wg.a) oVar.f356b).g();
                        }
                    }
                }
                Iterator it = xnVar.B.iterator();
                while (it.hasNext()) {
                    ((qg.b) it.next()).u();
                }
                xnVar.n9();
                return;
            case 5:
                oh.a4 a4Var = ((po) this.f36713b).f40101e;
                if (a4Var != null) {
                    a4Var.invalidate();
                    return;
                }
                return;
            case 6:
                ep epVar = (ep) this.f36713b;
                LinearLayout linearLayout2 = epVar.f36654x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = epVar.f36654x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.f23187n, nVar2.f23186f);
                            nVar2.f23182a.invalidate();
                        }
                    }
                }
                epVar.D.f();
                org.telegram.ui.Components.u60 u60Var = epVar.m0;
                if (u60Var != null) {
                    u60Var.b0();
                    return;
                }
                return;
            case 7:
                rp rpVar = (rp) this.f36713b;
                org.telegram.ui.Components.tl0 tl0Var = rpVar.f41014b;
                if (tl0Var != null) {
                    int childCount5 = tl0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = rpVar.f41014b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((yp) this.f36713b).W();
                return;
            case 9:
                kq kqVar = (kq) this.f36713b;
                mh.d1 d1Var2 = kqVar.f38457b;
                if (d1Var2 != null) {
                    int childCount6 = d1Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = kqVar.f38457b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ua) {
                            ((org.telegram.ui.Cells.ua) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                qr qrVar = (qr) this.f36713b;
                mh.d1 d1Var3 = qrVar.f40605c;
                if (d1Var3 != null) {
                    int childCount7 = d1Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = qrVar.f40605c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                os.W((os) this.f36713b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f36713b);
                return;
            case 13:
                b10 b10Var = (b10) this.f36713b;
                mh.d1 d1Var4 = b10Var.f35289a;
                if (d1Var4 != null) {
                    int childCount8 = d1Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = b10Var.f35289a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                oh.b3 b3Var = ((t10) this.f36713b).f41439j0;
                if (b3Var != null && (bVar2 = (qg.b) b3Var.f16885c) != null) {
                    bVar2.u();
                    return;
                }
                return;
            case 15:
                ((m20) this.f36713b).v0();
                return;
            case 16:
                z60 z60Var = (z60) this.f36713b;
                org.telegram.ui.Components.tl0 tl0Var2 = z60Var.f43841n;
                if (tl0Var2 != null) {
                    int childCount9 = tl0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = z60Var.f43841n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.d20 d20Var = z60Var.f43833f;
                if (d20Var != null) {
                    d20Var.e();
                }
                org.telegram.ui.Components.a20 a20Var = z60Var.f43851y;
                if (a20Var != null) {
                    a20Var.g();
                    return;
                }
                return;
            case 17:
                f70 f70Var = (f70) this.f36713b;
                org.telegram.ui.Components.tl0 tl0Var3 = f70Var.f36772b;
                if (tl0Var3 != null) {
                    int childCount10 = tl0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = f70Var.f36772b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.a20 a20Var2 = f70Var.v;
                if (a20Var2 != null) {
                    a20Var2.g();
                    return;
                }
                return;
            case 18:
                ((v70) this.f36713b).V(true);
                return;
            case 19:
                d80 d80Var = (d80) this.f36713b;
                org.telegram.ui.Components.tl0 tl0Var4 = d80Var.h;
                if (tl0Var4 != null) {
                    int childCount11 = tl0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = d80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                ob0 ob0Var = (ob0) this.f36713b;
                org.telegram.ui.Cells.a9 a9Var = ob0Var.D;
                if (a9Var != null) {
                    a9Var.getContext();
                    kb0 kb0Var = ob0Var.C;
                    int i24 = org.telegram.ui.ActionBar.k6.G6;
                    kb0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false));
                    kb0 kb0Var2 = ob0Var.C;
                    int i25 = org.telegram.ui.ActionBar.k6.f22036y6;
                    kb0Var2.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i25, false));
                    ob0Var.f39711w.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false));
                    ob0Var.f39711w.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i25, false));
                    org.telegram.ui.Cells.aa aaVar = ob0Var.F;
                    if (aaVar != null) {
                        aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
                    }
                    ob0Var.J.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
                    ob0Var.H.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false));
                    ob0Var.H.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                bd0 bd0Var = (bd0) this.f36713b;
                bd0Var.d.setIconColor(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.ui));
                bd0Var.d.B(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                bd0Var.d.G(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.F8), true);
                bd0Var.d.G(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.E8), false);
                bd0Var.f35476s.setColorFilter(new PorterDuffColorFilter(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5), PorterDuff.Mode.MULTIPLY));
                bd0Var.v.invalidate();
                if (bd0Var.F != null) {
                    if (AndroidUtilities.computePerceivedBrightness(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!bd0Var.X) {
                            bd0Var.X = true;
                            bd0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = bd0Var.L;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                bd0Var.L.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (bd0Var.X) {
                        bd0Var.X = false;
                        bd0Var.F.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = bd0Var.L;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            bd0Var.L.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((og0) this.f36713b).y1();
                return;
            case 23:
                ((wg0) this.f36713b).e0();
                return;
            case 24:
                qh0 qh0Var = (qh0) this.f36713b;
                org.telegram.ui.Components.tl0 tl0Var5 = qh0Var.f40502b;
                if (tl0Var5 != null) {
                    int childCount12 = tl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = qh0Var.f40502b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.y80) {
                            ((org.telegram.ui.Components.y80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.u60 u60Var2 = qh0Var.f40513i0;
                if (u60Var2 != null) {
                    u60Var2.b0();
                    return;
                }
                return;
            case 25:
                bj0 bj0Var = (bj0) this.f36713b;
                org.telegram.ui.Components.tl0 tl0Var6 = bj0Var.f35542f;
                if (tl0Var6 != null) {
                    int childCount13 = tl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        bj0Var.d0(bj0Var.f35542f.getChildAt(i27));
                    }
                    int hiddenChildCount = bj0Var.f35542f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        bj0Var.d0(bj0Var.f35542f.V(i28));
                    }
                    int cachedChildCount = bj0Var.f35542f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        bj0Var.d0(bj0Var.f35542f.P(i29));
                    }
                    int attachedScrapChildCount = bj0Var.f35542f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        bj0Var.d0(bj0Var.f35542f.O(i30));
                    }
                    bj0Var.f35542f.getRecycledViewPool().a();
                }
                wf.f fVar2 = bj0Var.Z;
                if (fVar2 != null) {
                    fVar2.f49522g = true;
                }
                View subtitleTextView = bj0Var.Y.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.l5) {
                    ((org.telegram.ui.ActionBar.l5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Pi, bj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f36713b;
                org.telegram.ui.Components.tl0 tl0Var7 = notificationsCustomSettingsActivity.f34184a;
                if (tl0Var7 != null) {
                    int childCount14 = tl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f34184a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.va) {
                            ((org.telegram.ui.Cells.va) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((ip0) this.f36713b).z0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f36713b).u0();
                return;
            default:
                ox0 ox0Var = (ox0) this.f36713b;
                org.telegram.ui.Components.tl0 tl0Var8 = ox0Var.f39855a;
                if (tl0Var8 != null) {
                    int childCount15 = tl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = ox0Var.f39855a.getChildAt(i32);
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
