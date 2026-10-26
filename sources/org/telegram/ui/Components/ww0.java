package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public abstract class ww0 extends vw0 {
    public Activity f34543l0;
    public final Rect m0;
    public int f34544n0;
    public boolean f34545o0;

    public ww0(Context context, Activity activity) {
        super(context, null);
        this.m0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int Q() {
        View rootView = getRootView();
        Rect rect = this.m0;
        getWindowVisibleDisplayFrame(rect);
        int i10 = 0;
        if (this.f34545o0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            return ((height - i10) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f34543l0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void R() {
        boolean z10;
        if (this.f34289n == null && this.f34290r.isEmpty()) {
            return;
        }
        this.f34544n0 = Q();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z10 = true;
        } else {
            z10 = false;
        }
        post(new d60(7, this, z10));
    }

    @Override
    public int getKeyboardHeight() {
        return this.f34544n0;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        R();
    }

    public void setActivity(Activity activity) {
        this.f34543l0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f34545o0 = z10;
    }
}
