package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public abstract class bw0 extends aw0 {
    public Activity f21913w0;
    public final Rect f21914x0;
    public int f21915y0;
    public boolean f21916z0;

    public bw0(Context context, Activity activity) {
        super(context, null);
        this.f21914x0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int R() {
        View rootView = getRootView();
        Rect rect = this.f21914x0;
        getWindowVisibleDisplayFrame(rect);
        int i10 = 0;
        if (this.f21916z0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            return ((height - i10) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f21913w0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void S() {
        boolean z10;
        if (this.f21638n == null && this.f21643r.isEmpty()) {
            return;
        }
        this.f21915y0 = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new bs0(2, this, z10));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        return this.f21915y0;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S();
    }

    public void setActivity(Activity activity) {
        this.f21913w0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f21916z0 = z10;
    }
}
