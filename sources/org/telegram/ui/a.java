package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a implements View.OnClickListener {
    public final int f35231a;
    public final Object f35232b;

    public a(Object obj, int i10) {
        this.f35231a = i10;
        this.f35232b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.p6 p6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.Cells.v8 v8Var;
        Runnable runnable;
        int i11 = this.f35231a;
        Object obj = this.f35232b;
        switch (i11) {
            case 0:
                ((ah.o) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.x0 webView = ((o3) obj).f39755f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                v4 v4Var = (v4) obj;
                if (view == v4Var.e) {
                    org.telegram.ui.Components.f5.j(v4Var.getParentActivity(), null, new g(v4Var, 4));
                    return;
                }
                int i12 = ((u4) view).e;
                if (v4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(17));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.w0(6, v4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                v4Var.W(view, true);
                return;
            case 4:
                ((h5) obj).b(false);
                return;
            case 5:
                ((c7) obj).m0();
                return;
            case 6:
                s6 s6Var = (s6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(s6Var.f39783c.f29231i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) p6Var.f29231i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20605a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(s6Var.f39782b.f29231i, new b1(s6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                s6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.h6.f21211p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                c7 c7Var = ((a7) obj).e;
                c7Var.M = !c7Var.M;
                c7Var.w0(true);
                c7Var.v0();
                return;
            case 8:
                n7 n7Var = (n7) obj;
                switch (n7Var.f39442f) {
                    case 0:
                        ((o7) n7Var.h).f39789r.v.s0(null, (bi.b) n7Var.getTag(), true);
                        return;
                    default:
                        ((t7) n7Var.h).f41612n.v.s0(null, (bi.b) n7Var.getTag(), true);
                        return;
                }
            case 9:
                ((i4) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.yj0 yj0Var = ((j9) obj).d;
                if (!yj0Var.b()) {
                    yj0Var.setProgress(0.0f);
                    yj0Var.d();
                    return;
                }
                return;
            case 11:
                w9 w9Var = (w9) obj;
                CameraView cameraView = w9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) w9Var.f42513s.getBackground();
                    AnimatorSet animatorSet = w9Var.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        w9Var.v = null;
                    }
                    w9Var.v = new AnimatorSet();
                    org.telegram.ui.Components.r6 r6Var = org.telegram.ui.Components.t6.e;
                    if (w9Var.f42513s.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, r6Var, i10);
                    ofInt.addUpdateListener(new q9(w9Var, 1));
                    w9Var.v.playTogether(ofInt);
                    w9Var.v.setDuration(200L);
                    w9Var.v.setInterpolator(org.telegram.ui.Components.bs.f25021f);
                    w9Var.v.addListener(new m.a(w9Var, 8));
                    w9Var.v.start();
                    if (w9Var.f42513s.getTag() == null) {
                        w9Var.f42513s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    w9Var.f42513s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((bd) obj).w0();
                return;
            case 13:
                qn qnVar = ((fj) obj).f37020b;
                qnVar.f40701h0.n();
                ci.b3 b3Var = qnVar.J1;
                if (b3Var != null) {
                    b3Var.L1(null, 0);
                }
                qnVar.ca();
                return;
            case 14:
                qn qnVar2 = ((cn) obj).f36011a;
                d5Var = ((org.telegram.ui.ActionBar.n2) qnVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) qnVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    return;
                }
                return;
            case 15:
                ((aq) obj).e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.v8[]) obj)[0].setChecked(!v8Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f20613a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.mk.n(3, (org.telegram.ui.ActionBar.n2) obj);
                return;
            case 19:
                final vu vuVar = (vu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20605a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                vuVar.dismiss();
                                return;
                            default:
                                vu vuVar2 = vuVar;
                                vuVar2.dismiss();
                                n2.e eVar = vuVar2.Z;
                                ((c7) eVar.f17040c).l0(vuVar2.Y, vuVar2.f42372b0, vuVar2.f42377g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                vuVar.dismiss();
                                return;
                            default:
                                vu vuVar2 = vuVar;
                                vuVar2.dismiss();
                                n2.e eVar = vuVar2.Z;
                                ((c7) eVar.f17040c).l0(vuVar2.Y, vuVar2.f42372b0, vuVar2.f42377g0);
                                return;
                        }
                    }
                });
                b2Var3.show();
                b2Var3.i();
                return;
            case 20:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 21:
                String str2 = (String) obj;
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null) {
                    applicationLoader.onSuggestionClick(str2);
                    return;
                }
                return;
            case 22:
                ((a00) obj).R();
                return;
            case 23:
                ((zz) obj).f43828a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.yj0 yj0Var2 = ((d00) obj).f36213a;
                if (!yj0Var2.b()) {
                    yj0Var2.setProgress(0.0f);
                    yj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((g00) obj).c();
                return;
            case 26:
                h10 h10Var = (h10) obj;
                org.telegram.ui.Components.ba0 ba0Var = h10Var.f37461s;
                if ((!h10Var.f37460r || ba0Var.c()) && h10Var.f37463x != null) {
                    h10Var.f37460r = true;
                    ba0Var.f24858b = -1L;
                    ba0Var.f24859c = -1L;
                    h10Var.f37459n.invalidate();
                    a00.T(h10Var.E, h10Var.f37463x, new dz(h10Var, 4));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.yj0 yj0Var3 = ((i10) obj).f37832a;
                if (!yj0Var3.b()) {
                    yj0Var3.setProgress(0.0f);
                    yj0Var3.d();
                    return;
                }
                return;
            case 28:
                final l10 l10Var = (l10) obj;
                h10 h10Var2 = (h10) view.getParent();
                final MessagesController.DialogFilter currentFilter = h10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = l10Var.e;
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(filtersSetupActivity, h10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                l10 l10Var2 = l10Var;
                                FiltersSetupActivity filtersSetupActivity2 = l10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = l10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.k0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new n00(dialogFilter, null));
                                return;
                            default:
                                l10 l10Var3 = l10Var;
                                FiltersSetupActivity filtersSetupActivity3 = l10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.k10.U(filtersSetupActivity3, dialogFilter2.f17799id, new v3(l10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20605a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20605a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new xu(6, l10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20605a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                l10 l10Var2 = l10Var;
                                FiltersSetupActivity filtersSetupActivity2 = l10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = l10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.k0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new n00(dialogFilter, null));
                                return;
                            default:
                                l10 l10Var3 = l10Var;
                                FiltersSetupActivity filtersSetupActivity3 = l10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.k10.U(filtersSetupActivity3, dialogFilter2.f17799id, new v3(l10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20605a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20605a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new xu(6, l10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20605a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f27167i = 3;
                }
                H.W(filtersSetupActivity.f33141a.V0(h10Var2, false));
                H.Z();
                return;
            default:
                ((a50) obj).dismiss();
                return;
        }
    }
}
