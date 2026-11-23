package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class du0 extends cu0 {
    public Activity f34455g0;
    public final Rect f34456h0;
    public int f34457i0;
    public boolean f34458j0;

    public du0(Context context, Activity activity) {
        super(context, null);
        this.f34456h0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f34456h0;
        getWindowVisibleDisplayFrame(rect);
        int i7 = 0;
        if (this.f34458j0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i7 = org.telegram.messenger.g0.f24220m;
            }
            return ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f34455g0.getWindow().getDecorView().getHeight() - org.telegram.messenger.g0.q1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.f24220m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z10;
        if (this.f34143n == null && this.f34144r.isEmpty()) {
            return;
        }
        this.f34457i0 = Q();
        Point point = org.telegram.messenger.g0.f24226q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new qp0(4, this, z10));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f34457i0;
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        R();
    }

    public void setActivity(Activity activity) {
        this.f34455g0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f34458j0 = z10;
    }
}
