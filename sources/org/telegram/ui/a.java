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
    public final int f34636a;
    public final Object f34637b;

    public a(Object obj, int i10) {
        this.f34636a = i10;
        this.f34637b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.o6 o6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i11 = this.f34636a;
        Object obj = this.f34637b;
        switch (i11) {
            case 0:
                ((ai.s1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.z0 webView = ((m3) obj).f38456f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                q4 q4Var = (q4) obj;
                if (view == q4Var.f39710e) {
                    org.telegram.ui.Components.e5.k(q4Var.getParentActivity(), null, new g(q4Var, 4));
                    return;
                }
                int i12 = ((p4) view).f39350e;
                if (q4Var.S() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4(0));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new o(2, q4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                q4Var.U(view, true);
                return;
            case 4:
                ((d5) obj).b(false);
                return;
            case 5:
                ((a7) obj).j0();
                return;
            case 6:
                r6 r6Var = (r6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(r6Var.f38811c.f29358g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) o6Var.f29358g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20377a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(r6Var.f38810b.f29358g, new z0(r6Var, 9));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                r6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.i6.f21049p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.i6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                a7 a7Var = ((y6) obj).f43124e;
                a7Var.L = !a7Var.L;
                a7Var.v0(true);
                a7Var.t0();
                return;
            case 8:
                m7 m7Var = (m7) obj;
                switch (m7Var.f38496f) {
                    case 0:
                        ((n7) m7Var.h).f38820r.E.f(null, (zh.a) m7Var.getTag(), true);
                        return;
                    default:
                        ((s7) m7Var.h).f40359n.E.f(null, (zh.a) m7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ai.s1) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.nj0 nj0Var = ((j9) obj).d;
                if (!nj0Var.b()) {
                    nj0Var.setProgress(0.0f);
                    nj0Var.d();
                    return;
                }
                return;
            case 11:
                w9 w9Var = (w9) obj;
                CameraView cameraView = w9Var.f41988c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) w9Var.f41995r.getBackground();
                    AnimatorSet animatorSet = w9Var.f41996s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        w9Var.f41996s = null;
                    }
                    w9Var.f41996s = new AnimatorSet();
                    org.telegram.ui.Components.q6 q6Var = org.telegram.ui.Components.s6.f30699e;
                    if (w9Var.f41995r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, q6Var, i10);
                    ofInt.addUpdateListener(new q9(w9Var, 1));
                    w9Var.f41996s.playTogether(ofInt);
                    w9Var.f41996s.setDuration(200L);
                    w9Var.f41996s.setInterpolator(org.telegram.ui.Components.tr.f31215f);
                    w9Var.f41996s.addListener(new u4(w9Var, 3));
                    w9Var.f41996s.start();
                    if (w9Var.f41995r.getTag() == null) {
                        w9Var.f41995r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    w9Var.f41995r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((cd) obj).w0();
                return;
            case 13:
                yn ynVar = ((lj) obj).f38338b;
                ynVar.f43328f0.n();
                ai.g4 g4Var = ynVar.H1;
                if (g4Var != null) {
                    g4Var.H1(null, 0);
                }
                ynVar.W9();
                return;
            case 14:
                yn ynVar2 = ((kn) obj).f38076a;
                c5Var = ((org.telegram.ui.ActionBar.n2) ynVar2).parentLayout;
                if (c5Var != null) {
                    c5Var2 = ((org.telegram.ui.ActionBar.n2) ynVar2).parentLayout;
                    ((ActionBarLayout) c5Var2).r();
                    return;
                }
                return;
            case 15:
                ((lq) obj).f38375e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!w8Var.f23699e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f20383a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.bi.l(3, (org.telegram.ui.ActionBar.n2) obj);
                return;
            case 19:
                final jv jvVar = (jv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(jvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20377a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                jvVar.dismiss();
                                return;
                            default:
                                jv jvVar2 = jvVar;
                                jvVar2.dismiss();
                                o0.a aVar = jvVar2.Z;
                                ((a7) aVar.f16938c).i0(jvVar2.Y, jvVar2.f37782b0, jvVar2.f37787g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                jvVar.dismiss();
                                return;
                            default:
                                jv jvVar2 = jvVar;
                                jvVar2.dismiss();
                                o0.a aVar = jvVar2.Z;
                                ((a7) aVar.f16938c).i0(jvVar2.Y, jvVar2.f37782b0, jvVar2.f37787g0);
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
                ((r00) obj).O();
                return;
            case 23:
                ((q00) obj).f39661a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.nj0 nj0Var2 = ((v00) obj).f41550a;
                if (!nj0Var2.b()) {
                    nj0Var2.setProgress(0.0f);
                    nj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((y00) obj).c();
                return;
            case 26:
                z10 z10Var = (z10) obj;
                org.telegram.ui.Components.u90 u90Var = z10Var.f43682s;
                if ((!z10Var.f43681r || u90Var.b()) && z10Var.f43684x != null) {
                    z10Var.f43681r = true;
                    u90Var.f31387b = -1L;
                    u90Var.f31388c = -1L;
                    z10Var.f43680n.invalidate();
                    r00.Q(z10Var.E, z10Var.f43684x, new g10(z10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.nj0 nj0Var3 = ((a20) obj).f34660a;
                if (!nj0Var3.b()) {
                    nj0Var3.setProgress(0.0f);
                    nj0Var3.d();
                    return;
                }
                return;
            case 28:
                final d20 d20Var = (d20) obj;
                z10 z10Var2 = (z10) view.getParent();
                final MessagesController.DialogFilter currentFilter = z10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = d20Var.f35619e;
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(filtersSetupActivity, z10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                d20 d20Var2 = d20Var;
                                FiltersSetupActivity filtersSetupActivity2 = d20Var2.f35619e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = d20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.k0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                return;
                            default:
                                d20 d20Var3 = d20Var;
                                FiltersSetupActivity filtersSetupActivity3 = d20Var3.f35619e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.f10.R(filtersSetupActivity3, dialogFilter2.f17266id, new t3(d20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20377a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20377a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new pw(3, d20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20377a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false));
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
                                d20 d20Var2 = d20Var;
                                FiltersSetupActivity filtersSetupActivity2 = d20Var2.f35619e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = d20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.k0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                return;
                            default:
                                d20 d20Var3 = d20Var;
                                FiltersSetupActivity filtersSetupActivity3 = d20Var3.f35619e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.f10.R(filtersSetupActivity3, dialogFilter2.f17266id, new t3(d20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20377a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20377a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new pw(3, d20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20377a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f24867i = 3;
                }
                H.W(filtersSetupActivity.f33770a.V0(z10Var2, false));
                H.Z();
                return;
            default:
                ((r50) obj).dismiss();
                return;
        }
    }
}
