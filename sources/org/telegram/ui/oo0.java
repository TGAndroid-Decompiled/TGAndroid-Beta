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
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class oo0 extends org.telegram.ui.ActionBar.k2 {
    public static final org.telegram.ui.Components.qq0 D = new org.telegram.ui.Components.qq0(4);
    public final lo0 f40349a;
    public final lo0 f40350b;
    public org.telegram.ui.ActionBar.t0 f40351c;
    public org.telegram.ui.Components.wt d;
    public boolean e;
    public final Paint f40352f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.h5[] f40353n;
    public AnimatorSet f40354r;
    public boolean f40355s;
    public boolean f40356w;
    public boolean f40357x;
    public int f40358y;

    public oo0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, un unVar) {
        super(null);
        this.e = true;
        this.f40352f = new Paint();
        this.f40353n = new org.telegram.ui.ActionBar.h5[2];
        this.f40349a = new lo0(0, null, hashMap, arrayList, i10, z10, unVar, false);
        this.f40350b = new lo0(1, null, hashMap, arrayList, i10, z10, unVar, false);
    }

    public static org.telegram.ui.ActionBar.l g0(oo0 oo0Var) {
        return oo0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l i0(oo0 oo0Var) {
        return oo0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l j0(oo0 oo0Var) {
        return oo0Var.actionBar;
    }

    public static void k0(oo0 oo0Var, float f7) {
        oo0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = oo0Var.f40353n;
            if (i10 < h5VarArr.length) {
                ((org.telegram.ui.Components.tk0) h5VarArr[i10].f20381f).setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                oo0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void l0(oo0 oo0Var, String str) {
        oo0Var.f40351c.getSearchField().setText(str);
        oo0Var.f40351c.getSearchField().setSelection(str.length());
        oo0Var.actionBar.z();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        lo0 lo0Var = this.f40349a;
        if (lo0Var != null) {
            lo0Var.addThemeColorKeys(hashSet);
        }
        lo0 lo0Var2 = this.f40350b;
        if (lo0Var2 != null) {
            lo0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        View view;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21001h5, this.actionBar, null);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.m(lVar, 5, i10, null);
        boolean z10 = true;
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.I5, null);
        this.actionBar.setBackButtonImage(2131231241);
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f7 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.i0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new t60(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, 2131232485);
        a2.N();
        a2.H = new ag.l3(this, 18);
        this.f40351c = a2;
        a2.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745778, null));
        EditTextBoldCursor searchField = this.f40351c.getSearchField();
        org.telegram.ui.ActionBar.a7.V(searchField, i10, null);
        org.telegram.ui.ActionBar.a7.w(searchField, i10, null);
        org.telegram.ui.ActionBar.a7.E(searchField, org.telegram.ui.ActionBar.t6.Je, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.t6.Y9;
        int i12 = org.telegram.ui.ActionBar.t6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, w7.b6.e(-1, 44, 83));
        this.h.setDelegate(new mo0(this, 0));
        this.f40358y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        no0 no0Var = new no0(this, context);
        this.fragmentView = no0Var;
        no0Var.setWillNotDraw(false);
        lo0 lo0Var = this.f40349a;
        lo0Var.setParentFragment(this);
        org.telegram.ui.Components.wt wtVar = lo0Var.f39333d0;
        this.d = wtVar;
        wtVar.setSizeNotifierLayout(no0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = lo0Var.f39332c0;
                    } else {
                        view = lo0Var.f39330b0;
                    }
                } else {
                    view = lo0Var.f39328a0;
                }
            } else {
                view = lo0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = lo0Var.Z;
        l0 l0Var = lo0Var.f39328a0;
        do0 do0Var = lo0Var.f39330b0;
        View view2 = lo0Var.f39332c0;
        org.telegram.ui.Components.wt wtVar2 = lo0Var.f39333d0;
        lo0 lo0Var2 = this.f40350b;
        lo0Var2.Z = frameLayout;
        lo0Var2.f39328a0 = l0Var;
        lo0Var2.f39333d0 = wtVar2;
        lo0Var2.f39330b0 = do0Var;
        lo0Var2.f39332c0 = view2;
        lo0Var2.f39347q0 = false;
        lo0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            h5VarArr = this.f40353n;
            if (i14 >= h5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(this, context);
            h5VarArr[i14] = h5Var;
            float f10 = f7;
            no0Var.addView(h5Var, w7.b6.c(-1.0f, -1));
            if (i14 == 0) {
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[i14];
                h5Var2.f20380c = lo0Var;
                h5Var2.f20381f = lo0Var.K;
            } else if (i14 == 1) {
                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i14];
                h5Var3.f20380c = lo0Var2;
                h5Var3.f20381f = lo0Var2.K;
                h5Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.tk0) h5VarArr[i14].f20381f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[i14];
            h5Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.k2) h5Var4.f20380c).getFragmentView();
            ((org.telegram.ui.Components.tk0) h5VarArr[i14].f20381f).setClipToPadding(false);
            org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[i14];
            h5Var5.e = ((org.telegram.ui.ActionBar.k2) h5Var5.f20380c).getActionBar();
            org.telegram.ui.ActionBar.h5 h5Var6 = h5VarArr[i14];
            h5Var6.addView((FrameLayout) h5Var6.d, w7.b6.c(-1.0f, -1));
            org.telegram.ui.ActionBar.h5 h5Var7 = h5VarArr[i14];
            h5Var7.addView((org.telegram.ui.ActionBar.l) h5Var7.e, w7.b6.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.l) h5VarArr[i14].e).setVisibility(8);
            ((org.telegram.ui.Components.tk0) h5VarArr[i14].f20381f).setOnScrollListener(new bi.t3(9, this, ((org.telegram.ui.Components.tk0) h5VarArr[i14].f20381f).getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        no0Var.addView(this.actionBar, w7.b6.c(-2.0f, -1));
        no0Var.addView(lo0Var.Z, w7.b6.e(-1, 48, 83));
        no0Var.addView(lo0Var.f39328a0, w7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        no0Var.addView(lo0Var.f39330b0, w7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.cd.L0(2131749279, null), null);
            this.h.a(1, org.telegram.messenger.cd.L0(2131750477, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.i0.L(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                h5VarArr[0].f20379b = currentTabId;
            }
            this.h.c();
        }
        n0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21001h5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Je));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40351c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21037j5));
        int i10 = org.telegram.ui.ActionBar.t6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.addAll(this.f40349a.getThemeDescriptions());
        arrayList.addAll(this.f40350b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void n0(boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        int i10 = 0;
        while (true) {
            h5VarArr = this.f40353n;
            if (i10 >= h5VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.tk0) h5VarArr[i10].f20381f).C0();
            i10++;
        }
        ((org.telegram.ui.Components.tk0) h5VarArr[z10 ? 1 : 0].f20381f).getAdapter();
        ((org.telegram.ui.Components.tk0) h5VarArr[z10 ? 1 : 0].f20381f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.a0) ((org.telegram.ui.Components.tk0) h5VarArr[z10 ? 1 : 0].f20381f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        lo0 lo0Var = this.f40349a;
        if (lo0Var != null) {
            lo0Var.onConfigurationChanged(configuration);
        }
        lo0 lo0Var2 = this.f40350b;
        if (lo0Var2 != null) {
            lo0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        lo0 lo0Var = this.f40349a;
        if (lo0Var != null) {
            lo0Var.onFragmentDestroy();
        }
        lo0 lo0Var2 = this.f40350b;
        if (lo0Var2 != null) {
            lo0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        lo0 lo0Var = this.f40349a;
        if (lo0Var != null) {
            lo0Var.onPause();
        }
        lo0 lo0Var2 = this.f40350b;
        if (lo0Var2 != null) {
            lo0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.t0 t0Var = this.f40351c;
        if (t0Var != null) {
            t0Var.F(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        lo0 lo0Var = this.f40349a;
        if (lo0Var != null) {
            lo0Var.onResume();
        }
        lo0 lo0Var2 = this.f40350b;
        if (lo0Var2 != null) {
            lo0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.t0 t0Var = this.f40351c;
            boolean z10 = false;
            if (t0Var != null && t0Var.getSearchField() != null) {
                this.f40351c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21037j5, false));
            }
            if (this.fragmentView != null) {
                if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false)) >= 0.721f) {
                    z10 = true;
                }
                int systemUiVisibility = this.fragmentView.getSystemUiVisibility();
                if (z10) {
                    i10 = systemUiVisibility | 8192;
                } else {
                    i10 = systemUiVisibility & (-8193);
                }
                if (i10 != systemUiVisibility) {
                    this.fragmentView.setSystemUiVisibility(i10);
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            lo0 lo0Var = this.f40349a;
            if (lo0Var != null && lo0Var.fragmentView != null) {
                lo0Var.onThemeColorsChanged();
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        try {
            lo0 lo0Var2 = this.f40350b;
            if (lo0Var2 != null && lo0Var2.fragmentView != null) {
                lo0Var2.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.f8.g(e10, true);
        }
    }
}
