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
    public final int f35830a;
    public final Object f35831b;

    public a(Object obj, int i10) {
        this.f35830a = i10;
        this.f35831b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.q6 q6Var;
        String str;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i10 = this.f35830a;
        Object obj = this.f35831b;
        switch (i10) {
            case 0:
                ((ai.s1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.y0 webView = ((m3) obj).f39799f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                p4 p4Var = (p4) obj;
                if (view == p4Var.f40705e) {
                    org.telegram.ui.Components.g5.j(p4Var.getParentActivity(), null, new g(p4Var, 4));
                    return;
                }
                int i11 = ((o4) view).f40456e;
                if (p4Var.U() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i11 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.q0(22));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new o(2, p4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                p4Var.W(view, true);
                return;
            case 4:
                ((c5) obj).b(false);
                return;
            case 5:
                ((y6) obj).m0();
                return;
            case 6:
                o6 o6Var = (o6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(o6Var.f39149c.f30037i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) q6Var.f30037i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20378a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(o6Var.f39148b.f30037i, new z0(o6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                o6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.i6.f21022p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                    d.setBackground(org.telegram.ui.ActionBar.i6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.i6.m1(0.12f, org.telegram.ui.ActionBar.i6.x0(null, i12, false))));
                    return;
                }
                return;
            case 7:
                y6 y6Var = ((w6) obj).f43138e;
                y6Var.M = !y6Var.M;
                y6Var.w0(true);
                y6Var.v0();
                return;
            case 8:
                j7 j7Var = (j7) obj;
                switch (j7Var.f38888f) {
                    case 0:
                        ((k7) j7Var.h).f39153r.v.y0(null, (zh.a) j7Var.getTag(), true);
                        return;
                    default:
                        ((p7) j7Var.h).f40732n.v.y0(null, (zh.a) j7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ai.s1) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.gk0 gk0Var = ((g9) obj).d;
                if (!gk0Var.b()) {
                    gk0Var.setProgress(0.0f);
                    gk0Var.d();
                    return;
                }
                return;
            case 11:
                ((bd) obj).w0();
                return;
            case 12:
                zn znVar = ((oj) obj).f40589b;
                znVar.f44833h0.n();
                ai.h4 h4Var = znVar.J1;
                if (h4Var != null) {
                    h4Var.L1(null, 0);
                }
                znVar.ca();
                return;
            case 13:
                zn znVar2 = ((ln) obj).f39680a;
                d5Var = ((org.telegram.ui.ActionBar.n2) znVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) znVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    return;
                }
                return;
            case 14:
                ((mq) obj).f40008e.r0(true);
                return;
            case 15:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!w8Var.f23692e.h);
                return;
            case 16:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f20384a.dismissRunnable;
                runnable.run();
                return;
            case 17:
                org.telegram.messenger.bi.n(3, (org.telegram.ui.ActionBar.n2) obj);
                return;
            case 18:
                final iv ivVar = (iv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ivVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20378a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                ivVar.dismiss();
                                return;
                            default:
                                iv ivVar2 = ivVar;
                                ivVar2.dismiss();
                                n6.t tVar = ivVar2.Z;
                                ((y6) tVar.f16722c).l0(ivVar2.Y, ivVar2.f38806b0, ivVar2.f38811g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                ivVar.dismiss();
                                return;
                            default:
                                iv ivVar2 = ivVar;
                                ivVar2.dismiss();
                                n6.t tVar = ivVar2.Z;
                                ((y6) tVar.f16722c).l0(ivVar2.Y, ivVar2.f38806b0, ivVar2.f38811g0);
                                return;
                        }
                    }
                });
                b2Var3.show();
                b2Var3.h();
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
                ((r00) obj).R();
                return;
            case 22:
                ((q00) obj).f40993a.dismiss();
                return;
            case 23:
                org.telegram.ui.Components.gk0 gk0Var2 = ((v00) obj).f42637a;
                if (!gk0Var2.b()) {
                    gk0Var2.setProgress(0.0f);
                    gk0Var2.d();
                    return;
                }
                return;
            case 24:
                ((y00) obj).c();
                return;
            case 25:
                y10 y10Var = (y10) obj;
                org.telegram.ui.Components.ja0 ja0Var = y10Var.f44254s;
                if ((!y10Var.f44253r || ja0Var.c()) && y10Var.f44256x != null) {
                    y10Var.f44253r = true;
                    ja0Var.f27632b = -1L;
                    ja0Var.f27633c = -1L;
                    y10Var.f44252n.invalidate();
                    r00.T(y10Var.E, y10Var.f44256x, new uz(y10Var, 4));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.gk0 gk0Var3 = ((z10) obj).f44505a;
                if (!gk0Var3.b()) {
                    gk0Var3.setProgress(0.0f);
                    gk0Var3.d();
                    return;
                }
                return;
            case 27:
                final c20 c20Var = (c20) obj;
                y10 y10Var2 = (y10) view.getParent();
                final MessagesController.DialogFilter currentFilter = y10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = c20Var.f36545e;
                org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(filtersSetupActivity, y10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        switch (r3) {
                            case 0:
                                c20 c20Var2 = c20Var;
                                FiltersSetupActivity filtersSetupActivity2 = c20Var2.f36545e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = c20Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                return;
                            default:
                                c20 c20Var3 = c20Var;
                                FiltersSetupActivity filtersSetupActivity3 = c20Var3.f36545e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.t10.U(filtersSetupActivity3, dialogFilter2.f17256id, new t3(c20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20378a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20378a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new rw(2, c20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20378a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
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
                                c20 c20Var2 = c20Var;
                                FiltersSetupActivity filtersSetupActivity2 = c20Var2.f36545e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = c20Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new f10(dialogFilter, null));
                                return;
                            default:
                                c20 c20Var3 = c20Var;
                                FiltersSetupActivity filtersSetupActivity3 = c20Var3.f36545e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.t10.U(filtersSetupActivity3, dialogFilter2.f17256id, new t3(c20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20378a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20378a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new rw(2, c20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20378a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f30102i = 3;
                }
                H.W(filtersSetupActivity.f33798a.V0(y10Var2, false));
                H.Z();
                return;
            case 28:
                ((p50) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.dq dqVar = (org.telegram.ui.Components.dq) obj;
                dqVar.a(!dqVar.f25781a.f24101q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", dqVar.f25781a.f24101q).apply();
                return;
        }
    }
}
