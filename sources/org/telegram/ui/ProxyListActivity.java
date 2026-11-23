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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class ProxyListActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public l4 f43738a;
    public org.telegram.ui.Components.ek0 f43739b;
    public int f43740c;
    public boolean d;
    public int f43741e;
    public int f43742f;
    public int h;
    public int f43743n;
    private int proxyAddRow;
    public int f43744r;
    public int f43745s;
    private int useProxyRow;
    public int f43746w;
    public int f43747x;
    public int f43748y;

    public ProxyListActivity() {
        super(null);
        this.F = new ArrayList();
        this.G = new ArrayList();
    }

    public static void Z(ProxyListActivity proxyListActivity, View view, int i7) {
        boolean z10;
        ArrayList arrayList = proxyListActivity.G;
        if (i7 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.cz.B1 == null) {
                if (!arrayList.isEmpty()) {
                    org.telegram.messenger.cz.B1 = (org.telegram.messenger.bz) arrayList.get(0);
                    if (!proxyListActivity.d) {
                        SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                        org.telegram.messenger.cz.B1.f23197a.i(edit);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new yx0());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.h0(true);
            org.telegram.messenger.np.g1();
            ((org.telegram.ui.Cells.s8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.np.g1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.cz.B1.f23197a);
            org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
            int i10 = org.telegram.messenger.ls.D4;
            e10.n(proxyListActivity, i10);
            org.telegram.messenger.ls.e().k(i10, new Object[0]);
            org.telegram.messenger.ls.e().c(proxyListActivity, i10);
            for (int i11 = proxyListActivity.f43743n; i11 < proxyListActivity.f43744r; i11++) {
                org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) proxyListActivity.f43739b.K(i11);
                if (mj0Var != null) {
                    ((rx0) mj0Var.f59165a).b();
                }
            }
        } else if (i7 == proxyListActivity.f43746w) {
            boolean z11 = !org.telegram.messenger.cz.f23392a1;
            org.telegram.messenger.cz.f23392a1 = z11;
            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
            org.telegram.messenger.cz.y();
            proxyListActivity.h0(true);
        } else if (i7 >= proxyListActivity.f43743n && i7 < proxyListActivity.f43744r) {
            if (!proxyListActivity.F.isEmpty()) {
                proxyListActivity.f43738a.M(i7);
                return;
            }
            org.telegram.messenger.bz bzVar = (org.telegram.messenger.bz) arrayList.get(i7 - proxyListActivity.f43743n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = org.telegram.messenger.np.g1().edit();
            bzVar.f23197a.i(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            org.telegram.messenger.cz.B1 = bzVar;
            for (int i12 = proxyListActivity.f43743n; i12 < proxyListActivity.f43744r; i12++) {
                org.telegram.ui.Components.mj0 mj0Var2 = (org.telegram.ui.Components.mj0) proxyListActivity.f43739b.K(i12);
                if (mj0Var2 != null) {
                    rx0 rx0Var = (rx0) mj0Var2.f59165a;
                    if (rx0Var.d == bzVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rx0Var.setChecked(z10);
                    rx0Var.b();
                }
            }
            proxyListActivity.h0(false);
            org.telegram.ui.Components.mj0 mj0Var3 = (org.telegram.ui.Components.mj0) proxyListActivity.f43739b.K(proxyListActivity.useProxyRow);
            if (mj0Var3 != null) {
                ((org.telegram.ui.Cells.s8) mj0Var3.f59165a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.cz.B1.f23197a);
        } else if (i7 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new yx0());
        } else if (i7 == proxyListActivity.E) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            String N0 = org.telegram.messenger.hd.N0(2131751567, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.U = N0;
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            t1Var.S = org.telegram.messenger.hd.N0(2131751497, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new ox0(proxyListActivity));
            proxyListActivity.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
            }
        }
    }

    public static void a0(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.G;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.messenger.cz.i((org.telegram.messenger.bz) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
        int i10 = org.telegram.messenger.ls.D4;
        e10.n(proxyListActivity, i10);
        org.telegram.messenger.ls.e().k(i10, new Object[0]);
        org.telegram.messenger.ls.e().c(proxyListActivity, i10);
        proxyListActivity.h0(true);
        l4 l4Var = proxyListActivity.f43738a;
        if (l4Var != null) {
            l4Var.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f43738a.F();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131746405, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 6));
        this.f43738a = new l4(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43739b = ek0Var;
        ek0Var.r1();
        ((v4.k) this.f43739b.getItemAnimator()).C = false;
        ((v4.k) this.f43739b.getItemAnimator()).f59212o = org.telegram.ui.Components.nr.f37961f;
        this.f43739b.setSectionsDrawBackground(true);
        this.f43739b.setVerticalScrollBarEnabled(false);
        this.f43739b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.f43739b, c8.ma.e(-1, -1, 51));
        this.f43739b.setAdapter(this.f43738a);
        this.f43739b.setOnItemClickListener(new h(this, 29));
        this.f43739b.setOnItemLongClickListener(new ox0(this));
        org.telegram.ui.ActionBar.f5 q10 = this.simpleActionBar.q();
        q10.c(1, 2131232365, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.hd.N0(2131744603, null));
        q10.c(0, 2131232110, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.hd.N0(2131751586, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new mi0(this, context, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43739b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43739b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29659s6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43739b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29792z6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43739b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29735w6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43739b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29602p7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43739b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43739b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        return arrayList;
    }

    public final void h0(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.h0(boolean):void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!this.F.isEmpty()) {
            if (z10) {
                this.f43738a.F();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.a6.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.cz.u();
        this.f43740c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.F4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.D4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.E4);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.T1);
        boolean z10 = false;
        if (org.telegram.messenger.np.g1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.cz.f23461z1.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        h0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.F4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.D4);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.E4);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.T1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f43738a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
