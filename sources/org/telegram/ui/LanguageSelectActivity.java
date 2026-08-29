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
    public b80 f35553a;
    private int autoTranslationPosition;
    public org.telegram.ui.Components.jl0 f35554b;
    public b80 f35555c;
    public org.telegram.ui.Components.hz d;
    private int doNotTranslatePosition;
    public ArrayList f35556e;
    public ArrayList f35557f;
    public ArrayList h;
    private int manualTranslationPosition;
    public int f35558n;
    public int f35559r;

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
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof org.telegram.ui.Cells.a9)) {
                if (languageSelectActivity.f35554b.getAdapter() == languageSelectActivity.f35555c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i10 -= languageSelectActivity.f35559r;
                }
                if (z10) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35556e.get(i10);
                } else if (!languageSelectActivity.h.isEmpty() && i10 >= 0 && i10 < languageSelectActivity.h.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i10);
                } else {
                    if (!languageSelectActivity.h.isEmpty()) {
                        i10 -= languageSelectActivity.h.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f35557f.get(i10);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(languageSelectActivity.getParentActivity());
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xr(15, languageSelectActivity, localeInfo));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    languageSelectActivity.showDialog(c2Var);
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
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

    public static void W(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.actionBar.h(true);
        languageSelectActivity.j0();
    }

    public static void X(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.f0();
            ArrayList arrayList = languageSelectActivity.f35556e;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            b80 b80Var = languageSelectActivity.f35553a;
            if (b80Var != null) {
                b80Var.l();
            }
            b80 b80Var2 = languageSelectActivity.f35555c;
            if (b80Var2 != null) {
                b80Var2.l();
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
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 19));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f35553a = new b80(this, context, false);
        this.f35555c = new b80(this, context, true);
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
        this.f35554b = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35554b);
        this.f35554b.setEmptyView(this.d);
        this.f35554b.setLayoutManager(new f2.j0(1, false));
        this.f35554b.setVerticalScrollBarEnabled(false);
        this.f35554b.setAdapter(this.f35553a);
        a80 a80Var = new a80(this);
        a80Var.n(400L);
        a80Var.C = false;
        a80Var.o(org.telegram.ui.Components.jr.h);
        this.f35554b.setItemAnimator(a80Var);
        frameLayout2.addView(this.f35554b, i7.f6.c(-1.0f, -1));
        this.f35554b.setOnItemClickListener(new j(this, 15));
        this.f35554b.setOnItemLongClickListener(new xt(this, 13));
        this.f35554b.setOnScrollListener(new m3(this, 17));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.suggestedLangpack && this.f35553a != null) {
            f0();
            AndroidUtilities.runOnUIThread(new y70(this, 2));
        }
    }

    public final void f0() {
        mt mtVar = new mt(LocaleController.getInstance().getCurrentLocaleInfo(), 2);
        this.f35557f = new ArrayList();
        this.h = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i10);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.f35557f.add(localeInfo);
            } else {
                this.h.add(localeInfo);
            }
        }
        Collections.sort(this.f35557f, mtVar);
        Collections.sort(this.h, mtVar);
    }

    public final boolean g0() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35554b, 16, new Class[]{org.telegram.ui.Cells.o4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35554b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35554b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23045c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35554b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35554b, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35554b, 0, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35554b, 0, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35554b, 0, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"checkImage"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Mh));
        return arrayList;
    }

    public final boolean h0() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    public final void i0(String str) {
        if (str == null) {
            this.f35556e = null;
            if (this.f35554b != null) {
                this.d.setVisibility(8);
                this.f35554b.setAdapter(this.f35553a);
                return;
            }
            return;
        }
        Utilities.searchQueue.postRunnable(new x60(4, this, str));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.I(string, true, 350L, org.telegram.ui.Components.jr.h);
            }
        }
        b80 b80Var = this.f35553a;
        if (b80Var != null) {
            b80Var.q(0, b80Var.h());
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new y70(this, 0));
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
        this.f35554b.setPadding(0, 0, 0, i13);
        this.f35554b.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        b80 b80Var = this.f35553a;
        if (b80Var != null) {
            b80Var.l();
        }
    }
}
