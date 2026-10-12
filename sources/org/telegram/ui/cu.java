package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cu extends org.telegram.ui.ActionBar.m2 {
    public org.telegram.ui.Components.wm0 f36511a;
    public org.telegram.ui.Components.f00 f36512b;
    public zt f36513c;
    public au d;
    public boolean f36514e;
    public boolean f36515f;
    public final boolean h;
    public boolean f36516n;
    public bu f36517r;
    public final ArrayList f36518s;

    public cu(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f36518s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ca U(Context context) {
        float f7;
        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
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
        caVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f43678a = new vt(0, caVar);
        caVar.addOnAttachStateChangeListener(obj);
        return caVar;
    }

    public static SpannableStringBuilder V(xt xtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(xtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e00(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) xtVar.f44161a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.E(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20877u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new lc(this, 17));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.I(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20946y6, false), true);
        this.actionBar.I(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f36515f = false;
        this.f36514e = false;
        zt ztVar = new zt(this, context, this.f36518s, this.f36516n);
        this.f36513c = ztVar;
        this.d = new au(this, context, ztVar.f44919s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.f00 f00Var = new org.telegram.ui.Components.f00(context, null);
        this.f36512b = f00Var;
        f00Var.c();
        this.f36512b.setShowAtCenter(true);
        this.f36512b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f36512b, w7.w5.d(-1.0f, -1));
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f36511a = wm0Var;
        wm0Var.setSectionsType(3);
        this.f36511a.setEmptyView(this.f36512b);
        this.f36511a.setVerticalScrollBarEnabled(false);
        this.f36511a.setFastScrollEnabled(0);
        this.f36511a.setFastScrollVisible(true);
        this.f36511a.setLayoutManager(new s4.d0(1, false));
        this.f36511a.setAdapter(this.f36513c);
        org.telegram.ui.Components.wm0 wm0Var2 = this.f36511a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        wm0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f36511a, w7.w5.d(-1.0f, -1));
        this.f36511a.setOnItemClickListener(new i(this, 7));
        this.f36511a.setOnScrollListener(new i3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20840s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36511a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36511a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20651i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36511a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20682k0, null, null, org.telegram.ui.ActionBar.h6.f20561d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36511a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20707l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36511a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20726m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36511a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f20746n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36512b, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20544c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36511a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36511a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36511a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        zt ztVar = this.f36513c;
        if (ztVar != null) {
            ztVar.X(false);
        }
    }
}
