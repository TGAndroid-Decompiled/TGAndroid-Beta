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
public final class oq0 extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.gs0 f39959y = new org.telegram.ui.Components.gs0(4);
    public final jq0 f39960a;
    public final jq0 f39961b;
    public org.telegram.ui.ActionBar.u0 f39962c;
    public org.telegram.ui.Components.qu d;
    public boolean e;
    public final Paint f39963f;
    public ScrollSlidingTextTabStrip h;
    public final mq0[] f39964n;
    public AnimatorSet f39965r;
    public boolean f39966s;
    public boolean v;
    public boolean f39967w;
    public int f39968x;

    public oq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, qn qnVar) {
        super(null);
        this.e = true;
        this.f39963f = new Paint();
        this.f39964n = new mq0[2];
        this.f39960a = new jq0(0, null, hashMap, arrayList, i10, z10, qnVar, false);
        this.f39961b = new jq0(1, null, hashMap, arrayList, i10, z10, qnVar, false);
    }

    public static void g0(oq0 oq0Var, float f7) {
        oq0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            mq0[] mq0VarArr = oq0Var.f39964n;
            if (i10 < mq0VarArr.length) {
                mq0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                oq0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(oq0 oq0Var, String str) {
        oq0Var.f39962c.getSearchField().setText(str);
        oq0Var.f39962c.getSearchField().setSelection(str.length());
        oq0Var.actionBar.x();
    }

    @Override
    public final View createView(Context context) {
        mq0[] mq0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21061h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21096j5;
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
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 19));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 14);
        this.f39962c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f39962c.getSearchField();
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
        this.h.setDelegate(new kq0(this));
        this.f39968x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        lq0 lq0Var = new lq0(this, context);
        this.fragmentView = lq0Var;
        lq0Var.setWillNotDraw(false);
        jq0 jq0Var = this.f39960a;
        jq0Var.setParentFragment(this);
        org.telegram.ui.Components.qu quVar = jq0Var.f38306d0;
        this.d = quVar;
        quVar.setSizeNotifierLayout(lq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = jq0Var.f38305c0;
                    } else {
                        view = jq0Var.f38303b0;
                    }
                } else {
                    view = jq0Var.f38301a0;
                }
            } else {
                view = jq0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = jq0Var.Z;
        m0 m0Var = jq0Var.f38301a0;
        v10 v10Var = jq0Var.f38303b0;
        View view2 = jq0Var.f38305c0;
        org.telegram.ui.Components.qu quVar2 = jq0Var.f38306d0;
        jq0 jq0Var2 = this.f39961b;
        jq0Var2.Z = frameLayout;
        jq0Var2.f38301a0 = m0Var;
        jq0Var2.f38306d0 = quVar2;
        jq0Var2.f38303b0 = v10Var;
        jq0Var2.f38305c0 = view2;
        jq0Var2.f38320q0 = false;
        jq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            mq0VarArr = this.f39964n;
            if (i14 >= mq0VarArr.length) {
                break;
            }
            mq0 mq0Var = new mq0(this, context);
            mq0VarArr[i14] = mq0Var;
            float f10 = f7;
            lq0Var.addView(mq0Var, w7.z5.c(-1.0f, -1));
            if (i14 == 0) {
                mq0 mq0Var2 = mq0VarArr[i14];
                mq0Var2.f39331a = jq0Var;
                mq0Var2.d = jq0Var.K;
            } else if (i14 == 1) {
                mq0 mq0Var3 = mq0VarArr[i14];
                mq0Var3.f39331a = jq0Var2;
                mq0Var3.d = jq0Var2.K;
                mq0Var3.setVisibility(8);
            }
            mq0VarArr[i14].d.setScrollingTouchSlop(1);
            mq0 mq0Var4 = mq0VarArr[i14];
            mq0Var4.f39332b = (FrameLayout) mq0Var4.f39331a.getFragmentView();
            mq0VarArr[i14].d.setClipToPadding(false);
            mq0 mq0Var5 = mq0VarArr[i14];
            mq0Var5.f39333c = mq0Var5.f39331a.getActionBar();
            mq0 mq0Var6 = mq0VarArr[i14];
            mq0Var6.addView(mq0Var6.f39332b, w7.z5.c(-1.0f, -1));
            mq0 mq0Var7 = mq0VarArr[i14];
            mq0Var7.addView(mq0Var7.f39333c, w7.z5.c(-2.0f, -1));
            mq0VarArr[i14].f39333c.setVisibility(8);
            mq0VarArr[i14].d.setOnScrollListener(new ki.m3(7, this, mq0VarArr[i14].d.getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        lq0Var.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        lq0Var.addView(jq0Var.Z, w7.z5.e(-1, 48, 83));
        lq0Var.addView(jq0Var.f38301a0, w7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        lq0Var.addView(jq0Var.f38303b0, w7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                mq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21061h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f21061h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f21096j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39962c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f39960a.getThemeDescriptions());
        arrayList.addAll(this.f39961b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        mq0[] mq0VarArr;
        int i10 = 0;
        while (true) {
            mq0VarArr = this.f39964n;
            if (i10 >= mq0VarArr.length) {
                break;
            }
            mq0VarArr[i10].d.B0();
            i10++;
        }
        mq0VarArr[z10 ? 1 : 0].d.getAdapter();
        mq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.b0) mq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jq0 jq0Var = this.f39960a;
        if (jq0Var != null) {
            jq0Var.onConfigurationChanged(configuration);
        }
        jq0 jq0Var2 = this.f39961b;
        if (jq0Var2 != null) {
            jq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        jq0 jq0Var = this.f39960a;
        if (jq0Var != null) {
            jq0Var.onFragmentDestroy();
        }
        jq0 jq0Var2 = this.f39961b;
        if (jq0Var2 != null) {
            jq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        jq0 jq0Var = this.f39960a;
        if (jq0Var != null) {
            jq0Var.onPause();
        }
        jq0 jq0Var2 = this.f39961b;
        if (jq0Var2 != null) {
            jq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.f39962c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        jq0 jq0Var = this.f39960a;
        if (jq0Var != null) {
            jq0Var.onResume();
        }
        jq0 jq0Var2 = this.f39961b;
        if (jq0Var2 != null) {
            jq0Var2.onResume();
        }
    }
}
