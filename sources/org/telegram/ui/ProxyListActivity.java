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
public class ProxyListActivity extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public l4 f43693a;
    public org.telegram.ui.Components.ck0 f43694b;
    public int f43695c;
    public boolean d;
    public int f43696e;
    public int f43697f;
    public int h;
    public int f43698n;
    private int proxyAddRow;
    public int f43699r;
    public int f43700s;
    private int useProxyRow;
    public int f43701w;
    public int f43702x;
    public int f43703y;

    public ProxyListActivity() {
        super(null);
        this.F = new ArrayList();
        this.G = new ArrayList();
    }

    public static void Z(ProxyListActivity proxyListActivity, View view, int i7) {
        boolean z10;
        ArrayList arrayList = proxyListActivity.G;
        if (i7 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.bz.B1 == null) {
                if (!arrayList.isEmpty()) {
                    org.telegram.messenger.bz.B1 = (org.telegram.messenger.az) arrayList.get(0);
                    if (!proxyListActivity.d) {
                        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                        org.telegram.messenger.bz.B1.f22988a.i(edit);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new yx0());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.h0(true);
            org.telegram.messenger.mp.g1();
            ((org.telegram.ui.Cells.r8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.mp.g1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.bz.B1.f22988a);
            org.telegram.messenger.ks e10 = org.telegram.messenger.ks.e();
            int i10 = org.telegram.messenger.ks.C4;
            e10.n(proxyListActivity, i10);
            org.telegram.messenger.ks.e().k(i10, new Object[0]);
            org.telegram.messenger.ks.e().c(proxyListActivity, i10);
            for (int i11 = proxyListActivity.f43698n; i11 < proxyListActivity.f43699r; i11++) {
                org.telegram.ui.Components.kj0 kj0Var = (org.telegram.ui.Components.kj0) proxyListActivity.f43694b.K(i11);
                if (kj0Var != null) {
                    ((rx0) kj0Var.f59122a).b();
                }
            }
        } else if (i7 == proxyListActivity.f43701w) {
            boolean z11 = !org.telegram.messenger.bz.f23150a1;
            org.telegram.messenger.bz.f23150a1 = z11;
            ((org.telegram.ui.Cells.r8) view).setChecked(z11);
            org.telegram.messenger.bz.y();
            proxyListActivity.h0(true);
        } else if (i7 >= proxyListActivity.f43698n && i7 < proxyListActivity.f43699r) {
            if (!proxyListActivity.F.isEmpty()) {
                proxyListActivity.f43693a.M(i7);
                return;
            }
            org.telegram.messenger.az azVar = (org.telegram.messenger.az) arrayList.get(i7 - proxyListActivity.f43698n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = org.telegram.messenger.mp.g1().edit();
            azVar.f22988a.i(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            org.telegram.messenger.bz.B1 = azVar;
            for (int i12 = proxyListActivity.f43698n; i12 < proxyListActivity.f43699r; i12++) {
                org.telegram.ui.Components.kj0 kj0Var2 = (org.telegram.ui.Components.kj0) proxyListActivity.f43694b.K(i12);
                if (kj0Var2 != null) {
                    rx0 rx0Var = (rx0) kj0Var2.f59122a;
                    if (rx0Var.d == azVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rx0Var.setChecked(z10);
                    rx0Var.b();
                }
            }
            proxyListActivity.h0(false);
            org.telegram.ui.Components.kj0 kj0Var3 = (org.telegram.ui.Components.kj0) proxyListActivity.f43694b.K(proxyListActivity.useProxyRow);
            if (kj0Var3 != null) {
                ((org.telegram.ui.Cells.r8) kj0Var3.f59122a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.bz.B1.f22988a);
        } else if (i7 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new yx0());
        } else if (i7 == proxyListActivity.E) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            String M0 = org.telegram.messenger.gd.M0(2131751568, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.U = M0;
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            u1Var.S = org.telegram.messenger.gd.M0(2131751498, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ox0(proxyListActivity));
            proxyListActivity.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, null);
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
            org.telegram.messenger.bz.i((org.telegram.messenger.az) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.ks e10 = org.telegram.messenger.ks.e();
        int i10 = org.telegram.messenger.ks.C4;
        e10.n(proxyListActivity, i10);
        org.telegram.messenger.ks.e().k(i10, new Object[0]);
        org.telegram.messenger.ks.e().c(proxyListActivity, i10);
        proxyListActivity.h0(true);
        l4 l4Var = proxyListActivity.f43693a;
        if (l4Var != null) {
            l4Var.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f43693a.F();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29360b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29807z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29397d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29488i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29694t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29733v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29676s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29396d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131746406, null));
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 6));
        this.f43693a = new l4(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f43694b = ck0Var;
        ck0Var.r1();
        ((v4.k) this.f43694b.getItemAnimator()).C = false;
        ((v4.k) this.f43694b.getItemAnimator()).f59169o = org.telegram.ui.Components.lr.f37208f;
        this.f43694b.setSectionsDrawBackground(true);
        this.f43694b.setVerticalScrollBarEnabled(false);
        this.f43694b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.f43694b, c8.ma.e(-1, -1, 51));
        this.f43694b.setAdapter(this.f43693a);
        this.f43694b.setOnItemClickListener(new h(this, 29));
        this.f43694b.setOnItemLongClickListener(new ox0(this));
        org.telegram.ui.ActionBar.g5 q10 = this.simpleActionBar.q();
        q10.c(1, 2131232365, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.gd.M0(2131744611, null));
        q10.c(0, 2131232110, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.gd.M0(2131751587, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new mi0(this, context, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f43694b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43694b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29674s6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43694b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29807z6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43694b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29750w6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43694b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29617p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43694b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43694b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
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
                this.f43693a.F();
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
        org.telegram.messenger.bz.u();
        this.f43695c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.E4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.C4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.D4);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T1);
        boolean z10 = false;
        if (org.telegram.messenger.mp.g1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.bz.f23219z1.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        h0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.E4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.C4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.D4);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f43693a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
