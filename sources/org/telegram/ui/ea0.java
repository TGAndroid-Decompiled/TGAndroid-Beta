package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ea0 extends RelativeLayout {
    public i0.b f37768a;
    public boolean f37769b;
    public final LaunchActivity f37770c;

    public ea0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f37770c = launchActivity;
        this.f37768a = i0.b.f8185e;
        xt xtVar = new xt(this, 15);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(this, xtVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f37770c.f35587n0;
        if (actionBarLayout != null) {
            actionBarLayout.N(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        boolean z11 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f37770c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.b bVar = this.f37768a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f8186a, bVar.f8188c);
            launchActivity.m0.getView().layout(0, 0, launchActivity.m0.getView().getMeasuredWidth(), launchActivity.m0.getView().getMeasuredHeight());
            launchActivity.f35589o0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f35589o0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f35589o0.getView().getMeasuredHeight());
        } else {
            launchActivity.m0.getView().layout(0, 0, launchActivity.m0.getView().getMeasuredWidth(), launchActivity.m0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f35587n0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f37768a.f8187b;
        launchActivity.f35587n0.getView().layout(measuredWidth2, dp, launchActivity.f35587n0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f35587n0.getView().getMeasuredHeight() + dp);
        org.telegram.ui.Components.n51 n51Var = launchActivity.f35595r0;
        n51Var.layout(0, 0, n51Var.getMeasuredWidth(), launchActivity.f35595r0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f35593q0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f35593q0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f37769b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f37770c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.K0 = false;
            i0.b bVar = this.f37768a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f8186a, bVar.f8188c);
            launchActivity.m0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f35589o0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.K0 = true;
            launchActivity.m0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f35595r0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f35593q0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f35587n0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f37768a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f8187b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f37769b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37769b) {
            return;
        }
        super.requestLayout();
    }
}
