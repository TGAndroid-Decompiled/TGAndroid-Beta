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
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public i70 f33341a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.tk0 f33342b;
    public i70 f33343c;
    public org.telegram.ui.Components.xy d;
    private int doNotTranslatePosition;
    public ArrayList e;
    public ArrayList f33344f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f33345n;
    public int f33346r;

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    public static void Y(org.telegram.ui.LanguageSelectActivity r12, android.view.View r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LanguageSelectActivity.Y(org.telegram.ui.LanguageSelectActivity, android.view.View, int):void");
    }

    public static boolean Z(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        boolean z10;
        org.telegram.messenger.zc zcVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.d9)) {
                if (languageSelectActivity.f33342b.getAdapter() == languageSelectActivity.f33343c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i10 -= languageSelectActivity.f33346r;
                }
                if (z10) {
                    zcVar = (org.telegram.messenger.zc) languageSelectActivity.e.get(i10);
                } else if (!languageSelectActivity.h.isEmpty() && i10 >= 0 && i10 < languageSelectActivity.h.size()) {
                    zcVar = (org.telegram.messenger.zc) languageSelectActivity.h.get(i10);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    zcVar = (org.telegram.messenger.zc) languageSelectActivity.f33344f.get(i10);
                }
                if (zcVar != null && zcVar.d != null && (!zcVar.i() || zcVar.f19502k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = org.telegram.messenger.cd.L0(2131751532, null);
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("DeleteLocalizationText", null, 2131751533, zcVar.f19495a));
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new rv(10, languageSelectActivity, zcVar));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    languageSelectActivity.showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
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

    public static void a0(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.simpleActionBar.j(true);
        languageSelectActivity.n0();
    }

    public static void b0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.zc zcVar) {
        org.telegram.messenger.zc zcVar2;
        org.telegram.messenger.cd D0 = org.telegram.messenger.cd.D0();
        int i10 = languageSelectActivity.currentAccount;
        if (zcVar.d != null) {
            if (!zcVar.i() || zcVar.f19502k == Integer.MAX_VALUE) {
                if (D0.B == zcVar) {
                    if (D0.f15004z.getLanguage() != null) {
                        zcVar2 = D0.F0(D0.f15004z.getLanguage());
                    } else {
                        zcVar2 = null;
                    }
                    if (zcVar2 == null) {
                        zcVar2 = D0.F0(org.telegram.messenger.cd.H0(D0.f15004z));
                    }
                    if (zcVar2 == null) {
                        zcVar2 = D0.F0("en");
                    }
                    D0.d(zcVar2, true, false, i10);
                }
                D0.K.remove(zcVar);
                D0.L.remove(zcVar);
                D0.M.remove(zcVar.b());
                D0.O.remove(zcVar);
                D0.J.remove(zcVar);
                D0.N.remove(zcVar.b());
                new File(zcVar.d).delete();
                D0.X0();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.e;
                if (arrayList != null) {
                    arrayList.remove(zcVar);
                }
                i70 i70Var = languageSelectActivity.f33341a;
                if (i70Var != null) {
                    i70Var.f();
                }
                i70 i70Var2 = languageSelectActivity.f33343c;
                if (i70Var2 != null) {
                    i70Var2.f();
                }
            }
        }
    }

    public static void c0(LanguageSelectActivity languageSelectActivity) {
        if (!languageSelectActivity.isPaused) {
            languageSelectActivity.n0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131749064, null));
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231242);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 1));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, 2131232485);
        b10.N();
        b10.B0 = new ag.l3(this, 14);
        b10.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        this.f33341a = new i70(this, context, false, 0);
        this.f33343c = new i70(this, context, true, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.d = xyVar;
        xyVar.setText(org.telegram.messenger.cd.L0(2131748183, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f33342b = tk0Var;
        tk0Var.r1();
        this.f33342b.setEmptyView(this.d);
        this.f33342b.setLayoutManager(new s4.a0(1, false));
        this.f33342b.setSectionsDrawBackground(true);
        this.f33342b.setVerticalScrollBarEnabled(false);
        this.f33342b.setAdapter(this.f33341a);
        h70 h70Var = new h70(this);
        h70Var.n(400L);
        h70Var.C = false;
        h70Var.o(org.telegram.ui.Components.gr.h);
        this.f33342b.setItemAnimator(h70Var);
        frameLayout.addView(this.f33342b, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        this.f33342b.setOnItemClickListener(new g(this, 16));
        this.f33342b.setOnItemLongClickListener(new tt(this, 14));
        this.f33342b.setOnScrollListener(new h3(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19728y4 && this.f33341a != null) {
            j0();
            org.telegram.messenger.i0.g3(new e70(this, 2));
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f33342b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20911c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33342b, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ai));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ot otVar = new ot(org.telegram.messenger.cd.D0().B, 2);
        this.f33344f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.cd.D0().K);
        ArrayList arrayList = org.telegram.messenger.cd.D0().J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.zc zcVar = (org.telegram.messenger.zc) arrayList.get(i10);
            if (zcVar.f19502k != Integer.MAX_VALUE) {
                this.f33344f.add(zcVar);
            } else {
                this.h.add(zcVar);
            }
        }
        Collections.sort(this.f33344f, otVar);
        Collections.sort(this.h, otVar);
    }

    public final boolean k0() {
        return getMessagesController().f18910t7.u();
    }

    public final boolean l0() {
        return getMessagesController().f18910t7.s();
    }

    public final void m0(String str) {
        if (str == null) {
            this.e = null;
            if (this.f33342b != null) {
                this.d.setVisibility(8);
                this.f33342b.setAdapter(this.f33341a);
                return;
            }
            return;
        }
        Utilities.f14522g.c(new f70(1, this, str));
    }

    public final void n0() {
        if (this.simpleActionBar != null) {
            String L0 = org.telegram.messenger.cd.L0(2131749064, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), L0)) {
                this.simpleActionBar.B(L0, true, 350L, org.telegram.ui.Components.gr.h);
            }
        }
        i70 i70Var = this.f33341a;
        if (i70Var != null) {
            i70Var.k(0, i70Var.b());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.cd D0 = org.telegram.messenger.cd.D0();
        int i10 = this.currentAccount;
        e70 e70Var = new e70(this, 0);
        String j02 = org.telegram.messenger.cd.j0();
        if (org.telegram.messenger.vp.r1(i10).A7 > 0) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (!d12.getBoolean("langpack_patched" + j02, false) && !D0.Q) {
                D0.Q = true;
                D0.W0(i10, null, true, new org.telegram.messenger.wc(D0, j02, e70Var, 0));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.cd.D0().S0(this.currentAccount, false);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19728y4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19728y4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        i70 i70Var = this.f33341a;
        if (i70Var != null) {
            i70Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
