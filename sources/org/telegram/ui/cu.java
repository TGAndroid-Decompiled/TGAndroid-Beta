package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cu extends org.telegram.ui.ActionBar.o2 {
    public org.telegram.ui.Components.ml0 f32917a;
    public org.telegram.ui.Components.mz f32918b;
    public zt f32919c;
    public au d;
    public boolean e;
    public boolean f32920f;
    public final boolean h;
    public boolean f32921n;
    public bu f32922r;
    public final ArrayList f32923s;

    public cu(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f32923s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ea U(Context context) {
        float f7;
        org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
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
        eaVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f39171a = new vt(0, eaVar);
        eaVar.addOnAttachStateChangeListener(obj);
        return eaVar;
    }

    public static SpannableStringBuilder V(xt xtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(xtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) xtVar.f39700a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.B(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19177u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new to(this, 16));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 9);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19245y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f32920f = false;
        this.e = false;
        zt ztVar = new zt(this, context, this.f32923s, this.f32921n);
        this.f32919c = ztVar;
        this.d = new au(this, context, ztVar.f40342s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f32918b = mzVar;
        mzVar.c();
        this.f32918b.setShowAtCenter(true);
        this.f32918b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f32918b, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f32917a = ml0Var;
        ml0Var.setSectionsType(3);
        this.f32917a.setEmptyView(this.f32918b);
        this.f32917a.setVerticalScrollBarEnabled(false);
        this.f32917a.setFastScrollEnabled(0);
        this.f32917a.setFastScrollVisible(true);
        this.f32917a.setLayoutManager(new s4.c0(1, false));
        this.f32917a.setAdapter(this.f32919c);
        org.telegram.ui.Components.ml0 ml0Var2 = this.f32917a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        ml0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f32917a, w7.x5.c(-1.0f, -1));
        this.f32917a.setOnItemClickListener(new i(this, 6));
        this.f32917a.setOnScrollListener(new h3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18863d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19140s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32917a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19195v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19159t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32917a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18953i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32917a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18985k0, null, null, org.telegram.ui.ActionBar.j6.f18864d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32917a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19010l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32917a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19029m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32917a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19049n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32918b, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f18846c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32917a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32917a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32917a, 524288, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        zt ztVar = this.f32919c;
        if (ztVar != null) {
            ztVar.X(false);
        }
    }
}
