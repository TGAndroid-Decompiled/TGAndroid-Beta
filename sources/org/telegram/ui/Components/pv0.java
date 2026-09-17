package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public abstract class pv0 extends ov0 {
    public Activity f29531w0;
    public final Rect f29532x0;
    public int f29533y0;
    public boolean f29534z0;

    public pv0(Context context, Activity activity) {
        super(context, null);
        this.f29532x0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int R() {
        View rootView = getRootView();
        Rect rect = this.f29532x0;
        getWindowVisibleDisplayFrame(rect);
        int i10 = 0;
        if (this.f29534z0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            return ((height - i10) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f29531w0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void S() {
        boolean z10;
        if (this.f29242n == null && this.f29247r.isEmpty()) {
            return;
        }
        this.f29533y0 = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new mr0(3, this, z10));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        return this.f29533y0;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S();
    }

    public void setActivity(Activity activity) {
        this.f29531w0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f29534z0 = z10;
    }
}
