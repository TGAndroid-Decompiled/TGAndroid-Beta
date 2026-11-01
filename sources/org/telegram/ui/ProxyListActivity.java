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
public class ProxyListActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public int D;
    public final ArrayList E;
    public final ArrayList F;
    public boolean G;
    public fg.j f33964a;
    public org.telegram.ui.Components.uk0 f33965b;
    public int f33966c;
    public boolean d;
    public int e;
    public int f33967f;
    public int h;
    public int f33968n;
    private int proxyAddRow;
    public int f33969r;
    public int f33970s;
    private int useProxyRow;
    public int f33971w;
    public int f33972x;
    public int f33973y;

    public ProxyListActivity() {
        super(null);
        this.E = new ArrayList();
        this.F = new ArrayList();
    }

    public static void Z(ProxyListActivity proxyListActivity, View view, int i10) {
        boolean z10;
        ArrayList arrayList = proxyListActivity.F;
        if (i10 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.uz.B1 == null) {
                if (!arrayList.isEmpty()) {
                    org.telegram.messenger.uz.B1 = (org.telegram.messenger.tz) arrayList.get(0);
                    if (!proxyListActivity.d) {
                        SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                        org.telegram.messenger.uz.B1.f18325a.h(edit);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new iz0());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.h0(true);
            org.telegram.messenger.wp.d1();
            ((org.telegram.ui.Cells.t8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.wp.d1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.uz.B1.f18325a);
            org.telegram.messenger.at e = org.telegram.messenger.at.e();
            int i11 = org.telegram.messenger.at.A4;
            e.n(proxyListActivity, i11);
            org.telegram.messenger.at.e().k(i11, new Object[0]);
            org.telegram.messenger.at.e().c(proxyListActivity, i11);
            for (int i12 = proxyListActivity.f33968n; i12 < proxyListActivity.f33969r; i12++) {
                org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) proxyListActivity.f33965b.K(i12);
                if (dk0Var != null) {
                    ((bz0) dk0Var.f47909a).b();
                }
            }
        } else if (i10 == proxyListActivity.f33971w) {
            boolean z11 = !org.telegram.messenger.uz.f18502a1;
            org.telegram.messenger.uz.f18502a1 = z11;
            ((org.telegram.ui.Cells.t8) view).setChecked(z11);
            org.telegram.messenger.uz.y();
            proxyListActivity.h0(true);
        } else if (i10 >= proxyListActivity.f33968n && i10 < proxyListActivity.f33969r) {
            if (!proxyListActivity.E.isEmpty()) {
                proxyListActivity.f33964a.M(i10);
                return;
            }
            org.telegram.messenger.tz tzVar = (org.telegram.messenger.tz) arrayList.get(i10 - proxyListActivity.f33968n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = org.telegram.messenger.wp.d1().edit();
            tzVar.f18325a.h(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            org.telegram.messenger.uz.B1 = tzVar;
            for (int i13 = proxyListActivity.f33968n; i13 < proxyListActivity.f33969r; i13++) {
                org.telegram.ui.Components.dk0 dk0Var2 = (org.telegram.ui.Components.dk0) proxyListActivity.f33965b.K(i13);
                if (dk0Var2 != null) {
                    bz0 bz0Var = (bz0) dk0Var2.f47909a;
                    if (bz0Var.d == tzVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bz0Var.setChecked(z10);
                    bz0Var.b();
                }
            }
            proxyListActivity.h0(false);
            org.telegram.ui.Components.dk0 dk0Var3 = (org.telegram.ui.Components.dk0) proxyListActivity.f33965b.K(proxyListActivity.useProxyRow);
            if (dk0Var3 != null) {
                ((org.telegram.ui.Cells.t8) dk0Var3.f47909a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.uz.B1.f18325a);
        } else if (i10 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new iz0());
        } else if (i10 == proxyListActivity.D) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131751580, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.T = L0;
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            x1Var.R = org.telegram.messenger.dd.L0(2131751510, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new zy0(proxyListActivity));
            proxyListActivity.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
            }
        }
    }

    public static void a0(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.F;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.uz.i((org.telegram.messenger.tz) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.at e = org.telegram.messenger.at.e();
        int i11 = org.telegram.messenger.at.A4;
        e.n(proxyListActivity, i11);
        org.telegram.messenger.at.e().k(i11, new Object[0]);
        org.telegram.messenger.at.e().c(proxyListActivity, i11);
        proxyListActivity.h0(true);
        fg.j jVar = proxyListActivity.f33964a;
        if (jVar != null) {
            jVar.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f33964a.F();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131746616, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 24));
        this.f33964a = new fg.j(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f33965b = uk0Var;
        uk0Var.r1();
        ((s4.j) this.f33965b.getItemAnimator()).C = false;
        ((s4.j) this.f33965b.getItemAnimator()).f47956o = org.telegram.ui.Components.gr.f26523f;
        this.f33965b.setSectionsDrawBackground(true);
        this.f33965b.setVerticalScrollBarEnabled(false);
        this.f33965b.setLayoutManager(new s4.a0(1, false));
        frameLayout.addView(this.f33965b, w7.b6.e(-1, -1, 51));
        this.f33965b.setAdapter(this.f33964a);
        this.f33965b.setOnItemClickListener(new g(this, 29));
        this.f33965b.setOnItemLongClickListener(new zy0(this));
        org.telegram.ui.ActionBar.o5 l4 = this.simpleActionBar.l();
        l4.c(1, 2131232362, null, null, org.telegram.messenger.i0.L(54.0f), null).setContentDescription(org.telegram.messenger.dd.L0(2131744864, null));
        l4.c(0, 2131232107, null, null, org.telegram.messenger.i0.L(54.0f), null).setContentDescription(org.telegram.messenger.dd.L0(2131751599, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new nj0(this, context, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f33965b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33965b, 262156, new Class[]{bz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21205s6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33965b, 262156, new Class[]{bz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21331z6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33965b, 262156, new Class[]{bz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21278w6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33965b, 262156, new Class[]{bz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21154p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33965b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33965b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
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
        if (!this.E.isEmpty()) {
            if (z10) {
                this.f33964a.F();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.messenger.b6.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.uz.u();
        this.f33966c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.C4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.A4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.B4);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.T1);
        boolean z10 = false;
        if (org.telegram.messenger.wp.d1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.uz.f18571z1.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        h0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.C4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.A4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.B4);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.T1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f33964a;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
