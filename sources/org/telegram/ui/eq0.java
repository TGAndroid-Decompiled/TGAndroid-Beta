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
public final class eq0 extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.cr0 f37885y = new org.telegram.ui.Components.cr0(4);
    public final zp0 f37886a;
    public final zp0 f37887b;
    public org.telegram.ui.ActionBar.w0 f37888c;
    public org.telegram.ui.Components.au d;
    public boolean f37889e;
    public final Paint f37890f;
    public ScrollSlidingTextTabStrip h;
    public final cq0[] f37891n;
    public AnimatorSet f37892r;
    public boolean f37893s;
    public boolean v;
    public boolean f37894w;
    public int f37895x;

    public eq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, tn tnVar) {
        super(null);
        this.f37889e = true;
        this.f37890f = new Paint();
        this.f37891n = new cq0[2];
        this.f37886a = new zp0(0, null, hashMap, arrayList, i10, z10, tnVar, false);
        this.f37887b = new zp0(1, null, hashMap, arrayList, i10, z10, tnVar, false);
    }

    public static void g0(eq0 eq0Var, float f9) {
        eq0Var.actionBar.setTranslationY(f9);
        int i10 = 0;
        while (true) {
            cq0[] cq0VarArr = eq0Var.f37891n;
            if (i10 < cq0VarArr.length) {
                cq0VarArr[i10].d.setPinnedSectionOffsetY((int) f9);
                i10++;
            } else {
                eq0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(eq0 eq0Var, String str) {
        eq0Var.f37888c.getSearchField().setText(str);
        eq0Var.f37888c.getSearchField().setSelection(str.length());
        eq0Var.actionBar.w();
    }

    @Override
    public final View createView(Context context) {
        cq0[] cq0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23169j5;
        lVar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z10 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 3));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new bb(this, 13);
        this.f37888c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f37888c.getSearchField();
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
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, i7.f6.e(-1, 44, 83));
        this.h.setDelegate(new aq0(this));
        this.f37895x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        bq0 bq0Var = new bq0(this, context);
        this.fragmentView = bq0Var;
        bq0Var.setWillNotDraw(false);
        zp0 zp0Var = this.f37886a;
        zp0Var.setParentFragment(this);
        org.telegram.ui.Components.au auVar = zp0Var.Z;
        this.d = auVar;
        auVar.setSizeNotifierLayout(bq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = zp0Var.Y;
                    } else {
                        view = zp0Var.X;
                    }
                } else {
                    view = zp0Var.W;
                }
            } else {
                view = zp0Var.V;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = zp0Var.V;
        n0 n0Var = zp0Var.W;
        op0 op0Var = zp0Var.X;
        View view2 = zp0Var.Y;
        org.telegram.ui.Components.au auVar2 = zp0Var.Z;
        zp0 zp0Var2 = this.f37887b;
        zp0Var2.V = frameLayout;
        zp0Var2.W = n0Var;
        zp0Var2.Z = auVar2;
        zp0Var2.X = op0Var;
        zp0Var2.Y = view2;
        zp0Var2.m0 = false;
        zp0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            cq0VarArr = this.f37891n;
            if (i14 >= cq0VarArr.length) {
                break;
            }
            cq0 cq0Var = new cq0(this, context);
            cq0VarArr[i14] = cq0Var;
            bq0Var.addView(cq0Var, i7.f6.c(-1.0f, -1));
            if (i14 == 0) {
                cq0 cq0Var2 = cq0VarArr[i14];
                cq0Var2.f37193a = zp0Var;
                cq0Var2.d = zp0Var.G;
            } else if (i14 == 1) {
                cq0 cq0Var3 = cq0VarArr[i14];
                cq0Var3.f37193a = zp0Var2;
                cq0Var3.d = zp0Var2.G;
                cq0Var3.setVisibility(8);
            }
            cq0VarArr[i14].d.setScrollingTouchSlop(1);
            cq0 cq0Var4 = cq0VarArr[i14];
            cq0Var4.f37194b = (FrameLayout) cq0Var4.f37193a.getFragmentView();
            cq0VarArr[i14].d.setClipToPadding(false);
            cq0 cq0Var5 = cq0VarArr[i14];
            cq0Var5.f37195c = cq0Var5.f37193a.getActionBar();
            cq0 cq0Var6 = cq0VarArr[i14];
            cq0Var6.addView(cq0Var6.f37194b, i7.f6.c(-1.0f, -1));
            cq0 cq0Var7 = cq0VarArr[i14];
            cq0Var7.addView(cq0Var7.f37195c, i7.f6.c(-2.0f, -1));
            cq0VarArr[i14].f37195c.setVisibility(8);
            cq0VarArr[i14].d.setOnScrollListener(new hh.l(8, this, cq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        bq0Var.addView(this.actionBar, i7.f6.c(-2.0f, -1));
        bq0Var.addView(zp0Var.V, i7.f6.e(-1, 48, 83));
        bq0Var.addView(zp0Var.W, i7.f6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        bq0Var.addView(zp0Var.X, i7.f6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                cq0VarArr[0].f37196e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.f37889e = z10;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false);
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
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f37888c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.g6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f37886a.getThemeDescriptions());
        arrayList.addAll(this.f37887b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f37889e;
    }

    public final void j0(boolean z10) {
        cq0[] cq0VarArr;
        int i10 = 0;
        while (true) {
            cq0VarArr = this.f37891n;
            if (i10 >= cq0VarArr.length) {
                break;
            }
            cq0VarArr[i10].d.B0();
            i10++;
        }
        cq0VarArr[z10 ? 1 : 0].d.getAdapter();
        cq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((f2.j0) cq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        zp0 zp0Var = this.f37886a;
        if (zp0Var != null) {
            zp0Var.onConfigurationChanged(configuration);
        }
        zp0 zp0Var2 = this.f37887b;
        if (zp0Var2 != null) {
            zp0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        zp0 zp0Var = this.f37886a;
        if (zp0Var != null) {
            zp0Var.onFragmentDestroy();
        }
        zp0 zp0Var2 = this.f37887b;
        if (zp0Var2 != null) {
            zp0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        zp0 zp0Var = this.f37886a;
        if (zp0Var != null) {
            zp0Var.onPause();
        }
        zp0 zp0Var2 = this.f37887b;
        if (zp0Var2 != null) {
            zp0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.w0 w0Var = this.f37888c;
        if (w0Var != null) {
            w0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        zp0 zp0Var = this.f37886a;
        if (zp0Var != null) {
            zp0Var.onResume();
        }
        zp0 zp0Var2 = this.f37887b;
        if (zp0Var2 != null) {
            zp0Var2.onResume();
        }
    }
}
