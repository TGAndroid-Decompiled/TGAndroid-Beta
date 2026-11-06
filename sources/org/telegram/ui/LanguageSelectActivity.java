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
    public k60 f41219a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.pj0 f41220b;
    public k60 f41221c;
    public org.telegram.ui.Components.iy d;
    private int doNotTranslatePosition;
    public ArrayList f41222e;
    public ArrayList f41223f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f41224n;
    public int f41225r;

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
        org.telegram.messenger.ed edVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.b9)) {
                if (languageSelectActivity.f41220b.getAdapter() == languageSelectActivity.f41221c) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    i7 -= languageSelectActivity.f41225r;
                }
                if (z9) {
                    edVar = (org.telegram.messenger.ed) languageSelectActivity.f41222e.get(i7);
                } else if (!languageSelectActivity.h.isEmpty() && i7 >= 0 && i7 < languageSelectActivity.h.size()) {
                    edVar = (org.telegram.messenger.ed) languageSelectActivity.h.get(i7);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i7 -= languageSelectActivity.h.size() + 1;
                    }
                    edVar = (org.telegram.messenger.ed) languageSelectActivity.f41223f.get(i7);
                }
                if (edVar != null && edVar.d != null && (!edVar.i() || edVar.f22182k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = org.telegram.messenger.hd.M0(2131751532, null);
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("DeleteLocalizationText", null, 2131751533, edVar.f22174a));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new pu(9, languageSelectActivity, edVar));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    languageSelectActivity.showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
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

    public static void c0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.ed edVar) {
        org.telegram.messenger.ed edVar2;
        org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
        int i7 = languageSelectActivity.currentAccount;
        if (edVar.d != null) {
            if (!edVar.i() || edVar.f22182k == Integer.MAX_VALUE) {
                if (E0.B == edVar) {
                    if (E0.f22900z.getLanguage() != null) {
                        edVar2 = E0.G0(E0.f22900z.getLanguage());
                    } else {
                        edVar2 = null;
                    }
                    if (edVar2 == null) {
                        edVar2 = E0.G0(org.telegram.messenger.hd.I0(E0.f22900z));
                    }
                    if (edVar2 == null) {
                        edVar2 = E0.G0("en");
                    }
                    E0.d(edVar2, true, false, i7);
                }
                E0.K.remove(edVar);
                E0.L.remove(edVar);
                E0.M.remove(edVar.b());
                E0.O.remove(edVar);
                E0.J.remove(edVar);
                E0.N.remove(edVar.b());
                new File(edVar.d).delete();
                E0.a1();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.f41222e;
                if (arrayList != null) {
                    arrayList.remove(edVar);
                }
                k60 k60Var = languageSelectActivity.f41219a;
                if (k60Var != null) {
                    k60Var.f();
                }
                k60 k60Var2 = languageSelectActivity.f41221c;
                if (k60Var2 != null) {
                    k60Var2.f();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27812b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27848d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749053, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 10));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
        b10.N();
        b10.B0 = new kg.v1(this, 14);
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        this.f41219a = new k60(this, context, false, 0);
        this.f41221c = new k60(this, context, true, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.d = iyVar;
        iyVar.setText(org.telegram.messenger.hd.M0(2131748166, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f41220b = pj0Var;
        pj0Var.r1();
        this.f41220b.setEmptyView(this.d);
        this.f41220b.setLayoutManager(new v4.b0(1, false));
        this.f41220b.setSectionsDrawBackground(true);
        this.f41220b.setVerticalScrollBarEnabled(false);
        this.f41220b.setAdapter(this.f41219a);
        j60 j60Var = new j60(this);
        j60Var.n(400L);
        j60Var.C = false;
        j60Var.o(org.telegram.ui.Components.xq.h);
        this.f41220b.setItemAnimator(j60Var);
        frameLayout.addView(this.f41220b, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.f41220b.setOnItemClickListener(new h(this, 16));
        this.f41220b.setOnItemLongClickListener(new wr(this, 15));
        this.f41220b.setOnScrollListener(new g3(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25098y4 && this.f41219a != null) {
            j0();
            org.telegram.messenger.g0.h3(new f60(this, 2));
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41220b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27831c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41220b, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ai));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ns nsVar = new ns(org.telegram.messenger.hd.E0().B, 2);
        this.f41223f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.hd.E0().K);
        ArrayList arrayList = org.telegram.messenger.hd.E0().J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) arrayList.get(i7);
            if (edVar.f22182k != Integer.MAX_VALUE) {
                this.f41223f.add(edVar);
            } else {
                this.h.add(edVar);
            }
        }
        Collections.sort(this.f41223f, nsVar);
        Collections.sort(this.h, nsVar);
    }

    public final boolean k0() {
        return getMessagesController().f24881s7.u();
    }

    public final boolean l0() {
        return getMessagesController().f24881s7.s();
    }

    public final void m0(String str) {
        if (str == null) {
            this.f41222e = null;
            if (this.f41220b != null) {
                this.d.setVisibility(8);
                this.f41220b.setAdapter(this.f41219a);
                return;
            }
            return;
        }
        Utilities.f21335g.c(new q10(8, this, str));
    }

    public final void n0() {
        if (this.simpleActionBar != null) {
            String M0 = org.telegram.messenger.hd.M0(2131749053, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.A(M0, true, 350L, org.telegram.ui.Components.xq.h);
            }
        }
        k60 k60Var = this.f41219a;
        if (k60Var != null) {
            k60Var.k(0, k60Var.b());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
        int i7 = this.currentAccount;
        f60 f60Var = new f60(this, 0);
        String j02 = org.telegram.messenger.hd.j0();
        if (org.telegram.messenger.qp.s1(i7).f24946z7 > 0) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("langpack_patched" + j02, false) && !E0.Q) {
                E0.Q = true;
                E0.Z0(i7, null, true, new org.telegram.messenger.wc(E0, j02, f60Var, 0));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.hd.E0().V0(this.currentAccount, false);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25098y4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25098y4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        k60 k60Var = this.f41219a;
        if (k60Var != null) {
            k60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
