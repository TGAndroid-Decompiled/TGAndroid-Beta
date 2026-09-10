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
public final class k41 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static boolean f34220s;
    public static HashSet v;
    public j41 f34221a;
    public org.telegram.ui.Components.vl0 f34222b;
    public j41 f34223c;
    public org.telegram.ui.Components.tz d;
    public int e;
    public ArrayList f34224f;
    public ArrayList h;
    public HashSet f34225n;
    public HashSet f34226r;

    public k41() {
        super(null);
        this.e = -1;
    }

    public static void U(k41 k41Var, View view, int i10) {
        boolean z10;
        TranslateController.Language language;
        ArrayList arrayList;
        if (k41Var.getParentActivity() != null && k41Var.parentLayout != null && (view instanceof org.telegram.ui.Cells.y8)) {
            int i11 = 0;
            if (k41Var.f34222b.getAdapter() == k41Var.f34223c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (arrayList = k41Var.f34224f) != null) {
                language = (TranslateController.Language) arrayList.get(i10);
            } else {
                int i12 = k41Var.e;
                if (i12 >= 0 && i10 > i12) {
                    i10--;
                }
                if (i10 >= 0 && i10 < k41Var.h.size()) {
                    language = (TranslateController.Language) k41Var.h.get(i10);
                } else {
                    language = null;
                }
            }
            if (language != null && language.code != null) {
                LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                String str = language.code;
                if (k41Var.f34226r.contains(str)) {
                    Collection.EL.removeIf(k41Var.f34226r, new r80(str, 2));
                } else {
                    k41Var.f34226r.add(str);
                }
                if (k41Var.f34226r.size() == 1 && k41Var.f34226r.contains(currentLocaleInfo.pluralLangCode)) {
                    a0(null, null);
                } else {
                    a0(k41Var.f34226r, Boolean.TRUE);
                }
                if (z10) {
                    int i13 = 0;
                    while (i11 < k41Var.f34224f.size()) {
                        if (TextUtils.equals(str, ((TranslateController.Language) k41Var.f34224f.get(i11)).code)) {
                            k41Var.Z(i13);
                        }
                        i11++;
                        i13++;
                    }
                } else {
                    int i14 = 0;
                    while (i11 < k41Var.h.size()) {
                        if (i14 == k41Var.e) {
                            i14++;
                        }
                        if (TextUtils.equals(str, ((TranslateController.Language) k41Var.h.get(i11)).code)) {
                            k41Var.Z(i14);
                        }
                        i11++;
                        i14++;
                    }
                }
                MessagesController.getInstance(k41Var.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
            }
        }
    }

    public static void V(boolean z10) {
        boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z10 || z11)) {
            return;
        }
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3(5);
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
                            if (org.telegram.ui.Components.i41.D(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.i41.D(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
                                        if (org.telegram.ui.Components.i41.D(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
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
                            if (org.telegram.ui.Components.i41.D(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.i41.D(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
                                        if (org.telegram.ui.Components.i41.D(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
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
                            if (org.telegram.ui.Components.i41.D(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        runnable.run();
                        return;
                    case 1:
                        HashSet hashSet3 = hashSet;
                        Runnable runnable2 = (Runnable) obj;
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (org.telegram.ui.Components.i41.D(language, null, null) != null) {
                                hashSet3.add(language);
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
                                        if (org.telegram.ui.Components.i41.D(locale, null, null) != null) {
                                            hashSet4.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        runnable3.run();
                        return;
                }
            }
        }, new nj0(7, l3Var, hashSet));
    }

    public static void W() {
        f34220s = false;
        MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        V(false);
    }

    public static HashSet Y() {
        if (!f34220s) {
            HashSet hashSet = null;
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            v = hashSet;
            f34220s = true;
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
        f34220s = true;
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
        ArrayList arrayList2 = new ArrayList(this.f34225n);
        TranslateController.Language language = null;
        int i10 = 0;
        while (i10 < this.h.size()) {
            TranslateController.Language language2 = (TranslateController.Language) this.h.get(i10);
            if (TextUtils.equals(language2.code, str)) {
                arrayList2.remove(language2.code);
                this.h.remove(i10);
                i10--;
                language = language2;
            } else if (this.f34225n.contains(language2.code)) {
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
            language3.f14667q = language3.code.toLowerCase();
            arrayList.add(language3);
        }
        this.e = 0;
        this.h.addAll(0, arrayList);
        this.e = arrayList.size() + this.e;
        if (language != null) {
            this.h.add(0, language);
            this.e++;
        }
        if (this.e <= 0) {
            this.e = -1;
        }
    }

    public final void Z(int i10) {
        int b10;
        s4.h0 adapter = this.f34222b.getAdapter();
        for (int i11 = 0; i11 < this.f34222b.getChildCount(); i11++) {
            s4.c1 T = this.f34222b.T(this.f34222b.getChildAt(i11));
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
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 26));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 16);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f34221a = new j41(this, context, false);
        this.f34223c = new j41(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.d = tzVar;
        tzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout2.addView(this.d, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f34222b = vl0Var;
        vl0Var.o1();
        this.f34222b.setEmptyView(this.d);
        this.f34222b.setLayoutManager(new s4.c0(1, false));
        this.f34222b.setVerticalScrollBarEnabled(false);
        this.f34222b.setAdapter(this.f34221a);
        frameLayout2.addView(this.f34222b, w7.a6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f34222b);
        this.f34222b.setOnItemClickListener(new f31(this, 2));
        this.f34222b.setOnScrollListener(new j3(this, 27));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f34221a != null) {
            X();
            this.f34221a.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34222b, 16, new Class[]{org.telegram.ui.Cells.q4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34222b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34222b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f17911c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34222b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34222b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34222b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34222b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Mh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34225n = Y();
        this.f34226r = Y();
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
        this.f34222b.setPadding(0, 0, 0, i13);
        this.f34222b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        j41 j41Var = this.f34221a;
        if (j41Var != null) {
            j41Var.l();
        }
    }
}
