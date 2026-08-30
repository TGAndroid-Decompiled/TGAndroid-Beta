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
public final class kq0 extends org.telegram.ui.ActionBar.p2 {
    public static final org.telegram.ui.Components.kr0 f35787y = new org.telegram.ui.Components.kr0(4);
    public final fq0 f35788a;
    public final fq0 f35789b;
    public org.telegram.ui.ActionBar.w0 f35790c;
    public org.telegram.ui.Components.du d;
    public boolean e;
    public final Paint f35791f;
    public ScrollSlidingTextTabStrip h;
    public final iq0[] f35792n;
    public AnimatorSet f35793r;
    public boolean f35794s;
    public boolean v;
    public boolean f35795w;
    public int f35796x;

    public kq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z4, xn xnVar) {
        super(null);
        this.e = true;
        this.f35791f = new Paint();
        this.f35792n = new iq0[2];
        this.f35788a = new fq0(0, null, hashMap, arrayList, i10, z4, xnVar, false);
        this.f35789b = new fq0(1, null, hashMap, arrayList, i10, z4, xnVar, false);
    }

    public static org.telegram.ui.ActionBar.k c0(kq0 kq0Var) {
        return kq0Var.actionBar;
    }

    public static void g0(kq0 kq0Var, float f10) {
        kq0Var.actionBar.setTranslationY(f10);
        int i10 = 0;
        while (true) {
            iq0[] iq0VarArr = kq0Var.f35792n;
            if (i10 < iq0VarArr.length) {
                iq0VarArr[i10].d.setPinnedSectionOffsetY((int) f10);
                i10++;
            } else {
                kq0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(kq0 kq0Var, String str) {
        kq0Var.f35790c.getSearchField().setText(str);
        kq0Var.f35790c.getSearchField().setSelection(str.length());
        kq0Var.actionBar.w();
    }

    @Override
    public final View createView(Context context) {
        iq0[] iq0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19977h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20012j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z4 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 3));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 13);
        this.f35790c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f35790c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.j6.Y9;
        int i12 = org.telegram.ui.ActionBar.j6.Z9;
        scrollSlidingTextTabStrip2.I = i11;
        scrollSlidingTextTabStrip2.J = i12;
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, k7.b6.e(-1, 44, 83));
        this.h.setDelegate(new gq0(this));
        this.f35796x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        hq0 hq0Var = new hq0(this, context);
        this.fragmentView = hq0Var;
        hq0Var.setWillNotDraw(false);
        fq0 fq0Var = this.f35788a;
        fq0Var.setParentFragment(this);
        org.telegram.ui.Components.du duVar = fq0Var.f34314a0;
        this.d = duVar;
        duVar.setSizeNotifierLayout(hq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = fq0Var.Z;
                    } else {
                        view = fq0Var.Y;
                    }
                } else {
                    view = fq0Var.X;
                }
            } else {
                view = fq0Var.W;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = fq0Var.W;
        l0 l0Var = fq0Var.X;
        eg.h0 h0Var = fq0Var.Y;
        View view2 = fq0Var.Z;
        org.telegram.ui.Components.du duVar2 = fq0Var.f34314a0;
        fq0 fq0Var2 = this.f35789b;
        fq0Var2.W = frameLayout;
        fq0Var2.X = l0Var;
        fq0Var2.f34314a0 = duVar2;
        fq0Var2.Y = h0Var;
        fq0Var2.Z = view2;
        fq0Var2.f34330n0 = false;
        fq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            iq0VarArr = this.f35792n;
            if (i14 >= iq0VarArr.length) {
                break;
            }
            iq0 iq0Var = new iq0(this, context);
            iq0VarArr[i14] = iq0Var;
            hq0Var.addView(iq0Var, k7.b6.c(-1.0f, -1));
            if (i14 == 0) {
                iq0 iq0Var2 = iq0VarArr[i14];
                iq0Var2.f35150a = fq0Var;
                iq0Var2.d = fq0Var.H;
            } else if (i14 == 1) {
                iq0 iq0Var3 = iq0VarArr[i14];
                iq0Var3.f35150a = fq0Var2;
                iq0Var3.d = fq0Var2.H;
                iq0Var3.setVisibility(8);
            }
            iq0VarArr[i14].d.setScrollingTouchSlop(1);
            iq0 iq0Var4 = iq0VarArr[i14];
            iq0Var4.f35151b = (FrameLayout) iq0Var4.f35150a.getFragmentView();
            iq0VarArr[i14].d.setClipToPadding(false);
            iq0 iq0Var5 = iq0VarArr[i14];
            iq0Var5.f35152c = iq0Var5.f35150a.getActionBar();
            iq0 iq0Var6 = iq0VarArr[i14];
            iq0Var6.addView(iq0Var6.f35151b, k7.b6.c(-1.0f, -1));
            iq0 iq0Var7 = iq0VarArr[i14];
            iq0Var7.addView(iq0Var7.f35152c, k7.b6.c(-2.0f, -1));
            iq0VarArr[i14].f35152c.setVisibility(8);
            iq0VarArr[i14].d.setOnScrollListener(new jh.l(8, this, iq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        hq0Var.addView(this.actionBar, k7.b6.c(-2.0f, -1));
        hq0Var.addView(fq0Var.W, k7.b6.e(-1, 48, 83));
        hq0Var.addView(fq0Var.X, k7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        hq0Var.addView(fq0Var.Y, k7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                iq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z4 = false;
        }
        this.e = z4;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19977h5, false);
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
        int i10 = org.telegram.ui.ActionBar.j6.f19977h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f20012j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35790c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.j6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f35788a.getThemeDescriptions());
        arrayList.addAll(this.f35789b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z4) {
        iq0[] iq0VarArr;
        int i10 = 0;
        while (true) {
            iq0VarArr = this.f35792n;
            if (i10 >= iq0VarArr.length) {
                break;
            }
            iq0VarArr[i10].d.B0();
            i10++;
        }
        iq0VarArr[z4 ? 1 : 0].d.getAdapter();
        iq0VarArr[z4 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((f2.i0) iq0VarArr[z4 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fq0 fq0Var = this.f35788a;
        if (fq0Var != null) {
            fq0Var.onConfigurationChanged(configuration);
        }
        fq0 fq0Var2 = this.f35789b;
        if (fq0Var2 != null) {
            fq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        fq0 fq0Var = this.f35788a;
        if (fq0Var != null) {
            fq0Var.onFragmentDestroy();
        }
        fq0 fq0Var2 = this.f35789b;
        if (fq0Var2 != null) {
            fq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        fq0 fq0Var = this.f35788a;
        if (fq0Var != null) {
            fq0Var.onPause();
        }
        fq0 fq0Var2 = this.f35789b;
        if (fq0Var2 != null) {
            fq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.w0 w0Var = this.f35790c;
        if (w0Var != null) {
            w0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        fq0 fq0Var = this.f35788a;
        if (fq0Var != null) {
            fq0Var.onResume();
        }
        fq0 fq0Var2 = this.f35789b;
        if (fq0Var2 != null) {
            fq0Var2.onResume();
        }
    }
}
