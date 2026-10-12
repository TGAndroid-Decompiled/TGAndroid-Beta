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
    public final int f35410a;
    public final Object f35411b;

    public e(Object obj, int i10) {
        this.f35410a = i10;
        this.f35411b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f35410a;
    }

    @Override
    public final void b() {
        androidx.activity.o[] oVarArr;
        androidx.biometric.e[] eVarArr;
        jh.b bVar;
        jh.a aVar;
        dh.d dVar;
        int i10;
        switch (this.f35410a) {
            case 0:
                ((h) this.f35411b).b0();
                return;
            case 1:
                ov ovVar = ((d7) this.f35411b).T;
                if (ovVar != null) {
                    ovVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false));
                    return;
                }
                return;
            case 2:
                n9.U((n9) this.f35411b);
                return;
            case 3:
                sd sdVar = (sd) this.f35411b;
                LinearLayout linearLayout = sdVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = sdVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f21538n, nVar.f21537f);
                            nVar.f21534a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                fo foVar = (fo) this.f35411b;
                oj ojVar = foVar.f36146w;
                if (ojVar != null) {
                    ojVar.b();
                }
                oj ojVar2 = foVar.f36159x;
                if (ojVar2 != null) {
                    ojVar2.b();
                }
                sk skVar = foVar.Y;
                if (skVar != null) {
                    skVar.d();
                }
                bi.w3 w3Var = foVar.J1;
                if (w3Var != null) {
                    w3Var.e1();
                }
                ak akVar = foVar.f36160x0;
                if (akVar != null) {
                    int childCount2 = akVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = foVar.f36160x0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.x0) {
                            ((org.telegram.ui.Cells.x0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                bi.o0 o0Var = foVar.L3;
                if (o0Var != null) {
                    int childCount3 = o0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = foVar.L3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
                if (foVar.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.e1[] e1VarArr = foVar.S8;
                        if (i14 < e1VarArr.length) {
                            e1VarArr[i14].c(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.E8), foVar.getThemedColor(org.telegram.ui.ActionBar.g6.F8));
                            foVar.S8[i14].setSelectorColor(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.m1 m1Var = foVar.Q8;
                if (m1Var != null) {
                    View contentView = m1Var.getContentView();
                    contentView.setBackgroundColor(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.vg0 vg0Var = foVar.f36187z2;
                if (vg0Var != null) {
                    vg0Var.d();
                }
                tk tkVar = foVar.Z;
                if (tkVar != null && tkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.pd pdVar : foVar.Z.getEditView().f27940a) {
                        pdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.u0 u0Var = foVar.f35960h0;
                if (u0Var != null) {
                    u0Var.N();
                }
                mk mkVar = foVar.X1;
                if (mkVar != null) {
                    mkVar.q();
                }
                uj ujVar = foVar.f35872a1;
                if (ujVar != null) {
                    org.telegram.ui.ActionBar.c6 c6Var = ujVar.f28891d0;
                    org.telegram.ui.Components.kx0 kx0Var = ujVar.N;
                    if (kx0Var != null) {
                        kx0Var.b(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20124pa, c6Var));
                    }
                    Drawable drawable = ujVar.f28905q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.q5 q5Var = ujVar.f28895g0;
                    if (q5Var != null) {
                        q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, c6Var)));
                    }
                    org.telegram.ui.Components.q5 q5Var2 = ujVar.f28894f0;
                    if (q5Var2 != null) {
                        q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, c6Var)));
                    }
                    Drawable drawable2 = ujVar.f28907r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20315zh, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = ujVar.f28909s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ah, c6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    ujVar.invalidate();
                }
                xm xmVar = foVar.X0;
                if (xmVar != null) {
                    xmVar.N();
                    di.ab abVar = foVar.X0.L;
                    if (abVar != null) {
                        abVar.invalidate();
                    }
                }
                org.telegram.ui.Components.dh dhVar = foVar.M0;
                if (dhVar != null) {
                    dh.d dVar2 = dhVar.f24398s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                    dhVar.invalidate();
                }
                org.telegram.ui.Components.kz0 kz0Var = foVar.f35912d1;
                if (kz0Var != null) {
                    org.telegram.ui.ActionBar.c6 c6Var2 = kz0Var.f26829b;
                    Paint paint = kz0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Be, c6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.g6.E4;
                    int i15 = org.telegram.ui.ActionBar.g6.Be;
                    int w02 = org.telegram.ui.ActionBar.g6.w0(i15, c6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    org.telegram.ui.ActionBar.g6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i15, c6Var2), mode));
                }
                uj ujVar2 = foVar.f35872a1;
                if (ujVar2 != null && ujVar2.getTimeItem() != null) {
                    foVar.f35872a1.getTimeItem().invalidate();
                }
                ih.f fVar = foVar.S;
                if (fVar != null) {
                    fVar.f11741f.v();
                    fVar.h.v();
                    fVar.invalidate();
                }
                kh.h hVar = foVar.f35984j1;
                if (hVar != null) {
                    for (androidx.biometric.e eVar : hVar.e) {
                        if (eVar != null && (aVar = (bVar = (jh.b) eVar.f1196b).f13099b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                wk wkVar = foVar.O0;
                if (wkVar != null) {
                    for (androidx.activity.o oVar : wkVar.f14266a) {
                        if (oVar != null) {
                            ((jh.a) oVar.f1049b).g();
                        }
                    }
                }
                Iterator it = foVar.E.iterator();
                while (it.hasNext()) {
                    ((dh.d) it.next()).v();
                }
                foVar.s9();
                return;
            case 5:
                bi.k5 k5Var = ((zo) this.f35411b).e;
                if (k5Var != null) {
                    k5Var.invalidate();
                    return;
                }
                return;
            case 6:
                np npVar = (np) this.f35411b;
                LinearLayout linearLayout2 = npVar.f38779x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = npVar.f38779x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar2 = (org.telegram.ui.Cells.n) childAt4;
                            nVar2.d.k(nVar2.f21538n, nVar2.f21537f);
                            nVar2.f21534a.invalidate();
                        }
                    }
                }
                npVar.G.f();
                org.telegram.ui.Components.p70 p70Var = npVar.f38771p0;
                if (p70Var != null) {
                    p70Var.d();
                    return;
                }
                return;
            case 7:
                aq aqVar = (aq) this.f35411b;
                org.telegram.ui.Components.mm0 mm0Var = aqVar.f34293b;
                if (mm0Var != null) {
                    int childCount5 = mm0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = aqVar.f34293b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((hq) this.f35411b).W();
                return;
            case 9:
                tq tqVar = (tq) this.f35411b;
                bi.o0 o0Var2 = tqVar.f40436b;
                if (o0Var2 != null) {
                    int childCount6 = o0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = tqVar.f40436b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.wa) {
                            ((org.telegram.ui.Cells.wa) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                yr yrVar = (yr) this.f35411b;
                bi.o0 o0Var3 = yrVar.f42218c;
                if (o0Var3 != null) {
                    int childCount7 = o0Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = yrVar.f42218c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ws.W((ws) this.f35411b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f35411b);
                return;
            case 13:
                l10 l10Var = (l10) this.f35411b;
                bi.o0 o0Var4 = l10Var.f37804a;
                if (o0Var4 != null) {
                    int childCount8 = o0Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = l10Var.f37804a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.xa) {
                            ((org.telegram.ui.Cells.xa) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                bi.d4 d4Var = ((c20) this.f35411b).m0;
                if (d4Var != null && (dVar = (dh.d) d4Var.f2946c) != null) {
                    dVar.v();
                    return;
                }
                return;
            case 15:
                ((v20) this.f35411b).w0();
                return;
            case 16:
                j70 j70Var = (j70) this.f35411b;
                org.telegram.ui.Components.mm0 mm0Var2 = j70Var.f37285n;
                if (mm0Var2 != null) {
                    int childCount9 = mm0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = j70Var.f37285n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.o20 o20Var = j70Var.f37277f;
                if (o20Var != null) {
                    o20Var.d();
                }
                org.telegram.ui.Components.l20 l20Var = j70Var.f37298y;
                if (l20Var != null) {
                    l20Var.g();
                    return;
                }
                return;
            case 17:
                p70 p70Var2 = (p70) this.f35411b;
                org.telegram.ui.Components.mm0 mm0Var3 = p70Var2.f39131b;
                if (mm0Var3 != null) {
                    int childCount10 = mm0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = p70Var2.f39131b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.l20 l20Var2 = p70Var2.v;
                if (l20Var2 != null) {
                    l20Var2.g();
                    return;
                }
                return;
            case 18:
                ((h80) this.f35411b).V(true);
                return;
            case 19:
                p80 p80Var = (p80) this.f35411b;
                org.telegram.ui.Components.mm0 mm0Var4 = p80Var.h;
                if (mm0Var4 != null) {
                    int childCount11 = mm0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = p80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                ac0 ac0Var = (ac0) this.f35411b;
                org.telegram.ui.Cells.e9 e9Var = ac0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    wb0 wb0Var = ac0Var.F;
                    int i24 = org.telegram.ui.ActionBar.g6.G6;
                    wb0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i24, false));
                    wb0 wb0Var2 = ac0Var.F;
                    int i25 = org.telegram.ui.ActionBar.g6.f20288y6;
                    wb0Var2.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i25, false));
                    ac0Var.f34172w.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i24, false));
                    ac0Var.f34172w.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i25, false));
                    org.telegram.ui.Cells.ca caVar = ac0Var.I;
                    if (caVar != null) {
                        caVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20122p7, false));
                    }
                    ac0Var.M.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    ac0Var.K.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i24, false));
                    ac0Var.K.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i25, false));
                    return;
                }
                return;
            case 21:
                nd0 nd0Var = (nd0) this.f35411b;
                nd0Var.d.setIconColor(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.ui));
                nd0Var.d.B(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
                nd0Var.d.G(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.F8), true);
                nd0Var.d.G(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.E8), false);
                nd0Var.f38670s.setColorFilter(new PorterDuffColorFilter(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19972h5), PorterDuff.Mode.MULTIPLY));
                nd0Var.v.invalidate();
                if (nd0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(nd0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!nd0Var.f38648a0) {
                            nd0Var.f38648a0 = true;
                            nd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = nd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                nd0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (nd0Var.f38648a0) {
                        nd0Var.f38648a0 = false;
                        nd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = nd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            nd0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((bh0) this.f35411b).y1();
                return;
            case 23:
                ((kh0) this.f35411b).e0();
                return;
            case 24:
                ei0 ei0Var = (ei0) this.f35411b;
                org.telegram.ui.Components.mm0 mm0Var5 = ei0Var.f35586b;
                if (mm0Var5 != null) {
                    int childCount12 = mm0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = ei0Var.f35586b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.w90) {
                            ((org.telegram.ui.Components.w90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.p70 p70Var3 = ei0Var.f35599l0;
                if (p70Var3 != null) {
                    p70Var3.d();
                    return;
                }
                return;
            case 25:
                qj0 qj0Var = (qj0) this.f35411b;
                org.telegram.ui.Components.mm0 mm0Var6 = qj0Var.f39477f;
                if (mm0Var6 != null) {
                    int childCount13 = mm0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        qj0Var.d0(qj0Var.f39477f.getChildAt(i27));
                    }
                    int hiddenChildCount = qj0Var.f39477f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        qj0Var.d0(qj0Var.f39477f.V(i28));
                    }
                    int cachedChildCount = qj0Var.f39477f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        qj0Var.d0(qj0Var.f39477f.P(i29));
                    }
                    int attachedScrapChildCount = qj0Var.f39477f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        qj0Var.d0(qj0Var.f39477f.O(i30));
                    }
                    qj0Var.f39477f.getRecycledViewPool().a();
                }
                jg.f fVar2 = qj0Var.f39474c0;
                if (fVar2 != null) {
                    fVar2.f13009a = true;
                }
                View subtitleTextView = qj0Var.f39472b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.h5) {
                    ((org.telegram.ui.ActionBar.h5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Pi, qj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f35411b;
                org.telegram.ui.Components.mm0 mm0Var7 = notificationsCustomSettingsActivity.f32153a;
                if (mm0Var7 != null) {
                    int childCount14 = mm0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f32153a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.xa) {
                            ((org.telegram.ui.Cells.xa) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((gq0) this.f35411b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f35411b).u0();
                return;
            default:
                my0 my0Var = (my0) this.f35411b;
                org.telegram.ui.Components.mm0 mm0Var8 = my0Var.f38373a;
                if (mm0Var8 != null) {
                    int childCount15 = mm0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = my0Var.f38373a.getChildAt(i32);
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
