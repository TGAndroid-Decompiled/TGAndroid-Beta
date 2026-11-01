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
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public h70 f33348a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.uk0 f33349b;
    public h70 f33350c;
    public org.telegram.ui.Components.xy d;
    private int doNotTranslatePosition;
    public ArrayList e;
    public ArrayList f33351f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f33352n;
    public int f33353r;

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    public static void Z(org.telegram.ui.LanguageSelectActivity r12, android.view.View r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LanguageSelectActivity.Z(org.telegram.ui.LanguageSelectActivity, android.view.View, int):void");
    }

    public static boolean a0(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        boolean z10;
        org.telegram.messenger.ad adVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.d9)) {
                if (languageSelectActivity.f33349b.getAdapter() == languageSelectActivity.f33350c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i10 -= languageSelectActivity.f33353r;
                }
                if (z10) {
                    adVar = (org.telegram.messenger.ad) languageSelectActivity.e.get(i10);
                } else if (!languageSelectActivity.h.isEmpty() && i10 >= 0 && i10 < languageSelectActivity.h.size()) {
                    adVar = (org.telegram.messenger.ad) languageSelectActivity.h.get(i10);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    adVar = (org.telegram.messenger.ad) languageSelectActivity.f33351f.get(i10);
                }
                if (adVar != null && adVar.d != null && (!adVar.i() || adVar.f14598k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = org.telegram.messenger.dd.L0(2131751532, null);
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("DeleteLocalizationText", null, 2131751533, adVar.f14591a));
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new qv(10, languageSelectActivity, adVar));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    languageSelectActivity.showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return true;
        }
    }

    public static void b0(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.simpleActionBar.j(true);
        languageSelectActivity.o0();
    }

    public static void c0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.ad adVar) {
        org.telegram.messenger.ad adVar2;
        org.telegram.messenger.dd D0 = org.telegram.messenger.dd.D0();
        int i10 = languageSelectActivity.currentAccount;
        if (adVar.d != null) {
            if (!adVar.i() || adVar.f14598k == Integer.MAX_VALUE) {
                if (D0.B == adVar) {
                    if (D0.f15366z.getLanguage() != null) {
                        adVar2 = D0.F0(D0.f15366z.getLanguage());
                    } else {
                        adVar2 = null;
                    }
                    if (adVar2 == null) {
                        adVar2 = D0.F0(org.telegram.messenger.dd.H0(D0.f15366z));
                    }
                    if (adVar2 == null) {
                        adVar2 = D0.F0("en");
                    }
                    D0.d(adVar2, true, false, i10);
                }
                D0.K.remove(adVar);
                D0.L.remove(adVar);
                D0.M.remove(adVar.b());
                D0.O.remove(adVar);
                D0.J.remove(adVar);
                D0.N.remove(adVar.b());
                new File(adVar.d).delete();
                D0.X0();
                languageSelectActivity.k0();
                ArrayList arrayList = languageSelectActivity.e;
                if (arrayList != null) {
                    arrayList.remove(adVar);
                }
                h70 h70Var = languageSelectActivity.f33348a;
                if (h70Var != null) {
                    h70Var.f();
                }
                h70 h70Var2 = languageSelectActivity.f33350c;
                if (h70Var2 != null) {
                    h70Var2.f();
                }
            }
        }
    }

    public static void d0(LanguageSelectActivity languageSelectActivity) {
        if (!languageSelectActivity.isPaused) {
            languageSelectActivity.o0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
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
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131749064, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 1));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, 2131232485);
        b10.N();
        b10.B0 = new ag.l3(this, 14);
        b10.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        this.f33348a = new h70(this, context, false, 0);
        this.f33350c = new h70(this, context, true, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.d = xyVar;
        xyVar.setText(org.telegram.messenger.dd.L0(2131748183, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f33349b = uk0Var;
        uk0Var.r1();
        this.f33349b.setEmptyView(this.d);
        this.f33349b.setLayoutManager(new s4.a0(1, false));
        this.f33349b.setSectionsDrawBackground(true);
        this.f33349b.setVerticalScrollBarEnabled(false);
        this.f33349b.setAdapter(this.f33348a);
        g70 g70Var = new g70(this);
        g70Var.n(400L);
        g70Var.C = false;
        g70Var.o(org.telegram.ui.Components.gr.h);
        this.f33349b.setItemAnimator(g70Var);
        frameLayout.addView(this.f33349b, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        this.f33349b.setOnItemClickListener(new g(this, 16));
        this.f33349b.setOnItemLongClickListener(new st(this, 14));
        this.f33349b.setOnScrollListener(new h3(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14824y4 && this.f33348a != null) {
            k0();
            org.telegram.messenger.i0.g3(new e70(this, 2));
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f33349b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33349b, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ai));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void k0() {
        nt ntVar = new nt(org.telegram.messenger.dd.D0().B, 2);
        this.f33351f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.dd.D0().K);
        ArrayList arrayList = org.telegram.messenger.dd.D0().J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.ad adVar = (org.telegram.messenger.ad) arrayList.get(i10);
            if (adVar.f14598k != Integer.MAX_VALUE) {
                this.f33351f.add(adVar);
            } else {
                this.h.add(adVar);
            }
        }
        Collections.sort(this.f33351f, ntVar);
        Collections.sort(this.h, ntVar);
    }

    public final boolean l0() {
        return getMessagesController().f19253t7.u();
    }

    public final boolean m0() {
        return getMessagesController().f19253t7.s();
    }

    public final void n0(String str) {
        if (str == null) {
            this.e = null;
            if (this.f33349b != null) {
                this.d.setVisibility(8);
                this.f33349b.setAdapter(this.f33348a);
                return;
            }
            return;
        }
        Utilities.f14523g.c(new y60(2, this, str));
    }

    public final void o0() {
        if (this.simpleActionBar != null) {
            String L0 = org.telegram.messenger.dd.L0(2131749064, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), L0)) {
                this.simpleActionBar.B(L0, true, 350L, org.telegram.ui.Components.gr.h);
            }
        }
        h70 h70Var = this.f33348a;
        if (h70Var != null) {
            h70Var.k(0, h70Var.b());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.dd D0 = org.telegram.messenger.dd.D0();
        int i10 = this.currentAccount;
        e70 e70Var = new e70(this, 0);
        String j02 = org.telegram.messenger.dd.j0();
        if (org.telegram.messenger.wp.r1(i10).A7 > 0) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            if (!d12.getBoolean("langpack_patched" + j02, false) && !D0.Q) {
                D0.Q = true;
                D0.W0(i10, null, true, new org.telegram.messenger.xc(D0, j02, e70Var, 0));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        k0();
        org.telegram.messenger.dd.D0().S0(this.currentAccount, false);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14824y4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14824y4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        h70 h70Var = this.f33348a;
        if (h70Var != null) {
            h70Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
