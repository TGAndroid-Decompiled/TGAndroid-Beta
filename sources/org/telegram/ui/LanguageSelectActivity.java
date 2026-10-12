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
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public v80 f33609a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.wm0 f33610b;
    public v80 f33611c;
    public org.telegram.ui.Components.f00 d;
    private int doNotTranslatePosition;
    public ArrayList f33612e;
    public ArrayList f33613f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f33614n;
    public int f33615r;

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    public static void U(org.telegram.ui.LanguageSelectActivity r12, android.view.View r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LanguageSelectActivity.U(org.telegram.ui.LanguageSelectActivity, android.view.View, int):void");
    }

    public static boolean V(LanguageSelectActivity languageSelectActivity, View view, int i10) {
        boolean z10;
        LocaleController.LocaleInfo localeInfo;
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.g9)) {
                if (languageSelectActivity.f33610b.getAdapter() == languageSelectActivity.f33611c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i10 -= languageSelectActivity.f33615r;
                }
                if (z10) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f33612e.get(i10);
                } else if (!languageSelectActivity.h.isEmpty() && i10 >= 0 && i10 < languageSelectActivity.h.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i10);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f33613f.get(i10);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                    a2Var.R = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tw(7, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(a2Var);
                    TextView textView = (TextView) a2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e7) {
            FileLog.e(e7);
            return true;
        }
    }

    public static void W(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.actionBar.i(true);
        languageSelectActivity.j0();
    }

    public static void X(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.f0();
            ArrayList arrayList = languageSelectActivity.f33612e;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            v80 v80Var = languageSelectActivity.f33609a;
            if (v80Var != null) {
                v80Var.l();
            }
            v80 v80Var2 = languageSelectActivity.f33611c;
            if (v80Var2 != null) {
                v80Var2.l();
            }
        }
    }

    public static void Y(LanguageSelectActivity languageSelectActivity) {
        if (!languageSelectActivity.isPaused) {
            languageSelectActivity.j0();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Language));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 3));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 11);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f33609a = new v80(this, context, false);
        this.f33611c = new v80(this, context, true);
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
        this.f33610b = wm0Var;
        wm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f33610b);
        this.f33610b.setEmptyView(this.d);
        this.f33610b.setLayoutManager(new s4.d0(1, false));
        this.f33610b.setVerticalScrollBarEnabled(false);
        this.f33610b.setAdapter(this.f33609a);
        u80 u80Var = new u80(this);
        u80Var.n(400L);
        u80Var.C = false;
        u80Var.o(org.telegram.ui.Components.js.h);
        this.f33610b.setItemAnimator(u80Var);
        frameLayout2.addView(this.f33610b, w7.w5.d(-1.0f, -1));
        this.f33610b.setOnItemClickListener(new i(this, 16));
        this.f33610b.setOnItemLongClickListener(new ju(this, 13));
        this.f33610b.setOnScrollListener(new i3(this, 17));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f33609a != null) {
            f0();
            AndroidUtilities.runOnUIThread(new s80(this, 2));
        }
    }

    public final void f0() {
        yt ytVar = new yt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
        this.f33613f = new ArrayList();
        this.h = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i10);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.f33613f.add(localeInfo);
            } else {
                this.h.add(localeInfo);
            }
        }
        Collections.sort(this.f33613f, ytVar);
        Collections.sort(this.h, ytVar);
    }

    public final boolean g0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33610b, 16, new Class[]{org.telegram.ui.Cells.q4.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20504a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33610b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f20840s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33610b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20651i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20544c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33610b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20682k0, null, null, org.telegram.ui.ActionBar.h6.f20561d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33610b, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20524b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33610b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33610b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33610b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Mh));
        return arrayList;
    }

    public final boolean h0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    public final void i0(String str) {
        if (str == null) {
            this.f33612e = null;
            if (this.f33610b != null) {
                this.d.setVisibility(8);
                this.f33610b.setAdapter(this.f33609a);
                return;
            }
            return;
        }
        Utilities.searchQueue.postRunnable(new q70(4, this, str));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.K(string, true, 350L, org.telegram.ui.Components.js.h);
            }
        }
        v80 v80Var = this.f33609a;
        if (v80Var != null) {
            v80Var.q(0, v80Var.h());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new s80(this, 0));
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
        this.f33610b.setPadding(0, 0, 0, i13);
        this.f33610b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        v80 v80Var = this.f33609a;
        if (v80Var != null) {
            v80Var.l();
        }
    }
}
