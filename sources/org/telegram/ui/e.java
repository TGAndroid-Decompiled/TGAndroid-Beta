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
    public final int f33236a;
    public final Object f33237b;

    public e(Object obj, int i10) {
        this.f33236a = i10;
        this.f33237b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f33236a;
    }

    @Override
    public final void b() {
        androidx.activity.n[] nVarArr;
        aa.a[] aVarArr;
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        int i10;
        switch (this.f33236a) {
            case 0:
                ((h) this.f33237b).c0();
                return;
            case 1:
                fv fvVar = ((z6) this.f33237b).T;
                if (fvVar != null) {
                    fvVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19130h5, false));
                    return;
                }
                return;
            case 2:
                k9.U((k9) this.f33237b);
                return;
            case 3:
                ld ldVar = (ld) this.f33237b;
                LinearLayout linearLayout = ldVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ldVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f20662n, nVar.f20661f);
                            nVar.f20658a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                wn wnVar = (wn) this.f33237b;
                gj gjVar = wnVar.f39682w;
                if (gjVar != null) {
                    gjVar.d();
                }
                gj gjVar2 = wnVar.f39695x;
                if (gjVar2 != null) {
                    gjVar2.d();
                }
                jk jkVar = wnVar.Y;
                if (jkVar != null) {
                    jkVar.e();
                }
                ai.g4 g4Var = wnVar.J1;
                if (g4Var != null) {
                    g4Var.c1();
                }
                rj rjVar = wnVar.f39696x0;
                if (rjVar != null) {
                    int childCount2 = rjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = wnVar.f39696x0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.w0 w0Var = wnVar.L3;
                if (w0Var != null) {
                    int childCount3 = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = wnVar.L3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
                if (wnVar.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.e1[] e1VarArr = wnVar.S8;
                        if (i14 < e1VarArr.length) {
                            e1VarArr[i14].c(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.E8), wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.F8));
                            wnVar.S8[i14].setSelectorColor(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = wnVar.Q8;
                if (m1Var != null) {
                    View contentView = m1Var.getContentView();
                    contentView.setBackgroundColor(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.fg0 fg0Var = wnVar.f39723z2;
                if (fg0Var != null) {
                    fg0Var.d();
                }
                lk lkVar = wnVar.Z;
                if (lkVar != null && lkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.pd pdVar : wnVar.Z.getEditView().f27028a) {
                        pdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.u0 u0Var = wnVar.f39496h0;
                if (u0Var != null) {
                    u0Var.N();
                }
                ek ekVar = wnVar.X1;
                if (ekVar != null) {
                    ekVar.q();
                }
                mj mjVar = wnVar.f39410a1;
                if (mjVar != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = mjVar.f24227d0;
                    org.telegram.ui.Components.ww0 ww0Var = mjVar.N;
                    if (ww0Var != null) {
                        ww0Var.b(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19283pa, d6Var));
                    }
                    Drawable drawable = mjVar.f24241q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19473zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.o5 o5Var = mjVar.f24231g0;
                    if (o5Var != null) {
                        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19473zh, d6Var)));
                    }
                    org.telegram.ui.Components.o5 o5Var2 = mjVar.f24230f0;
                    if (o5Var2 != null) {
                        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19473zh, d6Var)));
                    }
                    Drawable drawable2 = mjVar.f24243r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19473zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = mjVar.f24245s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ah, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    mjVar.invalidate();
                }
                pm pmVar = wnVar.X0;
                if (pmVar != null) {
                    pmVar.N();
                    ci.bb bbVar = wnVar.X0.L;
                    if (bbVar != null) {
                        bbVar.invalidate();
                    }
                }
                org.telegram.ui.Components.dh dhVar = wnVar.M0;
                if (dhVar != null) {
                    ch.d dVar2 = dhVar.f23618s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false));
                    dhVar.invalidate();
                }
                org.telegram.ui.Components.xy0 xy0Var = wnVar.f39449d1;
                if (xy0Var != null) {
                    org.telegram.ui.ActionBar.d6 d6Var2 = xy0Var.f30428b;
                    Paint paint = xy0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Be, d6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.h6.E4;
                    int i15 = org.telegram.ui.ActionBar.h6.Be;
                    int v02 = org.telegram.ui.ActionBar.h6.v0(i15, d6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    org.telegram.ui.ActionBar.h6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i15, d6Var2), mode));
                }
                mj mjVar2 = wnVar.f39410a1;
                if (mjVar2 != null && mjVar2.getTimeItem() != null) {
                    wnVar.f39410a1.getTimeItem().invalidate();
                }
                hh.g gVar = wnVar.S;
                if (gVar != null) {
                    gVar.f10510f.v();
                    gVar.h.v();
                    gVar.invalidate();
                }
                jh.h hVar = wnVar.f39522j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.f359b).f11187b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                ok okVar = wnVar.O0;
                if (okVar != null) {
                    for (androidx.activity.n nVar2 : okVar.f13007a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.f1901c).g();
                        }
                    }
                }
                Iterator it = wnVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                wnVar.n9();
                return;
            case 5:
                ai.y5 y5Var = ((ro) this.f33237b).e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    return;
                }
                return;
            case 6:
                fp fpVar = (fp) this.f33237b;
                LinearLayout linearLayout2 = fpVar.f33737x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = fpVar.f33737x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.f20662n, nVar3.f20661f);
                            nVar3.f20658a.invalidate();
                        }
                    }
                }
                fpVar.G.f();
                org.telegram.ui.Components.c70 c70Var = fpVar.f33729p0;
                if (c70Var != null) {
                    c70Var.b0();
                    return;
                }
                return;
            case 7:
                rp rpVar = (rp) this.f33237b;
                org.telegram.ui.Components.wl0 wl0Var = rpVar.f37428b;
                if (wl0Var != null) {
                    int childCount5 = wl0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = rpVar.f37428b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((yp) this.f33237b).W();
                return;
            case 9:
                kq kqVar = (kq) this.f33237b;
                ai.w0 w0Var2 = kqVar.f35126b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = kqVar.f35126b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ya) {
                            ((org.telegram.ui.Cells.ya) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                pr prVar = (pr) this.f33237b;
                ai.w0 w0Var3 = prVar.f36616c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = prVar.f36616c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ms.W((ms) this.f33237b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f33237b);
                return;
            case 13:
                b10 b10Var = (b10) this.f33237b;
                ai.w0 w0Var4 = b10Var.f32274a;
                if (w0Var4 != null) {
                    int childCount8 = w0Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = b10Var.f32274a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ai.n4 n4Var = ((t10) this.f33237b).m0;
                if (n4Var != null && (dVar = (ch.d) n4Var.f1294c) != null) {
                    dVar.v();
                    return;
                }
                return;
            case 15:
                ((m20) this.f33237b).v0();
                return;
            case 16:
                z60 z60Var = (z60) this.f33237b;
                org.telegram.ui.Components.wl0 wl0Var2 = z60Var.f40383n;
                if (wl0Var2 != null) {
                    int childCount9 = wl0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = z60Var.f40383n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.c20 c20Var = z60Var.f40375f;
                if (c20Var != null) {
                    c20Var.e();
                }
                org.telegram.ui.Components.z10 z10Var = z60Var.f40396y;
                if (z10Var != null) {
                    z10Var.g();
                    return;
                }
                return;
            case 17:
                g70 g70Var = (g70) this.f33237b;
                org.telegram.ui.Components.wl0 wl0Var3 = g70Var.f33837b;
                if (wl0Var3 != null) {
                    int childCount10 = wl0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = g70Var.f33837b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.z10 z10Var2 = g70Var.v;
                if (z10Var2 != null) {
                    z10Var2.g();
                    return;
                }
                return;
            case 18:
                ((y70) this.f33237b).V(true);
                return;
            case 19:
                g80 g80Var = (g80) this.f33237b;
                org.telegram.ui.Components.wl0 wl0Var4 = g80Var.h;
                if (wl0Var4 != null) {
                    int childCount11 = wl0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = g80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                rb0 rb0Var = (rb0) this.f33237b;
                org.telegram.ui.Cells.e9 e9Var = rb0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    nb0 nb0Var = rb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.h6.G6;
                    nb0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    nb0 nb0Var2 = rb0Var.F;
                    int i25 = org.telegram.ui.ActionBar.h6.f19443y6;
                    nb0Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i25, false));
                    rb0Var.f37289w.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    rb0Var.f37289w.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i25, false));
                    org.telegram.ui.Cells.ea eaVar = rb0Var.I;
                    if (eaVar != null) {
                        eaVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false));
                    }
                    rb0Var.M.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    rb0Var.K.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    rb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                cd0 cd0Var = (cd0) this.f33237b;
                cd0Var.d.setIconColor(cd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ui));
                cd0Var.d.B(cd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                cd0Var.d.G(cd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
                cd0Var.d.G(cd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
                cd0Var.f32679s.setColorFilter(new PorterDuffColorFilter(cd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19130h5), PorterDuff.Mode.MULTIPLY));
                cd0Var.v.invalidate();
                if (cd0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(cd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!cd0Var.f32657a0) {
                            cd0Var.f32657a0 = true;
                            cd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = cd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                cd0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (cd0Var.f32657a0) {
                        cd0Var.f32657a0 = false;
                        cd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = cd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            cd0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((qg0) this.f33237b).y1();
                return;
            case 23:
                ((yg0) this.f33237b).e0();
                return;
            case 24:
                sh0 sh0Var = (sh0) this.f33237b;
                org.telegram.ui.Components.wl0 wl0Var5 = sh0Var.f37771b;
                if (wl0Var5 != null) {
                    int childCount12 = wl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = sh0Var.f37771b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.g90) {
                            ((org.telegram.ui.Components.g90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.c70 c70Var2 = sh0Var.f37784l0;
                if (c70Var2 != null) {
                    c70Var2.b0();
                    return;
                }
                return;
            case 25:
                dj0 dj0Var = (dj0) this.f33237b;
                org.telegram.ui.Components.wl0 wl0Var6 = dj0Var.f33141f;
                if (wl0Var6 != null) {
                    int childCount13 = wl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        dj0Var.d0(dj0Var.f33141f.getChildAt(i27));
                    }
                    int hiddenChildCount = dj0Var.f33141f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        dj0Var.d0(dj0Var.f33141f.V(i28));
                    }
                    int cachedChildCount = dj0Var.f33141f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        dj0Var.d0(dj0Var.f33141f.P(i29));
                    }
                    int attachedScrapChildCount = dj0Var.f33141f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        dj0Var.d0(dj0Var.f33141f.O(i30));
                    }
                    dj0Var.f33141f.getRecycledViewPool().a();
                }
                ig.f fVar = dj0Var.f33138c0;
                if (fVar != null) {
                    fVar.f11101g = true;
                }
                View subtitleTextView = dj0Var.f33136b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
                    ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Pi, dj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f33237b;
                org.telegram.ui.Components.wl0 wl0Var7 = notificationsCustomSettingsActivity.f31151a;
                if (wl0Var7 != null) {
                    int childCount14 = wl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f31151a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((tp0) this.f33237b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f33237b).u0();
                return;
            default:
                yx0 yx0Var = (yx0) this.f33237b;
                org.telegram.ui.Components.wl0 wl0Var8 = yx0Var.f40269a;
                if (wl0Var8 != null) {
                    int childCount15 = wl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = yx0Var.f40269a.getChildAt(i32);
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
