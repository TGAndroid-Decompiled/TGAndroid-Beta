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
    public final int f30754a;
    public final Object f30755b;

    public a(Object obj, int i10) {
        this.f30754a = i10;
        this.f30755b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.n6 n6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.Cells.x8 x8Var;
        Runnable runnable;
        int i11 = this.f30754a;
        Object obj = this.f30755b;
        switch (i11) {
            case 0:
                ((bi.g3) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.h3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.y0 webView = ((n3) obj).f35104f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                q4 q4Var = (q4) obj;
                if (view == q4Var.e) {
                    org.telegram.ui.Components.d5.k(q4Var.getParentActivity(), null, new g(q4Var, 4));
                    return;
                }
                int i12 = ((p4) view).e;
                if (q4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = string;
                    d2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new n2.l(12));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new bi.cb(25, q4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                q4Var.W(view, true);
                return;
            case 4:
                ((c5) obj).b(false);
                return;
            case 5:
                ((y6) obj).m0();
                return;
            case 6:
                p6 p6Var = (p6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(p6Var.f34545c.f25428g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) n6Var.f25428g) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
                d2Var2.R = sb3;
                d2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(p6Var.f34544b.f25428g, new a1(p6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                p6Var.d.showDialog(d2Var2);
                View d = d2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.j6.f18144p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.j6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                y6 y6Var = ((w6) obj).e;
                y6Var.M = !y6Var.M;
                y6Var.w0(true);
                y6Var.v0();
                return;
            case 8:
                j7 j7Var = (j7) obj;
                switch (j7Var.f34046f) {
                    case 0:
                        ((k7) j7Var.h).f34246r.v.a0(null, (yh.a) j7Var.getTag(), true);
                        return;
                    default:
                        ((p7) j7Var.h).f35691n.v.a0(null, (yh.a) j7Var.getTag(), true);
                        return;
                }
            case 9:
                ((bi.g3) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.kj0 kj0Var = ((h9) obj).d;
                if (!kj0Var.b()) {
                    kj0Var.setProgress(0.0f);
                    kj0Var.d();
                    return;
                }
                return;
            case 11:
                u9 u9Var = (u9) obj;
                CameraView cameraView = u9Var.f37164c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) u9Var.f37170r.getBackground();
                    AnimatorSet animatorSet = u9Var.f37171s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        u9Var.f37171s = null;
                    }
                    u9Var.f37171s = new AnimatorSet();
                    org.telegram.ui.Components.p6 p6Var2 = org.telegram.ui.Components.r6.e;
                    if (u9Var.f37170r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, p6Var2, i10);
                    ofInt.addUpdateListener(new o9(u9Var, 1));
                    u9Var.f37171s.playTogether(ofInt);
                    u9Var.f37171s.setDuration(200L);
                    u9Var.f37171s.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                    u9Var.f37171s.addListener(new bi.h(u9Var, 23));
                    u9Var.f37171s.start();
                    if (u9Var.f37170r.getTag() == null) {
                        u9Var.f37170r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    u9Var.f37170r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((cd) obj).w0();
                return;
            case 13:
                eo eoVar = ((pj) obj).f35851b;
                eoVar.f32342h0.n();
                gg.m mVar = eoVar.J1;
                if (mVar != null) {
                    mVar.I1(null, 0);
                }
                eoVar.X9();
                return;
            case 14:
                eo eoVar2 = ((pn) obj).f35881a;
                f5Var = ((org.telegram.ui.ActionBar.p2) eoVar2).parentLayout;
                if (f5Var != null) {
                    f5Var2 = ((org.telegram.ui.ActionBar.p2) eoVar2).parentLayout;
                    ((ActionBarLayout) f5Var2).r();
                    return;
                }
                return;
            case 15:
                ((qq) obj).e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.x8[]) obj)[0].setChecked(!x8Var.e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.c3) obj).f17571a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                org.telegram.messenger.em.m(3, (org.telegram.ui.ActionBar.p2) obj);
                return;
            case 19:
                final lv lvVar = (lv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(lvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f17528a;
                d2Var3.R = string2;
                d2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                lvVar.dismiss();
                                return;
                            default:
                                lv lvVar2 = lvVar;
                                lvVar2.dismiss();
                                n7.a1 a1Var = lvVar2.Z;
                                ((y6) a1Var.f13939c).l0(lvVar2.Y, lvVar2.f34780b0, lvVar2.f34785g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                lvVar.dismiss();
                                return;
                            default:
                                lv lvVar2 = lvVar;
                                lvVar2.dismiss();
                                n7.a1 a1Var = lvVar2.Z;
                                ((y6) a1Var.f13939c).l0(lvVar2.Y, lvVar2.f34780b0, lvVar2.f34785g0);
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
                ((t00) obj).Q();
                return;
            case 23:
                ((s00) obj).f36499a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.kj0 kj0Var2 = ((x00) obj).f38549a;
                if (!kj0Var2.b()) {
                    kj0Var2.setProgress(0.0f);
                    kj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((a10) obj).c();
                return;
            case 26:
                b20 b20Var = (b20) obj;
                org.telegram.ui.Components.q90 q90Var = b20Var.f31139s;
                if ((!b20Var.f31138r || q90Var.b()) && b20Var.f31141x != null) {
                    b20Var.f31138r = true;
                    q90Var.f26346b = -1L;
                    q90Var.f26347c = -1L;
                    b20Var.f31137n.invalidate();
                    t00.S(b20Var.E, b20Var.f31141x, new i10(b20Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.kj0 kj0Var3 = ((c20) obj).f31497a;
                if (!kj0Var3.b()) {
                    kj0Var3.setProgress(0.0f);
                    kj0Var3.d();
                    return;
                }
                return;
            case 28:
                final f20 f20Var = (f20) obj;
                b20 b20Var2 = (b20) view.getParent();
                final MessagesController.DialogFilter currentFilter = b20Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = f20Var.e;
                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(filtersSetupActivity, b20Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                f20 f20Var2 = f20Var;
                                FiltersSetupActivity filtersSetupActivity2 = f20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = f20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new qg.k0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new h10(dialogFilter, null));
                                return;
                            default:
                                f20 f20Var3 = f20Var;
                                FiltersSetupActivity filtersSetupActivity3 = f20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.k10.T(filtersSetupActivity3, dialogFilter2.f14645id, new u3(f20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f17528a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f17528a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.km(26, f20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f17528a;
                                filtersSetupActivity3.showDialog(d2Var4);
                                TextView textView = (TextView) d2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
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
                                f20 f20Var2 = f20Var;
                                FiltersSetupActivity filtersSetupActivity2 = f20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = f20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new qg.k0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new h10(dialogFilter, null));
                                return;
                            default:
                                f20 f20Var3 = f20Var;
                                FiltersSetupActivity filtersSetupActivity3 = f20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.k10.T(filtersSetupActivity3, dialogFilter2.f14645id, new u3(f20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f17528a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f17528a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.km(26, f20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f17528a;
                                filtersSetupActivity3.showDialog(d2Var4);
                                TextView textView = (TextView) d2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f28683i = 3;
                }
                H.W(filtersSetupActivity.f29912a.U0(b20Var2, false));
                H.Z();
                return;
            default:
                ((s50) obj).dismiss();
                return;
        }
    }
}
