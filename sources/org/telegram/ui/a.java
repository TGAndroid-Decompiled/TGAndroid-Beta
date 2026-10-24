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
    public final int f35541a;
    public final Object f35542b;

    public a(Object obj, int i10) {
        this.f35541a = i10;
        this.f35542b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n6 n6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i11 = this.f35541a;
        Object obj = this.f35542b;
        switch (i11) {
            case 0:
                ((ah.o) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.h3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.y0 webView = ((n3) obj).f39704f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                u4 u4Var = (u4) obj;
                if (view == u4Var.e) {
                    org.telegram.ui.Components.d5.k(u4Var.getParentActivity(), null, new f(u4Var, 4));
                    return;
                }
                int i12 = ((t4) view).e;
                if (u4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(21));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.w0(6, u4Var, view));
                    alertDialog$Builder.p();
                    return;
                }
                u4Var.W(view, true);
                return;
            case 4:
                ((g5) obj).b(false);
                return;
            case 5:
                ((c7) obj).n0();
                return;
            case 6:
                s6 s6Var = (s6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(s6Var.f40089c.f28802i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) n6Var.f28802i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                c2Var2.R = sb3;
                c2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(s6Var.f40088b.f28802i, new a1(s6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                s6Var.d.showDialog(c2Var2);
                View d = c2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.k6.f21405p7;
                    org.telegram.ui.ActionBar.r6.W((TextView) d, i13, null);
                    d.setBackground(org.telegram.ui.ActionBar.k6.I0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.o1(0.12f, org.telegram.ui.ActionBar.k6.x0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                c7 c7Var = ((a7) obj).e;
                c7Var.M = !c7Var.M;
                c7Var.x0(true);
                c7Var.w0();
                return;
            case 8:
                n7 n7Var = (n7) obj;
                switch (n7Var.f39752f) {
                    case 0:
                        ((o7) n7Var.h).f40093r.f42597w.s0(null, (bi.b) n7Var.getTag(), true);
                        return;
                    default:
                        ((t7) n7Var.h).f41894n.f42597w.s0(null, (bi.b) n7Var.getTag(), true);
                        return;
                }
            case 9:
                ((h4) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.ak0 ak0Var = ((j9) obj).d;
                if (!ak0Var.b()) {
                    ak0Var.setProgress(0.0f);
                    ak0Var.d();
                    return;
                }
                return;
            case 11:
                w9 w9Var = (w9) obj;
                CameraView cameraView = w9Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) w9Var.f42960s.getBackground();
                    AnimatorSet animatorSet = w9Var.v;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        w9Var.v = null;
                    }
                    w9Var.v = new AnimatorSet();
                    org.telegram.ui.Components.p6 p6Var = org.telegram.ui.Components.r6.e;
                    if (w9Var.f42960s.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, p6Var, i10);
                    ofInt.addUpdateListener(new q9(w9Var, 1));
                    w9Var.v.playTogether(ofInt);
                    w9Var.v.setDuration(200L);
                    w9Var.v.setInterpolator(org.telegram.ui.Components.zr.f33337f);
                    w9Var.v.addListener(new m.a(w9Var, 8));
                    w9Var.v.start();
                    if (w9Var.f42960s.getTag() == null) {
                        w9Var.f42960s.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    w9Var.f42960s.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((bd) obj).y0();
                return;
            case 13:
                sn snVar = ((fj) obj).f37347b;
                snVar.f41534h0.n();
                ci.a3 a3Var = snVar.V1;
                if (a3Var != null) {
                    a3Var.P1(null, 0);
                }
                snVar.ca();
                return;
            case 14:
                sn snVar2 = ((dn) obj).f36651a;
                h5Var = ((org.telegram.ui.ActionBar.o2) snVar2).parentLayout;
                if (h5Var != null) {
                    h5Var2 = ((org.telegram.ui.ActionBar.o2) snVar2).parentLayout;
                    ((ActionBarLayout) h5Var2).r();
                    return;
                }
                return;
            case 15:
                ((cq) obj).e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!w8Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.b3) obj).f20729a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.tl.o(3, (org.telegram.ui.ActionBar.o2) obj);
                return;
            case 19:
                final yu yuVar = (yu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(yuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f20679a;
                c2Var3.R = string2;
                c2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                yuVar.dismiss();
                                return;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                mi.q qVar = yuVar2.Z;
                                ((c7) qVar.f17037c).m0(yuVar2.Y, yuVar2.f43954b0, yuVar2.f43959g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                yuVar.dismiss();
                                return;
                            default:
                                yu yuVar2 = yuVar;
                                yuVar2.dismiss();
                                mi.q qVar = yuVar2.Z;
                                ((c7) qVar.f17037c).m0(yuVar2.Y, yuVar2.f43954b0, yuVar2.f43959g0);
                                return;
                        }
                    }
                });
                c2Var3.show();
                c2Var3.i();
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
                ((c00) obj).f36169a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.ak0 ak0Var2 = ((g00) obj).f37415a;
                if (!ak0Var2.b()) {
                    ak0Var2.setProgress(0.0f);
                    ak0Var2.d();
                    return;
                }
                return;
            case 25:
                ((j00) obj).c();
                return;
            case 26:
                l10 l10Var = (l10) obj;
                org.telegram.ui.Components.aa0 aa0Var = l10Var.f39098s;
                if ((!l10Var.f39097r || aa0Var.c()) && l10Var.f39100x != null) {
                    l10Var.f39097r = true;
                    aa0Var.f24685b = -1L;
                    aa0Var.f24686c = -1L;
                    l10Var.f39096n.invalidate();
                    d00.S(l10Var.H, l10Var.f39100x, new fz(l10Var, 4));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.ak0 ak0Var3 = ((m10) obj).f39422a;
                if (!ak0Var3.b()) {
                    ak0Var3.setProgress(0.0f);
                    ak0Var3.d();
                    return;
                }
                return;
            case 28:
                final p10 p10Var = (p10) obj;
                l10 l10Var2 = (l10) view.getParent();
                final MessagesController.DialogFilter currentFilter = l10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = p10Var.e;
                org.telegram.ui.Components.h80 H = org.telegram.ui.Components.h80.H(filtersSetupActivity, l10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                p10 p10Var2 = p10Var;
                                FiltersSetupActivity filtersSetupActivity2 = p10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = p10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new q00(dialogFilter, null));
                                return;
                            default:
                                p10 p10Var3 = p10Var;
                                FiltersSetupActivity filtersSetupActivity3 = p10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.i10.U(filtersSetupActivity3, dialogFilter2.f17862id, new u3(p10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20679a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20679a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ks(8, p10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f20679a;
                                filtersSetupActivity3.showDialog(c2Var4);
                                TextView textView = (TextView) c2Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
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
                                p10 p10Var2 = p10Var;
                                FiltersSetupActivity filtersSetupActivity2 = p10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = p10Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.j0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new q00(dialogFilter, null));
                                return;
                            default:
                                p10 p10Var3 = p10Var;
                                FiltersSetupActivity filtersSetupActivity3 = p10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.i10.U(filtersSetupActivity3, dialogFilter2.f17862id, new u3(p10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20679a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20679a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new ks(8, p10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder4.f20679a;
                                filtersSetupActivity3.showDialog(c2Var4);
                                TextView textView = (TextView) c2Var4.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f26911i = 3;
                }
                H.W(filtersSetupActivity.f33444a.W0(l10Var2, false));
                H.Z();
                return;
            default:
                ((d50) obj).dismiss();
                return;
        }
    }
}
