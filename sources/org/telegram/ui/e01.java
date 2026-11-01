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
public final class e01 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public static boolean f36706s;
    public static HashSet f36707w;
    public h70 f36708a;
    public org.telegram.ui.Components.uk0 f36709b;
    public h70 f36710c;
    public org.telegram.ui.Components.xy d;
    public int e;
    public ArrayList f36711f;
    public ArrayList h;
    public HashSet f36712n;
    public HashSet f36713r;

    public e01() {
        super(null);
        this.e = -1;
    }

    public static void Z(e01 e01Var, View view, int i10) {
        boolean z10;
        org.telegram.messenger.n10 n10Var;
        ArrayList arrayList;
        if (e01Var.getParentActivity() != null && e01Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.u8)) {
            int i11 = 0;
            if (e01Var.f36709b.getAdapter() == e01Var.f36710c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (arrayList = e01Var.f36711f) != null) {
                n10Var = (org.telegram.messenger.n10) arrayList.get(i10);
            } else {
                int i12 = e01Var.e;
                if (i12 >= 0 && i10 > i12) {
                    i10--;
                }
                if (i10 >= 0 && i10 < e01Var.h.size()) {
                    n10Var = (org.telegram.messenger.n10) e01Var.h.get(i10);
                } else {
                    n10Var = null;
                }
            }
            if (n10Var != null && n10Var.f17246a != null) {
                org.telegram.messenger.ad adVar = org.telegram.messenger.dd.D0().B;
                String str = n10Var.f17246a;
                if (e01Var.f36713r.contains(str)) {
                    Collection.EL.removeIf(e01Var.f36713r, new f70(str, 2));
                } else {
                    e01Var.f36713r.add(str);
                }
                if (e01Var.f36713r.size() == 1 && e01Var.f36713r.contains(adVar.f14594f)) {
                    f0(null, null);
                } else {
                    f0(e01Var.f36713r, Boolean.TRUE);
                }
                if (z10) {
                    int i13 = 0;
                    while (i11 < e01Var.f36711f.size()) {
                        if (TextUtils.equals(str, ((org.telegram.messenger.n10) e01Var.f36711f.get(i11)).f17246a)) {
                            e01Var.e0(i13);
                        }
                        i11++;
                        i13++;
                    }
                } else {
                    int i14 = 0;
                    while (i11 < e01Var.h.size()) {
                        if (i14 == e01Var.e) {
                            i14++;
                        }
                        if (TextUtils.equals(str, ((org.telegram.messenger.n10) e01Var.h.get(i11)).f17246a)) {
                            e01Var.e0(i14);
                        }
                        i11++;
                        i14++;
                    }
                }
                org.telegram.messenger.wp.r1(e01Var.currentAccount).f19253t7.g();
            }
        }
    }

    public static void a0(boolean z10) {
        boolean z11 = org.telegram.messenger.wp.d1().getBoolean("translate_button_restricted_languages_changed", false);
        if (org.telegram.messenger.wp.d1().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z10 || z11)) {
            return;
        }
        ag.z0 z0Var = new ag.z0(19);
        final HashSet hashSet = new HashSet();
        Utilities.u(0, new org.telegram.messenger.r20() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.dd.D0().B.f14594f;
                            if (org.telegram.ui.Components.n31.O0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.n31.O0(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.w0.f18945b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.n31.O0(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.f8.g(e10, true);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new org.telegram.messenger.r20() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.dd.D0().B.f14594f;
                            if (org.telegram.ui.Components.n31.O0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.n31.O0(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.w0.f18945b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.n31.O0(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.f8.g(e10, true);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new org.telegram.messenger.r20() {
            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = org.telegram.messenger.dd.D0().B.f14594f;
                            if (org.telegram.ui.Components.n31.O0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.n31.O0(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) org.telegram.messenger.w0.f18945b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.n31.O0(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.f8.g(e10, true);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new d01(0, z0Var, hashSet));
    }

    public static void b0() {
        f36706s = false;
        org.telegram.messenger.wp.d1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        a0(false);
    }

    public static HashSet d0() {
        if (!f36706s) {
            HashSet hashSet = null;
            Set<String> stringSet = org.telegram.messenger.wp.d1().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            f36707w = hashSet;
            f36706s = true;
        }
        if (f36707w == null) {
            HashSet hashSet2 = new HashSet(e9.s.c(1));
            Collections.addAll(hashSet2, org.telegram.messenger.dd.D0().B.f14594f);
            f36707w = hashSet2;
        }
        return f36707w;
    }

    public static void f0(HashSet hashSet, Boolean bool) {
        f36707w = hashSet;
        f36706s = true;
        SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    public final void c0() {
        this.h = org.telegram.messenger.u10.n();
        String str = org.telegram.messenger.dd.D0().B.f14594f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f36712n);
        org.telegram.messenger.n10 n10Var = null;
        int i10 = 0;
        while (i10 < this.h.size()) {
            org.telegram.messenger.n10 n10Var2 = (org.telegram.messenger.n10) this.h.get(i10);
            if (TextUtils.equals(n10Var2.f17246a, str)) {
                arrayList2.remove(n10Var2.f17246a);
                this.h.remove(i10);
                i10--;
                n10Var = n10Var2;
            } else if (this.f36712n.contains(n10Var2.f17246a)) {
                arrayList.add(n10Var2);
                arrayList2.remove(n10Var2.f17246a);
                this.h.remove(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ?? obj = new Object();
            String str2 = (String) arrayList2.get(i11);
            obj.f17246a = str2;
            String upperCase = str2.toUpperCase();
            obj.f17247b = upperCase;
            obj.f17248c = upperCase;
            obj.d = obj.f17246a.toLowerCase();
            arrayList.add(obj);
        }
        this.e = 0;
        this.h.addAll(0, arrayList);
        this.e = arrayList.size() + this.e;
        if (n10Var != null) {
            this.h.add(0, n10Var);
            this.e++;
        }
        if (this.e <= 0) {
            this.e = -1;
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131751359, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 27));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, 2131232485);
        b10.N();
        b10.B0 = new ag.l3(this, 20);
        b10.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        this.f36708a = new h70(this, context, false, 1);
        this.f36710c = new h70(this, context, true, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.d = xyVar;
        xyVar.setText(org.telegram.messenger.dd.L0(2131748183, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f36709b = uk0Var;
        uk0Var.r1();
        this.f36709b.setEmptyView(this.d);
        this.f36709b.setSectionsDrawBackground(true);
        this.f36709b.setLayoutManager(new s4.a0(1, false));
        this.f36709b.setVerticalScrollBarEnabled(false);
        this.f36709b.setAdapter(this.f36708a);
        frameLayout.addView(this.f36709b, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        this.f36709b.setOnItemClickListener(new jz0(this, 1));
        this.f36709b.setOnScrollListener(new h3(this, 28));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14824y4 && this.f36708a != null) {
            c0();
            this.f36708a.f();
        }
    }

    public final void e0(int i10) {
        int b10;
        s4.g0 adapter = this.f36709b.getAdapter();
        for (int i11 = 0; i11 < this.f36709b.getChildCount(); i11++) {
            s4.c1 T = this.f36709b.T(this.f36709b.getChildAt(i11));
            if (T != null && (b10 = T.b()) != -1 && b10 == i10) {
                adapter.t(T, i10);
                return;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f36709b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20912c7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36709b, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ai));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36712n = d0();
        this.f36713r = d0();
        c0();
        org.telegram.messenger.dd.D0().S0(this.currentAccount, true);
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
        h70 h70Var = this.f36708a;
        if (h70Var != null) {
            h70Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
