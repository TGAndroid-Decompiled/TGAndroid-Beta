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
public class ProxyListActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public s20 a;
    public o39 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public int n;
    private int proxyAddRow;
    public int r;
    public int s;
    private int useProxyRow;
    public int w;
    public int x;
    public int y;

    public ProxyListActivity() {
        super(null);
        this.F = new ArrayList();
        this.G = new ArrayList();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setTitle(k96.M0(2131746408, null));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 3));
        this.a = new s20(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        ((gb3) this.b.getItemAnimator()).C = false;
        ((gb3) this.b.getItemAnimator()).o = s33.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new t26(1, false));
        frameLayout.addView(this.b, nme.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new bf4(this, (byte) 27));
        this.b.setOnItemLongClickListener(new ut8(this));
        wha q = this.simpleActionBar.q();
        q.b(1, 2131232368, null, null, gl.L(54.0f), null).setContentDescription(k96.M0(2131744609, null));
        q.b(0, 2131232113, null, null, gl.L(54.0f), null).setContentDescription(k96.M0(2131751586, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new iv7(this, context, (byte) 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0() {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gba.i((fba) obj);
        }
        this.d = false;
        kk7 e = kk7.e();
        int i2 = kk7.C4;
        e.n(this, i2);
        kk7.e().k(i2, new Object[0]);
        kk7.e().b(this, i2);
        g0(true);
        s20 s20Var = this.a;
        if (s20Var != null) {
            s20Var.h(this.useProxyRow, 0);
            this.a.F();
        }
    }

    public final void f0(int i, View view) {
        boolean z;
        int i2 = this.useProxyRow;
        ArrayList arrayList = this.G;
        if (i == i2) {
            if (gba.x1 == null) {
                if (!arrayList.isEmpty()) {
                    gba.x1 = (fba) arrayList.get(0);
                    if (!this.d) {
                        SharedPreferences.Editor edit = na7.c1().edit();
                        gba.x1.a.i(edit);
                        edit.commit();
                    }
                } else {
                    presentFragment(new fu8());
                    return;
                }
            }
            this.d = !this.d;
            g0(true);
            na7.c1();
            ((ahb) view).setChecked(this.d);
            SharedPreferences.Editor edit2 = na7.c1().edit();
            edit2.putBoolean("proxy_enabled", this.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(this.d, gba.x1.a);
            kk7 e = kk7.e();
            int i3 = kk7.C4;
            e.n(this, i3);
            kk7.e().k(i3, new Object[0]);
            kk7.e().b(this, i3);
            for (int i4 = this.n; i4 < this.r; i4++) {
                y29 y29Var = (y29) this.b.K(i4);
                if (y29Var != null) {
                    ((yt8) y29Var.a).b();
                }
            }
        } else if (i == this.w) {
            boolean z2 = !gba.W0;
            gba.W0 = z2;
            ((ahb) view).setChecked(z2);
            gba.x();
            g0(true);
        } else if (i >= this.n && i < this.r) {
            if (!this.F.isEmpty()) {
                this.a.P(i);
                return;
            }
            fba fbaVar = (fba) arrayList.get(i - this.n);
            this.d = true;
            SharedPreferences.Editor edit3 = na7.c1().edit();
            fbaVar.a.i(edit3);
            edit3.putBoolean("proxy_enabled", this.d);
            edit3.commit();
            gba.x1 = fbaVar;
            for (int i5 = this.n; i5 < this.r; i5++) {
                y29 y29Var2 = (y29) this.b.K(i5);
                if (y29Var2 != null) {
                    yt8 yt8Var = (yt8) y29Var2.a;
                    if (yt8Var.d == fbaVar) {
                        z = true;
                    } else {
                        z = false;
                    }
                    yt8Var.setChecked(z);
                    yt8Var.b();
                }
            }
            g0(false);
            y29 y29Var3 = (y29) this.b.K(this.useProxyRow);
            if (y29Var3 != null) {
                ((ahb) y29Var3.a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(this.d, gba.x1.a);
        } else if (i == this.proxyAddRow) {
            presentFragment(new fu8());
        } else if (i == this.E) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131751567, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.U = M0;
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            hdVar.S = k96.M0(2131751497, null);
            alertDialog$Builder.j(k96.M0(2131751586, null), new ut8(this));
            showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, null);
            }
        }
    }

    public final void g0(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.g0(boolean):void");
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 262156, new Class[]{yt8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (alb) null, bkb.r6));
        arrayList.add(new blb(this.b, 262156, new Class[]{yt8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (alb) null, bkb.y6));
        arrayList.add(new blb(this.b, 262156, new Class[]{yt8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (alb) null, bkb.v6));
        arrayList.add(new blb(this.b, 262156, new Class[]{yt8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.b, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!this.F.isEmpty()) {
            if (z) {
                this.a.F();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        up3.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        gba.t();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        kk7.e().b(this, kk7.E4);
        kk7.e().b(this, kk7.C4);
        kk7.e().b(this, kk7.D4);
        kk7.f(this.currentAccount).b(this, kk7.S1);
        boolean z = false;
        if (na7.c1().getBoolean("proxy_enabled", false) && !gba.v1.isEmpty()) {
            z = true;
        }
        this.d = z;
        g0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.e().n(this, kk7.E4);
        kk7.e().n(this, kk7.C4);
        kk7.e().n(this, kk7.D4);
        kk7.f(this.currentAccount).n(this, kk7.S1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.a;
        if (s20Var != null) {
            s20Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
