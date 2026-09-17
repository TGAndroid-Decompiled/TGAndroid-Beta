package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bu extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.ll0 f34924a;
    public org.telegram.ui.Components.mz f34925b;
    public xt f34926c;
    public zt d;
    public boolean f34927e;
    public boolean f34928f;
    public final boolean h;
    public boolean f34929n;
    public au f34930r;
    public final ArrayList f34931s;

    public bu(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f34931s = new ArrayList(arrayList);
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
        obj.f41217a = new tt(0, eaVar);
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
        spannableStringBuilder.append((CharSequence) vtVar.f41694a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20975u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 17));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21043y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f34928f = false;
        this.f34927e = false;
        xt xtVar = new xt(this, context, this.f34931s, this.f34929n);
        this.f34926c = xtVar;
        this.d = new zt(this, context, xtVar.f42889s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f34925b = mzVar;
        mzVar.c();
        this.f34925b.setShowAtCenter(true);
        this.f34925b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f34925b, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f34924a = ll0Var;
        ll0Var.setSectionsType(3);
        this.f34924a.setEmptyView(this.f34925b);
        this.f34924a.setVerticalScrollBarEnabled(false);
        this.f34924a.setFastScrollEnabled(0);
        this.f34924a.setFastScrollVisible(true);
        this.f34924a.setLayoutManager(new s4.c0(1, false));
        this.f34924a.setAdapter(this.f34926c);
        org.telegram.ui.Components.ll0 ll0Var2 = this.f34924a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        ll0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f34924a, w7.x5.c(-1.0f, -1));
        this.f34924a.setOnItemClickListener(new i(this, 6));
        this.f34924a.setOnScrollListener(new i3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20664d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20938s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34924a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20993v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20957t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34924a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20754i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34924a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20786k0, null, null, org.telegram.ui.ActionBar.j6.f20665d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34924a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20811l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34924a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20829m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34924a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20848n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34925b, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20647c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34924a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34924a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34924a, 524288, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        xt xtVar = this.f34926c;
        if (xtVar != null) {
            xtVar.X(false);
        }
    }
}
