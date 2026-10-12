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
    public final int f35633a;
    public final Object f35634b;

    public a(Object obj, int i10) {
        this.f35633a = i10;
        this.f35634b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.q6 q6Var;
        String str;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        org.telegram.ui.Cells.w8 w8Var;
        Runnable runnable;
        int i10 = this.f35633a;
        Object obj = this.f35634b;
        switch (i10) {
            case 0:
                ((ai.s1) obj).run();
                return;
            case 1:
                ((org.telegram.ui.ActionBar.e3[]) obj)[0].dismiss();
                return;
            case 2:
                org.telegram.ui.web.y0 webView = ((m3) obj).f39895f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 3:
                s4 s4Var = (s4) obj;
                if (view == s4Var.f41803e) {
                    org.telegram.ui.Components.g5.j(s4Var.getParentActivity(), null, new g(s4Var, 4));
                    return;
                }
                int i11 = ((r4) view).f41499e;
                if (s4Var.U() == 0 && i11 > 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s4Var.getParentActivity());
                    String string = LocaleController.getString(R.string.MessageLifetime);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.formatString("AutoDeleteConfirmMessage", R.string.AutoDeleteConfirmMessage, LocaleController.formatTTLString(i11 * 60));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m4.r0(22));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new o(2, s4Var, view));
                    alertDialog$Builder.o();
                    return;
                }
                s4Var.W(view, true);
                return;
            case 4:
                ((f5) obj).b(false);
                return;
            case 5:
                ((b7) obj).m0();
                return;
            case 6:
                r6 r6Var = (r6) obj;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r6Var.getContext());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(LocaleController.getString(R.string.ClearCache));
                if (TextUtils.isEmpty(r6Var.f40234c.f29718i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) q6Var.f29718i) + ")";
                }
                sb2.append(str);
                String sb3 = sb2.toString();
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20141a;
                a2Var2.R = sb3;
                a2Var2.T = LocaleController.getString(R.string.StorageUsageInfo);
                alertDialog$Builder2.k(r6Var.f40233b.f29718i, new z0(r6Var, 8));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                r6Var.d.showDialog(a2Var2);
                View d = a2Var2.d(-1);
                if (d instanceof TextView) {
                    int i12 = org.telegram.ui.ActionBar.h6.f20780p7;
                    ((TextView) d).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                    d.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i12, false))));
                    return;
                }
                return;
            case 7:
                b7 b7Var = ((z6) obj).f44621e;
                b7Var.M = !b7Var.M;
                b7Var.w0(true);
                b7Var.v0();
                return;
            case 8:
                m7 m7Var = (m7) obj;
                switch (m7Var.f39936f) {
                    case 0:
                        ((n7) m7Var.h).f40241r.v.y0(null, (zh.a) m7Var.getTag(), true);
                        return;
                    default:
                        ((s7) m7Var.h).f41825n.v.y0(null, (zh.a) m7Var.getTag(), true);
                        return;
                }
            case 9:
                ((ai.s1) obj).run();
                return;
            case 10:
                org.telegram.ui.Components.ik0 ik0Var = ((j9) obj).d;
                if (!ik0Var.b()) {
                    ik0Var.setProgress(0.0f);
                    ik0Var.d();
                    return;
                }
                return;
            case 11:
                ((fd) obj).w0();
                return;
            case 12:
                eo eoVar = ((sj) obj).f41937b;
                eoVar.f37277h0.n();
                ai.h4 h4Var = eoVar.J1;
                if (h4Var != null) {
                    h4Var.L1(null, 0);
                }
                eoVar.ca();
                return;
            case 13:
                eo eoVar2 = ((pn) obj).f40998a;
                b5Var = ((org.telegram.ui.ActionBar.m2) eoVar2).parentLayout;
                if (b5Var != null) {
                    b5Var2 = ((org.telegram.ui.ActionBar.m2) eoVar2).parentLayout;
                    ((ActionBarLayout) b5Var2).r();
                    return;
                }
                return;
            case 14:
                ((pq) obj).f41067e.r0(true);
                return;
            case 15:
                ((org.telegram.ui.Cells.w8[]) obj)[0].setChecked(!w8Var.f23451e.h);
                return;
            case 16:
                runnable = ((org.telegram.ui.ActionBar.z2) obj).f21484a.dismissRunnable;
                runnable.run();
                return;
            case 17:
                org.telegram.messenger.am.n(3, (org.telegram.ui.ActionBar.m2) obj);
                return;
            case 18:
                final lv lvVar = (lv) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(lvVar.getContext());
                String string2 = LocaleController.getString(R.string.ClearCache);
                org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder3.f20141a;
                a2Var3.R = string2;
                a2Var3.T = LocaleController.getString(R.string.ClearCacheForChat);
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.z1() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                lvVar.dismiss();
                                return;
                            default:
                                lv lvVar2 = lvVar;
                                lvVar2.dismiss();
                                n6.k kVar = lvVar2.Z;
                                ((b7) kVar.f16433c).l0(lvVar2.Y, lvVar2.f39846b0, lvVar2.f39851g0);
                                return;
                        }
                    }
                });
                alertDialog$Builder3.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1() {
                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var4, int i13) {
                        switch (r2) {
                            case 0:
                                lvVar.dismiss();
                                return;
                            default:
                                lv lvVar2 = lvVar;
                                lvVar2.dismiss();
                                n6.k kVar = lvVar2.Z;
                                ((b7) kVar.f16433c).l0(lvVar2.Y, lvVar2.f39846b0, lvVar2.f39851g0);
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
                ((t00) obj).R();
                return;
            case 22:
                ((s00) obj).f41777a.dismiss();
                return;
            case 23:
                org.telegram.ui.Components.ik0 ik0Var2 = ((x00) obj).f43705a;
                if (!ik0Var2.b()) {
                    ik0Var2.setProgress(0.0f);
                    ik0Var2.d();
                    return;
                }
                return;
            case 24:
                ((a10) obj).c();
                return;
            case 25:
                a20 a20Var = (a20) obj;
                org.telegram.ui.Components.ma0 ma0Var = a20Var.f35675s;
                if ((!a20Var.f35674r || ma0Var.c()) && a20Var.f35677x != null) {
                    a20Var.f35674r = true;
                    ma0Var.f28467b = -1L;
                    ma0Var.f28468c = -1L;
                    a20Var.f35673n.invalidate();
                    t00.T(a20Var.E, a20Var.f35677x, new wz(a20Var, 4));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.ik0 ik0Var3 = ((b20) obj).f36034a;
                if (!ik0Var3.b()) {
                    ik0Var3.setProgress(0.0f);
                    ik0Var3.d();
                    return;
                }
                return;
            case 27:
                final e20 e20Var = (e20) obj;
                a20 a20Var2 = (a20) view.getParent();
                final MessagesController.DialogFilter currentFilter = a20Var2.getCurrentFilter();
                FiltersSetupActivity filtersSetupActivity = e20Var.f36960e;
                org.telegram.ui.Components.s80 H = org.telegram.ui.Components.s80.H(filtersSetupActivity, a20Var2);
                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.FilterEditItem), new Runnable() {
                    @Override
                    public final void run() {
                        int i13;
                        switch (r3) {
                            case 0:
                                e20 e20Var2 = e20Var;
                                FiltersSetupActivity filtersSetupActivity2 = e20Var2.f36960e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = e20Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new h10(dialogFilter, null));
                                return;
                            default:
                                e20 e20Var3 = e20Var;
                                FiltersSetupActivity filtersSetupActivity3 = e20Var3.f36960e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.v10.U(filtersSetupActivity3, dialogFilter2.f17003id, new t3(e20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20141a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20141a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new tw(2, e20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f20141a;
                                filtersSetupActivity3.showDialog(a2Var4);
                                TextView textView = (TextView) a2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
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
                                e20 e20Var2 = e20Var;
                                FiltersSetupActivity filtersSetupActivity2 = e20Var2.f36960e;
                                MessagesController.DialogFilter dialogFilter = currentFilter;
                                if (dialogFilter.locked) {
                                    Context context = e20Var2.d;
                                    i13 = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity2).currentAccount;
                                    filtersSetupActivity2.showDialog(new rg.j0(3, i13, context, filtersSetupActivity2, null));
                                    return;
                                }
                                filtersSetupActivity2.presentFragment(new h10(dialogFilter, null));
                                return;
                            default:
                                e20 e20Var3 = e20Var;
                                FiltersSetupActivity filtersSetupActivity3 = e20Var3.f36960e;
                                MessagesController.DialogFilter dialogFilter2 = currentFilter;
                                if (dialogFilter2.isChatlist()) {
                                    org.telegram.ui.Components.v10.U(filtersSetupActivity3, dialogFilter2.f17003id, new t3(e20Var3, 6));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(filtersSetupActivity3.getParentActivity());
                                alertDialog$Builder4.f20141a.R = LocaleController.getString(R.string.FilterDelete);
                                alertDialog$Builder4.f20141a.T = LocaleController.getString(R.string.FilterDeleteAlert);
                                alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new tw(2, e20Var3, dialogFilter2));
                                org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder4.f20141a;
                                filtersSetupActivity3.showDialog(a2Var4);
                                TextView textView = (TextView) a2Var4.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
                                    return;
                                }
                                return;
                        }
                    }
                }, true);
                if (LocaleController.isRTL) {
                    H.f30454i = 3;
                }
                H.W(filtersSetupActivity.f33597a.V0(a20Var2, false));
                H.Z();
                return;
            case 28:
                ((r50) obj).dismiss();
                return;
            default:
                org.telegram.ui.Components.fq fqVar = (org.telegram.ui.Components.fq) obj;
                fqVar.a(!fqVar.f26150a.f23874q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", fqVar.f26150a.f23874q).apply();
                return;
        }
    }
}
