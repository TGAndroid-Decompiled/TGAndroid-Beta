package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public abstract class sv0 extends qv0 {
    public Activity f31184t0;
    public final Rect f31185u0;
    public int f31186v0;
    public boolean f31187w0;

    public sv0(Context context, Activity activity) {
        super(context, null);
        this.f31185u0 = new Rect();
        setActivity(activity);
    }

    @Override
    public int R() {
        View rootView = getRootView();
        Rect rect = this.f31185u0;
        getWindowVisibleDisplayFrame(rect);
        int i10 = 0;
        if (this.f31187w0) {
            int height = rootView.getHeight();
            if (rect.top != 0) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            return ((height - i10) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height2 = (this.f31184t0.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void S() {
        boolean z4;
        if (this.f30504n == null && this.f30509r.isEmpty()) {
            return;
        }
        this.f31186v0 = R();
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            z4 = true;
        } else {
            z4 = false;
        }
        post(new rv0(0, this, z4));
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getKeyboardHeight() {
        return this.f31186v0;
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        S();
    }

    public void setActivity(Activity activity) {
        this.f31184t0 = activity;
    }

    public void setWithoutWindow(boolean z4) {
        this.f31187w0 = z4;
    }
}
