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
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public j60 f42615a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.uj0 f42616b;
    public j60 f42617c;
    public org.telegram.ui.Components.ny d;
    private int doNotTranslatePosition;
    public ArrayList f42618e;
    public ArrayList f42619f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f42620n;
    public int f42621r;

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
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.a9)) {
                if (languageSelectActivity.f42616b.getAdapter() == languageSelectActivity.f42617c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i7 -= languageSelectActivity.f42621r;
                }
                if (z10) {
                    ddVar = (org.telegram.messenger.dd) languageSelectActivity.f42618e.get(i7);
                } else if (!languageSelectActivity.h.isEmpty() && i7 >= 0 && i7 < languageSelectActivity.h.size()) {
                    ddVar = (org.telegram.messenger.dd) languageSelectActivity.h.get(i7);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i7 -= languageSelectActivity.h.size() + 1;
                    }
                    ddVar = (org.telegram.messenger.dd) languageSelectActivity.f42619f.get(i7);
                }
                if (ddVar != null && ddVar.d != null && (!ddVar.i() || ddVar.f23074k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = org.telegram.messenger.hd.M0(2131751531, null);
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("DeleteLocalizationText", null, 2131751532, ddVar.f23066a));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new tr(13, languageSelectActivity, ddVar));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    languageSelectActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
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
        languageSelectActivity.simpleActionBar.m(true);
        languageSelectActivity.n0();
    }

    public static void c0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.dd ddVar) {
        org.telegram.messenger.dd ddVar2;
        org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
        int i7 = languageSelectActivity.currentAccount;
        if (ddVar.d != null) {
            if (!ddVar.i() || ddVar.f23074k == Integer.MAX_VALUE) {
                if (E0.B == ddVar) {
                    if (E0.f24133z.getLanguage() != null) {
                        ddVar2 = E0.G0(E0.f24133z.getLanguage());
                    } else {
                        ddVar2 = null;
                    }
                    if (ddVar2 == null) {
                        ddVar2 = E0.G0(org.telegram.messenger.hd.I0(E0.f24133z));
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
                E0.a1();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.f42618e;
                if (arrayList != null) {
                    arrayList.remove(ddVar);
                }
                j60 j60Var = languageSelectActivity.f42615a;
                if (j60Var != null) {
                    j60Var.f();
                }
                j60 j60Var2 = languageSelectActivity.f42617c;
                if (j60Var2 != null) {
                    j60Var2.f();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749054, null));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 11));
        org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(0, 2131232487);
        b10.O();
        b10.C0 = new kg.x1(this, 14);
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        this.f42615a = new j60(this, context, false, 0);
        this.f42617c = new j60(this, context, true, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.d = nyVar;
        nyVar.setText(org.telegram.messenger.hd.M0(2131748167, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f42616b = uj0Var;
        uj0Var.r1();
        this.f42616b.setEmptyView(this.d);
        this.f42616b.setLayoutManager(new v4.b0(1, false));
        this.f42616b.setSectionsDrawBackground(true);
        this.f42616b.setVerticalScrollBarEnabled(false);
        this.f42616b.setAdapter(this.f42615a);
        i60 i60Var = new i60(this);
        i60Var.n(400L);
        i60Var.C = false;
        i60Var.o(org.telegram.ui.Components.er.h);
        this.f42616b.setItemAnimator(i60Var);
        frameLayout.addView(this.f42616b, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ja.c(-1.0f, -1));
        this.f42616b.setOnItemClickListener(new h(this, 16));
        this.f42616b.setOnItemLongClickListener(new zr(this, 15));
        this.f42616b.setOnScrollListener(new g3(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25612y4 && this.f42615a != null) {
            j0();
            org.telegram.messenger.g0.h3(new e60(this, 2));
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f42616b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42616b, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Di));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        qs qsVar = new qs(org.telegram.messenger.hd.E0().B, 2);
        this.f42619f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.hd.E0().K);
        ArrayList arrayList = org.telegram.messenger.hd.E0().J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) arrayList.get(i7);
            if (ddVar.f23074k != Integer.MAX_VALUE) {
                this.f42619f.add(ddVar);
            } else {
                this.h.add(ddVar);
            }
        }
        Collections.sort(this.f42619f, qsVar);
        Collections.sort(this.h, qsVar);
    }

    public final boolean k0() {
        return getMessagesController().f25403t7.u();
    }

    public final boolean l0() {
        return getMessagesController().f25403t7.s();
    }

    public final void m0(String str) {
        if (str == null) {
            this.f42618e = null;
            if (this.f42616b != null) {
                this.d.setVisibility(8);
                this.f42616b.setAdapter(this.f42615a);
                return;
            }
            return;
        }
        Utilities.f22418g.c(new g50(4, this, str));
    }

    public final void n0() {
        if (this.simpleActionBar != null) {
            String M0 = org.telegram.messenger.hd.M0(2131749054, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), M0)) {
                this.simpleActionBar.D(M0, true, 350L, org.telegram.ui.Components.er.h);
            }
        }
        j60 j60Var = this.f42615a;
        if (j60Var != null) {
            j60Var.k(0, j60Var.b());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
        int i7 = this.currentAccount;
        e60 e60Var = new e60(this, 0);
        String j02 = org.telegram.messenger.hd.j0();
        if (org.telegram.messenger.np.s1(i7).A7 > 0) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (!e12.getBoolean("langpack_patched" + j02, false) && !E0.Q) {
                E0.Q = true;
                E0.Z0(i7, null, true, new org.telegram.messenger.vc(E0, j02, e60Var, 0));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.hd.E0().V0(this.currentAccount, false);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25612y4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25612y4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        j60 j60Var = this.f42615a;
        if (j60Var != null) {
            j60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
