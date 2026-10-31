package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class vu0 extends uu0 {
    public Activity f31845f0;
    public final Rect f31846g0;
    public int f31847h0;
    public boolean f31848i0;

    public vu0(Context context, Activity activity) {
        super(context, null);
        this.f31846g0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f31846g0;
        getWindowVisibleDisplayFrame(rect);
        int i10 = 0;
        if (this.f31848i0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i10 = org.telegram.messenger.i0.f16020m;
            }
            return ((height - i10) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f31845f0.getWindow().getDecorView().getHeight() - org.telegram.messenger.i0.q1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.f16020m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z10;
        if (this.f31057n == null && this.f31058r.isEmpty()) {
            return;
        }
        this.f31847h0 = Q();
        Point point = org.telegram.messenger.i0.f16026q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new k2.v(23, this, z10));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f31847h0;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setActivity(Activity activity) {
        this.f31845f0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f31848i0 = z10;
    }
}
