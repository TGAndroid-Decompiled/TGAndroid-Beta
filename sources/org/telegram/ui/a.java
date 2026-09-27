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
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i11 = this.f31928a;
        Object obj = this.f31929b;
        switch (i11) {
            case 0:
                ((ai.s1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.g3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.z0 webView = ((n3) obj).f35797f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                r4 r4Var = (r4) obj;
                if (view == r4Var.e) {
                    org.telegram.ui.Components.e5.k(r4Var.getParentActivity(), null, new g(r4Var, 4));
                    return;
                }
                int i12 = ((q4) view).e;
                if (r4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new n4(0));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new p(2, r4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                r4Var.W(view, true);
                return;
            case 4:
                ((e5) obj).b(false);
                return;
            case 5:
                ((b7) obj).m0();
                return;
            case 6:
                r6 r6Var = (r6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(r6Var.f35828c.f26986g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) o6Var.f26986g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f18655a;
                c2Var2.R = sb3;
                c2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(r6Var.f35827b.f26986g, new a1(r6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                r6Var.d.showDialog(c2Var2);
                View d = c2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.i6.f19278p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.i6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                b7 b7Var = ((z6) obj).e;
                b7Var.L = !b7Var.L;
                b7Var.y0(true);
                b7Var.w0();
                return;
            case 8:
                n7 n7Var = (n7) obj;
                switch (n7Var.f35836f) {
                    case 0:
                        ((o7) n7Var.h).f36147r.E.H0(null, (zh.a) n7Var.getTag(), true);
                        return;
                    default:
                        ((t7) n7Var.h).f37667n.E.H0(null, (zh.a) n7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ai.s1) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.nj0 nj0Var = ((k9) obj).d;
                if (!nj0Var.b()) {
                    nj0Var.setProgress(0.0f);
                    nj0Var.d();
                    return;
                }
                return;
            case 11:
                x9 x9Var = (x9) obj;
                CameraView cameraView = x9Var.f39572c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) x9Var.f39578r.getBackground();
                    AnimatorSet animatorSet = x9Var.f39579s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        x9Var.f39579s = null;
                    }
                    x9Var.f39579s = new AnimatorSet();
                    org.telegram.ui.Components.q6 q6Var = org.telegram.ui.Components.s6.e;
                    if (x9Var.f39578r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, q6Var, i10);
                    ofInt.addUpdateListener(new r9(x9Var, 1));
                    x9Var.f39579s.playTogether(ofInt);
                    x9Var.f39579s.setDuration(200L);
                    x9Var.f39579s.setInterpolator(org.telegram.ui.Components.sr.f28359f);
                    x9Var.f39579s.addListener(new v4(x9Var, 3));
                    x9Var.f39579s.start();
                    if (x9Var.f39578r.getTag() == null) {
                        x9Var.f39578r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    x9Var.f39578r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((cd) obj).w0();
                return;
            case 13:
                xn xnVar = ((mj) obj).f35714b;
                xnVar.f39777h0.n();
                ai.g4 g4Var = xnVar.J1;
                if (g4Var != null) {
                    g4Var.F1(null, 0);
                }
                xnVar.X9();
                return;
            case 14:
                xn xnVar2 = ((jn) obj).f34766a;
                d5Var = ((org.telegram.ui.ActionBar.o2) xnVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.o2) xnVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    return;
                }
                return;
            case 15:
                ((kq) obj).e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!w8Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.b3) obj).f18683a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.qk.m(3, (org.telegram.ui.ActionBar.o2) obj);
                return;
            case 19:
                final hv hvVar = (hv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f18655a;
                c2Var3.R = string2;
                c2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                hvVar.dismiss();
                                return;
                            default:
                                hv hvVar2 = hvVar;
                                hvVar2.dismiss();
                                o0.a aVar = hvVar2.Z;
                                ((b7) aVar.f15520c).l0(hvVar2.Y, hvVar2.f34289b0, hvVar2.f34294g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                hvVar.dismiss();
                                return;
                            default:
                                hv hvVar2 = hvVar;
                                hvVar2.dismiss();
                                o0.a aVar = hvVar2.Z;
                                ((b7) aVar.f15520c).l0(hvVar2.Y, hvVar2.f34289b0, hvVar2.f34294g0);
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
                ((q00) obj).Q();
                return;
            case 23:
                ((p00) obj).f36285a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.nj0 nj0Var2 = ((u00) obj).f38092a;
                if (!nj0Var2.b()) {
                    nj0Var2.setProgress(0.0f);
                    nj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((x00) obj).c();
                return;
            case 26:
                y10 y10Var = (y10) obj;
                org.telegram.ui.Components.t90 t90Var = y10Var.f40088s;
                if ((!y10Var.f40087r || t90Var.b()) && y10Var.f40090x != null) {
                    y10Var.f40087r = true;
                    t90Var.f28519b = -1L;
                    t90Var.f28520c = -1L;
                    y10Var.f40086n.invalidate();
                    q00.S(y10Var.E, y10Var.f40090x, new f10(y10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.nj0 nj0Var3 = ((z10) obj).f40377a;
                if (!nj0Var3.b()) {
                    nj0Var3.setProgress(0.0f);
                    nj0Var3.d();
                    return;
                }
                return;
            case 28:
                final c20 c20Var = (c20) obj;
                y10 y10Var2 = (y10) view.getParent();
                final MessagesController.DialogFilter currentFilter = y10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = c20Var.e;
                org.telegram.ui.Components.a80 H = org.telegram.ui.Components.a80.H(filtersSetupActivity, y10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                c20 c20Var2 = c20Var;
                                FiltersSetupActivity filtersSetupActivity2 = c20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = c20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new e10(dialogFilter, null));
                                return;
                            default:
                                c20 c20Var3 = c20Var;
                                FiltersSetupActivity filtersSetupActivity3 = c20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.e10.T(filtersSetupActivity3, dialogFilter2.f15826id, new u3(c20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18655a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18655a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new jy(2, c20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f18655a;
                                filtersSetupActivity3.showDialog(c2Var4);
                                TextView textView = (TextView) c2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
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
                                c20 c20Var2 = c20Var;
                                FiltersSetupActivity filtersSetupActivity2 = c20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = c20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new e10(dialogFilter, null));
                                return;
                            default:
                                c20 c20Var3 = c20Var;
                                FiltersSetupActivity filtersSetupActivity3 = c20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.e10.T(filtersSetupActivity3, dialogFilter2.f15826id, new u3(c20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18655a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18655a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new jy(2, c20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f18655a;
                                filtersSetupActivity3.showDialog(c2Var4);
                                TextView textView = (TextView) c2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f22588i = 3;
                }
                H.W(filtersSetupActivity.f31087a.W0(y10Var2, false));
                H.Z();
                return;
            default:
                ((p50) obj).dismiss();
                return;
        }
    }
}
