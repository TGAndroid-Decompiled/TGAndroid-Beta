package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ot extends org.telegram.ui.ActionBar.r2 {
    public org.telegram.ui.Components.mm0 f42278a;
    public org.telegram.ui.Components.uz f42279b;
    public lt f42280c;
    public mt d;
    public boolean e;
    public boolean f42281f;
    public final boolean h;
    public boolean f42282n;
    public nt f42283r;
    public final ArrayList f42284s;

    public ot(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f42284s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ga V(Context context) {
        float f7;
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context);
        float f10 = 12.0f;
        if (LocaleController.isRTL) {
            f7 = 16.0f;
        } else {
            f7 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (!LocaleController.isRTL) {
            f10 = 16.0f;
        }
        gaVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f40063a = new gt(0, gaVar);
        gaVar.addOnAttachStateChangeListener(obj);
        return gaVar;
    }

    public static SpannableStringBuilder W(jt jtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(jtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) jtVar.f40740a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23355d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23446i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        int i11 = 1;
        org.telegram.ui.ActionBar.f7.m(kVar, 1, i10, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.f23673u8, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 5, i10, null);
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 21));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 9);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.D(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23746y6, false), true);
        this.actionBar.D(org.telegram.ui.ActionBar.y6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.f42281f = false;
        this.e = false;
        lt ltVar = new lt(this, context, this.f42284s, this.f42282n);
        this.f42280c = ltVar;
        this.d = new mt(this, context, ltVar.f41355s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(context, null);
        this.f42279b = uzVar;
        uzVar.c();
        this.f42279b.setShowAtCenter(true);
        this.f42279b.setText(LocaleController.getString(R.string.NoResult));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f42278a = mm0Var;
        mm0Var.setSectionsType(3);
        this.f42278a.setEmptyView(this.f42279b);
        this.f42278a.setVerticalScrollBarEnabled(false);
        this.f42278a.setFastScrollEnabled(0);
        this.f42278a.setFastScrollVisible(true);
        this.f42278a.setLayoutManager(new s4.c0(1, false));
        this.f42278a.setAdapter(this.f42280c);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f42278a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        mm0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f42278a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        frameLayout.addView(this.f42279b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f42278a.setOnItemClickListener(new h(this, 7));
        this.f42278a.setOnScrollListener(new i3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42278a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23501l7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42278a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23519m7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42278a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23539n7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f42279b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23336c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        lt ltVar = this.f42280c;
        if (ltVar != null) {
            ltVar.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.D(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23746y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i10 = org.telegram.ui.ActionBar.y6.G6;
                kVar2.D(org.telegram.ui.ActionBar.y6.x0(null, i10, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            }
            org.telegram.ui.Components.mm0 mm0Var = this.f42278a;
            if (mm0Var != null) {
                mm0Var.A1();
                if (this.f42278a.getFastScroll() != null) {
                    this.f42278a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
