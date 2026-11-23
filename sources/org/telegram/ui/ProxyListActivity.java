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
public class ProxyListActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public l4 f43819a;
    public org.telegram.ui.Components.ek0 f43820b;
    public int f43821c;
    public boolean d;
    public int f43822e;
    public int f43823f;
    public int h;
    public int f43824n;
    private int proxyAddRow;
    public int f43825r;
    public int f43826s;
    private int useProxyRow;
    public int f43827w;
    public int f43828x;
    public int f43829y;

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
                        org.telegram.messenger.bz.B1.f23096a.i(edit);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new wx0());
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
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.bz.B1.f23096a);
            org.telegram.messenger.ks e10 = org.telegram.messenger.ks.e();
            int i10 = org.telegram.messenger.ks.D4;
            e10.n(proxyListActivity, i10);
            org.telegram.messenger.ks.e().k(i10, new Object[0]);
            org.telegram.messenger.ks.e().c(proxyListActivity, i10);
            for (int i11 = proxyListActivity.f43824n; i11 < proxyListActivity.f43825r; i11++) {
                org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) proxyListActivity.f43820b.K(i11);
                if (mj0Var != null) {
                    ((px0) mj0Var.f59245a).b();
                }
            }
        } else if (i7 == proxyListActivity.f43827w) {
            boolean z11 = !org.telegram.messenger.bz.f23272a1;
            org.telegram.messenger.bz.f23272a1 = z11;
            ((org.telegram.ui.Cells.r8) view).setChecked(z11);
            org.telegram.messenger.bz.y();
            proxyListActivity.h0(true);
        } else if (i7 >= proxyListActivity.f43824n && i7 < proxyListActivity.f43825r) {
            if (!proxyListActivity.F.isEmpty()) {
                proxyListActivity.f43819a.M(i7);
                return;
            }
            org.telegram.messenger.az azVar = (org.telegram.messenger.az) arrayList.get(i7 - proxyListActivity.f43824n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = org.telegram.messenger.mp.g1().edit();
            azVar.f23096a.i(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            org.telegram.messenger.bz.B1 = azVar;
            for (int i12 = proxyListActivity.f43824n; i12 < proxyListActivity.f43825r; i12++) {
                org.telegram.ui.Components.mj0 mj0Var2 = (org.telegram.ui.Components.mj0) proxyListActivity.f43820b.K(i12);
                if (mj0Var2 != null) {
                    px0 px0Var = (px0) mj0Var2.f59245a;
                    if (px0Var.d == azVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    px0Var.setChecked(z10);
                    px0Var.b();
                }
            }
            proxyListActivity.h0(false);
            org.telegram.ui.Components.mj0 mj0Var3 = (org.telegram.ui.Components.mj0) proxyListActivity.f43820b.K(proxyListActivity.useProxyRow);
            if (mj0Var3 != null) {
                ((org.telegram.ui.Cells.r8) mj0Var3.f59245a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.bz.B1.f23096a);
        } else if (i7 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new wx0());
        } else if (i7 == proxyListActivity.E) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131751567, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.U = N0;
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            t1Var.S = org.telegram.messenger.gd.N0(2131751497, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new mx0(proxyListActivity));
            proxyListActivity.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
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
        int i10 = org.telegram.messenger.ks.D4;
        e10.n(proxyListActivity, i10);
        org.telegram.messenger.ks.e().k(i10, new Object[0]);
        org.telegram.messenger.ks.e().c(proxyListActivity, i10);
        proxyListActivity.h0(true);
        l4 l4Var = proxyListActivity.f43819a;
        if (l4Var != null) {
            l4Var.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f43819a.F();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746405, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 6));
        this.f43819a = new l4(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43820b = ek0Var;
        ek0Var.r1();
        ((v4.l) this.f43820b.getItemAnimator()).C = false;
        ((v4.l) this.f43820b.getItemAnimator()).f59296o = org.telegram.ui.Components.kr.f36858f;
        this.f43820b.setSectionsDrawBackground(true);
        this.f43820b.setVerticalScrollBarEnabled(false);
        this.f43820b.setLayoutManager(new v4.c0(1, false));
        frameLayout.addView(this.f43820b, c8.na.e(-1, -1, 51));
        this.f43820b.setAdapter(this.f43819a);
        this.f43820b.setOnItemClickListener(new h(this, 29));
        this.f43820b.setOnItemLongClickListener(new mx0(this));
        org.telegram.ui.ActionBar.f5 q10 = this.simpleActionBar.q();
        q10.c(1, 2131232368, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.gd.N0(2131744605, null));
        q10.c(0, 2131232113, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.gd.N0(2131751586, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ki0(this, context, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43820b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43820b, 262156, new Class[]{px0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29729s6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43820b, 262156, new Class[]{px0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29862z6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43820b, 262156, new Class[]{px0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29805w6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43820b, 262156, new Class[]{px0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29672p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43820b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43820b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
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
                this.f43819a.F();
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
        this.f43821c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.F4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.D4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.E4);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T1);
        boolean z10 = false;
        if (org.telegram.messenger.mp.g1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.bz.f23341z1.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        h0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.F4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.D4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.E4);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f43819a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
