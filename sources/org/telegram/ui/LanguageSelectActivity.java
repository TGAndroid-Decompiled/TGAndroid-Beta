package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public l60 f43105a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.ek0 f43106b;
    public l60 f43107c;
    public org.telegram.ui.Components.vy d;
    private int doNotTranslatePosition;
    public ArrayList f43108e;
    public ArrayList f43109f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f43110n;
    public int f43111r;

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    public static void Z(org.telegram.ui.LanguageSelectActivity r12, android.view.View r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LanguageSelectActivity.Z(org.telegram.ui.LanguageSelectActivity, android.view.View, int):void");
    }

    public static boolean a0(LanguageSelectActivity languageSelectActivity, View view, int i7) {
        boolean z10;
        org.telegram.messenger.dd ddVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.c9)) {
                if (languageSelectActivity.f43106b.getAdapter() == languageSelectActivity.f43107c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i7 -= languageSelectActivity.f43111r;
                }
                if (z10) {
                    ddVar = (org.telegram.messenger.dd) languageSelectActivity.f43108e.get(i7);
                } else if (!languageSelectActivity.h.isEmpty() && i7 >= 0 && i7 < languageSelectActivity.h.size()) {
                    ddVar = (org.telegram.messenger.dd) languageSelectActivity.h.get(i7);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i7 -= languageSelectActivity.h.size() + 1;
                    }
                    ddVar = (org.telegram.messenger.dd) languageSelectActivity.f43109f.get(i7);
                }
                if (ddVar != null && ddVar.d != null && (!ddVar.i() || ddVar.f23537k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.S = org.telegram.messenger.hd.N0(2131751519, null);
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("DeleteLocalizationText", null, 2131751520, ddVar.f23529a));
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new at(12, languageSelectActivity, ddVar));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    languageSelectActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return true;
        }
    }

    public static void b0(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.simpleActionBar.o(true);
        languageSelectActivity.n0();
    }

    public static void c0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.dd ddVar) {
        org.telegram.messenger.dd ddVar2;
        org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
        int i7 = languageSelectActivity.currentAccount;
        if (ddVar.d != null) {
            if (!ddVar.i() || ddVar.f23537k == Integer.MAX_VALUE) {
                if (E0.B == ddVar) {
                    if (E0.f24473z.getLanguage() != null) {
                        ddVar2 = E0.G0(E0.f24473z.getLanguage());
                    } else {
                        ddVar2 = null;
                    }
                    if (ddVar2 == null) {
                        ddVar2 = E0.G0(org.telegram.messenger.hd.I0(E0.f24473z));
                    }
                    if (ddVar2 == null) {
                        ddVar2 = E0.G0("en");
                    }
                    E0.d(ddVar2, true, false, i7);
                }
                E0.K.remove(ddVar);
                E0.L.remove(ddVar);
                E0.M.remove(ddVar.b());
                E0.O.remove(ddVar);
                E0.J.remove(ddVar);
                E0.N.remove(ddVar.b());
                new File(ddVar.d).delete();
                E0.b1();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.f43108e;
                if (arrayList != null) {
                    arrayList.remove(ddVar);
                }
                l60 l60Var = languageSelectActivity.f43105a;
                if (l60Var != null) {
                    l60Var.f();
                }
                l60 l60Var2 = languageSelectActivity.f43107c;
                if (l60Var2 != null) {
                    l60Var2.f();
                }
            }
        }
    }

    public static void d0(LanguageSelectActivity languageSelectActivity) {
        if (!languageSelectActivity.isPaused) {
            languageSelectActivity.n0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748861, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 13));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131232488);
        b10.O();
        b10.C0 = new bi.w1(this, 15);
        b10.setSearchFieldHint(org.telegram.messenger.hd.N0(2131745640, null));
        this.f43105a = new l60(this, context, false, 0);
        this.f43107c = new l60(this, context, true, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.d = vyVar;
        vyVar.setText(org.telegram.messenger.hd.N0(2131747974, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43106b = ek0Var;
        ek0Var.r1();
        this.f43106b.setEmptyView(this.d);
        this.f43106b.setLayoutManager(new v4.c0(1, false));
        this.f43106b.setSectionsDrawBackground(true);
        this.f43106b.setVerticalScrollBarEnabled(false);
        this.f43106b.setAdapter(this.f43105a);
        k60 k60Var = new k60(this);
        k60Var.n(400L);
        k60Var.C = false;
        k60Var.o(org.telegram.ui.Components.nr.h);
        this.f43106b.setItemAnimator(k60Var);
        frameLayout.addView(this.f43106b, c8.ma.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        this.f43106b.setOnItemClickListener(new h(this, 16));
        this.f43106b.setOnItemLongClickListener(new zr(this, 15));
        this.f43106b.setOnScrollListener(new g3(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.B4 && this.f43105a != null) {
            j0();
            org.telegram.messenger.g0.g3(new g60(this, 2));
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43106b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29364c7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43106b, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Di));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        qs qsVar = new qs(org.telegram.messenger.hd.E0().B, 2);
        this.f43109f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.hd.E0().K);
        ArrayList arrayList = org.telegram.messenger.hd.E0().J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) arrayList.get(i7);
            if (ddVar.f23537k != Integer.MAX_VALUE) {
                this.f43109f.add(ddVar);
            } else {
                this.h.add(ddVar);
            }
        }
        Collections.sort(this.f43109f, qsVar);
        Collections.sort(this.h, qsVar);
    }

    public final boolean k0() {
        return getMessagesController().f25986v7.u();
    }

    public final boolean l0() {
        return getMessagesController().f25986v7.s();
    }

    public final void m0(String str) {
        if (str == null) {
            this.f43108e = null;
            if (this.f43106b != null) {
                this.d.setVisibility(8);
                this.f43106b.setAdapter(this.f43105a);
                return;
            }
            return;
        }
        Utilities.f22812g.c(new h60(1, this, str));
    }

    public final void n0() {
        if (this.simpleActionBar != null) {
            String N0 = org.telegram.messenger.hd.N0(2131748861, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), N0)) {
                this.simpleActionBar.I(N0, true, 350L, org.telegram.ui.Components.nr.h);
            }
        }
        l60 l60Var = this.f43105a;
        if (l60Var != null) {
            l60Var.k(0, l60Var.b());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
        int i7 = this.currentAccount;
        g60 g60Var = new g60(this, 0);
        String j02 = org.telegram.messenger.hd.j0();
        if (org.telegram.messenger.np.u1(i7).C7 > 0) {
            SharedPreferences g12 = org.telegram.messenger.np.g1();
            if (!g12.getBoolean("langpack_patched" + j02, false) && !E0.Q) {
                E0.Q = true;
                E0.a1(i7, null, true, new org.telegram.messenger.vc(E0, j02, g60Var, 0));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.hd.E0().W0(this.currentAccount, false);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.B4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.B4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        l60 l60Var = this.f43105a;
        if (l60Var != null) {
            l60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
