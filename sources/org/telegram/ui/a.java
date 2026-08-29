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
    public final int f36383a;
    public final Object f36384b;

    public a(Object obj, int i10) {
        this.f36383a = i10;
        this.f36384b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n6 n6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.Cells.q8 q8Var;
        Runnable runnable;
        int i11 = this.f36383a;
        Object obj = this.f36384b;
        switch (i11) {
            case 0:
                ((ag.v0) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.w0 webView = ((q3) obj).f41516f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                q4 q4Var = (q4) obj;
                if (view == q4Var.f41529e) {
                    org.telegram.ui.Components.c5.k(q4Var.getParentActivity(), null, new h(q4Var, 4));
                    return;
                }
                int i12 = ((p4) view).f41291e;
                if (q4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = string;
                    c2Var.P = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.a(10));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new kg.w(9, q4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                q4Var.W(view, true);
                return;
            case 4:
                ((c5) obj).b(false);
                return;
            case 5:
                ((x6) obj).m0();
                return;
            case 6:
                o6 o6Var = (o6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(o6Var.f39760c.f30866g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) n6Var.f30866g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                c2Var2.N = sb3;
                c2Var2.P = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(o6Var.f39759b.f30866g, new c1(o6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                o6Var.d.showDialog(c2Var2);
                View d = c2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.g6.f23279p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                x6 x6Var = ((v6) obj).f43438e;
                x6Var.I = !x6Var.I;
                x6Var.w0(true);
                x6Var.v0();
                return;
            case 8:
                i7 i7Var = (i7) obj;
                switch (i7Var.f39140f) {
                    case 0:
                        ((j7) i7Var.h).f39452r.v.O0(null, (kh.a) i7Var.getTag(), true);
                        return;
                    default:
                        ((o7) i7Var.h).f40993n.v.O0(null, (kh.a) i7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ag.v0) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.aj0 aj0Var = ((e9) obj).d;
                if (!aj0Var.b()) {
                    aj0Var.setProgress(0.0f);
                    aj0Var.d();
                    return;
                }
                return;
            case 11:
                r9 r9Var = (r9) obj;
                CameraView cameraView = r9Var.f42003c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) r9Var.f42007r.getBackground();
                    AnimatorSet animatorSet = r9Var.f42008s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        r9Var.f42008s = null;
                    }
                    r9Var.f42008s = new AnimatorSet();
                    org.telegram.ui.Components.p6 p6Var = org.telegram.ui.Components.r6.f32223e;
                    if (r9Var.f42007r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, p6Var, i10);
                    ofInt.addUpdateListener(new l9(r9Var, 1));
                    r9Var.f42008s.playTogether(ofInt);
                    r9Var.f42008s.setDuration(200L);
                    r9Var.f42008s.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                    r9Var.f42008s.addListener(new nh.q5(r9Var, 11));
                    r9Var.f42008s.start();
                    if (r9Var.f42007r.getTag() == null) {
                        r9Var.f42007r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    r9Var.f42007r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((vc) obj).w0();
                return;
            case 13:
                tn tnVar = ((ej) obj).f37848b;
                tnVar.f42775d0.n();
                lh.s2 s2Var = tnVar.F1;
                if (s2Var != null) {
                    s2Var.I1(null, 0);
                }
                tnVar.X9();
                return;
            case 14:
                tn tnVar2 = ((fn) obj).f38212a;
                b5Var = ((org.telegram.ui.ActionBar.o2) tnVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.o2) tnVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    return;
                }
                return;
            case 15:
                ((cq) obj).f37192e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.q8[]) obj)[0].setChecked(!q8Var.f25083e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f22729a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                b.l(3, (org.telegram.ui.ActionBar.o2) obj);
                return;
            case 19:
                final yu yuVar = (yu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(yuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22714a;
                c2Var3.N = string2;
                c2Var3.P = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                yuVar.dismiss();
                                return;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                oc.i iVar = yuVar2.V;
                                ((x6) iVar.f19484c).l0(yuVar2.U, yuVar2.X, yuVar2.f44970c0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                yuVar.dismiss();
                                return;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                oc.i iVar = yuVar2.V;
                                ((x6) iVar.f19484c).l0(yuVar2.U, yuVar2.X, yuVar2.f44970c0);
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
                ((c00) obj).Q();
                return;
            case 23:
                ((b00) obj).f36640a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.aj0 aj0Var2 = ((f00) obj).f37942a;
                if (!aj0Var2.b()) {
                    aj0Var2.setProgress(0.0f);
                    aj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((i00) obj).c();
                return;
            case 26:
                j10 j10Var = (j10) obj;
                org.telegram.ui.Components.c90 c90Var = j10Var.f39401s;
                if ((!j10Var.f39400r || c90Var.b()) && j10Var.f39403x != null) {
                    j10Var.f39400r = true;
                    c90Var.f27381b = -1L;
                    c90Var.f27382c = -1L;
                    j10Var.f39399n.invalidate();
                    c00.S(j10Var.A, j10Var.f39403x, new q00(j10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.aj0 aj0Var3 = ((k10) obj).f39727a;
                if (!aj0Var3.b()) {
                    aj0Var3.setProgress(0.0f);
                    aj0Var3.d();
                    return;
                }
                return;
            case 28:
                final n10 n10Var = (n10) obj;
                j10 j10Var2 = (j10) view.getParent();
                final MessagesController.DialogFilter currentFilter = j10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = n10Var.f40685e;
                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(filtersSetupActivity, j10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                n10 n10Var2 = n10Var;
                                FiltersSetupActivity filtersSetupActivity2 = n10Var2.f40685e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = n10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new cg.v0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new p00(dialogFilter, null));
                                return;
                            default:
                                n10 n10Var3 = n10Var;
                                FiltersSetupActivity filtersSetupActivity3 = n10Var3.f40685e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.y00.T(filtersSetupActivity3, dialogFilter2.f19620id, new x3(n10Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f22714a.N = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f22714a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new xr(10, n10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f22714a;
                                filtersSetupActivity3.showDialog(c2Var4);
                                TextView textView = (TextView) c2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
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
                                n10 n10Var2 = n10Var;
                                FiltersSetupActivity filtersSetupActivity2 = n10Var2.f40685e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = n10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new cg.v0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new p00(dialogFilter, null));
                                return;
                            default:
                                n10 n10Var3 = n10Var;
                                FiltersSetupActivity filtersSetupActivity3 = n10Var3.f40685e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.y00.T(filtersSetupActivity3, dialogFilter2.f19620id, new x3(n10Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f22714a.N = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f22714a.P = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new xr(10, n10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f22714a;
                                filtersSetupActivity3.showDialog(c2Var4);
                                TextView textView = (TextView) c2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f29582i = 3;
                }
                H.W(filtersSetupActivity.f35543a.V0(j10Var2, false));
                H.Z();
                return;
            default:
                ((a50) obj).dismiss();
                return;
        }
    }
}
