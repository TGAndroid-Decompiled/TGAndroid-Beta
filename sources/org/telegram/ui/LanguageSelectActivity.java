package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public ix5 a;
    private int autoTranslationPosition;
    public o39 b;
    public ix5 c;
    public g24 d;
    private int doNotTranslatePosition;
    public ArrayList e;
    public ArrayList f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int n;
    public int r;

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.a7));
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
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131748862, null));
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 1));
        xha a = this.simpleActionBar.t().a(0, 2131232491);
        a.N();
        a.C0 = new q10(this, (byte) 14);
        a.setSearchFieldHint(k96.M0(2131745644, null));
        this.a = new ix5(this, context, false, (byte) 0);
        this.c = new ix5(this, context, true, (byte) 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.d = g24Var;
        g24Var.setText(k96.M0(2131747975, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new t26(1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        hx5 hx5Var = new hx5(this);
        hx5Var.n(400L);
        hx5Var.C = false;
        hx5Var.o(s33.h);
        this.b.setItemAnimator(hx5Var);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        frameLayout.addView(this.d, nme.c(-1.0f, -1));
        this.b.setOnItemClickListener(new bf4(this, (byte) 8));
        this.b.setOnItemLongClickListener(new ry4(this, (byte) 20));
        this.b.setOnScrollListener(new ao2(this, (byte) 22));
        return this.fragmentView;
    }

    public final void d0() {
        fx5 fx5Var = new fx5(k96.D0().B, (byte) 0);
        this.f = new ArrayList();
        this.h = new ArrayList(k96.D0().K);
        ArrayList arrayList = k96.D0().J;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            i96 i96Var = (i96) arrayList.get(i);
            if (i96Var.k != Integer.MAX_VALUE) {
                this.f.add(i96Var);
            } else {
                this.h.add(i96Var);
            }
        }
        Collections.sort(this.f, fx5Var);
        Collections.sort(this.h, fx5Var);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.A4 && this.a != null) {
            d0();
            gl.c3(new ex5(this, (byte) 2));
        }
    }

    public final boolean e0() {
        return getMessagesController().i4.t();
    }

    public final boolean f0() {
        return getMessagesController().i4.r();
    }

    public final void g0() {
        this.simpleActionBar.n(true);
        m0();
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.b, 0, new Class[]{xw5.class}, new String[]{"checkImage"}, (Drawable[]) null, (alb) null, bkb.Ci));
        return arrayList;
    }

    public final void h0(int i, View view) {
        boolean z;
        i96 i96Var;
        boolean z2;
        boolean z3;
        boolean z4;
        try {
            ahb ahbVar = null;
            if (view instanceof ahb) {
                if (!f0() && !e0()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                int i2 = this.manualTranslationPosition;
                int i3 = kk7.C1;
                if (i == i2) {
                    boolean z5 = !f0();
                    b1c b1cVar = getMessagesController().i4;
                    SharedPreferences.Editor edit = b1cVar.n.X3.edit();
                    b1cVar.s = Boolean.valueOf(z5);
                    edit.putBoolean("translate_button", z5).apply();
                    ((ahb) view).setChecked(z5);
                    kk7.f(this.currentAccount).k(i3, new Object[0]);
                } else if (i == this.autoTranslationPosition) {
                    boolean e0 = e0();
                    boolean z6 = !e0;
                    if (!e0 && !getUserConfig().p()) {
                        showDialog(new jh8((org.telegram.ui.ActionBar.d) this, 13, false));
                        return;
                    }
                    b1c b1cVar2 = getMessagesController().i4;
                    SharedPreferences.Editor edit2 = b1cVar2.n.X3.edit();
                    b1cVar2.r = Boolean.valueOf(z6);
                    edit2.putBoolean("translate_chat_button", z6).apply();
                    kk7.f(this.currentAccount).k(i3, new Object[0]);
                    ((ahb) view).setChecked(z6);
                }
                if (!f0() && !e0()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 != z3) {
                    int i4 = this.autoTranslationPosition;
                    if (i4 < 0) {
                        i4 = this.manualTranslationPosition;
                    }
                    for (int i5 = 0; i5 < this.b.getChildCount(); i5++) {
                        View childAt = this.b.getChildAt(i5);
                        this.b.getClass();
                        if (RecyclerView.R(childAt) == i4 && (childAt instanceof ahb)) {
                            ahbVar = (ahb) childAt;
                        }
                    }
                    if (ahbVar != null) {
                        ahbVar.setDivider(z4);
                    }
                    ix5 ix5Var = this.a;
                    int i6 = i4 + 1;
                    if (z4) {
                        ix5Var.i(i6);
                    } else {
                        ix5Var.r(i6);
                    }
                }
            } else if (view instanceof uib) {
                presentFragment(new qa9());
            } else if (getParentActivity() != null && this.parentLayout != null && (view instanceof yhb)) {
                if (this.b.getAdapter() == this.c) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i -= this.r;
                }
                if (z) {
                    i96Var = (i96) this.e.get(i);
                } else if (!this.h.isEmpty() && i >= 0 && i < this.h.size()) {
                    i96Var = (i96) this.h.get(i);
                } else {
                    if (!this.h.isEmpty()) {
                        i -= this.h.size() + 1;
                    }
                    i96Var = (i96) this.f.get(i);
                }
                i96 i96Var2 = i96Var;
                if (i96Var2 != null) {
                    i96 i96Var3 = k96.D0().B;
                    if (i96Var3 == i96Var2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hd hdVar = new hd(3, null, getParentActivity());
                    if (!z2) {
                        hdVar.q(500L);
                    }
                    b1c b1cVar3 = getMessagesController().i4;
                    b1cVar3.c.clear();
                    b1cVar3.e.clear();
                    int c = k96.D0().c(i96Var2, true, false, false, true, this.currentAccount, new mn6(this, hdVar, z2, (byte) 27));
                    if (c != 0) {
                        hdVar.setOnCancelListener(new a01(c, (byte) 1));
                    }
                    String str = i96Var2.f;
                    String str2 = i96Var3.f;
                    HashSet b0 = qa9.b0();
                    HashSet hashSet = new HashSet(b0);
                    if (b0.contains(str2) && !b0.contains(str)) {
                        Collection.EL.removeIf(hashSet, new gx5(str2, (byte) 0));
                    }
                    if (str != null && !"null".equals(str)) {
                        hashSet.add(str);
                    }
                    qa9.e0(hashSet, Boolean.FALSE);
                    na7.q1(this.currentAccount).i4.f();
                    na7.q1(this.currentAccount).i4.h();
                    b1c.P = null;
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void i0(i96 i96Var) {
        i96 i96Var2;
        k96 D0 = k96.D0();
        int i = this.currentAccount;
        if (i96Var.d != null) {
            if (!i96Var.i() || i96Var.k == Integer.MAX_VALUE) {
                if (D0.B == i96Var) {
                    if (D0.z.getLanguage() != null) {
                        i96Var2 = D0.F0(D0.z.getLanguage());
                    } else {
                        i96Var2 = null;
                    }
                    if (i96Var2 == null) {
                        i96Var2 = D0.F0(k96.H0(D0.z));
                    }
                    if (i96Var2 == null) {
                        i96Var2 = D0.F0("en");
                    }
                    D0.d(i96Var2, true, false, i);
                }
                D0.K.remove(i96Var);
                D0.L.remove(i96Var);
                D0.M.remove(i96Var.b());
                D0.O.remove(i96Var);
                D0.J.remove(i96Var);
                D0.N.remove(i96Var.b());
                new File(i96Var.d).delete();
                D0.a1();
                d0();
                ArrayList arrayList = this.e;
                if (arrayList != null) {
                    arrayList.remove(i96Var);
                }
                ix5 ix5Var = this.a;
                if (ix5Var != null) {
                    ix5Var.f();
                }
                ix5 ix5Var2 = this.c;
                if (ix5Var2 != null) {
                    ix5Var2.f();
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(int i, View view) {
        boolean z;
        i96 i96Var;
        try {
            if (getParentActivity() != null && this.parentLayout != null && (view instanceof yhb)) {
                if (this.b.getAdapter() == this.c) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i -= this.r;
                }
                if (z) {
                    i96Var = (i96) this.e.get(i);
                } else if (!this.h.isEmpty() && i >= 0 && i < this.h.size()) {
                    i96Var = (i96) this.h.get(i);
                } else {
                    if (!this.h.isEmpty()) {
                        i -= this.h.size() + 1;
                    }
                    i96Var = (i96) this.f.get(i);
                }
                if (i96Var != null && i96Var.d != null && (!i96Var.i() || i96Var.k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = k96.M0(2131751519, null);
                    hdVar.U = gl.S2(k96.a0("DeleteLocalizationText", null, 2131751520, i96Var.a));
                    alertDialog$Builder.j(k96.M0(2131751586, null), new h45(this, i96Var, (byte) 5));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    showDialog(hdVar);
                    TextView textView = (TextView) hdVar.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, null);
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            fa4.g(e, true);
            return true;
        }
    }

    public final void k0() {
        if (!this.isPaused) {
            m0();
        }
    }

    public final void l0(String str) {
        if (str == null) {
            this.e = null;
            if (this.b != null) {
                this.d.setVisibility(8);
                this.b.setAdapter(this.a);
                return;
            }
            return;
        }
        Utilities.g.c(new hb5(this, str, (byte) 20));
    }

    public final void m0() {
        if (this.simpleActionBar != null) {
            String M0 = k96.M0(2131748862, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.I(M0, true, 350L, s33.h);
            }
        }
        ix5 ix5Var = this.a;
        if (ix5Var != null) {
            ix5Var.l(0, ix5Var.b());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        k96 D0 = k96.D0();
        int i = this.currentAccount;
        ex5 ex5Var = new ex5(this, (byte) 0);
        String j0 = k96.j0();
        if (na7.q1(i).k4.t1.f() > 0) {
            SharedPreferences c1 = na7.c1();
            if (!c1.getBoolean("langpack_patched" + j0, false) && !D0.Q) {
                D0.Q = true;
                D0.Z0(i, null, true, new b96(D0, j0, ex5Var, (byte) 0));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        d0();
        k96.D0().V0(this.currentAccount, false);
        kk7.e().b(this, kk7.A4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.e().n(this, kk7.A4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ix5 ix5Var = this.a;
        if (ix5Var != null) {
            ix5Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
