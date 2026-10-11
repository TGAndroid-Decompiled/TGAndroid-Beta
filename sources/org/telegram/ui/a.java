package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a implements View.OnClickListener {
    public final int f35857a;
    public final Object f35858b;

    public a(Object obj, int i10) {
        this.f35857a = i10;
        this.f35858b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.q6 q6Var;
        String str;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i10 = this.f35857a;
        Object obj = this.f35858b;
        switch (i10) {
            case 0:
                ((ai.s1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.e3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.y0 webView = ((l3) obj).f39533f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                o4 o4Var = (o4) obj;
                if (view == o4Var.f40448e) {
                    org.telegram.ui.Components.g5.j(o4Var.getParentActivity(), null, new g(o4Var, 4));
                    return;
                }
                int i11 = ((n4) view).f40157e;
                if (o4Var.U() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i11 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.p0(24));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.v0(3, o4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                o4Var.W(view, true);
                return;
            case 4:
                ((b5) obj).b(false);
                return;
            case 5:
                ((x6) obj).m0();
                return;
            case 6:
                n6 n6Var = (n6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(n6Var.f38893c.f30140i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) q6Var.f30140i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20404a;
                a2Var2.R = sb3;
                a2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(n6Var.f38892b.f30140i, new y0(n6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                n6Var.d.showDialog(a2Var2);
                View d = a2Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.h6.f21043p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    d.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i12, false))));
                    return;
                }
                return;
            case 7:
                x6 x6Var = ((v6) obj).f42913e;
                x6Var.M = !x6Var.M;
                x6Var.w0(true);
                x6Var.v0();
                return;
            case 8:
                i7 i7Var = (i7) obj;
                switch (i7Var.f38635f) {
                    case 0:
                        ((j7) i7Var.h).f38895r.v.y0(null, (zh.a) i7Var.getTag(), true);
                        return;
                    default:
                        ((o7) i7Var.h).f40468n.v.y0(null, (zh.a) i7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ai.s1) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.gk0 gk0Var = ((f9) obj).d;
                if (!gk0Var.b()) {
                    gk0Var.setProgress(0.0f);
                    gk0Var.d();
                    return;
                }
                return;
            case 11:
                ((ad) obj).w0();
                return;
            case 12:
                zn znVar = ((oj) obj).f40590b;
                znVar.f44822h0.n();
                ai.h4 h4Var = znVar.J1;
                if (h4Var != null) {
                    h4Var.L1(null, 0);
                }
                znVar.ca();
                return;
            case 13:
                zn znVar2 = ((ln) obj).f39735a;
                b5Var = ((org.telegram.ui.ActionBar.m2) znVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.m2) znVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    return;
                }
                return;
            case 14:
                ((mq) obj).f40084e.r0(true);
                return;
            case 15:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!w8Var.f23716e.h);
                return;
            case 16:
                runnable = ((org.telegram.ui.ActionBar.z2) obj).f21746a.dismissRunnable;
                runnable.run();
                return;
            case 17:
                org.telegram.messenger.ai.n(3, (org.telegram.ui.ActionBar.m2) obj);
                return;
            case 18:
                final hv hvVar = (hv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.f20404a;
                a2Var3.R = string2;
                a2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                hvVar.dismiss();
                                return;
                            default:
                                hv hvVar2 = hvVar;
                                hvVar2.dismiss();
                                n6.k kVar = hvVar2.Z;
                                ((x6) kVar.f16766c).l0(hvVar2.Y, hvVar2.f38546b0, hvVar2.f38551g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                hvVar.dismiss();
                                return;
                            default:
                                hv hvVar2 = hvVar;
                                hvVar2.dismiss();
                                n6.k kVar = hvVar2.Z;
                                ((x6) kVar.f16766c).l0(hvVar2.Y, hvVar2.f38546b0, hvVar2.f38551g0);
                                return;
                        }
                    }
                });
                a2Var3.show();
                a2Var3.h();
                return;
            case 19:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            case 20:
                String str2 = (String) obj;
                ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
                if (applicationLoader != null) {
                    applicationLoader.onSuggestionClick(str2);
                    return;
                }
                return;
            case 21:
                ((q00) obj).R();
                return;
            case 22:
                ((p00) obj).f40713a.dismiss();
                return;
            case 23:
                org.telegram.ui.Components.gk0 gk0Var2 = ((u00) obj).f42337a;
                if (!gk0Var2.b()) {
                    gk0Var2.setProgress(0.0f);
                    gk0Var2.d();
                    return;
                }
                return;
            case 24:
                ((x00) obj).c();
                return;
            case 25:
                x10 x10Var = (x10) obj;
                org.telegram.ui.Components.ia0 ia0Var = x10Var.f43969s;
                if ((!x10Var.f43968r || ia0Var.c()) && x10Var.f43971x != null) {
                    x10Var.f43968r = true;
                    ia0Var.f27385b = -1L;
                    ia0Var.f27386c = -1L;
                    x10Var.f43967n.invalidate();
                    q00.T(x10Var.E, x10Var.f43971x, new tz(x10Var, 4));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.gk0 gk0Var3 = ((y10) obj).f44268a;
                if (!gk0Var3.b()) {
                    gk0Var3.setProgress(0.0f);
                    gk0Var3.d();
                    return;
                }
                return;
            case 27:
                final b20 b20Var = (b20) obj;
                x10 x10Var2 = (x10) view.getParent();
                final MessagesController.DialogFilter currentFilter = x10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = b20Var.f36279e;
                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(filtersSetupActivity, x10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        switch (r3) {
                            case 0:
                                b20 b20Var2 = b20Var;
                                FiltersSetupActivity filtersSetupActivity2 = b20Var2.f36279e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = b20Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new e10(dialogFilter, null));
                                return;
                            default:
                                b20 b20Var3 = b20Var;
                                FiltersSetupActivity filtersSetupActivity3 = b20Var3.f36279e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.t10.U(filtersSetupActivity3, dialogFilter2.f17287id, new s3(b20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20404a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20404a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new nw(3, b20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f20404a;
                                filtersSetupActivity3.showDialog(a2Var4);
                                TextView textView = (TextView) a2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.FilterDeleteItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        switch (r3) {
                            case 0:
                                b20 b20Var2 = b20Var;
                                FiltersSetupActivity filtersSetupActivity2 = b20Var2.f36279e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = b20Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new e10(dialogFilter, null));
                                return;
                            default:
                                b20 b20Var3 = b20Var;
                                FiltersSetupActivity filtersSetupActivity3 = b20Var3.f36279e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.t10.U(filtersSetupActivity3, dialogFilter2.f17287id, new s3(b20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20404a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20404a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new nw(3, b20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f20404a;
                                filtersSetupActivity3.showDialog(a2Var4);
                                TextView textView = (TextView) a2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f29761i = 3;
                }
                H.W(filtersSetupActivity.f33822a.V0(x10Var2, false));
                H.Z();
                return;
            case 28:
                ((p50) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.dq dqVar = (org.telegram.ui.Components.dq) obj;
                dqVar.a(!dqVar.f25859a.f24125q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", dqVar.f25859a.f24125q).apply();
                return;
        }
    }
}
