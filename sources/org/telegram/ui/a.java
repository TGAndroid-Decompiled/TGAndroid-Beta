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
    public final int f45396a;
    public final Object f45397b;

    public a(Object obj, int i7) {
        this.f45396a = i7;
        this.f45397b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.m6 m6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i7;
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        org.telegram.ui.Cells.r8 r8Var;
        int i10 = this.f45396a;
        Object obj = this.f45397b;
        switch (i10) {
            case 0:
                ((ai.a1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.x2[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.s0 webView = ((k3) obj).f49161f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.f50721e) {
                    org.telegram.ui.Components.b5.k(p4Var.getParentActivity(), null, new f(p4Var, 4));
                    return;
                }
                int i11 = ((o4) view).f50460e;
                if (p4Var.Z() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String M0 = org.telegram.messenger.gd.M0(2131748395, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.gd.a0("AutoDeleteConfirmMessage", null, 2131753863, org.telegram.messenger.gd.c0(i11 * 60));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.messenger.ed(19));
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751149, null), new oi.e0(5, p4Var, view));
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
                sb2.append(org.telegram.messenger.gd.M0(2131752087, null));
                if (TextUtils.isEmpty(p6Var.f49458c.f37384i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) m6Var.f37384i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28746a;
                u1Var2.S = sb3;
                u1Var2.U = org.telegram.messenger.gd.M0(2131744579, null);
                alertDialog$Builder2.k(p6Var.f49457b.f37384i, new w0(p6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                p6Var.d.showDialog(u1Var2);
                View d = u1Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.n6.f29617p7;
                    org.telegram.ui.ActionBar.u6.U((TextView) d, i12, null);
                    d.setBackground(org.telegram.ui.ActionBar.n6.J0(org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.x0(null, i12, false))));
                    return;
                }
                return;
            case 6:
                x6 x6Var = (x6) ((v6) obj).f52705f;
                x6Var.M = !x6Var.M;
                x6Var.A0(true);
                x6Var.y0();
                return;
            case 7:
                j7 j7Var = (j7) obj;
                switch (j7Var.f48893f) {
                    case 0:
                        ((k7) j7Var.h).f49205r.G.m(null, (ei.b) j7Var.getTag(), true);
                        return;
                    default:
                        ((p7) j7Var.h).f50778n.G.m(null, (ei.b) j7Var.getTag(), true);
                        return;
                }
            case 8:
                ((b0) obj).run();
                return;
            case 9:
                org.telegram.ui.Components.ph0 ph0Var = (org.telegram.ui.Components.ph0) ((di.n4) obj).f9375e;
                if (!ph0Var.b()) {
                    ph0Var.setProgress(0.0f);
                    ph0Var.d();
                    return;
                }
                return;
            case 10:
                t9 t9Var = (t9) obj;
                CameraView cameraView = t9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) t9Var.f52221s.getBackground();
                    AnimatorSet animatorSet = t9Var.f52222w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        t9Var.f52222w = null;
                    }
                    t9Var.f52222w = new AnimatorSet();
                    org.telegram.ui.Components.o6 o6Var = org.telegram.ui.Components.q6.f38714e;
                    if (t9Var.f52221s.getTag() == null) {
                        i7 = 68;
                    } else {
                        i7 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, o6Var, i7);
                    ofInt.addUpdateListener(new n9(t9Var, 1));
                    t9Var.f52222w.playTogether(ofInt);
                    t9Var.f52222w.setDuration(200L);
                    t9Var.f52222w.setInterpolator(org.telegram.ui.Components.lr.f37208f);
                    t9Var.f52222w.addListener(new ki.n3(t9Var, 20));
                    t9Var.f52222w.start();
                    if (t9Var.f52221s.getTag() == null) {
                        t9Var.f52221s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    t9Var.f52221s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 11:
                ((qc) obj).D0();
                return;
            case 12:
                bn bnVar = ((ti) obj).f52293b;
                bnVar.f46054j0.p();
                fi.n2 n2Var = bnVar.Y1;
                if (n2Var != null) {
                    n2Var.x1(0, null);
                }
                bnVar.Aa();
                return;
            case 13:
                bn bnVar2 = ((mm) obj).f49922a;
                s4Var = ((org.telegram.ui.ActionBar.h2) bnVar2).parentLayout;
                if (s4Var != null) {
                    s4Var2 = ((org.telegram.ui.ActionBar.h2) bnVar2).parentLayout;
                    ((ActionBarLayout) s4Var2).r();
                    return;
                }
                return;
            case 14:
                ((mp) obj).f49937e.w0(true);
                return;
            case 15:
                ContactsActivity.b0((ContactsActivity) obj);
                return;
            case 16:
                ((org.telegram.ui.Cells.r8[]) obj)[0].setChecked(!r8Var.f31730e.h);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.x2) ((hi.w4) obj).f15645b).f30234y0.run();
                return;
            case 18:
                org.telegram.messenger.n10.m(3, (org.telegram.ui.ActionBar.h2) obj);
                return;
            case 19:
                final au auVar = (au) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(auVar.getContext());
                String M02 = org.telegram.messenger.gd.M0(2131752087, null);
                org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.f28746a;
                u1Var3.S = M02;
                u1Var3.U = org.telegram.messenger.gd.M0(2131752085, null);
                alertDialog$Builder3.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.ui.ActionBar.r1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                auVar.dismiss();
                                return;
                            default:
                                au auVar2 = auVar;
                                auVar2.dismiss();
                                k8.a aVar = auVar2.V1;
                                ((x6) aVar.f18184c).o0(auVar2.U1, auVar2.X1, auVar2.f45675c2);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131752090, null), new org.telegram.ui.ActionBar.r1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var4, int i13) {
                        switch (r2) {
                            case 0:
                                auVar.dismiss();
                                return;
                            default:
                                au auVar2 = auVar;
                                auVar2.dismiss();
                                k8.a aVar = auVar2.V1;
                                ((x6) aVar.f18184c).o0(auVar2.U1, auVar2.X1, auVar2.f45675c2);
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
                ((zy) obj).e1();
                return;
            case 22:
                ((zy) ((k0) obj).f49141b).dismiss();
                return;
            case 23:
                org.telegram.ui.Components.ph0 ph0Var2 = (org.telegram.ui.Components.ph0) ((k0) obj).f49141b;
                if (!ph0Var2.b()) {
                    ph0Var2.setProgress(0.0f);
                    ph0Var2.d();
                    return;
                }
                return;
            case 24:
                ((ez) obj).c();
                return;
            case 25:
                f00 f00Var = (f00) obj;
                org.telegram.ui.Components.o80 o80Var = f00Var.f47415s;
                if ((!f00Var.f47414r || o80Var.c()) && f00Var.f47418y != null) {
                    f00Var.f47414r = true;
                    o80Var.f38013b = -1L;
                    o80Var.f38014c = -1L;
                    f00Var.f47413n.invalidate();
                    zy.g1(f00Var.I, f00Var.f47418y, new lz(f00Var, 3));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.ph0 ph0Var3 = ((g00) obj).f47866a;
                if (!ph0Var3.b()) {
                    ph0Var3.setProgress(0.0f);
                    ph0Var3.d();
                    return;
                }
                return;
            case 27:
                final j00 j00Var = (j00) obj;
                f00 f00Var2 = (f00) view.getParent();
                final org.telegram.messenger.ro currentFilter = f00Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = j00Var.f48831e;
                org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(filtersSetupActivity, f00Var2);
                I.c(2131232118, org.telegram.messenger.gd.M0(2131750768, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.ro roVar = currentFilter;
                        j00 j00Var2 = j00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = j00Var2.f48831e;
                                if (roVar.f26687p) {
                                    Context context = j00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.h2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.l0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new kz(roVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = j00Var2.f48831e;
                                if (roVar.c()) {
                                    org.telegram.ui.Components.g00.h1(filtersSetupActivity3, roVar.f26674a, new r3(j00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String M03 = org.telegram.messenger.gd.M0(2131750779, null);
                                org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f28746a;
                                u1Var4.S = M03;
                                u1Var4.U = org.telegram.messenger.gd.M0(2131750778, null);
                                alertDialog$Builder4.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131751587, null), new at(7, j00Var2, roVar));
                                filtersSetupActivity3.showDialog(u1Var4);
                                TextView textView = (TextView) u1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                I.c(2131232110, org.telegram.messenger.gd.M0(2131750776, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        int i14 = r3;
                        org.telegram.messenger.ro roVar = currentFilter;
                        j00 j00Var2 = j00Var;
                        switch (i14) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = j00Var2.f48831e;
                                if (roVar.f26687p) {
                                    Context context = j00Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.h2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new ug.l0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new kz(roVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = j00Var2.f48831e;
                                if (roVar.c()) {
                                    org.telegram.ui.Components.g00.h1(filtersSetupActivity3, roVar.f26674a, new r3(j00Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String M03 = org.telegram.messenger.gd.M0(2131750779, null);
                                org.telegram.ui.ActionBar.u1 u1Var4 = alertDialog$Builder4.f28746a;
                                u1Var4.S = M03;
                                u1Var4.U = org.telegram.messenger.gd.M0(2131750778, null);
                                alertDialog$Builder4.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131751587, null), new at(7, j00Var2, roVar));
                                filtersSetupActivity3.showDialog(u1Var4);
                                TextView textView = (TextView) u1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (org.telegram.messenger.gd.f24216a0) {
                    I.f42356i = 3;
                }
                I.X(filtersSetupActivity.f43049a.U0(f00Var2, false));
                I.a0();
                return;
            case 28:
                ((q30) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) obj;
                mpVar.a(!mpVar.f37598a.f32838q, true);
                org.telegram.messenger.mp.g1().edit().putBoolean("callmiconstart", mpVar.f37598a.f32838q).apply();
                return;
        }
    }
}
