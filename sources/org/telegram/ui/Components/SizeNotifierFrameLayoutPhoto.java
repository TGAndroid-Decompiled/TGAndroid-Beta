package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public abstract class SizeNotifierFrameLayoutPhoto extends SizeNotifierFrameLayout {
    private Activity activity;
    private int keyboardHeight;
    private Rect rect;
    private boolean useSmoothKeyboard;
    private boolean withoutWindow;

    public SizeNotifierFrameLayoutPhoto(Context context, Activity activity, boolean z) {
        super(context);
        this.rect = new Rect();
        setActivity(activity);
        this.useSmoothKeyboard = z;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setWithoutWindow(boolean z) {
        this.withoutWindow = z;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        notifyHeightChanged();
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
        final boolean z = point.x > point.y;
        post(new Runnable() {
            @Override
            public final void run() {
                SizeNotifierFrameLayoutPhoto.m2823$r8$lambda$P7SZp_2m8n1mZLvJ0vGjJ0xWr4(this.f$0, z);
            }
        });
    }

    public static void m2823$r8$lambda$P7SZp_2m8n1mZLvJ0vGjJ0xWr4(SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto, boolean z) {
        SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate sizeNotifierFrameLayoutDelegate = sizeNotifierFrameLayoutPhoto.delegate;
        if (sizeNotifierFrameLayoutDelegate != null) {
            sizeNotifierFrameLayoutDelegate.onSizeChanged(sizeNotifierFrameLayoutPhoto.keyboardHeight, z);
        }
        for (int i = 0; i < sizeNotifierFrameLayoutPhoto.delegates.size(); i++) {
            ((SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate) sizeNotifierFrameLayoutPhoto.delegates.get(i)).onSizeChanged(sizeNotifierFrameLayoutPhoto.keyboardHeight, z);
        }
    }
}
