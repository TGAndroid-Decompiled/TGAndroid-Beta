package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class h41 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f38239s;
    public static HashSet v;
    public g41 f38240a;
    public org.telegram.ui.Components.wm0 f38241b;
    public g41 f38242c;
    public org.telegram.ui.Components.f00 d;
    public int f38243e;
    public ArrayList f38244f;
    public ArrayList h;
    public HashSet f38245n;
    public HashSet f38246r;

    public h41() {
        super(null);
        this.f38243e = -1;
    }

    public static void U(h41 h41Var, View view, int i10) {
        boolean z10;
        TranslateController.Language language;
        ArrayList arrayList;
        if (h41Var.getParentActivity() != null && h41Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.x8)) {
            int i11 = 0;
            if (h41Var.f38241b.getAdapter() == h41Var.f38242c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (arrayList = h41Var.f38244f) != null) {
                language = (TranslateController.Language) arrayList.get(i10);
            } else {
                int i12 = h41Var.f38243e;
                if (i12 >= 0 && i10 > i12) {
                    i10--;
                }
                if (i10 >= 0 && i10 < h41Var.h.size()) {
                    language = (TranslateController.Language) h41Var.h.get(i10);
                } else {
                    language = null;
                }
            }
            if (language != null && language.code != null) {
                LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                String str = language.code;
                if (h41Var.f38246r.contains(str)) {
                    Collection.EL.removeIf(h41Var.f38246r, new t80(str, 2));
                } else {
                    h41Var.f38246r.add(str);
                }
                if (h41Var.f38246r.size() == 1 && h41Var.f38246r.contains(currentLocaleInfo.pluralLangCode)) {
                    a0(null, null);
                } else {
                    a0(h41Var.f38246r, Boolean.TRUE);
                }
                if (z10) {
                    int i13 = 0;
                    while (i11 < h41Var.f38244f.size()) {
                        if (TextUtils.equals(str, ((TranslateController.Language) h41Var.f38244f.get(i11)).code)) {
                            h41Var.Z(i13);
                        }
                        i11++;
                        i13++;
                    }
                } else {
                    int i14 = 0;
                    while (i11 < h41Var.h.size()) {
                        if (i14 == h41Var.f38243e) {
                            i14++;
                        }
                        if (TextUtils.equals(str, ((TranslateController.Language) h41Var.h.get(i11)).code)) {
                            h41Var.Z(i14);
                        }
                        i11++;
                        i14++;
                    }
                }
                MessagesController.getInstance(h41Var.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
            }
        }
    }

    public static void V(boolean z10) {
        boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z10 || z11)) {
            return;
        }
        ai.i iVar = new ai.i(20);
        final HashSet hashSet = new HashSet();
        Utilities.doCallbacks(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                            if (org.telegram.ui.Components.g51.F(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.g51.F(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.g51.F(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                            if (org.telegram.ui.Components.g51.F(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.g51.F(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.g51.F(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        HashSet hashSet2 = hashSet;
                        Runnable runnable = (Runnable) obj;
                        try {
                            String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                            if (org.telegram.ui.Components.g51.F(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.g51.F(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        runnable2.run();
                        return;
                    default:
                        HashSet hashSet4 = hashSet;
                        Runnable runnable3 = (Runnable) obj;
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (org.telegram.ui.Components.g51.F(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new jt(15, iVar, hashSet));
    }

    public static void W() {
        f38239s = false;
        MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        V(false);
    }

    public static HashSet Y() {
        if (!f38239s) {
            HashSet hashSet = null;
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            v = hashSet;
            f38239s = true;
        }
        if (v == null) {
            HashSet hashSet2 = new HashSet(e9.q.c(1));
            Collections.addAll(hashSet2, LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode);
            v = hashSet2;
        }
        return v;
    }

    public static void a0(HashSet hashSet, Boolean bool) {
        v = hashSet;
        f38239s = true;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
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

    public final void X() {
        this.h = TranslateController.getLanguages();
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f38245n);
        TranslateController.Language language = null;
        int i10 = 0;
        while (i10 < this.h.size()) {
            TranslateController.Language language2 = (TranslateController.Language) this.h.get(i10);
            if (TextUtils.equals(language2.code, str)) {
                arrayList2.remove(language2.code);
                this.h.remove(i10);
                i10--;
                language = language2;
            } else if (this.f38245n.contains(language2.code)) {
                arrayList.add(language2);
                arrayList2.remove(language2.code);
                this.h.remove(i10);
                i10--;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            TranslateController.Language language3 = new TranslateController.Language();
            String str2 = (String) arrayList2.get(i11);
            language3.code = str2;
            String upperCase = str2.toUpperCase();
            language3.displayName = upperCase;
            language3.ownDisplayName = upperCase;
            language3.f17025q = language3.code.toLowerCase();
            arrayList.add(language3);
        }
        this.f38243e = 0;
        this.h.addAll(0, arrayList);
        this.f38243e = arrayList.size() + this.f38243e;
        if (language != null) {
            this.h.add(0, language);
            this.f38243e++;
        }
        if (this.f38243e <= 0) {
            this.f38243e = -1;
        }
    }

    public final void Z(int i10) {
        int b10;
        s4.i0 adapter = this.f38241b.getAdapter();
        for (int i11 = 0; i11 < this.f38241b.getChildCount(); i11++) {
            s4.d1 T = this.f38241b.T(this.f38241b.getChildAt(i11));
            if (T != null && (b10 = T.b()) != -1 && b10 == i10) {
                adapter.v(T, i10);
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.DoNotTranslate));
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 27));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 16);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38240a = new g41(this, context, false);
        this.f38242c = new g41(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.f00 f00Var = new org.telegram.ui.Components.f00(context, null);
        this.d = f00Var;
        f00Var.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout2.addView(this.d, w7.w5.d(-1.0f, -1));
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f38241b = wm0Var;
        wm0Var.p1();
        this.f38241b.setEmptyView(this.d);
        this.f38241b.setLayoutManager(new s4.d0(1, false));
        this.f38241b.setVerticalScrollBarEnabled(false);
        this.f38241b.setAdapter(this.f38240a);
        frameLayout2.addView(this.f38241b, w7.w5.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f38241b);
        this.f38241b.setOnItemClickListener(new d21(this, 3));
        this.f38241b.setOnScrollListener(new i3(this, 27));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f38240a != null) {
            X();
            this.f38240a.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38241b, 16, new Class[]{org.telegram.ui.Cells.q4.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20504a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38241b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f20840s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38241b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20651i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20544c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38241b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20682k0, null, null, org.telegram.ui.ActionBar.h6.f20561d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38241b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38241b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38241b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Mh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f38245n = Y();
        this.f38246r = Y();
        X();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38241b.setPadding(0, 0, 0, i13);
        this.f38241b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        g41 g41Var = this.f38240a;
        if (g41Var != null) {
            g41Var.l();
        }
    }
}
