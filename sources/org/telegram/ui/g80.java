package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class g80 extends RelativeLayout {
    public i0.b f45600a;
    public boolean f45601b;
    public final LaunchActivity f45602c;

    public g80(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.f45602c = launchActivity;
        this.f45600a = i0.b.f14494e;
        ur urVar = new ur(this, 17);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(this, urVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.f45602c.f41316s0;
        if (actionBarLayout != null) {
            actionBarLayout.Q(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.f45602c;
        if (!launchActivity.P0) {
            i0.b bVar = this.f45600a;
            int l12 = org.telegram.messenger.g0.l1(measuredWidth, bVar.f14495a, bVar.f14497c);
            launchActivity.f41314r0.getView().layout(0, 0, launchActivity.f41314r0.getView().getMeasuredWidth(), launchActivity.f41314r0.getView().getMeasuredHeight());
            launchActivity.f41318t0.getView().layout(l12, 0, launchActivity.f41318t0.getView().getMeasuredWidth() + l12, launchActivity.f41318t0.getView().getMeasuredHeight());
        } else {
            launchActivity.f41314r0.getView().layout(0, 0, launchActivity.f41314r0.getView().getMeasuredWidth(), launchActivity.f41314r0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.f41316s0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.g0.L(8.0f) + this.f45600a.f14496b;
        launchActivity.f41316s0.getView().layout(measuredWidth2, L, launchActivity.f41316s0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.f41316s0.getView().getMeasuredHeight() + L);
        ai.h5 h5Var = launchActivity.f41324w0;
        h5Var.layout(0, 0, h5Var.getMeasuredWidth(), launchActivity.f41324w0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.f41322v0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.f41322v0.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        this.f45601b = true;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.E1;
        boolean z11 = org.telegram.messenger.g0.E;
        LaunchActivity launchActivity = this.f45602c;
        if (!z11 && (!org.telegram.messenger.g0.P1() || launchActivity.getResources().getConfiguration().orientation == 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == launchActivity.P0 && !launchActivity.Q0) {
            launchActivity.Q0 = true;
            org.telegram.messenger.g0.h3(new fz(this, 16));
        }
        if (!launchActivity.P0) {
            i0.b bVar = this.f45600a;
            int l12 = org.telegram.messenger.g0.l1(size, bVar.f14495a, bVar.f14497c);
            launchActivity.f41314r0.getView().measure(View.MeasureSpec.makeMeasureSpec(l12, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            launchActivity.f41318t0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l12, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        } else {
            launchActivity.f41314r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        launchActivity.f41324w0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        launchActivity.f41322v0.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        ViewGroup view = launchActivity.f41316s0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(500.0f), size - org.telegram.messenger.g0.L(16.0f)), 1073741824);
        i0.b bVar2 = this.f45600a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.f14496b) - bVar2.d) - org.telegram.messenger.g0.L(16.0f), 1073741824));
        this.f45601b = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f45601b) {
            return;
        }
        super.requestLayout();
    }
}
