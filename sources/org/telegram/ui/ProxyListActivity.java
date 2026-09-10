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
public class ProxyListActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public NumberTextView G;
    public final ArrayList H;
    public final ArrayList I;
    public boolean J;
    public l21 f30530a;
    public org.telegram.ui.Components.vl0 f30531b;
    public int f30532c;
    private int callsRow;
    public boolean d;
    public boolean e;
    public int f30533f;
    public int h;
    public int f30534n;
    private int proxyAddRow;
    public int f30535r;
    public int f30536s;
    private int useProxyRow;
    public int v;
    public int f30537w;
    public int f30538x;
    public int f30539y;

    public ProxyListActivity() {
        super(null);
        this.H = new ArrayList();
        this.I = new ArrayList();
    }

    public static void U(ProxyListActivity proxyListActivity, View view, int i10) {
        boolean z10;
        ArrayList arrayList = proxyListActivity.I;
        if (i10 == proxyListActivity.useProxyRow) {
            if (SharedConfig.currentProxy == null) {
                if (!arrayList.isEmpty()) {
                    SharedConfig.currentProxy = (SharedConfig.ProxyInfo) arrayList.get(0);
                    if (!proxyListActivity.d) {
                        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                        SharedConfig.currentProxy.settings.f(edit);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new u21());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.c0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.x8) view).setChecked(proxyListActivity.d);
            if (!proxyListActivity.d) {
                org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) proxyListActivity.f30531b.K(proxyListActivity.callsRow);
                if (fl0Var != null) {
                    ((org.telegram.ui.Cells.x8) fl0Var.f41610a).setChecked(false);
                }
                proxyListActivity.e = false;
            }
            SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i11 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(proxyListActivity, i11);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
            for (int i12 = proxyListActivity.f30535r; i12 < proxyListActivity.f30536s; i12++) {
                org.telegram.ui.Components.fl0 fl0Var2 = (org.telegram.ui.Components.fl0) proxyListActivity.f30531b.K(i12);
                if (fl0Var2 != null) {
                    ((m21) fl0Var2.f41610a).b();
                }
            }
        } else if (i10 == proxyListActivity.f30537w) {
            boolean z11 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z11;
            ((org.telegram.ui.Cells.x8) view).setChecked(z11);
            SharedConfig.saveConfig();
            proxyListActivity.c0(true);
        } else if (i10 == proxyListActivity.callsRow) {
            boolean z12 = !proxyListActivity.e;
            proxyListActivity.e = z12;
            ((org.telegram.ui.Cells.x8) view).setChecked(z12);
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            edit3.putBoolean("proxy_enabled_calls", proxyListActivity.e);
            edit3.commit();
        } else if (i10 >= proxyListActivity.f30535r && i10 < proxyListActivity.f30536s) {
            if (!proxyListActivity.H.isEmpty()) {
                proxyListActivity.f30530a.G(i10);
                return;
            }
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.f30535r);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit4 = MessagesController.getGlobalMainSettings().edit();
            proxyInfo.settings.f(edit4);
            edit4.putBoolean("proxy_enabled", proxyListActivity.d);
            if (!proxyInfo.settings.f12529f.isEmpty()) {
                proxyListActivity.e = false;
                edit4.putBoolean("proxy_enabled_calls", false);
            }
            edit4.commit();
            SharedConfig.currentProxy = proxyInfo;
            for (int i13 = proxyListActivity.f30535r; i13 < proxyListActivity.f30536s; i13++) {
                org.telegram.ui.Components.fl0 fl0Var3 = (org.telegram.ui.Components.fl0) proxyListActivity.f30531b.K(i13);
                if (fl0Var3 != null) {
                    m21 m21Var = (m21) fl0Var3.f41610a;
                    if (m21Var.d == proxyInfo) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m21Var.setChecked(z10);
                    m21Var.b();
                }
            }
            proxyListActivity.c0(false);
            org.telegram.ui.Components.fl0 fl0Var4 = (org.telegram.ui.Components.fl0) proxyListActivity.f30531b.K(proxyListActivity.useProxyRow);
            if (fl0Var4 != null) {
                ((org.telegram.ui.Cells.x8) fl0Var4.f41610a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
        } else if (i10 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new u21());
        } else if (i10 == proxyListActivity.F) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i21(proxyListActivity));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            proxyListActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            }
        }
    }

    public static void V(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.I;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
        }
        proxyListActivity.e = false;
        proxyListActivity.d = false;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.proxySettingsChanged;
        globalInstance.removeObserver(proxyListActivity, i11);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
        proxyListActivity.c0(true);
        l21 l21Var = proxyListActivity.f30530a;
        if (l21Var != null) {
            l21Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f30530a.n(proxyListActivity.callsRow, 0);
            proxyListActivity.f30530a.F();
        }
    }

    public final void c0(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.c0(boolean):void");
    }

    @Override
    public final View createView(Context context) {
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 23));
        this.f30530a = new l21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f30531b = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f30531b);
        ((s4.j) this.f30531b.getItemAnimator()).C = false;
        ((s4.j) this.f30531b.getItemAnimator()).f41667o = org.telegram.ui.Components.wr.f28819f;
        this.f30531b.setVerticalScrollBarEnabled(false);
        this.f30531b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f30531b, w7.a6.e(-1, -1, 51));
        this.f30531b.setAdapter(this.f30530a);
        this.f30531b.setOnItemClickListener(new i(this, 29));
        this.f30531b.setOnItemLongClickListener(new i21(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.G = numberTextView;
        numberTextView.setTextSize(18);
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18308y8, false));
        j3.addView(this.G, w7.a6.m(1.0f, 0, -1, 72, 0, 0));
        this.G.setOnTouchListener(new ai.h(2));
        j3.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j3.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new k21(this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.m4.class, m21.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 0, new Class[]{m21.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 262156, new Class[]{m21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18199s6));
        int i11 = org.telegram.ui.ActionBar.j6.f18325z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 262156, new Class[]{m21.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 262156, new Class[]{m21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18271w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 262156, new Class[]{m21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18144p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 8, new Class[]{m21.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30531b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.H.isEmpty()) {
            if (z10) {
                this.f30530a.F();
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
        boolean z10;
        super.onFragmentCreate();
        SharedConfig.loadProxyList();
        this.f30532c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdateConnectionState);
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("proxy_enabled", false) && !SharedConfig.proxyList.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.e = globalMainSettings.getBoolean("proxy_enabled_calls", false);
        c0(true);
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
        l21 l21Var = this.f30530a;
        if (l21Var != null) {
            l21Var.l();
        }
    }
}
