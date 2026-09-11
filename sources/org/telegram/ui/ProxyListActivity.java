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
public class ProxyListActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public NumberTextView G;
    public final ArrayList H;
    public final ArrayList I;
    public boolean J;
    public h21 f34037a;
    public org.telegram.ui.Components.ll0 f34038b;
    public int f34039c;
    private int callsRow;
    public boolean d;
    public boolean f34040e;
    public int f34041f;
    public int h;
    public int f34042n;
    private int proxyAddRow;
    public int f34043r;
    public int f34044s;
    private int useProxyRow;
    public int v;
    public int f34045w;
    public int f34046x;
    public int f34047y;

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
                    proxyListActivity.presentFragment(new q21());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.c0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.w8) view).setChecked(proxyListActivity.d);
            if (!proxyListActivity.d) {
                org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) proxyListActivity.f34038b.K(proxyListActivity.callsRow);
                if (vk0Var != null) {
                    ((org.telegram.ui.Cells.w8) vk0Var.f45738a).setChecked(false);
                }
                proxyListActivity.f34040e = false;
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
            for (int i12 = proxyListActivity.f34043r; i12 < proxyListActivity.f34044s; i12++) {
                org.telegram.ui.Components.vk0 vk0Var2 = (org.telegram.ui.Components.vk0) proxyListActivity.f34038b.K(i12);
                if (vk0Var2 != null) {
                    ((i21) vk0Var2.f45738a).b();
                }
            }
        } else if (i10 == proxyListActivity.f34045w) {
            boolean z11 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z11;
            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
            SharedConfig.saveConfig();
            proxyListActivity.c0(true);
        } else if (i10 == proxyListActivity.callsRow) {
            boolean z12 = !proxyListActivity.f34040e;
            proxyListActivity.f34040e = z12;
            ((org.telegram.ui.Cells.w8) view).setChecked(z12);
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            edit3.putBoolean("proxy_enabled_calls", proxyListActivity.f34040e);
            edit3.commit();
        } else if (i10 >= proxyListActivity.f34043r && i10 < proxyListActivity.f34044s) {
            if (!proxyListActivity.H.isEmpty()) {
                proxyListActivity.f34037a.G(i10);
                return;
            }
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.f34043r);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit4 = MessagesController.getGlobalMainSettings().edit();
            proxyInfo.settings.f(edit4);
            edit4.putBoolean("proxy_enabled", proxyListActivity.d);
            if (!proxyInfo.settings.f9482f.isEmpty()) {
                proxyListActivity.f34040e = false;
                edit4.putBoolean("proxy_enabled_calls", false);
            }
            edit4.commit();
            SharedConfig.currentProxy = proxyInfo;
            for (int i13 = proxyListActivity.f34043r; i13 < proxyListActivity.f34044s; i13++) {
                org.telegram.ui.Components.vk0 vk0Var3 = (org.telegram.ui.Components.vk0) proxyListActivity.f34038b.K(i13);
                if (vk0Var3 != null) {
                    i21 i21Var = (i21) vk0Var3.f45738a;
                    if (i21Var.d == proxyInfo) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i21Var.setChecked(z10);
                    i21Var.b();
                }
            }
            proxyListActivity.c0(false);
            org.telegram.ui.Components.vk0 vk0Var4 = (org.telegram.ui.Components.vk0) proxyListActivity.f34038b.K(proxyListActivity.useProxyRow);
            if (vk0Var4 != null) {
                ((org.telegram.ui.Cells.w8) vk0Var4.f45738a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
        } else if (i10 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new q21());
        } else if (i10 == proxyListActivity.F) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new e21(proxyListActivity));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
            proxyListActivity.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
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
        proxyListActivity.f34040e = false;
        proxyListActivity.d = false;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.proxySettingsChanged;
        globalInstance.removeObserver(proxyListActivity, i11);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
        proxyListActivity.c0(true);
        h21 h21Var = proxyListActivity.f34037a;
        if (h21Var != null) {
            h21Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f34037a.n(proxyListActivity.callsRow, 0);
            proxyListActivity.f34037a.F();
        }
    }

    public final void c0(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.c0(boolean):void");
    }

    @Override
    public final View createView(Context context) {
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 24));
        this.f34037a = new h21(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f34038b = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f34038b);
        ((s4.j) this.f34038b.getItemAnimator()).C = false;
        ((s4.j) this.f34038b.getItemAnimator()).f45803o = org.telegram.ui.Components.pr.f29466f;
        this.f34038b.setVerticalScrollBarEnabled(false);
        this.f34038b.setLayoutManager(new s4.c0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f34038b, w7.x5.e(-1, -1, 51));
        this.f34038b.setAdapter(this.f34037a);
        this.f34038b.setOnItemClickListener(new i(this, 29));
        this.f34038b.setOnItemLongClickListener(new e21(this));
        org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j3.getContext());
        this.G = numberTextView;
        numberTextView.setTextSize(18);
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21044y8, false));
        j3.addView(this.G, w7.x5.m(1.0f, 0, -1, 72, 0, 0));
        this.G.setOnTouchListener(new ci.d(2));
        j3.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j3.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new g21(this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.l4.class, i21.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20663d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20937s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 0, new Class[]{i21.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 262156, new Class[]{i21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20935s6));
        int i11 = org.telegram.ui.ActionBar.j6.f21061z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 262156, new Class[]{i21.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 262156, new Class[]{i21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21008w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 262156, new Class[]{i21.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20880p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 8, new Class[]{i21.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20627b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34038b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.H.isEmpty()) {
            if (z10) {
                this.f34037a.F();
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
        this.f34039c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
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
        this.f34040e = globalMainSettings.getBoolean("proxy_enabled_calls", false);
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
        h21 h21Var = this.f34037a;
        if (h21Var != null) {
            h21Var.l();
        }
    }
}
