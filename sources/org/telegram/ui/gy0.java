package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.Utilities;
public final class gy0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public static boolean f45729s;
    public static HashSet f45730w;
    public e60 f45731a;
    public org.telegram.ui.Components.tj0 f45732b;
    public e60 f45733c;
    public org.telegram.ui.Components.gy d;
    public int f45734e;
    public ArrayList f45735f;
    public ArrayList h;
    public HashSet f45736n;
    public HashSet f45737r;

    public gy0() {
        super(null);
        this.f45734e = -1;
    }

    public static void Z(gy0 gy0Var, View view, int i3) {
        boolean z10;
        org.telegram.messenger.q00 q00Var;
        ArrayList arrayList;
        if (gy0Var.getParentActivity() != null && gy0Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.r8)) {
            int i10 = 0;
            if (gy0Var.f45732b.getAdapter() == gy0Var.f45733c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (arrayList = gy0Var.f45735f) != null) {
                q00Var = (org.telegram.messenger.q00) arrayList.get(i3);
            } else {
                int i11 = gy0Var.f45734e;
                if (i11 >= 0 && i3 > i11) {
                    i3--;
                }
                if (i3 >= 0 && i3 < gy0Var.h.size()) {
                    q00Var = (org.telegram.messenger.q00) gy0Var.h.get(i3);
                } else {
                    q00Var = null;
                }
            }
            if (q00Var != null && q00Var.f24844a != null) {
                org.telegram.messenger.yc ycVar = org.telegram.messenger.bd.E0().B;
                String str = q00Var.f24844a;
                if (gy0Var.f45737r.contains(str)) {
                    Collection.EL.removeIf(gy0Var.f45737r, new c60(str, 2));
                } else {
                    gy0Var.f45737r.add(str);
                }
                if (gy0Var.f45737r.size() == 1 && gy0Var.f45737r.contains(ycVar.f26565f)) {
                    f0(null, null);
                } else {
                    f0(gy0Var.f45737r, Boolean.TRUE);
                }
                if (z10) {
                    int i12 = 0;
                    while (i10 < gy0Var.f45735f.size()) {
                        if (TextUtils.equals(str, ((org.telegram.messenger.q00) gy0Var.f45735f.get(i10)).f24844a)) {
                            gy0Var.e0(i12);
                        }
                        i10++;
                        i12++;
                    }
                } else {
                    int i13 = 0;
                    while (i10 < gy0Var.h.size()) {
                        if (i13 == gy0Var.f45734e) {
                            i13++;
                        }
                        if (TextUtils.equals(str, ((org.telegram.messenger.q00) gy0Var.h.get(i10)).f24844a)) {
                            gy0Var.e0(i13);
                        }
                        i10++;
                        i13++;
                    }
                }
                org.telegram.messenger.hp.s1(gy0Var.currentAccount).f23120s7.g();
            }
        }
    }

    public static void a0(boolean z10) {
        boolean z11 = org.telegram.messenger.hp.e1().getBoolean("translate_button_restricted_languages_changed", false);
        if (org.telegram.messenger.hp.e1().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z10 || z11)) {
            return;
        }
        ei.e eVar = new ei.e(20);
        final HashSet hashSet = new HashSet();
        Utilities.u(0, new org.telegram.messenger.u10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.bd.E0().B.f26565f;
                            if (org.telegram.ui.Components.f21.O0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.f21.O0(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f25457b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.f21.O0(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new org.telegram.messenger.u10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.bd.E0().B.f26565f;
                            if (org.telegram.ui.Components.f21.O0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.f21.O0(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f25457b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.f21.O0(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new org.telegram.messenger.u10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.bd.E0().B.f26565f;
                            if (org.telegram.ui.Components.f21.O0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.f21.O0(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f25457b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.f21.O0(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new org.telegram.ui.Components.ei(26, eVar, hashSet));
    }

    public static void b0() {
        f45729s = false;
        org.telegram.messenger.hp.e1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        a0(false);
    }

    public static HashSet d0() {
        if (!f45729s) {
            HashSet hashSet = null;
            Set<String> stringSet = org.telegram.messenger.hp.e1().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            f45730w = hashSet;
            f45729s = true;
        }
        if (f45730w == null) {
            HashSet hashSet2 = new HashSet(g9.o.d(1));
            Collections.addAll(hashSet2, org.telegram.messenger.bd.E0().B.f26565f);
            f45730w = hashSet2;
        }
        return f45730w;
    }

    public static void f0(HashSet hashSet, Boolean bool) {
        f45730w = hashSet;
        f45729s = true;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
        if (hashSet == null) {
            edit.remove("translate_button_restricted_languages");
        } else {
            edit.putStringSet("translate_button_restricted_languages", hashSet);
        }
        if (bool == null) {
            edit.remove("translate_button_restricted_languages_changed");
        } else if (bool.booleanValue()) {
            edit.putBoolean("translate_button_restricted_languages_changed", true);
        }
        edit.apply();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    public final void c0() {
        this.h = org.telegram.messenger.x00.n();
        String str = org.telegram.messenger.bd.E0().B.f26565f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f45736n);
        org.telegram.messenger.q00 q00Var = null;
        int i3 = 0;
        while (i3 < this.h.size()) {
            org.telegram.messenger.q00 q00Var2 = (org.telegram.messenger.q00) this.h.get(i3);
            if (TextUtils.equals(q00Var2.f24844a, str)) {
                arrayList2.remove(q00Var2.f24844a);
                this.h.remove(i3);
                i3--;
                q00Var = q00Var2;
            } else if (this.f45736n.contains(q00Var2.f24844a)) {
                arrayList.add(q00Var2);
                arrayList2.remove(q00Var2.f24844a);
                this.h.remove(i3);
                i3--;
            }
            i3++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ?? obj = new Object();
            String str2 = (String) arrayList2.get(i10);
            obj.f24844a = str2;
            String upperCase = str2.toUpperCase();
            obj.f24845b = upperCase;
            obj.f24846c = upperCase;
            obj.d = obj.f24844a.toLowerCase();
            arrayList.add(obj);
        }
        this.f45734e = 0;
        this.h.addAll(0, arrayList);
        this.f45734e = arrayList.size() + this.f45734e;
        if (q00Var != null) {
            this.h.add(0, q00Var);
            this.f45734e++;
        }
        if (this.f45734e <= 0) {
            this.f45734e = -1;
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751359, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vs0(this, 7));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
        b10.N();
        b10.C0 = new lg.w1(this, 20);
        b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.f45731a = new e60(this, context, false, 1);
        this.f45733c = new e60(this, context, true, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.d = gyVar;
        gyVar.setText(org.telegram.messenger.bd.M0(2131748175, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f45732b = tj0Var;
        tj0Var.r1();
        this.f45732b.setEmptyView(this.d);
        this.f45732b.setSectionsDrawBackground(true);
        this.f45732b.setLayoutManager(new u4.b0(1, false));
        this.f45732b.setVerticalScrollBarEnabled(false);
        this.f45732b.setAdapter(this.f45731a);
        frameLayout.addView(this.f45732b, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        this.f45732b.setOnItemClickListener(new nx0(this, 1));
        this.f45732b.setOnScrollListener(new h3(this, 29));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23344y4 && this.f45731a != null) {
            c0();
            this.f45731a.f();
        }
    }

    public final void e0(int i3) {
        int b10;
        u4.h0 adapter = this.f45732b.getAdapter();
        for (int i10 = 0; i10 < this.f45732b.getChildCount(); i10++) {
            u4.d1 T = this.f45732b.T(this.f45732b.getChildAt(i10));
            if (T != null && (b10 = T.b()) != -1 && b10 == i3) {
                adapter.t(T, i3);
                return;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f45732b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45732b, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ai));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f45736n = d0();
        this.f45737r = d0();
        c0();
        org.telegram.messenger.bd.E0().V0(this.currentAccount, true);
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
        e60 e60Var = this.f45731a;
        if (e60Var != null) {
            e60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
