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
public final class ar0 extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.jr0 f31866y = new org.telegram.ui.Components.jr0(4);
    public final uq0 f31867a;
    public final uq0 f31868b;
    public org.telegram.ui.ActionBar.v0 f31869c;
    public org.telegram.ui.Components.ku d;
    public boolean e;
    public final Paint f31870f;
    public ScrollSlidingTextTabStrip h;
    public final yq0[] f31871n;
    public AnimatorSet f31872r;
    public boolean f31873s;
    public boolean v;
    public boolean f31874w;
    public int f31875x;

    public ar0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, xn xnVar) {
        super(null);
        this.e = true;
        this.f31870f = new Paint();
        this.f31871n = new yq0[2];
        this.f31867a = new uq0(0, null, hashMap, arrayList, i10, z10, xnVar, false);
        this.f31868b = new uq0(1, null, hashMap, arrayList, i10, z10, xnVar, false);
    }

    public static void g0(ar0 ar0Var, float f7) {
        ar0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            yq0[] yq0VarArr = ar0Var.f31871n;
            if (i10 < yq0VarArr.length) {
                yq0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                ar0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(ar0 ar0Var, String str) {
        ar0Var.f31869c.getSearchField().setText(str);
        ar0Var.f31869c.getSearchField().setSelection(str.length());
        ar0Var.actionBar.w();
    }

    @Override
    public final View createView(Context context) {
        yq0[] yq0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18859h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f18895j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z10 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 14);
        this.f31869c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f31869c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.h6.Y9;
        int i12 = org.telegram.ui.ActionBar.h6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, w7.x5.e(-1, 44, 83));
        this.h.setDelegate(new vq0(this));
        this.f31875x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        xq0 xq0Var = new xq0(this, context);
        this.fragmentView = xq0Var;
        xq0Var.setWillNotDraw(false);
        uq0 uq0Var = this.f31867a;
        uq0Var.setParentFragment(this);
        org.telegram.ui.Components.ku kuVar = uq0Var.f38173d0;
        this.d = kuVar;
        kuVar.setSizeNotifierLayout(xq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = uq0Var.f38172c0;
                    } else {
                        view = uq0Var.f38170b0;
                    }
                } else {
                    view = uq0Var.f38168a0;
                }
            } else {
                view = uq0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = uq0Var.Z;
        k0 k0Var = uq0Var.f38168a0;
        p50 p50Var = uq0Var.f38170b0;
        View view2 = uq0Var.f38172c0;
        org.telegram.ui.Components.ku kuVar2 = uq0Var.f38173d0;
        uq0 uq0Var2 = this.f31868b;
        uq0Var2.Z = frameLayout;
        uq0Var2.f38168a0 = k0Var;
        uq0Var2.f38173d0 = kuVar2;
        uq0Var2.f38170b0 = p50Var;
        uq0Var2.f38172c0 = view2;
        uq0Var2.f38187q0 = false;
        uq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            yq0VarArr = this.f31871n;
            if (i14 >= yq0VarArr.length) {
                break;
            }
            yq0 yq0Var = new yq0(this, context);
            yq0VarArr[i14] = yq0Var;
            xq0Var.addView(yq0Var, w7.x5.c(-1.0f, -1));
            if (i14 == 0) {
                yq0 yq0Var2 = yq0VarArr[i14];
                yq0Var2.f39871a = uq0Var;
                yq0Var2.d = uq0Var.K;
            } else if (i14 == 1) {
                yq0 yq0Var3 = yq0VarArr[i14];
                yq0Var3.f39871a = uq0Var2;
                yq0Var3.d = uq0Var2.K;
                yq0Var3.setVisibility(8);
            }
            yq0VarArr[i14].d.setScrollingTouchSlop(1);
            yq0 yq0Var4 = yq0VarArr[i14];
            yq0Var4.f39872b = (FrameLayout) yq0Var4.f39871a.getFragmentView();
            yq0VarArr[i14].d.setClipToPadding(false);
            yq0 yq0Var5 = yq0VarArr[i14];
            yq0Var5.f39873c = yq0Var5.f39871a.getActionBar();
            yq0 yq0Var6 = yq0VarArr[i14];
            yq0Var6.addView(yq0Var6.f39872b, w7.x5.c(-1.0f, -1));
            yq0 yq0Var7 = yq0VarArr[i14];
            yq0Var7.addView(yq0Var7.f39873c, w7.x5.c(-2.0f, -1));
            yq0VarArr[i14].f39873c.setVisibility(8);
            yq0VarArr[i14].d.setOnScrollListener(new ii.n3(7, this, yq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        xq0Var.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        xq0Var.addView(uq0Var.Z, w7.x5.e(-1, 48, 83));
        xq0Var.addView(uq0Var.f38168a0, w7.x5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        xq0Var.addView(uq0Var.f38170b0, w7.x5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                yq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18859h5, false);
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
        int i10 = org.telegram.ui.ActionBar.h6.f18859h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f18895j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f31869c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f31867a.getThemeDescriptions());
        arrayList.addAll(this.f31868b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        yq0[] yq0VarArr;
        int i10 = 0;
        while (true) {
            yq0VarArr = this.f31871n;
            if (i10 >= yq0VarArr.length) {
                break;
            }
            yq0VarArr[i10].d.B0();
            i10++;
        }
        yq0VarArr[z10 ? 1 : 0].d.getAdapter();
        yq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.c0) yq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uq0 uq0Var = this.f31867a;
        if (uq0Var != null) {
            uq0Var.onConfigurationChanged(configuration);
        }
        uq0 uq0Var2 = this.f31868b;
        if (uq0Var2 != null) {
            uq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        uq0 uq0Var = this.f31867a;
        if (uq0Var != null) {
            uq0Var.onFragmentDestroy();
        }
        uq0 uq0Var2 = this.f31868b;
        if (uq0Var2 != null) {
            uq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        uq0 uq0Var = this.f31867a;
        if (uq0Var != null) {
            uq0Var.onPause();
        }
        uq0 uq0Var2 = this.f31868b;
        if (uq0Var2 != null) {
            uq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.v0 v0Var = this.f31869c;
        if (v0Var != null) {
            v0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        uq0 uq0Var = this.f31867a;
        if (uq0Var != null) {
            uq0Var.onResume();
        }
        uq0 uq0Var2 = this.f31868b;
        if (uq0Var2 != null) {
            uq0Var2.onResume();
        }
    }
}
