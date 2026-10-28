package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
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
public class ProxyListActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList E;
    public final ArrayList F;
    public boolean G;
    public t11 f36157a;
    public org.telegram.ui.Components.nm0 f36158b;
    public int f36159c;
    public boolean d;
    public int e;
    public int f36160f;
    public int h;
    public int f36161n;
    private int proxyAddRow;
    public int f36162r;
    public int f36163s;
    private int useProxyRow;
    public int v;
    public int f36164w;
    public int f36165x;
    public int f36166y;

    public ProxyListActivity() {
        super(null);
        this.E = new ArrayList();
        this.F = new ArrayList();
    }

    public static void V(ProxyListActivity proxyListActivity, View view, int i10) {
        boolean z10;
        ArrayList arrayList = proxyListActivity.F;
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
                    proxyListActivity.presentFragment(new d21());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.d0(true);
            MessagesController.getGlobalMainSettings();
            ((org.telegram.ui.Cells.a9) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = MessagesController.getGlobalMainSettings().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i11 = NotificationCenter.proxySettingsChanged;
            globalInstance.removeObserver(proxyListActivity, i11);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i11, new Object[0]);
            NotificationCenter.getGlobalInstance().addWeakObserver(proxyListActivity, i11);
            for (int i12 = proxyListActivity.f36161n; i12 < proxyListActivity.f36162r; i12++) {
                org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) proxyListActivity.f36158b.K(i12);
                if (wl0Var != null) {
                    ((u11) wl0Var.f47773a).b();
                }
            }
        } else if (i10 == proxyListActivity.v) {
            boolean z11 = !SharedConfig.proxyRotationEnabled;
            SharedConfig.proxyRotationEnabled = z11;
            ((org.telegram.ui.Cells.a9) view).setChecked(z11);
            SharedConfig.saveConfig();
            proxyListActivity.d0(true);
        } else if (i10 >= proxyListActivity.f36161n && i10 < proxyListActivity.f36162r) {
            if (!proxyListActivity.E.isEmpty()) {
                proxyListActivity.f36157a.G(i10);
                return;
            }
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) arrayList.get(i10 - proxyListActivity.f36161n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = MessagesController.getGlobalMainSettings().edit();
            proxyInfo.settings.h(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            SharedConfig.currentProxy = proxyInfo;
            for (int i13 = proxyListActivity.f36161n; i13 < proxyListActivity.f36162r; i13++) {
                org.telegram.ui.Components.wl0 wl0Var2 = (org.telegram.ui.Components.wl0) proxyListActivity.f36158b.K(i13);
                if (wl0Var2 != null) {
                    u11 u11Var = (u11) wl0Var2.f47773a;
                    if (u11Var.d == proxyInfo) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u11Var.setChecked(z10);
                    u11Var.b();
                }
            }
            proxyListActivity.d0(false);
            org.telegram.ui.Components.wl0 wl0Var3 = (org.telegram.ui.Components.wl0) proxyListActivity.f36158b.K(proxyListActivity.useProxyRow);
            if (wl0Var3 != null) {
                ((org.telegram.ui.Cells.a9) wl0Var3.f47773a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, SharedConfig.currentProxy.settings);
        } else if (i10 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new d21());
        } else if (i10 == proxyListActivity.f36166y) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.DeleteAllProxiesConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new p11(proxyListActivity));
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            proxyListActivity.showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
            }
        }
    }

    public static void W(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.F;
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
        NotificationCenter.getGlobalInstance().addWeakObserver(proxyListActivity, i11);
        proxyListActivity.d0(true);
        t11 t11Var = proxyListActivity.f36157a;
        if (t11Var != null) {
            t11Var.n(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f36157a.F();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.ProxySettings));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new r11(this, 0));
        this.f36157a = new t11(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f36158b = nm0Var;
        nm0Var.u1();
        ((s4.l) this.f36158b.getItemAnimator()).C = false;
        ((s4.l) this.f36158b.getItemAnimator()).f47822o = org.telegram.ui.Components.ds.f27530f;
        this.f36158b.setSectionsDrawBackground(true);
        this.f36158b.setVerticalScrollBarEnabled(false);
        this.f36158b.setLayoutManager(new s4.c0(1, false));
        frameLayout.addView(this.f36158b, org.telegram.ui.Components.kb1.i(-1, -1, 51));
        this.f36158b.setAdapter(this.f36157a);
        this.f36158b.setOnItemClickListener(new o11(this, 0));
        this.f36158b.setOnItemLongClickListener(new p11(this));
        org.telegram.ui.ActionBar.x5 h = this.simpleActionBar.h();
        h.b(1, R.drawable.msg_share, null, null, AndroidUtilities.dp(54.0f), null).setContentDescription(LocaleController.getString(R.string.StickersShare));
        h.b(0, R.drawable.msg_delete, null, null, AndroidUtilities.dp(54.0f), null).setContentDescription(LocaleController.getString(R.string.Delete));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s11(this, context));
        return this.fragmentView;
    }

    public final void d0(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.d0(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f36158b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36158b, 262156, new Class[]{u11.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23635s6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36158b, 262156, new Class[]{u11.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23768z6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36158b, 262156, new Class[]{u11.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23712w6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36158b, 262156, new Class[]{u11.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23582p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36158b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f36158b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.E.isEmpty()) {
            if (z10) {
                this.f36157a.F();
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
        this.f36159c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.proxyChangedByRotation);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.proxySettingsChanged);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.proxyCheckDone);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.didUpdateConnectionState);
        boolean z10 = false;
        if (MessagesController.getGlobalMainSettings().getBoolean("proxy_enabled", false) && !SharedConfig.proxyList.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        d0(true);
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
        t11 t11Var = this.f36157a;
        if (t11Var != null) {
            t11Var.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
