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
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public iz5 a;
    private int autoTranslationPosition;
    public r59 b;
    public iz5 c;
    public r34 d;
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
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.a7));
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
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131748811, null));
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231245);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 2));
        zja a = this.simpleActionBar.t().a(0, 2131232503);
        a.N();
        a.C0 = new q20(this, (byte) 14);
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        this.a = new iz5(this, context, false, (byte) 0);
        this.c = new iz5(this, context, true, (byte) 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r34 r34Var = new r34(context, null);
        this.d = r34Var;
        r34Var.setText(jb6.M0(2131747901, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new u46(1, false));
        this.b.setSectionsDrawBackground(true);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        hz5 hz5Var = new hz5(this);
        hz5Var.n(400L);
        hz5Var.C = false;
        hz5Var.o(d53.h);
        this.b.setItemAnimator(hz5Var);
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        frameLayout.addView(this.d, qoe.c(-1.0f, -1));
        this.b.setOnItemClickListener(new kg4(this, (byte) 9));
        this.b.setOnItemLongClickListener(new wx4(this, (byte) 23));
        this.b.setOnScrollListener(new ip2(this, (byte) 23));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.C4 && this.a != null) {
            e0();
            gm.c3(new ez5(this, (byte) 2));
        }
    }

    public final void e0() {
        fz5 fz5Var = new fz5(jb6.D0().B, (byte) 0);
        this.f = new ArrayList();
        this.h = new ArrayList(jb6.D0().K);
        ArrayList arrayList = jb6.D0().J;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hb6 hb6Var = (hb6) arrayList.get(i);
            if (hb6Var.k != Integer.MAX_VALUE) {
                this.f.add(hb6Var);
            } else {
                this.h.add(hb6Var);
            }
        }
        Collections.sort(this.f, fz5Var);
        Collections.sort(this.h, fz5Var);
    }

    public final boolean f0() {
        return getMessagesController().i4.t();
    }

    public final boolean g0() {
        return getMessagesController().i4.r();
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.b, 0, new Class[]{xy5.class}, new String[]{"checkImage"}, (Drawable[]) null, (bnb) null, cmb.Ci));
        return arrayList;
    }

    public final void h0() {
        this.simpleActionBar.o(true);
        n0();
    }

    public final void i0(int i, View view) {
        boolean z;
        hb6 hb6Var;
        boolean z2;
        boolean z3;
        boolean z4;
        try {
            bjb bjbVar = null;
            if (view instanceof bjb) {
                if (!g0() && !f0()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                int i2 = this.manualTranslationPosition;
                int i3 = nm7.D1;
                if (i == i2) {
                    boolean z5 = !g0();
                    b3c b3cVar = getMessagesController().i4;
                    SharedPreferences.Editor edit = b3cVar.n.X3.edit();
                    b3cVar.s = Boolean.valueOf(z5);
                    edit.putBoolean("translate_button", z5).apply();
                    ((bjb) view).setChecked(z5);
                    nm7.f(this.currentAccount).k(i3, new Object[0]);
                } else if (i == this.autoTranslationPosition) {
                    boolean f0 = f0();
                    boolean z6 = !f0;
                    if (!f0 && !getUserConfig().p()) {
                        showDialog(new kj8((org.telegram.ui.ActionBar.d) this, 13, false));
                        return;
                    }
                    b3c b3cVar2 = getMessagesController().i4;
                    SharedPreferences.Editor edit2 = b3cVar2.n.X3.edit();
                    b3cVar2.r = Boolean.valueOf(z6);
                    edit2.putBoolean("translate_chat_button", z6).apply();
                    nm7.f(this.currentAccount).k(i3, new Object[0]);
                    ((bjb) view).setChecked(z6);
                }
                if (!g0() && !f0()) {
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
                        if (RecyclerView.R(childAt) == i4 && (childAt instanceof bjb)) {
                            bjbVar = (bjb) childAt;
                        }
                    }
                    if (bjbVar != null) {
                        bjbVar.setDivider(z4);
                    }
                    iz5 iz5Var = this.a;
                    int i6 = i4 + 1;
                    if (z4) {
                        iz5Var.i(i6);
                    } else {
                        iz5Var.s(i6);
                    }
                }
            } else if (view instanceof vkb) {
                presentFragment(new qc9());
            } else if (getParentActivity() != null && this.parentLayout != null && (view instanceof akb)) {
                if (this.b.getAdapter() == this.c) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i -= this.r;
                }
                if (z) {
                    hb6Var = (hb6) this.e.get(i);
                } else if (!this.h.isEmpty() && i >= 0 && i < this.h.size()) {
                    hb6Var = (hb6) this.h.get(i);
                } else {
                    if (!this.h.isEmpty()) {
                        i -= this.h.size() + 1;
                    }
                    hb6Var = (hb6) this.f.get(i);
                }
                hb6 hb6Var2 = hb6Var;
                if (hb6Var2 != null) {
                    hb6 hb6Var3 = jb6.D0().B;
                    if (hb6Var3 == hb6Var2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    he heVar = new he(3, null, getParentActivity());
                    if (!z2) {
                        heVar.q(500L);
                    }
                    b3c b3cVar3 = getMessagesController().i4;
                    b3cVar3.c.clear();
                    b3cVar3.e.clear();
                    int c = jb6.D0().c(hb6Var2, true, false, false, true, this.currentAccount, new np6(this, heVar, z2, (byte) 27));
                    if (c != 0) {
                        heVar.setOnCancelListener(new i11(c, (byte) 1));
                    }
                    String str = hb6Var2.f;
                    String str2 = hb6Var3.f;
                    HashSet c0 = qc9.c0();
                    HashSet hashSet = new HashSet(c0);
                    if (c0.contains(str2) && !c0.contains(str)) {
                        Collection.EL.removeIf(hashSet, new gz5(str2, (byte) 0));
                    }
                    if (str != null && !"null".equals(str)) {
                        hashSet.add(str);
                    }
                    qc9.f0(hashSet, Boolean.FALSE);
                    oc7.r1(this.currentAccount).i4.f();
                    oc7.r1(this.currentAccount).i4.h();
                    b3c.P = null;
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(hb6 hb6Var) {
        hb6 hb6Var2;
        jb6 D0 = jb6.D0();
        int i = this.currentAccount;
        if (hb6Var.d != null) {
            if (!hb6Var.i() || hb6Var.k == Integer.MAX_VALUE) {
                if (D0.B == hb6Var) {
                    if (D0.z.getLanguage() != null) {
                        hb6Var2 = D0.F0(D0.z.getLanguage());
                    } else {
                        hb6Var2 = null;
                    }
                    if (hb6Var2 == null) {
                        hb6Var2 = D0.F0(jb6.H0(D0.z));
                    }
                    if (hb6Var2 == null) {
                        hb6Var2 = D0.F0("en");
                    }
                    D0.d(hb6Var2, true, false, i);
                }
                D0.K.remove(hb6Var);
                D0.L.remove(hb6Var);
                D0.M.remove(hb6Var.b());
                D0.O.remove(hb6Var);
                D0.J.remove(hb6Var);
                D0.N.remove(hb6Var.b());
                new File(hb6Var.d).delete();
                D0.a1();
                e0();
                ArrayList arrayList = this.e;
                if (arrayList != null) {
                    arrayList.remove(hb6Var);
                }
                iz5 iz5Var = this.a;
                if (iz5Var != null) {
                    iz5Var.f();
                }
                iz5 iz5Var2 = this.c;
                if (iz5Var2 != null) {
                    iz5Var2.f();
                }
            }
        }
    }

    public final boolean k0(int i, View view) {
        boolean z;
        hb6 hb6Var;
        try {
            if (getParentActivity() != null && this.parentLayout != null && (view instanceof akb)) {
                if (this.b.getAdapter() == this.c) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i -= this.r;
                }
                if (z) {
                    hb6Var = (hb6) this.e.get(i);
                } else if (!this.h.isEmpty() && i >= 0 && i < this.h.size()) {
                    hb6Var = (hb6) this.h.get(i);
                } else {
                    if (!this.h.isEmpty()) {
                        i -= this.h.size() + 1;
                    }
                    hb6Var = (hb6) this.f.get(i);
                }
                if (hb6Var != null && hb6Var.d != null && (!hb6Var.i() || hb6Var.k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    he heVar = alertDialog$Builder.a;
                    heVar.S = jb6.M0(2131751468, null);
                    heVar.U = gm.S2(jb6.a0("DeleteLocalizationText", null, 2131751469, hb6Var.a));
                    alertDialog$Builder.j(jb6.M0(2131751535, null), new nv4(this, hb6Var, (byte) 6));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    showDialog(heVar);
                    TextView textView = (TextView) heVar.c(-1);
                    if (textView != null) {
                        anb.X(textView, cmb.p7, null);
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            fc4.g(e, true);
            return true;
        }
    }

    public final void l0() {
        if (!this.isPaused) {
            n0();
        }
    }

    public final void m0(String str) {
        if (str == null) {
            this.e = null;
            if (this.b != null) {
                this.d.setVisibility(8);
                this.b.setAdapter(this.a);
                return;
            }
            return;
        }
        Utilities.g.c(new fd5(this, str, (byte) 21));
    }

    public final void n0() {
        if (this.simpleActionBar != null) {
            String M0 = jb6.M0(2131748811, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.I(M0, true, 350L, d53.h);
            }
        }
        iz5 iz5Var = this.a;
        if (iz5Var != null) {
            iz5Var.l(0, iz5Var.b());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        jb6 D0 = jb6.D0();
        int i = this.currentAccount;
        ez5 ez5Var = new ez5(this, (byte) 0);
        String j0 = jb6.j0();
        if (oc7.r1(i).l4.t1.f() > 0) {
            SharedPreferences d1 = oc7.d1();
            if (!d1.getBoolean("langpack_patched" + j0, false) && !D0.Q) {
                D0.Q = true;
                D0.Z0(i, null, true, new ab6(D0, j0, ez5Var, (byte) 0));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        e0();
        jb6.D0().V0(this.currentAccount, false);
        nm7.e().b(this, nm7.C4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.e().n(this, nm7.C4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        iz5 iz5Var = this.a;
        if (iz5Var != null) {
            iz5Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
