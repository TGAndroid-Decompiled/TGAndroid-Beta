package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a implements View.OnClickListener {
    public final int f35497a;
    public final Object f35498b;

    public a(Object obj, int i10) {
        this.f35497a = i10;
        this.f35498b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.e6 e6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.Cells.t8 t8Var;
        int i11 = this.f35497a;
        Object obj = this.f35498b;
        switch (i11) {
            case 0:
                ((ag.o0) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.z2[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.v0 webView = ((l3) obj).f39063f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.e) {
                    org.telegram.ui.Components.s4.k(p4Var.getParentActivity(), null, new e(p4Var, 4));
                    return;
                }
                int i12 = ((o4) view).e;
                if (p4Var.Z() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String L0 = org.telegram.messenger.dd.L0(2131748602, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.dd.a0("AutoDeleteConfirmMessage", null, 2131753865, org.telegram.messenger.dd.c0(i12 * 60));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.messenger.e9(28));
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751161, null), new ng.d(3, p4Var, view));
                    alertDialog$Builder.p();
                    return;
                }
                p4Var.b0(view, true);
                return;
            case 4:
                ((a5) obj).b(false);
                return;
            case 5:
                q6 q6Var = (q6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(q6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.dd.L0(2131752098, null));
                if (TextUtils.isEmpty(q6Var.f39439c.f25749i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) e6Var.f25749i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                x1Var2.R = sb3;
                x1Var2.T = org.telegram.messenger.dd.L0(2131744832, null);
                alertDialog$Builder2.k(q6Var.f39438b.f25749i, new y0(q6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                q6Var.d.showDialog(x1Var2);
                View d = x1Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.t6.f21154p7;
                    org.telegram.ui.ActionBar.a7.V((TextView) d, i13, null);
                    d.setBackground(org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.x0(null, i13, false))));
                    return;
                }
                return;
            case 6:
                y6 y6Var = (y6) ((w6) obj).f42676f;
                y6Var.L = !y6Var.L;
                y6Var.A0(true);
                y6Var.y0();
                return;
            case 7:
                k7 k7Var = (k7) obj;
                switch (k7Var.f38663f) {
                    case 0:
                        ((l7) k7Var.h).f39108r.F.a(null, (sh.a) k7Var.getTag(), true);
                        return;
                    default:
                        ((q7) k7Var.h).f40704n.F.a(null, (sh.a) k7Var.getTag(), true);
                        return;
                }
            case 8:
                ((ag.o0) obj).run();
                return;
            case 9:
                org.telegram.ui.Components.fi0 fi0Var = (org.telegram.ui.Components.fi0) ((jg.b1) obj).e;
                if (!fi0Var.b()) {
                    fi0Var.setProgress(0.0f);
                    fi0Var.d();
                    return;
                }
                return;
            case 10:
                u9 u9Var = (u9) obj;
                CameraView cameraView = u9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.f41891s.getBackground();
                    AnimatorSet animatorSet = u9Var.f41892w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        u9Var.f41892w = null;
                    }
                    u9Var.f41892w = new AnimatorSet();
                    org.telegram.ui.Components.g6 g6Var = org.telegram.ui.Components.i6.e;
                    if (u9Var.f41891s.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, g6Var, i10);
                    ofInt.addUpdateListener(new n9(u9Var, 1));
                    u9Var.f41892w.playTogether(ofInt);
                    u9Var.f41892w.setDuration(200L);
                    u9Var.f41892w.setInterpolator(org.telegram.ui.Components.gr.f26523f);
                    u9Var.f41892w.addListener(new s9(u9Var, 0));
                    u9Var.f41892w.start();
                    if (u9Var.f41891s.getTag() == null) {
                        u9Var.f41891s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    u9Var.f41891s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 11:
                ((zc) obj).D0();
                return;
            case 12:
                un unVar = ((nj) obj).f39917b;
                unVar.f42090i0.o();
                ag.v vVar = unVar.X1;
                if (vVar != null) {
                    vVar.v1(0, null);
                }
                unVar.sa();
                return;
            case 13:
                un unVar2 = ((fn) obj).f37191a;
                z4Var = ((org.telegram.ui.ActionBar.k2) unVar2).parentLayout;
                if (z4Var != null) {
                    z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar2).parentLayout;
                    ((ActionBarLayout) z4Var2).r();
                    return;
                }
                return;
            case 14:
                ((hq) obj).e.w0(true);
                return;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                return;
            case 16:
                ((org.telegram.ui.Cells.t8[]) obj)[0].setChecked(!t8Var.e.h);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.z2) ((l2.f) obj).f11588b).f21622x0.run();
                return;
            case 18:
                org.telegram.messenger.a30.k(3, (org.telegram.ui.ActionBar.k2) obj);
                return;
            case 19:
                final yu yuVar = (yu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(yuVar.getContext());
                String L02 = org.telegram.messenger.dd.L0(2131752098, null);
                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.f20135a;
                x1Var3.R = L02;
                x1Var3.T = org.telegram.messenger.dd.L0(2131752096, null);
                alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.ui.ActionBar.u1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i14) {
                        switch (r2) {
                            case 0:
                                yuVar.dismiss();
                                return;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                m4.c cVar = yuVar2.R1;
                                ((y6) cVar.f12707c).o0(yuVar2.Q1, yuVar2.T1, yuVar2.Y1);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i14) {
                        switch (r2) {
                            case 0:
                                yuVar.dismiss();
                                return;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                m4.c cVar = yuVar2.R1;
                                ((y6) cVar.f12707c).o0(yuVar2.Q1, yuVar2.T1, yuVar2.Y1);
                                return;
                        }
                    }
                });
                x1Var3.show();
                x1Var3.i();
                return;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 21:
                ((vz) obj).d1();
                return;
            case 22:
                ((vz) ((l0) obj).f39040b).dismiss();
                return;
            case 23:
                org.telegram.ui.Components.fi0 fi0Var2 = (org.telegram.ui.Components.fi0) ((l0) obj).f39040b;
                if (!fi0Var2.b()) {
                    fi0Var2.setProgress(0.0f);
                    fi0Var2.d();
                    return;
                }
                return;
            case 24:
                ((b00) obj).c();
                return;
            case 25:
                a10 a10Var = (a10) obj;
                org.telegram.ui.Components.t80 t80Var = a10Var.f35522s;
                if ((!a10Var.f35521r || t80Var.c()) && a10Var.f35525y != null) {
                    a10Var.f35521r = true;
                    t80Var.f30574b = -1L;
                    t80Var.f30575c = -1L;
                    a10Var.f35520n.invalidate();
                    vz.f1(a10Var.H, a10Var.f35525y, new yy(a10Var, 4));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.fi0 fi0Var3 = ((b10) obj).f35900a;
                if (!fi0Var3.b()) {
                    fi0Var3.setProgress(0.0f);
                    fi0Var3.d();
                    return;
                }
                return;
            case 27:
                final e10 e10Var = (e10) obj;
                a10 a10Var2 = (a10) view.getParent();
                final org.telegram.messenger.bp currentFilter = a10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = e10Var.e;
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(filtersSetupActivity, a10Var2);
                H.c(2131232115, org.telegram.messenger.dd.L0(2131750780, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        int i15 = r3;
                        org.telegram.messenger.bp bpVar = currentFilter;
                        e10 e10Var2 = e10Var;
                        switch (i15) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = e10Var2.e;
                                if (bpVar.f15012p) {
                                    Context context = e10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.k2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new kg.q0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new h00(bpVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = e10Var2.e;
                                if (bpVar.d()) {
                                    org.telegram.ui.Components.j00.g1(filtersSetupActivity3, bpVar.f15000a, new s3(e10Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String L03 = org.telegram.messenger.dd.L0(2131750791, null);
                                org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.f20135a;
                                x1Var4.R = L03;
                                x1Var4.T = org.telegram.messenger.dd.L0(2131750790, null);
                                alertDialog$Builder4.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131751599, null), new qv(5, e10Var2, bpVar));
                                filtersSetupActivity3.showDialog(x1Var4);
                                TextView textView = (TextView) x1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232107, org.telegram.messenger.dd.L0(2131750788, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        int i15 = r3;
                        org.telegram.messenger.bp bpVar = currentFilter;
                        e10 e10Var2 = e10Var;
                        switch (i15) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = e10Var2.e;
                                if (bpVar.f15012p) {
                                    Context context = e10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.k2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new kg.q0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new h00(bpVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = e10Var2.e;
                                if (bpVar.d()) {
                                    org.telegram.ui.Components.j00.g1(filtersSetupActivity3, bpVar.f15000a, new s3(e10Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String L03 = org.telegram.messenger.dd.L0(2131750791, null);
                                org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.f20135a;
                                x1Var4.R = L03;
                                x1Var4.T = org.telegram.messenger.dd.L0(2131750790, null);
                                alertDialog$Builder4.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131751599, null), new qv(5, e10Var2, bpVar));
                                filtersSetupActivity3.showDialog(x1Var4);
                                TextView textView = (TextView) x1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (org.telegram.messenger.dd.X) {
                    H.f33026i = 3;
                }
                H.W(filtersSetupActivity.f33338a.U0(a10Var2, false));
                H.Z();
                return;
            case 28:
                ((l40) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.ep epVar = (org.telegram.ui.Components.ep) obj;
                epVar.a(!epVar.f25895a.f23920q, true);
                org.telegram.messenger.wp.d1().edit().putBoolean("callmiconstart", epVar.f25895a.f23920q).apply();
                return;
        }
    }
}
