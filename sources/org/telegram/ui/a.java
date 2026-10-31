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
    public final int f35490a;
    public final Object f35491b;

    public a(Object obj, int i10) {
        this.f35490a = i10;
        this.f35491b = obj;
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
        int i11 = this.f35490a;
        Object obj = this.f35491b;
        switch (i11) {
            case 0:
                ((ag.o0) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.z2[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.v0 webView = ((l3) obj).f39040f.getWebView();
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
                if (p4Var.Y() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131748602, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.a0("AutoDeleteConfirmMessage", null, 2131753865, org.telegram.messenger.cd.c0(i12 * 60));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.messenger.e9(28));
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751161, null), new ng.d(3, p4Var, view));
                    alertDialog$Builder.p();
                    return;
                }
                p4Var.a0(view, true);
                return;
            case 4:
                ((a5) obj).b(false);
                return;
            case 5:
                q6 q6Var = (q6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(q6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.cd.L0(2131752098, null));
                if (TextUtils.isEmpty(q6Var.f39479c.f25700i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) e6Var.f25700i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                x1Var2.R = sb3;
                x1Var2.T = org.telegram.messenger.cd.L0(2131744832, null);
                alertDialog$Builder2.k(q6Var.f39478b.f25700i, new y0(q6Var, 9));
                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                q6Var.d.showDialog(x1Var2);
                View d = x1Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.t6.f21153p7;
                    org.telegram.ui.ActionBar.a7.V((TextView) d, i13, null);
                    d.setBackground(org.telegram.ui.ActionBar.t6.J0(org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.x0(null, i13, false))));
                    return;
                }
                return;
            case 6:
                y6 y6Var = (y6) ((w6) obj).f42883f;
                y6Var.L = !y6Var.L;
                y6Var.z0(true);
                y6Var.x0();
                return;
            case 7:
                k7 k7Var = (k7) obj;
                switch (k7Var.f38712f) {
                    case 0:
                        ((l7) k7Var.h).f39076r.F.a(null, (sh.a) k7Var.getTag(), true);
                        return;
                    default:
                        ((q7) k7Var.h).f40890n.F.a(null, (sh.a) k7Var.getTag(), true);
                        return;
                }
            case 8:
                ((ag.o0) obj).run();
                return;
            case 9:
                org.telegram.ui.Components.ei0 ei0Var = (org.telegram.ui.Components.ei0) ((jg.b1) obj).e;
                if (!ei0Var.b()) {
                    ei0Var.setProgress(0.0f);
                    ei0Var.d();
                    return;
                }
                return;
            case 10:
                u9 u9Var = (u9) obj;
                CameraView cameraView = u9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.f42089s.getBackground();
                    AnimatorSet animatorSet = u9Var.f42090w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        u9Var.f42090w = null;
                    }
                    u9Var.f42090w = new AnimatorSet();
                    org.telegram.ui.Components.g6 g6Var = org.telegram.ui.Components.i6.e;
                    if (u9Var.f42089s.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, g6Var, i10);
                    ofInt.addUpdateListener(new n9(u9Var, 1));
                    u9Var.f42090w.playTogether(ofInt);
                    u9Var.f42090w.setDuration(200L);
                    u9Var.f42090w.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                    u9Var.f42090w.addListener(new s9(u9Var, 0));
                    u9Var.f42090w.start();
                    if (u9Var.f42089s.getTag() == null) {
                        u9Var.f42089s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    u9Var.f42089s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 11:
                ((zc) obj).C0();
                return;
            case 12:
                un unVar = ((nj) obj).f39956b;
                unVar.f42279i0.o();
                ag.v vVar = unVar.X1;
                if (vVar != null) {
                    vVar.v1(0, null);
                }
                unVar.na();
                return;
            case 13:
                un unVar2 = ((fn) obj).f37301a;
                z4Var = ((org.telegram.ui.ActionBar.k2) unVar2).parentLayout;
                if (z4Var != null) {
                    z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar2).parentLayout;
                    ((ActionBarLayout) z4Var2).r();
                    return;
                }
                return;
            case 14:
                ((hq) obj).e.v0(true);
                return;
            case 15:
                ContactsActivity.a0((ContactsActivity) obj);
                return;
            case 16:
                ((org.telegram.ui.Cells.t8[]) obj)[0].setChecked(!t8Var.e.h);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.z2) ((l2.f) obj).f11587b).f21621x0.run();
                return;
            case 18:
                org.telegram.messenger.z20.k(3, (org.telegram.ui.ActionBar.k2) obj);
                return;
            case 19:
                final zu zuVar = (zu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(zuVar.getContext());
                String L02 = org.telegram.messenger.cd.L0(2131752098, null);
                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.f20134a;
                x1Var3.R = L02;
                x1Var3.T = org.telegram.messenger.cd.L0(2131752096, null);
                alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.ActionBar.u1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i14) {
                        switch (r2) {
                            case 0:
                                zuVar.dismiss();
                                return;
                            default:
                                zu zuVar2 = zuVar;
                                zuVar2.dismiss();
                                m4.c cVar = zuVar2.R1;
                                ((y6) cVar.f12706c).n0(zuVar2.Q1, zuVar2.T1, zuVar2.Y1);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var4, int i14) {
                        switch (r2) {
                            case 0:
                                zuVar.dismiss();
                                return;
                            default:
                                zu zuVar2 = zuVar;
                                zuVar2.dismiss();
                                m4.c cVar = zuVar2.R1;
                                ((y6) cVar.f12706c).n0(zuVar2.Q1, zuVar2.T1, zuVar2.Y1);
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
                ((wz) obj).d1();
                return;
            case 22:
                ((wz) ((l0) obj).f39006b).dismiss();
                return;
            case 23:
                org.telegram.ui.Components.ei0 ei0Var2 = (org.telegram.ui.Components.ei0) ((l0) obj).f39006b;
                if (!ei0Var2.b()) {
                    ei0Var2.setProgress(0.0f);
                    ei0Var2.d();
                    return;
                }
                return;
            case 24:
                ((c00) obj).c();
                return;
            case 25:
                b10 b10Var = (b10) obj;
                org.telegram.ui.Components.t80 t80Var = b10Var.f35938s;
                if ((!b10Var.f35937r || t80Var.c()) && b10Var.f35941y != null) {
                    b10Var.f35937r = true;
                    t80Var.f30502b = -1L;
                    t80Var.f30503c = -1L;
                    b10Var.f35936n.invalidate();
                    wz.f1(b10Var.H, b10Var.f35941y, new zy(b10Var, 4));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.ei0 ei0Var3 = ((c10) obj).f36370a;
                if (!ei0Var3.b()) {
                    ei0Var3.setProgress(0.0f);
                    ei0Var3.d();
                    return;
                }
                return;
            case 27:
                final f10 f10Var = (f10) obj;
                b10 b10Var2 = (b10) view.getParent();
                final org.telegram.messenger.ap currentFilter = b10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = f10Var.e;
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(filtersSetupActivity, b10Var2);
                H.c(2131232115, org.telegram.messenger.cd.L0(2131750780, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        int i15 = r3;
                        org.telegram.messenger.ap apVar = currentFilter;
                        f10 f10Var2 = f10Var;
                        switch (i15) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = f10Var2.e;
                                if (apVar.f14657p) {
                                    Context context = f10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.k2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new kg.q0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new i00(apVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = f10Var2.e;
                                if (apVar.d()) {
                                    org.telegram.ui.Components.j00.g1(filtersSetupActivity3, apVar.f14645a, new s3(f10Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String L03 = org.telegram.messenger.cd.L0(2131750791, null);
                                org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.f20134a;
                                x1Var4.R = L03;
                                x1Var4.T = org.telegram.messenger.cd.L0(2131750790, null);
                                alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131751599, null), new rv(5, f10Var2, apVar));
                                filtersSetupActivity3.showDialog(x1Var4);
                                TextView textView = (TextView) x1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(2131232107, org.telegram.messenger.cd.L0(2131750788, null), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        int i15 = r3;
                        org.telegram.messenger.ap apVar = currentFilter;
                        f10 f10Var2 = f10Var;
                        switch (i15) {
                            case 0:
                                FiltersSetupActivity filtersSetupActivity2 = f10Var2.e;
                                if (apVar.f14657p) {
                                    Context context = f10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.k2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new kg.q0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new i00(apVar, null));
                                return;
                            default:
                                FiltersSetupActivity filtersSetupActivity3 = f10Var2.e;
                                if (apVar.d()) {
                                    org.telegram.ui.Components.j00.g1(filtersSetupActivity3, apVar.f14645a, new s3(f10Var2, 7));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                String L03 = org.telegram.messenger.cd.L0(2131750791, null);
                                org.telegram.ui.ActionBar.x1 x1Var4 = alertDialog$Builder4.f20134a;
                                x1Var4.R = L03;
                                x1Var4.T = org.telegram.messenger.cd.L0(2131750790, null);
                                alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131751599, null), new rv(5, f10Var2, apVar));
                                filtersSetupActivity3.showDialog(x1Var4);
                                TextView textView = (TextView) x1Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (org.telegram.messenger.cd.X) {
                    H.f32923i = 3;
                }
                H.W(filtersSetupActivity.f33331a.U0(b10Var2, false));
                H.Z();
                return;
            case 28:
                ((m40) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.ep epVar = (org.telegram.ui.Components.ep) obj;
                epVar.a(!epVar.f25836a.f23919q, true);
                org.telegram.messenger.vp.d1().edit().putBoolean("callmiconstart", epVar.f25836a.f23919q).apply();
                return;
        }
    }
}
