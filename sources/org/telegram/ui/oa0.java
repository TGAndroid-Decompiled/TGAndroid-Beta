package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class oa0 extends RelativeLayout {
    public i0.b f36708a;
    public boolean f36709b;
    public final LaunchActivity f36710c;

    public oa0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f36710c = launchActivity;
        this.f36708a = i0.b.e;
        hu huVar = new hu(this, 15);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(this, huVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f36710c.f31614o0;
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
        LaunchActivity launchActivity = this.f36710c;
        if (!z10 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            i0.b bVar = this.f36708a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f7196a, bVar.f7198c);
            launchActivity.f31612n0.getView().layout(0, 0, launchActivity.f31612n0.getView().getMeasuredWidth(), launchActivity.f31612n0.getView().getMeasuredHeight());
            launchActivity.f31616p0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f31616p0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f31616p0.getView().getMeasuredHeight());
        } else {
            launchActivity.f31612n0.getView().layout(0, 0, launchActivity.f31612n0.getView().getMeasuredWidth(), launchActivity.f31612n0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f31614o0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f36708a.f7197b;
        launchActivity.f31614o0.getView().layout(measuredWidth2, dp, launchActivity.f31614o0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f31614o0.getView().getMeasuredHeight() + dp);
        org.telegram.ui.Components.z51 z51Var = launchActivity.f31622s0;
        z51Var.layout(0, 0, z51Var.getMeasuredWidth(), launchActivity.f31622s0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f31620r0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f31620r0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f36709b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z4 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f36710c;
        if (!z4 && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
            launchActivity.L0 = false;
            i0.b bVar = this.f36708a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f7196a, bVar.f7198c);
            launchActivity.f31612n0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f31616p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.L0 = true;
            launchActivity.f31612n0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f31622s0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f31620r0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f31614o0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f36708a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f7197b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f36709b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f36709b) {
            return;
        }
        super.requestLayout();
    }
}
