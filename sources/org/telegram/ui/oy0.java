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
public final class oy0 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public static boolean f50082s;
    public static HashSet f50083w;
    public j60 f50084a;
    public org.telegram.ui.Components.uj0 f50085b;
    public j60 f50086c;
    public org.telegram.ui.Components.ny d;
    public int f50087e;
    public ArrayList f50088f;
    public ArrayList h;
    public HashSet f50089n;
    public HashSet f50090r;

    public oy0() {
        super(null);
        this.f50087e = -1;
    }

    public static void Z(oy0 oy0Var, View view, int i7) {
        boolean z10;
        org.telegram.messenger.v00 v00Var;
        ArrayList arrayList;
        if (oy0Var.getParentActivity() != null && oy0Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.r8)) {
            int i10 = 0;
            if (oy0Var.f50085b.getAdapter() == oy0Var.f50086c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (arrayList = oy0Var.f50088f) != null) {
                v00Var = (org.telegram.messenger.v00) arrayList.get(i7);
            } else {
                int i11 = oy0Var.f50087e;
                if (i11 >= 0 && i7 > i11) {
                    i7--;
                }
                if (i7 >= 0 && i7 < oy0Var.h.size()) {
                    v00Var = (org.telegram.messenger.v00) oy0Var.h.get(i7);
                } else {
                    v00Var = null;
                }
            }
            if (v00Var != null && v00Var.f26916a != null) {
                org.telegram.messenger.dd ddVar = org.telegram.messenger.hd.E0().B;
                String str = v00Var.f26916a;
                if (oy0Var.f50090r.contains(str)) {
                    Collection.EL.removeIf(oy0Var.f50090r, new h60(str, 2));
                } else {
                    oy0Var.f50090r.add(str);
                }
                if (oy0Var.f50090r.size() == 1 && oy0Var.f50090r.contains(ddVar.f23062f)) {
                    f0(null, null);
                } else {
                    f0(oy0Var.f50090r, Boolean.TRUE);
                }
                if (z10) {
                    int i12 = 0;
                    while (i10 < oy0Var.f50088f.size()) {
                        if (TextUtils.equals(str, ((org.telegram.messenger.v00) oy0Var.f50088f.get(i10)).f26916a)) {
                            oy0Var.e0(i12);
                        }
                        i10++;
                        i12++;
                    }
                } else {
                    int i13 = 0;
                    while (i10 < oy0Var.h.size()) {
                        if (i13 == oy0Var.f50087e) {
                            i13++;
                        }
                        if (TextUtils.equals(str, ((org.telegram.messenger.v00) oy0Var.h.get(i10)).f26916a)) {
                            oy0Var.e0(i13);
                        }
                        i10++;
                        i13++;
                    }
                }
                org.telegram.messenger.np.s1(oy0Var.currentAccount).f25400t7.g();
            }
        }
    }

    public static void a0(boolean z10) {
        boolean z11 = org.telegram.messenger.np.e1().getBoolean("translate_button_restricted_languages_changed", false);
        if (org.telegram.messenger.np.e1().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z10 || z11)) {
            return;
        }
        fi.e eVar = new fi.e(23);
        final HashSet hashSet = new HashSet();
        Utilities.u(0, new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.hd.E0().B.f23062f;
                            if (org.telegram.ui.Components.p21.O0(str, null, null) != null) {
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
                            if (org.telegram.ui.Components.p21.O0(language, null, null) != null) {
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
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f26600b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.p21.O0(locale, null, null) != null) {
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
        }, new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.hd.E0().B.f23062f;
                            if (org.telegram.ui.Components.p21.O0(str, null, null) != null) {
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
                            if (org.telegram.ui.Components.p21.O0(language, null, null) != null) {
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
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f26600b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.p21.O0(locale, null, null) != null) {
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
        }, new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.hd.E0().B.f23062f;
                            if (org.telegram.ui.Components.p21.O0(str, null, null) != null) {
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
                            if (org.telegram.ui.Components.p21.O0(language, null, null) != null) {
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
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.t0.f26600b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.p21.O0(locale, null, null) != null) {
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
        }, new org.telegram.ui.Components.gh(28, eVar, hashSet));
    }

    public static void b0() {
        f50082s = false;
        org.telegram.messenger.np.e1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        a0(false);
    }

    public static HashSet d0() {
        if (!f50082s) {
            HashSet hashSet = null;
            Set<String> stringSet = org.telegram.messenger.np.e1().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            f50083w = hashSet;
            f50082s = true;
        }
        if (f50083w == null) {
            HashSet hashSet2 = new HashSet(h9.o.d(1));
            Collections.addAll(hashSet2, org.telegram.messenger.hd.E0().B.f23062f);
            f50083w = hashSet2;
        }
        return f50083w;
    }

    public static void f0(HashSet hashSet, Boolean bool) {
        f50083w = hashSet;
        f50082s = true;
        SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    public final void c0() {
        this.h = org.telegram.messenger.c10.n();
        String str = org.telegram.messenger.hd.E0().B.f23062f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f50089n);
        org.telegram.messenger.v00 v00Var = null;
        int i7 = 0;
        while (i7 < this.h.size()) {
            org.telegram.messenger.v00 v00Var2 = (org.telegram.messenger.v00) this.h.get(i7);
            if (TextUtils.equals(v00Var2.f26916a, str)) {
                arrayList2.remove(v00Var2.f26916a);
                this.h.remove(i7);
                i7--;
                v00Var = v00Var2;
            } else if (this.f50089n.contains(v00Var2.f26916a)) {
                arrayList.add(v00Var2);
                arrayList2.remove(v00Var2.f26916a);
                this.h.remove(i7);
                i7--;
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ?? obj = new Object();
            String str2 = (String) arrayList2.get(i10);
            obj.f26916a = str2;
            String upperCase = str2.toUpperCase();
            obj.f26917b = upperCase;
            obj.f26918c = upperCase;
            obj.d = obj.f26916a.toLowerCase();
            arrayList.add(obj);
        }
        this.f50087e = 0;
        this.h.addAll(0, arrayList);
        this.f50087e = arrayList.size() + this.f50087e;
        if (v00Var != null) {
            this.h.add(0, v00Var);
            this.f50087e++;
        }
        if (this.f50087e <= 0) {
            this.f50087e = -1;
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751358, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 7));
        org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(0, 2131232487);
        b10.O();
        b10.C0 = new kg.x1(this, 20);
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        this.f50084a = new j60(this, context, false, 1);
        this.f50086c = new j60(this, context, true, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.d = nyVar;
        nyVar.setText(org.telegram.messenger.hd.M0(2131748167, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f50085b = uj0Var;
        uj0Var.r1();
        this.f50085b.setEmptyView(this.d);
        this.f50085b.setSectionsDrawBackground(true);
        this.f50085b.setLayoutManager(new v4.b0(1, false));
        this.f50085b.setVerticalScrollBarEnabled(false);
        this.f50085b.setAdapter(this.f50084a);
        frameLayout.addView(this.f50085b, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ja.c(-1.0f, -1));
        this.f50085b.setOnItemClickListener(new ux0(this, 1));
        this.f50085b.setOnScrollListener(new g3(this, 29));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25611y4 && this.f50084a != null) {
            c0();
            this.f50084a.f();
        }
    }

    public final void e0(int i7) {
        int b10;
        v4.h0 adapter = this.f50085b.getAdapter();
        for (int i10 = 0; i10 < this.f50085b.getChildCount(); i10++) {
            v4.e1 T = this.f50085b.T(this.f50085b.getChildAt(i10));
            if (T != null && (b10 = T.b()) != -1 && b10 == i7) {
                adapter.t(T, i7);
                return;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f50085b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28832c7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f50085b, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Di));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f50089n = d0();
        this.f50090r = d0();
        c0();
        org.telegram.messenger.hd.E0().V0(this.currentAccount, true);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25611y4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25611y4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        j60 j60Var = this.f50084a;
        if (j60Var != null) {
            j60Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
