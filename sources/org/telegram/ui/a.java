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
    public final int f31653a;
    public final Object f31654b;

    public a(Object obj, int i10) {
        this.f31653a = i10;
        this.f31654b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.m6 m6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i11 = this.f31653a;
        Object obj = this.f31654b;
        switch (i11) {
            case 0:
                ((ai.s1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.g3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.z0 webView = ((l3) obj).f35432f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.e) {
                    org.telegram.ui.Components.c5.k(p4Var.getParentActivity(), null, new g(p4Var, 4));
                    return;
                }
                int i12 = ((o4) view).e;
                if (p4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.u0(14));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ah.b(29, p4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                p4Var.W(view, true);
                return;
            case 4:
                ((c5) obj).b(false);
                return;
            case 5:
                ((a7) obj).m0();
                return;
            case 6:
                q6 q6Var = (q6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(q6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(q6Var.f35692c.f26070g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) m6Var.f26070g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f18446a;
                c2Var2.R = sb3;
                c2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(q6Var.f35691b.f26070g, new y0(q6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                q6Var.d.showDialog(c2Var2);
                View d = c2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.j6.f19082p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                a7 a7Var = ((y6) obj).e;
                a7Var.L = !a7Var.L;
                a7Var.y0(true);
                a7Var.w0();
                return;
            case 8:
                m7 m7Var = (m7) obj;
                switch (m7Var.f35699f) {
                    case 0:
                        ((n7) m7Var.h).f35955r.E.H0(null, (zh.a) m7Var.getTag(), true);
                        return;
                    default:
                        ((s7) m7Var.h).f37396n.E.H0(null, (zh.a) m7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ai.s1) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.bj0 bj0Var = ((j9) obj).d;
                if (!bj0Var.b()) {
                    bj0Var.setProgress(0.0f);
                    bj0Var.d();
                    return;
                }
                return;
            case 11:
                w9 w9Var = (w9) obj;
                CameraView cameraView = w9Var.f38604c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) w9Var.f38610r.getBackground();
                    AnimatorSet animatorSet = w9Var.f38611s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        w9Var.f38611s = null;
                    }
                    w9Var.f38611s = new AnimatorSet();
                    org.telegram.ui.Components.o6 o6Var = org.telegram.ui.Components.q6.e;
                    if (w9Var.f38610r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, o6Var, i10);
                    ofInt.addUpdateListener(new q9(w9Var, 1));
                    w9Var.f38611s.playTogether(ofInt);
                    w9Var.f38611s.setDuration(200L);
                    w9Var.f38611s.setInterpolator(org.telegram.ui.Components.qr.f27380f);
                    w9Var.f38611s.addListener(new t4(w9Var, 3));
                    w9Var.f38611s.start();
                    if (w9Var.f38610r.getTag() == null) {
                        w9Var.f38610r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    w9Var.f38610r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((cd) obj).w0();
                return;
            case 13:
                bo boVar = ((oj) obj).f36362b;
                boVar.f32302h0.n();
                ai.g4 g4Var = boVar.J1;
                if (g4Var != null) {
                    g4Var.I1(null, 0);
                }
                boVar.X9();
                return;
            case 14:
                bo boVar2 = ((nn) obj).f36134a;
                e5Var = ((org.telegram.ui.ActionBar.o2) boVar2).parentLayout;
                if (e5Var != null) {
                    e5Var2 = ((org.telegram.ui.ActionBar.o2) boVar2).parentLayout;
                    ((ActionBarLayout) e5Var2).r();
                    return;
                }
                return;
            case 15:
                ((oq) obj).e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!w8Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.b3) obj).f18470a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.wl.m(3, (org.telegram.ui.ActionBar.o2) obj);
                return;
            case 19:
                final lv lvVar = (lv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(lvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f18446a;
                c2Var3.R = string2;
                c2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                lvVar.dismiss();
                                return;
                            default:
                                lv lvVar2 = lvVar;
                                lvVar2.dismiss();
                                o0.a aVar = lvVar2.Z;
                                ((a7) aVar.f15311c).l0(lvVar2.Y, lvVar2.f35629b0, lvVar2.f35634g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                lvVar.dismiss();
                                return;
                            default:
                                lv lvVar2 = lvVar;
                                lvVar2.dismiss();
                                o0.a aVar = lvVar2.Z;
                                ((a7) aVar.f15311c).l0(lvVar2.Y, lvVar2.f35629b0, lvVar2.f35634g0);
                                return;
                        }
                    }
                });
                c2Var3.show();
                c2Var3.h();
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
                ((t00) obj).Q();
                return;
            case 23:
                ((s00) obj).f37349a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.bj0 bj0Var2 = ((x00) obj).f39336a;
                if (!bj0Var2.b()) {
                    bj0Var2.setProgress(0.0f);
                    bj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((a10) obj).c();
                return;
            case 26:
                b20 b20Var = (b20) obj;
                org.telegram.ui.Components.g90 g90Var = b20Var.f32032s;
                if ((!b20Var.f32031r || g90Var.b()) && b20Var.f32034x != null) {
                    b20Var.f32031r = true;
                    g90Var.f24131b = -1L;
                    g90Var.f24132c = -1L;
                    b20Var.f32030n.invalidate();
                    t00.S(b20Var.E, b20Var.f32034x, new i10(b20Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.bj0 bj0Var3 = ((c20) obj).f32644a;
                if (!bj0Var3.b()) {
                    bj0Var3.setProgress(0.0f);
                    bj0Var3.d();
                    return;
                }
                return;
            case 28:
                final g20 g20Var = (g20) obj;
                b20 b20Var2 = (b20) view.getParent();
                final MessagesController.DialogFilter currentFilter = b20Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = g20Var.e;
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(filtersSetupActivity, b20Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                g20 g20Var2 = g20Var;
                                FiltersSetupActivity filtersSetupActivity2 = g20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = g20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new h10(dialogFilter, null));
                                return;
                            default:
                                g20 g20Var3 = g20Var;
                                FiltersSetupActivity filtersSetupActivity3 = g20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.f15613id, new s3(g20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18446a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18446a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new f20(0, g20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f18446a;
                                filtersSetupActivity3.showDialog(c2Var4);
                                TextView textView = (TextView) c2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
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
                                g20 g20Var2 = g20Var;
                                FiltersSetupActivity filtersSetupActivity2 = g20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = g20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new h10(dialogFilter, null));
                                return;
                            default:
                                g20 g20Var3 = g20Var;
                                FiltersSetupActivity filtersSetupActivity3 = g20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.f15613id, new s3(g20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18446a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18446a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new f20(0, g20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f18446a;
                                filtersSetupActivity3.showDialog(c2Var4);
                                TextView textView = (TextView) c2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f26366i = 3;
                }
                H.W(filtersSetupActivity.f30813a.W0(b20Var2, false));
                H.Z();
                return;
            default:
                ((t50) obj).dismiss();
                return;
        }
    }
}
