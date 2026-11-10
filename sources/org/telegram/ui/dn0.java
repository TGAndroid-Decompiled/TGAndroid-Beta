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
public final class dn0 extends org.telegram.ui.ActionBar.f2 {
    public static final org.telegram.ui.Components.qp0 D = new org.telegram.ui.Components.qp0(4);
    public final an0 f45014a;
    public final an0 f45015b;
    public org.telegram.ui.ActionBar.r0 f45016c;
    public org.telegram.ui.Components.kt d;
    public boolean f45017e;
    public final Paint f45018f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.y4[] f45019n;
    public AnimatorSet f45020r;
    public boolean f45021s;
    public boolean f45022w;
    public boolean f45023x;
    public int f45024y;

    public dn0(HashMap hashMap, ArrayList arrayList, int i7, boolean z9, cn cnVar) {
        super(null);
        this.f45017e = true;
        this.f45018f = new Paint();
        this.f45019n = new org.telegram.ui.ActionBar.y4[2];
        this.f45014a = new an0(0, null, hashMap, arrayList, i7, z9, cnVar, false);
        this.f45015b = new an0(1, null, hashMap, arrayList, i7, z9, cnVar, false);
    }

    public static org.telegram.ui.ActionBar.l j0(dn0 dn0Var) {
        return dn0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l k0(dn0 dn0Var) {
        return dn0Var.actionBar;
    }

    public static void l0(dn0 dn0Var, float f10) {
        dn0Var.actionBar.setTranslationY(f10);
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.f45019n;
            if (i7 < y4VarArr.length) {
                ((org.telegram.ui.Components.pj0) y4VarArr[i7].f28794f).setPinnedSectionOffsetY((int) f10);
                i7++;
            } else {
                dn0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void m0(dn0 dn0Var, String str) {
        dn0Var.f45016c.getSearchField().setText(str);
        dn0Var.f45016c.getSearchField().setSelection(str.length());
        dn0Var.actionBar.B();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        an0 an0Var = this.f45014a;
        if (an0Var != null) {
            an0Var.addThemeColorKeys(hashSet);
        }
        an0 an0Var2 = this.f45015b;
        if (an0Var2 != null) {
            an0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.y4[] y4VarArr;
        View view;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, this.actionBar, null);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.l(lVar, 5, i7, null);
        boolean z9 = true;
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new xx(this, 25));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.s().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 18);
        this.f45016c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745761, null));
        EditTextBoldCursor searchField = this.f45016c.getSearchField();
        org.telegram.ui.ActionBar.t6.U(searchField, i7, null);
        org.telegram.ui.ActionBar.t6.v(searchField, i7, null);
        org.telegram.ui.ActionBar.t6.D(searchField, org.telegram.ui.ActionBar.m6.Je, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i10 = org.telegram.ui.ActionBar.m6.Y9;
        int i11 = org.telegram.ui.ActionBar.m6.Z9;
        scrollSlidingTextTabStrip2.L = i10;
        scrollSlidingTextTabStrip2.M = i11;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, c8.ha.e(-1, 44, 83));
        this.h.setDelegate(new bn0(this, 0));
        this.f45024y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        cn0 cn0Var = new cn0(this, context);
        this.fragmentView = cn0Var;
        cn0Var.setWillNotDraw(false);
        an0 an0Var = this.f45014a;
        an0Var.setParentFragment(this);
        org.telegram.ui.Components.kt ktVar = an0Var.f43754d0;
        this.d = ktVar;
        ktVar.setSizeNotifierLayout(cn0Var);
        for (int i12 = 0; i12 < 4; i12++) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        view = an0Var.f43753c0;
                    } else {
                        view = an0Var.f43751b0;
                    }
                } else {
                    view = an0Var.f43749a0;
                }
            } else {
                view = an0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = an0Var.Z;
        k0 k0Var = an0Var.f43749a0;
        o00 o00Var = an0Var.f43751b0;
        View view2 = an0Var.f43753c0;
        org.telegram.ui.Components.kt ktVar2 = an0Var.f43754d0;
        an0 an0Var2 = this.f45015b;
        an0Var2.Z = frameLayout;
        an0Var2.f43749a0 = k0Var;
        an0Var2.f43754d0 = ktVar2;
        an0Var2.f43751b0 = o00Var;
        an0Var2.f43753c0 = view2;
        an0Var2.f43769q0 = false;
        an0Var2.setParentFragment(this);
        int i13 = 0;
        while (true) {
            y4VarArr = this.f45019n;
            if (i13 >= y4VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.y4 y4Var = new org.telegram.ui.ActionBar.y4(this, context);
            y4VarArr[i13] = y4Var;
            float f11 = f10;
            cn0Var.addView(y4Var, c8.ha.c(-1.0f, -1));
            if (i13 == 0) {
                org.telegram.ui.ActionBar.y4 y4Var2 = y4VarArr[i13];
                y4Var2.f28792c = an0Var;
                y4Var2.f28794f = an0Var.K;
            } else if (i13 == 1) {
                org.telegram.ui.ActionBar.y4 y4Var3 = y4VarArr[i13];
                y4Var3.f28792c = an0Var2;
                y4Var3.f28794f = an0Var2.K;
                y4Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.pj0) y4VarArr[i13].f28794f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.y4 y4Var4 = y4VarArr[i13];
            y4Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.f2) y4Var4.f28792c).getFragmentView();
            ((org.telegram.ui.Components.pj0) y4VarArr[i13].f28794f).setClipToPadding(false);
            org.telegram.ui.ActionBar.y4 y4Var5 = y4VarArr[i13];
            y4Var5.f28793e = ((org.telegram.ui.ActionBar.f2) y4Var5.f28792c).getActionBar();
            org.telegram.ui.ActionBar.y4 y4Var6 = y4VarArr[i13];
            y4Var6.addView((FrameLayout) y4Var6.d, c8.ha.c(-1.0f, -1));
            org.telegram.ui.ActionBar.y4 y4Var7 = y4VarArr[i13];
            y4Var7.addView((org.telegram.ui.ActionBar.l) y4Var7.f28793e, c8.ha.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.l) y4VarArr[i13].f28793e).setVisibility(8);
            ((org.telegram.ui.Components.pj0) y4VarArr[i13].f28794f).setOnScrollListener(new ai.o0(8, this, ((org.telegram.ui.Components.pj0) y4VarArr[i13].f28794f).getOnScrollListener()));
            i13++;
            f10 = f11;
        }
        float f12 = f10;
        cn0Var.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        cn0Var.addView(an0Var.Z, c8.ha.e(-1, 48, 83));
        cn0Var.addView(an0Var.f43749a0, c8.ha.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        cn0Var.addView(an0Var.f43751b0, c8.ha.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.id.M0(2131749270, null), null);
            this.h.a(1, org.telegram.messenger.id.M0(2131750468, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                y4VarArr[0].f28791b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z9 = false;
        }
        this.f45017e = z9;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27963h5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Je));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f45016c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27998j5));
        int i7 = org.telegram.ui.ActionBar.m6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.addAll(this.f45014a.getThemeDescriptions());
        arrayList.addAll(this.f45015b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f45017e;
    }

    public final void o0(boolean z9) {
        org.telegram.ui.ActionBar.y4[] y4VarArr;
        int i7 = 0;
        while (true) {
            y4VarArr = this.f45019n;
            if (i7 >= y4VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.pj0) y4VarArr[i7].f28794f).C0();
            i7++;
        }
        ((org.telegram.ui.Components.pj0) y4VarArr[z9 ? 1 : 0].f28794f).getAdapter();
        ((org.telegram.ui.Components.pj0) y4VarArr[z9 ? 1 : 0].f28794f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((v4.b0) ((org.telegram.ui.Components.pj0) y4VarArr[z9 ? 1 : 0].f28794f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        an0 an0Var = this.f45014a;
        if (an0Var != null) {
            an0Var.onConfigurationChanged(configuration);
        }
        an0 an0Var2 = this.f45015b;
        if (an0Var2 != null) {
            an0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        an0 an0Var = this.f45014a;
        if (an0Var != null) {
            an0Var.onFragmentDestroy();
        }
        an0 an0Var2 = this.f45015b;
        if (an0Var2 != null) {
            an0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        an0 an0Var = this.f45014a;
        if (an0Var != null) {
            an0Var.onPause();
        }
        an0 an0Var2 = this.f45015b;
        if (an0Var2 != null) {
            an0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.r0 r0Var = this.f45016c;
        if (r0Var != null) {
            r0Var.F(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        an0 an0Var = this.f45014a;
        if (an0Var != null) {
            an0Var.onResume();
        }
        an0 an0Var2 = this.f45015b;
        if (an0Var2 != null) {
            an0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.r0 r0Var = this.f45016c;
            boolean z9 = false;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f45016c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27998j5, false));
            }
            if (this.fragmentView != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false)) >= 0.721f) {
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
            an0 an0Var = this.f45014a;
            if (an0Var != null && an0Var.fragmentView != null) {
                an0Var.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            an0 an0Var2 = this.f45015b;
            if (an0Var2 != null && an0Var2.fragmentView != null) {
                an0Var2.onThemeColorsChanged();
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }
}
