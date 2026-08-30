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
    public n11 f32206a;
    public org.telegram.ui.Components.sl0 f32207b;
    public int f32208c;
    private int callsRow;
    public boolean d;
    public boolean e;
    public int f32209f;
    public int h;
    public int f32210n;
    private int proxyAddRow;
    public int f32211r;
    public int f32212s;
    private int useProxyRow;
    public int v;
    public int f32213w;
    public int f32214x;
    public int f32215y;

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
                        MessagesController.getGlobalMainSettings();
                        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                        edit.putString("proxy_ip", SharedConfig.currentProxy.address);
                        edit.putString("proxy_pass", SharedConfig.currentProxy.password);
                        edit.putString("proxy_user", SharedConfig.currentProxy.username);
                        edit.putInt("proxy_port", SharedConfig.currentProxy.port);
                        edit.putString("proxy_secret", SharedConfig.currentProxy.secret);
                        edit.putInt("proxy_type", SharedConfig.currentProxy.type);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new w11());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.c0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.s8) view).setChecked(proxyListActivity.d);
            if (!proxyListActivity.d) {
                org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) proxyListActivity.f32207b.K(proxyListActivity.callsRow);
                if (el0Var != null) {
                    ((org.telegram.ui.Cells.s8) el0Var.f5785a).setChecked(false);
                }
                proxyListActivity.e = false;
            }
            SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            boolean z10 = proxyListActivity.d;
            SharedConfig.ProxyInfo proxyInfo = SharedConfig.currentProxy;
            ConnectionsManager.setProxySettings(z10, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret, proxyInfo.type);
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i11 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(proxyListActivity, i11);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
            for (int i12 = proxyListActivity.f32211r; i12 < proxyListActivity.f32212s; i12++) {
                org.telegram.ui.Components.el0 el0Var2 = (org.telegram.ui.Components.el0) proxyListActivity.f32207b.K(i12);
                if (el0Var2 != null) {
                    ((o11) el0Var2.f5785a).b();
                }
            }
        } else if (i10 == proxyListActivity.f32213w) {
            boolean z11 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z11;
            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
            SharedConfig.saveConfig();
            proxyListActivity.c0(true);
        } else if (i10 == proxyListActivity.callsRow) {
            boolean z12 = !proxyListActivity.e;
            proxyListActivity.e = z12;
            ((org.telegram.ui.Cells.s8) view).setChecked(z12);
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            edit3.putBoolean("proxy_enabled_calls", proxyListActivity.e);
            edit3.commit();
        } else if (i10 >= proxyListActivity.f32211r && i10 < proxyListActivity.f32212s) {
            if (!proxyListActivity.E.isEmpty()) {
                proxyListActivity.f32206a.G(i10);
                return;
            }
            SharedConfig.ProxyInfo proxyInfo2 = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.f32211r);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit4 = MessagesController.getGlobalMainSettings().edit();
            edit4.putString("proxy_ip", proxyInfo2.address);
            edit4.putString("proxy_pass", proxyInfo2.password);
            edit4.putString("proxy_user", proxyInfo2.username);
            edit4.putInt("proxy_port", proxyInfo2.port);
            edit4.putString("proxy_secret", proxyInfo2.secret);
            edit4.putInt("proxy_type", proxyInfo2.type);
            edit4.putBoolean("proxy_enabled", proxyListActivity.d);
            if (!proxyInfo2.secret.isEmpty()) {
                proxyListActivity.e = false;
                edit4.putBoolean("proxy_enabled_calls", false);
            }
            edit4.commit();
            SharedConfig.currentProxy = proxyInfo2;
            for (int i13 = proxyListActivity.f32211r; i13 < proxyListActivity.f32212s; i13++) {
                org.telegram.ui.Components.el0 el0Var3 = (org.telegram.ui.Components.el0) proxyListActivity.f32207b.K(i13);
                if (el0Var3 != null) {
                    o11 o11Var = (o11) el0Var3.f5785a;
                    if (o11Var.d == proxyInfo2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    o11Var.setChecked(z4);
                    o11Var.b();
                }
            }
            proxyListActivity.c0(false);
            org.telegram.ui.Components.el0 el0Var4 = (org.telegram.ui.Components.el0) proxyListActivity.f32207b.K(proxyListActivity.useProxyRow);
            if (el0Var4 != null) {
                ((org.telegram.ui.Cells.s8) el0Var4.f5785a).setChecked(true);
            }
            boolean z13 = proxyListActivity.d;
            SharedConfig.ProxyInfo proxyInfo3 = SharedConfig.currentProxy;
            ConnectionsManager.setProxySettings(z13, proxyInfo3.address, proxyInfo3.port, proxyInfo3.username, proxyInfo3.password, proxyInfo3.secret, proxyInfo3.type);
        } else if (i10 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new w11());
        } else if (i10 == proxyListActivity.C) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new k11(proxyListActivity));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            proxyListActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
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
        proxyListActivity.e = false;
        proxyListActivity.d = false;
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i11 = NotificationCenter.proxySettingsChanged;
        globalInstance.removeObserver(proxyListActivity, i11);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
        NotificationCenter.getGlobalInstance().addObserver(proxyListActivity, i11);
        proxyListActivity.c0(true);
        n11 n11Var = proxyListActivity.f32206a;
        if (n11Var != null) {
            n11Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f32206a.n(proxyListActivity.callsRow, 0);
            proxyListActivity.f32206a.F();
        }
    }

    public final void c0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.c0(boolean):void");
    }

    @Override
    public final View createView(Context context) {
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 10));
        this.f32206a = new n11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f32207b = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f32207b);
        ((f2.l) this.f32207b.getItemAnimator()).C = false;
        ((f2.l) this.f32207b.getItemAnimator()).f5773o = org.telegram.ui.Components.nr.f27346f;
        this.f32207b.setVerticalScrollBarEnabled(false);
        this.f32207b.setLayoutManager(new f2.i0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f32207b, k7.b6.e(-1, -1, 51));
        this.f32207b.setAdapter(this.f32206a);
        this.f32207b.setOnItemClickListener(new j(this, 28));
        this.f32207b.setOnItemLongClickListener(new k11(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.D = numberTextView;
        numberTextView.setTextSize(18);
        this.D.setTypeface(AndroidUtilities.bold());
        this.D.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20283y8, false));
        j10.addView(this.D, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
        this.D.setOnTouchListener(new oh.d(2));
        j10.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j10.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new m11(this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.m4.class, o11.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 0, new Class[]{o11.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 262156, new Class[]{o11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.s6));
        int i11 = org.telegram.ui.ActionBar.j6.f20298z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 262156, new Class[]{o11.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 262156, new Class[]{o11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20244w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 262156, new Class[]{o11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20122p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 8, new Class[]{o11.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19871b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32207b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (!this.E.isEmpty()) {
            if (z4) {
                this.f32206a.F();
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
        this.f32208c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
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
        n11 n11Var = this.f32206a;
        if (n11Var != null) {
            n11Var.l();
        }
    }
}
