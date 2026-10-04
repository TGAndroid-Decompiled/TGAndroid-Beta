package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
public final class br0 extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.as0 f35180y = new org.telegram.ui.Components.as0(4);
    public final wq0 f35181a;
    public final wq0 f35182b;
    public org.telegram.ui.ActionBar.v0 f35183c;
    public org.telegram.ui.Components.mu d;
    public boolean f35184e;
    public final Paint f35185f;
    public ScrollSlidingTextTabStrip h;
    public final zq0[] f35186n;
    public AnimatorSet f35187r;
    public boolean f35188s;
    public boolean v;
    public boolean f35189w;
    public int f35190x;

    public br0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, yn ynVar) {
        super(null);
        this.f35184e = true;
        this.f35185f = new Paint();
        this.f35186n = new zq0[2];
        this.f35181a = new wq0(0, null, hashMap, arrayList, i10, z10, ynVar, false);
        this.f35182b = new wq0(1, null, hashMap, arrayList, i10, z10, ynVar, false);
    }

    public static void g0(br0 br0Var, float f7) {
        br0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            zq0[] zq0VarArr = br0Var.f35186n;
            if (i10 < zq0VarArr.length) {
                zq0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                br0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(br0 br0Var, String str) {
        br0Var.f35183c.getSearchField().setText(str);
        br0Var.f35183c.getSearchField().setSelection(str.length());
        br0Var.actionBar.w();
    }

    @Override
    public final View createView(Context context) {
        zq0[] zq0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20894h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f20930j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z10 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 15);
        this.f35183c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f35183c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.i6.Y9;
        int i12 = org.telegram.ui.ActionBar.i6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, w7.z5.e(-1, 44, 83));
        this.h.setDelegate(new xq0(this));
        this.f35190x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        yq0 yq0Var = new yq0(this, context);
        this.fragmentView = yq0Var;
        yq0Var.setWillNotDraw(false);
        wq0 wq0Var = this.f35181a;
        wq0Var.setParentFragment(this);
        org.telegram.ui.Components.mu muVar = wq0Var.f42606d0;
        this.d = muVar;
        muVar.setSizeNotifierLayout(yq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = wq0Var.f42605c0;
                    } else {
                        view = wq0Var.f42603b0;
                    }
                } else {
                    view = wq0Var.f42601a0;
                }
            } else {
                view = wq0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = wq0Var.Z;
        k0 k0Var = wq0Var.f42601a0;
        n20 n20Var = wq0Var.f42603b0;
        View view2 = wq0Var.f42605c0;
        org.telegram.ui.Components.mu muVar2 = wq0Var.f42606d0;
        wq0 wq0Var2 = this.f35182b;
        wq0Var2.Z = frameLayout;
        wq0Var2.f42601a0 = k0Var;
        wq0Var2.f42606d0 = muVar2;
        wq0Var2.f42603b0 = n20Var;
        wq0Var2.f42605c0 = view2;
        wq0Var2.f42621q0 = false;
        wq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            zq0VarArr = this.f35186n;
            if (i14 >= zq0VarArr.length) {
                break;
            }
            zq0 zq0Var = new zq0(this, context);
            zq0VarArr[i14] = zq0Var;
            yq0Var.addView(zq0Var, w7.z5.c(-1.0f, -1));
            if (i14 == 0) {
                zq0 zq0Var2 = zq0VarArr[i14];
                zq0Var2.f43870a = wq0Var;
                zq0Var2.d = wq0Var.K;
            } else if (i14 == 1) {
                zq0 zq0Var3 = zq0VarArr[i14];
                zq0Var3.f43870a = wq0Var2;
                zq0Var3.d = wq0Var2.K;
                zq0Var3.setVisibility(8);
            }
            zq0VarArr[i14].d.setScrollingTouchSlop(1);
            zq0 zq0Var4 = zq0VarArr[i14];
            zq0Var4.f43871b = (FrameLayout) zq0Var4.f43870a.getFragmentView();
            zq0VarArr[i14].d.setClipToPadding(false);
            zq0 zq0Var5 = zq0VarArr[i14];
            zq0Var5.f43872c = zq0Var5.f43870a.getActionBar();
            zq0 zq0Var6 = zq0VarArr[i14];
            zq0Var6.addView(zq0Var6.f43871b, w7.z5.c(-1.0f, -1));
            zq0 zq0Var7 = zq0VarArr[i14];
            zq0Var7.addView(zq0Var7.f43872c, w7.z5.c(-2.0f, -1));
            zq0VarArr[i14].f43872c.setVisibility(8);
            zq0VarArr[i14].d.setOnScrollListener(new ii.n3(7, this, zq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        yq0Var.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        yq0Var.addView(wq0Var.Z, w7.z5.e(-1, 48, 83));
        yq0Var.addView(wq0Var.f42601a0, w7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        yq0Var.addView(wq0Var.f42603b0, w7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                zq0VarArr[0].f43873e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.f35184e = z10;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20894h5, false);
        if (Build.VERSION.SDK_INT >= 23 && AndroidUtilities.computePerceivedBrightness(w02) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20894h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.f20930j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.i6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35183c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.i6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f35181a.getThemeDescriptions());
        arrayList.addAll(this.f35182b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f35184e;
    }

    public final void j0(boolean z10) {
        zq0[] zq0VarArr;
        int i10 = 0;
        while (true) {
            zq0VarArr = this.f35186n;
            if (i10 >= zq0VarArr.length) {
                break;
            }
            zq0VarArr[i10].d.C0();
            i10++;
        }
        zq0VarArr[z10 ? 1 : 0].d.getAdapter();
        zq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.c0) zq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wq0 wq0Var = this.f35181a;
        if (wq0Var != null) {
            wq0Var.onConfigurationChanged(configuration);
        }
        wq0 wq0Var2 = this.f35182b;
        if (wq0Var2 != null) {
            wq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        wq0 wq0Var = this.f35181a;
        if (wq0Var != null) {
            wq0Var.onFragmentDestroy();
        }
        wq0 wq0Var2 = this.f35182b;
        if (wq0Var2 != null) {
            wq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        wq0 wq0Var = this.f35181a;
        if (wq0Var != null) {
            wq0Var.onPause();
        }
        wq0 wq0Var2 = this.f35182b;
        if (wq0Var2 != null) {
            wq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.v0 v0Var = this.f35183c;
        if (v0Var != null) {
            v0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        wq0 wq0Var = this.f35181a;
        if (wq0Var != null) {
            wq0Var.onResume();
        }
        wq0 wq0Var2 = this.f35182b;
        if (wq0Var2 != null) {
            wq0Var2.onResume();
        }
    }
}
