package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fa0 extends RelativeLayout {
    public i0.b f39320a;
    public boolean f39321b;
    public final LaunchActivity f39322c;

    public fa0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f39322c = launchActivity;
        this.f39320a = i0.b.e;
        qt qtVar = new qt(this, 16);
        WeakHashMap weakHashMap = r0.i0.f47105a;
        r0.a0.i(this, qtVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f39322c.f35552r0;
        if (actionBarLayout != null) {
            actionBarLayout.P(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.f39322c;
        if (!launchActivity.O0) {
            i0.b bVar = this.f39320a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f13450a, bVar.f13452c);
            launchActivity.f35550q0.getView().layout(0, 0, launchActivity.f35550q0.getView().getMeasuredWidth(), launchActivity.f35550q0.getView().getMeasuredHeight());
            launchActivity.f35554s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f35554s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f35554s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f35550q0.getView().layout(0, 0, launchActivity.f35550q0.getView().getMeasuredWidth(), launchActivity.f35550q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f35552r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f39320a.f13451b;
        launchActivity.f35552r0.getView().layout(measuredWidth2, dp, launchActivity.f35552r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f35552r0.getView().getMeasuredHeight() + dp);
        jg.r1 r1Var = launchActivity.f35560v0;
        r1Var.layout(0, 0, r1Var.getMeasuredWidth(), launchActivity.f35560v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f35558u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f35558u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        this.f39321b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        Pattern pattern = LaunchActivity.D1;
        boolean z11 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f39322c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || launchActivity.getResources().getConfiguration().orientation == 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == launchActivity.O0 && !launchActivity.P0) {
            launchActivity.P0 = true;
            AndroidUtilities.runOnUIThread(new p00(this, 16));
        }
        if (!launchActivity.O0) {
            i0.b bVar = this.f39320a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f13450a, bVar.f13452c);
            launchActivity.f35550q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f35554s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.f35550q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f35560v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f35558u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f35552r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f39320a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f13451b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f39321b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f39321b) {
            return;
        }
        super.requestLayout();
    }
}
