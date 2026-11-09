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
public final class cn0 extends org.telegram.ui.ActionBar.f2 {
    public static final org.telegram.ui.Components.rp0 D = new org.telegram.ui.Components.rp0(4);
    public final zm0 f44712a;
    public final zm0 f44713b;
    public org.telegram.ui.ActionBar.r0 f44714c;
    public org.telegram.ui.Components.lt d;
    public boolean f44715e;
    public final Paint f44716f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.x4[] f44717n;
    public AnimatorSet f44718r;
    public boolean f44719s;
    public boolean f44720w;
    public boolean f44721x;
    public int f44722y;

    public cn0(HashMap hashMap, ArrayList arrayList, int i7, boolean z9, cn cnVar) {
        super(null);
        this.f44715e = true;
        this.f44716f = new Paint();
        this.f44717n = new org.telegram.ui.ActionBar.x4[2];
        this.f44712a = new zm0(0, null, hashMap, arrayList, i7, z9, cnVar, false);
        this.f44713b = new zm0(1, null, hashMap, arrayList, i7, z9, cnVar, false);
    }

    public static org.telegram.ui.ActionBar.k j0(cn0 cn0Var) {
        return cn0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k k0(cn0 cn0Var) {
        return cn0Var.actionBar;
    }

    public static void l0(cn0 cn0Var, float f10) {
        cn0Var.actionBar.setTranslationY(f10);
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.x4[] x4VarArr = cn0Var.f44717n;
            if (i7 < x4VarArr.length) {
                ((org.telegram.ui.Components.qj0) x4VarArr[i7].f28752f).setPinnedSectionOffsetY((int) f10);
                i7++;
            } else {
                cn0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void m0(cn0 cn0Var, String str) {
        cn0Var.f44714c.getSearchField().setText(str);
        cn0Var.f44714c.getSearchField().setSelection(str.length());
        cn0Var.actionBar.A();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        zm0 zm0Var = this.f44712a;
        if (zm0Var != null) {
            zm0Var.addThemeColorKeys(hashSet);
        }
        zm0 zm0Var2 = this.f44713b;
        if (zm0Var2 != null) {
            zm0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.x4[] x4VarArr;
        View view;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.l6.f27973j5;
        org.telegram.ui.ActionBar.s6.l(kVar, 5, i7, null);
        boolean z9 = true;
        org.telegram.ui.ActionBar.s6.l(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.s6.l(this.actionBar, 3, org.telegram.ui.ActionBar.l6.I5, null);
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
        this.actionBar.setActionBarMenuOnItemClick(new wx(this, 25));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.r().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 18);
        this.f44714c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745761, null));
        EditTextBoldCursor searchField = this.f44714c.getSearchField();
        org.telegram.ui.ActionBar.s6.U(searchField, i7, null);
        org.telegram.ui.ActionBar.s6.v(searchField, i7, null);
        org.telegram.ui.ActionBar.s6.D(searchField, org.telegram.ui.ActionBar.l6.Je, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i10 = org.telegram.ui.ActionBar.l6.Y9;
        int i11 = org.telegram.ui.ActionBar.l6.Z9;
        scrollSlidingTextTabStrip2.L = i10;
        scrollSlidingTextTabStrip2.M = i11;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, c8.ha.e(-1, 44, 83));
        this.h.setDelegate(new an0(this, 0));
        this.f44722y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        bn0 bn0Var = new bn0(this, context);
        this.fragmentView = bn0Var;
        bn0Var.setWillNotDraw(false);
        zm0 zm0Var = this.f44712a;
        zm0Var.setParentFragment(this);
        org.telegram.ui.Components.lt ltVar = zm0Var.f52604d0;
        this.d = ltVar;
        ltVar.setSizeNotifierLayout(bn0Var);
        for (int i12 = 0; i12 < 4; i12++) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        view = zm0Var.f52603c0;
                    } else {
                        view = zm0Var.f52601b0;
                    }
                } else {
                    view = zm0Var.f52599a0;
                }
            } else {
                view = zm0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = zm0Var.Z;
        k0 k0Var = zm0Var.f52599a0;
        n00 n00Var = zm0Var.f52601b0;
        View view2 = zm0Var.f52603c0;
        org.telegram.ui.Components.lt ltVar2 = zm0Var.f52604d0;
        zm0 zm0Var2 = this.f44713b;
        zm0Var2.Z = frameLayout;
        zm0Var2.f52599a0 = k0Var;
        zm0Var2.f52604d0 = ltVar2;
        zm0Var2.f52601b0 = n00Var;
        zm0Var2.f52603c0 = view2;
        zm0Var2.f52619q0 = false;
        zm0Var2.setParentFragment(this);
        int i13 = 0;
        while (true) {
            x4VarArr = this.f44717n;
            if (i13 >= x4VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.x4 x4Var = new org.telegram.ui.ActionBar.x4(this, context);
            x4VarArr[i13] = x4Var;
            float f11 = f10;
            bn0Var.addView(x4Var, c8.ha.c(-1.0f, -1));
            if (i13 == 0) {
                org.telegram.ui.ActionBar.x4 x4Var2 = x4VarArr[i13];
                x4Var2.f28750c = zm0Var;
                x4Var2.f28752f = zm0Var.K;
            } else if (i13 == 1) {
                org.telegram.ui.ActionBar.x4 x4Var3 = x4VarArr[i13];
                x4Var3.f28750c = zm0Var2;
                x4Var3.f28752f = zm0Var2.K;
                x4Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.qj0) x4VarArr[i13].f28752f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.x4 x4Var4 = x4VarArr[i13];
            x4Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.f2) x4Var4.f28750c).getFragmentView();
            ((org.telegram.ui.Components.qj0) x4VarArr[i13].f28752f).setClipToPadding(false);
            org.telegram.ui.ActionBar.x4 x4Var5 = x4VarArr[i13];
            x4Var5.f28751e = ((org.telegram.ui.ActionBar.f2) x4Var5.f28750c).getActionBar();
            org.telegram.ui.ActionBar.x4 x4Var6 = x4VarArr[i13];
            x4Var6.addView((FrameLayout) x4Var6.d, c8.ha.c(-1.0f, -1));
            org.telegram.ui.ActionBar.x4 x4Var7 = x4VarArr[i13];
            x4Var7.addView((org.telegram.ui.ActionBar.k) x4Var7.f28751e, c8.ha.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.k) x4VarArr[i13].f28751e).setVisibility(8);
            ((org.telegram.ui.Components.qj0) x4VarArr[i13].f28752f).setOnScrollListener(new ai.o0(8, this, ((org.telegram.ui.Components.qj0) x4VarArr[i13].f28752f).getOnScrollListener()));
            i13++;
            f10 = f11;
        }
        float f12 = f10;
        bn0Var.addView(this.actionBar, c8.ha.c(-2.0f, -1));
        bn0Var.addView(zm0Var.Z, c8.ha.e(-1, 48, 83));
        bn0Var.addView(zm0Var.f52599a0, c8.ha.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        bn0Var.addView(zm0Var.f52601b0, c8.ha.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.id.M0(2131749270, null), null);
            this.h.a(1, org.telegram.messenger.id.M0(2131750468, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                x4VarArr[0].f28749b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z9 = false;
        }
        this.f44715e = z9;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27938h5));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Je));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f44714c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27973j5));
        int i7 = org.telegram.ui.ActionBar.l6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.addAll(this.f44712a.getThemeDescriptions());
        arrayList.addAll(this.f44713b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f44715e;
    }

    public final void o0(boolean z9) {
        org.telegram.ui.ActionBar.x4[] x4VarArr;
        int i7 = 0;
        while (true) {
            x4VarArr = this.f44717n;
            if (i7 >= x4VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.qj0) x4VarArr[i7].f28752f).C0();
            i7++;
        }
        ((org.telegram.ui.Components.qj0) x4VarArr[z9 ? 1 : 0].f28752f).getAdapter();
        ((org.telegram.ui.Components.qj0) x4VarArr[z9 ? 1 : 0].f28752f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((v4.b0) ((org.telegram.ui.Components.qj0) x4VarArr[z9 ? 1 : 0].f28752f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        zm0 zm0Var = this.f44712a;
        if (zm0Var != null) {
            zm0Var.onConfigurationChanged(configuration);
        }
        zm0 zm0Var2 = this.f44713b;
        if (zm0Var2 != null) {
            zm0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        zm0 zm0Var = this.f44712a;
        if (zm0Var != null) {
            zm0Var.onFragmentDestroy();
        }
        zm0 zm0Var2 = this.f44713b;
        if (zm0Var2 != null) {
            zm0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        zm0 zm0Var = this.f44712a;
        if (zm0Var != null) {
            zm0Var.onPause();
        }
        zm0 zm0Var2 = this.f44713b;
        if (zm0Var2 != null) {
            zm0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.r0 r0Var = this.f44714c;
        if (r0Var != null) {
            r0Var.F(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        zm0 zm0Var = this.f44712a;
        if (zm0Var != null) {
            zm0Var.onResume();
        }
        zm0 zm0Var2 = this.f44713b;
        if (zm0Var2 != null) {
            zm0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.r0 r0Var = this.f44714c;
            boolean z9 = false;
            if (r0Var != null && r0Var.getSearchField() != null) {
                this.f44714c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27973j5, false));
            }
            if (this.fragmentView != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false)) >= 0.721f) {
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
            zm0 zm0Var = this.f44712a;
            if (zm0Var != null && zm0Var.fragmentView != null) {
                zm0Var.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            zm0 zm0Var2 = this.f44713b;
            if (zm0Var2 != null && zm0Var2.fragmentView != null) {
                zm0Var2.onThemeColorsChanged();
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }
}
