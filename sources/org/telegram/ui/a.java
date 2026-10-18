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
    public final int f35219a;
    public final Object f35220b;

    public a(Object obj, int i10) {
        this.f35219a = i10;
        this.f35220b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.p6 p6Var;
        String str;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        org.telegram.ui.Cells.v8 v8Var;
        Runnable runnable;
        int i10 = this.f35219a;
        Object obj = this.f35220b;
        switch (i10) {
            case 0:
                ((ah.o) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.f3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.y0 webView = ((o3) obj).f39648f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                v4 v4Var = (v4) obj;
                if (view == v4Var.e) {
                    org.telegram.ui.Components.f5.j(v4Var.getParentActivity(), null, new g(v4Var, 4));
                    return;
                }
                int i11 = ((u4) view).e;
                if (v4Var.U() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i11 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.v0(17));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new m4.w0(6, v4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                v4Var.W(view, true);
                return;
            case 4:
                ((h5) obj).b(false);
                return;
            case 5:
                ((c7) obj).m0();
                return;
            case 6:
                s6 s6Var = (s6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(s6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(s6Var.f39683c.f29198i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) p6Var.f29198i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20601a;
                b2Var2.R = sb3;
                b2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(s6Var.f39682b.f29198i, new b1(s6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                s6Var.d.showDialog(b2Var2);
                View d = b2Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.h6.f21207p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    d.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i12, false))));
                    return;
                }
                return;
            case 7:
                c7 c7Var = ((a7) obj).e;
                c7Var.M = !c7Var.M;
                c7Var.w0(true);
                c7Var.v0();
                return;
            case 8:
                n7 n7Var = (n7) obj;
                switch (n7Var.f39347f) {
                    case 0:
                        ((o7) n7Var.h).f39689r.v.s0(null, (bi.b) n7Var.getTag(), true);
                        return;
                    default:
                        ((t7) n7Var.h).f41592n.v.s0(null, (bi.b) n7Var.getTag(), true);
                        return;
                }
            case 9:
                ((i4) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.xj0 xj0Var = ((j9) obj).d;
                if (!xj0Var.b()) {
                    xj0Var.setProgress(0.0f);
                    xj0Var.d();
                    return;
                }
                return;
            case 11:
                ((dd) obj).w0();
                return;
            case 12:
                sn snVar = ((hj) obj).f37546b;
                snVar.f41219h0.n();
                ci.a3 a3Var = snVar.J1;
                if (a3Var != null) {
                    a3Var.L1(null, 0);
                }
                snVar.ca();
                return;
            case 13:
                sn snVar2 = ((en) obj).f36557a;
                d5Var = ((org.telegram.ui.ActionBar.n2) snVar2).parentLayout;
                if (d5Var != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) snVar2).parentLayout;
                    ((ActionBarLayout) d5Var2).r();
                    return;
                }
                return;
            case 14:
                ((cq) obj).e.r0(true);
                return;
            case 15:
                ((org.telegram.ui.Cells.v8[]) obj)[0].setChecked(!v8Var.e.h);
                return;
            case 16:
                runnable = ((org.telegram.ui.ActionBar.a3) obj).f20609a.dismissRunnable;
                runnable.run();
                return;
            case 17:
                org.telegram.messenger.lk.n(3, (org.telegram.ui.ActionBar.n2) obj);
                return;
            case 18:
                final xu xuVar = (xu) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xuVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20601a;
                b2Var3.R = string2;
                b2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                xuVar.dismiss();
                                return;
                            default:
                                xu xuVar2 = xuVar;
                                xuVar2.dismiss();
                                n2.e eVar = xuVar2.Z;
                                ((c7) eVar.f17039c).l0(xuVar2.Y, xuVar2.f43236b0, xuVar2.f43241g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2() {
                    @Override
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                xuVar.dismiss();
                                return;
                            default:
                                xu xuVar2 = xuVar;
                                xuVar2.dismiss();
                                n2.e eVar = xuVar2.Z;
                                ((c7) eVar.f17039c).l0(xuVar2.Y, xuVar2.f43236b0, xuVar2.f43241g0);
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
                ((c00) obj).R();
                return;
            case 22:
                ((b00) obj).f35509a.dismiss();
                return;
            case 23:
                org.telegram.ui.Components.xj0 xj0Var2 = ((f00) obj).f36757a;
                if (!xj0Var2.b()) {
                    xj0Var2.setProgress(0.0f);
                    xj0Var2.d();
                    return;
                }
                return;
            case 24:
                ((i00) obj).c();
                return;
            case 25:
                j10 j10Var = (j10) obj;
                org.telegram.ui.Components.ba0 ba0Var = j10Var.f38010s;
                if ((!j10Var.f38009r || ba0Var.c()) && j10Var.f38012x != null) {
                    j10Var.f38009r = true;
                    ba0Var.f24891b = -1L;
                    ba0Var.f24892c = -1L;
                    j10Var.f38008n.invalidate();
                    c00.T(j10Var.E, j10Var.f38012x, new fz(j10Var, 4));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.xj0 xj0Var3 = ((k10) obj).f38368a;
                if (!xj0Var3.b()) {
                    xj0Var3.setProgress(0.0f);
                    xj0Var3.d();
                    return;
                }
                return;
            case 27:
                final n10 n10Var = (n10) obj;
                j10 j10Var2 = (j10) view.getParent();
                final MessagesController.DialogFilter currentFilter = j10Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = n10Var.e;
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(filtersSetupActivity, j10Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        switch (r3) {
                            case 0:
                                n10 n10Var2 = n10Var;
                                FiltersSetupActivity filtersSetupActivity2 = n10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = n10Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.k0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new p00(dialogFilter, null));
                                return;
                            default:
                                n10 n10Var3 = n10Var;
                                FiltersSetupActivity filtersSetupActivity3 = n10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.k10.U(filtersSetupActivity3, dialogFilter2.f17798id, new v3(n10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20601a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20601a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new zu(6, n10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20601a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
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
                                n10 n10Var2 = n10Var;
                                FiltersSetupActivity filtersSetupActivity2 = n10Var2.e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = n10Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.n2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new sg.k0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new p00(dialogFilter, null));
                                return;
                            default:
                                n10 n10Var3 = n10Var;
                                FiltersSetupActivity filtersSetupActivity3 = n10Var3.e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.k10.U(filtersSetupActivity3, dialogFilter2.f17798id, new v3(n10Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20601a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20601a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new zu(6, n10Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder4.f20601a;
                                filtersSetupActivity3.showDialog(b2Var4);
                                TextView textView = (TextView) b2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f27116i = 3;
                }
                H.W(filtersSetupActivity.f33128a.V0(j10Var2, false));
                H.Z();
                return;
            case 28:
                ((c50) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) obj;
                xpVar.a(!xpVar.f32428a.f24147q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", xpVar.f32428a.f24147q).apply();
                return;
        }
    }
}
