package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
public abstract class wu0 extends vu0 {
    public Activity f32320f0;
    public final Rect f32321g0;
    public int f32322h0;
    public boolean f32323i0;

    public wu0(Context context, Activity activity) {
        super(context, null);
        this.f32321g0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f32321g0;
        getWindowVisibleDisplayFrame(rect);
        int i10 = 0;
        if (this.f32323i0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i10 = org.telegram.messenger.i0.f16166m;
            }
            return ((height - i10) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f32320f0.getWindow().getDecorView().getHeight() - org.telegram.messenger.i0.q1(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.f16166m)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z10;
        if (this.f31917n == null && this.f31918r.isEmpty()) {
            return;
        }
        this.f32322h0 = Q();
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new k2.v(23, this, z10));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f32322h0;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setActivity(Activity activity) {
        this.f32320f0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f32323i0 = z10;
    }
}
