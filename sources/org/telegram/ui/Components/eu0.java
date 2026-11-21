package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class eu0 extends du0 {
    public Activity f34988g0;
    public final Rect f34989h0;
    public int f34990i0;
    public boolean f34991j0;

    public eu0(Context context, Activity activity) {
        super(context, null);
        this.f34989h0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f34989h0;
        getWindowVisibleDisplayFrame(rect);
        int i7 = 0;
        if (this.f34991j0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i7 = org.telegram.messenger.g0.f24140m;
            }
            return ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f34988g0.getWindow().getDecorView().getHeight() - org.telegram.messenger.g0.q1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.f24140m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z10;
        if (this.f34589n == null && this.f34590r.isEmpty()) {
            return;
        }
        this.f34990i0 = Q();
        Point point = org.telegram.messenger.g0.f24146q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new rp0(4, this, z10));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f34990i0;
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        R();
    }

    public void setActivity(Activity activity) {
        this.f34988g0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f34991j0 = z10;
    }
}
