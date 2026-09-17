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
    public org.telegram.ui.Components.ll0 f34951a;
    public org.telegram.ui.Components.mz f34952b;
    public xt f34953c;
    public zt d;
    public boolean f34954e;
    public boolean f34955f;
    public final boolean h;
    public boolean f34956n;
    public au f34957r;
    public final ArrayList f34958s;

    public bu(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f34958s = new ArrayList(arrayList);
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
        obj.f41244a = new tt(0, eaVar);
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
        spannableStringBuilder.append((CharSequence) vtVar.f41721a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20691d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21002u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 17));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21070y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f34955f = false;
        this.f34954e = false;
        xt xtVar = new xt(this, context, this.f34958s, this.f34956n);
        this.f34953c = xtVar;
        this.d = new zt(this, context, xtVar.f42916s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f34952b = mzVar;
        mzVar.c();
        this.f34952b.setShowAtCenter(true);
        this.f34952b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f34952b, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f34951a = ll0Var;
        ll0Var.setSectionsType(3);
        this.f34951a.setEmptyView(this.f34952b);
        this.f34951a.setVerticalScrollBarEnabled(false);
        this.f34951a.setFastScrollEnabled(0);
        this.f34951a.setFastScrollVisible(true);
        this.f34951a.setLayoutManager(new s4.c0(1, false));
        this.f34951a.setAdapter(this.f34953c);
        org.telegram.ui.Components.ll0 ll0Var2 = this.f34951a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        ll0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f34951a, w7.x5.c(-1.0f, -1));
        this.f34951a.setOnItemClickListener(new i(this, 6));
        this.f34951a.setOnScrollListener(new i3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20691d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20965s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34951a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21020v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20984t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34951a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20781i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34951a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20813k0, null, null, org.telegram.ui.ActionBar.j6.f20692d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34951a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20838l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34951a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20856m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34951a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20875n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34952b, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20674c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34951a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34951a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34951a, 524288, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20691d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        xt xtVar = this.f34953c;
        if (xtVar != null) {
            xtVar.X(false);
        }
    }
}
