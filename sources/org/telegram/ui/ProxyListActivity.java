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
    public int B;
    public int C;
    public NumberTextView D;
    public final ArrayList E;
    public final ArrayList F;
    public boolean G;
    public q11 f34739a;
    public org.telegram.ui.Components.tl0 f34740b;
    public int f34741c;
    private int callsRow;
    public boolean d;
    public boolean f34742e;
    public int f34743f;
    public int h;
    public int f34744n;
    private int proxyAddRow;
    public int f34745r;
    public int f34746s;
    private int useProxyRow;
    public int v;
    public int f34747w;
    public int f34748x;
    public int f34749y;

    public ProxyListActivity() {
        super(null);
        this.E = new ArrayList();
        this.F = new ArrayList();
    }

    public static void U(ProxyListActivity proxyListActivity, View view, int i10) {
        boolean z4;
        ArrayList arrayList = proxyListActivity.F;
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
                    proxyListActivity.presentFragment(new z11());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.c0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.s8) view).setChecked(proxyListActivity.d);
            if (!proxyListActivity.d) {
                org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) proxyListActivity.f34740b.K(proxyListActivity.callsRow);
                if (fl0Var != null) {
                    ((org.telegram.ui.Cells.s8) fl0Var.f5875a).setChecked(false);
                }
                proxyListActivity.f34742e = false;
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
            for (int i12 = proxyListActivity.f34745r; i12 < proxyListActivity.f34746s; i12++) {
                org.telegram.ui.Components.fl0 fl0Var2 = (org.telegram.ui.Components.fl0) proxyListActivity.f34740b.K(i12);
                if (fl0Var2 != null) {
                    ((r11) fl0Var2.f5875a).b();
                }
            }
        } else if (i10 == proxyListActivity.f34747w) {
            boolean z10 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z10;
            ((org.telegram.ui.Cells.s8) view).setChecked(z10);
            SharedConfig.saveConfig();
            proxyListActivity.c0(true);
        } else if (i10 == proxyListActivity.callsRow) {
            boolean z11 = !proxyListActivity.f34742e;
            proxyListActivity.f34742e = z11;
            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            edit3.putBoolean("proxy_enabled_calls", proxyListActivity.f34742e);
            edit3.commit();
        } else if (i10 >= proxyListActivity.f34745r && i10 < proxyListActivity.f34746s) {
            if (!proxyListActivity.E.isEmpty()) {
                proxyListActivity.f34739a.G(i10);
                return;
            }
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.f34745r);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit4 = MessagesController.getGlobalMainSettings().edit();
            proxyInfo.settings.f(edit4);
            edit4.putBoolean("proxy_enabled", proxyListActivity.d);
            if (!proxyInfo.settings.f47304f.isEmpty()) {
                proxyListActivity.f34742e = false;
                edit4.putBoolean("proxy_enabled_calls", false);
            }
            edit4.commit();
            SharedConfig.currentProxy = proxyInfo;
            for (int i13 = proxyListActivity.f34745r; i13 < proxyListActivity.f34746s; i13++) {
                org.telegram.ui.Components.fl0 fl0Var3 = (org.telegram.ui.Components.fl0) proxyListActivity.f34740b.K(i13);
                if (fl0Var3 != null) {
                    r11 r11Var = (r11) fl0Var3.f5875a;
                    if (r11Var.d == proxyInfo) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    r11Var.setChecked(z4);
                    r11Var.b();
                }
            }
            proxyListActivity.c0(false);
            org.telegram.ui.Components.fl0 fl0Var4 = (org.telegram.ui.Components.fl0) proxyListActivity.f34740b.K(proxyListActivity.useProxyRow);
            if (fl0Var4 != null) {
                ((org.telegram.ui.Cells.s8) fl0Var4.f5875a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
        } else if (i10 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new z11());
        } else if (i10 == proxyListActivity.C) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new n11(proxyListActivity));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
            proxyListActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
            }
        }
    }

    public static void V(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.F;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            SharedConfig.deleteProxy((SharedConfig.ProxyInfo) obj);
        }
        proxyListActivity.f34742e = false;
        proxyListActivity.d = false;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.proxySettingsChanged;
        globalInstance.removeObserver(proxyListActivity, i11);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
        proxyListActivity.c0(true);
        q11 q11Var = proxyListActivity.f34739a;
        if (q11Var != null) {
            q11Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f34739a.n(proxyListActivity.callsRow, 0);
            proxyListActivity.f34739a.F();
        }
    }

    public final void c0(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.c0(boolean):void");
    }

    @Override
    public final View createView(Context context) {
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 10));
        this.f34739a = new q11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(context, null);
        this.f34740b = tl0Var;
        tl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f34740b);
        ((f2.l) this.f34740b.getItemAnimator()).C = false;
        ((f2.l) this.f34740b.getItemAnimator()).f5852o = org.telegram.ui.Components.pr.f30183f;
        this.f34740b.setVerticalScrollBarEnabled(false);
        this.f34740b.setLayoutManager(new f2.j0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f34740b, k7.c6.e(-1, -1, 51));
        this.f34740b.setAdapter(this.f34739a);
        this.f34740b.setOnItemClickListener(new j(this, 28));
        this.f34740b.setOnItemLongClickListener(new n11(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.D = numberTextView;
        numberTextView.setTextSize(18);
        this.D.setTypeface(AndroidUtilities.bold());
        this.D.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22038y8, false));
        j10.addView(this.D, k7.c6.m(1.0f, 0, -1, 72, 0, 0));
        this.D.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        j10.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j10.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new p11(this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.m4.class, r11.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 0, new Class[]{r11.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 262156, new Class[]{r11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.s6));
        int i11 = org.telegram.ui.ActionBar.k6.f22053z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 262156, new Class[]{r11.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 262156, new Class[]{r11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21998w6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 262156, new Class[]{r11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21876p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 8, new Class[]{r11.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21624b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34740b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (!this.E.isEmpty()) {
            if (z4) {
                this.f34739a.F();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z4;
        super.onFragmentCreate();
        SharedConfig.loadProxyList();
        this.f34741c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didUpdateConnectionState);
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("proxy_enabled", false) && !SharedConfig.proxyList.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        this.f34742e = globalMainSettings.getBoolean("proxy_enabled_calls", false);
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
        q11 q11Var = this.f34739a;
        if (q11Var != null) {
            q11Var.l();
        }
    }
}
