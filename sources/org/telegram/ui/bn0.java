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
public final class bn0 extends org.telegram.ui.ActionBar.e2 {
    public static final org.telegram.ui.Components.tp0 E = new org.telegram.ui.Components.tp0(4);
    public final ym0 f45790a;
    public final ym0 f45791b;
    public org.telegram.ui.ActionBar.q0 f45792c;
    public org.telegram.ui.Components.rt d;
    public boolean f45793e;
    public final Paint f45794f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.v4[] f45795n;
    public AnimatorSet f45796r;
    public boolean f45797s;
    public boolean f45798w;
    public boolean f45799x;
    public int f45800y;

    public bn0(HashMap hashMap, ArrayList arrayList, int i7, boolean z10, an anVar) {
        super(null);
        this.f45793e = true;
        this.f45794f = new Paint();
        this.f45795n = new org.telegram.ui.ActionBar.v4[2];
        this.f45790a = new ym0(0, null, hashMap, arrayList, i7, z10, anVar, false);
        this.f45791b = new ym0(1, null, hashMap, arrayList, i7, z10, anVar, false);
    }

    public static org.telegram.ui.ActionBar.k j0(bn0 bn0Var) {
        return bn0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k k0(bn0 bn0Var) {
        return bn0Var.actionBar;
    }

    public static void l0(bn0 bn0Var, float f10) {
        bn0Var.actionBar.setTranslationY(f10);
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.v4[] v4VarArr = bn0Var.f45795n;
            if (i7 < v4VarArr.length) {
                ((org.telegram.ui.Components.uj0) v4VarArr[i7].f29758f).setPinnedSectionOffsetY((int) f10);
                i7++;
            } else {
                bn0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void m0(bn0 bn0Var, String str) {
        bn0Var.f45792c.getSearchField().setText(str);
        bn0Var.f45792c.getSearchField().setSelection(str.length());
        bn0Var.actionBar.B();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        ym0 ym0Var = this.f45790a;
        if (ym0Var != null) {
            ym0Var.addThemeColorKeys(hashSet);
        }
        ym0 ym0Var2 = this.f45791b;
        if (ym0Var2 != null) {
            ym0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v4[] v4VarArr;
        View view;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.l(kVar, 5, i7, null);
        boolean z10 = true;
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, i7, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new lx(this, 26));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232487);
        a10.O();
        a10.I = new kg.x1(this, 18);
        this.f45792c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745761, null));
        EditTextBoldCursor searchField = this.f45792c.getSearchField();
        org.telegram.ui.ActionBar.q6.U(searchField, i7, null);
        org.telegram.ui.ActionBar.q6.v(searchField, i7, null);
        org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Me, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i10 = org.telegram.ui.ActionBar.j6.Y9;
        int i11 = org.telegram.ui.ActionBar.j6.Z9;
        scrollSlidingTextTabStrip2.M = i10;
        scrollSlidingTextTabStrip2.N = i11;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, c8.ja.e(-1, 44, 83));
        this.h.setDelegate(new zm0(this, 0));
        this.f45800y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        an0 an0Var = new an0(this, context);
        this.fragmentView = an0Var;
        an0Var.setWillNotDraw(false);
        ym0 ym0Var = this.f45790a;
        ym0Var.setParentFragment(this);
        org.telegram.ui.Components.rt rtVar = ym0Var.f53572e0;
        this.d = rtVar;
        rtVar.setSizeNotifierLayout(an0Var);
        for (int i12 = 0; i12 < 4; i12++) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        view = ym0Var.f53570d0;
                    } else {
                        view = ym0Var.f53569c0;
                    }
                } else {
                    view = ym0Var.f53567b0;
                }
            } else {
                view = ym0Var.f53565a0;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = ym0Var.f53565a0;
        k0 k0Var = ym0Var.f53567b0;
        rv rvVar = ym0Var.f53569c0;
        View view2 = ym0Var.f53570d0;
        org.telegram.ui.Components.rt rtVar2 = ym0Var.f53572e0;
        ym0 ym0Var2 = this.f45791b;
        ym0Var2.f53565a0 = frameLayout;
        ym0Var2.f53567b0 = k0Var;
        ym0Var2.f53572e0 = rtVar2;
        ym0Var2.f53569c0 = rvVar;
        ym0Var2.f53570d0 = view2;
        ym0Var2.f53587r0 = false;
        ym0Var2.setParentFragment(this);
        int i13 = 0;
        while (true) {
            v4VarArr = this.f45795n;
            if (i13 >= v4VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.v4 v4Var = new org.telegram.ui.ActionBar.v4(this, context);
            v4VarArr[i13] = v4Var;
            float f11 = f10;
            an0Var.addView(v4Var, c8.ja.c(-1.0f, -1));
            if (i13 == 0) {
                org.telegram.ui.ActionBar.v4 v4Var2 = v4VarArr[i13];
                v4Var2.f29756c = ym0Var;
                v4Var2.f29758f = ym0Var.L;
            } else if (i13 == 1) {
                org.telegram.ui.ActionBar.v4 v4Var3 = v4VarArr[i13];
                v4Var3.f29756c = ym0Var2;
                v4Var3.f29758f = ym0Var2.L;
                v4Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.uj0) v4VarArr[i13].f29758f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.v4 v4Var4 = v4VarArr[i13];
            v4Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.e2) v4Var4.f29756c).getFragmentView();
            ((org.telegram.ui.Components.uj0) v4VarArr[i13].f29758f).setClipToPadding(false);
            org.telegram.ui.ActionBar.v4 v4Var5 = v4VarArr[i13];
            v4Var5.f29757e = ((org.telegram.ui.ActionBar.e2) v4Var5.f29756c).getActionBar();
            org.telegram.ui.ActionBar.v4 v4Var6 = v4VarArr[i13];
            v4Var6.addView((FrameLayout) v4Var6.d, c8.ja.c(-1.0f, -1));
            org.telegram.ui.ActionBar.v4 v4Var7 = v4VarArr[i13];
            v4Var7.addView((org.telegram.ui.ActionBar.k) v4Var7.f29757e, c8.ja.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.k) v4VarArr[i13].f29757e).setVisibility(8);
            ((org.telegram.ui.Components.uj0) v4VarArr[i13].f29758f).setOnScrollListener(new bi.w3(9, this, ((org.telegram.ui.Components.uj0) v4VarArr[i13].f29758f).getOnScrollListener()));
            i13++;
            f10 = f11;
        }
        float f12 = f10;
        an0Var.addView(this.actionBar, c8.ja.c(-2.0f, -1));
        an0Var.addView(ym0Var.f53565a0, c8.ja.e(-1, 48, 83));
        an0Var.addView(ym0Var.f53567b0, c8.ja.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        an0Var.addView(ym0Var.f53569c0, c8.ja.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.hd.M0(2131749270, null), null);
            this.h.a(1, org.telegram.messenger.hd.M0(2131750468, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                v4VarArr[0].f29755b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.f45793e = z10;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28922h5));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Me));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f45792c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28957j5));
        int i7 = org.telegram.ui.ActionBar.j6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.addAll(this.f45790a.getThemeDescriptions());
        arrayList.addAll(this.f45791b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f45793e;
    }

    public final void o0(boolean z10) {
        org.telegram.ui.ActionBar.v4[] v4VarArr;
        int i7 = 0;
        while (true) {
            v4VarArr = this.f45795n;
            if (i7 >= v4VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.uj0) v4VarArr[i7].f29758f).C0();
            i7++;
        }
        ((org.telegram.ui.Components.uj0) v4VarArr[z10 ? 1 : 0].f29758f).getAdapter();
        ((org.telegram.ui.Components.uj0) v4VarArr[z10 ? 1 : 0].f29758f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((v4.b0) ((org.telegram.ui.Components.uj0) v4VarArr[z10 ? 1 : 0].f29758f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ym0 ym0Var = this.f45790a;
        if (ym0Var != null) {
            ym0Var.onConfigurationChanged(configuration);
        }
        ym0 ym0Var2 = this.f45791b;
        if (ym0Var2 != null) {
            ym0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        ym0 ym0Var = this.f45790a;
        if (ym0Var != null) {
            ym0Var.onFragmentDestroy();
        }
        ym0 ym0Var2 = this.f45791b;
        if (ym0Var2 != null) {
            ym0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ym0 ym0Var = this.f45790a;
        if (ym0Var != null) {
            ym0Var.onPause();
        }
        ym0 ym0Var2 = this.f45791b;
        if (ym0Var2 != null) {
            ym0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.q0 q0Var = this.f45792c;
        if (q0Var != null) {
            q0Var.G(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        ym0 ym0Var = this.f45790a;
        if (ym0Var != null) {
            ym0Var.onResume();
        }
        ym0 ym0Var2 = this.f45791b;
        if (ym0Var2 != null) {
            ym0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.q0 q0Var = this.f45792c;
            boolean z10 = false;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f45792c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false));
            }
            if (this.fragmentView != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false)) >= 0.721f) {
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
            ym0 ym0Var = this.f45790a;
            if (ym0Var != null && ym0Var.fragmentView != null) {
                ym0Var.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            ym0 ym0Var2 = this.f45791b;
            if (ym0Var2 != null && ym0Var2.fragmentView != null) {
                ym0Var2.onThemeColorsChanged();
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }
}
