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
public final class an0 extends org.telegram.ui.ActionBar.f2 {
    public static final org.telegram.ui.Components.qp0 D = new org.telegram.ui.Components.qp0(4);
    public final xm0 f44025a;
    public final xm0 f44026b;
    public org.telegram.ui.ActionBar.r0 f44027c;
    public org.telegram.ui.Components.kt d;
    public boolean f44028e;
    public final Paint f44029f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.x4[] f44030n;
    public AnimatorSet f44031r;
    public boolean f44032s;
    public boolean f44033w;
    public boolean f44034x;
    public int f44035y;

    public an0(HashMap hashMap, ArrayList arrayList, int i7, boolean z9, an anVar) {
        super(null);
        this.f44028e = true;
        this.f44029f = new Paint();
        this.f44030n = new org.telegram.ui.ActionBar.x4[2];
        this.f44025a = new xm0(0, null, hashMap, arrayList, i7, z9, anVar, false);
        this.f44026b = new xm0(1, null, hashMap, arrayList, i7, z9, anVar, false);
    }

    public static org.telegram.ui.ActionBar.k j0(an0 an0Var) {
        return an0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k k0(an0 an0Var) {
        return an0Var.actionBar;
    }

    public static void l0(an0 an0Var, float f10) {
        an0Var.actionBar.setTranslationY(f10);
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.x4[] x4VarArr = an0Var.f44030n;
            if (i7 < x4VarArr.length) {
                ((org.telegram.ui.Components.pj0) x4VarArr[i7].f28748f).setPinnedSectionOffsetY((int) f10);
                i7++;
            } else {
                an0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void m0(an0 an0Var, String str) {
        an0Var.f44027c.getSearchField().setText(str);
        an0Var.f44027c.getSearchField().setSelection(str.length());
        an0Var.actionBar.z();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        xm0 xm0Var = this.f44025a;
        if (xm0Var != null) {
            xm0Var.addThemeColorKeys(hashSet);
        }
        xm0 xm0Var2 = this.f44026b;
        if (xm0Var2 != null) {
            xm0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.x4[] x4VarArr;
        View view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i7, null);
        boolean z9 = true;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, 25));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 18);
        this.f44027c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745762, null));
        EditTextBoldCursor searchField = this.f44027c.getSearchField();
        org.telegram.ui.ActionBar.r6.V(searchField, i7, null);
        org.telegram.ui.ActionBar.r6.w(searchField, i7, null);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i10 = org.telegram.ui.ActionBar.k6.Y9;
        int i11 = org.telegram.ui.ActionBar.k6.Z9;
        scrollSlidingTextTabStrip2.L = i10;
        scrollSlidingTextTabStrip2.M = i11;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, c8.ha.e(-1, 44, 83));
        this.h.setDelegate(new ym0(this, 0));
        this.f44035y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        zm0 zm0Var = new zm0(this, context);
        this.fragmentView = zm0Var;
        zm0Var.setWillNotDraw(false);
        xm0 xm0Var = this.f44025a;
        xm0Var.setParentFragment(this);
        org.telegram.ui.Components.kt ktVar = xm0Var.f51901d0;
        this.d = ktVar;
        ktVar.setSizeNotifierLayout(zm0Var);
        for (int i12 = 0; i12 < 4; i12++) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        view = xm0Var.f51900c0;
                    } else {
                        view = xm0Var.f51898b0;
                    }
                } else {
                    view = xm0Var.f51896a0;
                }
            } else {
                view = xm0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = xm0Var.Z;
        k0 k0Var = xm0Var.f51896a0;
        l00 l00Var = xm0Var.f51898b0;
        View view2 = xm0Var.f51900c0;
        org.telegram.ui.Components.kt ktVar2 = xm0Var.f51901d0;
        xm0 xm0Var2 = this.f44026b;
        xm0Var2.Z = frameLayout;
        xm0Var2.f51896a0 = k0Var;
        xm0Var2.f51901d0 = ktVar2;
        xm0Var2.f51898b0 = l00Var;
        xm0Var2.f51900c0 = view2;
        xm0Var2.f51916q0 = false;
        xm0Var2.setParentFragment(this);
        int i13 = 0;
        while (true) {
            x4VarArr = this.f44030n;
            if (i13 >= x4VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.x4 x4Var = new org.telegram.ui.ActionBar.x4(this, context);
            x4VarArr[i13] = x4Var;
            float f11 = f10;
            zm0Var.addView(x4Var, c8.ha.c(-1.0f, -1));
            if (i13 == 0) {
                org.telegram.ui.ActionBar.x4 x4Var2 = x4VarArr[i13];
                x4Var2.f28746c = xm0Var;
                x4Var2.f28748f = xm0Var.K;
            } else if (i13 == 1) {
                org.telegram.ui.ActionBar.x4 x4Var3 = x4VarArr[i13];
                x4Var3.f28746c = xm0Var2;
                x4Var3.f28748f = xm0Var2.K;
                x4Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.pj0) x4VarArr[i13].f28748f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.x4 x4Var4 = x4VarArr[i13];
            x4Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.f2) x4Var4.f28746c).getFragmentView();
            ((org.telegram.ui.Components.pj0) x4VarArr[i13].f28748f).setClipToPadding(false);
            org.telegram.ui.ActionBar.x4 x4Var5 = x4VarArr[i13];
            x4Var5.f28747e = ((org.telegram.ui.ActionBar.f2) x4Var5.f28746c).getActionBar();
            org.telegram.ui.ActionBar.x4 x4Var6 = x4VarArr[i13];
            x4Var6.addView((FrameLayout) x4Var6.d, c8.ha.c(-1.0f, -1));
            org.telegram.ui.ActionBar.x4 x4Var7 = x4VarArr[i13];
            x4Var7.addView((org.telegram.ui.ActionBar.k) x4Var7.f28747e, c8.ha.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.k) x4VarArr[i13].f28747e).setVisibility(8);
            ((org.telegram.ui.Components.pj0) x4VarArr[i13].f28748f).setOnScrollListener(new ai.o0(8, this, ((org.telegram.ui.Components.pj0) x4VarArr[i13].f28748f).getOnScrollListener()));
            i13++;
            f10 = f11;
        }
        float f12 = f10;
        zm0Var.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        zm0Var.addView(xm0Var.Z, c8.ha.e(-1, 48, 83));
        zm0Var.addView(xm0Var.f51896a0, c8.ha.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        zm0Var.addView(xm0Var.f51898b0, c8.ha.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.hd.M0(2131749269, null), null);
            this.h.a(1, org.telegram.messenger.hd.M0(2131750467, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                x4VarArr[0].f28745b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z9 = false;
        }
        this.f44028e = z9;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27921h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Je));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44027c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27956j5));
        int i7 = org.telegram.ui.ActionBar.k6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.addAll(this.f44025a.getThemeDescriptions());
        arrayList.addAll(this.f44026b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f44028e;
    }

    public final void o0(boolean z9) {
        org.telegram.ui.ActionBar.x4[] x4VarArr;
        int i7 = 0;
        while (true) {
            x4VarArr = this.f44030n;
            if (i7 >= x4VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.pj0) x4VarArr[i7].f28748f).C0();
            i7++;
        }
        ((org.telegram.ui.Components.pj0) x4VarArr[z9 ? 1 : 0].f28748f).getAdapter();
        ((org.telegram.ui.Components.pj0) x4VarArr[z9 ? 1 : 0].f28748f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((v4.b0) ((org.telegram.ui.Components.pj0) x4VarArr[z9 ? 1 : 0].f28748f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        xm0 xm0Var = this.f44025a;
        if (xm0Var != null) {
            xm0Var.onConfigurationChanged(configuration);
        }
        xm0 xm0Var2 = this.f44026b;
        if (xm0Var2 != null) {
            xm0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        xm0 xm0Var = this.f44025a;
        if (xm0Var != null) {
            xm0Var.onFragmentDestroy();
        }
        xm0 xm0Var2 = this.f44026b;
        if (xm0Var2 != null) {
            xm0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        xm0 xm0Var = this.f44025a;
        if (xm0Var != null) {
            xm0Var.onPause();
        }
        xm0 xm0Var2 = this.f44026b;
        if (xm0Var2 != null) {
            xm0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.r0 r0Var = this.f44027c;
        if (r0Var != null) {
            r0Var.F(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        xm0 xm0Var = this.f44025a;
        if (xm0Var != null) {
            xm0Var.onResume();
        }
        xm0 xm0Var2 = this.f44026b;
        if (xm0Var2 != null) {
            xm0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.r0 r0Var = this.f44027c;
            boolean z9 = false;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f44027c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27956j5, false));
            }
            if (this.fragmentView != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false)) >= 0.721f) {
                    z9 = true;
                }
                int systemUiVisibility = this.fragmentView.getSystemUiVisibility();
                if (z9) {
                    i7 = systemUiVisibility | 8192;
                } else {
                    i7 = systemUiVisibility & (-8193);
                }
                if (i7 != systemUiVisibility) {
                    this.fragmentView.setSystemUiVisibility(i7);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            xm0 xm0Var = this.f44025a;
            if (xm0Var != null && xm0Var.fragmentView != null) {
                xm0Var.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            xm0 xm0Var2 = this.f44026b;
            if (xm0Var2 != null && xm0Var2.fragmentView != null) {
                xm0Var2.onThemeColorsChanged();
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }
}
