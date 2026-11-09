package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class ut0 extends tt0 {
    public Activity f38803f0;
    public final Rect f38804g0;
    public int f38805h0;
    public boolean f38806i0;

    public ut0(Context context, Activity activity) {
        super(context, null);
        this.f38804g0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f38804g0;
        getWindowVisibleDisplayFrame(rect);
        int i7 = 0;
        if (this.f38806i0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i7 = org.telegram.messenger.g0.f22557m;
            }
            return ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f38803f0.getWindow().getDecorView().getHeight() - org.telegram.messenger.g0.q1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.f22557m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z9;
        if (this.f38498n == null && this.f38499r.isEmpty()) {
            return;
        }
        this.f38805h0 = Q();
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            z9 = true;
        } else {
            z9 = false;
        }
        post(new up0(3, this, z9));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f38805h0;
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        R();
    }

    public void setActivity(Activity activity) {
        this.f38803f0 = activity;
    }

    public void setWithoutWindow(boolean z9) {
        this.f38806i0 = z9;
    }
}
