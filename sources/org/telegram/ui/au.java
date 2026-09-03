package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class au extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.Components.rl0 f32641a;
    public org.telegram.ui.Components.mz f32642b;
    public wt f32643c;
    public yt d;
    public boolean e;
    public boolean f32644f;
    public final boolean h;
    public boolean f32645n;
    public zt f32646r;
    public final ArrayList f32647s;

    public au(ArrayList arrayList, boolean z4) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f32647s = new ArrayList(arrayList);
        }
        this.h = z4;
    }

    public static org.telegram.ui.Cells.z9 U(Context context) {
        float f10;
        org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context);
        float f11 = 12.0f;
        if (LocaleController.isRTL) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (!LocaleController.isRTL) {
            f11 = 16.0f;
        }
        z9Var.setPadding(dp, 0, AndroidUtilities.dp(f11), 0);
        ?? obj = new Object();
        obj.f38586a = new st(0, z9Var);
        z9Var.addOnAttachStateChangeListener(obj);
        return z9Var;
    }

    public static SpannableStringBuilder V(ut utVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(utVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) utVar.f38913a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20184u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 3));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new hb(this, 7);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.G(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20256y6, false), true);
        this.actionBar.G(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f32644f = false;
        this.e = false;
        wt wtVar = new wt(this, context, this.f32647s, this.f32645n);
        this.f32643c = wtVar;
        this.d = new yt(this, context, wtVar.f39769s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f32642b = mzVar;
        mzVar.c();
        this.f32642b.setShowAtCenter(true);
        this.f32642b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f32642b, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.f32641a = rl0Var;
        rl0Var.setSectionsType(3);
        this.f32641a.setEmptyView(this.f32642b);
        this.f32641a.setVerticalScrollBarEnabled(false);
        this.f32641a.setFastScrollEnabled(0);
        this.f32641a.setFastScrollVisible(true);
        this.f32641a.setLayoutManager(new f2.i0(1, false));
        this.f32641a.setAdapter(this.f32643c);
        org.telegram.ui.Components.rl0 rl0Var2 = this.f32641a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        rl0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f32641a, k7.b6.c(-1.0f, -1));
        this.f32641a.setOnItemClickListener(new j(this, 6));
        this.f32641a.setOnScrollListener(new n3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20151s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32641a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32641a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32641a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32641a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20025l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32641a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20043m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32641a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20061n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32642b, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19864c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32641a, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32641a, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32641a, 524288, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        wt wtVar = this.f32643c;
        if (wtVar != null) {
            wtVar.X(false);
        }
    }
}
