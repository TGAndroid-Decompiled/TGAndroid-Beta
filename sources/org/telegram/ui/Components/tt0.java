package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class tt0 extends st0 {
    public Activity f38397f0;
    public final Rect f38398g0;
    public int f38399h0;
    public boolean f38400i0;

    public tt0(Context context, Activity activity) {
        super(context, null);
        this.f38398g0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f38398g0;
        getWindowVisibleDisplayFrame(rect);
        int i7 = 0;
        if (this.f38400i0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i7 = org.telegram.messenger.g0.f22561m;
            }
            return ((height - i7) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f38397f0.getWindow().getDecorView().getHeight() - org.telegram.messenger.g0.q1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.f22561m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z9;
        if (this.f38070n == null && this.f38071r.isEmpty()) {
            return;
        }
        this.f38399h0 = Q();
        Point point = org.telegram.messenger.g0.f22567q;
        if (point.x > point.y) {
            z9 = true;
        } else {
            z9 = false;
        }
        post(new tp0(3, this, z9));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f38399h0;
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        R();
    }

    public void setActivity(Activity activity) {
        this.f38397f0 = activity;
    }

    public void setWithoutWindow(boolean z9) {
        this.f38400i0 = z9;
    }
}
