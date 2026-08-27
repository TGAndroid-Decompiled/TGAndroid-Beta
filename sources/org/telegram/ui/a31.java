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
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;

public final class a31 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public static boolean f36361s;
    public static HashSet v;

    public z21 f36362a;

    public org.telegram.ui.Components.zk0 f36363b;

    public z21 f36364c;
    public org.telegram.ui.Components.az d;

    public int f36365e;

    public ArrayList f36366f;
    public ArrayList h;

    public HashSet f36367n;

    public HashSet f36368r;

    public a31() {
        super(null);
        this.f36365e = -1;
    }

    public static void U(a31 a31Var, View view, int i10) {
        TranslateController.Language language;
        ArrayList arrayList;
        if (a31Var.getParentActivity() == null || a31Var.parentLayout == null || !(view instanceof org.telegram.ui.Cells.q8)) {
            return;
        }
        int i11 = 0;
        boolean z10 = a31Var.f36363b.getAdapter() == a31Var.f36364c;
        if (!z10 || (arrayList = a31Var.f36366f) == null) {
            int i12 = a31Var.f36365e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            language = (i10 < 0 || i10 >= a31Var.h.size()) ? null : (TranslateController.Language) a31Var.h.get(i10);
        } else {
            language = (TranslateController.Language) arrayList.get(i10);
        }
        if (language == null || language.code == null) {
            return;
        }
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        String str = language.code;
        if (a31Var.f36368r.contains(str)) {
            Collection.EL.removeIf(a31Var.f36368r, new a80(str, 2));
        } else {
            a31Var.f36368r.add(str);
        }
        if (a31Var.f36368r.size() == 1 && a31Var.f36368r.contains(currentLocaleInfo.pluralLangCode)) {
            a0(null, null);
        } else {
            a0(a31Var.f36368r, Boolean.TRUE);
        }
        if (z10) {
            int i13 = 0;
            while (i11 < a31Var.f36366f.size()) {
                if (TextUtils.equals(str, ((TranslateController.Language) a31Var.f36366f.get(i11)).code)) {
                    a31Var.Z(i13);
                }
                i11++;
                i13++;
            }
        } else {
            int i14 = 0;
            while (i11 < a31Var.h.size()) {
                if (i14 == a31Var.f36365e) {
                    i14++;
                }
                if (TextUtils.equals(str, ((TranslateController.Language) a31Var.h.get(i11)).code)) {
                    a31Var.Z(i14);
                }
                i11++;
                i14++;
            }
        }
        MessagesController.getInstance(a31Var.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
    }

    public static void V(boolean z10) {
        final int i10 = 0;
        boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        final int i11 = 2;
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) != 2 || (z10 && !z11)) {
            cg.h hVar = new cg.h(6);
            final HashSet hashSet = new HashSet();
            final int i12 = 1;
            Utilities.doCallbacks(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    switch (i10) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (org.telegram.ui.Components.b31.E(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.b31.E(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.b31.E(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (org.telegram.ui.Components.b31.E(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.b31.E(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.b31.E(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (org.telegram.ui.Components.b31.E(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (org.telegram.ui.Components.b31.E(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
                            try {
                                InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                                while (it.hasNext()) {
                                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                            String locale = inputMethodSubtype.getLocale();
                                            if (locale != null && locale.contains("_")) {
                                                locale = locale.split("_")[0];
                                            }
                                            if (org.telegram.ui.Components.b31.E(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new ib0(10, hVar, hashSet));
        }
    }

    public static void W() {
        f36361s = false;
        MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        V(false);
    }

    public static HashSet Y() {
        if (!f36361s) {
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", null);
            v = stringSet != null ? new HashSet(stringSet) : null;
            f36361s = true;
        }
        if (v == null) {
            String[] strArr = {LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode};
            HashSet hashSetL = p8.l.l(1);
            Collections.addAll(hashSetL, strArr);
            v = hashSetL;
        }
        return v;
    }

    public static void a0(HashSet hashSet, Boolean bool) {
        v = hashSet;
        f36361s = true;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        if (hashSet == null) {
            editorEdit.remove("translate_button_restricted_languages");
        } else {
            editorEdit.putStringSet("translate_button_restricted_languages", hashSet);
        }
        if (bool == null) {
            editorEdit.remove("translate_button_restricted_languages_changed");
        } else if (bool.booleanValue()) {
            editorEdit.putBoolean("translate_button_restricted_languages_changed", true);
        }
        editorEdit.apply();
    }

    public final void X() {
        this.h = TranslateController.getLanguages();
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f36367n);
        TranslateController.Language language = null;
        int i10 = 0;
        while (i10 < this.h.size()) {
            TranslateController.Language language2 = (TranslateController.Language) this.h.get(i10);
            if (TextUtils.equals(language2.code, str)) {
                arrayList2.remove(language2.code);
                this.h.remove(i10);
                i10--;
                language = language2;
            } else if (this.f36367n.contains(language2.code)) {
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
            language3.f19644q = language3.code.toLowerCase();
            arrayList.add(language3);
        }
        this.f36365e = 0;
        this.h.addAll(0, arrayList);
        this.f36365e = arrayList.size() + this.f36365e;
        if (language != null) {
            this.h.add(0, language);
            this.f36365e++;
        }
        if (this.f36365e <= 0) {
            this.f36365e = -1;
        }
    }

    public final void Z(int i10) {
        int iB;
        f2.q0 adapter = this.f36363b.getAdapter();
        for (int i11 = 0; i11 < this.f36363b.getChildCount(); i11++) {
            f2.o1 o1VarT = this.f36363b.T(this.f36363b.getChildAt(i11));
            if (o1VarT != null && (iB = o1VarT.b()) != -1 && iB == i10) {
                adapter.v(o1VarT, i10);
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.DoNotTranslate));
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 22));
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new db(this, 15);
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f36362a = new z21(this, context, false);
        this.f36364c = new z21(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context, null);
        this.d = azVar;
        azVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout2.addView(this.d, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f36363b = zk0Var;
        zk0Var.p1();
        this.f36363b.setEmptyView(this.d);
        this.f36363b.setLayoutManager(new f2.k0(1, false));
        this.f36363b.setVerticalScrollBarEnabled(false);
        this.f36363b.setAdapter(this.f36362a);
        frameLayout2.addView(this.f36363b, h7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f36363b);
        this.f36363b.setOnItemClickListener(new b21(this, 1));
        this.f36363b.setOnScrollListener(new m3(this, 28));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.suggestedLangpack || this.f36362a == null) {
            return;
        }
        X();
        this.f36362a.l();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36363b, 16, new Class[]{org.telegram.ui.Cells.n4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36363b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36363b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36363b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36363b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36363b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36363b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Mh));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36367n = Y();
        this.f36368r = Y();
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
        this.f36363b.setPadding(0, 0, 0, i13);
        this.f36363b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        z21 z21Var = this.f36362a;
        if (z21Var != null) {
            z21Var.l();
        }
    }
}
