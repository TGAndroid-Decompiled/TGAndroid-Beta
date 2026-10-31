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
public class ProxyListActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public int D;
    public final ArrayList E;
    public final ArrayList F;
    public boolean G;
    public fg.j f33957a;
    public org.telegram.ui.Components.tk0 f33958b;
    public int f33959c;
    public boolean d;
    public int e;
    public int f33960f;
    public int h;
    public int f33961n;
    private int proxyAddRow;
    public int f33962r;
    public int f33963s;
    private int useProxyRow;
    public int f33964w;
    public int f33965x;
    public int f33966y;

    public ProxyListActivity() {
        super(null);
        this.E = new ArrayList();
        this.F = new ArrayList();
    }

    public static void Y(ProxyListActivity proxyListActivity, View view, int i10) {
        boolean z10;
        ArrayList arrayList = proxyListActivity.F;
        if (i10 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.tz.B1 == null) {
                if (!arrayList.isEmpty()) {
                    org.telegram.messenger.tz.B1 = (org.telegram.messenger.sz) arrayList.get(0);
                    if (!proxyListActivity.d) {
                        SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                        org.telegram.messenger.tz.B1.f17974a.h(edit);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new jz0());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.g0(true);
            org.telegram.messenger.vp.d1();
            ((org.telegram.ui.Cells.t8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.vp.d1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.tz.B1.f17974a);
            org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
            int i11 = org.telegram.messenger.zs.A4;
            e.n(proxyListActivity, i11);
            org.telegram.messenger.zs.e().k(i11, new Object[0]);
            org.telegram.messenger.zs.e().c(proxyListActivity, i11);
            for (int i12 = proxyListActivity.f33961n; i12 < proxyListActivity.f33962r; i12++) {
                org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) proxyListActivity.f33958b.K(i12);
                if (ck0Var != null) {
                    ((cz0) ck0Var.f47898a).b();
                }
            }
        } else if (i10 == proxyListActivity.f33964w) {
            boolean z11 = !org.telegram.messenger.tz.f18133a1;
            org.telegram.messenger.tz.f18133a1 = z11;
            ((org.telegram.ui.Cells.t8) view).setChecked(z11);
            org.telegram.messenger.tz.y();
            proxyListActivity.g0(true);
        } else if (i10 >= proxyListActivity.f33961n && i10 < proxyListActivity.f33962r) {
            if (!proxyListActivity.E.isEmpty()) {
                proxyListActivity.f33957a.M(i10);
                return;
            }
            org.telegram.messenger.sz szVar = (org.telegram.messenger.sz) arrayList.get(i10 - proxyListActivity.f33961n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = org.telegram.messenger.vp.d1().edit();
            szVar.f17974a.h(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            org.telegram.messenger.tz.B1 = szVar;
            for (int i13 = proxyListActivity.f33961n; i13 < proxyListActivity.f33962r; i13++) {
                org.telegram.ui.Components.ck0 ck0Var2 = (org.telegram.ui.Components.ck0) proxyListActivity.f33958b.K(i13);
                if (ck0Var2 != null) {
                    cz0 cz0Var = (cz0) ck0Var2.f47898a;
                    if (cz0Var.d == szVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cz0Var.setChecked(z10);
                    cz0Var.b();
                }
            }
            proxyListActivity.g0(false);
            org.telegram.ui.Components.ck0 ck0Var3 = (org.telegram.ui.Components.ck0) proxyListActivity.f33958b.K(proxyListActivity.useProxyRow);
            if (ck0Var3 != null) {
                ((org.telegram.ui.Cells.t8) ck0Var3.f47898a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.tz.B1.f17974a);
        } else if (i10 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new jz0());
        } else if (i10 == proxyListActivity.D) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131751580, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.T = L0;
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            x1Var.R = org.telegram.messenger.cd.L0(2131751510, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new az0(proxyListActivity));
            proxyListActivity.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
            }
        }
    }

    public static void Z(ProxyListActivity proxyListActivity) {
        ArrayList arrayList = proxyListActivity.F;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.messenger.tz.i((org.telegram.messenger.sz) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.zs e = org.telegram.messenger.zs.e();
        int i11 = org.telegram.messenger.zs.A4;
        e.n(proxyListActivity, i11);
        org.telegram.messenger.zs.e().k(i11, new Object[0]);
        org.telegram.messenger.zs.e().c(proxyListActivity, i11);
        proxyListActivity.g0(true);
        fg.j jVar = proxyListActivity.f33957a;
        if (jVar != null) {
            jVar.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f33957a.F();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746616, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 24));
        this.f33957a = new fg.j(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f33958b = tk0Var;
        tk0Var.r1();
        ((s4.j) this.f33958b.getItemAnimator()).C = false;
        ((s4.j) this.f33958b.getItemAnimator()).f47945o = org.telegram.ui.Components.gr.f26495f;
        this.f33958b.setSectionsDrawBackground(true);
        this.f33958b.setVerticalScrollBarEnabled(false);
        this.f33958b.setLayoutManager(new s4.a0(1, false));
        frameLayout.addView(this.f33958b, w7.b6.e(-1, -1, 51));
        this.f33958b.setAdapter(this.f33957a);
        this.f33958b.setOnItemClickListener(new g(this, 29));
        this.f33958b.setOnItemLongClickListener(new az0(this));
        org.telegram.ui.ActionBar.o5 l4 = this.simpleActionBar.l();
        l4.c(1, 2131232362, null, null, org.telegram.messenger.i0.L(54.0f), null).setContentDescription(org.telegram.messenger.cd.L0(2131744864, null));
        l4.c(0, 2131232107, null, null, org.telegram.messenger.i0.L(54.0f), null).setContentDescription(org.telegram.messenger.cd.L0(2131751599, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new pj0(this, context, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void g0(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.g0(boolean):void");
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f33958b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33958b, 262156, new Class[]{cz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21204s6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33958b, 262156, new Class[]{cz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21330z6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33958b, 262156, new Class[]{cz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21277w6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33958b, 262156, new Class[]{cz0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21153p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33958b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33958b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
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
                this.f33957a.F();
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
        org.telegram.messenger.tz.u();
        this.f33959c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.C4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.A4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.B4);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.T1);
        boolean z10 = false;
        if (org.telegram.messenger.vp.d1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.tz.f18202z1.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        g0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.C4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.A4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.B4);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.T1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f33957a;
        if (jVar != null) {
            jVar.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
