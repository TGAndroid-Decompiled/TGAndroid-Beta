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
    public final int f31928a;
    public final Object f31929b;

    public a(Object obj, int i10) {
        this.f31928a = i10;
        this.f31929b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.o6 o6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i11 = this.f31928a;
        Object obj = this.f31929b;
        switch (i11) {
            case 0:
                ((ai.s1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.e3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.y0 webView = ((m3) obj).f35462f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.e) {
                    org.telegram.ui.Components.e5.k(p4Var.getParentActivity(), null, new g(p4Var, 4));
                    return;
                }
                int i12 = ((o4) view).e;
                if (p4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.o0(29));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new o(2, p4Var, view));
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
                o6 o6Var2 = (o6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o6Var2.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(o6Var2.f34947c.f26932g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) o6Var.f26932g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f18661a;
                a2Var2.R = sb3;
                a2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(o6Var2.f34946b.f26932g, new z0(o6Var2, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                o6Var2.d.showDialog(a2Var2);
                View d = a2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.h6.f19279p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.h6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, i13, false))));
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
                switch (k7Var.f34958f) {
                    case 0:
                        ((l7) k7Var.h).f35232r.v.H0(null, (zh.a) k7Var.getTag(), true);
                        return;
                    default:
                        ((q7) k7Var.h).f36808n.v.H0(null, (zh.a) k7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ai.s1) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.lj0 lj0Var = ((h9) obj).d;
                if (!lj0Var.b()) {
                    lj0Var.setProgress(0.0f);
                    lj0Var.d();
                    return;
                }
                return;
            case 11:
                u9 u9Var = (u9) obj;
                CameraView cameraView = u9Var.f38359c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.f38365r.getBackground();
                    AnimatorSet animatorSet = u9Var.f38366s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        u9Var.f38366s = null;
                    }
                    u9Var.f38366s = new AnimatorSet();
                    org.telegram.ui.Components.q6 q6Var = org.telegram.ui.Components.s6.e;
                    if (u9Var.f38365r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, q6Var, i10);
                    ofInt.addUpdateListener(new o9(u9Var, 1));
                    u9Var.f38366s.playTogether(ofInt);
                    u9Var.f38366s.setDuration(200L);
                    u9Var.f38366s.setInterpolator(org.telegram.ui.Components.rr.f28030f);
                    u9Var.f38366s.addListener(new t4(u9Var, 3));
                    u9Var.f38366s.start();
                    if (u9Var.f38365r.getTag() == null) {
                        u9Var.f38365r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    u9Var.f38365r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((ad) obj).w0();
                return;
            case 13:
                wn wnVar = ((kj) obj).f35077b;
                wnVar.f39495h0.n();
                ai.g4 g4Var = wnVar.J1;
                if (g4Var != null) {
                    g4Var.I1(null, 0);
                }
                wnVar.X9();
                return;
            case 14:
                wn wnVar2 = ((in) obj).f34557a;
                b5Var = ((org.telegram.ui.ActionBar.m2) wnVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.m2) wnVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    return;
                }
                return;
            case 15:
                ((jq) obj).e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!w8Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.z2) obj).f19949a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.ok.m(3, (org.telegram.ui.ActionBar.m2) obj);
                return;
            case 19:
                final fv fvVar = (fv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(fvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.f18661a;
                a2Var3.R = string2;
                a2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                fvVar.dismiss();
                                return;
                            default:
                                fv fvVar2 = fvVar;
                                fvVar2.dismiss();
                                o0.a aVar = fvVar2.Z;
                                ((z6) aVar.f15483c).l0(fvVar2.Y, fvVar2.f33765b0, fvVar2.f33770g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                fvVar.dismiss();
                                return;
                            default:
                                fv fvVar2 = fvVar;
                                fvVar2.dismiss();
                                o0.a aVar = fvVar2.Z;
                                ((z6) aVar.f15483c).l0(fvVar2.Y, fvVar2.f33765b0, fvVar2.f33770g0);
                                return;
                        }
                    }
                });
                a2Var3.show();
                a2Var3.h();
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
                ((n00) obj).Q();
                return;
            case 23:
                ((m00) obj).f35439a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.lj0 lj0Var2 = ((r00) obj).f37151a;
                if (!lj0Var2.b()) {
                    lj0Var2.setProgress(0.0f);
                    lj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((u00) obj).c();
                return;
            case 26:
                v10 v10Var = (v10) obj;
                org.telegram.ui.Components.r90 r90Var = v10Var.f38595s;
                if ((!v10Var.f38594r || r90Var.b()) && v10Var.f38597x != null) {
                    v10Var.f38594r = true;
                    r90Var.f27912b = -1L;
                    r90Var.f27913c = -1L;
                    v10Var.f38593n.invalidate();
                    n00.S(v10Var.E, v10Var.f38597x, new c10(v10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.lj0 lj0Var3 = ((w10) obj).f38866a;
                if (!lj0Var3.b()) {
                    lj0Var3.setProgress(0.0f);
                    lj0Var3.d();
                    return;
                }
                return;
            case 28:
                final z10 z10Var = (z10) obj;
                v10 v10Var2 = (v10) view.getParent();
                final MessagesController.DialogFilter currentFilter = v10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = z10Var.e;
                org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(filtersSetupActivity, v10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                z10 z10Var2 = z10Var;
                                FiltersSetupActivity filtersSetupActivity2 = z10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = z10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                return;
                            default:
                                z10 z10Var3 = z10Var;
                                FiltersSetupActivity filtersSetupActivity3 = z10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.f15832id, new t3(z10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18661a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18661a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ow(2, z10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f18661a;
                                filtersSetupActivity3.showDialog(a2Var4);
                                TextView textView = (TextView) a2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
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
                                z10 z10Var2 = z10Var;
                                FiltersSetupActivity filtersSetupActivity2 = z10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = z10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                return;
                            default:
                                z10 z10Var3 = z10Var;
                                FiltersSetupActivity filtersSetupActivity3 = z10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.f15832id, new t3(z10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18661a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18661a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ow(2, z10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f18661a;
                                filtersSetupActivity3.showDialog(a2Var4);
                                TextView textView = (TextView) a2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f30536i = 3;
                }
                H.W(filtersSetupActivity.f31085a.V0(v10Var2, false));
                H.Z();
                return;
            default:
                ((m50) obj).dismiss();
                return;
        }
    }
}
