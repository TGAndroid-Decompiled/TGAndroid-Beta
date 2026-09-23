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
    public final int f31613a;
    public final Object f31614b;

    public a(Object obj, int i10) {
        this.f31613a = i10;
        this.f31614b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.o6 o6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        org.telegram.ui.Cells.x8 x8Var;
        Runnable runnable;
        int i11 = this.f31613a;
        Object obj = this.f31614b;
        switch (i11) {
            case 0:
                ((ai.s1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.y0 webView = ((m3) obj).f35132f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                q4 q4Var = (q4) obj;
                if (view == q4Var.e) {
                    org.telegram.ui.Components.e5.k(q4Var.getParentActivity(), null, new g(q4Var, 4));
                    return;
                }
                int i12 = ((p4) view).e;
                if (q4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.p0(27));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new u(1, q4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                q4Var.W(view, true);
                return;
            case 4:
                ((d5) obj).b(false);
                return;
            case 5:
                ((z6) obj).m0();
                return;
            case 6:
                p6 p6Var = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(p6Var.f34867c.f26617g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) o6Var.f26617g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18409a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var.f34866b.f26617g, new z0(p6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.h6.f19008p7;
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
                switch (k7Var.f34591f) {
                    case 0:
                        ((l7) k7Var.h).f34875r.v.H0(null, (zh.a) k7Var.getTag(), true);
                        return;
                    default:
                        ((q7) k7Var.h).f36305n.v.H0(null, (zh.a) k7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ai.s1) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.bj0 bj0Var = ((h9) obj).d;
                if (!bj0Var.b()) {
                    bj0Var.setProgress(0.0f);
                    bj0Var.d();
                    return;
                }
                return;
            case 11:
                u9 u9Var = (u9) obj;
                CameraView cameraView = u9Var.f37959c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.f37965r.getBackground();
                    AnimatorSet animatorSet = u9Var.f37966s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        u9Var.f37966s = null;
                    }
                    u9Var.f37966s = new AnimatorSet();
                    org.telegram.ui.Components.q6 q6Var = org.telegram.ui.Components.s6.e;
                    if (u9Var.f37965r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, q6Var, i10);
                    ofInt.addUpdateListener(new o9(u9Var, 1));
                    u9Var.f37966s.playTogether(ofInt);
                    u9Var.f37966s.setDuration(200L);
                    u9Var.f37966s.setInterpolator(org.telegram.ui.Components.rr.f27701f);
                    u9Var.f37966s.addListener(new u4(u9Var, 3));
                    u9Var.f37966s.start();
                    if (u9Var.f37965r.getTag() == null) {
                        u9Var.f37965r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    u9Var.f37965r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((ad) obj).w0();
                return;
            case 13:
                xn xnVar = ((kj) obj).f34737b;
                xnVar.f39396h0.n();
                ai.g4 g4Var = xnVar.J1;
                if (g4Var != null) {
                    g4Var.I1(null, 0);
                }
                xnVar.X9();
                return;
            case 14:
                xn xnVar2 = ((jn) obj).f34487a;
                c5Var = ((org.telegram.ui.ActionBar.n2) xnVar2).parentLayout;
                if (c5Var != null) {
                    c5Var2 = ((org.telegram.ui.ActionBar.n2) xnVar2).parentLayout;
                    ((ActionBarLayout) c5Var2).r();
                    return;
                }
                return;
            case 15:
                ((kq) obj).e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.x8[]) obj)[0].setChecked(!x8Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f18414a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.ul.n(3, (org.telegram.ui.ActionBar.n2) obj);
                return;
            case 19:
                final gv gvVar = (gv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(gvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f18409a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                gvVar.dismiss();
                                return;
                            default:
                                gv gvVar2 = gvVar;
                                gvVar2.dismiss();
                                o0.a aVar = gvVar2.Z;
                                ((z6) aVar.f15276c).l0(gvVar2.Y, gvVar2.f33661b0, gvVar2.f33666g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                gvVar.dismiss();
                                return;
                            default:
                                gv gvVar2 = gvVar;
                                gvVar2.dismiss();
                                o0.a aVar = gvVar2.Z;
                                ((z6) aVar.f15276c).l0(gvVar2.Y, gvVar2.f33661b0, gvVar2.f33666g0);
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
                ((o00) obj).Q();
                return;
            case 23:
                ((n00) obj).f35416a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.bj0 bj0Var2 = ((s00) obj).f37095a;
                if (!bj0Var2.b()) {
                    bj0Var2.setProgress(0.0f);
                    bj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((v00) obj).c();
                return;
            case 26:
                x10 x10Var = (x10) obj;
                org.telegram.ui.Components.h90 h90Var = x10Var.f39150s;
                if ((!x10Var.f39149r || h90Var.b()) && x10Var.f39152x != null) {
                    x10Var.f39149r = true;
                    h90Var.f24601b = -1L;
                    h90Var.f24602c = -1L;
                    x10Var.f39148n.invalidate();
                    o00.S(x10Var.E, x10Var.f39152x, new d10(x10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.bj0 bj0Var3 = ((y10) obj).f39701a;
                if (!bj0Var3.b()) {
                    bj0Var3.setProgress(0.0f);
                    bj0Var3.d();
                    return;
                }
                return;
            case 28:
                final b20 b20Var = (b20) obj;
                x10 x10Var2 = (x10) view.getParent();
                final MessagesController.DialogFilter currentFilter = x10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = b20Var.e;
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(filtersSetupActivity, x10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                b20 b20Var2 = b20Var;
                                FiltersSetupActivity filtersSetupActivity2 = b20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = b20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new c10(dialogFilter, null));
                                return;
                            default:
                                b20 b20Var3 = b20Var;
                                FiltersSetupActivity filtersSetupActivity3 = b20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.f15577id, new t3(b20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18409a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18409a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new w10(1, b20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f18409a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
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
                                b20 b20Var2 = b20Var;
                                FiltersSetupActivity filtersSetupActivity2 = b20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = b20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new c10(dialogFilter, null));
                                return;
                            default:
                                b20 b20Var3 = b20Var;
                                FiltersSetupActivity filtersSetupActivity3 = b20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.f15577id, new t3(b20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18409a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18409a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new w10(1, b20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f18409a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f26651i = 3;
                }
                H.W(filtersSetupActivity.f30770a.V0(x10Var2, false));
                H.Z();
                return;
            default:
                ((o50) obj).dismiss();
                return;
        }
    }
}
