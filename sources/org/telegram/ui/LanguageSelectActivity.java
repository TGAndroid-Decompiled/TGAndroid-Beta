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
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public k60 f43180a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.ek0 f43181b;
    public k60 f43182c;
    public org.telegram.ui.Components.sy d;
    private int doNotTranslatePosition;
    public ArrayList f43183e;
    public ArrayList f43184f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f43185n;
    public int f43186r;

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
        org.telegram.messenger.cd cdVar;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.b9)) {
                if (languageSelectActivity.f43181b.getAdapter() == languageSelectActivity.f43182c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i7 -= languageSelectActivity.f43186r;
                }
                if (z10) {
                    cdVar = (org.telegram.messenger.cd) languageSelectActivity.f43183e.get(i7);
                } else if (!languageSelectActivity.h.isEmpty() && i7 >= 0 && i7 < languageSelectActivity.h.size()) {
                    cdVar = (org.telegram.messenger.cd) languageSelectActivity.h.get(i7);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i7 -= languageSelectActivity.h.size() + 1;
                    }
                    cdVar = (org.telegram.messenger.cd) languageSelectActivity.f43184f.get(i7);
                }
                if (cdVar != null && cdVar.d != null && (!cdVar.i() || cdVar.f23451k == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = org.telegram.messenger.gd.N0(2131751519, null);
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("DeleteLocalizationText", null, 2131751520, cdVar.f23443a));
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new zs(12, languageSelectActivity, cdVar));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    languageSelectActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
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

    public static void c0(LanguageSelectActivity languageSelectActivity, org.telegram.messenger.cd cdVar) {
        org.telegram.messenger.cd cdVar2;
        org.telegram.messenger.gd E0 = org.telegram.messenger.gd.E0();
        int i7 = languageSelectActivity.currentAccount;
        if (cdVar.d != null) {
            if (!cdVar.i() || cdVar.f23451k == Integer.MAX_VALUE) {
                if (E0.B == cdVar) {
                    if (E0.f24343z.getLanguage() != null) {
                        cdVar2 = E0.G0(E0.f24343z.getLanguage());
                    } else {
                        cdVar2 = null;
                    }
                    if (cdVar2 == null) {
                        cdVar2 = E0.G0(org.telegram.messenger.gd.I0(E0.f24343z));
                    }
                    if (cdVar2 == null) {
                        cdVar2 = E0.G0("en");
                    }
                    E0.d(cdVar2, true, false, i7);
                }
                E0.K.remove(cdVar);
                E0.L.remove(cdVar);
                E0.M.remove(cdVar.b());
                E0.O.remove(cdVar);
                E0.J.remove(cdVar);
                E0.N.remove(cdVar.b());
                new File(cdVar.d).delete();
                E0.b1();
                languageSelectActivity.j0();
                ArrayList arrayList = languageSelectActivity.f43183e;
                if (arrayList != null) {
                    arrayList.remove(cdVar);
                }
                k60 k60Var = languageSelectActivity.f43180a;
                if (k60Var != null) {
                    k60Var.f();
                }
                k60 k60Var2 = languageSelectActivity.f43182c;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748861, null));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 13));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131232491);
        b10.O();
        b10.C0 = new bi.x1(this, 15);
        b10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        this.f43180a = new k60(this, context, false, 0);
        this.f43182c = new k60(this, context, true, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.d = syVar;
        syVar.setText(org.telegram.messenger.gd.N0(2131747974, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43181b = ek0Var;
        ek0Var.r1();
        this.f43181b.setEmptyView(this.d);
        this.f43181b.setLayoutManager(new v4.c0(1, false));
        this.f43181b.setSectionsDrawBackground(true);
        this.f43181b.setVerticalScrollBarEnabled(false);
        this.f43181b.setAdapter(this.f43180a);
        j60 j60Var = new j60(this);
        j60Var.n(400L);
        j60Var.C = false;
        j60Var.o(org.telegram.ui.Components.kr.h);
        this.f43181b.setItemAnimator(j60Var);
        frameLayout.addView(this.f43181b, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.na.c(-1.0f, -1));
        this.f43181b.setOnItemClickListener(new h(this, 16));
        this.f43181b.setOnItemLongClickListener(new zr(this, 15));
        this.f43181b.setOnScrollListener(new g3(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.B4 && this.f43180a != null) {
            j0();
            org.telegram.messenger.g0.g3(new g60(this, 2));
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43181b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29434c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43181b, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Di));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        qs qsVar = new qs(org.telegram.messenger.gd.E0().B, 2);
        this.f43184f = new ArrayList();
        this.h = new ArrayList(org.telegram.messenger.gd.E0().K);
        ArrayList arrayList = org.telegram.messenger.gd.E0().J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) arrayList.get(i7);
            if (cdVar.f23451k != Integer.MAX_VALUE) {
                this.f43184f.add(cdVar);
            } else {
                this.h.add(cdVar);
            }
        }
        Collections.sort(this.f43184f, qsVar);
        Collections.sort(this.h, qsVar);
    }

    public final boolean k0() {
        return getMessagesController().f25882v7.u();
    }

    public final boolean l0() {
        return getMessagesController().f25882v7.s();
    }

    public final void m0(String str) {
        if (str == null) {
            this.f43183e = null;
            if (this.f43181b != null) {
                this.d.setVisibility(8);
                this.f43181b.setAdapter(this.f43180a);
                return;
            }
            return;
        }
        Utilities.f22879g.c(new i50(5, this, str));
    }

    public final void n0() {
        if (this.simpleActionBar != null) {
            String N0 = org.telegram.messenger.gd.N0(2131748861, null);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), N0)) {
                this.simpleActionBar.H(N0, true, 350L, org.telegram.ui.Components.kr.h);
            }
        }
        k60 k60Var = this.f43180a;
        if (k60Var != null) {
            k60Var.k(0, k60Var.b());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.gd E0 = org.telegram.messenger.gd.E0();
        int i7 = this.currentAccount;
        g60 g60Var = new g60(this, 0);
        String j02 = org.telegram.messenger.gd.j0();
        if (org.telegram.messenger.mp.u1(i7).C7 > 0) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("langpack_patched" + j02, false) && !E0.Q) {
                E0.Q = true;
                E0.a1(i7, null, true, new org.telegram.messenger.uc(E0, j02, g60Var, 0));
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        j0();
        org.telegram.messenger.gd.E0().W0(this.currentAccount, false);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.B4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.B4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        k60 k60Var = this.f43180a;
        if (k60Var != null) {
            k60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
