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
public final class e implements org.telegram.ui.ActionBar.k6 {
    public final int f33187a;
    public final Object f33188b;

    public e(Object obj, int i10) {
        this.f33187a = i10;
        this.f33188b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f33187a;
    }

    @Override
    public final void b() {
        androidx.activity.n[] nVarArr;
        aa.a[] aVarArr;
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        int i10;
        switch (this.f33187a) {
            case 0:
                ((h) this.f33188b).c0();
                return;
            case 1:
                kv kvVar = ((z6) this.f33188b).X;
                if (kvVar != null) {
                    kvVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19165h5, false));
                    return;
                }
                return;
            case 2:
                l9.U((l9) this.f33188b);
                return;
            case 3:
                md mdVar = (md) this.f33188b;
                LinearLayout linearLayout = mdVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = mdVar.L.getChildAt(i11);
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
                zn znVar = (zn) this.f33188b;
                ij ijVar = znVar.f40516w;
                if (ijVar != null) {
                    ijVar.c();
                }
                ij ijVar2 = znVar.f40529x;
                if (ijVar2 != null) {
                    ijVar2.c();
                }
                lk lkVar = znVar.Y;
                if (lkVar != null) {
                    lkVar.e();
                }
                ai.g4 g4Var = znVar.J1;
                if (g4Var != null) {
                    g4Var.c1();
                }
                tj tjVar = znVar.f40530x0;
                if (tjVar != null) {
                    int childCount2 = tjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = znVar.f40530x0.getChildAt(i12);
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            ((org.telegram.ui.Cells.u1) childAt2).s1(0);
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            ((org.telegram.ui.Cells.w0) childAt2).setInvalidateColors(true);
                        }
                    }
                }
                ai.w0 w0Var = znVar.L3;
                if (w0Var != null) {
                    int childCount3 = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount3; i13++) {
                        View childAt3 = znVar.L3.getChildAt(i13);
                        if (childAt3 instanceof org.telegram.ui.Cells.s2) {
                            ((org.telegram.ui.Cells.s2) childAt3).b0(0, true);
                        }
                    }
                }
                if (znVar.S8 != null) {
                    int i14 = 0;
                    while (true) {
                        org.telegram.ui.ActionBar.f1[] f1VarArr = znVar.S8;
                        if (i14 < f1VarArr.length) {
                            f1VarArr[i14].c(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.E8), znVar.getThemedColor(org.telegram.ui.ActionBar.j6.F8));
                            znVar.S8[i14].setSelectorColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.dg0 dg0Var = znVar.f40557z2;
                if (dg0Var != null) {
                    dg0Var.d();
                }
                nk nkVar = znVar.Z;
                if (nkVar != null && nkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.od odVar : znVar.Z.getEditView().f26625a) {
                        odVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = znVar.f40330h0;
                if (v0Var != null) {
                    v0Var.N();
                }
                gk gkVar = znVar.X1;
                if (gkVar != null) {
                    gkVar.q();
                }
                oj ojVar = znVar.f40243a1;
                if (ojVar != null) {
                    org.telegram.ui.ActionBar.f6 f6Var = ojVar.f23891d0;
                    org.telegram.ui.Components.ww0 ww0Var = ojVar.N;
                    if (ww0Var != null) {
                        ww0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19318pa, f6Var));
                    }
                    Drawable drawable = ojVar.f23905q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19507zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.n5 n5Var = ojVar.f23895g0;
                    if (n5Var != null) {
                        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19507zh, f6Var)));
                    }
                    org.telegram.ui.Components.n5 n5Var2 = ojVar.f23894f0;
                    if (n5Var2 != null) {
                        n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19507zh, f6Var)));
                    }
                    Drawable drawable2 = ojVar.f23907r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19507zh, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = ojVar.f23909s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, f6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    ojVar.invalidate();
                }
                rm rmVar = znVar.X0;
                if (rmVar != null) {
                    rmVar.N();
                    ci.eb ebVar = znVar.X0.L;
                    if (ebVar != null) {
                        ebVar.invalidate();
                    }
                }
                org.telegram.ui.Components.ch chVar = znVar.M0;
                if (chVar != null) {
                    ch.d dVar2 = chVar.f23289s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
                    chVar.invalidate();
                }
                org.telegram.ui.Components.yy0 yy0Var = znVar.f40282d1;
                if (yy0Var != null) {
                    org.telegram.ui.ActionBar.f6 f6Var2 = yy0Var.f30640b;
                    Paint paint = yy0Var.O;
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
                oj ojVar2 = znVar.f40243a1;
                if (ojVar2 != null && ojVar2.getTimeItem() != null) {
                    znVar.f40243a1.getTimeItem().invalidate();
                }
                hh.g gVar = znVar.S;
                if (gVar != null) {
                    gVar.f10528f.v();
                    gVar.h.v();
                    gVar.invalidate();
                }
                jh.h hVar = znVar.f40356j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.f359b).f11201b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                qk qkVar = znVar.O0;
                if (qkVar != null) {
                    for (androidx.activity.n nVar2 : qkVar.f13019a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.f1909c).g();
                        }
                    }
                }
                Iterator it = znVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                znVar.n9();
                return;
            case 5:
                ai.z5 z5Var = ((uo) this.f33188b).e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    return;
                }
                return;
            case 6:
                ip ipVar = (ip) this.f33188b;
                LinearLayout linearLayout2 = ipVar.f34656x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = ipVar.f34656x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.f20663n, nVar3.f20662f);
                            nVar3.f20659a.invalidate();
                        }
                    }
                }
                ipVar.G.f();
                org.telegram.ui.Components.z60 z60Var = ipVar.f34648p0;
                if (z60Var != null) {
                    z60Var.b0();
                    return;
                }
                return;
            case 7:
                up upVar = (up) this.f33188b;
                org.telegram.ui.Components.vl0 vl0Var = upVar.f38180b;
                if (vl0Var != null) {
                    int childCount5 = vl0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = upVar.f38180b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.c5) {
                            ((org.telegram.ui.Cells.c5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((bq) this.f33188b).W();
                return;
            case 9:
                nq nqVar = (nq) this.f33188b;
                ai.w0 w0Var2 = nqVar.f36079b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = nqVar.f36079b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.za) {
                            ((org.telegram.ui.Cells.za) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                sr srVar = (sr) this.f33188b;
                ai.w0 w0Var3 = srVar.f37453c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = srVar.f37453c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.c5) {
                            ((org.telegram.ui.Cells.c5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                ss.W((ss) this.f33188b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f33188b);
                return;
            case 13:
                f10 f10Var = (f10) this.f33188b;
                ai.w0 w0Var4 = f10Var.f33434a;
                if (w0Var4 != null) {
                    int childCount8 = w0Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = f10Var.f33434a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ai.n4 n4Var = ((x10) this.f33188b).m0;
                if (n4Var != null && (dVar = (ch.d) n4Var.f1287c) != null) {
                    dVar.v();
                    return;
                }
                return;
            case 15:
                ((r20) this.f33188b).v0();
                return;
            case 16:
                e70 e70Var = (e70) this.f33188b;
                org.telegram.ui.Components.vl0 vl0Var2 = e70Var.f33261n;
                if (vl0Var2 != null) {
                    int childCount9 = vl0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = e70Var.f33261n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.b20 b20Var = e70Var.f33253f;
                if (b20Var != null) {
                    b20Var.e();
                }
                org.telegram.ui.Components.y10 y10Var = e70Var.f33274y;
                if (y10Var != null) {
                    y10Var.g();
                    return;
                }
                return;
            case 17:
                l70 l70Var = (l70) this.f33188b;
                org.telegram.ui.Components.vl0 vl0Var3 = l70Var.f35335b;
                if (vl0Var3 != null) {
                    int childCount10 = vl0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = l70Var.f35335b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.y10 y10Var2 = l70Var.v;
                if (y10Var2 != null) {
                    y10Var2.g();
                    return;
                }
                return;
            case 18:
                ((d80) this.f33188b).V(true);
                return;
            case 19:
                l80 l80Var = (l80) this.f33188b;
                org.telegram.ui.Components.vl0 vl0Var4 = l80Var.h;
                if (vl0Var4 != null) {
                    int childCount11 = vl0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = l80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                zb0 zb0Var = (zb0) this.f33188b;
                org.telegram.ui.Cells.f9 f9Var = zb0Var.G;
                if (f9Var != null) {
                    f9Var.getContext();
                    vb0 vb0Var = zb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.j6.G6;
                    vb0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    vb0 vb0Var2 = zb0Var.F;
                    int i25 = org.telegram.ui.ActionBar.j6.f19477y6;
                    vb0Var2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    zb0Var.f40164w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    zb0Var.f40164w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    org.telegram.ui.Cells.fa faVar = zb0Var.I;
                    if (faVar != null) {
                        faVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19315p7, false));
                    }
                    zb0Var.M.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    zb0Var.K.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false));
                    zb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i25, false));
                    return;
                }
                return;
            case 21:
                kd0 kd0Var = (kd0) this.f33188b;
                kd0Var.d.setIconColor(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ui));
                kd0Var.d.B(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                kd0Var.d.G(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true);
                kd0Var.d.G(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false);
                kd0Var.f35116s.setColorFilter(new PorterDuffColorFilter(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19165h5), PorterDuff.Mode.MULTIPLY));
                kd0Var.v.invalidate();
                if (kd0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(kd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!kd0Var.f35094a0) {
                            kd0Var.f35094a0 = true;
                            kd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = kd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                kd0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (kd0Var.f35094a0) {
                        kd0Var.f35094a0 = false;
                        kd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = kd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            kd0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((yg0) this.f33188b).y1();
                return;
            case 23:
                ((gh0) this.f33188b).e0();
                return;
            case 24:
                ai0 ai0Var = (ai0) this.f33188b;
                org.telegram.ui.Components.vl0 vl0Var5 = ai0Var.f32073b;
                if (vl0Var5 != null) {
                    int childCount12 = vl0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = ai0Var.f32073b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.c5) {
                            ((org.telegram.ui.Cells.c5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.d90) {
                            ((org.telegram.ui.Components.d90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.z60 z60Var2 = ai0Var.f32086l0;
                if (z60Var2 != null) {
                    z60Var2.b0();
                    return;
                }
                return;
            case 25:
                mj0 mj0Var = (mj0) this.f33188b;
                org.telegram.ui.Components.vl0 vl0Var6 = mj0Var.f35755f;
                if (vl0Var6 != null) {
                    int childCount13 = vl0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        mj0Var.d0(mj0Var.f35755f.getChildAt(i27));
                    }
                    int hiddenChildCount = mj0Var.f35755f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        mj0Var.d0(mj0Var.f35755f.W(i28));
                    }
                    int cachedChildCount = mj0Var.f35755f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        mj0Var.d0(mj0Var.f35755f.Q(i29));
                    }
                    int attachedScrapChildCount = mj0Var.f35755f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        mj0Var.d0(mj0Var.f35755f.P(i30));
                    }
                    mj0Var.f35755f.getRecycledViewPool().a();
                }
                ig.f fVar = mj0Var.f35752c0;
                if (fVar != null) {
                    fVar.f11115g = true;
                }
                View subtitleTextView = mj0Var.f35750b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Pi, mj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f33188b;
                org.telegram.ui.Components.vl0 vl0Var7 = notificationsCustomSettingsActivity.f31148a;
                if (vl0Var7 != null) {
                    int childCount14 = vl0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f31148a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.ab) {
                            ((org.telegram.ui.Cells.ab) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((cq0) this.f33188b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f33188b).u0();
                return;
            default:
                hy0 hy0Var = (hy0) this.f33188b;
                org.telegram.ui.Components.vl0 vl0Var8 = hy0Var.f34311a;
                if (vl0Var8 != null) {
                    int childCount15 = vl0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = hy0Var.f34311a.getChildAt(i32);
                        if (childAt14 instanceof org.telegram.ui.Cells.c5) {
                            ((org.telegram.ui.Cells.c5) childAt14).c(0);
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
