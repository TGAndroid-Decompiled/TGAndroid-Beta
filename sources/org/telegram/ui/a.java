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
    public final int f37630a;
    public final Object f37631b;

    public a(Object obj, int i10) {
        this.f37630a = i10;
        this.f37631b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.r6 r6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        org.telegram.ui.Cells.a9 a9Var;
        Runnable runnable;
        int i11 = this.f37630a;
        Object obj = this.f37631b;
        switch (i11) {
            case 0:
                ((ai.h0) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.k3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.x0 webView = ((m3) obj).f41314f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                t4 t4Var = (t4) obj;
                if (view == t4Var.e) {
                    org.telegram.ui.Components.g5.k(t4Var.getParentActivity(), null, new f(t4Var, 4));
                    return;
                }
                int i12 = ((s4) view).e;
                if (t4Var.V() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.R = string;
                    e2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.x0(23));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.s0(8, t4Var, view));
                    alertDialog$Builder.p();
                    return;
                }
                t4Var.X(view, true);
                return;
            case 4:
                ((f5) obj).b(false);
                return;
            case 5:
                t6 t6Var = (t6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(t6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(t6Var.f42315c.f32147i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) r6Var.f32147i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                e2Var2.R = sb3;
                e2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(t6Var.f42314b.f32147i, new y0(t6Var, 9));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                t6Var.d.showDialog(e2Var2);
                View d = e2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.y6.f23582p7;
                    org.telegram.ui.ActionBar.f7.V((TextView) d, i13, null);
                    d.setBackground(org.telegram.ui.ActionBar.y6.I0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.x0(null, i13, false))));
                    return;
                }
                return;
            case 6:
                c7 c7Var = ((a7) obj).e;
                c7Var.L = !c7Var.L;
                c7Var.w0(true);
                c7Var.u0();
                return;
            case 7:
                o7 o7Var = (o7) obj;
                switch (o7Var.f42004f) {
                    case 0:
                        ((p7) o7Var.h).f42327r.F.q(null, (ci.a) o7Var.getTag(), true);
                        return;
                    default:
                        ((u7) o7Var.h).f43896n.F.q(null, (ci.a) o7Var.getTag(), true);
                        return;
                }
            case 8:
                ((g4) obj).run();
                return;
            case 9:
                org.telegram.ui.Components.bk0 bk0Var = ((l9) obj).d;
                if (!bk0Var.b()) {
                    bk0Var.setProgress(0.0f);
                    bk0Var.d();
                    return;
                }
                return;
            case 10:
                y9 y9Var = (y9) obj;
                CameraView cameraView = y9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) y9Var.f45900s.getBackground();
                    AnimatorSet animatorSet = y9Var.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        y9Var.v = null;
                    }
                    y9Var.v = new AnimatorSet();
                    org.telegram.ui.Components.t6 t6Var2 = org.telegram.ui.Components.v6.e;
                    if (y9Var.f45900s.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, t6Var2, i10);
                    ofInt.addUpdateListener(new s9(y9Var, 1));
                    y9Var.v.playTogether(ofInt);
                    y9Var.v.setDuration(200L);
                    y9Var.v.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                    y9Var.v.addListener(new kg.e(y9Var, 10));
                    y9Var.v.start();
                    if (y9Var.f45900s.getTag() == null) {
                        y9Var.f45900s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    y9Var.f45900s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 11:
                ((bd) obj).z0();
                return;
            case 12:
                wn wnVar = ((jj) obj).f40550b;
                wnVar.f45137h0.o();
                di.a3 a3Var = wnVar.V1;
                if (a3Var != null) {
                    a3Var.P1(null, 0);
                }
                wnVar.ka();
                return;
            case 13:
                wn wnVar2 = ((hn) obj).f39938a;
                j5Var = ((org.telegram.ui.ActionBar.r2) wnVar2).parentLayout;
                if (j5Var != null) {
                    j5Var2 = ((org.telegram.ui.ActionBar.r2) wnVar2).parentLayout;
                    ((ActionBarLayout) j5Var2).r();
                    return;
                }
                return;
            case 14:
                ((hq) obj).e.s0(true);
                return;
            case 15:
                ContactsActivity.X((ContactsActivity) obj);
                return;
            case 16:
                ((org.telegram.ui.Cells.a9[]) obj)[0].setChecked(!a9Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.e3) obj).f22602a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.wh.l(3, (org.telegram.ui.ActionBar.r2) obj);
                return;
            case 19:
                final xu xuVar = (xu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.f22369a;
                e2Var3.R = string2;
                e2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                xuVar.dismiss();
                                return;
                            default:
                                xu xuVar2 = xuVar;
                                xuVar2.dismiss();
                                m4.c cVar = xuVar2.Z;
                                ((c7) cVar.f18009c).k0(xuVar2.Y, xuVar2.f45779b0, xuVar2.f45784g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2() {
                    @Override
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                xuVar.dismiss();
                                return;
                            default:
                                xu xuVar2 = xuVar;
                                xuVar2.dismiss();
                                m4.c cVar = xuVar2.Z;
                                ((c7) cVar.f18009c).k0(xuVar2.Y, xuVar2.f45779b0, xuVar2.f45784g0);
                                return;
                        }
                    }
                });
                e2Var3.show();
                e2Var3.i();
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
                ((d00) obj).Q();
                return;
            case 23:
                ((c00) obj).f38134a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.bk0 bk0Var2 = ((g00) obj).f39468a;
                if (!bk0Var2.b()) {
                    bk0Var2.setProgress(0.0f);
                    bk0Var2.d();
                    return;
                }
                return;
            case 25:
                ((j00) obj).c();
                return;
            case 26:
                n10 n10Var = (n10) obj;
                org.telegram.ui.Components.ea0 ea0Var = n10Var.f41604s;
                if ((!n10Var.f41603r || ea0Var.c()) && n10Var.f41606x != null) {
                    n10Var.f41603r = true;
                    ea0Var.f27787b = -1L;
                    ea0Var.f27788c = -1L;
                    n10Var.f41602n.invalidate();
                    d00.S(n10Var.H, n10Var.f41606x, new r00(n10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.bk0 bk0Var3 = ((o10) obj).f41953a;
                if (!bk0Var3.b()) {
                    bk0Var3.setProgress(0.0f);
                    bk0Var3.d();
                    return;
                }
                return;
            case 28:
                final r10 r10Var = (r10) obj;
                n10 n10Var2 = (n10) view.getParent();
                final MessagesController.DialogFilter currentFilter = n10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = r10Var.e;
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(filtersSetupActivity, n10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                r10 r10Var2 = r10Var;
                                FiltersSetupActivity filtersSetupActivity2 = r10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = r10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.r2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new tg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new q00(dialogFilter, null));
                                return;
                            default:
                                r10 r10Var3 = r10Var;
                                FiltersSetupActivity filtersSetupActivity3 = r10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.n10.U(filtersSetupActivity3, dialogFilter2.f19548id, new t3(r10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f22369a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f22369a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(12, r10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder4.f22369a;
                                filtersSetupActivity3.showDialog(e2Var4);
                                TextView textView = (TextView) e2Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
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
                                r10 r10Var2 = r10Var;
                                FiltersSetupActivity filtersSetupActivity2 = r10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = r10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.r2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new tg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new q00(dialogFilter, null));
                                return;
                            default:
                                r10 r10Var3 = r10Var;
                                FiltersSetupActivity filtersSetupActivity3 = r10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.n10.U(filtersSetupActivity3, dialogFilter2.f19548id, new t3(r10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f22369a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f22369a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(12, r10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.e2 e2Var4 = alertDialog$Builder4.f22369a;
                                filtersSetupActivity3.showDialog(e2Var4);
                                TextView textView = (TextView) e2Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f30150i = 3;
                }
                H.W(filtersSetupActivity.f35532a.V0(n10Var2, false));
                H.Z();
                return;
            default:
                ((g50) obj).dismiss();
                return;
        }
    }
}
