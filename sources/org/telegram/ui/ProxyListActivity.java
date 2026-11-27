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
public class ProxyListActivity extends org.telegram.ui.ActionBar.e implements fn7 {
    public int E;
    public final ArrayList F;
    public final ArrayList G;
    public boolean H;
    public t20 a;
    public d79 b;
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
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setTitle(ob6.M0(2131746328, null));
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 5));
        this.a = new t20(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        ((zb3) this.b.getItemAnimator()).C = false;
        ((zb3) this.b.getItemAnimator()).o = k43.f;
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setLayoutManager(new x46(1, false));
        frameLayout.addView(this.b, tre.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new zg4(this, (byte) 27));
        this.b.setOnItemLongClickListener(new dx8(this));
        rla r = this.simpleActionBar.r();
        r.b(1, 2131232368, null, null, hl.L(54.0f), null).setContentDescription(ob6.M0(2131744503, null));
        r.b(0, 2131232113, null, null, hl.L(54.0f), null).setContentDescription(ob6.M0(2131751563, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new py7(this, context, (byte) 1));
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
            xea.i((wea) obj);
        }
        this.d = false;
        jn7 e = jn7.e();
        int i2 = jn7.D4;
        e.n(this, i2);
        jn7.e().k(i2, new Object[0]);
        jn7.e().b(this, i2);
        g0(true);
        t20 t20Var = this.a;
        if (t20Var != null) {
            t20Var.h(this.useProxyRow, 0);
            this.a.F();
        }
    }

    public final void f0(int i, View view) {
        boolean z;
        int i2 = this.useProxyRow;
        ArrayList arrayList = this.G;
        if (i == i2) {
            if (xea.x1 == null) {
                if (!arrayList.isEmpty()) {
                    xea.x1 = (wea) arrayList.get(0);
                    if (!this.d) {
                        SharedPreferences.Editor edit = uc7.e1().edit();
                        xea.x1.a.i(edit);
                        edit.commit();
                    }
                } else {
                    presentFragment(new ox8());
                    return;
                }
            }
            this.d = !this.d;
            g0(true);
            uc7.e1();
            ((wkb) view).setChecked(this.d);
            SharedPreferences.Editor edit2 = uc7.e1().edit();
            edit2.putBoolean("proxy_enabled", this.d);
            edit2.commit();
            ConnectionsManager.setProxySettings(this.d, xea.x1.a);
            jn7 e = jn7.e();
            int i3 = jn7.D4;
            e.n(this, i3);
            jn7.e().k(i3, new Object[0]);
            jn7.e().b(this, i3);
            for (int i4 = this.n; i4 < this.r; i4++) {
                n69 n69Var = (n69) this.b.L(i4);
                if (n69Var != null) {
                    ((hx8) n69Var.a).b();
                }
            }
        } else if (i == this.w) {
            boolean z2 = !xea.W0;
            xea.W0 = z2;
            ((wkb) view).setChecked(z2);
            xea.x();
            g0(true);
        } else if (i >= this.n && i < this.r) {
            if (!this.F.isEmpty()) {
                this.a.P(i);
                return;
            }
            wea weaVar = (wea) arrayList.get(i - this.n);
            this.d = true;
            SharedPreferences.Editor edit3 = uc7.e1().edit();
            weaVar.a.i(edit3);
            edit3.putBoolean("proxy_enabled", this.d);
            edit3.commit();
            xea.x1 = weaVar;
            for (int i5 = this.n; i5 < this.r; i5++) {
                n69 n69Var2 = (n69) this.b.L(i5);
                if (n69Var2 != null) {
                    hx8 hx8Var = (hx8) n69Var2.a;
                    if (hx8Var.d == weaVar) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hx8Var.setChecked(z);
                    hx8Var.b();
                }
            }
            g0(false);
            n69 n69Var3 = (n69) this.b.L(this.useProxyRow);
            if (n69Var3 != null) {
                ((wkb) n69Var3.a).setChecked(true);
            }
            ConnectionsManager.setProxySettings(this.d, xea.x1.a);
        } else if (i == this.proxyAddRow) {
            presentFragment(new ox8());
        } else if (i == this.E) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131751544, null);
            id idVar = alertDialog$Builder.a;
            idVar.U = M0;
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            idVar.S = ob6.M0(2131751474, null);
            alertDialog$Builder.j(ob6.M0(2131751563, null), new dx8(this));
            showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
            }
        }
    }

    public final void g0(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProxyListActivity.g0(boolean):void");
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 262156, new Class[]{hx8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (zob) null, aob.s6));
        arrayList.add(new apb(this.b, 262156, new Class[]{hx8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (zob) null, aob.z6));
        arrayList.add(new apb(this.b, 262156, new Class[]{hx8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (zob) null, aob.w6));
        arrayList.add(new apb(this.b, 262156, new Class[]{hx8.class}, new String[]{"valueTextView"}, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.b, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
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
        lq3.q(this.currentAccount).g();
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        xea.t();
        this.c = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        jn7.e().b(this, jn7.F4);
        jn7.e().b(this, jn7.D4);
        jn7.e().b(this, jn7.E4);
        jn7.f(this.currentAccount).b(this, jn7.T1);
        boolean z = false;
        if (uc7.e1().getBoolean("proxy_enabled", false) && !xea.v1.isEmpty()) {
            z = true;
        }
        this.d = z;
        g0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.e().n(this, jn7.F4);
        jn7.e().n(this, jn7.D4);
        jn7.e().n(this, jn7.E4);
        jn7.f(this.currentAccount).n(this, jn7.T1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.a;
        if (t20Var != null) {
            t20Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
