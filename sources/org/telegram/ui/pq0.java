package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class pq0 extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.es0 f40218y = new org.telegram.ui.Components.es0(4);
    public final kq0 f40219a;
    public final kq0 f40220b;
    public org.telegram.ui.ActionBar.u0 f40221c;
    public org.telegram.ui.Components.qu d;
    public boolean e;
    public final Paint f40222f;
    public ScrollSlidingTextTabStrip h;
    public final nq0[] f40223n;
    public AnimatorSet f40224r;
    public boolean f40225s;
    public boolean v;
    public boolean f40226w;
    public int f40227x;

    public pq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, sn snVar) {
        super(null);
        this.e = true;
        this.f40222f = new Paint();
        this.f40223n = new nq0[2];
        this.f40219a = new kq0(0, null, hashMap, arrayList, i10, z10, snVar, false);
        this.f40220b = new kq0(1, null, hashMap, arrayList, i10, z10, snVar, false);
    }

    public static void g0(pq0 pq0Var, float f7) {
        pq0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            nq0[] nq0VarArr = pq0Var.f40223n;
            if (i10 < nq0VarArr.length) {
                nq0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                pq0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(pq0 pq0Var, String str) {
        pq0Var.f40221c.getSearchField().setText(str);
        pq0Var.f40221c.getSearchField().setSelection(str.length());
        pq0Var.actionBar.x();
    }

    @Override
    public final View createView(Context context) {
        nq0[] nq0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21092j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f7 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z10 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new q60(this, 19));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.a2(this, 14);
        this.f40221c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f40221c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.h6.Y9;
        int i12 = org.telegram.ui.ActionBar.h6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.d();
        this.actionBar.addView(this.h, w7.z5.e(-1, 44, 83));
        this.h.setDelegate(new lq0(this));
        this.f40227x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        mq0 mq0Var = new mq0(this, context);
        this.fragmentView = mq0Var;
        mq0Var.setWillNotDraw(false);
        kq0 kq0Var = this.f40219a;
        kq0Var.setParentFragment(this);
        org.telegram.ui.Components.qu quVar = kq0Var.f38643d0;
        this.d = quVar;
        quVar.setSizeNotifierLayout(mq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = kq0Var.f38642c0;
                    } else {
                        view = kq0Var.f38640b0;
                    }
                } else {
                    view = kq0Var.f38638a0;
                }
            } else {
                view = kq0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = kq0Var.Z;
        m0 m0Var = kq0Var.f38638a0;
        x10 x10Var = kq0Var.f38640b0;
        View view2 = kq0Var.f38642c0;
        org.telegram.ui.Components.qu quVar2 = kq0Var.f38643d0;
        kq0 kq0Var2 = this.f40220b;
        kq0Var2.Z = frameLayout;
        kq0Var2.f38638a0 = m0Var;
        kq0Var2.f38643d0 = quVar2;
        kq0Var2.f38640b0 = x10Var;
        kq0Var2.f38642c0 = view2;
        kq0Var2.f38657q0 = false;
        kq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            nq0VarArr = this.f40223n;
            if (i14 >= nq0VarArr.length) {
                break;
            }
            nq0 nq0Var = new nq0(this, context);
            nq0VarArr[i14] = nq0Var;
            float f10 = f7;
            mq0Var.addView(nq0Var, w7.z5.d(-1.0f, -1));
            if (i14 == 0) {
                nq0 nq0Var2 = nq0VarArr[i14];
                nq0Var2.f39519a = kq0Var;
                nq0Var2.d = kq0Var.K;
            } else if (i14 == 1) {
                nq0 nq0Var3 = nq0VarArr[i14];
                nq0Var3.f39519a = kq0Var2;
                nq0Var3.d = kq0Var2.K;
                nq0Var3.setVisibility(8);
            }
            nq0VarArr[i14].d.setScrollingTouchSlop(1);
            nq0 nq0Var4 = nq0VarArr[i14];
            nq0Var4.f39520b = (FrameLayout) nq0Var4.f39519a.getFragmentView();
            nq0VarArr[i14].d.setClipToPadding(false);
            nq0 nq0Var5 = nq0VarArr[i14];
            nq0Var5.f39521c = nq0Var5.f39519a.getActionBar();
            nq0 nq0Var6 = nq0VarArr[i14];
            nq0Var6.addView(nq0Var6.f39520b, w7.z5.d(-1.0f, -1));
            nq0 nq0Var7 = nq0VarArr[i14];
            nq0Var7.addView(nq0Var7.f39521c, w7.z5.d(-2.0f, -1));
            nq0VarArr[i14].f39521c.setVisibility(8);
            nq0VarArr[i14].d.setOnScrollListener(new ki.m3(7, this, nq0VarArr[i14].d.getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        mq0Var.addView(this.actionBar, w7.z5.d(-2.0f, -1));
        mq0Var.addView(kq0Var.Z, w7.z5.e(-1, 48, 83));
        mq0Var.addView(kq0Var.f38638a0, w7.z5.a(60.0f, 0.0f, 0.0f, 12.0f, 10.0f, 60, 85));
        mq0Var.addView(kq0Var.f38640b0, w7.z5.a(24.0f, 0.0f, 0.0f, -2.0f, 9.0f, 42, 85));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                nq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f21057h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f21092j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40221c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f40219a.getThemeDescriptions());
        arrayList.addAll(this.f40220b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        nq0[] nq0VarArr;
        int i10 = 0;
        while (true) {
            nq0VarArr = this.f40223n;
            if (i10 >= nq0VarArr.length) {
                break;
            }
            nq0VarArr[i10].d.B0();
            i10++;
        }
        nq0VarArr[z10 ? 1 : 0].d.getAdapter();
        nq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.b0) nq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kq0 kq0Var = this.f40219a;
        if (kq0Var != null) {
            kq0Var.onConfigurationChanged(configuration);
        }
        kq0 kq0Var2 = this.f40220b;
        if (kq0Var2 != null) {
            kq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        kq0 kq0Var = this.f40219a;
        if (kq0Var != null) {
            kq0Var.onFragmentDestroy();
        }
        kq0 kq0Var2 = this.f40220b;
        if (kq0Var2 != null) {
            kq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        kq0 kq0Var = this.f40219a;
        if (kq0Var != null) {
            kq0Var.onPause();
        }
        kq0 kq0Var2 = this.f40220b;
        if (kq0Var2 != null) {
            kq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.f40221c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        kq0 kq0Var = this.f40219a;
        if (kq0Var != null) {
            kq0Var.onResume();
        }
        kq0 kq0Var2 = this.f40220b;
        if (kq0Var2 != null) {
            kq0Var2.onResume();
        }
    }
}
