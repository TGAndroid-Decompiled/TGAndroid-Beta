package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class os extends org.telegram.ui.ActionBar.d2 {
    public org.telegram.ui.Components.tj0 f48338a;
    public org.telegram.ui.Components.gy f48339b;
    public ms f48340c;
    public org.telegram.ui.Components.nj d;
    public boolean f48341e;
    public boolean f48342f;
    public final boolean h;
    public boolean f48343n;
    public ns f48344r;
    public final ArrayList f48345s;

    public os(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f48345s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.v9 Z(Context context) {
        float f10;
        org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
        float f11 = 12.0f;
        if (org.telegram.messenger.bd.f21784a0) {
            f10 = 16.0f;
        } else {
            f10 = 12.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        if (!org.telegram.messenger.bd.f21784a0) {
            f11 = 16.0f;
        }
        v9Var.setPadding(L, 0, org.telegram.messenger.g0.L(f11), 0);
        g5 g5Var = new g5();
        g5Var.f45532b = new js(0, v9Var);
        v9Var.addOnAttachStateChangeListener(g5Var);
        return v9Var;
    }

    public static SpannableStringBuilder a0(ks ksVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.bd.F0(ksVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.fy(1), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ksVar.f47004a);
        return spannableStringBuilder;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131752134, null));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        int i10 = 1;
        org.telegram.ui.ActionBar.r6.m(kVar, 1, i3, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f28198u8, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 5, i3, null);
        this.actionBar.setActionBarMenuOnItemClick(new o9(this, 23));
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.I = new lg.w1(this, 9);
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.actionBar.I(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false), true);
        this.actionBar.I(org.telegram.ui.ActionBar.k6.x0(null, i3, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f48342f = false;
        this.f48341e = false;
        ms msVar = new ms(this, context, this.f48345s, this.f48343n);
        this.f48340c = msVar;
        this.d = new org.telegram.ui.Components.nj(this, context, msVar.f47773s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.f48339b = gyVar;
        gyVar.c();
        this.f48339b.setShowAtCenter(true);
        this.f48339b.setText(org.telegram.messenger.bd.M0(2131748175, null));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f48338a = tj0Var;
        tj0Var.setSectionsType(3);
        this.f48338a.setEmptyView(this.f48339b);
        this.f48338a.setVerticalScrollBarEnabled(false);
        this.f48338a.setFastScrollEnabled(0);
        this.f48338a.setFastScrollVisible(true);
        this.f48338a.setLayoutManager(new u4.b0(1, false));
        this.f48338a.setAdapter(this.f48340c);
        org.telegram.ui.Components.tj0 tj0Var2 = this.f48338a;
        if (!org.telegram.messenger.bd.f21784a0) {
            i10 = 2;
        }
        tj0Var2.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f48338a, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.f48339b, b8.mf.c(-1.0f, -1));
        this.f48338a.setOnItemClickListener(new h(this, 7));
        this.f48338a.setOnScrollListener(new h3(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48338a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28027l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48338a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28044m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48338a, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28063n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48339b, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27862c7));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        ms msVar = this.f48340c;
        if (msVar != null) {
            msVar.X(false);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.I(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false), true);
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                int i3 = org.telegram.ui.ActionBar.k6.G6;
                kVar2.I(org.telegram.ui.ActionBar.k6.x0(null, i3, false), false);
                this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            }
            org.telegram.ui.Components.tj0 tj0Var = this.f48338a;
            if (tj0Var != null) {
                tj0Var.x1();
                if (this.f48338a.getFastScroll() != null) {
                    this.f48338a.getFastScroll().invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
