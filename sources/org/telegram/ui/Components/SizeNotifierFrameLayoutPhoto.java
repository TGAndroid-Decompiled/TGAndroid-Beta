package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;

public class SizeNotifierFrameLayoutPhoto extends SizeNotifierFrameLayout {
    private Activity activity;
    private int keyboardHeight;
    private Rect rect;
    private boolean useSmoothKeyboard;
    private WindowManager windowManager;
    private boolean withoutWindow;

    public SizeNotifierFrameLayoutPhoto(Context context, Activity activity, boolean z) {
        super(context);
        this.rect = new Rect();
        setActivity(activity);
        this.useSmoothKeyboard = z;
    }

    public void lambda$notifyHeightChanged$0(boolean z) {
        SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate = this.delegate;
        if (sizeNotifierFrameLayoutDelegate != null) {
            sizeNotifierFrameLayoutDelegate.onSizeChanged(this.keyboardHeight, z);
        }
        for (int i = 0; i < this.delegates.size(); i++) {
            this.delegates.get(i).onSizeChanged(this.keyboardHeight, z);
        }
    }

    @Override
    public int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    @Override
    public int measureKeyboardHeight() {
        View rootView = getRootView();
        getWindowVisibleDisplayFrame(this.rect);
        if (this.withoutWindow) {
            int height = (rootView.getHeight() - (this.rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView);
            Rect rect = this.rect;
            return height - (rect.bottom - rect.top);
        }
        int height2 = (this.activity.getWindow().getDecorView().getHeight() - AndroidUtilities.getViewInset(rootView)) - rootView.getBottom();
        if (height2 <= Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.statusBarHeight)) {
            return 0;
        }
        return height2;
    }

    @Override
    public void notifyHeightChanged() {
        if (this.delegate == null && this.delegates.isEmpty()) {
            return;
        }
        this.keyboardHeight = measureKeyboardHeight();
        Point point = AndroidUtilities.displaySize;
        post(new MediaActivity$$ExternalSyntheticLambda5(this, point.x > point.y, 11));
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
