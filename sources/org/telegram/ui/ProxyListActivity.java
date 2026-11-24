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
public class ProxyListActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public s30 a;
    public r59 b;
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
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setTitle(jb6.M0(2131746334, null));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 4));
        this.a = new s30(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        ((sc3) this.b.getItemAnimator()).C = false;
        ((sc3) this.b.getItemAnimator()).o = d53.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new u46(1, false));
        frameLayout.addView(this.b, qoe.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new kg4(this, (byte) 28));
        this.b.setOnItemLongClickListener(new vv8(this));
        yja q = this.simpleActionBar.q();
        q.b(1, 2131232369, null, null, gm.L(54.0f), null).setContentDescription(jb6.M0(2131744535, null));
        q.b(0, 2131232114, null, null, gm.L(54.0f), null).setContentDescription(jb6.M0(2131751535, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kx7(this, context, (byte) 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void f0() {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gda.i((fda) obj);
        }
        this.d = false;
        nm7 e = nm7.e();
        int i2 = nm7.E4;
        e.n(this, i2);
        nm7.e().k(i2, new Object[0]);
        nm7.e().b(this, i2);
        h0(true);
        s30 s30Var = this.a;
        if (s30Var != null) {
            s30Var.h(this.useProxyRow, 0);
            this.a.F();
        }
    }

    public final void g0(int i, View view) {
        boolean z;
        int i2 = this.useProxyRow;
        ArrayList arrayList = this.G;
        if (i == i2) {
            if (gda.x1 == null) {
                if (!arrayList.isEmpty()) {
                    gda.x1 = (fda) arrayList.get(0);
                    if (!this.d) {
                        SharedPreferences.Editor edit = oc7.d1().edit();
                        gda.x1.a.i(edit);
                        edit.commit();
                    }
                } else {
                    presentFragment(new gw8());
                    return;
                }
            }
            this.d = !this.d;
            h0(true);
            oc7.d1();
            ((bjb) view).setChecked(this.d);
            SharedPreferences.Editor edit2 = oc7.d1().edit();
            edit2.putBoolean("proxy_enabled", this.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(this.d, gda.x1.a);
            nm7 e = nm7.e();
            int i3 = nm7.E4;
            e.n(this, i3);
            nm7.e().k(i3, new Object[0]);
            nm7.e().b(this, i3);
            for (int i4 = this.n; i4 < this.r; i4++) {
                b59 b59Var = (b59) this.b.K(i4);
                if (b59Var != null) {
                    ((zv8) b59Var.a).b();
                }
            }
        } else if (i == this.w) {
            boolean z2 = !gda.W0;
            gda.W0 = z2;
            ((bjb) view).setChecked(z2);
            gda.x();
            h0(true);
        } else if (i >= this.n && i < this.r) {
            if (!this.F.isEmpty()) {
                this.a.P(i);
                return;
            }
            fda fdaVar = (fda) arrayList.get(i - this.n);
            this.d = true;
            SharedPreferences.Editor edit3 = oc7.d1().edit();
            fdaVar.a.i(edit3);
            edit3.putBoolean("proxy_enabled", this.d);
            edit3.commit();
            gda.x1 = fdaVar;
            for (int i5 = this.n; i5 < this.r; i5++) {
                b59 b59Var2 = (b59) this.b.K(i5);
                if (b59Var2 != null) {
                    zv8 zv8Var = (zv8) b59Var2.a;
                    if (zv8Var.d == fdaVar) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zv8Var.setChecked(z);
                    zv8Var.b();
                }
            }
            h0(false);
            b59 b59Var3 = (b59) this.b.K(this.useProxyRow);
            if (b59Var3 != null) {
                ((bjb) b59Var3.a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(this.d, gda.x1.a);
        } else if (i == this.proxyAddRow) {
            presentFragment(new gw8());
        } else if (i == this.E) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131751516, null);
            he heVar = alertDialog$Builder.a;
            heVar.U = M0;
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            heVar.S = jb6.M0(2131751446, null);
            alertDialog$Builder.j(jb6.M0(2131751535, null), new vv8(this));
            showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 262156, new Class[]{zv8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (bnb) null, cmb.r6));
        arrayList.add(new cnb(this.b, 262156, new Class[]{zv8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (bnb) null, cmb.y6));
        arrayList.add(new cnb(this.b, 262156, new Class[]{zv8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (bnb) null, cmb.v6));
        arrayList.add(new cnb(this.b, 262156, new Class[]{zv8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.b, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
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
        er3.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        gda.t();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        nm7.e().b(this, nm7.G4);
        nm7.e().b(this, nm7.E4);
        nm7.e().b(this, nm7.F4);
        nm7.f(this.currentAccount).b(this, nm7.T1);
        boolean z = false;
        if (oc7.d1().getBoolean("proxy_enabled", false) && !gda.v1.isEmpty()) {
            z = true;
        }
        this.d = z;
        h0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.e().n(this, nm7.G4);
        nm7.e().n(this, nm7.E4);
        nm7.e().n(this, nm7.F4);
        nm7.f(this.currentAccount).n(this, nm7.T1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.a;
        if (s30Var != null) {
            s30Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
