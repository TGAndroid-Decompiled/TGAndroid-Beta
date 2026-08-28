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
public class ProxyListActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public NumberTextView C;
    public final ArrayList D;
    public final ArrayList E;
    public boolean F;
    public b11 f36096a;
    public org.telegram.ui.Components.wk0 f36097b;
    public int f36098c;
    private int callsRow;
    public boolean d;
    public boolean f36099e;
    public int f36100f;
    public int h;
    public int f36101n;
    private int proxyAddRow;
    public int f36102r;
    public int f36103s;
    private int useProxyRow;
    public int v;
    public int f36104w;
    public int f36105x;
    public int f36106y;

    public ProxyListActivity() {
        super(null);
        this.D = new ArrayList();
        this.E = new ArrayList();
    }

    public static void T(ProxyListActivity proxyListActivity, View view, int i9) {
        boolean z10;
        ArrayList arrayList = proxyListActivity.E;
        if (i9 == proxyListActivity.useProxyRow) {
            if (SharedConfig.currentProxy == null) {
                if (!arrayList.isEmpty()) {
                    SharedConfig.currentProxy = (SharedConfig.ProxyInfo) arrayList.get(0);
                    if (!proxyListActivity.d) {
                        MessagesController.getGlobalMainSettings();
                        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                        edit.putString("proxy_ip", SharedConfig.currentProxy.address);
                        edit.putString("proxy_pass", SharedConfig.currentProxy.password);
                        edit.putString("proxy_user", SharedConfig.currentProxy.username);
                        edit.putInt("proxy_port", SharedConfig.currentProxy.port);
                        edit.putString("proxy_secret", SharedConfig.currentProxy.secret);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new k11());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.b0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.t8) view).setChecked(proxyListActivity.d);
            if (!proxyListActivity.d) {
                org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) proxyListActivity.f36097b.K(proxyListActivity.callsRow);
                if (ik0Var != null) {
                    ((org.telegram.ui.Cells.t8) ik0Var.f5501a).setChecked(false);
                }
                proxyListActivity.f36099e = false;
            }
            SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            boolean z11 = proxyListActivity.d;
            SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
            ConnectionsManager.setProxySettings(z11, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret);
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i10 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(proxyListActivity, i10);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
            NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i10);
            for (int i11 = proxyListActivity.f36102r; i11 < proxyListActivity.f36103s; i11++) {
                org.telegram.ui.Components.ik0 ik0Var2 = (org.telegram.ui.Components.ik0) proxyListActivity.f36097b.K(i11);
                if (ik0Var2 != null) {
                    ((c11) ik0Var2.f5501a).b();
                }
            }
        } else if (i9 == proxyListActivity.f36104w) {
            boolean z12 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z12;
            ((org.telegram.ui.Cells.t8) view).setChecked(z12);
            SharedConfig.saveConfig();
            proxyListActivity.b0(true);
        } else if (i9 == proxyListActivity.callsRow) {
            boolean z13 = !proxyListActivity.f36099e;
            proxyListActivity.f36099e = z13;
            ((org.telegram.ui.Cells.t8) view).setChecked(z13);
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            edit3.putBoolean("proxy_enabled_calls", proxyListActivity.f36099e);
            edit3.commit();
        } else if (i9 >= proxyListActivity.f36102r && i9 < proxyListActivity.f36103s) {
            if (!proxyListActivity.D.isEmpty()) {
                proxyListActivity.f36096a.G(i9);
                return;
            }
            SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) arrayList.get(i9 - proxyListActivity.f36102r);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit4 = MessagesController.getGlobalMainSettings().edit();
            edit4.putString("proxy_ip", proxyInfo2.address);
            edit4.putString("proxy_pass", proxyInfo2.password);
            edit4.putString("proxy_user", proxyInfo2.username);
            edit4.putInt("proxy_port", proxyInfo2.port);
            edit4.putString("proxy_secret", proxyInfo2.secret);
            edit4.putBoolean("proxy_enabled", proxyListActivity.d);
            if (!proxyInfo2.secret.isEmpty()) {
                proxyListActivity.f36099e = false;
                edit4.putBoolean("proxy_enabled_calls", false);
            }
            edit4.commit();
            SharedConfig.currentProxy = proxyInfo2;
            for (int i12 = proxyListActivity.f36102r; i12 < proxyListActivity.f36103s; i12++) {
                org.telegram.ui.Components.ik0 ik0Var3 = (org.telegram.ui.Components.ik0) proxyListActivity.f36097b.K(i12);
                if (ik0Var3 != null) {
                    c11 c11Var = (c11) ik0Var3.f5501a;
                    if (c11Var.d == proxyInfo2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c11Var.setChecked(z10);
                    c11Var.b();
                }
            }
            proxyListActivity.b0(false);
            org.telegram.ui.Components.ik0 ik0Var4 = (org.telegram.ui.Components.ik0) proxyListActivity.f36097b.K(proxyListActivity.useProxyRow);
            if (ik0Var4 != null) {
                ((org.telegram.ui.Cells.t8) ik0Var4.f5501a).setChecked(true);
            }
            boolean z14 = proxyListActivity.d;
            SharedConfig.ProxyInfo proxyInfo3 = SharedConfig.currentProxy;
            ConnectionsManager.setProxySettings(z14, proxyInfo3.address, proxyInfo3.port, proxyInfo3.username, proxyInfo3.password, proxyInfo3.secret);
        } else if (i9 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new k11());
        } else if (i9 == proxyListActivity.B) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y01(proxyListActivity));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            proxyListActivity.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
            }
        }
    }

    public static void U(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.E;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
        }
        proxyListActivity.f36099e = false;
        proxyListActivity.d = false;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i10 = NotificationCenter.proxySettingsChanged;
        globalInstance.removeObserver(proxyListActivity, i10);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i10, new Object[0]);
        NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i10);
        proxyListActivity.b0(true);
        b11 b11Var = proxyListActivity.f36096a;
        if (b11Var != null) {
            b11Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f36096a.n(proxyListActivity.callsRow, 0);
            proxyListActivity.f36096a.F();
        }
    }

    public final void b0(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.b0(boolean):void");
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 18));
        this.f36096a = new b11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f36097b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f36097b);
        ((f2.n) this.f36097b.getItemAnimator()).C = false;
        ((f2.n) this.f36097b.getItemAnimator()).f5449o = org.telegram.ui.Components.gr.f28844f;
        this.f36097b.setVerticalScrollBarEnabled(false);
        this.f36097b.setLayoutManager(new f2.m0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f36097b, g7.e6.e(-1, -1, 51));
        this.f36097b.setAdapter(this.f36096a);
        this.f36097b.setOnItemClickListener(new i(this, 28));
        this.f36097b.setOnItemLongClickListener(new y01(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.C = numberTextView;
        numberTextView.setTextSize(18);
        this.C.setTypeface(AndroidUtilities.bold());
        this.C.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23371y8, false));
        j10.addView(this.C, g7.e6.m(1.0f, 0, -1, 72, 0, 0));
        this.C.setOnTouchListener(new jh.d(2));
        j10.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j10.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new a11(this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.m4.class, c11.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 0, new Class[]{c11.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 262156, new Class[]{c11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23267s6));
        int i10 = org.telegram.ui.ActionBar.f6.f23386z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 262156, new Class[]{c11.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 262156, new Class[]{c11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23334w6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 262156, new Class[]{c11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23212p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 8, new Class[]{c11.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f36097b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.D.isEmpty()) {
            if (z10) {
                this.f36096a.F();
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
        this.f36098c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
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
        this.f36099e = globalMainSettings.getBoolean("proxy_enabled_calls", false);
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
        b11 b11Var = this.f36096a;
        if (b11Var != null) {
            b11Var.l();
        }
    }
}
