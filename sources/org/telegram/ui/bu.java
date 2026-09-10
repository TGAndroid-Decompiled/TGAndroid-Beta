package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bu extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.Components.vl0 f31400a;
    public org.telegram.ui.Components.tz f31401b;
    public yt f31402c;
    public zt d;
    public boolean e;
    public boolean f31403f;
    public final boolean h;
    public boolean f31404n;
    public au f31405r;
    public final ArrayList f31406s;

    public bu(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f31406s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ga U(Context context) {
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
        obj.f37621a = new ut(0, gaVar);
        gaVar.addOnAttachStateChangeListener(obj);
        return gaVar;
    }

    public static SpannableStringBuilder V(wt wtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(wtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.sz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) wtVar.f38386a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        lVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18238u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 16));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f31403f = false;
        this.e = false;
        yt ytVar = new yt(this, context, this.f31406s, this.f31404n);
        this.f31402c = ytVar;
        this.d = new zt(this, context, ytVar.f39112s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.f31401b = tzVar;
        tzVar.c();
        this.f31401b.setShowAtCenter(true);
        this.f31401b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f31401b, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f31400a = vl0Var;
        vl0Var.setSectionsType(3);
        this.f31400a.setEmptyView(this.f31401b);
        this.f31400a.setVerticalScrollBarEnabled(false);
        this.f31400a.setFastScrollEnabled(0);
        this.f31400a.setFastScrollVisible(true);
        this.f31400a.setLayoutManager(new s4.c0(1, false));
        this.f31400a.setAdapter(this.f31402c);
        org.telegram.ui.Components.vl0 vl0Var2 = this.f31400a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        vl0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f31400a, w7.a6.c(-1.0f, -1));
        this.f31400a.setOnItemClickListener(new i(this, 6));
        this.f31400a.setOnScrollListener(new j3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18201s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31400a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31400a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31400a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31400a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18074l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31400a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18092m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31400a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f18111n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31401b, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f17911c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31400a, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31400a, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31400a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        yt ytVar = this.f31402c;
        if (ytVar != null) {
            ytVar.X(false);
        }
    }
}
