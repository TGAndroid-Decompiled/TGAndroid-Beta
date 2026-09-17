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
public final class ir0 extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.kr0 f34656y = new org.telegram.ui.Components.kr0(4);
    public final cr0 f34657a;
    public final cr0 f34658b;
    public org.telegram.ui.ActionBar.w0 f34659c;
    public org.telegram.ui.Components.ju d;
    public boolean e;
    public final Paint f34660f;
    public ScrollSlidingTextTabStrip h;
    public final gr0[] f34661n;
    public AnimatorSet f34662r;
    public boolean f34663s;
    public boolean v;
    public boolean f34664w;
    public int f34665x;

    public ir0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, bo boVar) {
        super(null);
        this.e = true;
        this.f34660f = new Paint();
        this.f34661n = new gr0[2];
        this.f34657a = new cr0(0, null, hashMap, arrayList, i10, z10, boVar, false);
        this.f34658b = new cr0(1, null, hashMap, arrayList, i10, z10, boVar, false);
    }

    public static void g0(ir0 ir0Var, float f7) {
        ir0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            gr0[] gr0VarArr = ir0Var.f34661n;
            if (i10 < gr0VarArr.length) {
                gr0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                ir0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(ir0 ir0Var, String str) {
        ir0Var.f34659c.getSearchField().setText(str);
        ir0Var.f34659c.getSearchField().setSelection(str.length());
        ir0Var.actionBar.w();
    }

    @Override
    public final View createView(Context context) {
        gr0[] gr0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18933h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18969j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z10 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new x70(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 15);
        this.f34659c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f34659c.getSearchField();
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
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, w7.x5.e(-1, 44, 83));
        this.h.setDelegate(new dr0(this));
        this.f34665x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        fr0 fr0Var = new fr0(this, context);
        this.fragmentView = fr0Var;
        fr0Var.setWillNotDraw(false);
        cr0 cr0Var = this.f34657a;
        cr0Var.setParentFragment(this);
        org.telegram.ui.Components.ju juVar = cr0Var.f32877d0;
        this.d = juVar;
        juVar.setSizeNotifierLayout(fr0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = cr0Var.f32876c0;
                    } else {
                        view = cr0Var.f32874b0;
                    }
                } else {
                    view = cr0Var.f32872a0;
                }
            } else {
                view = cr0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = cr0Var.Z;
        j0 j0Var = cr0Var.f32872a0;
        u50 u50Var = cr0Var.f32874b0;
        View view2 = cr0Var.f32876c0;
        org.telegram.ui.Components.ju juVar2 = cr0Var.f32877d0;
        cr0 cr0Var2 = this.f34658b;
        cr0Var2.Z = frameLayout;
        cr0Var2.f32872a0 = j0Var;
        cr0Var2.f32877d0 = juVar2;
        cr0Var2.f32874b0 = u50Var;
        cr0Var2.f32876c0 = view2;
        cr0Var2.f32891q0 = false;
        cr0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            gr0VarArr = this.f34661n;
            if (i14 >= gr0VarArr.length) {
                break;
            }
            gr0 gr0Var = new gr0(this, context);
            gr0VarArr[i14] = gr0Var;
            fr0Var.addView(gr0Var, w7.x5.c(-1.0f, -1));
            if (i14 == 0) {
                gr0 gr0Var2 = gr0VarArr[i14];
                gr0Var2.f34031a = cr0Var;
                gr0Var2.d = cr0Var.K;
            } else if (i14 == 1) {
                gr0 gr0Var3 = gr0VarArr[i14];
                gr0Var3.f34031a = cr0Var2;
                gr0Var3.d = cr0Var2.K;
                gr0Var3.setVisibility(8);
            }
            gr0VarArr[i14].d.setScrollingTouchSlop(1);
            gr0 gr0Var4 = gr0VarArr[i14];
            gr0Var4.f34032b = (FrameLayout) gr0Var4.f34031a.getFragmentView();
            gr0VarArr[i14].d.setClipToPadding(false);
            gr0 gr0Var5 = gr0VarArr[i14];
            gr0Var5.f34033c = gr0Var5.f34031a.getActionBar();
            gr0 gr0Var6 = gr0VarArr[i14];
            gr0Var6.addView(gr0Var6.f34032b, w7.x5.c(-1.0f, -1));
            gr0 gr0Var7 = gr0VarArr[i14];
            gr0Var7.addView(gr0Var7.f34033c, w7.x5.c(-2.0f, -1));
            gr0VarArr[i14].f34033c.setVisibility(8);
            gr0VarArr[i14].d.setOnScrollListener(new ii.m3(7, this, gr0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        fr0Var.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        fr0Var.addView(cr0Var.Z, w7.x5.e(-1, 48, 83));
        fr0Var.addView(cr0Var.f32872a0, w7.x5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        fr0Var.addView(cr0Var.f32874b0, w7.x5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                gr0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18933h5, false);
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
        int i10 = org.telegram.ui.ActionBar.j6.f18933h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f18969j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34659c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.j6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f34657a.getThemeDescriptions());
        arrayList.addAll(this.f34658b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        gr0[] gr0VarArr;
        int i10 = 0;
        while (true) {
            gr0VarArr = this.f34661n;
            if (i10 >= gr0VarArr.length) {
                break;
            }
            gr0VarArr[i10].d.C0();
            i10++;
        }
        gr0VarArr[z10 ? 1 : 0].d.getAdapter();
        gr0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.c0) gr0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        cr0 cr0Var = this.f34657a;
        if (cr0Var != null) {
            cr0Var.onConfigurationChanged(configuration);
        }
        cr0 cr0Var2 = this.f34658b;
        if (cr0Var2 != null) {
            cr0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        cr0 cr0Var = this.f34657a;
        if (cr0Var != null) {
            cr0Var.onFragmentDestroy();
        }
        cr0 cr0Var2 = this.f34658b;
        if (cr0Var2 != null) {
            cr0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        cr0 cr0Var = this.f34657a;
        if (cr0Var != null) {
            cr0Var.onPause();
        }
        cr0 cr0Var2 = this.f34658b;
        if (cr0Var2 != null) {
            cr0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.w0 w0Var = this.f34659c;
        if (w0Var != null) {
            w0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        cr0 cr0Var = this.f34657a;
        if (cr0Var != null) {
            cr0Var.onResume();
        }
        cr0 cr0Var2 = this.f34658b;
        if (cr0Var2 != null) {
            cr0Var2.onResume();
        }
    }
}
