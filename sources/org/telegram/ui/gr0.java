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
public final class gr0 extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.ns0 f38083y = new org.telegram.ui.Components.ns0(4);
    public final br0 f38084a;
    public final br0 f38085b;
    public org.telegram.ui.ActionBar.v0 f38086c;
    public org.telegram.ui.Components.zu d;
    public boolean f38087e;
    public final Paint f38088f;
    public ScrollSlidingTextTabStrip h;
    public final er0[] f38089n;
    public AnimatorSet f38090r;
    public boolean f38091s;
    public boolean v;
    public boolean f38092w;
    public int f38093x;

    public gr0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, zn znVar) {
        super(null);
        this.f38087e = true;
        this.f38088f = new Paint();
        this.f38089n = new er0[2];
        this.f38084a = new br0(0, null, hashMap, arrayList, i10, z10, znVar, false);
        this.f38085b = new br0(1, null, hashMap, arrayList, i10, z10, znVar, false);
    }

    public static void g0(gr0 gr0Var, float f7) {
        gr0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            er0[] er0VarArr = gr0Var.f38089n;
            if (i10 < er0VarArr.length) {
                er0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                gr0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(gr0 gr0Var, String str) {
        gr0Var.f38086c.getSearchField().setText(str);
        gr0Var.f38086c.getSearchField().setSelection(str.length());
        gr0Var.actionBar.x();
    }

    @Override
    public final View createView(Context context) {
        er0[] er0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f20905j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.actionBar.D(org.telegram.ui.ActionBar.i6.x0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I5, false), false);
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
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 14);
        this.f38086c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f38086c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.i6.Y9;
        int i12 = org.telegram.ui.ActionBar.i6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, w7.x5.e(-1, 44, 83));
        this.h.setDelegate(new cr0(this));
        this.f38093x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        dr0 dr0Var = new dr0(this, context);
        this.fragmentView = dr0Var;
        dr0Var.setWillNotDraw(false);
        br0 br0Var = this.f38084a;
        br0Var.setParentFragment(this);
        org.telegram.ui.Components.zu zuVar = br0Var.f36395d0;
        this.d = zuVar;
        zuVar.setSizeNotifierLayout(dr0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = br0Var.f36394c0;
                    } else {
                        view = br0Var.f36392b0;
                    }
                } else {
                    view = br0Var.f36390a0;
                }
            } else {
                view = br0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = br0Var.Z;
        k0 k0Var = br0Var.f36390a0;
        q50 q50Var = br0Var.f36392b0;
        View view2 = br0Var.f36394c0;
        org.telegram.ui.Components.zu zuVar2 = br0Var.f36395d0;
        br0 br0Var2 = this.f38085b;
        br0Var2.Z = frameLayout;
        br0Var2.f36390a0 = k0Var;
        br0Var2.f36395d0 = zuVar2;
        br0Var2.f36392b0 = q50Var;
        br0Var2.f36394c0 = view2;
        br0Var2.f36410q0 = false;
        br0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            er0VarArr = this.f38089n;
            if (i14 >= er0VarArr.length) {
                break;
            }
            er0 er0Var = new er0(this, context);
            er0VarArr[i14] = er0Var;
            float f10 = f7;
            dr0Var.addView(er0Var, w7.x5.d(-1.0f, -1));
            if (i14 == 0) {
                er0 er0Var2 = er0VarArr[i14];
                er0Var2.f37314a = br0Var;
                er0Var2.d = br0Var.K;
            } else if (i14 == 1) {
                er0 er0Var3 = er0VarArr[i14];
                er0Var3.f37314a = br0Var2;
                er0Var3.d = br0Var2.K;
                er0Var3.setVisibility(8);
            }
            er0VarArr[i14].d.setScrollingTouchSlop(1);
            er0 er0Var4 = er0VarArr[i14];
            er0Var4.f37315b = (FrameLayout) er0Var4.f37314a.getFragmentView();
            er0VarArr[i14].d.setClipToPadding(false);
            er0 er0Var5 = er0VarArr[i14];
            er0Var5.f37316c = er0Var5.f37314a.getActionBar();
            er0 er0Var6 = er0VarArr[i14];
            er0Var6.addView(er0Var6.f37315b, w7.x5.d(-1.0f, -1));
            er0 er0Var7 = er0VarArr[i14];
            er0Var7.addView(er0Var7.f37316c, w7.x5.d(-2.0f, -1));
            er0VarArr[i14].f37316c.setVisibility(8);
            er0VarArr[i14].d.setOnScrollListener(new ii.n3(7, this, er0VarArr[i14].d.getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        dr0Var.addView(this.actionBar, w7.x5.d(-2.0f, -1));
        dr0Var.addView(br0Var.Z, w7.x5.e(-1, 48, 83));
        dr0Var.addView(br0Var.f36390a0, w7.x5.a(60.0f, 0.0f, 0.0f, 12.0f, 10.0f, 60, 85));
        dr0Var.addView(br0Var.f36392b0, w7.x5.a(24.0f, 0.0f, 0.0f, -2.0f, 9.0f, 42, 85));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                er0VarArr[0].f37317e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.f38087e = z10;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20868h5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.i6.f20905j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.i6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.i6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38086c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.i6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.i6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f38084a.getThemeDescriptions());
        arrayList.addAll(this.f38085b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f38087e;
    }

    public final void j0(boolean z10) {
        er0[] er0VarArr;
        int i10 = 0;
        while (true) {
            er0VarArr = this.f38089n;
            if (i10 >= er0VarArr.length) {
                break;
            }
            er0VarArr[i10].d.B0();
            i10++;
        }
        er0VarArr[z10 ? 1 : 0].d.getAdapter();
        er0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.d0) er0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        br0 br0Var = this.f38084a;
        if (br0Var != null) {
            br0Var.onConfigurationChanged(configuration);
        }
        br0 br0Var2 = this.f38085b;
        if (br0Var2 != null) {
            br0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        br0 br0Var = this.f38084a;
        if (br0Var != null) {
            br0Var.onFragmentDestroy();
        }
        br0 br0Var2 = this.f38085b;
        if (br0Var2 != null) {
            br0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        br0 br0Var = this.f38084a;
        if (br0Var != null) {
            br0Var.onPause();
        }
        br0 br0Var2 = this.f38085b;
        if (br0Var2 != null) {
            br0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.v0 v0Var = this.f38086c;
        if (v0Var != null) {
            v0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        br0 br0Var = this.f38084a;
        if (br0Var != null) {
            br0Var.onResume();
        }
        br0 br0Var2 = this.f38085b;
        if (br0Var2 != null) {
            br0Var2.onResume();
        }
    }
}
