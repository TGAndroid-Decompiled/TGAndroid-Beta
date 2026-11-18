package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class bu0 extends au0 {
    public Activity f33780g0;
    public final Rect f33781h0;
    public int f33782i0;
    public boolean f33783j0;

    public bu0(Context context, Activity activity) {
        super(context, null);
        this.f33781h0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f33781h0;
        getWindowVisibleDisplayFrame(rect);
        int i7 = 0;
        if (this.f33783j0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i7 = org.telegram.messenger.g0.f24115m;
            }
            return ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f33780g0.getWindow().getDecorView().getHeight() - org.telegram.messenger.g0.q1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.f24115m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z10;
        if (this.f33464n == null && this.f33465r.isEmpty()) {
            return;
        }
        this.f33782i0 = Q();
        Point point = org.telegram.messenger.g0.f24121q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new pp0(4, this, z10));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f33782i0;
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        R();
    }

    public void setActivity(Activity activity) {
        this.f33780g0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f33783j0 = z10;
    }
}
