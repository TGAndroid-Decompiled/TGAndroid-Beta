package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
public class ProxyListActivity extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public NumberTextView E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public w11 f31778a;
    public org.telegram.ui.Components.zl0 f31779b;
    public int f31780c;
    public boolean d;
    public int e;
    public int f31781f;
    public int h;
    public int f31782n;
    private int proxyAddRow;
    public int f31783r;
    public int f31784s;
    private int useProxyRow;
    public int v;
    public int f31785w;
    public int f31786x;
    public int f31787y;

    public ProxyListActivity() {
        super(null);
        this.F = new ArrayList();
        this.G = new ArrayList();
    }

    public static void U(ProxyListActivity proxyListActivity, View view, int i10) {
        boolean z10;
        ArrayList arrayList = proxyListActivity.G;
        if (i10 == proxyListActivity.useProxyRow) {
            if (SharedConfig.currentProxy == null) {
                if (!arrayList.isEmpty()) {
                    SharedConfig.currentProxy = (SharedConfig.ProxyInfo) arrayList.get(0);
                    if (!proxyListActivity.d) {
                        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                        SharedConfig.currentProxy.settings.h(edit);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new f21());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.b0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.w8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i11 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(proxyListActivity, i11);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
            for (int i12 = proxyListActivity.f31782n; i12 < proxyListActivity.f31783r; i12++) {
                org.telegram.ui.Components.jl0 jl0Var = (org.telegram.ui.Components.jl0) proxyListActivity.f31779b.K(i12);
                if (jl0Var != null) {
                    ((x11) jl0Var.f43068a).b();
                }
            }
        } else if (i10 == proxyListActivity.v) {
            boolean z11 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z11;
            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
            SharedConfig.saveConfig();
            proxyListActivity.b0(true);
        } else if (i10 >= proxyListActivity.f31782n && i10 < proxyListActivity.f31783r) {
            if (!proxyListActivity.F.isEmpty()) {
                proxyListActivity.f31778a.G(i10);
                return;
            }
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.f31782n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            proxyInfo.settings.h(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            SharedConfig.currentProxy = proxyInfo;
            for (int i13 = proxyListActivity.f31782n; i13 < proxyListActivity.f31783r; i13++) {
                org.telegram.ui.Components.jl0 jl0Var2 = (org.telegram.ui.Components.jl0) proxyListActivity.f31779b.K(i13);
                if (jl0Var2 != null) {
                    x11 x11Var = (x11) jl0Var2.f43068a;
                    if (x11Var.d == proxyInfo) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x11Var.setChecked(z10);
                    x11Var.b();
                }
            }
            proxyListActivity.b0(false);
            org.telegram.ui.Components.jl0 jl0Var3 = (org.telegram.ui.Components.jl0) proxyListActivity.f31779b.K(proxyListActivity.useProxyRow);
            if (jl0Var3 != null) {
                ((org.telegram.ui.Cells.w8) jl0Var3.f43068a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
        } else if (i10 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new f21());
        } else if (i10 == proxyListActivity.f31787y) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new t11(proxyListActivity));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
            proxyListActivity.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19315q7, false));
            }
        }
    }

    public static void V(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.G;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
        }
        proxyListActivity.d = false;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.proxySettingsChanged;
        globalInstance.removeObserver(proxyListActivity, i11);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
        proxyListActivity.b0(true);
        w11 w11Var = proxyListActivity.f31778a;
        if (w11Var != null) {
            w11Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f31778a.F();
        }
    }

    public final void b0(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.b0(boolean):void");
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 23));
        this.f31778a = new w11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f31779b = zl0Var;
        zl0Var.s1();
        this.actionBar.setAdaptiveBackground(this.f31779b);
        ((s4.j) this.f31779b.getItemAnimator()).C = false;
        ((s4.j) this.f31779b.getItemAnimator()).f43125o = org.telegram.ui.Components.tr.f28636f;
        this.f31779b.setSectionsDrawBackground(true);
        this.f31779b.setVerticalScrollBarEnabled(false);
        this.f31779b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.f31779b, w7.y5.e(-1, -1, 51));
        this.f31779b.setAdapter(this.f31778a);
        this.f31779b.setOnItemClickListener(new i(this, 29));
        this.f31779b.setOnItemLongClickListener(new t11(this));
        org.telegram.ui.ActionBar.y j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.E = numberTextView;
        numberTextView.setTextSize(18);
        this.E.setTypeface(AndroidUtilities.bold());
        this.E.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19461y8, false));
        j3.addView(this.E, w7.y5.m(1.0f, 0, -1, 72, 0, 0));
        this.E.setOnTouchListener(new bi.d(2));
        j3.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j3.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new v11(this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.m4.class, x11.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19076d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f19354s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19409v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19373t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19197k0, null, null, org.telegram.ui.ActionBar.h6.f19077d7));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 0, new Class[]{x11.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 262156, new Class[]{x11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19352s6));
        int i11 = org.telegram.ui.ActionBar.h6.f19478z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 262156, new Class[]{x11.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 262156, new Class[]{x11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19425w6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 262156, new Class[]{x11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19296p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 8, new Class[]{x11.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19040b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31779b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.F.isEmpty()) {
            if (z10) {
                this.f31778a.F();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        SharedConfig.loadProxyList();
        this.f31780c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdateConnectionState);
        boolean z10 = false;
        if (MessagesController.getGlobalMainSettings().getBoolean("proxy_enabled", false) && !SharedConfig.proxyList.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        b0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didUpdateConnectionState);
    }

    @Override
    public final void onResume() {
        super.onResume();
        w11 w11Var = this.f31778a;
        if (w11Var != null) {
            w11Var.l();
        }
    }
}
