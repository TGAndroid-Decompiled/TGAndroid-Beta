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
    public final int f34300a;
    public final Object f34301b;

    public a(Object obj, int i10) {
        this.f34300a = i10;
        this.f34301b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.p6 p6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i11 = this.f34300a;
        Object obj = this.f34301b;
        switch (i11) {
            case 0:
                ((ah.p) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.z0 webView = ((m3) obj).f38581f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                q4 q4Var = (q4) obj;
                if (view == q4Var.f39748e) {
                    org.telegram.ui.Components.e5.k(q4Var.getParentActivity(), null, new g(q4Var, 4));
                    return;
                }
                int i12 = ((p4) view).f39430e;
                if (q4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.t0(11));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4(0, q4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                q4Var.W(view, true);
                return;
            case 4:
                ((c5) obj).b(false);
                return;
            case 5:
                ((z6) obj).m0();
                return;
            case 6:
                p6 p6Var2 = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var2.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(p6Var2.f38224c.f29316g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) p6Var.f29316g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var2.f38223b.f29316g, new z0(p6Var2, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var2.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.j6.f20907p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                z6 z6Var = ((x6) obj).f42624e;
                z6Var.M = !z6Var.M;
                z6Var.w0(true);
                z6Var.v0();
                return;
            case 8:
                k7 k7Var = (k7) obj;
                switch (k7Var.f37976f) {
                    case 0:
                        ((l7) k7Var.h).f38233r.v.k1(null, (ai.b) k7Var.getTag(), true);
                        return;
                    default:
                        ((q7) k7Var.h).f39774n.v.k1(null, (ai.b) k7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ah.p) obj).run();
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
                CameraView cameraView = u9Var.f41008c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.f41015r.getBackground();
                    AnimatorSet animatorSet = u9Var.f41016s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        u9Var.f41016s = null;
                    }
                    u9Var.f41016s = new AnimatorSet();
                    org.telegram.ui.Components.r6 r6Var = org.telegram.ui.Components.t6.f30565e;
                    if (u9Var.f41015r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, r6Var, i10);
                    ofInt.addUpdateListener(new o9(u9Var, 1));
                    u9Var.f41016s.playTogether(ofInt);
                    u9Var.f41016s.setDuration(200L);
                    u9Var.f41016s.setInterpolator(org.telegram.ui.Components.pr.f29493f);
                    u9Var.f41016s.addListener(new s0(u9Var, 6));
                    u9Var.f41016s.start();
                    if (u9Var.f41015r.getTag() == null) {
                        u9Var.f41015r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    u9Var.f41015r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((bd) obj).w0();
                return;
            case 13:
                co coVar = ((nj) obj).f38994b;
                coVar.f35300h0.n();
                bi.t3 t3Var = coVar.J1;
                if (t3Var != null) {
                    t3Var.I1(null, 0);
                }
                coVar.X9();
                return;
            case 14:
                co coVar2 = ((on) obj).f39310a;
                d5Var = ((org.telegram.ui.ActionBar.n2) coVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) coVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    return;
                }
                return;
            case 15:
                ((pq) obj).f39643e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!w8Var.f23517e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f20231a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.wl.m(3, (org.telegram.ui.ActionBar.n2) obj);
                return;
            case 19:
                final kv kvVar = (kv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(kvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20225a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                kvVar.dismiss();
                                return;
                            default:
                                kv kvVar2 = kvVar;
                                kvVar2.dismiss();
                                o0.a aVar = kvVar2.Z;
                                ((z6) aVar.f16797c).l0(kvVar2.Y, kvVar2.f38162b0, kvVar2.f38167g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                kvVar.dismiss();
                                return;
                            default:
                                kv kvVar2 = kvVar;
                                kvVar2.dismiss();
                                o0.a aVar = kvVar2.Z;
                                ((z6) aVar.f16797c).l0(kvVar2.Y, kvVar2.f38162b0, kvVar2.f38167g0);
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
                ((q00) obj).f39689a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.aj0 aj0Var2 = ((v00) obj).f41402a;
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
                a20 a20Var = (a20) obj;
                org.telegram.ui.Components.h90 h90Var = a20Var.f34329s;
                if ((!a20Var.f34328r || h90Var.b()) && a20Var.f34331x != null) {
                    a20Var.f34328r = true;
                    h90Var.f26699b = -1L;
                    h90Var.f26700c = -1L;
                    a20Var.f34327n.invalidate();
                    r00.S(a20Var.E, a20Var.f34331x, new g10(a20Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.aj0 aj0Var3 = ((b20) obj).f34634a;
                if (!aj0Var3.b()) {
                    aj0Var3.setProgress(0.0f);
                    aj0Var3.d();
                    return;
                }
                return;
            case 28:
                final e20 e20Var = (e20) obj;
                a20 a20Var2 = (a20) view.getParent();
                final MessagesController.DialogFilter currentFilter = a20Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = e20Var.f35939e;
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(filtersSetupActivity, a20Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                e20 e20Var2 = e20Var;
                                FiltersSetupActivity filtersSetupActivity2 = e20Var2.f35939e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = e20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.k0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                return;
                            default:
                                e20 e20Var3 = e20Var;
                                FiltersSetupActivity filtersSetupActivity3 = e20Var3.f35939e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.f17107id, new t3(e20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20225a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20225a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new z10(1, e20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20225a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
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
                                FiltersSetupActivity filtersSetupActivity2 = e20Var2.f35939e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = e20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.k0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                return;
                            default:
                                e20 e20Var3 = e20Var;
                                FiltersSetupActivity filtersSetupActivity3 = e20Var3.f35939e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.f17107id, new t3(e20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20225a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20225a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new z10(1, e20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20225a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f28669i = 3;
                }
                H.W(filtersSetupActivity.f33433a.U0(a20Var2, false));
                H.Z();
                return;
            default:
                ((s50) obj).dismiss();
                return;
        }
    }
}
