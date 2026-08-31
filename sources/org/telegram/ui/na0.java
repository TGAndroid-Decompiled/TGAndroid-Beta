package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class na0 extends RelativeLayout {
    public i0.b f39366a;
    public boolean f39367b;
    public final LaunchActivity f39368c;

    public na0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f39368c = launchActivity;
        this.f39366a = i0.b.f7756e;
        gu guVar = new gu(this, 15);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(this, guVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f39368c.f34162o0;
        if (actionBarLayout != null) {
            actionBarLayout.N(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f39368c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.b bVar = this.f39366a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f7757a, bVar.f7759c);
            launchActivity.f34160n0.getView().layout(0, 0, launchActivity.f34160n0.getView().getMeasuredWidth(), launchActivity.f34160n0.getView().getMeasuredHeight());
            launchActivity.f34164p0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f34164p0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f34164p0.getView().getMeasuredHeight());
        } else {
            launchActivity.f34160n0.getView().layout(0, 0, launchActivity.f34160n0.getView().getMeasuredWidth(), launchActivity.f34160n0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f34162o0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f39366a.f7758b;
        launchActivity.f34162o0.getView().layout(measuredWidth2, dp, launchActivity.f34162o0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f34162o0.getView().getMeasuredHeight() + dp);
        org.telegram.ui.Components.a61 a61Var = launchActivity.f34170s0;
        a61Var.layout(0, 0, a61Var.getMeasuredWidth(), launchActivity.f34170s0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f34168r0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f34168r0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f39367b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z4 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f39368c;
        if (!z4 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.L0 = false;
            i0.b bVar = this.f39366a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f7757a, bVar.f7759c);
            launchActivity.f34160n0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f34164p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.L0 = true;
            launchActivity.f34160n0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f34170s0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f34168r0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f34162o0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f39366a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f7758b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f39367b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f39367b) {
            return;
        }
        super.requestLayout();
    }
}
