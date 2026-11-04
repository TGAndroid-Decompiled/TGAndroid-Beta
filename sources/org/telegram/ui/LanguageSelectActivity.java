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
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public e60 f41276a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.tj0 f41277b;
    public e60 f41278c;
    public org.telegram.ui.Components.gy d;
    private int doNotTranslatePosition;
    public ArrayList f41279e;
    public ArrayList f41280f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f41281n;
    public int f41282r;

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    public static void Z(org.telegram.ui.LanguageSelectActivity r12, android.view.View r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LanguageSelectActivity.Z(org.telegram.ui.LanguageSelectActivity, android.view.View, int):void");
    }

    public static boolean a0(LanguageSelectActivity languageSelectActivity, View view, int i3) {
        boolean z10;
        org.telegram.messenger.yc ycVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.a9)) {
                if (languageSelectActivity.f41277b.getAdapter() == languageSelectActivity.f41278c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i3 -= languageSelectActivity.f41282r;
                }
                if (z10) {
                    ycVar = (org.telegram.messenger.yc) languageSelectActivity.f41279e.get(i3);
                } else if (!languageSelectActivity.h.isEmpty() && i3 >= 0 && i3 < languageSelectActivity.h.size()) {
                    ycVar = (org.telegram.messenger.yc) languageSelectActivity.h.get(i3);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i3 -= languageSelectActivity.h.size() + 1;
                    }
                    ycVar = (org.telegram.messenger.yc) languageSelectActivity.f41280f.get(i3);
                }
                if (ycVar != null && ycVar.d != null && (!ycVar.i() || ycVar.f26569k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = org.telegram.messenger.bd.M0(2131751532, null);
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("DeleteLocalizationText", null, 2131751533, ycVar.f26561a));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.Components.i41(19, languageSelectActivity, ycVar));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    languageSelectActivity.showDialog(s1Var);
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
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
        languageSelectActivity.simpleActionBar.j(true);
        languageSelectActivity.n0();
    }

    public static void c0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.yc ycVar) {
        org.telegram.messenger.yc ycVar2;
        org.telegram.messenger.bd E0 = org.telegram.messenger.bd.E0();
        int i3 = languageSelectActivity.currentAccount;
        if (ycVar.d != null) {
            if (!ycVar.i() || ycVar.f26569k == Integer.MAX_VALUE) {
                if (E0.B == ycVar) {
                    if (E0.f21813z.getLanguage() != null) {
                        ycVar2 = E0.G0(E0.f21813z.getLanguage());
                    } else {
                        ycVar2 = null;
                    }
                    if (ycVar2 == null) {
                        ycVar2 = E0.G0(org.telegram.messenger.bd.I0(E0.f21813z));
                    }
                    if (ycVar2 == null) {
                        ycVar2 = E0.G0("en");
                    }
                    E0.d(ycVar2, true, false, i3);
                }
                E0.K.remove(ycVar);
                E0.L.remove(ycVar);
                E0.M.remove(ycVar.b());
                E0.O.remove(ycVar);
                E0.J.remove(ycVar);
                E0.N.remove(ycVar.b());
                new File(ycVar.d).delete();
                E0.a1();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.f41279e;
                if (arrayList != null) {
                    arrayList.remove(ycVar);
                }
                e60 e60Var = languageSelectActivity.f41276a;
                if (e60Var != null) {
                    e60Var.f();
                }
                e60 e60Var2 = languageSelectActivity.f41278c;
                if (e60Var2 != null) {
                    e60Var2.f();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131749062, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 11));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
        b10.N();
        b10.C0 = new lg.w1(this, 14);
        b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.f41276a = new e60(this, context, false, 0);
        this.f41278c = new e60(this, context, true, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.d = gyVar;
        gyVar.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f41277b = tj0Var;
        tj0Var.r1();
        this.f41277b.setEmptyView(this.d);
        this.f41277b.setLayoutManager(new u4.b0(1, false));
        this.f41277b.setSectionsDrawBackground(true);
        this.f41277b.setVerticalScrollBarEnabled(false);
        this.f41277b.setAdapter(this.f41276a);
        d60 d60Var = new d60(this);
        d60Var.n(400L);
        d60Var.C = false;
        d60Var.o(org.telegram.ui.Components.xq.h);
        this.f41277b.setItemAnimator(d60Var);
        frameLayout.addView(this.f41277b, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        this.f41277b.setOnItemClickListener(new h(this, 16));
        this.f41277b.setOnItemLongClickListener(new ur(this, 15));
        this.f41277b.setOnScrollListener(new h3(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23344y4 && this.f41276a != null) {
            j0();
            org.telegram.messenger.g0.h3(new z50(this, 2));
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41277b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41277b, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ai));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ls lsVar = new ls(org.telegram.messenger.bd.E0().B, 2);
        this.f41280f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.bd.E0().K);
        ArrayList arrayList = org.telegram.messenger.bd.E0().J;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) arrayList.get(i3);
            if (ycVar.f26569k != Integer.MAX_VALUE) {
                this.f41280f.add(ycVar);
            } else {
                this.h.add(ycVar);
            }
        }
        Collections.sort(this.f41280f, lsVar);
        Collections.sort(this.h, lsVar);
    }

    public final boolean k0() {
        return getMessagesController().f23120s7.u();
    }

    public final boolean l0() {
        return getMessagesController().f23120s7.s();
    }

    public final void m0(String str) {
        if (str == null) {
            this.f41279e = null;
            if (this.f41277b != null) {
                this.d.setVisibility(8);
                this.f41277b.setAdapter(this.f41276a);
                return;
            }
            return;
        }
        Utilities.f21389g.c(new ly(13, this, str));
    }

    public final void n0() {
        if (this.simpleActionBar != null) {
            String M0 = org.telegram.messenger.bd.M0(2131749062, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.A(M0, true, 350L, org.telegram.ui.Components.xq.h);
            }
        }
        e60 e60Var = this.f41276a;
        if (e60Var != null) {
            e60Var.k(0, e60Var.b());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.bd E0 = org.telegram.messenger.bd.E0();
        int i3 = this.currentAccount;
        z50 z50Var = new z50(this, 0);
        String j02 = org.telegram.messenger.bd.j0();
        if (org.telegram.messenger.hp.s1(i3).f23186z7 > 0) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (!e12.getBoolean("langpack_patched" + j02, false) && !E0.Q) {
                E0.Q = true;
                E0.Z0(i3, null, true, new org.telegram.messenger.qc(E0, j02, z50Var, 0));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.bd.E0().V0(this.currentAccount, false);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23344y4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23344y4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        e60 e60Var = this.f41276a;
        if (e60Var != null) {
            e60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
