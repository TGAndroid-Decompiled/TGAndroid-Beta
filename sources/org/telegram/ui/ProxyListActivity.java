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
public class ProxyListActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int D;
    public final ArrayList E;
    public final ArrayList F;
    public boolean G;
    public l4 f41883a;
    public org.telegram.ui.Components.qj0 f41884b;
    public int f41885c;
    public boolean d;
    public int f41886e;
    public int f41887f;
    public int h;
    public int f41888n;
    private int proxyAddRow;
    public int f41889r;
    public int f41890s;
    private int useProxyRow;
    public int f41891w;
    public int f41892x;
    public int f41893y;

    public ProxyListActivity() {
        super(null);
        this.E = new ArrayList();
        this.F = new ArrayList();
    }

    public static void Z(ProxyListActivity proxyListActivity, View view, int i7) {
        boolean z9;
        ArrayList arrayList = proxyListActivity.F;
        if (i7 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.iz.B1 == null) {
                if (!arrayList.isEmpty()) {
                    org.telegram.messenger.iz.B1 = (org.telegram.messenger.hz) arrayList.get(0);
                    if (!proxyListActivity.d) {
                        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                        org.telegram.messenger.iz.B1.f22994a.i(edit);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new yx0());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.h0(true);
            org.telegram.messenger.qp.e1();
            ((org.telegram.ui.Cells.r8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.iz.B1.f22994a);
            org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
            int i10 = org.telegram.messenger.qs.A4;
            e10.n(proxyListActivity, i10);
            org.telegram.messenger.qs.e().k(i10, new Object[0]);
            org.telegram.messenger.qs.e().c(proxyListActivity, i10);
            for (int i11 = proxyListActivity.f41888n; i11 < proxyListActivity.f41889r; i11++) {
                org.telegram.ui.Components.yi0 yi0Var = (org.telegram.ui.Components.yi0) proxyListActivity.f41884b.K(i11);
                if (yi0Var != null) {
                    ((rx0) yi0Var.f57056a).b();
                }
            }
        } else if (i7 == proxyListActivity.f41891w) {
            boolean z10 = !org.telegram.messenger.iz.f23387a1;
            org.telegram.messenger.iz.f23387a1 = z10;
            ((org.telegram.ui.Cells.r8) view).setChecked(z10);
            org.telegram.messenger.iz.y();
            proxyListActivity.h0(true);
        } else if (i7 >= proxyListActivity.f41888n && i7 < proxyListActivity.f41889r) {
            if (!proxyListActivity.E.isEmpty()) {
                proxyListActivity.f41883a.M(i7);
                return;
            }
            org.telegram.messenger.hz hzVar = (org.telegram.messenger.hz) arrayList.get(i7 - proxyListActivity.f41888n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = org.telegram.messenger.qp.e1().edit();
            hzVar.f22994a.i(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            org.telegram.messenger.iz.B1 = hzVar;
            for (int i12 = proxyListActivity.f41888n; i12 < proxyListActivity.f41889r; i12++) {
                org.telegram.ui.Components.yi0 yi0Var2 = (org.telegram.ui.Components.yi0) proxyListActivity.f41884b.K(i12);
                if (yi0Var2 != null) {
                    rx0 rx0Var = (rx0) yi0Var2.f57056a;
                    if (rx0Var.d == hzVar) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    rx0Var.setChecked(z9);
                    rx0Var.b();
                }
            }
            proxyListActivity.h0(false);
            org.telegram.ui.Components.yi0 yi0Var3 = (org.telegram.ui.Components.yi0) proxyListActivity.f41884b.K(proxyListActivity.useProxyRow);
            if (yi0Var3 != null) {
                ((org.telegram.ui.Cells.r8) yi0Var3.f57056a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.iz.B1.f22994a);
        } else if (i7 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new yx0());
        } else if (i7 == proxyListActivity.D) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131751579, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.T = M0;
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            u1Var.R = org.telegram.messenger.id.M0(2131751509, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new px0(proxyListActivity));
            proxyListActivity.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
            }
        }
    }

    public static void a0(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.F;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.messenger.iz.i((org.telegram.messenger.hz) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
        int i10 = org.telegram.messenger.qs.A4;
        e10.n(proxyListActivity, i10);
        org.telegram.messenger.qs.e().k(i10, new Object[0]);
        org.telegram.messenger.qs.e().c(proxyListActivity, i10);
        proxyListActivity.h0(true);
        l4 l4Var = proxyListActivity.f41883a;
        if (l4Var != null) {
            l4Var.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f41883a.F();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131746601, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new pt0(this, 3));
        this.f41883a = new l4(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f41884b = qj0Var;
        qj0Var.r1();
        ((v4.k) this.f41884b.getItemAnimator()).C = false;
        ((v4.k) this.f41884b.getItemAnimator()).f57112o = org.telegram.ui.Components.xq.f40458f;
        this.f41884b.setSectionsDrawBackground(true);
        this.f41884b.setVerticalScrollBarEnabled(false);
        this.f41884b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f41884b, c8.ha.e(-1, -1, 51));
        this.f41884b.setAdapter(this.f41883a);
        this.f41884b.setOnItemClickListener(new h(this, 29));
        this.f41884b.setOnItemLongClickListener(new px0(this));
        org.telegram.ui.ActionBar.e5 m10 = this.simpleActionBar.m();
        m10.c(1, 2131232363, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.id.M0(2131744846, null));
        m10.c(0, 2131232108, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.id.M0(2131751598, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ji0(this, context, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f41884b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41884b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28143s6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41884b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28275z6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41884b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28219w6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41884b, 262156, new Class[]{rx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28086p7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41884b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41884b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.N6));
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
    public final boolean onBackPressed(boolean z9) {
        if (!this.E.isEmpty()) {
            if (z9) {
                this.f41883a.F();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.z5.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.iz.u();
        this.f41885c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.C4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.A4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.B4);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T1);
        boolean z9 = false;
        if (org.telegram.messenger.qp.e1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.iz.f23456z1.isEmpty()) {
            z9 = true;
        }
        this.d = z9;
        h0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.C4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.A4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.B4);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f41883a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
