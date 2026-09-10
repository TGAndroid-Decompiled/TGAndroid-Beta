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
public class LanguageSelectActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public t80 f29921a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.vl0 f29922b;
    public t80 f29923c;
    public org.telegram.ui.Components.tz d;
    private int doNotTranslatePosition;
    public ArrayList e;
    public ArrayList f29924f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f29925n;
    public int f29926r;

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
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.h9)) {
                if (languageSelectActivity.f29922b.getAdapter() == languageSelectActivity.f29923c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i10 -= languageSelectActivity.f29926r;
                }
                if (z10) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i10);
                } else if (!languageSelectActivity.h.isEmpty() && i10 >= 0 && i10 < languageSelectActivity.h.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i10);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f29924f.get(i10);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new l80(1, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(d2Var);
                    TextView textView = (TextView) d2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
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

    public static void W(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.actionBar.h(true);
        languageSelectActivity.j0();
    }

    public static void X(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.f0();
            ArrayList arrayList = languageSelectActivity.e;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            t80 t80Var = languageSelectActivity.f29921a;
            if (t80Var != null) {
                t80Var.l();
            }
            t80 t80Var2 = languageSelectActivity.f29923c;
            if (t80Var2 != null) {
                t80Var2.l();
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
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 2));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 11);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f29921a = new t80(this, context, false);
        this.f29923c = new t80(this, context, true);
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
        this.f29922b = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f29922b);
        this.f29922b.setEmptyView(this.d);
        this.f29922b.setLayoutManager(new s4.c0(1, false));
        this.f29922b.setVerticalScrollBarEnabled(false);
        this.f29922b.setAdapter(this.f29921a);
        s80 s80Var = new s80(this);
        s80Var.n(400L);
        s80Var.C = false;
        s80Var.o(org.telegram.ui.Components.wr.h);
        this.f29922b.setItemAnimator(s80Var);
        frameLayout2.addView(this.f29922b, w7.a6.c(-1.0f, -1));
        this.f29922b.setOnItemClickListener(new i(this, 15));
        this.f29922b.setOnItemLongClickListener(new iu(this, 13));
        this.f29922b.setOnScrollListener(new j3(this, 17));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f29921a != null) {
            f0();
            AndroidUtilities.runOnUIThread(new q80(this, 2));
        }
    }

    public final void f0() {
        xt xtVar = new xt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
        this.f29924f = new ArrayList();
        this.h = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i10);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.f29924f.add(localeInfo);
            } else {
                this.h.add(localeInfo);
            }
        }
        Collections.sort(this.f29924f, xtVar);
        Collections.sort(this.h, xtVar);
    }

    public final boolean g0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29922b, 16, new Class[]{org.telegram.ui.Cells.q4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29922b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29922b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f17911c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29922b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29922b, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29922b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29922b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f29922b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Mh));
        return arrayList;
    }

    public final boolean h0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    public final void i0(String str) {
        if (str == null) {
            this.e = null;
            if (this.f29922b != null) {
                this.d.setVisibility(8);
                this.f29922b.setAdapter(this.f29921a);
                return;
            }
            return;
        }
        Utilities.searchQueue.postRunnable(new uv(28, this, str));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.J(string, true, 350L, org.telegram.ui.Components.wr.h);
            }
        }
        t80 t80Var = this.f29921a;
        if (t80Var != null) {
            t80Var.q(0, t80Var.h());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new q80(this, 0));
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
        this.f29922b.setPadding(0, 0, 0, i13);
        this.f29922b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        t80 t80Var = this.f29921a;
        if (t80Var != null) {
            t80Var.l();
        }
    }
}
