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
    public final int f34964a;
    public final Object f34965b;

    public a(Object obj, int i10) {
        this.f34964a = i10;
        this.f34965b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.j6 j6Var;
        String str;
        CameraSessionWrapper cameraSession;
        int i10;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        org.telegram.ui.Cells.s8 s8Var;
        Runnable runnable;
        int i11 = this.f34964a;
        Object obj = this.f34965b;
        switch (i11) {
            case 0:
                ((bh.a) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.h3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.x0 webView = ((p3) obj).f39865f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                s4 s4Var = (s4) obj;
                if (view == s4Var.f41011e) {
                    org.telegram.ui.Components.z4.k(s4Var.getParentActivity(), null, new h(s4Var, 4));
                    return;
                }
                int i12 = ((r4) view).f40749e;
                if (s4Var.U() == 0 && i12 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i12 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mh.c3(15));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ng.w(8, s4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                s4Var.W(view, true);
                return;
            case 4:
                ((e5) obj).b(false);
                return;
            case 5:
                ((b7) obj).m0();
                return;
            case 6:
                s6 s6Var = (s6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s6Var.getContext());
                StringBuilder sb = new StringBuilder();
                sb.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(s6Var.f39546c.f28003g)) {
                    str = "";
                } else {
                    str = " (" + ((Object) j6Var.f28003g) + ")";
                }
                sb.append(str);
                String sb2 = sb.toString();
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
                d2Var2.O = sb2;
                d2Var2.Q = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(s6Var.f39545b.f28003g, new a1(s6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                s6Var.d.showDialog(d2Var2);
                View d = d2Var2.d(-1);
                if (d instanceof TextView) {
                    int i13 = org.telegram.ui.ActionBar.k6.f21878p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
                    d.setBackground(org.telegram.ui.ActionBar.k6.G0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.w0(null, i13, false))));
                    return;
                }
                return;
            case 7:
                b7 b7Var = ((z6) obj).f43810e;
                b7Var.J = !b7Var.J;
                b7Var.w0(true);
                b7Var.v0();
                return;
            case 8:
                m7 m7Var = (m7) obj;
                switch (m7Var.f38869f) {
                    case 0:
                        ((n7) m7Var.h).f39208r.v.Y(null, (nh.a) m7Var.getTag(), true);
                        return;
                    default:
                        ((s7) m7Var.h).f41040n.v.Y(null, (nh.a) m7Var.getTag(), true);
                        return;
                }
            case 9:
                ((bh.a) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.kj0 kj0Var = ((i9) obj).d;
                if (!kj0Var.b()) {
                    kj0Var.setProgress(0.0f);
                    kj0Var.d();
                    return;
                }
                return;
            case 11:
                v9 v9Var = (v9) obj;
                CameraView cameraView = v9Var.f42059c;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) v9Var.f42063r.getBackground();
                    AnimatorSet animatorSet = v9Var.f42064s;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        v9Var.f42064s = null;
                    }
                    v9Var.f42064s = new AnimatorSet();
                    org.telegram.ui.Components.l6 l6Var = org.telegram.ui.Components.n6.f29397e;
                    if (v9Var.f42063r.getTag() == null) {
                        i10 = 68;
                    } else {
                        i10 = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, l6Var, i10);
                    ofInt.addUpdateListener(new p9(v9Var, 1));
                    v9Var.f42064s.playTogether(ofInt);
                    v9Var.f42064s.setDuration(200L);
                    v9Var.f42064s.setInterpolator(org.telegram.ui.Components.pr.f30168f);
                    v9Var.f42064s.addListener(new s5(v9Var, 2));
                    v9Var.f42064s.start();
                    if (v9Var.f42063r.getTag() == null) {
                        v9Var.f42063r.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    v9Var.f42063r.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 12:
                ((bd) obj).w0();
                return;
            case 13:
                xn xnVar = ((jj) obj).f38068b;
                xnVar.f43144e0.n();
                oh.u2 u2Var = xnVar.G1;
                if (u2Var != null) {
                    u2Var.I1(null, 0);
                }
                xnVar.X9();
                return;
            case 14:
                xn xnVar2 = ((jn) obj).f38085a;
                f5Var = ((org.telegram.ui.ActionBar.p2) xnVar2).parentLayout;
                if (f5Var != null) {
                    f5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar2).parentLayout;
                    ((ActionBarLayout) f5Var2).r();
                    return;
                }
                return;
            case 15:
                ((jq) obj).f38110e.r0(true);
                return;
            case 16:
                ((org.telegram.ui.Cells.s8[]) obj)[0].setChecked(!s8Var.f23755e.h);
                return;
            case 17:
                runnable = ((org.telegram.ui.ActionBar.c3) obj).f21209a.dismissRunnable;
                runnable.run();
                return;
            case 18:
                b.k(3, (org.telegram.ui.ActionBar.p2) obj);
                return;
            case 19:
                final hv hvVar = (hv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f21168a;
                d2Var3.O = string2;
                d2Var3.Q = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() {
                    @Override
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                hvVar.dismiss();
                                return;
                            default:
                                hv hvVar2 = hvVar;
                                hvVar2.dismiss();
                                n7.qa qaVar = hvVar2.W;
                                ((b7) qaVar.f15702c).l0(hvVar2.V, hvVar2.Y, hvVar2.f37487d0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2() {
                    @Override
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var4, int i14) {
                        switch (r2) {
                            case 0:
                                hvVar.dismiss();
                                return;
                            default:
                                hv hvVar2 = hvVar;
                                hvVar2.dismiss();
                                n7.qa qaVar = hvVar2.W;
                                ((b7) qaVar.f15702c).l0(hvVar2.V, hvVar2.Y, hvVar2.f37487d0);
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
                ((o00) obj).Q();
                return;
            case 23:
                ((n00) obj).f39150a.dismiss();
                return;
            case 24:
                org.telegram.ui.Components.kj0 kj0Var2 = ((r00) obj).f40733a;
                if (!kj0Var2.b()) {
                    kj0Var2.setProgress(0.0f);
                    kj0Var2.d();
                    return;
                }
                return;
            case 25:
                ((u00) obj).c();
                return;
            case 26:
                v10 v10Var = (v10) obj;
                org.telegram.ui.Components.k90 k90Var = v10Var.f41984s;
                if ((!v10Var.f41983r || k90Var.b()) && v10Var.f41986x != null) {
                    v10Var.f41983r = true;
                    k90Var.f28351b = -1L;
                    k90Var.f28352c = -1L;
                    v10Var.f41982n.invalidate();
                    o00.S(v10Var.B, v10Var.f41986x, new c10(v10Var, 3));
                    return;
                }
                return;
            case 27:
                org.telegram.ui.Components.kj0 kj0Var3 = ((w10) obj).f42251a;
                if (!kj0Var3.b()) {
                    kj0Var3.setProgress(0.0f);
                    kj0Var3.d();
                    return;
                }
                return;
            case 28:
                final a20 a20Var = (a20) obj;
                v10 v10Var2 = (v10) view.getParent();
                final MessagesController.DialogFilter currentFilter = v10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = a20Var.f35001e;
                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(filtersSetupActivity, v10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i14;
                        switch (r3) {
                            case 0:
                                a20 a20Var2 = a20Var;
                                FiltersSetupActivity filtersSetupActivity2 = a20Var2.f35001e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = a20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new fg.v0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                return;
                            default:
                                a20 a20Var3 = a20Var;
                                FiltersSetupActivity filtersSetupActivity3 = a20Var3.f35001e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.f18057id, new w3(a20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f21168a.O = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f21168a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new rs(9, a20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f21168a;
                                filtersSetupActivity3.showDialog(d2Var4);
                                TextView textView = (TextView) d2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
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
                                a20 a20Var2 = a20Var;
                                FiltersSetupActivity filtersSetupActivity2 = a20Var2.f35001e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = a20Var2.d;
                                    i14 = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new fg.v0(3, i14, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new b10(dialogFilter, null));
                                return;
                            default:
                                a20 a20Var3 = a20Var;
                                FiltersSetupActivity filtersSetupActivity3 = a20Var3.f35001e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.d10.T(filtersSetupActivity3, dialogFilter2.f18057id, new w3(a20Var3, 5));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f21168a.O = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f21168a.Q = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new rs(9, a20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder4.f21168a;
                                filtersSetupActivity3.showDialog(d2Var4);
                                TextView textView = (TextView) d2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f30315i = 3;
                }
                H.W(filtersSetupActivity.f34117a.U0(v10Var2, false));
                H.Z();
                return;
            default:
                ((n50) obj).dismiss();
                return;
        }
    }
}
