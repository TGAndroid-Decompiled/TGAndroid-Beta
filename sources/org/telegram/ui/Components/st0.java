package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class st0 extends rt0 {
    public Activity f38155f0;
    public final Rect f38156g0;
    public int f38157h0;
    public boolean f38158i0;

    public st0(Context context, Activity activity) {
        super(context, null);
        this.f38156g0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f38156g0;
        getWindowVisibleDisplayFrame(rect);
        int i7 = 0;
        if (this.f38158i0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i7 = org.telegram.messenger.g0.f22531m;
            }
            return ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f38155f0.getWindow().getDecorView().getHeight() - org.telegram.messenger.g0.q1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.f22531m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z9;
        if (this.f37846n == null && this.f37847r.isEmpty()) {
            return;
        }
        this.f38157h0 = Q();
        Point point = org.telegram.messenger.g0.f22537q;
        if (point.x > point.y) {
            z9 = true;
        } else {
            z9 = false;
        }
        post(new tp0(3, this, z9));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f38157h0;
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        R();
    }

    public void setActivity(Activity activity) {
        this.f38155f0 = activity;
    }

    public void setWithoutWindow(boolean z9) {
        this.f38158i0 = z9;
    }
}
