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
    public final int f43507a;
    public final Object f43508b;

    public a(Object obj, int i7) {
        this.f43507a = i7;
        this.f43508b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.h6 h6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i7;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.Cells.r8 r8Var;
        int i10 = this.f43507a;
        Object obj = this.f43508b;
        switch (i10) {
            case 0:
                ((ai.e0) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.w2[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.u0 webView = ((k3) obj).f47145f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.f48646e) {
                    org.telegram.ui.Components.u4.k(p4Var.getParentActivity(), null, new f(p4Var, 4));
                    return;
                }
                int i11 = ((o4) view).f48425e;
                if (p4Var.Z() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131748587, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.a0("AutoDeleteConfirmMessage", null, 2131753865, org.telegram.messenger.id.c0(i11 * 60));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.messenger.ch(14));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751160, null), new ni.c(3, p4Var, view));
                    alertDialog$Builder.p();
                    return;
                }
                p4Var.b0(view, true);
                return;
            case 4:
                ((b5) obj).b(false);
                return;
            case 5:
                q6 q6Var = (q6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(q6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.id.M0(2131752098, null));
                if (TextUtils.isEmpty(q6Var.f47522c.f34193i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) h6Var.f34193i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                u1Var2.R = sb3;
                u1Var2.T = org.telegram.messenger.id.M0(2131744814, null);
                alertDialog$Builder2.k(q6Var.f47521b.f34193i, new w0(q6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                q6Var.d.showDialog(u1Var2);
                View d = u1Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.m6.f28111p7;
                    org.telegram.ui.ActionBar.t6.U((TextView) d, i12, null);
                    d.setBackground(org.telegram.ui.ActionBar.m6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.x0(null, i12, false))));
                    return;
                }
                return;
            case 6:
                y6 y6Var = (y6) ((w6) obj).f50923f;
                y6Var.L = !y6Var.L;
                y6Var.A0(true);
                y6Var.y0();
                return;
            case 7:
                k7 k7Var = (k7) obj;
                switch (k7Var.f47186f) {
                    case 0:
                        ((l7) k7Var.h).f47528r.F.o(null, (ci.b) k7Var.getTag(), true);
                        return;
                    default:
                        ((q7) k7Var.h).f48974n.F.o(null, (ci.b) k7Var.getTag(), true);
                        return;
                }
            case 8:
                ((q8) obj).run();
                return;
            case 9:
                org.telegram.ui.Components.ch0 ch0Var = (org.telegram.ui.Components.ch0) ((bi.m5) obj).f4328e;
                if (!ch0Var.b()) {
                    ch0Var.setProgress(0.0f);
                    ch0Var.d();
                    return;
                }
                return;
            case 10:
                s9 s9Var = (s9) obj;
                CameraView cameraView = s9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) s9Var.f49751s.getBackground();
                    AnimatorSet animatorSet = s9Var.f49752w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        s9Var.f49752w = null;
                    }
                    s9Var.f49752w = new AnimatorSet();
                    org.telegram.ui.Components.j6 j6Var = org.telegram.ui.Components.l6.f35551e;
                    if (s9Var.f49751s.getTag() == null) {
                        i7 = 68;
                    } else {
                        i7 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, j6Var, i7);
                    ofInt.addUpdateListener(new m9(s9Var, 1));
                    s9Var.f49752w.playTogether(ofInt);
                    s9Var.f49752w.setDuration(200L);
                    s9Var.f49752w.setInterpolator(org.telegram.ui.Components.wq.f40046f);
                    s9Var.f49752w.addListener(new m.a(s9Var, 19));
                    s9Var.f49752w.start();
                    if (s9Var.f49751s.getTag() == null) {
                        s9Var.f49751s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    s9Var.f49751s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 11:
                ((rc) obj).D0();
                return;
            case 12:
                cn cnVar = ((ui) obj).f50508b;
                cnVar.f44527i0.o();
                di.u2 u2Var = cnVar.X1;
                if (u2Var != null) {
                    u2Var.w1(0, null);
                }
                cnVar.za();
                return;
            case 13:
                cn cnVar2 = ((nm) obj).f48227a;
                r4Var = ((org.telegram.ui.ActionBar.f2) cnVar2).parentLayout;
                if (r4Var != null) {
                    r4Var2 = ((org.telegram.ui.ActionBar.f2) cnVar2).parentLayout;
                    ((ActionBarLayout) r4Var2).r();
                    return;
                }
                return;
            case 14:
                ((lp) obj).f47649e.w0(true);
                return;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                return;
            case 16:
                ((org.telegram.ui.Cells.r8[]) obj)[0].setChecked(!r8Var.f30225e.h);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.w2) ((h9.f1) obj).f14325b).f28711x0.run();
                return;
            case 18:
                org.telegram.messenger.camera.q.j(3, (org.telegram.ui.ActionBar.f2) obj);
                return;
            case 19:
                final zt ztVar = (zt) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ztVar.getContext());
                String M02 = org.telegram.messenger.id.M0(2131752098, null);
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f27300a;
                u1Var3.R = M02;
                u1Var3.T = org.telegram.messenger.id.M0(2131752096, null);
                alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), new org.telegram.ui.ActionBar.r1() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                ztVar.dismiss();
                                return;
                            default:
                                zt ztVar2 = ztVar;
                                ztVar2.dismiss();
                                m4.d0 d0Var = ztVar2.U1;
                                ((y6) d0Var.f19617b).o0(ztVar2.T1, ztVar2.W1, ztVar2.f52533b2);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                ztVar.dismiss();
                                return;
                            default:
                                zt ztVar2 = ztVar;
                                ztVar2.dismiss();
                                m4.d0 d0Var = ztVar2.U1;
                                ((y6) d0Var.f19617b).o0(ztVar2.T1, ztVar2.W1, ztVar2.f52533b2);
                                return;
                        }
                    }
                });
                u1Var3.show();
                u1Var3.i();
                return;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 21:
                ((yy) obj).d1();
                return;
            case 22:
                ((yy) ((k0) obj).f47127b).dismiss();
                return;
            case 23:
                org.telegram.ui.Components.ch0 ch0Var2 = (org.telegram.ui.Components.ch0) ((k0) obj).f47127b;
                if (!ch0Var2.b()) {
                    ch0Var2.setProgress(0.0f);
                    ch0Var2.d();
                    return;
                }
                return;
            case 24:
                ((dz) obj).c();
                return;
            case 25:
                d00 d00Var = (d00) obj;
                org.telegram.ui.Components.a80 a80Var = d00Var.f44860s;
                if ((!d00Var.f44859r || a80Var.c()) && d00Var.f44863y != null) {
                    d00Var.f44859r = true;
                    a80Var.f31773b = -1L;
                    a80Var.f31774c = -1L;
                    d00Var.f44858n.invalidate();
                    yy.f1(d00Var.H, d00Var.f44863y, new kz(d00Var, 3));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.ch0 ch0Var3 = ((e00) obj).f45086a;
                if (!ch0Var3.b()) {
                    ch0Var3.setProgress(0.0f);
                    ch0Var3.d();
                    return;
                }
                return;
            case 27:
                final h00 h00Var = (h00) obj;
                d00 d00Var2 = (d00) view.getParent();
                final org.telegram.messenger.vo currentFilter = d00Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = h00Var.f46189e;
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(filtersSetupActivity, d00Var2);
                H.c(2131232116, org.telegram.messenger.id.M0(2131750779, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.vo voVar = currentFilter;
                        h00 h00Var2 = h00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = h00Var2.f46189e;
                                if (voVar.f26087p) {
                                    Context context = h00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.f2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.i0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new jz(voVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = h00Var2.f46189e;
                                if (voVar.d()) {
                                    org.telegram.ui.Components.vz.g1(filtersSetupActivity3, voVar.f26074a, new r3(h00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String M03 = org.telegram.messenger.id.M0(2131750790, null);
                                org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f27300a;
                                u1Var4.R = M03;
                                u1Var4.T = org.telegram.messenger.id.M0(2131750789, null);
                                alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751598, null), new su(4, h00Var2, voVar));
                                filtersSetupActivity3.showDialog(u1Var4);
                                TextView textView = (TextView) u1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232108, org.telegram.messenger.id.M0(2131750787, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.vo voVar = currentFilter;
                        h00 h00Var2 = h00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = h00Var2.f46189e;
                                if (voVar.f26087p) {
                                    Context context = h00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.f2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.i0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new jz(voVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = h00Var2.f46189e;
                                if (voVar.d()) {
                                    org.telegram.ui.Components.vz.g1(filtersSetupActivity3, voVar.f26074a, new r3(h00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String M03 = org.telegram.messenger.id.M0(2131750790, null);
                                org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f27300a;
                                u1Var4.R = M03;
                                u1Var4.T = org.telegram.messenger.id.M0(2131750789, null);
                                alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751598, null), new su(4, h00Var2, voVar));
                                filtersSetupActivity3.showDialog(u1Var4);
                                TextView textView = (TextView) u1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (org.telegram.messenger.id.f23161a0) {
                    H.f35201i = 3;
                }
                H.W(filtersSetupActivity.f41234a.U0(d00Var2, false));
                H.Z();
                return;
            case 28:
                ((q30) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.wo woVar = (org.telegram.ui.Components.wo) obj;
                woVar.a(!woVar.f40026a.f31279q, true);
                org.telegram.messenger.qp.e1().edit().putBoolean("callmiconstart", woVar.f40026a.f31279q).apply();
                return;
        }
    }
}
