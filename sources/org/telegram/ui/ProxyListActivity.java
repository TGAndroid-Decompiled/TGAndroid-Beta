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
    public m21 f32709a;
    public org.telegram.ui.Components.mm0 f32710b;
    public int f32711c;
    public boolean d;
    public int e;
    public int f32712f;
    public int h;
    public int f32713n;
    private int proxyAddRow;
    public int f32714r;
    public int f32715s;
    private int useProxyRow;
    public int v;
    public int f32716w;
    public int f32717x;
    public int f32718y;

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
                    proxyListActivity.presentFragment(new v21());
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
            for (int i12 = proxyListActivity.f32713n; i12 < proxyListActivity.f32714r; i12++) {
                org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) proxyListActivity.f32710b.K(i12);
                if (wl0Var != null) {
                    ((n21) wl0Var.f44838a).b();
                }
            }
        } else if (i10 == proxyListActivity.v) {
            boolean z11 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z11;
            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
            SharedConfig.saveConfig();
            proxyListActivity.b0(true);
        } else if (i10 >= proxyListActivity.f32713n && i10 < proxyListActivity.f32714r) {
            if (!proxyListActivity.F.isEmpty()) {
                proxyListActivity.f32709a.G(i10);
                return;
            }
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.f32713n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            proxyInfo.settings.h(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            SharedConfig.currentProxy = proxyInfo;
            for (int i13 = proxyListActivity.f32713n; i13 < proxyListActivity.f32714r; i13++) {
                org.telegram.ui.Components.wl0 wl0Var2 = (org.telegram.ui.Components.wl0) proxyListActivity.f32710b.K(i13);
                if (wl0Var2 != null) {
                    n21 n21Var = (n21) wl0Var2.f44838a;
                    if (n21Var.d == proxyInfo) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n21Var.setChecked(z10);
                    n21Var.b();
                }
            }
            proxyListActivity.b0(false);
            org.telegram.ui.Components.wl0 wl0Var3 = (org.telegram.ui.Components.wl0) proxyListActivity.f32710b.K(proxyListActivity.useProxyRow);
            if (wl0Var3 != null) {
                ((org.telegram.ui.Cells.w8) wl0Var3.f44838a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
        } else if (i10 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new v21());
        } else if (i10 == proxyListActivity.f32718y) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j21(proxyListActivity));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            proxyListActivity.showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
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
        m21 m21Var = proxyListActivity.f32709a;
        if (m21Var != null) {
            m21Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f32709a.F();
        }
    }

    public final void b0(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.b0(boolean):void");
    }

    @Override
    public final View createView(Context context) {
        i2.d.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 25));
        this.f32709a = new m21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f32710b = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f32710b);
        ((s4.k) this.f32710b.getItemAnimator()).C = false;
        ((s4.k) this.f32710b.getItemAnimator()).f44901o = org.telegram.ui.Components.es.f24771f;
        this.f32710b.setVerticalScrollBarEnabled(false);
        this.f32710b.setLayoutManager(new s4.b0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f32710b, w7.a6.e(-1, -1, 51));
        this.f32710b.setAdapter(this.f32709a);
        this.f32710b.setOnItemClickListener(new i21(this, 0));
        this.f32710b.setOnItemLongClickListener(new j21(this));
        org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.E = numberTextView;
        numberTextView.setTextSize(18);
        this.E.setTypeface(AndroidUtilities.bold());
        this.E.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20290y8, false));
        j10.addView(this.E, w7.a6.m(1.0f, 0, -1, 72, 0, 0));
        this.E.setOnTouchListener(new ci.d(2));
        j10.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j10.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new l21(this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.m4.class, n21.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 0, new Class[]{n21.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 262156, new Class[]{n21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20178s6));
        int i11 = org.telegram.ui.ActionBar.g6.f20305z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 262156, new Class[]{n21.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 262156, new Class[]{n21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20252w6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 262156, new Class[]{n21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20122p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 8, new Class[]{n21.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19863b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32710b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.F.isEmpty()) {
            if (z10) {
                this.f32709a.F();
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
        this.f32711c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
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
        m21 m21Var = this.f32709a;
        if (m21Var != null) {
            m21Var.l();
        }
    }
}
