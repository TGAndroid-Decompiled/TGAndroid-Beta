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
public final class dn0 extends org.telegram.ui.ActionBar.g2 {
    public static final org.telegram.ui.Components.cq0 E = new org.telegram.ui.Components.cq0(4);
    public final an0 f47195a;
    public final an0 f47196b;
    public org.telegram.ui.ActionBar.q0 f47197c;
    public org.telegram.ui.Components.wt d;
    public boolean f47198e;
    public final Paint f47199f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.y4[] f47200n;
    public AnimatorSet f47201r;
    public boolean f47202s;
    public boolean f47203w;
    public boolean f47204x;
    public int f47205y;

    public dn0(HashMap hashMap, ArrayList arrayList, int i7, boolean z10, bn bnVar) {
        super(null);
        this.f47198e = true;
        this.f47199f = new Paint();
        this.f47200n = new org.telegram.ui.ActionBar.y4[2];
        this.f47195a = new an0(0, null, hashMap, arrayList, i7, z10, bnVar, false);
        this.f47196b = new an0(1, null, hashMap, arrayList, i7, z10, bnVar, false);
    }

    public static org.telegram.ui.ActionBar.k j0(dn0 dn0Var) {
        return dn0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k k0(dn0 dn0Var) {
        return dn0Var.actionBar;
    }

    public static void l0(dn0 dn0Var, float f10) {
        dn0Var.actionBar.setTranslationY(f10);
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.f47200n;
            if (i7 < y4VarArr.length) {
                ((org.telegram.ui.Components.ek0) y4VarArr[i7].f30363f).setPinnedSectionOffsetY((int) f10);
                i7++;
            } else {
                dn0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void m0(dn0 dn0Var, String str) {
        dn0Var.f47197c.getSearchField().setText(str);
        dn0Var.f47197c.getSearchField().setSelection(str.length());
        dn0Var.actionBar.B();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        an0 an0Var = this.f47195a;
        if (an0Var != null) {
            an0Var.addThemeColorKeys(hashSet);
        }
        an0 an0Var2 = this.f47196b;
        if (an0Var2 != null) {
            an0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.y4[] y4VarArr;
        View view;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.l(kVar, 5, i7, null);
        boolean z10 = true;
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.I5, null);
        this.actionBar.setBackButtonImage(2131231243);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new cv(this, 28));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232491);
        a10.O();
        a10.I = new bi.x1(this, 19);
        this.f47197c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745565, null));
        EditTextBoldCursor searchField = this.f47197c.getSearchField();
        org.telegram.ui.ActionBar.u6.U(searchField, i7, null);
        org.telegram.ui.ActionBar.u6.v(searchField, i7, null);
        org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Me, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i10 = org.telegram.ui.ActionBar.n6.Y9;
        int i11 = org.telegram.ui.ActionBar.n6.Z9;
        scrollSlidingTextTabStrip2.M = i10;
        scrollSlidingTextTabStrip2.N = i11;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, c8.na.e(-1, 44, 83));
        this.h.setDelegate(new bn0(this, 0));
        this.f47205y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        cn0 cn0Var = new cn0(this, context);
        this.fragmentView = cn0Var;
        cn0Var.setWillNotDraw(false);
        an0 an0Var = this.f47195a;
        an0Var.setParentFragment(this);
        org.telegram.ui.Components.wt wtVar = an0Var.f45751e0;
        this.d = wtVar;
        wtVar.setSizeNotifierLayout(cn0Var);
        for (int i12 = 0; i12 < 4; i12++) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        view = an0Var.f45749d0;
                    } else {
                        view = an0Var.f45748c0;
                    }
                } else {
                    view = an0Var.f45746b0;
                }
            } else {
                view = an0Var.f45744a0;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = an0Var.f45744a0;
        k0 k0Var = an0Var.f45746b0;
        tv tvVar = an0Var.f45748c0;
        View view2 = an0Var.f45749d0;
        org.telegram.ui.Components.wt wtVar2 = an0Var.f45751e0;
        an0 an0Var2 = this.f47196b;
        an0Var2.f45744a0 = frameLayout;
        an0Var2.f45746b0 = k0Var;
        an0Var2.f45751e0 = wtVar2;
        an0Var2.f45748c0 = tvVar;
        an0Var2.f45749d0 = view2;
        an0Var2.f45766r0 = false;
        an0Var2.setParentFragment(this);
        int i13 = 0;
        while (true) {
            y4VarArr = this.f47200n;
            if (i13 >= y4VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.y4 y4Var = new org.telegram.ui.ActionBar.y4(this, context);
            y4VarArr[i13] = y4Var;
            float f11 = f10;
            cn0Var.addView(y4Var, c8.na.c(-1.0f, -1));
            if (i13 == 0) {
                org.telegram.ui.ActionBar.y4 y4Var2 = y4VarArr[i13];
                y4Var2.f30361c = an0Var;
                y4Var2.f30363f = an0Var.L;
            } else if (i13 == 1) {
                org.telegram.ui.ActionBar.y4 y4Var3 = y4VarArr[i13];
                y4Var3.f30361c = an0Var2;
                y4Var3.f30363f = an0Var2.L;
                y4Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.ek0) y4VarArr[i13].f30363f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.y4 y4Var4 = y4VarArr[i13];
            y4Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.g2) y4Var4.f30361c).getFragmentView();
            ((org.telegram.ui.Components.ek0) y4VarArr[i13].f30363f).setClipToPadding(false);
            org.telegram.ui.ActionBar.y4 y4Var5 = y4VarArr[i13];
            y4Var5.f30362e = ((org.telegram.ui.ActionBar.g2) y4Var5.f30361c).getActionBar();
            org.telegram.ui.ActionBar.y4 y4Var6 = y4VarArr[i13];
            y4Var6.addView((FrameLayout) y4Var6.d, c8.na.c(-1.0f, -1));
            org.telegram.ui.ActionBar.y4 y4Var7 = y4VarArr[i13];
            y4Var7.addView((org.telegram.ui.ActionBar.k) y4Var7.f30362e, c8.na.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.k) y4VarArr[i13].f30362e).setVisibility(8);
            ((org.telegram.ui.Components.ek0) y4VarArr[i13].f30363f).setOnScrollListener(new bi.j6(9, this, ((org.telegram.ui.Components.ek0) y4VarArr[i13].f30363f).getOnScrollListener()));
            i13++;
            f10 = f11;
        }
        float f12 = f10;
        cn0Var.addView(this.actionBar, c8.na.c(-2.0f, -1));
        cn0Var.addView(an0Var.f45744a0, c8.na.e(-1, 48, 83));
        cn0Var.addView(an0Var.f45746b0, c8.na.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        cn0Var.addView(an0Var.f45748c0, c8.na.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.gd.N0(2131749077, null), null);
            this.h.a(1, org.telegram.messenger.gd.N0(2131750451, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                y4VarArr[0].f30360b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.f47198e = z10;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29524h5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Me));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47197c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29559j5));
        int i7 = org.telegram.ui.ActionBar.n6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.addAll(this.f47195a.getThemeDescriptions());
        arrayList.addAll(this.f47196b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f47198e;
    }

    public final void o0(boolean z10) {
        org.telegram.ui.ActionBar.y4[] y4VarArr;
        int i7 = 0;
        while (true) {
            y4VarArr = this.f47200n;
            if (i7 >= y4VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.ek0) y4VarArr[i7].f30363f).C0();
            i7++;
        }
        ((org.telegram.ui.Components.ek0) y4VarArr[z10 ? 1 : 0].f30363f).getAdapter();
        ((org.telegram.ui.Components.ek0) y4VarArr[z10 ? 1 : 0].f30363f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((v4.c0) ((org.telegram.ui.Components.ek0) y4VarArr[z10 ? 1 : 0].f30363f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        an0 an0Var = this.f47195a;
        if (an0Var != null) {
            an0Var.onConfigurationChanged(configuration);
        }
        an0 an0Var2 = this.f47196b;
        if (an0Var2 != null) {
            an0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        an0 an0Var = this.f47195a;
        if (an0Var != null) {
            an0Var.onFragmentDestroy();
        }
        an0 an0Var2 = this.f47196b;
        if (an0Var2 != null) {
            an0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        an0 an0Var = this.f47195a;
        if (an0Var != null) {
            an0Var.onPause();
        }
        an0 an0Var2 = this.f47196b;
        if (an0Var2 != null) {
            an0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.q0 q0Var = this.f47197c;
        if (q0Var != null) {
            q0Var.G(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        an0 an0Var = this.f47195a;
        if (an0Var != null) {
            an0Var.onResume();
        }
        an0 an0Var2 = this.f47196b;
        if (an0Var2 != null) {
            an0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.q0 q0Var = this.f47197c;
            boolean z10 = false;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f47197c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false));
            }
            if (this.fragmentView != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false)) >= 0.721f) {
                    z10 = true;
                }
                int systemUiVisibility = this.fragmentView.getSystemUiVisibility();
                if (z10) {
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
            an0 an0Var = this.f47195a;
            if (an0Var != null && an0Var.fragmentView != null) {
                an0Var.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            an0 an0Var2 = this.f47196b;
            if (an0Var2 != null && an0Var2.fragmentView != null) {
                an0Var2.onThemeColorsChanged();
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }
}
