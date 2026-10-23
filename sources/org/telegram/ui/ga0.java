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
public final class ga0 extends RelativeLayout {
    public i0.b f37547a;
    public boolean f37548b;
    public final LaunchActivity f37549c;

    public ga0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f37549c = launchActivity;
        this.f37547a = i0.b.e;
        xt xtVar = new xt(this, 15);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(this, xtVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f37549c.f33489r0;
        if (actionBarLayout != null) {
            actionBarLayout.O(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.f37549c;
        if (!launchActivity.O0) {
            i0.b bVar = this.f37547a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, bVar.f12315a, bVar.f12317c);
            launchActivity.f33487q0.getView().layout(0, 0, launchActivity.f33487q0.getView().getMeasuredWidth(), launchActivity.f33487q0.getView().getMeasuredHeight());
            launchActivity.f33491s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.f33491s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.f33491s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f33487q0.getView().layout(0, 0, launchActivity.f33487q0.getView().getMeasuredWidth(), launchActivity.f33487q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f33489r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.f37547a.f12316b;
        launchActivity.f33489r0.getView().layout(measuredWidth2, dp, launchActivity.f33489r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f33489r0.getView().getMeasuredHeight() + dp);
        ig.o1 o1Var = launchActivity.f33497v0;
        o1Var.layout(0, 0, o1Var.getMeasuredWidth(), launchActivity.f33497v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f33495u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f33495u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        this.f37548b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        Pattern pattern = LaunchActivity.E1;
        boolean z11 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.f37549c;
        if (!z11 && (!AndroidUtilities.isSmallTablet() || launchActivity.getResources().getConfiguration().orientation == 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == launchActivity.O0 && !launchActivity.P0) {
            launchActivity.P0 = true;
            AndroidUtilities.runOnUIThread(new fz(this, 16));
        }
        if (!launchActivity.O0) {
            i0.b bVar = this.f37547a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, bVar.f12315a, bVar.f12317c);
            launchActivity.f33487q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f33491s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.f33487q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f33497v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f33495u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f33489r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824);
        i0.b bVar2 = this.f37547a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f12316b) - bVar2.d) - AndroidUtilities.dp(16.0f), 1073741824));
        this.f37548b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37548b) {
            return;
        }
        super.requestLayout();
    }
}
