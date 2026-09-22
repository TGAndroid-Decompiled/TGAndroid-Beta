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
    public final int f31639a;
    public final Object f31640b;

    public a(Object obj, int i10) {
        this.f31639a = i10;
        this.f31640b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.m6 m6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i11 = this.f31639a;
        Object obj = this.f31640b;
        switch (i11) {
            case 0:
                ((ai.s1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.z0 webView = ((l3) obj).f35309f.getWebView();
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
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.u0(13));
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
                ((z6) obj).m0();
                return;
            case 6:
                p6 p6Var = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(p6Var.f35330c.f26088g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) m6Var.f26088g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18435a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var.f35329b.f26088g, new y0(p6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.i6.f19053p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.i6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                z6 z6Var = ((x6) obj).e;
                z6Var.M = !z6Var.M;
                z6Var.w0(true);
                z6Var.v0();
                return;
            case 8:
                k7 k7Var = (k7) obj;
                switch (k7Var.f35075f) {
                    case 0:
                        ((l7) k7Var.h).f35333r.v.H0(null, (zh.a) k7Var.getTag(), true);
                        return;
                    default:
                        ((q7) k7Var.h).f36778n.v.H0(null, (zh.a) k7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ai.s1) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.aj0 aj0Var = ((h9) obj).d;
                if (!aj0Var.b()) {
                    aj0Var.setProgress(0.0f);
                    aj0Var.d();
                    return;
                }
                return;
            case 11:
                u9 u9Var = (u9) obj;
                CameraView cameraView = u9Var.f37853c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.f37859r.getBackground();
                    AnimatorSet animatorSet = u9Var.f37860s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        u9Var.f37860s = null;
                    }
                    u9Var.f37860s = new AnimatorSet();
                    org.telegram.ui.Components.o6 o6Var = org.telegram.ui.Components.q6.e;
                    if (u9Var.f37859r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, o6Var, i10);
                    ofInt.addUpdateListener(new o9(u9Var, 1));
                    u9Var.f37860s.playTogether(ofInt);
                    u9Var.f37860s.setDuration(200L);
                    u9Var.f37860s.setInterpolator(org.telegram.ui.Components.qr.f27420f);
                    u9Var.f37860s.addListener(new t4(u9Var, 3));
                    u9Var.f37860s.start();
                    if (u9Var.f37859r.getTag() == null) {
                        u9Var.f37859r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    u9Var.f37859r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((ad) obj).w0();
                return;
            case 13:
                bo boVar = ((nj) obj).f35998b;
                boVar.f32319h0.n();
                ai.g4 g4Var = boVar.J1;
                if (g4Var != null) {
                    g4Var.I1(null, 0);
                }
                boVar.X9();
                return;
            case 14:
                bo boVar2 = ((nn) obj).f36017a;
                d5Var = ((org.telegram.ui.ActionBar.n2) boVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) boVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
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
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f18440a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.vl.n(3, (org.telegram.ui.ActionBar.n2) obj);
                return;
            case 19:
                final jv jvVar = (jv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(jvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f18435a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                jvVar.dismiss();
                                return;
                            default:
                                jv jvVar2 = jvVar;
                                jvVar2.dismiss();
                                o0.a aVar = jvVar2.Z;
                                ((z6) aVar.f15299c).l0(jvVar2.Y, jvVar2.f34991b0, jvVar2.f34996g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                jvVar.dismiss();
                                return;
                            default:
                                jv jvVar2 = jvVar;
                                jvVar2.dismiss();
                                o0.a aVar = jvVar2.Z;
                                ((z6) aVar.f15299c).l0(jvVar2.Y, jvVar2.f34991b0, jvVar2.f34996g0);
                                return;
                        }
                    }
                });
                b2Var3.show();
                b2Var3.h();
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
                ((r00) obj).Q();
                return;
            case 23:
                ((q00) obj).f36724a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.aj0 aj0Var2 = ((v00) obj).f38337a;
                if (!aj0Var2.b()) {
                    aj0Var2.setProgress(0.0f);
                    aj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((y00) obj).c();
                return;
            case 26:
                z10 z10Var = (z10) obj;
                org.telegram.ui.Components.g90 g90Var = z10Var.f40013s;
                if ((!z10Var.f40012r || g90Var.b()) && z10Var.f40015x != null) {
                    z10Var.f40012r = true;
                    g90Var.f24259b = -1L;
                    g90Var.f24260c = -1L;
                    z10Var.f40011n.invalidate();
                    r00.S(z10Var.E, z10Var.f40015x, new g10(z10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.aj0 aj0Var3 = ((a20) obj).f31659a;
                if (!aj0Var3.b()) {
                    aj0Var3.setProgress(0.0f);
                    aj0Var3.d();
                    return;
                }
                return;
            case 28:
                final e20 e20Var = (e20) obj;
                z10 z10Var2 = (z10) view.getParent();
                final MessagesController.DialogFilter currentFilter = z10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = e20Var.e;
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(filtersSetupActivity, z10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                e20 e20Var2 = e20Var;
                                FiltersSetupActivity filtersSetupActivity2 = e20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = e20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                return;
                            default:
                                e20 e20Var3 = e20Var;
                                FiltersSetupActivity filtersSetupActivity3 = e20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.f15601id, new s3(e20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18435a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18435a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new d20(0, e20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f18435a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19071q7, false));
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
                                e20 e20Var2 = e20Var;
                                FiltersSetupActivity filtersSetupActivity2 = e20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = e20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                return;
                            default:
                                e20 e20Var3 = e20Var;
                                FiltersSetupActivity filtersSetupActivity3 = e20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.f15601id, new s3(e20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18435a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18435a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new d20(0, e20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f18435a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19071q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f26349i = 3;
                }
                H.W(filtersSetupActivity.f30796a.V0(z10Var2, false));
                H.Z();
                return;
            default:
                ((r50) obj).dismiss();
                return;
        }
    }
}
