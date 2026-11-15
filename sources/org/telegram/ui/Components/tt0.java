package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class tt0 extends st0 {
    public Activity f39807g0;
    public final Rect f39808h0;
    public int f39809i0;
    public boolean f39810j0;

    public tt0(Context context, Activity activity) {
        super(context, null);
        this.f39808h0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f39808h0;
        getWindowVisibleDisplayFrame(rect);
        int i7 = 0;
        if (this.f39810j0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i7 = org.telegram.messenger.g0.f23603m;
            }
            return ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f39807g0.getWindow().getDecorView().getHeight() - org.telegram.messenger.g0.q1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.f23603m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z10;
        if (this.f39420n == null && this.f39421r.isEmpty()) {
            return;
        }
        this.f39809i0 = Q();
        Point point = org.telegram.messenger.g0.f23609q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new fp0(4, this, z10));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f39809i0;
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        R();
    }

    public void setActivity(Activity activity) {
        this.f39807g0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f39810j0 = z10;
    }
}
