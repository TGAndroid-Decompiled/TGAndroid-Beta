package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public class LanguageSelectActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public c80 f35489a;
    private int autoTranslationPosition;

    public org.telegram.ui.Components.zk0 f35490b;

    public c80 f35491c;
    public org.telegram.ui.Components.az d;
    private int doNotTranslatePosition;

    public ArrayList f35492e;

    public ArrayList f35493f;
    public ArrayList h;
    private int manualTranslationPosition;

    public int f35494n;

    public int f35495r;

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    public static void U(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        LocaleController.LocaleInfo localeInfo;
        try {
            org.telegram.ui.Cells.p8 p8Var = null;
            if (view instanceof org.telegram.ui.Cells.p8) {
                boolean z10 = languageSelectActivity.h0() || languageSelectActivity.g0();
                if (i10 == languageSelectActivity.manualTranslationPosition) {
                    boolean z11 = !languageSelectActivity.h0();
                    languageSelectActivity.getMessagesController().getTranslateController().setContextTranslateEnabled(z11);
                    ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                    NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                } else if (i10 == languageSelectActivity.autoTranslationPosition) {
                    boolean zG0 = languageSelectActivity.g0();
                    boolean z12 = !zG0;
                    if (!zG0 && !languageSelectActivity.getUserConfig().isPremium()) {
                        languageSelectActivity.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) languageSelectActivity, 13, false));
                        return;
                    } else {
                        languageSelectActivity.getMessagesController().getTranslateController().setChatTranslateEnabled(z12);
                        NotificationCenter.getInstance(languageSelectActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                        ((org.telegram.ui.Cells.p8) view).setChecked(z12);
                    }
                }
                boolean z13 = languageSelectActivity.h0() || languageSelectActivity.g0();
                if (z13 != z10) {
                    int i11 = languageSelectActivity.autoTranslationPosition;
                    if (i11 < 0) {
                        i11 = languageSelectActivity.manualTranslationPosition;
                    }
                    for (int i12 = 0; i12 < languageSelectActivity.f35490b.getChildCount(); i12++) {
                        View childAt = languageSelectActivity.f35490b.getChildAt(i12);
                        languageSelectActivity.f35490b.getClass();
                        if (RecyclerView.R(childAt) == i11 && (childAt instanceof org.telegram.ui.Cells.p8)) {
                            p8Var = (org.telegram.ui.Cells.p8) childAt;
                        }
                    }
                    if (p8Var != null) {
                        p8Var.setDivider(z13);
                    }
                    if (z13) {
                        languageSelectActivity.f35489a.o(i11 + 1);
                        return;
                    } else {
                        languageSelectActivity.f35489a.u(i11 + 1);
                        return;
                    }
                }
                return;
            }
            if (view instanceof org.telegram.ui.Cells.x9) {
                languageSelectActivity.presentFragment(new a31());
                return;
            }
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.z8)) {
                boolean z14 = languageSelectActivity.f35490b.getAdapter() == languageSelectActivity.f35491c;
                if (!z14) {
                    i10 -= languageSelectActivity.f35495r;
                }
                if (z14) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35492e.get(i10);
                } else if (languageSelectActivity.h.isEmpty() || i10 < 0 || i10 >= languageSelectActivity.h.size()) {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35493f.get(i10);
                } else {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i10);
                }
                LocaleController.LocaleInfo localeInfo2 = localeInfo;
                if (localeInfo2 != null) {
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    boolean z15 = currentLocaleInfo == localeInfo2;
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(languageSelectActivity.getParentActivity(), 3, null);
                    if (!z15) {
                        b2Var.q(500L);
                    }
                    languageSelectActivity.getMessagesController().getTranslateController().reset();
                    int iApplyLanguage = LocaleController.getInstance().applyLanguage(localeInfo2, true, false, false, true, languageSelectActivity.currentAccount, new hh.t5(languageSelectActivity, b2Var, z15, 25));
                    if (iApplyLanguage != 0) {
                        b2Var.setOnCancelListener(new hh.x(languageSelectActivity, iApplyLanguage, 7));
                    }
                    String str = localeInfo2.pluralLangCode;
                    String str2 = currentLocaleInfo.pluralLangCode;
                    HashSet hashSetY = a31.Y();
                    HashSet hashSet = new HashSet(hashSetY);
                    if (hashSetY.contains(str2) && !hashSetY.contains(str)) {
                        Collection.EL.removeIf(hashSet, new a80(str2, 0));
                    }
                    if (str != null && !"null".equals(str)) {
                        hashSet.add(str);
                    }
                    a31.a0(hashSet, Boolean.FALSE);
                    MessagesController.getInstance(languageSelectActivity.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
                    MessagesController.getInstance(languageSelectActivity.currentAccount).getTranslateController().cleanup();
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static boolean V(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        LocaleController.LocaleInfo localeInfo;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.z8)) {
                boolean z10 = languageSelectActivity.f35490b.getAdapter() == languageSelectActivity.f35491c;
                if (!z10) {
                    i10 -= languageSelectActivity.f35495r;
                }
                if (z10) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35492e.get(i10);
                } else if (languageSelectActivity.h.isEmpty() || i10 < 0 || i10 >= languageSelectActivity.h.size()) {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35493f.get(i10);
                } else {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i10);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.N = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new zr(15, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e9) {
            FileLog.e(e9);
            return true;
        }
    }

    public static void W(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.actionBar.h(true);
        languageSelectActivity.j0();
    }

    public static void X(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.f0();
            ArrayList arrayList = languageSelectActivity.f35492e;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            c80 c80Var = languageSelectActivity.f35489a;
            if (c80Var != null) {
                c80Var.l();
            }
            c80 c80Var2 = languageSelectActivity.f35491c;
            if (c80Var2 != null) {
                c80Var2.l();
            }
        }
    }

    public static void Y(LanguageSelectActivity languageSelectActivity) {
        if (languageSelectActivity.isPaused) {
            return;
        }
        languageSelectActivity.j0();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Language));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 28));
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new db(this, 10);
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f35489a = new c80(this, context, false);
        this.f35491c = new c80(this, context, true);
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
        this.f35490b = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35490b);
        this.f35490b.setEmptyView(this.d);
        this.f35490b.setLayoutManager(new f2.k0(1, false));
        this.f35490b.setVerticalScrollBarEnabled(false);
        this.f35490b.setAdapter(this.f35489a);
        b80 b80Var = new b80(this);
        b80Var.n(400L);
        b80Var.C = false;
        b80Var.o(org.telegram.ui.Components.er.h);
        this.f35490b.setItemAnimator(b80Var);
        frameLayout2.addView(this.f35490b, h7.z5.c(-1.0f, -1));
        this.f35490b.setOnItemClickListener(new i(this, 15));
        this.f35490b.setOnItemLongClickListener(new zt(this, 13));
        this.f35490b.setOnScrollListener(new m3(this, 17));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.suggestedLangpack || this.f35489a == null) {
            return;
        }
        f0();
        AndroidUtilities.runOnUIThread(new z70(this, 2));
    }

    public final void f0() {
        ot otVar = new ot(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
        this.f35493f = new ArrayList();
        this.h = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i10);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.f35493f.add(localeInfo);
            } else {
                this.h.add(localeInfo);
            }
        }
        Collections.sort(this.f35493f, otVar);
        Collections.sort(this.h, otVar);
    }

    public final boolean g0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35490b, 16, new Class[]{org.telegram.ui.Cells.n4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35490b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35490b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35490b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35490b, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35490b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35490b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35490b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Mh));
        return arrayList;
    }

    public final boolean h0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    public final void i0(String str) {
        if (str != null) {
            Utilities.searchQueue.postRunnable(new a30(7, this, str));
            return;
        }
        this.f35492e = null;
        if (this.f35490b != null) {
            this.d.setVisibility(8);
            this.f35490b.setAdapter(this.f35489a);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.J(string, true, 350L, org.telegram.ui.Components.er.h);
            }
        }
        c80 c80Var = this.f35489a;
        if (c80Var != null) {
            c80Var.q(0, c80Var.h());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new z70(this, 0));
    }

    @Override
    public final boolean onFragmentCreate() {
        f0();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount, false);
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
        this.f35490b.setPadding(0, 0, 0, i13);
        this.f35490b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        c80 c80Var = this.f35489a;
        if (c80Var != null) {
            c80Var.l();
        }
    }
}
