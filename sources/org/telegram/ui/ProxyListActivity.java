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
public class ProxyListActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public n4 f41904a;
    public org.telegram.ui.Components.tj0 f41905b;
    public int f41906c;
    public boolean d;
    public int f41907e;
    public int f41908f;
    public int h;
    public int f41909n;
    private int proxyAddRow;
    public int f41910r;
    public int f41911s;
    private int useProxyRow;
    public int f41912w;
    public int f41913x;
    public int f41914y;

    public ProxyListActivity() {
        super(null);
        this.F = new ArrayList();
        this.G = new ArrayList();
    }

    public static void Z(ProxyListActivity proxyListActivity, View view, int i3) {
        boolean z10;
        ArrayList arrayList = proxyListActivity.G;
        if (i3 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.az.B1 == null) {
                if (!arrayList.isEmpty()) {
                    org.telegram.messenger.az.B1 = (org.telegram.messenger.zy) arrayList.get(0);
                    if (!proxyListActivity.d) {
                        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                        org.telegram.messenger.az.B1.f26993a.i(edit);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new mx0());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.h0(true);
            org.telegram.messenger.hp.e1();
            ((org.telegram.ui.Cells.q8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.az.B1.f26993a);
            org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
            int i10 = org.telegram.messenger.hs.A4;
            e10.n(proxyListActivity, i10);
            org.telegram.messenger.hs.e().k(i10, new Object[0]);
            org.telegram.messenger.hs.e().c(proxyListActivity, i10);
            for (int i11 = proxyListActivity.f41909n; i11 < proxyListActivity.f41910r; i11++) {
                org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) proxyListActivity.f41905b.K(i11);
                if (bj0Var != null) {
                    ((fx0) bj0Var.f55540a).b();
                }
            }
        } else if (i3 == proxyListActivity.f41912w) {
            boolean z11 = !org.telegram.messenger.az.f21614a1;
            org.telegram.messenger.az.f21614a1 = z11;
            ((org.telegram.ui.Cells.q8) view).setChecked(z11);
            org.telegram.messenger.az.y();
            proxyListActivity.h0(true);
        } else if (i3 >= proxyListActivity.f41909n && i3 < proxyListActivity.f41910r) {
            if (!proxyListActivity.F.isEmpty()) {
                proxyListActivity.f41904a.M(i3);
                return;
            }
            org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) arrayList.get(i3 - proxyListActivity.f41909n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = org.telegram.messenger.hp.e1().edit();
            zyVar.f26993a.i(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            org.telegram.messenger.az.B1 = zyVar;
            for (int i12 = proxyListActivity.f41909n; i12 < proxyListActivity.f41910r; i12++) {
                org.telegram.ui.Components.bj0 bj0Var2 = (org.telegram.ui.Components.bj0) proxyListActivity.f41905b.K(i12);
                if (bj0Var2 != null) {
                    fx0 fx0Var = (fx0) bj0Var2.f55540a;
                    if (fx0Var.d == zyVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    fx0Var.setChecked(z10);
                    fx0Var.b();
                }
            }
            proxyListActivity.h0(false);
            org.telegram.ui.Components.bj0 bj0Var3 = (org.telegram.ui.Components.bj0) proxyListActivity.f41905b.K(proxyListActivity.useProxyRow);
            if (bj0Var3 != null) {
                ((org.telegram.ui.Cells.q8) bj0Var3.f55540a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.az.B1.f26993a);
        } else if (i3 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new mx0());
        } else if (i3 == proxyListActivity.E) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131751580, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.U = M0;
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            s1Var.S = org.telegram.messenger.bd.M0(2131751510, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new dx0(proxyListActivity));
            proxyListActivity.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
            }
        }
    }

    public static void a0(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.G;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            org.telegram.messenger.az.i((org.telegram.messenger.zy) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
        int i10 = org.telegram.messenger.hs.A4;
        e10.n(proxyListActivity, i10);
        org.telegram.messenger.hs.e().k(i10, new Object[0]);
        org.telegram.messenger.hs.e().c(proxyListActivity, i10);
        proxyListActivity.h0(true);
        n4 n4Var = proxyListActivity.f41904a;
        if (n4Var != null) {
            n4Var.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f41904a.F();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131746609, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 4));
        this.f41904a = new n4(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f41905b = tj0Var;
        tj0Var.r1();
        ((u4.k) this.f41905b.getItemAnimator()).C = false;
        ((u4.k) this.f41905b.getItemAnimator()).f55597o = org.telegram.ui.Components.xq.f40452f;
        this.f41905b.setSectionsDrawBackground(true);
        this.f41905b.setVerticalScrollBarEnabled(false);
        this.f41905b.setLayoutManager(new u4.b0(1, false));
        frameLayout.addView(this.f41905b, b8.mf.e(-1, -1, 51));
        this.f41905b.setAdapter(this.f41904a);
        this.f41905b.setOnItemClickListener(new h(this, 29));
        this.f41905b.setOnItemLongClickListener(new dx0(this));
        org.telegram.ui.ActionBar.e5 l10 = this.simpleActionBar.l();
        l10.c(1, 2131232363, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.bd.M0(2131744856, null));
        l10.c(0, 2131232108, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.bd.M0(2131751599, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new fi0(this, context, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41905b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41905b, 262156, new Class[]{fx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41905b, 262156, new Class[]{fx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28290z6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41905b, 262156, new Class[]{fx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28234w6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41905b, 262156, new Class[]{fx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28102p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41905b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41905b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
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
                this.f41904a.F();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.az.u();
        this.f41906c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.C4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.A4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.B4);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.T1);
        boolean z10 = false;
        if (org.telegram.messenger.hp.e1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.az.f21683z1.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        h0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.C4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.A4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.B4);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.T1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.f41904a;
        if (n4Var != null) {
            n4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
