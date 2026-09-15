package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class au extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.ll0 f31950a;
    public org.telegram.ui.Components.mz f31951b;
    public xt f31952c;
    public yt d;
    public boolean e;
    public boolean f31953f;
    public final boolean h;
    public boolean f31954n;
    public zt f31955r;
    public final ArrayList f31956s;

    public au(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f31956s = new ArrayList(arrayList);
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
        obj.f38158a = new tt(0, eaVar);
        eaVar.addOnAttachStateChangeListener(obj);
        return eaVar;
    }

    public static SpannableStringBuilder V(vt vtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(vtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) vtVar.f38680a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.B(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19150u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new to(this, 16));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19218y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.f31953f = false;
        this.e = false;
        xt xtVar = new xt(this, context, this.f31956s, this.f31954n);
        this.f31952c = xtVar;
        this.d = new yt(this, context, xtVar.f39675s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f31951b = mzVar;
        mzVar.c();
        this.f31951b.setShowAtCenter(true);
        this.f31951b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f31951b, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f31950a = ll0Var;
        ll0Var.setSectionsType(3);
        this.f31950a.setEmptyView(this.f31951b);
        this.f31950a.setVerticalScrollBarEnabled(false);
        this.f31950a.setFastScrollEnabled(0);
        this.f31950a.setFastScrollVisible(true);
        this.f31950a.setLayoutManager(new s4.c0(1, false));
        this.f31950a.setAdapter(this.f31952c);
        org.telegram.ui.Components.ll0 ll0Var2 = this.f31950a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        ll0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f31950a, w7.x5.c(-1.0f, -1));
        this.f31950a.setOnItemClickListener(new i(this, 6));
        this.f31950a.setOnScrollListener(new h3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f18836d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f19113s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31950a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19168v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19132t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31950a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f18926i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31950a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f18958k0, null, null, org.telegram.ui.ActionBar.i6.f18837d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31950a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f18983l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31950a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f19002m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31950a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f19022n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31951b, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f18819c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31950a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31950a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31950a, 524288, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        xt xtVar = this.f31952c;
        if (xtVar != null) {
            xtVar.X(false);
        }
    }
}
