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
    public g80 f35517a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.mm0 f35518b;
    public g80 f35519c;
    public org.telegram.ui.Components.uz d;
    private int doNotTranslatePosition;
    public ArrayList e;
    public ArrayList f35520f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f35521n;
    public int f35522r;

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
                if (languageSelectActivity.f35518b.getAdapter() == languageSelectActivity.f35519c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i10 -= languageSelectActivity.f35522r;
                }
                if (z10) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i10);
                } else if (!languageSelectActivity.h.isEmpty() && i10 >= 0 && i10 < languageSelectActivity.h.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i10);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35520f.get(i10);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                    e2Var.R = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(17, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(e2Var);
                    TextView textView = (TextView) e2Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
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
            g80 g80Var = languageSelectActivity.f35517a;
            if (g80Var != null) {
                g80Var.l();
            }
            g80 g80Var2 = languageSelectActivity.f35519c;
            if (g80Var2 != null) {
                g80Var2.l();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23318b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 7));
        org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.f23291z0 = new jg.e2(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f35517a = new g80(this, context, false);
        this.f35519c = new g80(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.d = uzVar;
        uzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f35518b = mm0Var;
        mm0Var.u1();
        this.f35518b.setEmptyView(this.d);
        this.f35518b.setLayoutManager(new s4.c0(1, false));
        this.f35518b.setSectionsDrawBackground(true);
        this.f35518b.setVerticalScrollBarEnabled(false);
        this.f35518b.setAdapter(this.f35517a);
        f80 f80Var = new f80(this);
        f80Var.n(400L);
        f80Var.C = false;
        f80Var.o(org.telegram.ui.Components.ds.h);
        this.f35518b.setItemAnimator(f80Var);
        frameLayout.addView(this.f35518b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f35518b.setOnItemClickListener(new h(this, 16));
        this.f35518b.setOnItemLongClickListener(new qt(this, 14));
        this.f35518b.setOnScrollListener(new i3(this, 18));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f35517a != null) {
            g0();
            AndroidUtilities.runOnUIThread(new c80(this, 2));
        }
    }

    public final void g0() {
        kt ktVar = new kt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
        this.f35520f = new ArrayList();
        this.h = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i10);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.f35520f.add(localeInfo);
            } else {
                this.h.add(localeInfo);
            }
        }
        Collections.sort(this.f35520f, ktVar);
        Collections.sort(this.h, ktVar);
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f35518b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23338c7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35518b, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"checkImage"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Mh));
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
            if (this.f35518b != null) {
                this.d.setVisibility(8);
                this.f35518b.setAdapter(this.f35517a);
                return;
            }
            return;
        }
        Utilities.searchQueue.postRunnable(new sz(17, this, str));
    }

    public final void k0() {
        if (this.simpleActionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.simpleActionBar.getTitle(), string)) {
                this.simpleActionBar.w(string, true, 350L, org.telegram.ui.Components.ds.h);
            }
        }
        g80 g80Var = this.f35517a;
        if (g80Var != null) {
            g80Var.q(0, g80Var.h());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new c80(this, 0));
    }

    @Override
    public final boolean onFragmentCreate() {
        g0();
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
    public final void onResume() {
        super.onResume();
        g80 g80Var = this.f35517a;
        if (g80Var != null) {
            g80Var.l();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
