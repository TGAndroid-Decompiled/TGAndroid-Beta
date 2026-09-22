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
    public org.telegram.ui.Components.yl0 f32559a;
    public org.telegram.ui.Components.mz f32560b;
    public xt f32561c;
    public zt d;
    public boolean e;
    public boolean f32562f;
    public final boolean h;
    public boolean f32563n;
    public au f32564r;
    public final ArrayList f32565s;

    public bu(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f32565s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.fa U(Context context) {
        float f7;
        org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context);
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
        faVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f38230a = new tt(0, faVar);
        faVar.addOnAttachStateChangeListener(obj);
        return faVar;
    }

    public static SpannableStringBuilder V(vt vtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(vtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) vtVar.f38618a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.B(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19424u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 16));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 9);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.G(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19492y6, false), true);
        this.actionBar.G(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f32562f = false;
        this.e = false;
        xt xtVar = new xt(this, context, this.f32565s, this.f32563n);
        this.f32561c = xtVar;
        this.d = new zt(this, context, xtVar.f39751s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f32560b = mzVar;
        mzVar.c();
        this.f32560b.setShowAtCenter(true);
        this.f32560b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f32560b, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f32559a = yl0Var;
        yl0Var.setSectionsType(3);
        this.f32559a.setEmptyView(this.f32560b);
        this.f32559a.setVerticalScrollBarEnabled(false);
        this.f32559a.setFastScrollEnabled(0);
        this.f32559a.setFastScrollVisible(true);
        this.f32559a.setLayoutManager(new s4.c0(1, false));
        this.f32559a.setAdapter(this.f32561c);
        org.telegram.ui.Components.yl0 yl0Var2 = this.f32559a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        yl0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f32559a, w7.y5.c(-1.0f, -1));
        this.f32559a.setOnItemClickListener(new i(this, 6));
        this.f32559a.setOnScrollListener(new h3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19109d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19387s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32559a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19442v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19406t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32559a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19199i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32559a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19231k0, null, null, org.telegram.ui.ActionBar.j6.f19110d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32559a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19256l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32559a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19275m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32559a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f19295n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32560b, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19092c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32559a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32559a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32559a, 524288, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        xt xtVar = this.f32561c;
        if (xtVar != null) {
            xtVar.X(false);
        }
    }
}
