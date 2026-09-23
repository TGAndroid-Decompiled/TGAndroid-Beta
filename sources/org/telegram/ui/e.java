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
    public final int f32753a;
    public final Object f32754b;

    public e(Object obj, int i10) {
        this.f32753a = i10;
        this.f32754b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f32753a;
    }

    @Override
    public final void b() {
        androidx.activity.n[] nVarArr;
        aa.a[] aVarArr;
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        int i10;
        switch (this.f32753a) {
            case 0:
                ((h) this.f32754b).c0();
                return;
            case 1:
                gv gvVar = ((z6) this.f32754b).T;
                if (gvVar != null) {
                    gvVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18859h5, false));
                    return;
                }
                return;
            case 2:
                k9.U((k9) this.f32754b);
                return;
            case 3:
                ld ldVar = (ld) this.f32754b;
                LinearLayout linearLayout = ldVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ldVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f20417n, nVar.f20416f);
                            nVar.f20413a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                xn xnVar = (xn) this.f32754b;
                gj gjVar = xnVar.f39582w;
                if (gjVar != null) {
                    gjVar.d();
                }
                gj gjVar2 = xnVar.f39595x;
                if (gjVar2 != null) {
                    gjVar2.d();
                }
                jk jkVar = xnVar.Y;
                if (jkVar != null) {
                    jkVar.e();
                }
                ai.g4 g4Var = xnVar.J1;
                if (g4Var != null) {
                    g4Var.c1();
                }
                rj rjVar = xnVar.f39596x0;
                if (rjVar != null) {
                    int childCount2 = rjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = xnVar.f39596x0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            ((org.telegram.ui.Cells.t1) childAt2).s1(0);
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
                        if (childAt3 instanceof org.telegram.ui.Cells.r2) {
                            ((org.telegram.ui.Cells.r2) childAt3).b0(0, true);
                        }
                    }
                }
                if (xnVar.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = xnVar.S8;
                        if (i14 < f1VarArr.length) {
                            f1VarArr[i14].c(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.E8), xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.F8));
                            xnVar.S8[i14].setSelectorColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = xnVar.Q8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.vf0 vf0Var = xnVar.f39623z2;
                if (vf0Var != null) {
                    vf0Var.d();
                }
                lk lkVar = xnVar.Z;
                if (lkVar != null && lkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.od odVar : xnVar.Z.getEditView().f26410a) {
                        odVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = xnVar.f39396h0;
                if (v0Var != null) {
                    v0Var.N();
                }
                ek ekVar = xnVar.X1;
                if (ekVar != null) {
                    ekVar.q();
                }
                mj mjVar = xnVar.f39310a1;
                if (mjVar != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = mjVar.f24022d0;
                    org.telegram.ui.Components.lw0 lw0Var = mjVar.N;
                    if (lw0Var != null) {
                        lw0Var.b(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19011pa, d6Var));
                    }
                    Drawable drawable = mjVar.f24036q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19200zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.o5 o5Var = mjVar.f24026g0;
                    if (o5Var != null) {
                        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19200zh, d6Var)));
                    }
                    org.telegram.ui.Components.o5 o5Var2 = mjVar.f24025f0;
                    if (o5Var2 != null) {
                        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19200zh, d6Var)));
                    }
                    Drawable drawable2 = mjVar.f24038r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19200zh, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = mjVar.f24040s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Ah, d6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    mjVar.invalidate();
                }
                qm qmVar = xnVar.X0;
                if (qmVar != null) {
                    qmVar.N();
                    ci.bb bbVar = xnVar.X0.L;
                    if (bbVar != null) {
                        bbVar.invalidate();
                    }
                }
                org.telegram.ui.Components.ch chVar = xnVar.M0;
                if (chVar != null) {
                    ch.d dVar2 = chVar.f23026s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
                    chVar.invalidate();
                }
                org.telegram.ui.Components.my0 my0Var = xnVar.f39349d1;
                if (my0Var != null) {
                    org.telegram.ui.ActionBar.d6 d6Var2 = my0Var.f26290b;
                    Paint paint = my0Var.O;
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
                mj mjVar2 = xnVar.f39310a1;
                if (mjVar2 != null && mjVar2.getTimeItem() != null) {
                    xnVar.f39310a1.getTimeItem().invalidate();
                }
                hh.g gVar = xnVar.S;
                if (gVar != null) {
                    gVar.f10510f.v();
                    gVar.h.v();
                    gVar.invalidate();
                }
                jh.h hVar = xnVar.f39422j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.f359b).f11187b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                ok okVar = xnVar.O0;
                if (okVar != null) {
                    for (androidx.activity.n nVar2 : okVar.f13007a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.f1901c).g();
                        }
                    }
                }
                Iterator it = xnVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                xnVar.n9();
                return;
            case 5:
                ai.y5 y5Var = ((so) this.f32754b).e;
                if (y5Var != null) {
                    y5Var.invalidate();
                    return;
                }
                return;
            case 6:
                gp gpVar = (gp) this.f32754b;
                LinearLayout linearLayout2 = gpVar.f33630x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = gpVar.f33630x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.f20417n, nVar3.f20416f);
                            nVar3.f20413a.invalidate();
                        }
                    }
                }
                gpVar.G.f();
                org.telegram.ui.Components.s60 s60Var = gpVar.f33622p0;
                if (s60Var != null) {
                    s60Var.b0();
                    return;
                }
                return;
            case 7:
                sp spVar = (sp) this.f32754b;
                org.telegram.ui.Components.ml0 ml0Var = spVar.f37381b;
                if (ml0Var != null) {
                    int childCount5 = ml0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = spVar.f37381b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((zp) this.f32754b).W();
                return;
            case 9:
                lq lqVar = (lq) this.f32754b;
                ai.w0 w0Var2 = lqVar.f35043b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = lqVar.f35043b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                qr qrVar = (qr) this.f32754b;
                ai.w0 w0Var3 = qrVar.f36551c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = qrVar.f36551c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ns.W((ns) this.f32754b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f32754b);
                return;
            case 13:
                c10 c10Var = (c10) this.f32754b;
                ai.w0 w0Var4 = c10Var.f32219a;
                if (w0Var4 != null) {
                    int childCount8 = w0Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = c10Var.f32219a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.bb) {
                            ((org.telegram.ui.Cells.bb) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ai.n4 n4Var = ((u10) this.f32754b).m0;
                if (n4Var != null && (dVar = (ch.d) n4Var.f1294c) != null) {
                    dVar.v();
                    return;
                }
                return;
            case 15:
                ((o20) this.f32754b).v0();
                return;
            case 16:
                b70 b70Var = (b70) this.f32754b;
                org.telegram.ui.Components.ml0 ml0Var2 = b70Var.f31999n;
                if (ml0Var2 != null) {
                    int childCount9 = ml0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = b70Var.f31999n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.c20 c20Var = b70Var.f31991f;
                if (c20Var != null) {
                    c20Var.e();
                }
                org.telegram.ui.Components.z10 z10Var = b70Var.f32012y;
                if (z10Var != null) {
                    z10Var.g();
                    return;
                }
                return;
            case 17:
                i70 i70Var = (i70) this.f32754b;
                org.telegram.ui.Components.ml0 ml0Var3 = i70Var.f34044b;
                if (ml0Var3 != null) {
                    int childCount10 = ml0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = i70Var.f34044b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.z10 z10Var2 = i70Var.v;
                if (z10Var2 != null) {
                    z10Var2.g();
                    return;
                }
                return;
            case 18:
                ((a80) this.f32754b).V(true);
                return;
            case 19:
                i80 i80Var = (i80) this.f32754b;
                org.telegram.ui.Components.ml0 ml0Var4 = i80Var.h;
                if (ml0Var4 != null) {
                    int childCount11 = ml0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = i80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                sb0 sb0Var = (sb0) this.f32754b;
                org.telegram.ui.Cells.f9 f9Var = sb0Var.G;
                if (f9Var != null) {
                    f9Var.getContext();
                    ob0 ob0Var = sb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.h6.G6;
                    ob0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    ob0 ob0Var2 = sb0Var.F;
                    int i25 = org.telegram.ui.ActionBar.h6.f19170y6;
                    ob0Var2.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i25, false));
                    sb0Var.f37233w.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    sb0Var.f37233w.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i25, false));
                    org.telegram.ui.Cells.fa faVar = sb0Var.I;
                    if (faVar != null) {
                        faVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19008p7, false));
                    }
                    sb0Var.M.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                    sb0Var.K.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i24, false));
                    sb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                dd0 dd0Var = (dd0) this.f32754b;
                dd0Var.d.setIconColor(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.ui));
                dd0Var.d.B(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
                dd0Var.d.G(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true);
                dd0Var.d.G(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false);
                dd0Var.f32603s.setColorFilter(new PorterDuffColorFilter(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18859h5), PorterDuff.Mode.MULTIPLY));
                dd0Var.v.invalidate();
                if (dd0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!dd0Var.f32581a0) {
                            dd0Var.f32581a0 = true;
                            dd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = dd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                dd0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (dd0Var.f32581a0) {
                        dd0Var.f32581a0 = false;
                        dd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = dd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            dd0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((rg0) this.f32754b).y1();
                return;
            case 23:
                ((zg0) this.f32754b).e0();
                return;
            case 24:
                th0 th0Var = (th0) this.f32754b;
                org.telegram.ui.Components.ml0 ml0Var5 = th0Var.f37657b;
                if (ml0Var5 != null) {
                    int childCount12 = ml0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = th0Var.f37657b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.w80) {
                            ((org.telegram.ui.Components.w80) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.s60 s60Var2 = th0Var.f37670l0;
                if (s60Var2 != null) {
                    s60Var2.b0();
                    return;
                }
                return;
            case 25:
                ej0 ej0Var = (ej0) this.f32754b;
                org.telegram.ui.Components.ml0 ml0Var6 = ej0Var.f32952f;
                if (ml0Var6 != null) {
                    int childCount13 = ml0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        ej0Var.d0(ej0Var.f32952f.getChildAt(i27));
                    }
                    int hiddenChildCount = ej0Var.f32952f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        ej0Var.d0(ej0Var.f32952f.V(i28));
                    }
                    int cachedChildCount = ej0Var.f32952f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        ej0Var.d0(ej0Var.f32952f.P(i29));
                    }
                    int attachedScrapChildCount = ej0Var.f32952f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        ej0Var.d0(ej0Var.f32952f.O(i30));
                    }
                    ej0Var.f32952f.getRecycledViewPool().a();
                }
                ig.f fVar = ej0Var.f32949c0;
                if (fVar != null) {
                    fVar.f11101g = true;
                }
                View subtitleTextView = ej0Var.f32947b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.i5) {
                    ((org.telegram.ui.ActionBar.i5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Pi, ej0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f32754b;
                org.telegram.ui.Components.ml0 ml0Var7 = notificationsCustomSettingsActivity.f30835a;
                if (ml0Var7 != null) {
                    int childCount14 = ml0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f30835a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.bb) {
                            ((org.telegram.ui.Cells.bb) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((up0) this.f32754b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f32754b).u0();
                return;
            default:
                zx0 zx0Var = (zx0) this.f32754b;
                org.telegram.ui.Components.ml0 ml0Var8 = zx0Var.f40264a;
                if (ml0Var8 != null) {
                    int childCount15 = ml0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = zx0Var.f40264a.getChildAt(i32);
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
