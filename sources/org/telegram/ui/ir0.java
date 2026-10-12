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
public final class ir0 extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.ts0 f38973y = new org.telegram.ui.Components.ts0(4);
    public final dr0 f38974a;
    public final dr0 f38975b;
    public org.telegram.ui.ActionBar.u0 f38976c;
    public org.telegram.ui.Components.cv d;
    public boolean f38977e;
    public final Paint f38978f;
    public ScrollSlidingTextTabStrip h;
    public final gr0[] f38979n;
    public AnimatorSet f38980r;
    public boolean f38981s;
    public boolean v;
    public boolean f38982w;
    public int f38983x;

    public ir0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, eo eoVar) {
        super(null);
        this.f38977e = true;
        this.f38978f = new Paint();
        this.f38979n = new gr0[2];
        this.f38974a = new dr0(0, null, hashMap, arrayList, i10, z10, eoVar, false);
        this.f38975b = new dr0(1, null, hashMap, arrayList, i10, z10, eoVar, false);
    }

    public static void g0(ir0 ir0Var, float f7) {
        ir0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            gr0[] gr0VarArr = ir0Var.f38979n;
            if (i10 < gr0VarArr.length) {
                gr0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                ir0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(ir0 ir0Var, String str) {
        ir0Var.f38976c.getSearchField().setText(str);
        ir0Var.f38976c.getSearchField().setSelection(str.length());
        ir0Var.actionBar.y();
    }

    @Override
    public final View createView(Context context) {
        gr0[] gr0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20630h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20667j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.actionBar.E(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
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
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 17));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.p().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 14);
        this.f38976c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f38976c.getSearchField();
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
        this.actionBar.addView(this.h, w7.w5.e(-1, 44, 83));
        this.h.setDelegate(new er0(this));
        this.f38983x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        fr0 fr0Var = new fr0(this, context);
        this.fragmentView = fr0Var;
        fr0Var.setWillNotDraw(false);
        dr0 dr0Var = this.f38974a;
        dr0Var.setParentFragment(this);
        org.telegram.ui.Components.cv cvVar = dr0Var.f36872d0;
        this.d = cvVar;
        cvVar.setSizeNotifierLayout(fr0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = dr0Var.f36871c0;
                    } else {
                        view = dr0Var.f36869b0;
                    }
                } else {
                    view = dr0Var.f36867a0;
                }
            } else {
                view = dr0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = dr0Var.Z;
        k0 k0Var = dr0Var.f36867a0;
        s50 s50Var = dr0Var.f36869b0;
        View view2 = dr0Var.f36871c0;
        org.telegram.ui.Components.cv cvVar2 = dr0Var.f36872d0;
        dr0 dr0Var2 = this.f38975b;
        dr0Var2.Z = frameLayout;
        dr0Var2.f36867a0 = k0Var;
        dr0Var2.f36872d0 = cvVar2;
        dr0Var2.f36869b0 = s50Var;
        dr0Var2.f36871c0 = view2;
        dr0Var2.f36887q0 = false;
        dr0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            gr0VarArr = this.f38979n;
            if (i14 >= gr0VarArr.length) {
                break;
            }
            gr0 gr0Var = new gr0(this, context);
            gr0VarArr[i14] = gr0Var;
            float f10 = f7;
            fr0Var.addView(gr0Var, w7.w5.d(-1.0f, -1));
            if (i14 == 0) {
                gr0 gr0Var2 = gr0VarArr[i14];
                gr0Var2.f38122a = dr0Var;
                gr0Var2.d = dr0Var.K;
            } else if (i14 == 1) {
                gr0 gr0Var3 = gr0VarArr[i14];
                gr0Var3.f38122a = dr0Var2;
                gr0Var3.d = dr0Var2.K;
                gr0Var3.setVisibility(8);
            }
            gr0VarArr[i14].d.setScrollingTouchSlop(1);
            gr0 gr0Var4 = gr0VarArr[i14];
            gr0Var4.f38123b = (FrameLayout) gr0Var4.f38122a.getFragmentView();
            gr0VarArr[i14].d.setClipToPadding(false);
            gr0 gr0Var5 = gr0VarArr[i14];
            gr0Var5.f38124c = gr0Var5.f38122a.getActionBar();
            gr0 gr0Var6 = gr0VarArr[i14];
            gr0Var6.addView(gr0Var6.f38123b, w7.w5.d(-1.0f, -1));
            gr0 gr0Var7 = gr0VarArr[i14];
            gr0Var7.addView(gr0Var7.f38124c, w7.w5.d(-2.0f, -1));
            gr0VarArr[i14].f38124c.setVisibility(8);
            gr0VarArr[i14].d.setOnScrollListener(new ii.n3(7, this, gr0VarArr[i14].d.getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        fr0Var.addView(this.actionBar, w7.w5.d(-2.0f, -1));
        fr0Var.addView(dr0Var.Z, w7.w5.e(-1, 48, 83));
        fr0Var.addView(dr0Var.f36867a0, w7.w5.a(60.0f, 0.0f, 0.0f, 12.0f, 10.0f, 60, 85));
        fr0Var.addView(dr0Var.f36869b0, w7.w5.a(24.0f, 0.0f, 0.0f, -2.0f, 9.0f, 42, 85));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                gr0VarArr[0].f38125e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.f38977e = z10;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20630h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20630h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f20667j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38976c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f38974a.getThemeDescriptions());
        arrayList.addAll(this.f38975b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f38977e;
    }

    public final void j0(boolean z10) {
        gr0[] gr0VarArr;
        int i10 = 0;
        while (true) {
            gr0VarArr = this.f38979n;
            if (i10 >= gr0VarArr.length) {
                break;
            }
            gr0VarArr[i10].d.B0();
            i10++;
        }
        gr0VarArr[z10 ? 1 : 0].d.getAdapter();
        gr0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.d0) gr0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dr0 dr0Var = this.f38974a;
        if (dr0Var != null) {
            dr0Var.onConfigurationChanged(configuration);
        }
        dr0 dr0Var2 = this.f38975b;
        if (dr0Var2 != null) {
            dr0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        dr0 dr0Var = this.f38974a;
        if (dr0Var != null) {
            dr0Var.onFragmentDestroy();
        }
        dr0 dr0Var2 = this.f38975b;
        if (dr0Var2 != null) {
            dr0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        dr0 dr0Var = this.f38974a;
        if (dr0Var != null) {
            dr0Var.onPause();
        }
        dr0 dr0Var2 = this.f38975b;
        if (dr0Var2 != null) {
            dr0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.f38976c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        dr0 dr0Var = this.f38974a;
        if (dr0Var != null) {
            dr0Var.onResume();
        }
        dr0 dr0Var2 = this.f38975b;
        if (dr0Var2 != null) {
            dr0Var2.onResume();
        }
    }
}
