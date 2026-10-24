package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public abstract class ow0 extends nw0 {
    public Activity f29417w0;
    public final Rect f29418x0;
    public int f29419y0;
    public boolean f29420z0;

    public ow0(Context context, Activity activity) {
        super(context, null);
        this.f29418x0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.f29418x0;
        getWindowVisibleDisplayFrame(rect);
        int i10 = 0;
        if (this.f29420z0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            return ((height - i10) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f29417w0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z10;
        if (this.f29062n == null && this.f29067r.isEmpty()) {
            return;
        }
        this.f29419y0 = Q();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new z50(7, this, z10));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f29419y0;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setActivity(Activity activity) {
        this.f29417w0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f29420z0 = z10;
    }
}
