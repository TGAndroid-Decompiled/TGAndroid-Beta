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
public final class b31 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f36674s;
    public static HashSet v;
    public a31 f36675a;
    public org.telegram.ui.Components.jl0 f36676b;
    public a31 f36677c;
    public org.telegram.ui.Components.hz d;
    public int f36678e;
    public ArrayList f36679f;
    public ArrayList h;
    public HashSet f36680n;
    public HashSet f36681r;

    public b31() {
        super(null);
        this.f36678e = -1;
    }

    public static void U(b31 b31Var, View view, int i10) {
        boolean z10;
        TranslateController.Language language;
        ArrayList arrayList;
        if (b31Var.getParentActivity() != null && b31Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.r8)) {
            int i11 = 0;
            if (b31Var.f36676b.getAdapter() == b31Var.f36677c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (arrayList = b31Var.f36679f) != null) {
                language = (TranslateController.Language) arrayList.get(i10);
            } else {
                int i12 = b31Var.f36678e;
                if (i12 >= 0 && i10 > i12) {
                    i10--;
                }
                if (i10 >= 0 && i10 < b31Var.h.size()) {
                    language = (TranslateController.Language) b31Var.h.get(i10);
                } else {
                    language = null;
                }
            }
            if (language != null && language.code != null) {
                LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                String str = language.code;
                if (b31Var.f36681r.contains(str)) {
                    Collection.EL.removeIf(b31Var.f36681r, new z70(str, 2));
                } else {
                    b31Var.f36681r.add(str);
                }
                if (b31Var.f36681r.size() == 1 && b31Var.f36681r.contains(currentLocaleInfo.pluralLangCode)) {
                    a0(null, null);
                } else {
                    a0(b31Var.f36681r, Boolean.TRUE);
                }
                if (z10) {
                    int i13 = 0;
                    while (i11 < b31Var.f36679f.size()) {
                        if (TextUtils.equals(str, ((TranslateController.Language) b31Var.f36679f.get(i11)).code)) {
                            b31Var.Z(i13);
                        }
                        i11++;
                        i13++;
                    }
                } else {
                    int i14 = 0;
                    while (i11 < b31Var.h.size()) {
                        if (i14 == b31Var.f36678e) {
                            i14++;
                        }
                        if (TextUtils.equals(str, ((TranslateController.Language) b31Var.h.get(i11)).code)) {
                            b31Var.Z(i14);
                        }
                        i11++;
                        i14++;
                    }
                }
                MessagesController.getInstance(b31Var.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
            }
        }
    }

    public static void V(boolean z10) {
        boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z10 || z11)) {
            return;
        }
        eg.h hVar = new eg.h(6);
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
                            if (org.telegram.ui.Components.k31.D(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.k31.D(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
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
                                        if (org.telegram.ui.Components.k31.D(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            FileLog.e(e12);
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
                            if (org.telegram.ui.Components.k31.D(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.k31.D(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
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
                                        if (org.telegram.ui.Components.k31.D(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            FileLog.e(e12);
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
                            if (org.telegram.ui.Components.k31.D(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.k31.D(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
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
                                        if (org.telegram.ui.Components.k31.D(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new yu0(3, hVar, hashSet));
    }

    public static void W() {
        f36674s = false;
        MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        V(false);
    }

    public static HashSet Y() {
        if (!f36674s) {
            HashSet hashSet = null;
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            v = hashSet;
            f36674s = true;
        }
        if (v == null) {
            HashSet l10 = q8.l.l(1);
            Collections.addAll(l10, LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode);
            v = l10;
        }
        return v;
    }

    public static void a0(HashSet hashSet, Boolean bool) {
        v = hashSet;
        f36674s = true;
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
        ArrayList arrayList2 = new ArrayList(this.f36680n);
        TranslateController.Language language = null;
        int i10 = 0;
        while (i10 < this.h.size()) {
            TranslateController.Language language2 = (TranslateController.Language) this.h.get(i10);
            if (TextUtils.equals(language2.code, str)) {
                arrayList2.remove(language2.code);
                this.h.remove(i10);
                i10--;
                language = language2;
            } else if (this.f36680n.contains(language2.code)) {
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
            language3.f19642q = language3.code.toLowerCase();
            arrayList.add(language3);
        }
        this.f36678e = 0;
        this.h.addAll(0, arrayList);
        this.f36678e = arrayList.size() + this.f36678e;
        if (language != null) {
            this.h.add(0, language);
            this.f36678e++;
        }
        if (this.f36678e <= 0) {
            this.f36678e = -1;
        }
    }

    public final void Z(int i10) {
        int b10;
        f2.p0 adapter = this.f36676b.getAdapter();
        for (int i11 = 0; i11 < this.f36676b.getChildCount(); i11++) {
            f2.n1 T = this.f36676b.T(this.f36676b.getChildAt(i11));
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
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 13));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 15);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f36675a = new a31(this, context, false);
        this.f36677c = new a31(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.hz hzVar = new org.telegram.ui.Components.hz(context, null);
        this.d = hzVar;
        hzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout2.addView(this.d, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f36676b = jl0Var;
        jl0Var.p1();
        this.f36676b.setEmptyView(this.d);
        this.f36676b.setLayoutManager(new f2.j0(1, false));
        this.f36676b.setVerticalScrollBarEnabled(false);
        this.f36676b.setAdapter(this.f36675a);
        frameLayout2.addView(this.f36676b, i7.f6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f36676b);
        this.f36676b.setOnItemClickListener(new d21(this, 1));
        this.f36676b.setOnScrollListener(new m3(this, 28));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f36675a != null) {
            X();
            this.f36675a.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36676b, 16, new Class[]{org.telegram.ui.Cells.o4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36676b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36676b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36676b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36676b, 0, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36676b, 0, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36676b, 0, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Mh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36680n = Y();
        this.f36681r = Y();
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
        this.f36676b.setPadding(0, 0, 0, i13);
        this.f36676b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        a31 a31Var = this.f36675a;
        if (a31Var != null) {
            a31Var.l();
        }
    }
}
