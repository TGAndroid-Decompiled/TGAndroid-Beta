package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class m90 extends RelativeLayout {
    public i0.c f39483a;
    public boolean f39484b;
    public final LaunchActivity f39485c;

    public m90(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f39485c = launchActivity;
        this.f39483a = i0.c.e;
        st stVar = new st(this, 16);
        WeakHashMap weakHashMap = r0.h0.f46134a;
        r0.z.i(this, stVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f39485c.f33386r0;
        if (actionBarLayout != null) {
            actionBarLayout.P(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.f39485c;
        if (!launchActivity.O0) {
            i0.c cVar = this.f39483a;
            int l1 = org.telegram.messenger.i0.l1(measuredWidth, cVar.f7766a, cVar.f7768c);
            launchActivity.f33384q0.getView().layout(0, 0, launchActivity.f33384q0.getView().getMeasuredWidth(), launchActivity.f33384q0.getView().getMeasuredHeight());
            launchActivity.f33388s0.getView().layout(l1, 0, launchActivity.f33388s0.getView().getMeasuredWidth() + l1, launchActivity.f33388s0.getView().getMeasuredHeight());
        } else {
            launchActivity.f33384q0.getView().layout(0, 0, launchActivity.f33384q0.getView().getMeasuredWidth(), launchActivity.f33384q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f33386r0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.i0.L(8.0f) + this.f39483a.f7767b;
        launchActivity.f33386r0.getView().layout(measuredWidth2, L, launchActivity.f33386r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f33386r0.getView().getMeasuredHeight() + L);
        w8 w8Var = launchActivity.f33394v0;
        w8Var.layout(0, 0, w8Var.getMeasuredWidth(), launchActivity.f33394v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f33392u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f33392u0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        this.f39484b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        Pattern pattern = LaunchActivity.D1;
        boolean z11 = org.telegram.messenger.i0.E;
        LaunchActivity launchActivity = this.f39485c;
        if (!z11 && (!org.telegram.messenger.i0.P1() || launchActivity.getResources().getConfiguration().orientation == 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == launchActivity.O0 && !launchActivity.P0) {
            launchActivity.P0 = true;
            org.telegram.messenger.i0.g3(new yy(this, 17));
        }
        if (!launchActivity.O0) {
            i0.c cVar = this.f39483a;
            int l1 = org.telegram.messenger.i0.l1(size, cVar.f7766a, cVar.f7768c);
            launchActivity.f33384q0.getView().measure(View.MeasureSpec.makeMeasureSpec(l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f33388s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l1, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.f33384q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f33394v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f33392u0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f33386r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(500.0f), size - org.telegram.messenger.i0.L(16.0f)), 1073741824);
        i0.c cVar2 = this.f39483a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - cVar2.f7767b) - cVar2.d) - org.telegram.messenger.i0.L(16.0f), 1073741824));
        this.f39484b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f39484b) {
            return;
        }
        super.requestLayout();
    }
}
