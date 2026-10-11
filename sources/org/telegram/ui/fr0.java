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
public final class fr0 extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.ps0 f37745y = new org.telegram.ui.Components.ps0(4);
    public final ar0 f37746a;
    public final ar0 f37747b;
    public org.telegram.ui.ActionBar.u0 f37748c;
    public org.telegram.ui.Components.av d;
    public boolean f37749e;
    public final Paint f37750f;
    public ScrollSlidingTextTabStrip h;
    public final dr0[] f37751n;
    public AnimatorSet f37752r;
    public boolean f37753s;
    public boolean v;
    public boolean f37754w;
    public int f37755x;

    public fr0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, zn znVar) {
        super(null);
        this.f37749e = true;
        this.f37750f = new Paint();
        this.f37751n = new dr0[2];
        this.f37746a = new ar0(0, null, hashMap, arrayList, i10, z10, znVar, false);
        this.f37747b = new ar0(1, null, hashMap, arrayList, i10, z10, znVar, false);
    }

    public static void g0(fr0 fr0Var, float f7) {
        fr0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            dr0[] dr0VarArr = fr0Var.f37751n;
            if (i10 < dr0VarArr.length) {
                dr0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                fr0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(fr0 fr0Var, String str) {
        fr0Var.f37748c.getSearchField().setText(str);
        fr0Var.f37748c.getSearchField().setSelection(str.length());
        fr0Var.actionBar.x();
    }

    @Override
    public final View createView(Context context) {
        dr0[] dr0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20894j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
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
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 14);
        this.f37748c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f37748c.getSearchField();
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
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, w7.x5.e(-1, 44, 83));
        this.h.setDelegate(new br0(this));
        this.f37755x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        cr0 cr0Var = new cr0(this, context);
        this.fragmentView = cr0Var;
        cr0Var.setWillNotDraw(false);
        ar0 ar0Var = this.f37746a;
        ar0Var.setParentFragment(this);
        org.telegram.ui.Components.av avVar = ar0Var.f36139d0;
        this.d = avVar;
        avVar.setSizeNotifierLayout(cr0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = ar0Var.f36138c0;
                    } else {
                        view = ar0Var.f36136b0;
                    }
                } else {
                    view = ar0Var.f36134a0;
                }
            } else {
                view = ar0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = ar0Var.Z;
        j0 j0Var = ar0Var.f36134a0;
        q50 q50Var = ar0Var.f36136b0;
        View view2 = ar0Var.f36138c0;
        org.telegram.ui.Components.av avVar2 = ar0Var.f36139d0;
        ar0 ar0Var2 = this.f37747b;
        ar0Var2.Z = frameLayout;
        ar0Var2.f36134a0 = j0Var;
        ar0Var2.f36139d0 = avVar2;
        ar0Var2.f36136b0 = q50Var;
        ar0Var2.f36138c0 = view2;
        ar0Var2.f36154q0 = false;
        ar0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            dr0VarArr = this.f37751n;
            if (i14 >= dr0VarArr.length) {
                break;
            }
            dr0 dr0Var = new dr0(this, context);
            dr0VarArr[i14] = dr0Var;
            float f10 = f7;
            cr0Var.addView(dr0Var, w7.x5.d(-1.0f, -1));
            if (i14 == 0) {
                dr0 dr0Var2 = dr0VarArr[i14];
                dr0Var2.f37072a = ar0Var;
                dr0Var2.d = ar0Var.K;
            } else if (i14 == 1) {
                dr0 dr0Var3 = dr0VarArr[i14];
                dr0Var3.f37072a = ar0Var2;
                dr0Var3.d = ar0Var2.K;
                dr0Var3.setVisibility(8);
            }
            dr0VarArr[i14].d.setScrollingTouchSlop(1);
            dr0 dr0Var4 = dr0VarArr[i14];
            dr0Var4.f37073b = (FrameLayout) dr0Var4.f37072a.getFragmentView();
            dr0VarArr[i14].d.setClipToPadding(false);
            dr0 dr0Var5 = dr0VarArr[i14];
            dr0Var5.f37074c = dr0Var5.f37072a.getActionBar();
            dr0 dr0Var6 = dr0VarArr[i14];
            dr0Var6.addView(dr0Var6.f37073b, w7.x5.d(-1.0f, -1));
            dr0 dr0Var7 = dr0VarArr[i14];
            dr0Var7.addView(dr0Var7.f37074c, w7.x5.d(-2.0f, -1));
            dr0VarArr[i14].f37074c.setVisibility(8);
            dr0VarArr[i14].d.setOnScrollListener(new ii.n3(7, this, dr0VarArr[i14].d.getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        cr0Var.addView(this.actionBar, w7.x5.d(-2.0f, -1));
        cr0Var.addView(ar0Var.Z, w7.x5.e(-1, 48, 83));
        cr0Var.addView(ar0Var.f36134a0, w7.x5.a(60.0f, 0.0f, 0.0f, 12.0f, 10.0f, 60, 85));
        cr0Var.addView(ar0Var.f36136b0, w7.x5.a(24.0f, 0.0f, 0.0f, -2.0f, 9.0f, 42, 85));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                dr0VarArr[0].f37075e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.f37749e = z10;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20857h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f20894j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f37748c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f37746a.getThemeDescriptions());
        arrayList.addAll(this.f37747b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f37749e;
    }

    public final void j0(boolean z10) {
        dr0[] dr0VarArr;
        int i10 = 0;
        while (true) {
            dr0VarArr = this.f37751n;
            if (i10 >= dr0VarArr.length) {
                break;
            }
            dr0VarArr[i10].d.B0();
            i10++;
        }
        dr0VarArr[z10 ? 1 : 0].d.getAdapter();
        dr0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.d0) dr0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ar0 ar0Var = this.f37746a;
        if (ar0Var != null) {
            ar0Var.onConfigurationChanged(configuration);
        }
        ar0 ar0Var2 = this.f37747b;
        if (ar0Var2 != null) {
            ar0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        ar0 ar0Var = this.f37746a;
        if (ar0Var != null) {
            ar0Var.onFragmentDestroy();
        }
        ar0 ar0Var2 = this.f37747b;
        if (ar0Var2 != null) {
            ar0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ar0 ar0Var = this.f37746a;
        if (ar0Var != null) {
            ar0Var.onPause();
        }
        ar0 ar0Var2 = this.f37747b;
        if (ar0Var2 != null) {
            ar0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.f37748c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        ar0 ar0Var = this.f37746a;
        if (ar0Var != null) {
            ar0Var.onResume();
        }
        ar0 ar0Var2 = this.f37747b;
        if (ar0Var2 != null) {
            ar0Var2.onResume();
        }
    }
}
