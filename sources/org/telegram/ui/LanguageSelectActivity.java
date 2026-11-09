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
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public m60 f41254a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.qj0 f41255b;
    public m60 f41256c;
    public org.telegram.ui.Components.jy d;
    private int doNotTranslatePosition;
    public ArrayList f41257e;
    public ArrayList f41258f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f41259n;
    public int f41260r;

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
        boolean z9;
        org.telegram.messenger.fd fdVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.b9)) {
                if (languageSelectActivity.f41255b.getAdapter() == languageSelectActivity.f41256c) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    i7 -= languageSelectActivity.f41260r;
                }
                if (z9) {
                    fdVar = (org.telegram.messenger.fd) languageSelectActivity.f41257e.get(i7);
                } else if (!languageSelectActivity.h.isEmpty() && i7 >= 0 && i7 < languageSelectActivity.h.size()) {
                    fdVar = (org.telegram.messenger.fd) languageSelectActivity.h.get(i7);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i7 -= languageSelectActivity.h.size() + 1;
                    }
                    fdVar = (org.telegram.messenger.fd) languageSelectActivity.f41258f.get(i7);
                }
                if (fdVar != null && fdVar.d != null && (!fdVar.i() || fdVar.f22404k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = org.telegram.messenger.id.M0(2131751531, null);
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("DeleteLocalizationText", null, 2131751532, fdVar.f22396a));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ru(9, languageSelectActivity, fdVar));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    languageSelectActivity.showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
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
        languageSelectActivity.simpleActionBar.k(true);
        languageSelectActivity.n0();
    }

    public static void c0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.fd fdVar) {
        org.telegram.messenger.fd fdVar2;
        org.telegram.messenger.id E0 = org.telegram.messenger.id.E0();
        int i7 = languageSelectActivity.currentAccount;
        if (fdVar.d != null) {
            if (!fdVar.i() || fdVar.f22404k == Integer.MAX_VALUE) {
                if (E0.B == fdVar) {
                    if (E0.f23186z.getLanguage() != null) {
                        fdVar2 = E0.G0(E0.f23186z.getLanguage());
                    } else {
                        fdVar2 = null;
                    }
                    if (fdVar2 == null) {
                        fdVar2 = E0.G0(org.telegram.messenger.id.I0(E0.f23186z));
                    }
                    if (fdVar2 == null) {
                        fdVar2 = E0.G0("en");
                    }
                    E0.d(fdVar2, true, false, i7);
                }
                E0.K.remove(fdVar);
                E0.L.remove(fdVar);
                E0.M.remove(fdVar.b());
                E0.O.remove(fdVar);
                E0.J.remove(fdVar);
                E0.N.remove(fdVar.b());
                new File(fdVar.d).delete();
                E0.a1();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.f41257e;
                if (arrayList != null) {
                    arrayList.remove(fdVar);
                }
                m60 m60Var = languageSelectActivity.f41254a;
                if (m60Var != null) {
                    m60Var.f();
                }
                m60 m60Var2 = languageSelectActivity.f41256c;
                if (m60Var2 != null) {
                    m60Var2.f();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131749054, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 10));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.p().b(0, 2131232486);
        b10.N();
        b10.B0 = new kg.v1(this, 14);
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        this.f41254a = new m60(this, context, false, 0);
        this.f41256c = new m60(this, context, true, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.d = jyVar;
        jyVar.setText(org.telegram.messenger.id.M0(2131748167, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f41255b = qj0Var;
        qj0Var.r1();
        this.f41255b.setEmptyView(this.d);
        this.f41255b.setLayoutManager(new v4.b0(1, false));
        this.f41255b.setSectionsDrawBackground(true);
        this.f41255b.setVerticalScrollBarEnabled(false);
        this.f41255b.setAdapter(this.f41254a);
        l60 l60Var = new l60(this);
        l60Var.n(400L);
        l60Var.C = false;
        l60Var.o(org.telegram.ui.Components.xq.h);
        this.f41255b.setItemAnimator(l60Var);
        frameLayout.addView(this.f41255b, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.f41255b.setOnItemClickListener(new h(this, 16));
        this.f41255b.setOnItemLongClickListener(new yr(this, 15));
        this.f41255b.setOnScrollListener(new g3(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25115y4 && this.f41254a != null) {
            j0();
            org.telegram.messenger.g0.h3(new h60(this, 2));
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f41255b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27848c7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f41255b, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Ai));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ps psVar = new ps(org.telegram.messenger.id.E0().B, 2);
        this.f41258f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.id.E0().K);
        ArrayList arrayList = org.telegram.messenger.id.E0().J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) arrayList.get(i7);
            if (fdVar.f22404k != Integer.MAX_VALUE) {
                this.f41258f.add(fdVar);
            } else {
                this.h.add(fdVar);
            }
        }
        Collections.sort(this.f41258f, psVar);
        Collections.sort(this.h, psVar);
    }

    public final boolean k0() {
        return getMessagesController().f24896s7.u();
    }

    public final boolean l0() {
        return getMessagesController().f24896s7.s();
    }

    public final void m0(String str) {
        if (str == null) {
            this.f41257e = null;
            if (this.f41255b != null) {
                this.d.setVisibility(8);
                this.f41255b.setAdapter(this.f41254a);
                return;
            }
            return;
        }
        Utilities.f21338g.c(new s10(8, this, str));
    }

    public final void n0() {
        if (this.simpleActionBar != null) {
            String M0 = org.telegram.messenger.id.M0(2131749054, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.B(M0, true, 350L, org.telegram.ui.Components.xq.h);
            }
        }
        m60 m60Var = this.f41254a;
        if (m60Var != null) {
            m60Var.k(0, m60Var.b());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.id E0 = org.telegram.messenger.id.E0();
        int i7 = this.currentAccount;
        h60 h60Var = new h60(this, 0);
        String j02 = org.telegram.messenger.id.j0();
        if (org.telegram.messenger.qp.s1(i7).f24961z7 > 0) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("langpack_patched" + j02, false) && !E0.Q) {
                E0.Q = true;
                E0.Z0(i7, null, true, new org.telegram.messenger.xc(E0, j02, h60Var, 0));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.id.E0().V0(this.currentAccount, false);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25115y4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25115y4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        m60 m60Var = this.f41254a;
        if (m60Var != null) {
            m60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
