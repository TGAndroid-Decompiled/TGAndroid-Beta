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
public final class hr0 extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.wr0 f34282y = new org.telegram.ui.Components.wr0(4);
    public final cr0 f34283a;
    public final cr0 f34284b;
    public org.telegram.ui.ActionBar.v0 f34285c;
    public org.telegram.ui.Components.ju d;
    public boolean e;
    public final Paint f34286f;
    public ScrollSlidingTextTabStrip h;
    public final fr0[] f34287n;
    public AnimatorSet f34288r;
    public boolean f34289s;
    public boolean v;
    public boolean f34290w;
    public int f34291x;

    public hr0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, zn znVar) {
        super(null);
        this.e = true;
        this.f34286f = new Paint();
        this.f34287n = new fr0[2];
        this.f34283a = new cr0(0, null, hashMap, arrayList, i10, z10, znVar, false);
        this.f34284b = new cr0(1, null, hashMap, arrayList, i10, z10, znVar, false);
    }

    public static void g0(hr0 hr0Var, float f7) {
        hr0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            fr0[] fr0VarArr = hr0Var.f34287n;
            if (i10 < fr0VarArr.length) {
                fr0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                hr0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(hr0 hr0Var, String str) {
        hr0Var.f34285c.getSearchField().setText(str);
        hr0Var.f34285c.getSearchField().setSelection(str.length());
        hr0Var.actionBar.w();
    }

    @Override
    public final View createView(Context context) {
        fr0[] fr0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19180h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19216j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z10 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 15);
        this.f34285c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f34285c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.j6.Y9;
        int i12 = org.telegram.ui.ActionBar.j6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, w7.y5.e(-1, 44, 83));
        this.h.setDelegate(new dr0(this));
        this.f34291x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        er0 er0Var = new er0(this, context);
        this.fragmentView = er0Var;
        er0Var.setWillNotDraw(false);
        cr0 cr0Var = this.f34283a;
        cr0Var.setParentFragment(this);
        org.telegram.ui.Components.ju juVar = cr0Var.f32859d0;
        this.d = juVar;
        juVar.setSizeNotifierLayout(er0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = cr0Var.f32858c0;
                    } else {
                        view = cr0Var.f32856b0;
                    }
                } else {
                    view = cr0Var.f32854a0;
                }
            } else {
                view = cr0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = cr0Var.Z;
        j0 j0Var = cr0Var.f32854a0;
        s50 s50Var = cr0Var.f32856b0;
        View view2 = cr0Var.f32858c0;
        org.telegram.ui.Components.ju juVar2 = cr0Var.f32859d0;
        cr0 cr0Var2 = this.f34284b;
        cr0Var2.Z = frameLayout;
        cr0Var2.f32854a0 = j0Var;
        cr0Var2.f32859d0 = juVar2;
        cr0Var2.f32856b0 = s50Var;
        cr0Var2.f32858c0 = view2;
        cr0Var2.f32873q0 = false;
        cr0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            fr0VarArr = this.f34287n;
            if (i14 >= fr0VarArr.length) {
                break;
            }
            fr0 fr0Var = new fr0(this, context);
            fr0VarArr[i14] = fr0Var;
            er0Var.addView(fr0Var, w7.y5.c(-1.0f, -1));
            if (i14 == 0) {
                fr0 fr0Var2 = fr0VarArr[i14];
                fr0Var2.f33735a = cr0Var;
                fr0Var2.d = cr0Var.K;
            } else if (i14 == 1) {
                fr0 fr0Var3 = fr0VarArr[i14];
                fr0Var3.f33735a = cr0Var2;
                fr0Var3.d = cr0Var2.K;
                fr0Var3.setVisibility(8);
            }
            fr0VarArr[i14].d.setScrollingTouchSlop(1);
            fr0 fr0Var4 = fr0VarArr[i14];
            fr0Var4.f33736b = (FrameLayout) fr0Var4.f33735a.getFragmentView();
            fr0VarArr[i14].d.setClipToPadding(false);
            fr0 fr0Var5 = fr0VarArr[i14];
            fr0Var5.f33737c = fr0Var5.f33735a.getActionBar();
            fr0 fr0Var6 = fr0VarArr[i14];
            fr0Var6.addView(fr0Var6.f33736b, w7.y5.c(-1.0f, -1));
            fr0 fr0Var7 = fr0VarArr[i14];
            fr0Var7.addView(fr0Var7.f33737c, w7.y5.c(-2.0f, -1));
            fr0VarArr[i14].f33737c.setVisibility(8);
            fr0VarArr[i14].d.setOnScrollListener(new ii.m3(7, this, fr0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        er0Var.addView(this.actionBar, w7.y5.c(-2.0f, -1));
        er0Var.addView(cr0Var.Z, w7.y5.e(-1, 48, 83));
        er0Var.addView(cr0Var.f32854a0, w7.y5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        er0Var.addView(cr0Var.f32856b0, w7.y5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                fr0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19180h5, false);
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
        int i10 = org.telegram.ui.ActionBar.j6.f19180h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f19216j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34285c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.j6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f34283a.getThemeDescriptions());
        arrayList.addAll(this.f34284b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        fr0[] fr0VarArr;
        int i10 = 0;
        while (true) {
            fr0VarArr = this.f34287n;
            if (i10 >= fr0VarArr.length) {
                break;
            }
            fr0VarArr[i10].d.C0();
            i10++;
        }
        fr0VarArr[z10 ? 1 : 0].d.getAdapter();
        fr0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.c0) fr0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cr0 cr0Var = this.f34283a;
        if (cr0Var != null) {
            cr0Var.onConfigurationChanged(configuration);
        }
        cr0 cr0Var2 = this.f34284b;
        if (cr0Var2 != null) {
            cr0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        cr0 cr0Var = this.f34283a;
        if (cr0Var != null) {
            cr0Var.onFragmentDestroy();
        }
        cr0 cr0Var2 = this.f34284b;
        if (cr0Var2 != null) {
            cr0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        cr0 cr0Var = this.f34283a;
        if (cr0Var != null) {
            cr0Var.onPause();
        }
        cr0 cr0Var2 = this.f34284b;
        if (cr0Var2 != null) {
            cr0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.v0 v0Var = this.f34285c;
        if (v0Var != null) {
            v0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        cr0 cr0Var = this.f34283a;
        if (cr0Var != null) {
            cr0Var.onResume();
        }
        cr0 cr0Var2 = this.f34284b;
        if (cr0Var2 != null) {
            cr0Var2.onResume();
        }
    }
}
