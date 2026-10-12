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
public final class mr0 extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.js0 f38317y = new org.telegram.ui.Components.js0(4);
    public final hr0 f38318a;
    public final hr0 f38319b;
    public org.telegram.ui.ActionBar.u0 f38320c;
    public org.telegram.ui.Components.vu d;
    public boolean e;
    public final Paint f38321f;
    public ScrollSlidingTextTabStrip h;
    public final kr0[] f38322n;
    public AnimatorSet f38323r;
    public boolean f38324s;
    public boolean v;
    public boolean f38325w;
    public int f38326x;

    public mr0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, fo foVar) {
        super(null);
        this.e = true;
        this.f38321f = new Paint();
        this.f38322n = new kr0[2];
        this.f38318a = new hr0(0, null, hashMap, arrayList, i10, z10, foVar, false);
        this.f38319b = new hr0(1, null, hashMap, arrayList, i10, z10, foVar, false);
    }

    public static void g0(mr0 mr0Var, float f7) {
        mr0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            kr0[] kr0VarArr = mr0Var.f38322n;
            if (i10 < kr0VarArr.length) {
                kr0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                mr0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(mr0 mr0Var, String str) {
        mr0Var.f38320c.getSearchField().setText(str);
        mr0Var.f38320c.getSearchField().setSelection(str.length());
        mr0Var.actionBar.x();
    }

    @Override
    public final View createView(Context context) {
        kr0[] kr0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f20007j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f7 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z10 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 18));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 14);
        this.f38320c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f38320c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.g6.Y9;
        int i12 = org.telegram.ui.ActionBar.g6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.d();
        this.actionBar.addView(this.h, w7.a6.e(-1, 44, 83));
        this.h.setDelegate(new ir0(this));
        this.f38326x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        jr0 jr0Var = new jr0(this, context);
        this.fragmentView = jr0Var;
        jr0Var.setWillNotDraw(false);
        hr0 hr0Var = this.f38318a;
        hr0Var.setParentFragment(this);
        org.telegram.ui.Components.vu vuVar = hr0Var.f36919d0;
        this.d = vuVar;
        vuVar.setSizeNotifierLayout(jr0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = hr0Var.f36918c0;
                    } else {
                        view = hr0Var.f36916b0;
                    }
                } else {
                    view = hr0Var.f36914a0;
                }
            } else {
                view = hr0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = hr0Var.Z;
        l0 l0Var = hr0Var.f36914a0;
        x50 x50Var = hr0Var.f36916b0;
        View view2 = hr0Var.f36918c0;
        org.telegram.ui.Components.vu vuVar2 = hr0Var.f36919d0;
        hr0 hr0Var2 = this.f38319b;
        hr0Var2.Z = frameLayout;
        hr0Var2.f36914a0 = l0Var;
        hr0Var2.f36919d0 = vuVar2;
        hr0Var2.f36916b0 = x50Var;
        hr0Var2.f36918c0 = view2;
        hr0Var2.f36933q0 = false;
        hr0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            kr0VarArr = this.f38322n;
            if (i14 >= kr0VarArr.length) {
                break;
            }
            kr0 kr0Var = new kr0(this, context);
            kr0VarArr[i14] = kr0Var;
            float f10 = f7;
            jr0Var.addView(kr0Var, w7.a6.d(-1.0f, -1));
            if (i14 == 0) {
                kr0 kr0Var2 = kr0VarArr[i14];
                kr0Var2.f37712a = hr0Var;
                kr0Var2.d = hr0Var.K;
            } else if (i14 == 1) {
                kr0 kr0Var3 = kr0VarArr[i14];
                kr0Var3.f37712a = hr0Var2;
                kr0Var3.d = hr0Var2.K;
                kr0Var3.setVisibility(8);
            }
            kr0VarArr[i14].d.setScrollingTouchSlop(1);
            kr0 kr0Var4 = kr0VarArr[i14];
            kr0Var4.f37713b = (FrameLayout) kr0Var4.f37712a.getFragmentView();
            kr0VarArr[i14].d.setClipToPadding(false);
            kr0 kr0Var5 = kr0VarArr[i14];
            kr0Var5.f37714c = kr0Var5.f37712a.getActionBar();
            kr0 kr0Var6 = kr0VarArr[i14];
            kr0Var6.addView(kr0Var6.f37713b, w7.a6.d(-1.0f, -1));
            kr0 kr0Var7 = kr0VarArr[i14];
            kr0Var7.addView(kr0Var7.f37714c, w7.a6.d(-2.0f, -1));
            kr0VarArr[i14].f37714c.setVisibility(8);
            kr0VarArr[i14].d.setOnScrollListener(new ji.n3(7, this, kr0VarArr[i14].d.getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        jr0Var.addView(this.actionBar, w7.a6.d(-2.0f, -1));
        jr0Var.addView(hr0Var.Z, w7.a6.e(-1, 48, 83));
        jr0Var.addView(hr0Var.f36914a0, w7.a6.a(60.0f, 0.0f, 0.0f, 12.0f, 10.0f, 60, 85));
        jr0Var.addView(hr0Var.f36916b0, w7.a6.a(24.0f, 0.0f, 0.0f, -2.0f, 9.0f, 42, 85));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                kr0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f19972h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f20007j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38320c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.g6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f38318a.getThemeDescriptions());
        arrayList.addAll(this.f38319b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        kr0[] kr0VarArr;
        int i10 = 0;
        while (true) {
            kr0VarArr = this.f38322n;
            if (i10 >= kr0VarArr.length) {
                break;
            }
            kr0VarArr[i10].d.B0();
            i10++;
        }
        kr0VarArr[z10 ? 1 : 0].d.getAdapter();
        kr0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.b0) kr0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hr0 hr0Var = this.f38318a;
        if (hr0Var != null) {
            hr0Var.onConfigurationChanged(configuration);
        }
        hr0 hr0Var2 = this.f38319b;
        if (hr0Var2 != null) {
            hr0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        hr0 hr0Var = this.f38318a;
        if (hr0Var != null) {
            hr0Var.onFragmentDestroy();
        }
        hr0 hr0Var2 = this.f38319b;
        if (hr0Var2 != null) {
            hr0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        hr0 hr0Var = this.f38318a;
        if (hr0Var != null) {
            hr0Var.onPause();
        }
        hr0 hr0Var2 = this.f38319b;
        if (hr0Var2 != null) {
            hr0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.f38320c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        hr0 hr0Var = this.f38318a;
        if (hr0Var != null) {
            hr0Var.onResume();
        }
        hr0 hr0Var2 = this.f38319b;
        if (hr0Var2 != null) {
            hr0Var2.onResume();
        }
    }
}
