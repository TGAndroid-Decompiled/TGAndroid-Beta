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
public final class gr0 extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.ir0 f36751y = new org.telegram.ui.Components.ir0(4);
    public final br0 f36752a;
    public final br0 f36753b;
    public org.telegram.ui.ActionBar.v0 f36754c;
    public org.telegram.ui.Components.hu d;
    public boolean f36755e;
    public final Paint f36756f;
    public ScrollSlidingTextTabStrip h;
    public final er0[] f36757n;
    public AnimatorSet f36758r;
    public boolean f36759s;
    public boolean v;
    public boolean f36760w;
    public int f36761x;

    public gr0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, co coVar) {
        super(null);
        this.f36755e = true;
        this.f36756f = new Paint();
        this.f36757n = new er0[2];
        this.f36752a = new br0(0, null, hashMap, arrayList, i10, z10, coVar, false);
        this.f36753b = new br0(1, null, hashMap, arrayList, i10, z10, coVar, false);
    }

    public static void g0(gr0 gr0Var, float f7) {
        gr0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            er0[] er0VarArr = gr0Var.f36757n;
            if (i10 < er0VarArr.length) {
                er0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                gr0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(gr0 gr0Var, String str) {
        gr0Var.f36754c.getSearchField().setText(str);
        gr0Var.f36754c.getSearchField().setSelection(str.length());
        gr0Var.actionBar.w();
    }

    @Override
    public final View createView(Context context) {
        er0[] er0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20770j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z10 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 17));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 14);
        this.f36754c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f36754c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.j6.Y9;
        int i12 = org.telegram.ui.ActionBar.j6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.d();
        this.actionBar.addView(this.h, w7.x5.e(-1, 44, 83));
        this.h.setDelegate(new cr0(this));
        this.f36761x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        dr0 dr0Var = new dr0(this, context);
        this.fragmentView = dr0Var;
        dr0Var.setWillNotDraw(false);
        br0 br0Var = this.f36752a;
        br0Var.setParentFragment(this);
        org.telegram.ui.Components.hu huVar = br0Var.f34887d0;
        this.d = huVar;
        huVar.setSizeNotifierLayout(dr0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = br0Var.f34886c0;
                    } else {
                        view = br0Var.f34884b0;
                    }
                } else {
                    view = br0Var.f34882a0;
                }
            } else {
                view = br0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = br0Var.Z;
        j0 j0Var = br0Var.f34882a0;
        t50 t50Var = br0Var.f34884b0;
        View view2 = br0Var.f34886c0;
        org.telegram.ui.Components.hu huVar2 = br0Var.f34887d0;
        br0 br0Var2 = this.f36753b;
        br0Var2.Z = frameLayout;
        br0Var2.f34882a0 = j0Var;
        br0Var2.f34887d0 = huVar2;
        br0Var2.f34884b0 = t50Var;
        br0Var2.f34886c0 = view2;
        br0Var2.f34902q0 = false;
        br0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            er0VarArr = this.f36757n;
            if (i14 >= er0VarArr.length) {
                break;
            }
            er0 er0Var = new er0(this, context);
            er0VarArr[i14] = er0Var;
            dr0Var.addView(er0Var, w7.x5.c(-1.0f, -1));
            if (i14 == 0) {
                er0 er0Var2 = er0VarArr[i14];
                er0Var2.f36154a = br0Var;
                er0Var2.d = br0Var.K;
            } else if (i14 == 1) {
                er0 er0Var3 = er0VarArr[i14];
                er0Var3.f36154a = br0Var2;
                er0Var3.d = br0Var2.K;
                er0Var3.setVisibility(8);
            }
            er0VarArr[i14].d.setScrollingTouchSlop(1);
            er0 er0Var4 = er0VarArr[i14];
            er0Var4.f36155b = (FrameLayout) er0Var4.f36154a.getFragmentView();
            er0VarArr[i14].d.setClipToPadding(false);
            er0 er0Var5 = er0VarArr[i14];
            er0Var5.f36156c = er0Var5.f36154a.getActionBar();
            er0 er0Var6 = er0VarArr[i14];
            er0Var6.addView(er0Var6.f36155b, w7.x5.c(-1.0f, -1));
            er0 er0Var7 = er0VarArr[i14];
            er0Var7.addView(er0Var7.f36156c, w7.x5.c(-2.0f, -1));
            er0VarArr[i14].f36156c.setVisibility(8);
            er0VarArr[i14].d.setOnScrollListener(new ji.l3(7, this, er0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        dr0Var.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        dr0Var.addView(br0Var.Z, w7.x5.e(-1, 48, 83));
        dr0Var.addView(br0Var.f34882a0, w7.x5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        dr0Var.addView(br0Var.f34884b0, w7.x5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                er0VarArr[0].f36157e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.f36755e = z10;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false);
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
        int i10 = org.telegram.ui.ActionBar.j6.f20734h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f20770j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36754c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.j6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f36752a.getThemeDescriptions());
        arrayList.addAll(this.f36753b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f36755e;
    }

    public final void j0(boolean z10) {
        er0[] er0VarArr;
        int i10 = 0;
        while (true) {
            er0VarArr = this.f36757n;
            if (i10 >= er0VarArr.length) {
                break;
            }
            er0VarArr[i10].d.B0();
            i10++;
        }
        er0VarArr[z10 ? 1 : 0].d.getAdapter();
        er0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.c0) er0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        br0 br0Var = this.f36752a;
        if (br0Var != null) {
            br0Var.onConfigurationChanged(configuration);
        }
        br0 br0Var2 = this.f36753b;
        if (br0Var2 != null) {
            br0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        br0 br0Var = this.f36752a;
        if (br0Var != null) {
            br0Var.onFragmentDestroy();
        }
        br0 br0Var2 = this.f36753b;
        if (br0Var2 != null) {
            br0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        br0 br0Var = this.f36752a;
        if (br0Var != null) {
            br0Var.onPause();
        }
        br0 br0Var2 = this.f36753b;
        if (br0Var2 != null) {
            br0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.v0 v0Var = this.f36754c;
        if (v0Var != null) {
            v0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        br0 br0Var = this.f36752a;
        if (br0Var != null) {
            br0Var.onResume();
        }
        br0 br0Var2 = this.f36753b;
        if (br0Var2 != null) {
            br0Var2.onResume();
        }
    }
}
