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
    public final int f45524a;
    public final Object f45525b;

    public a(Object obj, int i7) {
        this.f45524a = i7;
        this.f45525b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.m6 m6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i7;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.Cells.r8 r8Var;
        int i10 = this.f45524a;
        Object obj = this.f45525b;
        switch (i10) {
            case 0:
                ((ai.e1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.w2[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.s0 webView = ((k3) obj).f49291f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.f50826e) {
                    org.telegram.ui.Components.b5.k(p4Var.getParentActivity(), null, new f(p4Var, 4));
                    return;
                }
                int i11 = ((o4) view).f50519e;
                if (p4Var.Z() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String N0 = org.telegram.messenger.gd.N0(2131748394, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.gd.a0("AutoDeleteConfirmMessage", null, 2131753862, org.telegram.messenger.gd.c0(i11 * 60));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new org.telegram.messenger.ed(19));
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751148, null), new oi.f0(5, p4Var, view));
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
                sb2.append(org.telegram.messenger.gd.N0(2131752086, null));
                if (TextUtils.isEmpty(q6Var.f49964c.f37401i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) m6Var.f37401i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                t1Var2.S = sb3;
                t1Var2.U = org.telegram.messenger.gd.N0(2131744573, null);
                alertDialog$Builder2.k(q6Var.f49963b.f37401i, new w0(q6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                q6Var.d.showDialog(t1Var2);
                View d = t1Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.n6.f29672p7;
                    org.telegram.ui.ActionBar.u6.U((TextView) d, i12, null);
                    d.setBackground(org.telegram.ui.ActionBar.n6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.x0(null, i12, false))));
                    return;
                }
                return;
            case 6:
                y6 y6Var = (y6) ((w6) obj).f53147f;
                y6Var.M = !y6Var.M;
                y6Var.A0(true);
                y6Var.y0();
                return;
            case 7:
                k7 k7Var = (k7) obj;
                switch (k7Var.f49358f) {
                    case 0:
                        ((l7) k7Var.h).f49614r.G.O(null, (ei.b) k7Var.getTag(), true);
                        return;
                    default:
                        ((q7) k7Var.h).f51340n.G.O(null, (ei.b) k7Var.getTag(), true);
                        return;
                }
            case 8:
                ((f0) obj).run();
                return;
            case 9:
                org.telegram.ui.Components.qh0 qh0Var = (org.telegram.ui.Components.qh0) ((di.n4) obj).f9358e;
                if (!qh0Var.b()) {
                    qh0Var.setProgress(0.0f);
                    qh0Var.d();
                    return;
                }
                return;
            case 10:
                t9 t9Var = (t9) obj;
                CameraView cameraView = t9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) t9Var.f52310s.getBackground();
                    AnimatorSet animatorSet = t9Var.f52311w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        t9Var.f52311w = null;
                    }
                    t9Var.f52311w = new AnimatorSet();
                    org.telegram.ui.Components.o6 o6Var = org.telegram.ui.Components.q6.f38713e;
                    if (t9Var.f52310s.getTag() == null) {
                        i7 = 68;
                    } else {
                        i7 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, o6Var, i7);
                    ofInt.addUpdateListener(new n9(t9Var, 1));
                    t9Var.f52311w.playTogether(ofInt);
                    t9Var.f52311w.setDuration(200L);
                    t9Var.f52311w.setInterpolator(org.telegram.ui.Components.kr.f36858f);
                    t9Var.f52311w.addListener(new ki.n3(t9Var, 20));
                    t9Var.f52311w.start();
                    if (t9Var.f52310s.getTag() == null) {
                        t9Var.f52310s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    t9Var.f52310s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 11:
                ((qc) obj).D0();
                return;
            case 12:
                bn bnVar = ((ti) obj).f52410b;
                bnVar.f46240j0.p();
                fi.n2 n2Var = bnVar.Y1;
                if (n2Var != null) {
                    n2Var.x1(0, null);
                }
                bnVar.Aa();
                return;
            case 13:
                bn bnVar2 = ((mm) obj).f50079a;
                r4Var = ((org.telegram.ui.ActionBar.g2) bnVar2).parentLayout;
                if (r4Var != null) {
                    r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar2).parentLayout;
                    ((ActionBarLayout) r4Var2).r();
                    return;
                }
                return;
            case 14:
                ((mp) obj).f50093e.w0(true);
                return;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                return;
            case 16:
                ((org.telegram.ui.Cells.r8[]) obj)[0].setChecked(!r8Var.f31813e.h);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.w2) ((h6.o) obj).f13936b).f30268y0.run();
                return;
            case 18:
                org.telegram.messenger.m10.m(3, (org.telegram.ui.ActionBar.g2) obj);
                return;
            case 19:
                final zt ztVar = (zt) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ztVar.getContext());
                String N02 = org.telegram.messenger.gd.N0(2131752086, null);
                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28835a;
                t1Var3.S = N02;
                t1Var3.U = org.telegram.messenger.gd.N0(2131752084, null);
                alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, null), new org.telegram.ui.ActionBar.q1() {
                    @Override
                    public final void i(org.telegram.ui.ActionBar.t1 t1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                ztVar.dismiss();
                                return;
                            default:
                                zt ztVar2 = ztVar;
                                ztVar2.dismiss();
                                jb.m mVar = ztVar2.V1;
                                ((y6) mVar.f17465c).o0(ztVar2.U1, ztVar2.X1, ztVar2.f54721c2);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1() {
                    @Override
                    public final void i(org.telegram.ui.ActionBar.t1 t1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                ztVar.dismiss();
                                return;
                            default:
                                zt ztVar2 = ztVar;
                                ztVar2.dismiss();
                                jb.m mVar = ztVar2.V1;
                                ((y6) mVar.f17465c).o0(ztVar2.U1, ztVar2.X1, ztVar2.f54721c2);
                                return;
                        }
                    }
                });
                t1Var3.show();
                t1Var3.i();
                return;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 21:
                ((yy) obj).e1();
                return;
            case 22:
                ((yy) ((k0) obj).f49267b).dismiss();
                return;
            case 23:
                org.telegram.ui.Components.qh0 qh0Var2 = (org.telegram.ui.Components.qh0) ((k0) obj).f49267b;
                if (!qh0Var2.b()) {
                    qh0Var2.setProgress(0.0f);
                    qh0Var2.d();
                    return;
                }
                return;
            case 24:
                ((dz) obj).c();
                return;
            case 25:
                e00 e00Var = (e00) obj;
                org.telegram.ui.Components.n80 n80Var = e00Var.f47285s;
                if ((!e00Var.f47284r || n80Var.c()) && e00Var.f47288y != null) {
                    e00Var.f47284r = true;
                    n80Var.f37710b = -1L;
                    n80Var.f37711c = -1L;
                    e00Var.f47283n.invalidate();
                    yy.g1(e00Var.I, e00Var.f47288y, new kz(e00Var, 3));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.qh0 qh0Var3 = ((f00) obj).f47655a;
                if (!qh0Var3.b()) {
                    qh0Var3.setProgress(0.0f);
                    qh0Var3.d();
                    return;
                }
                return;
            case 27:
                final i00 i00Var = (i00) obj;
                e00 e00Var2 = (e00) view.getParent();
                final org.telegram.messenger.ro currentFilter = e00Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = i00Var.f48676e;
                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(filtersSetupActivity, e00Var2);
                I.c(2131232121, org.telegram.messenger.gd.N0(2131750767, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.ro roVar = currentFilter;
                        i00 i00Var2 = i00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = i00Var2.f48676e;
                                if (roVar.f26786p) {
                                    Context context = i00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.g2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.k0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new jz(roVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = i00Var2.f48676e;
                                if (roVar.c()) {
                                    org.telegram.ui.Components.g00.h1(filtersSetupActivity3, roVar.f26773a, new r3(i00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String N03 = org.telegram.messenger.gd.N0(2131750778, null);
                                org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.f28835a;
                                t1Var4.S = N03;
                                t1Var4.U = org.telegram.messenger.gd.N0(2131750777, null);
                                alertDialog$Builder4.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131751586, null), new zs(7, i00Var2, roVar));
                                filtersSetupActivity3.showDialog(t1Var4);
                                TextView textView = (TextView) t1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.c(2131232113, org.telegram.messenger.gd.N0(2131750775, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.ro roVar = currentFilter;
                        i00 i00Var2 = i00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = i00Var2.f48676e;
                                if (roVar.f26786p) {
                                    Context context = i00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.g2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.k0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new jz(roVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = i00Var2.f48676e;
                                if (roVar.c()) {
                                    org.telegram.ui.Components.g00.h1(filtersSetupActivity3, roVar.f26773a, new r3(i00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String N03 = org.telegram.messenger.gd.N0(2131750778, null);
                                org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.f28835a;
                                t1Var4.S = N03;
                                t1Var4.U = org.telegram.messenger.gd.N0(2131750777, null);
                                alertDialog$Builder4.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131751586, null), new zs(7, i00Var2, roVar));
                                filtersSetupActivity3.showDialog(t1Var4);
                                TextView textView = (TextView) t1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (org.telegram.messenger.gd.f24314a0) {
                    I.f41873i = 3;
                }
                I.X(filtersSetupActivity.f43169a.U0(e00Var2, false));
                I.a0();
                return;
            case 28:
                ((p30) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) obj;
                lpVar.a(!lpVar.f37189a.f32938q, true);
                org.telegram.messenger.mp.g1().edit().putBoolean("callmiconstart", lpVar.f37189a.f32938q).apply();
                return;
        }
    }
}
