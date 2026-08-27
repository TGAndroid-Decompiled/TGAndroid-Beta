package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public abstract class av0 extends zu0 {

    public Activity f26828s0;

    public final Rect f26829t0;

    public int f26830u0;

    public boolean f26831v0;

    public av0(Context context, Activity activity) {
        super(context, null);
        this.f26829t0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int R() {
        View rootView = getRootView();
        Rect rect = this.f26829t0;
        getWindowVisibleDisplayFrame(rect);
        if (this.f26831v0) {
            return ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.f26828s0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height;
    }

    @Override
    public void S() {
        if (this.f35383n == null && this.f35387r.isEmpty()) {
            return;
        }
        this.f26830u0 = R();
        Point point = AndroidUtilities.displaySize;
        post(new f50(7, this, point.x > point.y));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        return this.f26830u0;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S();
    }

    public void setActivity(Activity activity) {
        this.f26828s0 = activity;
    }

    public void setWithoutWindow(boolean z10) {
        this.f26831v0 = z10;
    }
}
