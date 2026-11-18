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
public final class fn0 extends org.telegram.ui.ActionBar.h2 {
    public static final org.telegram.ui.Components.bq0 E = new org.telegram.ui.Components.bq0(4);
    public final cn0 f47723a;
    public final cn0 f47724b;
    public org.telegram.ui.ActionBar.r0 f47725c;
    public org.telegram.ui.Components.wt d;
    public boolean f47726e;
    public final Paint f47727f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.z4[] f47728n;
    public AnimatorSet f47729r;
    public boolean f47730s;
    public boolean f47731w;
    public boolean f47732x;
    public int f47733y;

    public fn0(HashMap hashMap, ArrayList arrayList, int i7, boolean z10, bn bnVar) {
        super(null);
        this.f47726e = true;
        this.f47727f = new Paint();
        this.f47728n = new org.telegram.ui.ActionBar.z4[2];
        this.f47723a = new cn0(0, null, hashMap, arrayList, i7, z10, bnVar, false);
        this.f47724b = new cn0(1, null, hashMap, arrayList, i7, z10, bnVar, false);
    }

    public static org.telegram.ui.ActionBar.k j0(fn0 fn0Var) {
        return fn0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k k0(fn0 fn0Var) {
        return fn0Var.actionBar;
    }

    public static void l0(fn0 fn0Var, float f10) {
        fn0Var.actionBar.setTranslationY(f10);
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.z4[] z4VarArr = fn0Var.f47728n;
            if (i7 < z4VarArr.length) {
                ((org.telegram.ui.Components.ck0) z4VarArr[i7].f30320f).setPinnedSectionOffsetY((int) f10);
                i7++;
            } else {
                fn0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void m0(fn0 fn0Var, String str) {
        fn0Var.f47725c.getSearchField().setText(str);
        fn0Var.f47725c.getSearchField().setSelection(str.length());
        fn0Var.actionBar.C();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        cn0 cn0Var = this.f47723a;
        if (cn0Var != null) {
            cn0Var.addThemeColorKeys(hashSet);
        }
        cn0 cn0Var2 = this.f47724b;
        if (cn0Var2 != null) {
            cn0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.z4[] z4VarArr;
        View view;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29467h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.l(kVar, 5, i7, null);
        boolean z10 = true;
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 28));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.t().a(0, 2131232488);
        a10.O();
        a10.I = new bi.s1(this, 19);
        this.f47725c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.gd.M0(2131745566, null));
        EditTextBoldCursor searchField = this.f47725c.getSearchField();
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
        this.actionBar.addView(this.h, c8.ma.e(-1, 44, 83));
        this.h.setDelegate(new dn0(this, 0));
        this.f47733y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        en0 en0Var = new en0(this, context);
        this.fragmentView = en0Var;
        en0Var.setWillNotDraw(false);
        cn0 cn0Var = this.f47723a;
        cn0Var.setParentFragment(this);
        org.telegram.ui.Components.wt wtVar = cn0Var.f46545e0;
        this.d = wtVar;
        wtVar.setSizeNotifierLayout(en0Var);
        for (int i12 = 0; i12 < 4; i12++) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        view = cn0Var.f46543d0;
                    } else {
                        view = cn0Var.f46542c0;
                    }
                } else {
                    view = cn0Var.f46540b0;
                }
            } else {
                view = cn0Var.f46538a0;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = cn0Var.f46538a0;
        k0 k0Var = cn0Var.f46540b0;
        uv uvVar = cn0Var.f46542c0;
        View view2 = cn0Var.f46543d0;
        org.telegram.ui.Components.wt wtVar2 = cn0Var.f46545e0;
        cn0 cn0Var2 = this.f47724b;
        cn0Var2.f46538a0 = frameLayout;
        cn0Var2.f46540b0 = k0Var;
        cn0Var2.f46545e0 = wtVar2;
        cn0Var2.f46542c0 = uvVar;
        cn0Var2.f46543d0 = view2;
        cn0Var2.f46560r0 = false;
        cn0Var2.setParentFragment(this);
        int i13 = 0;
        while (true) {
            z4VarArr = this.f47728n;
            if (i13 >= z4VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.z4 z4Var = new org.telegram.ui.ActionBar.z4(this, context);
            z4VarArr[i13] = z4Var;
            float f11 = f10;
            en0Var.addView(z4Var, c8.ma.c(-1.0f, -1));
            if (i13 == 0) {
                org.telegram.ui.ActionBar.z4 z4Var2 = z4VarArr[i13];
                z4Var2.f30318c = cn0Var;
                z4Var2.f30320f = cn0Var.L;
            } else if (i13 == 1) {
                org.telegram.ui.ActionBar.z4 z4Var3 = z4VarArr[i13];
                z4Var3.f30318c = cn0Var2;
                z4Var3.f30320f = cn0Var2.L;
                z4Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.ck0) z4VarArr[i13].f30320f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.z4 z4Var4 = z4VarArr[i13];
            z4Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.h2) z4Var4.f30318c).getFragmentView();
            ((org.telegram.ui.Components.ck0) z4VarArr[i13].f30320f).setClipToPadding(false);
            org.telegram.ui.ActionBar.z4 z4Var5 = z4VarArr[i13];
            z4Var5.f30319e = ((org.telegram.ui.ActionBar.h2) z4Var5.f30318c).getActionBar();
            org.telegram.ui.ActionBar.z4 z4Var6 = z4VarArr[i13];
            z4Var6.addView((FrameLayout) z4Var6.d, c8.ma.c(-1.0f, -1));
            org.telegram.ui.ActionBar.z4 z4Var7 = z4VarArr[i13];
            z4Var7.addView((org.telegram.ui.ActionBar.k) z4Var7.f30319e, c8.ma.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.k) z4VarArr[i13].f30319e).setVisibility(8);
            ((org.telegram.ui.Components.ck0) z4VarArr[i13].f30320f).setOnScrollListener(new bi.d6(9, this, ((org.telegram.ui.Components.ck0) z4VarArr[i13].f30320f).getOnScrollListener()));
            i13++;
            f10 = f11;
        }
        float f12 = f10;
        en0Var.addView(this.actionBar, c8.ma.c(-2.0f, -1));
        en0Var.addView(cn0Var.f46538a0, c8.ma.e(-1, 48, 83));
        en0Var.addView(cn0Var.f46540b0, c8.ma.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        en0Var.addView(cn0Var.f46542c0, c8.ma.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.gd.M0(2131749078, null), null);
            this.h.a(1, org.telegram.messenger.gd.M0(2131750452, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                z4VarArr[0].f30317b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.f47726e = z10;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29467h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29467h5));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Me));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47725c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29502j5));
        int i7 = org.telegram.ui.ActionBar.n6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.addAll(this.f47723a.getThemeDescriptions());
        arrayList.addAll(this.f47724b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f47726e;
    }

    public final void o0(boolean z10) {
        org.telegram.ui.ActionBar.z4[] z4VarArr;
        int i7 = 0;
        while (true) {
            z4VarArr = this.f47728n;
            if (i7 >= z4VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.ck0) z4VarArr[i7].f30320f).C0();
            i7++;
        }
        ((org.telegram.ui.Components.ck0) z4VarArr[z10 ? 1 : 0].f30320f).getAdapter();
        ((org.telegram.ui.Components.ck0) z4VarArr[z10 ? 1 : 0].f30320f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((v4.c0) ((org.telegram.ui.Components.ck0) z4VarArr[z10 ? 1 : 0].f30320f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cn0 cn0Var = this.f47723a;
        if (cn0Var != null) {
            cn0Var.onConfigurationChanged(configuration);
        }
        cn0 cn0Var2 = this.f47724b;
        if (cn0Var2 != null) {
            cn0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        cn0 cn0Var = this.f47723a;
        if (cn0Var != null) {
            cn0Var.onFragmentDestroy();
        }
        cn0 cn0Var2 = this.f47724b;
        if (cn0Var2 != null) {
            cn0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        cn0 cn0Var = this.f47723a;
        if (cn0Var != null) {
            cn0Var.onPause();
        }
        cn0 cn0Var2 = this.f47724b;
        if (cn0Var2 != null) {
            cn0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.r0 r0Var = this.f47725c;
        if (r0Var != null) {
            r0Var.G(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        cn0 cn0Var = this.f47723a;
        if (cn0Var != null) {
            cn0Var.onResume();
        }
        cn0 cn0Var2 = this.f47724b;
        if (cn0Var2 != null) {
            cn0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.r0 r0Var = this.f47725c;
            boolean z10 = false;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f47725c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29502j5, false));
            }
            if (this.fragmentView != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29467h5, false)) >= 0.721f) {
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
            cn0 cn0Var = this.f47723a;
            if (cn0Var != null && cn0Var.fragmentView != null) {
                cn0Var.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            cn0 cn0Var2 = this.f47724b;
            if (cn0Var2 != null && cn0Var2.fragmentView != null) {
                cn0Var2.onThemeColorsChanged();
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }
}
