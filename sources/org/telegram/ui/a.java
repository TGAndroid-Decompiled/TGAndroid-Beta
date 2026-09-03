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
    public final int f32393a;
    public final Object f32394b;

    public a(Object obj, int i10) {
        this.f32393a = i10;
        this.f32394b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.j6 j6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.Cells.r8 r8Var;
        Runnable runnable;
        int i11 = this.f32393a;
        Object obj = this.f32394b;
        switch (i11) {
            case 0:
                ((ah.a) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.g3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.y0 webView = ((r3) obj).f37686f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                u4 u4Var = (u4) obj;
                if (view == u4Var.e) {
                    org.telegram.ui.Components.z4.k(u4Var.getParentActivity(), null, new h(u4Var, 4));
                    return;
                }
                int i12 = ((t4) view).e;
                if (u4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m.j0(15));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new mg.w(8, u4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                u4Var.W(view, true);
                return;
            case 4:
                ((g5) obj).b(false);
                return;
            case 5:
                ((d7) obj).m0();
                return;
            case 6:
                u6 u6Var = (u6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(u6Var.getContext());
                StringBuilder sb = new StringBuilder();
                sb.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(u6Var.f37315c.f25850g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) j6Var.f25850g) + ")";
                }
                sb.append(str);
                String sb2 = sb.toString();
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                d2Var2.O = sb2;
                d2Var2.Q = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(u6Var.f37314b.f25850g, new c1(u6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                u6Var.d.showDialog(d2Var2);
                View d = d2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.j6.f20097p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                d7 d7Var = ((b7) obj).e;
                d7Var.J = !d7Var.J;
                d7Var.w0(true);
                d7Var.v0();
                return;
            case 8:
                o7 o7Var = (o7) obj;
                switch (o7Var.f36669f) {
                    case 0:
                        ((p7) o7Var.h).f36979r.v.r(null, (mh.a) o7Var.getTag(), true);
                        return;
                    default:
                        ((u7) o7Var.h).f38698n.v.r(null, (mh.a) o7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ah.a) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.jj0 jj0Var = ((k9) obj).d;
                if (!jj0Var.b()) {
                    jj0Var.setProgress(0.0f);
                    jj0Var.d();
                    return;
                }
                return;
            case 11:
                x9 x9Var = (x9) obj;
                CameraView cameraView = x9Var.f39930c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) x9Var.f39933r.getBackground();
                    AnimatorSet animatorSet = x9Var.f39934s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        x9Var.f39934s = null;
                    }
                    x9Var.f39934s = new AnimatorSet();
                    org.telegram.ui.Components.l6 l6Var = org.telegram.ui.Components.n6.e;
                    if (x9Var.f39933r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, l6Var, i10);
                    ofInt.addUpdateListener(new r9(x9Var, 1));
                    x9Var.f39934s.playTogether(ofInt);
                    x9Var.f39934s.setDuration(200L);
                    x9Var.f39934s.setInterpolator(org.telegram.ui.Components.mr.f27122f);
                    x9Var.f39934s.addListener(new u5(x9Var, 2));
                    x9Var.f39934s.start();
                    if (x9Var.f39933r.getTag() == null) {
                        x9Var.f39933r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    x9Var.f39933r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((dd) obj).w0();
                return;
            case 13:
                zn znVar = ((lj) obj).f35790b;
                znVar.f40563e0.n();
                nh.t2 t2Var = znVar.G1;
                if (t2Var != null) {
                    t2Var.I1(null, 0);
                }
                znVar.X9();
                return;
            case 14:
                zn znVar2 = ((ln) obj).f35808a;
                e5Var = ((org.telegram.ui.ActionBar.p2) znVar2).parentLayout;
                if (e5Var != null) {
                    e5Var2 = ((org.telegram.ui.ActionBar.p2) znVar2).parentLayout;
                    ((ActionBarLayout) e5Var2).r();
                    return;
                }
                return;
            case 15:
                ((kq) obj).e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.r8[]) obj)[0].setChecked(!r8Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.b3) obj).f19500a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                b.k(3, (org.telegram.ui.ActionBar.p2) obj);
                return;
            case 19:
                final iv ivVar = (iv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ivVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f19478a;
                d2Var3.O = string2;
                d2Var3.Q = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() {
                    @Override
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                ivVar.dismiss();
                                return;
                            default:
                                iv ivVar2 = ivVar;
                                ivVar2.dismiss();
                                n7.qa qaVar = ivVar2.W;
                                ((d7) qaVar.f14688c).l0(ivVar2.V, ivVar2.Y, ivVar2.f35034d0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2() {
                    @Override
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                ivVar.dismiss();
                                return;
                            default:
                                iv ivVar2 = ivVar;
                                ivVar2.dismiss();
                                n7.qa qaVar = ivVar2.W;
                                ((d7) qaVar.f14688c).l0(ivVar2.V, ivVar2.Y, ivVar2.f35034d0);
                                return;
                        }
                    }
                });
                d2Var3.show();
                d2Var3.h();
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
                ((p00) obj).Q();
                return;
            case 23:
                ((o00) obj).f36612a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.jj0 jj0Var2 = ((s00) obj).f38082a;
                if (!jj0Var2.b()) {
                    jj0Var2.setProgress(0.0f);
                    jj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((v00) obj).c();
                return;
            case 26:
                x10 x10Var = (x10) obj;
                org.telegram.ui.Components.j90 j90Var = x10Var.f39823s;
                if ((!x10Var.f39822r || j90Var.b()) && x10Var.f39825x != null) {
                    x10Var.f39822r = true;
                    j90Var.f25905b = -1L;
                    j90Var.f25906c = -1L;
                    x10Var.f39821n.invalidate();
                    p00.S(x10Var.B, x10Var.f39825x, new d10(x10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.jj0 jj0Var3 = ((y10) obj).f40116a;
                if (!jj0Var3.b()) {
                    jj0Var3.setProgress(0.0f);
                    jj0Var3.d();
                    return;
                }
                return;
            case 28:
                final b20 b20Var = (b20) obj;
                x10 x10Var2 = (x10) view.getParent();
                final MessagesController.DialogFilter currentFilter = x10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = b20Var.e;
                org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(filtersSetupActivity, x10Var2);
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
                                    i14 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new eg.v0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new c10(dialogFilter, null));
                                return;
                            default:
                                b20 b20Var3 = b20Var;
                                FiltersSetupActivity filtersSetupActivity3 = b20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.f16649id, new y3(b20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f19478a.O = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f19478a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ss(9, b20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f19478a;
                                filtersSetupActivity3.showDialog(d2Var4);
                                TextView textView = (TextView) d2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
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
                                    i14 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new eg.v0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new c10(dialogFilter, null));
                                return;
                            default:
                                b20 b20Var3 = b20Var;
                                FiltersSetupActivity filtersSetupActivity3 = b20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.f16649id, new y3(b20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f19478a.O = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f19478a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ss(9, b20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f19478a;
                                filtersSetupActivity3.showDialog(d2Var4);
                                TextView textView = (TextView) d2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f27759i = 3;
                }
                H.W(filtersSetupActivity.f31571a.U0(x10Var2, false));
                H.Z();
                return;
            default:
                ((o50) obj).dismiss();
                return;
        }
    }
}
