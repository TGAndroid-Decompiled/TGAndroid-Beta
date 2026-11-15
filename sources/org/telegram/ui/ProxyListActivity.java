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
public class ProxyListActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public l4 f43247a;
    public org.telegram.ui.Components.uj0 f43248b;
    public int f43249c;
    public boolean d;
    public int f43250e;
    public int f43251f;
    public int h;
    public int f43252n;
    private int proxyAddRow;
    public int f43253r;
    public int f43254s;
    private int useProxyRow;
    public int f43255w;
    public int f43256x;
    public int f43257y;

    public ProxyListActivity() {
        super(null);
        this.F = new ArrayList();
        this.G = new ArrayList();
    }

    public static void Z(ProxyListActivity proxyListActivity, View view, int i7) {
        boolean z10;
        ArrayList arrayList = proxyListActivity.G;
        if (i7 == proxyListActivity.useProxyRow) {
            if (org.telegram.messenger.gz.B1 == null) {
                if (!arrayList.isEmpty()) {
                    org.telegram.messenger.gz.B1 = (org.telegram.messenger.fz) arrayList.get(0);
                    if (!proxyListActivity.d) {
                        SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                        org.telegram.messenger.gz.B1.f23575a.i(edit);
                        edit.commit();
                    }
                } else {
                    proxyListActivity.presentFragment(new tx0());
                    return;
                }
            }
            proxyListActivity.d = !proxyListActivity.d;
            proxyListActivity.h0(true);
            org.telegram.messenger.np.e1();
            ((org.telegram.ui.Cells.q8) view).setChecked(proxyListActivity.d);
            SharedPreferences.Editor edit2 = org.telegram.messenger.np.e1().edit();
            edit2.putBoolean("proxy_enabled", proxyListActivity.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.gz.B1.f23575a);
            org.telegram.messenger.ns e10 = org.telegram.messenger.ns.e();
            int i10 = org.telegram.messenger.ns.A4;
            e10.n(proxyListActivity, i10);
            org.telegram.messenger.ns.e().k(i10, new Object[0]);
            org.telegram.messenger.ns.e().c(proxyListActivity, i10);
            for (int i11 = proxyListActivity.f43252n; i11 < proxyListActivity.f43253r; i11++) {
                org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) proxyListActivity.f43248b.K(i11);
                if (cj0Var != null) {
                    ((mx0) cj0Var.f58535a).b();
                }
            }
        } else if (i7 == proxyListActivity.f43255w) {
            boolean z11 = !org.telegram.messenger.gz.f23931a1;
            org.telegram.messenger.gz.f23931a1 = z11;
            ((org.telegram.ui.Cells.q8) view).setChecked(z11);
            org.telegram.messenger.gz.y();
            proxyListActivity.h0(true);
        } else if (i7 >= proxyListActivity.f43252n && i7 < proxyListActivity.f43253r) {
            if (!proxyListActivity.F.isEmpty()) {
                proxyListActivity.f43247a.N(i7);
                return;
            }
            org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList.get(i7 - proxyListActivity.f43252n);
            proxyListActivity.d = true;
            SharedPreferences.Editor edit3 = org.telegram.messenger.np.e1().edit();
            fzVar.f23575a.i(edit3);
            edit3.putBoolean("proxy_enabled", proxyListActivity.d);
            edit3.commit();
            org.telegram.messenger.gz.B1 = fzVar;
            for (int i12 = proxyListActivity.f43252n; i12 < proxyListActivity.f43253r; i12++) {
                org.telegram.ui.Components.cj0 cj0Var2 = (org.telegram.ui.Components.cj0) proxyListActivity.f43248b.K(i12);
                if (cj0Var2 != null) {
                    mx0 mx0Var = (mx0) cj0Var2.f58535a;
                    if (mx0Var.d == fzVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mx0Var.setChecked(z10);
                    mx0Var.b();
                }
            }
            proxyListActivity.h0(false);
            org.telegram.ui.Components.cj0 cj0Var3 = (org.telegram.ui.Components.cj0) proxyListActivity.f43248b.K(proxyListActivity.useProxyRow);
            if (cj0Var3 != null) {
                ((org.telegram.ui.Cells.q8) cj0Var3.f58535a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(proxyListActivity.d, org.telegram.messenger.gz.B1.f23575a);
        } else if (i7 == proxyListActivity.proxyAddRow) {
            proxyListActivity.presentFragment(new tx0());
        } else if (i7 == proxyListActivity.E) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131751579, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.U = M0;
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            t1Var.S = org.telegram.messenger.hd.M0(2131751509, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new kx0(proxyListActivity));
            proxyListActivity.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
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
            org.telegram.messenger.gz.i((org.telegram.messenger.fz) obj);
        }
        proxyListActivity.d = false;
        org.telegram.messenger.ns e10 = org.telegram.messenger.ns.e();
        int i10 = org.telegram.messenger.ns.A4;
        e10.n(proxyListActivity, i10);
        org.telegram.messenger.ns.e().k(i10, new Object[0]);
        org.telegram.messenger.ns.e().c(proxyListActivity, i10);
        proxyListActivity.h0(true);
        l4 l4Var = proxyListActivity.f43247a;
        if (l4Var != null) {
            l4Var.h(proxyListActivity.useProxyRow, 0);
            proxyListActivity.f43247a.F();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29260z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746601, null));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 4));
        this.f43247a = new l4(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f43248b = uj0Var;
        uj0Var.r1();
        ((v4.k) this.f43248b.getItemAnimator()).C = false;
        ((v4.k) this.f43248b.getItemAnimator()).f58586o = org.telegram.ui.Components.er.f34420f;
        this.f43248b.setSectionsDrawBackground(true);
        this.f43248b.setVerticalScrollBarEnabled(false);
        this.f43248b.setLayoutManager(new v4.b0(1, false));
        frameLayout.addView(this.f43248b, c8.ja.e(-1, -1, 51));
        this.f43248b.setAdapter(this.f43247a);
        this.f43248b.setOnItemClickListener(new h(this, 29));
        this.f43248b.setOnItemLongClickListener(new kx0(this));
        org.telegram.ui.ActionBar.c5 o4 = this.simpleActionBar.o();
        o4.c(1, 2131232364, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.hd.M0(2131744846, null));
        o4.c(0, 2131232109, null, null, org.telegram.messenger.g0.L(54.0f), null).setContentDescription(org.telegram.messenger.hd.M0(2131751598, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ji0(this, context, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f43248b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43248b, 262156, new Class[]{mx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29127s6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43248b, 262156, new Class[]{mx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29260z6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43248b, 262156, new Class[]{mx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29203w6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43248b, 262156, new Class[]{mx0.class}, new String[]{"valueTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29070p7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43248b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43248b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
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
                this.f43247a.F();
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
        org.telegram.messenger.gz.u();
        this.f43249c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.C4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.A4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.B4);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.T1);
        boolean z10 = false;
        if (org.telegram.messenger.np.e1().getBoolean("proxy_enabled", false) && !org.telegram.messenger.gz.f24000z1.isEmpty()) {
            z10 = true;
        }
        this.d = z10;
        h0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.C4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.A4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.B4);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.T1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f43247a;
        if (l4Var != null) {
            l4Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
