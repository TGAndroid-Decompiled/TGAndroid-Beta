package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public abstract class yu0 extends xu0 {
    public Activity f35079s0;
    public final Rect f35080t0;
    public int f35081u0;
    public boolean f35082v0;

    public yu0(Context context, Activity activity) {
        super(context, null);
        this.f35080t0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int R() {
        View rootView = getRootView();
        Rect rect = this.f35080t0;
        getWindowVisibleDisplayFrame(rect);
        int i9 = 0;
        if (this.f35082v0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i9 = AndroidUtilities.statusBarHeight;
            }
            return ((height - i9) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f35079s0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void S() {
        boolean z10;
        if (this.f34788n == null && this.f34792r.isEmpty()) {
            return;
        }
        this.f35081u0 = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new a50(7, this, z10));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        return this.f35081u0;
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        S();
    }

    public void setActivity(Activity activity) {
        this.f35079s0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f35082v0 = z10;
    }
}
