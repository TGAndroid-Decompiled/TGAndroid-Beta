package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;

public abstract class SizeNotifierFrameLayoutPhoto extends SizeNotifierFrameLayout {
    public Activity activity;
    public int keyboardHeight;
    public final Rect rect;
    public boolean withoutWindow;

    public SizeNotifierFrameLayoutPhoto(Context context, Activity activity) {
        super(context, null);
        this.rect = new Rect();
        setActivity(activity);
    }

    @Override
    public int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    @Override
    public int measureKeyboardHeight() {
        View rootView = getRootView();
        Rect rect = this.rect;
        getWindowVisibleDisplayFrame(rect);
        if (this.withoutWindow) {
            return ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top);
        }
        int height = (this.activity.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height;
    }

    @Override
    public void notifyHeightChanged() {
        if (this.delegate == null && this.delegates.isEmpty()) {
            return;
        }
        this.keyboardHeight = measureKeyboardHeight();
        Point point = AndroidUtilities.displaySize;
        post(new FileLoader$$ExternalSyntheticLambda1(26, this, point.x > point.y));
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        notifyHeightChanged();
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setWithoutWindow(boolean z) {
        this.withoutWindow = z;
    }
}
