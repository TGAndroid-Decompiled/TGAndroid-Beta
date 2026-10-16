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
    public final int f33698a;
    public final Object f33699b;

    public a(Object obj, int i10) {
        this.f33698a = i10;
        this.f33699b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.r6 r6Var;
        String str;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i10 = this.f33698a;
        Object obj = this.f33699b;
        switch (i10) {
            case 0:
                ((ah.o) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.e3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.z0 webView = ((o3) obj).f38531f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                u4 u4Var = (u4) obj;
                if (view == u4Var.e) {
                    org.telegram.ui.Components.g5.j(u4Var.getParentActivity(), null, new g(u4Var, 4));
                    return;
                }
                int i11 = ((t4) view).e;
                if (u4Var.U() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i11 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(15));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.y0(4, u4Var, view));
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
                t6 t6Var = (t6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(t6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(t6Var.f38555c.f28440i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) r6Var.f28440i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19248a;
                a2Var2.R = sb3;
                a2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(t6Var.f38554b.f28440i, new b1(t6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                t6Var.d.showDialog(a2Var2);
                View d = a2Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.g6.f19822p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
                    d.setBackground(org.telegram.ui.ActionBar.g6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.x0(null, i12, false))));
                    return;
                }
                return;
            case 7:
                d7 d7Var = ((b7) obj).e;
                d7Var.M = !d7Var.M;
                d7Var.w0(true);
                d7Var.v0();
                return;
            case 8:
                o7 o7Var = (o7) obj;
                switch (o7Var.f38562f) {
                    case 0:
                        ((p7) o7Var.h).f38823r.v.j1(null, (ai.b) o7Var.getTag(), true);
                        return;
                    default:
                        ((u7) o7Var.h).f40281n.v.j1(null, (ai.b) o7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ah.o) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.bk0 bk0Var = ((k9) obj).d;
                if (!bk0Var.b()) {
                    bk0Var.setProgress(0.0f);
                    bk0Var.d();
                    return;
                }
                return;
            case 11:
                ((gd) obj).w0();
                return;
            case 12:
                fo foVar = ((sj) obj).f39833b;
                foVar.f35661h0.n();
                bi.w3 w3Var = foVar.J1;
                if (w3Var != null) {
                    w3Var.L1(null, 0);
                }
                foVar.ca();
                return;
            case 13:
                fo foVar2 = ((qn) obj).f39190a;
                b5Var = ((org.telegram.ui.ActionBar.m2) foVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.m2) foVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    return;
                }
                return;
            case 14:
                ((sq) obj).e.r0(true);
                return;
            case 15:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!w8Var.e.h);
                return;
            case 16:
                runnable = ((org.telegram.ui.ActionBar.z2) obj).f20538a.dismissRunnable;
                runnable.run();
                return;
            case 17:
                org.telegram.messenger.sk.n(3, (org.telegram.ui.ActionBar.m2) obj);
                return;
            case 18:
                final ov ovVar = (ov) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ovVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.f19248a;
                a2Var3.R = string2;
                a2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                ovVar.dismiss();
                                return;
                            default:
                                ov ovVar2 = ovVar;
                                ovVar2.dismiss();
                                n3.b bVar = ovVar2.Z;
                                ((d7) bVar.f15704c).l0(ovVar2.Y, ovVar2.f38752b0, ovVar2.f38757g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                ovVar.dismiss();
                                return;
                            default:
                                ov ovVar2 = ovVar;
                                ovVar2.dismiss();
                                n3.b bVar = ovVar2.Z;
                                ((d7) bVar.f15704c).l0(ovVar2.Y, ovVar2.f38752b0, ovVar2.f38757g0);
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
                ((w00) obj).R();
                return;
            case 22:
                ((v00) obj).f40533a.dismiss();
                return;
            case 23:
                org.telegram.ui.Components.bk0 bk0Var2 = ((a10) obj).f33717a;
                if (!bk0Var2.b()) {
                    bk0Var2.setProgress(0.0f);
                    bk0Var2.d();
                    return;
                }
                return;
            case 24:
                ((d10) obj).c();
                return;
            case 25:
                e20 e20Var = (e20) obj;
                org.telegram.ui.Components.ha0 ha0Var = e20Var.f35183s;
                if ((!e20Var.f35182r || ha0Var.c()) && e20Var.f35185x != null) {
                    e20Var.f35182r = true;
                    ha0Var.f25248b = -1L;
                    ha0Var.f25249c = -1L;
                    e20Var.f35181n.invalidate();
                    w00.T(e20Var.E, e20Var.f35185x, new zz(e20Var, 4));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.bk0 bk0Var3 = ((f20) obj).f35444a;
                if (!bk0Var3.b()) {
                    bk0Var3.setProgress(0.0f);
                    bk0Var3.d();
                    return;
                }
                return;
            case 27:
                final i20 i20Var = (i20) obj;
                e20 e20Var2 = (e20) view.getParent();
                final MessagesController.DialogFilter currentFilter = e20Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = i20Var.e;
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(filtersSetupActivity, e20Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        switch (r3) {
                            case 0:
                                i20 i20Var2 = i20Var;
                                FiltersSetupActivity filtersSetupActivity2 = i20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = i20Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new k10(dialogFilter, null));
                                return;
                            default:
                                i20 i20Var3 = i20Var;
                                FiltersSetupActivity filtersSetupActivity3 = i20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.o10.U(filtersSetupActivity3, dialogFilter2.f16400id, new v3(i20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f19248a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f19248a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new qw(4, i20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f19248a;
                                filtersSetupActivity3.showDialog(a2Var4);
                                TextView textView = (TextView) a2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
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
                                i20 i20Var2 = i20Var;
                                FiltersSetupActivity filtersSetupActivity2 = i20Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = i20Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new k10(dialogFilter, null));
                                return;
                            default:
                                i20 i20Var3 = i20Var;
                                FiltersSetupActivity filtersSetupActivity3 = i20Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.o10.U(filtersSetupActivity3, dialogFilter2.f16400id, new v3(i20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f19248a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f19248a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new qw(4, i20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f19248a;
                                filtersSetupActivity3.showDialog(a2Var4);
                                TextView textView = (TextView) a2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f26650i = 3;
                }
                H.W(filtersSetupActivity.f31790a.V0(e20Var2, false));
                H.Z();
                return;
            case 28:
                ((w50) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.aq aqVar = (org.telegram.ui.Components.aq) obj;
                aqVar.a(!aqVar.f23281a.f22792q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", aqVar.f23281a.f22792q).apply();
                return;
        }
    }
}
