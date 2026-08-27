package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class fa0 extends RelativeLayout {

    public i0.c f38044a;

    public boolean f38045b;

    public final LaunchActivity f38046c;

    public fa0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f38046c = launchActivity;
        this.f38044a = i0.c.f10488e;
        zt ztVar = new zt(this, 15);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(this, ztVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f38046c.f35523n0;
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
        LaunchActivity launchActivity = this.f38046c;
        if (z11 || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
            launchActivity.m0.getView().layout(0, 0, launchActivity.m0.getView().getMeasuredWidth(), launchActivity.m0.getView().getMeasuredHeight());
        } else {
            i0.c cVar = this.f38044a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, cVar.f10489a, cVar.f10491c);
            launchActivity.m0.getView().layout(0, 0, launchActivity.m0.getView().getMeasuredWidth(), launchActivity.m0.getView().getMeasuredHeight());
            launchActivity.f35525o0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f35525o0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f35525o0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f35523n0.getView().getMeasuredWidth()) / 2;
        int iDp = AndroidUtilities.dp(8.0f) + this.f38044a.f10490b;
        launchActivity.f35523n0.getView().layout(measuredWidth2, iDp, launchActivity.f35523n0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f35523n0.getView().getMeasuredHeight() + iDp);
        org.telegram.ui.Components.d51 d51Var = launchActivity.f35531r0;
        d51Var.layout(0, 0, d51Var.getMeasuredWidth(), launchActivity.f35531r0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f35529q0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f35529q0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f38045b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f38046c;
        if (z10 || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
            launchActivity.K0 = true;
            launchActivity.m0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.K0 = false;
            i0.c cVar = this.f38044a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, cVar.f10489a, cVar.f10491c);
            launchActivity.m0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f35525o0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f35531r0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f35529q0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f35523n0.getView();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.c cVar2 = this.f38044a;
        view.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - cVar2.f10490b) - cVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f38045b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f38045b) {
            return;
        }
        super.requestLayout();
    }
}
