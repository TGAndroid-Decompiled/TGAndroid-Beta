package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public i80 f35541a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.nm0 f35542b;
    public i80 f35543c;
    public org.telegram.ui.Components.uz d;
    private int doNotTranslatePosition;
    public ArrayList e;
    public ArrayList f35544f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f35545n;
    public int f35546r;

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    public static void V(org.telegram.ui.LanguageSelectActivity r12, android.view.View r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LanguageSelectActivity.V(org.telegram.ui.LanguageSelectActivity, android.view.View, int):void");
    }

    public static boolean W(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        boolean z10;
        LocaleController.LocaleInfo localeInfo;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.k9)) {
                if (languageSelectActivity.f35542b.getAdapter() == languageSelectActivity.f35543c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i10 -= languageSelectActivity.f35546r;
                }
                if (z10) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i10);
                } else if (!languageSelectActivity.h.isEmpty() && i10 >= 0 && i10 < languageSelectActivity.h.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i10);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35544f.get(i10);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.R = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(17, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(e2Var);
                    TextView textView = (TextView) e2Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    public static void X(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.simpleActionBar.f(true);
        languageSelectActivity.k0();
    }

    public static void Y(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.g0();
            ArrayList arrayList = languageSelectActivity.e;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            i80 i80Var = languageSelectActivity.f35541a;
            if (i80Var != null) {
                i80Var.l();
            }
            i80 i80Var2 = languageSelectActivity.f35543c;
            if (i80Var2 != null) {
                i80Var2.l();
            }
        }
    }

    public static void Z(LanguageSelectActivity languageSelectActivity) {
        if (!languageSelectActivity.isPaused) {
            languageSelectActivity.k0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Language));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new c20(this, 7));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.f23292z0 = new jg.e2(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f35541a = new i80(this, context, false);
        this.f35543c = new i80(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.d = uzVar;
        uzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.f35542b = nm0Var;
        nm0Var.u1();
        this.f35542b.setEmptyView(this.d);
        this.f35542b.setLayoutManager(new s4.c0(1, false));
        this.f35542b.setSectionsDrawBackground(true);
        this.f35542b.setVerticalScrollBarEnabled(false);
        this.f35542b.setAdapter(this.f35541a);
        h80 h80Var = new h80(this);
        h80Var.n(400L);
        h80Var.C = false;
        h80Var.o(org.telegram.ui.Components.ds.h);
        this.f35542b.setItemAnimator(h80Var);
        frameLayout.addView(this.f35542b, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.addView(this.d, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        this.f35542b.setOnItemClickListener(new h(this, 16));
        this.f35542b.setOnItemLongClickListener(new st(this, 14));
        this.f35542b.setOnScrollListener(new i3(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f35541a != null) {
            g0();
            AndroidUtilities.runOnUIThread(new e80(this, 2));
        }
    }

    public final void g0() {
        mt mtVar = new mt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
        this.f35544f = new ArrayList();
        this.h = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i10);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.f35544f.add(localeInfo);
            } else {
                this.h.add(localeInfo);
            }
        }
        Collections.sort(this.f35544f, mtVar);
        Collections.sort(this.h, mtVar);
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f35542b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23339c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35542b, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Mh));
        return arrayList;
    }

    public final boolean h0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    public final boolean i0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(String str) {
        if (str == null) {
            this.e = null;
            if (this.f35542b != null) {
                this.d.setVisibility(8);
                this.f35542b.setAdapter(this.f35541a);
                return;
            }
            return;
        }
        Utilities.searchQueue.postRunnable(new kz(18, this, str));
    }

    public final void k0() {
        if (this.simpleActionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), string)) {
                this.simpleActionBar.w(string, true, 350L, org.telegram.ui.Components.ds.h);
            }
        }
        i80 i80Var = this.f35541a;
        if (i80Var != null) {
            i80Var.q(0, i80Var.h());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new e80(this, 0));
    }

    @Override
    public final boolean onFragmentCreate() {
        g0();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount, false);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override
    public final void onResume() {
        super.onResume();
        i80 i80Var = this.f35541a;
        if (i80Var != null) {
            i80Var.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
