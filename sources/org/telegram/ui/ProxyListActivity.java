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
    public u11 f32180a;
    public org.telegram.ui.Components.rl0 f32181b;
    public int f32182c;
    private int callsRow;
    public boolean d;
    public boolean e;
    public int f32183f;
    public int h;
    public int f32184n;
    private int proxyAddRow;
    public int f32185r;
    public int f32186s;
    private int useProxyRow;
    public int v;
    public int f32187w;
    public int f32188x;
    public int f32189y;

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
                    proxyListActivity.presentFragment(new d21());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.c0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.r8) view).setChecked(proxyListActivity.d);
            if (!proxyListActivity.d) {
                org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) proxyListActivity.f32181b.K(proxyListActivity.callsRow);
                if (dl0Var != null) {
                    ((org.telegram.ui.Cells.r8) dl0Var.f5774a).setChecked(false);
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
            for (int i12 = proxyListActivity.f32185r; i12 < proxyListActivity.f32186s; i12++) {
                org.telegram.ui.Components.dl0 dl0Var2 = (org.telegram.ui.Components.dl0) proxyListActivity.f32181b.K(i12);
                if (dl0Var2 != null) {
                    ((v11) dl0Var2.f5774a).b();
                }
            }
        } else if (i10 == proxyListActivity.f32187w) {
            boolean z10 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z10;
            ((org.telegram.ui.Cells.r8) view).setChecked(z10);
            SharedConfig.saveConfig();
            proxyListActivity.c0(true);
        } else if (i10 == proxyListActivity.callsRow) {
            boolean z11 = !proxyListActivity.e;
            proxyListActivity.e = z11;
            ((org.telegram.ui.Cells.r8) view).setChecked(z11);
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            edit3.putBoolean("proxy_enabled_calls", proxyListActivity.e);
            edit3.commit();
        } else if (i10 >= proxyListActivity.f32185r && i10 < proxyListActivity.f32186s) {
            if (!proxyListActivity.E.isEmpty()) {
                proxyListActivity.f32180a.G(i10);
                return;
            }
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.f32185r);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit4 = MessagesController.getGlobalMainSettings().edit();
            proxyInfo.settings.f(edit4);
            edit4.putBoolean("proxy_enabled", proxyListActivity.d);
            if (!proxyInfo.settings.f43479f.isEmpty()) {
                proxyListActivity.e = false;
                edit4.putBoolean("proxy_enabled_calls", false);
            }
            edit4.commit();
            SharedConfig.currentProxy = proxyInfo;
            for (int i13 = proxyListActivity.f32185r; i13 < proxyListActivity.f32186s; i13++) {
                org.telegram.ui.Components.dl0 dl0Var3 = (org.telegram.ui.Components.dl0) proxyListActivity.f32181b.K(i13);
                if (dl0Var3 != null) {
                    v11 v11Var = (v11) dl0Var3.f5774a;
                    if (v11Var.d == proxyInfo) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    v11Var.setChecked(z4);
                    v11Var.b();
                }
            }
            proxyListActivity.c0(false);
            org.telegram.ui.Components.dl0 dl0Var4 = (org.telegram.ui.Components.dl0) proxyListActivity.f32181b.K(proxyListActivity.useProxyRow);
            if (dl0Var4 != null) {
                ((org.telegram.ui.Cells.r8) dl0Var4.f5774a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
        } else if (i10 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new d21());
        } else if (i10 == proxyListActivity.C) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new r11(proxyListActivity));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            proxyListActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
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
        u11 u11Var = proxyListActivity.f32180a;
        if (u11Var != null) {
            u11Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f32180a.n(proxyListActivity.callsRow, 0);
            proxyListActivity.f32180a.F();
        }
    }

    public final void c0(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.c0(boolean):void");
    }

    @Override
    public final View createView(Context context) {
        ai.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 10));
        this.f32180a = new u11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.f32181b = rl0Var;
        rl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f32181b);
        ((f2.l) this.f32181b.getItemAnimator()).C = false;
        ((f2.l) this.f32181b.getItemAnimator()).f5762o = org.telegram.ui.Components.mr.f27122f;
        this.f32181b.setVerticalScrollBarEnabled(false);
        this.f32181b.setLayoutManager(new f2.i0(1, false));
        ((FrameLayout) this.fragmentView).addView(this.f32181b, k7.b6.e(-1, -1, 51));
        this.f32181b.setAdapter(this.f32180a);
        this.f32181b.setOnItemClickListener(new j(this, 29));
        this.f32181b.setOnItemLongClickListener(new r11(this));
        org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
        NumberTextView numberTextView = new NumberTextView(j10.getContext());
        this.D = numberTextView;
        numberTextView.setTextSize(18);
        this.D.setTypeface(AndroidUtilities.bold());
        this.D.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20258y8, false));
        j10.addView(this.D, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
        this.D.setOnTouchListener(new oh.d(2));
        j10.g(1, R.drawable.msg_share, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.StickersShare));
        j10.g(0, R.drawable.msg_delete, AndroidUtilities.dp(54.0f)).setContentDescription(LocaleController.getString(R.string.Delete));
        this.actionBar.setActionBarMenuOnItemClick(new t11(this, context));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 16, new Class[]{org.telegram.ui.Cells.z9.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.l4.class, v11.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 0, new Class[]{v11.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 262156, new Class[]{v11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.s6));
        int i11 = org.telegram.ui.ActionBar.j6.f20273z6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 262156, new Class[]{v11.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 262156, new Class[]{v11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20219w6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 262156, new Class[]{v11.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20097p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 8, new Class[]{v11.class}, new String[]{"checkImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19846b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32181b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (!this.E.isEmpty()) {
            if (z4) {
                this.f32180a.F();
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
        this.f32182c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
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
        u11 u11Var = this.f32180a;
        if (u11Var != null) {
            u11Var.l();
        }
    }
}
