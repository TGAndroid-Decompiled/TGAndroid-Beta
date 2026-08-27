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

public final class fq0 extends org.telegram.ui.ActionBar.n2 {

    public static final org.telegram.ui.Components.sq0 f38184y = new org.telegram.ui.Components.sq0(4);

    public final aq0 f38185a;

    public final aq0 f38186b;

    public org.telegram.ui.ActionBar.v0 f38187c;
    public org.telegram.ui.Components.tt d;

    public boolean f38188e;

    public final Paint f38189f;
    public ScrollSlidingTextTabStrip h;

    public final dq0[] f38190n;

    public AnimatorSet f38191r;

    public boolean f38192s;
    public boolean v;

    public boolean f38193w;

    public int f38194x;

    public fq0(HashMap map, ArrayList arrayList, int i10, boolean z10, rn rnVar) {
        super(null);
        this.f38188e = true;
        this.f38189f = new Paint();
        this.f38190n = new dq0[2];
        this.f38185a = new aq0(0, null, map, arrayList, i10, z10, rnVar, false);
        this.f38186b = new aq0(1, null, map, arrayList, i10, z10, rnVar, false);
    }

    public static void g0(fq0 fq0Var, float f10) {
        fq0Var.actionBar.setTranslationY(f10);
        int i10 = 0;
        while (true) {
            dq0[] dq0VarArr = fq0Var.f38190n;
            if (i10 >= dq0VarArr.length) {
                fq0Var.fragmentView.invalidate();
                return;
            } else {
                dq0VarArr[i10].d.setPinnedSectionOffsetY((int) f10);
                i10++;
            }
        }
    }

    public static void h0(fq0 fq0Var, String str) {
        fq0Var.f38187c.getSearchField().setText(str);
        fq0Var.f38187c.getSearchField().setSelection(str.length());
        fq0Var.actionBar.x();
    }

    @Override
    public final View createView(Context context) {
        dq0[] dq0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 12));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new db(this, 13);
        this.f38187c = v0VarA;
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f38187c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.g6.Y9;
        int i12 = org.telegram.ui.ActionBar.g6.Z9;
        scrollSlidingTextTabStrip2.H = i11;
        scrollSlidingTextTabStrip2.I = i12;
        scrollSlidingTextTabStrip2.d();
        this.actionBar.addView(this.h, h7.z5.e(-1, 44, 83));
        this.h.setDelegate(new bq0(this));
        this.f38194x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        cq0 cq0Var = new cq0(this, context);
        this.fragmentView = cq0Var;
        cq0Var.setWillNotDraw(false);
        aq0 aq0Var = this.f38185a;
        aq0Var.setParentFragment(this);
        org.telegram.ui.Components.tt ttVar = aq0Var.Z;
        this.d = ttVar;
        ttVar.setSizeNotifierLayout(cq0Var);
        int i13 = 0;
        while (i13 < 4) {
            if (i13 == 0) {
                view = aq0Var.V;
            } else if (i13 != 1) {
                view = i13 != 2 ? aq0Var.Y : aq0Var.X;
            } else {
                view = aq0Var.W;
            }
            ((ViewGroup) view.getParent()).removeView(view);
            i13++;
        }
        FrameLayout frameLayout = aq0Var.V;
        n0 n0Var = aq0Var.W;
        aj0 aj0Var = aq0Var.X;
        View view2 = aq0Var.Y;
        org.telegram.ui.Components.tt ttVar2 = aq0Var.Z;
        aq0 aq0Var2 = this.f38186b;
        aq0Var2.V = frameLayout;
        aq0Var2.W = n0Var;
        aq0Var2.Z = ttVar2;
        aq0Var2.X = aj0Var;
        aq0Var2.Y = view2;
        aq0Var2.m0 = false;
        aq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            dq0VarArr = this.f38190n;
            if (i14 >= dq0VarArr.length) {
                break;
            }
            dq0 dq0Var = new dq0(this, context);
            dq0VarArr[i14] = dq0Var;
            cq0Var.addView(dq0Var, h7.z5.c(-1.0f, -1));
            if (i14 == 0) {
                dq0 dq0Var2 = dq0VarArr[i14];
                dq0Var2.f37526a = aq0Var;
                dq0Var2.d = aq0Var.G;
            } else if (i14 == 1) {
                dq0 dq0Var3 = dq0VarArr[i14];
                dq0Var3.f37526a = aq0Var2;
                dq0Var3.d = aq0Var2.G;
                dq0Var3.setVisibility(8);
            }
            dq0VarArr[i14].d.setScrollingTouchSlop(1);
            dq0 dq0Var4 = dq0VarArr[i14];
            dq0Var4.f37527b = (FrameLayout) dq0Var4.f37526a.getFragmentView();
            dq0VarArr[i14].d.setClipToPadding(false);
            dq0 dq0Var5 = dq0VarArr[i14];
            dq0Var5.f37528c = dq0Var5.f37526a.getActionBar();
            dq0 dq0Var6 = dq0VarArr[i14];
            dq0Var6.addView(dq0Var6.f37527b, h7.z5.c(-1.0f, -1));
            dq0 dq0Var7 = dq0VarArr[i14];
            dq0Var7.addView(dq0Var7.f37528c, h7.z5.c(-2.0f, -1));
            dq0VarArr[i14].f37528c.setVisibility(8);
            dq0VarArr[i14].d.setOnScrollListener(new fh.l(8, this, dq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        cq0Var.addView(this.actionBar, h7.z5.c(-2.0f, -1));
        cq0Var.addView(aq0Var.V, h7.z5.e(-1, 48, 83));
        cq0Var.addView(aq0Var.W, h7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        cq0Var.addView(aq0Var.X, h7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                dq0VarArr[0].f37529e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        this.f38188e = this.h.getCurrentTabId() == this.h.getFirstTabId();
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false);
        if (Build.VERSION.SDK_INT >= 23 && AndroidUtilities.computePerceivedBrightness(iW0) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23124h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38187c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.g6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f38185a.getThemeDescriptions());
        arrayList.addAll(this.f38186b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f38188e;
    }

    public final void j0(boolean z10) {
        dq0[] dq0VarArr;
        int i10 = 0;
        while (true) {
            dq0VarArr = this.f38190n;
            if (i10 >= dq0VarArr.length) {
                break;
            }
            dq0VarArr[i10].d.B0();
            i10++;
        }
        dq0VarArr[z10 ? 1 : 0].d.getAdapter();
        dq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((f2.k0) dq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aq0 aq0Var = this.f38185a;
        if (aq0Var != null) {
            aq0Var.onConfigurationChanged(configuration);
        }
        aq0 aq0Var2 = this.f38186b;
        if (aq0Var2 != null) {
            aq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        aq0 aq0Var = this.f38185a;
        if (aq0Var != null) {
            aq0Var.onFragmentDestroy();
        }
        aq0 aq0Var2 = this.f38186b;
        if (aq0Var2 != null) {
            aq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        aq0 aq0Var = this.f38185a;
        if (aq0Var != null) {
            aq0Var.onPause();
        }
        aq0 aq0Var2 = this.f38186b;
        if (aq0Var2 != null) {
            aq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.v0 v0Var = this.f38187c;
        if (v0Var != null) {
            v0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        aq0 aq0Var = this.f38185a;
        if (aq0Var != null) {
            aq0Var.onResume();
        }
        aq0 aq0Var2 = this.f38186b;
        if (aq0Var2 != null) {
            aq0Var2.onResume();
        }
    }
}
