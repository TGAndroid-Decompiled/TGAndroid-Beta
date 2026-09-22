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
    public final int f31945a;
    public final Object f31946b;

    public a(Object obj, int i10) {
        this.f31945a = i10;
        this.f31946b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n6 n6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.Cells.x8 x8Var;
        Runnable runnable;
        int i11 = this.f31945a;
        Object obj = this.f31946b;
        switch (i11) {
            case 0:
                ((ai.s1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.z0 webView = ((l3) obj).f35307f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.e) {
                    org.telegram.ui.Components.d5.k(p4Var.getParentActivity(), null, new g(p4Var, 4));
                    return;
                }
                int i12 = ((o4) view).e;
                if (p4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.q0(18));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new l4(0, p4Var, view));
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
                if (TextUtils.isEmpty(p6Var.f35342c.f26646g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) n6Var.f26646g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18669a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var.f35341b.f26646g, new y0(p6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.j6.f19330p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                z6 z6Var = ((x6) obj).e;
                z6Var.L = !z6Var.L;
                z6Var.y0(true);
                z6Var.w0();
                return;
            case 8:
                l7 l7Var = (l7) obj;
                switch (l7Var.f35351f) {
                    case 0:
                        ((m7) l7Var.h).f35645r.E.H0(null, (zh.a) l7Var.getTag(), true);
                        return;
                    default:
                        ((r7) l7Var.h).f37080n.E.H0(null, (zh.a) l7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ai.s1) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.nj0 nj0Var = ((i9) obj).d;
                if (!nj0Var.b()) {
                    nj0Var.setProgress(0.0f);
                    nj0Var.d();
                    return;
                }
                return;
            case 11:
                v9 v9Var = (v9) obj;
                CameraView cameraView = v9Var.f38462c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) v9Var.f38468r.getBackground();
                    AnimatorSet animatorSet = v9Var.f38469s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        v9Var.f38469s = null;
                    }
                    v9Var.f38469s = new AnimatorSet();
                    org.telegram.ui.Components.p6 p6Var2 = org.telegram.ui.Components.r6.e;
                    if (v9Var.f38468r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, p6Var2, i10);
                    ofInt.addUpdateListener(new p9(v9Var, 1));
                    v9Var.f38469s.playTogether(ofInt);
                    v9Var.f38469s.setDuration(200L);
                    v9Var.f38469s.setInterpolator(org.telegram.ui.Components.qr.f27653f);
                    v9Var.f38469s.addListener(new t4(v9Var, 3));
                    v9Var.f38469s.start();
                    if (v9Var.f38468r.getTag() == null) {
                        v9Var.f38468r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    v9Var.f38468r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((bd) obj).w0();
                return;
            case 13:
                zn znVar = ((nj) obj).f36059b;
                znVar.f40351h0.n();
                ai.g4 g4Var = znVar.J1;
                if (g4Var != null) {
                    g4Var.I1(null, 0);
                }
                znVar.X9();
                return;
            case 14:
                zn znVar2 = ((ln) obj).f35505a;
                d5Var = ((org.telegram.ui.ActionBar.n2) znVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    return;
                }
                return;
            case 15:
                ((mq) obj).e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.x8[]) obj)[0].setChecked(!x8Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f18674a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.rk.m(3, (org.telegram.ui.ActionBar.n2) obj);
                return;
            case 19:
                final kv kvVar = (kv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(kvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f18669a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void k(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                kvVar.dismiss();
                                return;
                            default:
                                kv kvVar2 = kvVar;
                                kvVar2.dismiss();
                                m5.e eVar = kvVar2.Z;
                                ((z6) eVar.f14969c).l0(kvVar2.Y, kvVar2.f35259b0, kvVar2.f35264g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void k(org.telegram.ui.ActionBar.b2 b2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                kvVar.dismiss();
                                return;
                            default:
                                kv kvVar2 = kvVar;
                                kvVar2.dismiss();
                                m5.e eVar = kvVar2.Z;
                                ((z6) eVar.f14969c).l0(kvVar2.Y, kvVar2.f35259b0, kvVar2.f35264g0);
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
                ((q00) obj).f36754a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.nj0 nj0Var2 = ((v00) obj).f38395a;
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
                a20 a20Var = (a20) obj;
                org.telegram.ui.Components.r90 r90Var = a20Var.f31980s;
                if ((!a20Var.f31979r || r90Var.b()) && a20Var.f31982x != null) {
                    a20Var.f31979r = true;
                    r90Var.f27855b = -1L;
                    r90Var.f27856c = -1L;
                    a20Var.f31978n.invalidate();
                    r00.S(a20Var.E, a20Var.f31982x, new g10(a20Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.nj0 nj0Var3 = ((b20) obj).f32260a;
                if (!nj0Var3.b()) {
                    nj0Var3.setProgress(0.0f);
                    nj0Var3.d();
                    return;
                }
                return;
            case 28:
                final e20 e20Var = (e20) obj;
                a20 a20Var2 = (a20) view.getParent();
                final MessagesController.DialogFilter currentFilter = a20Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = e20Var.e;
                org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(filtersSetupActivity, a20Var2);
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
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.f15837id, new s3(e20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18669a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18669a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new z10(1, e20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f18669a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
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
                                    org.telegram.ui.Components.c10.T(filtersSetupActivity3, dialogFilter2.f15837id, new s3(e20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f18669a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f18669a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new z10(1, e20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f18669a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f30550i = 3;
                }
                H.W(filtersSetupActivity.f31104a.W0(a20Var2, false));
                H.Z();
                return;
            default:
                ((r50) obj).dismiss();
                return;
        }
    }
}
