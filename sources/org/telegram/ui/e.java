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
    public final int f37159a;
    public final Object f37160b;

    public e(Object obj, int i10) {
        this.f37159a = i10;
        this.f37160b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f37159a;
    }

    @Override
    public final void b() {
        androidx.activity.n[] nVarArr;
        aa.a[] aVarArr;
        ih.b bVar;
        ih.a aVar;
        ch.d dVar;
        int i10;
        switch (this.f37159a) {
            case 0:
                ((h) this.f37160b).b0();
                return;
            case 1:
                iv ivVar = ((y6) this.f37160b).T;
                if (ivVar != null) {
                    ivVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false));
                    return;
                }
                return;
            case 2:
                j9.U((j9) this.f37160b);
                return;
            case 3:
                md mdVar = (md) this.f37160b;
                LinearLayout linearLayout = mdVar.L;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = mdVar.L.getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) childAt;
                            nVar.d.k(nVar.f22487n, nVar.f22486f);
                            nVar.f22482a.invalidate();
                        }
                    }
                    return;
                }
                return;
            case 4:
                zn znVar = (zn) this.f37160b;
                kj kjVar = znVar.f45019w;
                if (kjVar != null) {
                    kjVar.b();
                }
                kj kjVar2 = znVar.f45033x;
                if (kjVar2 != null) {
                    kjVar2.b();
                }
                ok okVar = znVar.Y;
                if (okVar != null) {
                    okVar.e();
                }
                ai.h4 h4Var = znVar.J1;
                if (h4Var != null) {
                    h4Var.e1();
                }
                wj wjVar = znVar.f45034x0;
                if (wjVar != null) {
                    int childCount2 = wjVar.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = znVar.f45034x0.getChildAt(i12);
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
                            f1VarArr[i14].c(znVar.getThemedColor(org.telegram.ui.ActionBar.i6.E8), znVar.getThemedColor(org.telegram.ui.ActionBar.i6.F8));
                            znVar.S8[i14].setSelectorColor(znVar.getThemedColor(org.telegram.ui.ActionBar.i6.I5));
                            i14++;
                        }
                    }
                }
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null) {
                    View contentView = n1Var.getContentView();
                    contentView.setBackgroundColor(znVar.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                    contentView.invalidate();
                }
                org.telegram.ui.Components.yg0 yg0Var = znVar.f45060z2;
                if (yg0Var != null) {
                    yg0Var.d();
                }
                pk pkVar = znVar.Z;
                if (pkVar != null && pkVar.getEditView() != null) {
                    for (org.telegram.ui.Components.rd rdVar : znVar.Z.getEditView().f30192a) {
                        rdVar.d();
                    }
                }
                org.telegram.ui.ActionBar.v0 v0Var = znVar.f44833h0;
                if (v0Var != null) {
                    v0Var.N();
                }
                ik ikVar = znVar.X1;
                if (ikVar != null) {
                    ikVar.q();
                }
                qj qjVar = znVar.f44746a1;
                if (qjVar != null) {
                    org.telegram.ui.ActionBar.e6 e6Var = qjVar.f31592d0;
                    org.telegram.ui.Components.px0 px0Var = qjVar.N;
                    if (px0Var != null) {
                        px0Var.b(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21025pa, e6Var));
                    }
                    Drawable drawable = qjVar.f31607q0;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21214zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    org.telegram.ui.Components.q5 q5Var = qjVar.f31597g0;
                    if (q5Var != null) {
                        q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21214zh, e6Var)));
                    }
                    org.telegram.ui.Components.q5 q5Var2 = qjVar.f31596f0;
                    if (q5Var2 != null) {
                        q5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21214zh, e6Var)));
                    }
                    Drawable drawable2 = qjVar.f31609r0;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21214zh, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    Drawable drawable3 = qjVar.f31611s0;
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ah, e6Var), PorterDuff.Mode.MULTIPLY));
                    }
                    qjVar.invalidate();
                }
                sm smVar = znVar.X0;
                if (smVar != null) {
                    smVar.N();
                    ci.bb bbVar = znVar.X0.L;
                    if (bbVar != null) {
                        bbVar.invalidate();
                    }
                }
                org.telegram.ui.Components.fh fhVar = znVar.M0;
                if (fhVar != null) {
                    ch.d dVar2 = fhVar.f26415s;
                    if (dVar2 != null) {
                        dVar2.v();
                    }
                    Color.alpha(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                    fhVar.invalidate();
                }
                org.telegram.ui.Components.pz0 pz0Var = znVar.f44785d1;
                if (pz0Var != null) {
                    org.telegram.ui.ActionBar.e6 e6Var2 = pz0Var.f29890b;
                    Paint paint = pz0Var.O;
                    if (paint != null) {
                        paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Be, e6Var2));
                    }
                    Drawable drawable4 = org.telegram.ui.ActionBar.i6.E4;
                    int i15 = org.telegram.ui.ActionBar.i6.Be;
                    int w02 = org.telegram.ui.ActionBar.i6.w0(i15, e6Var2);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable4.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    org.telegram.ui.ActionBar.i6.F4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i15, e6Var2), mode));
                }
                qj qjVar2 = znVar.f44746a1;
                if (qjVar2 != null && qjVar2.getTimeItem() != null) {
                    znVar.f44746a1.getTimeItem().invalidate();
                }
                hh.f fVar = znVar.S;
                if (fVar != null) {
                    fVar.f11504f.v();
                    fVar.h.v();
                    fVar.invalidate();
                }
                jh.h hVar = znVar.f44859j1;
                if (hVar != null) {
                    for (aa.a aVar2 : hVar.f14200e) {
                        if (aVar2 != null && (aVar = (bVar = (ih.b) aVar2.f384b).f12230b) != null) {
                            aVar.g();
                            bVar.invalidate();
                        }
                    }
                }
                sk skVar = znVar.O0;
                if (skVar != null) {
                    for (androidx.activity.n nVar2 : skVar.f14177a) {
                        if (nVar2 != null) {
                            ((ih.a) nVar2.f2148c).g();
                        }
                    }
                }
                Iterator it = znVar.E.iterator();
                while (it.hasNext()) {
                    ((ch.d) it.next()).v();
                }
                znVar.s9();
                return;
            case 5:
                ai.z5 z5Var = ((uo) this.f37160b).f42515e;
                if (z5Var != null) {
                    z5Var.invalidate();
                    return;
                }
                return;
            case 6:
                ip ipVar = (ip) this.f37160b;
                LinearLayout linearLayout2 = ipVar.f38780x;
                if (linearLayout2 != null) {
                    int childCount4 = linearLayout2.getChildCount();
                    for (int i16 = 0; i16 < childCount4; i16++) {
                        View childAt4 = ipVar.f38780x.getChildAt(i16);
                        if (childAt4 instanceof org.telegram.ui.Cells.n) {
                            org.telegram.ui.Cells.n nVar3 = (org.telegram.ui.Cells.n) childAt4;
                            nVar3.d.k(nVar3.f22487n, nVar3.f22486f);
                            nVar3.f22482a.invalidate();
                        }
                    }
                }
                ipVar.G.f();
                org.telegram.ui.Components.u70 u70Var = ipVar.f38772p0;
                if (u70Var != null) {
                    u70Var.e();
                    return;
                }
                return;
            case 7:
                up upVar = (up) this.f37160b;
                org.telegram.ui.Components.rm0 rm0Var = upVar.f42545b;
                if (rm0Var != null) {
                    int childCount5 = rm0Var.getChildCount();
                    for (int i17 = 0; i17 < childCount5; i17++) {
                        View childAt5 = upVar.f42545b.getChildAt(i17);
                        if (childAt5 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt5).c(0);
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((bq) this.f37160b).W();
                return;
            case 9:
                nq nqVar = (nq) this.f37160b;
                ai.w0 w0Var2 = nqVar.f40358b;
                if (w0Var2 != null) {
                    int childCount6 = w0Var2.getChildCount();
                    for (int i18 = 0; i18 < childCount6; i18++) {
                        View childAt6 = nqVar.f40358b.getChildAt(i18);
                        if (childAt6 instanceof org.telegram.ui.Cells.wa) {
                            ((org.telegram.ui.Cells.wa) childAt6).b();
                        }
                    }
                    return;
                }
                return;
            case 10:
                tr trVar = (tr) this.f37160b;
                ai.w0 w0Var3 = trVar.f42102c;
                if (w0Var3 != null) {
                    int childCount7 = w0Var3.getChildCount();
                    for (int i19 = 0; i19 < childCount7; i19++) {
                        View childAt7 = trVar.f42102c.getChildAt(i19);
                        if (childAt7 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt7).c(0);
                        }
                    }
                    return;
                }
                return;
            case 11:
                qs.W((qs) this.f37160b);
                return;
            case 12:
                ContactsActivity.V((ContactsActivity) this.f37160b);
                return;
            case 13:
                f10 f10Var = (f10) this.f37160b;
                ai.w0 w0Var4 = f10Var.f37456a;
                if (w0Var4 != null) {
                    int childCount8 = w0Var4.getChildCount();
                    for (int i20 = 0; i20 < childCount8; i20++) {
                        View childAt8 = f10Var.f37456a.getChildAt(i20);
                        if (childAt8 instanceof org.telegram.ui.Cells.xa) {
                            ((org.telegram.ui.Cells.xa) childAt8).j(0);
                        }
                    }
                    return;
                }
                return;
            case 14:
                ai.o4 o4Var = ((w10) this.f37160b).m0;
                if (o4Var != null && (dVar = (ch.d) o4Var.f1527c) != null) {
                    dVar.v();
                    return;
                }
                return;
            case 15:
                ((p20) this.f37160b).w0();
                return;
            case 16:
                c70 c70Var = (c70) this.f37160b;
                org.telegram.ui.Components.rm0 rm0Var2 = c70Var.f36603n;
                if (rm0Var2 != null) {
                    int childCount9 = rm0Var2.getChildCount();
                    for (int i21 = 0; i21 < childCount9; i21++) {
                        View childAt9 = c70Var.f36603n.getChildAt(i21);
                        if (childAt9 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt9).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.t20 t20Var = c70Var.f36595f;
                if (t20Var != null) {
                    t20Var.e();
                }
                org.telegram.ui.Components.q20 q20Var = c70Var.f36616y;
                if (q20Var != null) {
                    q20Var.g();
                    return;
                }
                return;
            case 17:
                j70 j70Var = (j70) this.f37160b;
                org.telegram.ui.Components.rm0 rm0Var3 = j70Var.f38890b;
                if (rm0Var3 != null) {
                    int childCount10 = rm0Var3.getChildCount();
                    for (int i22 = 0; i22 < childCount10; i22++) {
                        View childAt10 = j70Var.f38890b.getChildAt(i22);
                        if (childAt10 instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt10).f(0);
                        }
                    }
                }
                org.telegram.ui.Components.q20 q20Var2 = j70Var.v;
                if (q20Var2 != null) {
                    q20Var2.g();
                    return;
                }
                return;
            case 18:
                ((d80) this.f37160b).V(true);
                return;
            case 19:
                l80 l80Var = (l80) this.f37160b;
                org.telegram.ui.Components.rm0 rm0Var4 = l80Var.h;
                if (rm0Var4 != null) {
                    int childCount11 = rm0Var4.getChildCount();
                    for (int i23 = 0; i23 < childCount11; i23++) {
                        View childAt11 = l80Var.h.getChildAt(i23);
                        if (childAt11 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt11).a();
                        }
                    }
                    return;
                }
                return;
            case 20:
                vb0 vb0Var = (vb0) this.f37160b;
                org.telegram.ui.Cells.e9 e9Var = vb0Var.G;
                if (e9Var != null) {
                    e9Var.getContext();
                    rb0 rb0Var = vb0Var.F;
                    int i24 = org.telegram.ui.ActionBar.i6.G6;
                    rb0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i24, false));
                    rb0 rb0Var2 = vb0Var.F;
                    int i25 = org.telegram.ui.ActionBar.i6.f21185y6;
                    rb0Var2.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i25, false));
                    vb0Var.f42856w.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i24, false));
                    vb0Var.f42856w.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i25, false));
                    org.telegram.ui.Cells.ca caVar = vb0Var.I;
                    if (caVar != null) {
                        caVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21022p7, false));
                    }
                    vb0Var.M.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    vb0Var.K.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i24, false));
                    vb0Var.K.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i25, false));
                    return;
                }
                return;
            case 21:
                hd0 hd0Var = (hd0) this.f37160b;
                hd0Var.d.setIconColor(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.ui));
                hd0Var.d.B(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
                hd0Var.d.G(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.F8), true);
                hd0Var.d.G(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.E8), false);
                hd0Var.f38323s.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20872h5), PorterDuff.Mode.MULTIPLY));
                hd0Var.v.invalidate();
                if (hd0Var.I != null) {
                    if (AndroidUtilities.computePerceivedBrightness(hd0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6)) < 0.721f) {
                        i10 = R.raw.mapstyle_night;
                    } else {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        if (!hd0Var.f38300a0) {
                            hd0Var.f38300a0 = true;
                            hd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                            IMapsProvider.ICircle iCircle = hd0Var.O;
                            if (iCircle != null) {
                                iCircle.setStrokeColor(-1);
                                hd0Var.O.setFillColor(553648127);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (hd0Var.f38300a0) {
                        hd0Var.f38300a0 = false;
                        hd0Var.I.setMapStyle(null);
                        IMapsProvider.ICircle iCircle2 = hd0Var.O;
                        if (iCircle2 != null) {
                            iCircle2.setStrokeColor(-16777216);
                            hd0Var.O.setFillColor(536870912);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 22:
                ((wg0) this.f37160b).y1();
                return;
            case 23:
                ((fh0) this.f37160b).e0();
                return;
            case 24:
                zh0 zh0Var = (zh0) this.f37160b;
                org.telegram.ui.Components.rm0 rm0Var5 = zh0Var.f44679b;
                if (rm0Var5 != null) {
                    int childCount12 = rm0Var5.getChildCount();
                    for (int i26 = 0; i26 < childCount12; i26++) {
                        View childAt12 = zh0Var.f44679b.getChildAt(i26);
                        if (childAt12 instanceof org.telegram.ui.Cells.b5) {
                            ((org.telegram.ui.Cells.b5) childAt12).c(0);
                        }
                        if (childAt12 instanceof org.telegram.ui.Components.y90) {
                            ((org.telegram.ui.Components.y90) childAt12).f();
                        }
                    }
                }
                org.telegram.ui.Components.u70 u70Var2 = zh0Var.f44693l0;
                if (u70Var2 != null) {
                    u70Var2.e();
                    return;
                }
                return;
            case 25:
                lj0 lj0Var = (lj0) this.f37160b;
                org.telegram.ui.Components.rm0 rm0Var6 = lj0Var.f39648f;
                if (rm0Var6 != null) {
                    int childCount13 = rm0Var6.getChildCount();
                    for (int i27 = 0; i27 < childCount13; i27++) {
                        lj0Var.d0(lj0Var.f39648f.getChildAt(i27));
                    }
                    int hiddenChildCount = lj0Var.f39648f.getHiddenChildCount();
                    for (int i28 = 0; i28 < hiddenChildCount; i28++) {
                        lj0Var.d0(lj0Var.f39648f.V(i28));
                    }
                    int cachedChildCount = lj0Var.f39648f.getCachedChildCount();
                    for (int i29 = 0; i29 < cachedChildCount; i29++) {
                        lj0Var.d0(lj0Var.f39648f.P(i29));
                    }
                    int attachedScrapChildCount = lj0Var.f39648f.getAttachedScrapChildCount();
                    for (int i30 = 0; i30 < attachedScrapChildCount; i30++) {
                        lj0Var.d0(lj0Var.f39648f.O(i30));
                    }
                    lj0Var.f39648f.getRecycledViewPool().a();
                }
                ig.f fVar2 = lj0Var.f39644c0;
                if (fVar2 != null) {
                    fVar2.f12140g = true;
                }
                View subtitleTextView = lj0Var.f39642b0.getSubtitleTextView();
                if (subtitleTextView instanceof org.telegram.ui.ActionBar.j5) {
                    ((org.telegram.ui.ActionBar.j5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Pi, lj0Var.getResourceProvider()));
                    return;
                }
                return;
            case 26:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f37160b;
                org.telegram.ui.Components.rm0 rm0Var7 = notificationsCustomSettingsActivity.f33865a;
                if (rm0Var7 != null) {
                    int childCount14 = rm0Var7.getChildCount();
                    for (int i31 = 0; i31 < childCount14; i31++) {
                        View childAt13 = notificationsCustomSettingsActivity.f33865a.getChildAt(i31);
                        if (childAt13 instanceof org.telegram.ui.Cells.xa) {
                            ((org.telegram.ui.Cells.xa) childAt13).j(0);
                        }
                    }
                    return;
                }
                return;
            case 27:
                ((aq0) this.f37160b).F0();
                return;
            case 28:
                ((PremiumPreviewFragment) this.f37160b).u0();
                return;
            default:
                gy0 gy0Var = (gy0) this.f37160b;
                org.telegram.ui.Components.rm0 rm0Var8 = gy0Var.f38186a;
                if (rm0Var8 != null) {
                    int childCount15 = rm0Var8.getChildCount();
                    for (int i32 = 0; i32 < childCount15; i32++) {
                        View childAt14 = gy0Var.f38186a.getChildAt(i32);
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
