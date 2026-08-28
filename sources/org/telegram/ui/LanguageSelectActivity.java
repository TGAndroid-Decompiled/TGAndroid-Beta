package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public y70 f35486a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.wk0 f35487b;
    public y70 f35488c;
    public org.telegram.ui.Components.yy d;
    private int doNotTranslatePosition;
    public ArrayList f35489e;
    public ArrayList f35490f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f35491n;
    public int f35492r;

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    public static void T(org.telegram.ui.LanguageSelectActivity r12, android.view.View r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LanguageSelectActivity.T(org.telegram.ui.LanguageSelectActivity, android.view.View, int):void");
    }

    public static boolean U(LanguageSelectActivity languageSelectActivity, View view, int i9) {
        boolean z10;
        LocaleController.LocaleInfo localeInfo;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.d9)) {
                if (languageSelectActivity.f35487b.getAdapter() == languageSelectActivity.f35488c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i9 -= languageSelectActivity.f35492r;
                }
                if (z10) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35489e.get(i9);
                } else if (!languageSelectActivity.h.isEmpty() && i9 >= 0 && i9 < languageSelectActivity.h.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i9);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i9 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35490f.get(i9);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new yr(15, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(c2Var);
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            FileLog.e(e10);
            return true;
        }
    }

    public static void V(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.actionBar.h(true);
        languageSelectActivity.i0();
    }

    public static void W(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.e0();
            ArrayList arrayList = languageSelectActivity.f35489e;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            y70 y70Var = languageSelectActivity.f35486a;
            if (y70Var != null) {
                y70Var.l();
            }
            y70 y70Var2 = languageSelectActivity.f35488c;
            if (y70Var2 != null) {
                y70Var2.l();
            }
        }
    }

    public static void X(LanguageSelectActivity languageSelectActivity) {
        if (!languageSelectActivity.isPaused) {
            languageSelectActivity.i0();
        }
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
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 27));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new cb(this, 10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f35486a = new y70(this, context, false);
        this.f35488c = new y70(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.yy yyVar = new org.telegram.ui.Components.yy(context, null);
        this.d = yyVar;
        yyVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout2.addView(this.d, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f35487b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35487b);
        this.f35487b.setEmptyView(this.d);
        this.f35487b.setLayoutManager(new f2.m0(1, false));
        this.f35487b.setVerticalScrollBarEnabled(false);
        this.f35487b.setAdapter(this.f35486a);
        x70 x70Var = new x70(this);
        x70Var.n(400L);
        x70Var.C = false;
        x70Var.o(org.telegram.ui.Components.gr.h);
        this.f35487b.setItemAnimator(x70Var);
        frameLayout2.addView(this.f35487b, g7.e6.c(-1.0f, -1));
        this.f35487b.setOnItemClickListener(new i(this, 15));
        this.f35487b.setOnItemLongClickListener(new wt(this, 13));
        this.f35487b.setOnScrollListener(new l3(this, 17));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.suggestedLangpack && this.f35486a != null) {
            e0();
            AndroidUtilities.runOnUIThread(new v70(this, 2));
        }
    }

    public final void e0() {
        mt mtVar = new mt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
        this.f35490f = new ArrayList();
        this.h = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i9);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.f35490f.add(localeInfo);
            } else {
                this.h.add(localeInfo);
            }
        }
        Collections.sort(this.f35490f, mtVar);
        Collections.sort(this.h, mtVar);
    }

    public final boolean f0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    public final boolean g0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35487b, 16, new Class[]{org.telegram.ui.Cells.q4.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35487b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.f6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35487b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f22984c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35487b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35487b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35487b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35487b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35487b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Mh));
        return arrayList;
    }

    public final void h0(String str) {
        if (str == null) {
            this.f35489e = null;
            if (this.f35487b != null) {
                this.d.setVisibility(8);
                this.f35487b.setAdapter(this.f35486a);
                return;
            }
            return;
        }
        Utilities.searchQueue.postRunnable(new x20(7, this, str));
    }

    public final void i0() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.I(string, true, 350L, org.telegram.ui.Components.gr.h);
            }
        }
        y70 y70Var = this.f35486a;
        if (y70Var != null) {
            y70Var.q(0, y70Var.h());
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new v70(this, 0));
    }

    @Override
    public final boolean onFragmentCreate() {
        e0();
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
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f35487b.setPadding(0, 0, 0, i12);
        this.f35487b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        y70 y70Var = this.f35486a;
        if (y70Var != null) {
            y70Var.l();
        }
    }
}
