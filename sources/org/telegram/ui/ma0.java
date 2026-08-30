package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ma0 extends RelativeLayout {
    public i0.b f36254a;
    public boolean f36255b;
    public final LaunchActivity f36256c;

    public ma0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f36256c = launchActivity;
        this.f36254a = i0.b.e;
        fu fuVar = new fu(this, 15);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(this, fuVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f36256c.f31640o0;
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
        LaunchActivity launchActivity = this.f36256c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.b bVar = this.f36254a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f7213a, bVar.f7215c);
            launchActivity.f31638n0.getView().layout(0, 0, launchActivity.f31638n0.getView().getMeasuredWidth(), launchActivity.f31638n0.getView().getMeasuredHeight());
            launchActivity.f31642p0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f31642p0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f31642p0.getView().getMeasuredHeight());
        } else {
            launchActivity.f31638n0.getView().layout(0, 0, launchActivity.f31638n0.getView().getMeasuredWidth(), launchActivity.f31638n0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f31640o0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f36254a.f7214b;
        launchActivity.f31640o0.getView().layout(measuredWidth2, dp, launchActivity.f31640o0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f31640o0.getView().getMeasuredHeight() + dp);
        org.telegram.ui.Components.z51 z51Var = launchActivity.f31648s0;
        z51Var.layout(0, 0, z51Var.getMeasuredWidth(), launchActivity.f31648s0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f31646r0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f31646r0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36255b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z4 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f36256c;
        if (!z4 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.L0 = false;
            i0.b bVar = this.f36254a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f7213a, bVar.f7215c);
            launchActivity.f31638n0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f31642p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.L0 = true;
            launchActivity.f31638n0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f31648s0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f31646r0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f31640o0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f36254a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f7214b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f36255b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f36255b) {
            return;
        }
        super.requestLayout();
    }
}
