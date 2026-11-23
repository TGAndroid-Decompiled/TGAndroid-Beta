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
    public final int f45406a;
    public final Object f45407b;

    public a(Object obj, int i7) {
        this.f45406a = i7;
        this.f45407b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n6 n6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i7;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.Cells.s8 s8Var;
        int i10 = this.f45406a;
        Object obj = this.f45407b;
        switch (i10) {
            case 0:
                ((ai.d1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.w2[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.s0 webView = ((k3) obj).f49139f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.f50695e) {
                    org.telegram.ui.Components.c5.k(p4Var.getParentActivity(), null, new f(p4Var, 4));
                    return;
                }
                int i11 = ((o4) view).f50458e;
                if (p4Var.Z() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String N0 = org.telegram.messenger.hd.N0(2131748394, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                    t1Var.S = N0;
                    t1Var.U = org.telegram.messenger.hd.a0("AutoDeleteConfirmMessage", null, 2131753862, org.telegram.messenger.hd.c0(i11 * 60));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), new org.telegram.messenger.fd(19));
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751148, null), new oi.e0(5, p4Var, view));
                    alertDialog$Builder.p();
                    return;
                }
                p4Var.b0(view, true);
                return;
            case 4:
                ((b5) obj).b(false);
                return;
            case 5:
                p6 p6Var = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.hd.N0(2131752086, null));
                if (TextUtils.isEmpty(p6Var.f49484c.f37758i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) n6Var.f37758i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                t1Var2.S = sb3;
                t1Var2.U = org.telegram.messenger.hd.N0(2131744573, null);
                alertDialog$Builder2.k(p6Var.f49483b.f37758i, new w0(p6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                p6Var.d.showDialog(t1Var2);
                View d = t1Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.m6.f29568p7;
                    org.telegram.ui.ActionBar.t6.U((TextView) d, i12, null);
                    d.setBackground(org.telegram.ui.ActionBar.m6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.x0(null, i12, false))));
                    return;
                }
                return;
            case 6:
                x6 x6Var = (x6) ((v6) obj).f52715f;
                x6Var.M = !x6Var.M;
                x6Var.A0(true);
                x6Var.y0();
                return;
            case 7:
                j7 j7Var = (j7) obj;
                switch (j7Var.f48922f) {
                    case 0:
                        ((k7) j7Var.h).f49183r.G.m(null, (ei.b) j7Var.getTag(), true);
                        return;
                    default:
                        ((p7) j7Var.h).f50744n.G.m(null, (ei.b) j7Var.getTag(), true);
                        return;
                }
            case 8:
                ((f0) obj).run();
                return;
            case 9:
                org.telegram.ui.Components.rh0 rh0Var = (org.telegram.ui.Components.rh0) ((di.n4) obj).f9364e;
                if (!rh0Var.b()) {
                    rh0Var.setProgress(0.0f);
                    rh0Var.d();
                    return;
                }
                return;
            case 10:
                t9 t9Var = (t9) obj;
                CameraView cameraView = t9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) t9Var.f52226s.getBackground();
                    AnimatorSet animatorSet = t9Var.f52227w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        t9Var.f52227w = null;
                    }
                    t9Var.f52227w = new AnimatorSet();
                    org.telegram.ui.Components.p6 p6Var2 = org.telegram.ui.Components.r6.f39051e;
                    if (t9Var.f52226s.getTag() == null) {
                        i7 = 68;
                    } else {
                        i7 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, p6Var2, i7);
                    ofInt.addUpdateListener(new n9(t9Var, 1));
                    t9Var.f52227w.playTogether(ofInt);
                    t9Var.f52227w.setDuration(200L);
                    t9Var.f52227w.setInterpolator(org.telegram.ui.Components.nr.f37917f);
                    t9Var.f52227w.addListener(new ki.m3(t9Var, 20));
                    t9Var.f52227w.start();
                    if (t9Var.f52226s.getTag() == null) {
                        t9Var.f52226s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    t9Var.f52226s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 11:
                ((qc) obj).D0();
                return;
            case 12:
                bn bnVar = ((ti) obj).f52284b;
                bnVar.f46025j0.p();
                fi.n2 n2Var = bnVar.Y1;
                if (n2Var != null) {
                    n2Var.x1(0, null);
                }
                bnVar.Aa();
                return;
            case 13:
                bn bnVar2 = ((mm) obj).f49910a;
                r4Var = ((org.telegram.ui.ActionBar.g2) bnVar2).parentLayout;
                if (r4Var != null) {
                    r4Var2 = ((org.telegram.ui.ActionBar.g2) bnVar2).parentLayout;
                    ((ActionBarLayout) r4Var2).r();
                    return;
                }
                return;
            case 14:
                ((mp) obj).f49923e.w0(true);
                return;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                return;
            case 16:
                ((org.telegram.ui.Cells.s8[]) obj)[0].setChecked(!s8Var.f31780e.h);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.w2) ((hi.x4) obj).f15680b).f30184y0.run();
                return;
            case 18:
                org.telegram.messenger.o10.m(3, (org.telegram.ui.ActionBar.g2) obj);
                return;
            case 19:
                final au auVar = (au) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(auVar.getContext());
                String N02 = org.telegram.messenger.hd.N0(2131752086, null);
                org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder3.f28743a;
                t1Var3.S = N02;
                t1Var3.U = org.telegram.messenger.hd.N0(2131752084, null);
                alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, null), new org.telegram.ui.ActionBar.q1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                auVar.dismiss();
                                return;
                            default:
                                au auVar2 = auVar;
                                auVar2.dismiss();
                                k8.a aVar = auVar2.V1;
                                ((x6) aVar.f18178c).o0(auVar2.U1, auVar2.X1, auVar2.f45652c2);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                auVar.dismiss();
                                return;
                            default:
                                au auVar2 = auVar;
                                auVar2.dismiss();
                                k8.a aVar = auVar2.V1;
                                ((x6) aVar.f18178c).o0(auVar2.U1, auVar2.X1, auVar2.f45652c2);
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
                ((zy) obj).e1();
                return;
            case 22:
                ((zy) ((k0) obj).f49119b).dismiss();
                return;
            case 23:
                org.telegram.ui.Components.rh0 rh0Var2 = (org.telegram.ui.Components.rh0) ((k0) obj).f49119b;
                if (!rh0Var2.b()) {
                    rh0Var2.setProgress(0.0f);
                    rh0Var2.d();
                    return;
                }
                return;
            case 24:
                ((ez) obj).c();
                return;
            case 25:
                f00 f00Var = (f00) obj;
                org.telegram.ui.Components.q80 q80Var = f00Var.f47405s;
                if ((!f00Var.f47404r || q80Var.c()) && f00Var.f47408y != null) {
                    f00Var.f47404r = true;
                    q80Var.f38767b = -1L;
                    q80Var.f38768c = -1L;
                    f00Var.f47403n.invalidate();
                    zy.g1(f00Var.I, f00Var.f47408y, new lz(f00Var, 3));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.rh0 rh0Var3 = ((g00) obj).f47851a;
                if (!rh0Var3.b()) {
                    rh0Var3.setProgress(0.0f);
                    rh0Var3.d();
                    return;
                }
                return;
            case 27:
                final j00 j00Var = (j00) obj;
                f00 f00Var2 = (f00) view.getParent();
                final org.telegram.messenger.so currentFilter = f00Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = j00Var.f48860e;
                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(filtersSetupActivity, f00Var2);
                I.c(2131232118, org.telegram.messenger.hd.N0(2131750767, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.so soVar = currentFilter;
                        j00 j00Var2 = j00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = j00Var2.f48860e;
                                if (soVar.f26863p) {
                                    Context context = j00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.g2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.k0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new kz(soVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = j00Var2.f48860e;
                                if (soVar.c()) {
                                    org.telegram.ui.Components.i00.h1(filtersSetupActivity3, soVar.f26850a, new r3(j00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String N03 = org.telegram.messenger.hd.N0(2131750778, null);
                                org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.f28743a;
                                t1Var4.S = N03;
                                t1Var4.U = org.telegram.messenger.hd.N0(2131750777, null);
                                alertDialog$Builder4.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131751586, null), new at(7, j00Var2, soVar));
                                filtersSetupActivity3.showDialog(t1Var4);
                                TextView textView = (TextView) t1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.c(2131232110, org.telegram.messenger.hd.N0(2131750775, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.so soVar = currentFilter;
                        j00 j00Var2 = j00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = j00Var2.f48860e;
                                if (soVar.f26863p) {
                                    Context context = j00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.g2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.k0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new kz(soVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = j00Var2.f48860e;
                                if (soVar.c()) {
                                    org.telegram.ui.Components.i00.h1(filtersSetupActivity3, soVar.f26850a, new r3(j00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String N03 = org.telegram.messenger.hd.N0(2131750778, null);
                                org.telegram.ui.ActionBar.t1 t1Var4 = alertDialog$Builder4.f28743a;
                                t1Var4.S = N03;
                                t1Var4.U = org.telegram.messenger.hd.N0(2131750777, null);
                                alertDialog$Builder4.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131751586, null), new at(7, j00Var2, soVar));
                                filtersSetupActivity3.showDialog(t1Var4);
                                TextView textView = (TextView) t1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (org.telegram.messenger.hd.f24408a0) {
                    I.f33344i = 3;
                }
                I.X(filtersSetupActivity.f43059a.U0(f00Var2, false));
                I.a0();
                return;
            case 28:
                ((q30) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.op opVar = (org.telegram.ui.Components.op) obj;
                opVar.a(!opVar.f38291a.f32840q, true);
                org.telegram.messenger.np.g1().edit().putBoolean("callmiconstart", opVar.f38291a.f32840q).apply();
                return;
        }
    }
}
