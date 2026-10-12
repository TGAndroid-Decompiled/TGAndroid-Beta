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
    public x80 f32097a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.mm0 f32098b;
    public x80 f32099c;
    public org.telegram.ui.Components.yz d;
    private int doNotTranslatePosition;
    public ArrayList e;
    public ArrayList f32100f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f32101n;
    public int f32102r;

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
                if (languageSelectActivity.f32098b.getAdapter() == languageSelectActivity.f32099c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i10 -= languageSelectActivity.f32102r;
                }
                if (z10) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i10);
                } else if (!languageSelectActivity.h.isEmpty() && i10 >= 0 && i10 < languageSelectActivity.h.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i10);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f32100f.get(i10);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                    a2Var.R = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new gw(10, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(a2Var);
                    TextView textView = (TextView) a2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
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
            x80 x80Var = languageSelectActivity.f32097a;
            if (x80Var != null) {
                x80Var.l();
            }
            x80 x80Var2 = languageSelectActivity.f32099c;
            if (x80Var2 != null) {
                x80Var2.l();
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
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 4));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 11);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f32097a = new x80(this, context, false);
        this.f32099c = new x80(this, context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.d = yzVar;
        yzVar.setText(LocaleController.getString(R.string.NoResult));
        this.d.c();
        this.d.setShowAtCenter(true);
        frameLayout2.addView(this.d, w7.a6.d(-1.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f32098b = mm0Var;
        mm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f32098b);
        this.f32098b.setEmptyView(this.d);
        this.f32098b.setLayoutManager(new s4.b0(1, false));
        this.f32098b.setVerticalScrollBarEnabled(false);
        this.f32098b.setAdapter(this.f32097a);
        w80 w80Var = new w80(this);
        w80Var.n(400L);
        w80Var.C = false;
        w80Var.o(org.telegram.ui.Components.es.h);
        this.f32098b.setItemAnimator(w80Var);
        frameLayout2.addView(this.f32098b, w7.a6.d(-1.0f, -1));
        this.f32098b.setOnItemClickListener(new i(this, 16));
        this.f32098b.setOnItemLongClickListener(new mu(this, 13));
        this.f32098b.setOnScrollListener(new k3(this, 17));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f32097a != null) {
            f0();
            AndroidUtilities.runOnUIThread(new u80(this, 2));
        }
    }

    public final void f0() {
        bu buVar = new bu(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
        this.f32100f = new ArrayList();
        this.h = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i10);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.f32100f.add(localeInfo);
            } else {
                this.h.add(localeInfo);
            }
        }
        Collections.sort(this.f32100f, buVar);
        Collections.sort(this.h, buVar);
    }

    public final boolean g0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32098b, 16, new Class[]{org.telegram.ui.Cells.q4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32098b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f20180s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32098b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f19883c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32098b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32098b, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19863b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32098b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32098b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32098b, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Mh));
        return arrayList;
    }

    public final boolean h0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    public final void i0(String str) {
        if (str == null) {
            this.e = null;
            if (this.f32098b != null) {
                this.d.setVisibility(8);
                this.f32098b.setAdapter(this.f32097a);
                return;
            }
            return;
        }
        Utilities.searchQueue.postRunnable(new o00(17, this, str));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.J(string, true, 350L, org.telegram.ui.Components.es.h);
            }
        }
        x80 x80Var = this.f32097a;
        if (x80Var != null) {
            x80Var.q(0, x80Var.h());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new u80(this, 0));
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
        this.f32098b.setPadding(0, 0, 0, i13);
        this.f32098b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        x80 x80Var = this.f32097a;
        if (x80Var != null) {
            x80Var.l();
        }
    }
}
