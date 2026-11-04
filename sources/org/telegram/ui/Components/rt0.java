package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class rt0 extends qt0 {
    public Activity f37797g0;
    public final Rect f37798h0;
    public int f37799i0;
    public boolean f37800j0;

    public rt0(Context context, Activity activity) {
        super(context, null);
        this.f37798h0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f37798h0;
        getWindowVisibleDisplayFrame(rect);
        int i3 = 0;
        if (this.f37800j0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i3 = org.telegram.messenger.g0.f22602m;
            }
            return ((height - i3) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f37797g0.getWindow().getDecorView().getHeight() - org.telegram.messenger.g0.q1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.f22602m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z10;
        if (this.f37536n == null && this.f37537r.isEmpty()) {
            return;
        }
        this.f37799i0 = Q();
        Point point = org.telegram.messenger.g0.f22608q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new up0(3, this, z10));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f37799i0;
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        R();
    }

    public void setActivity(Activity activity) {
        this.f37797g0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f37800j0 = z10;
    }
}
