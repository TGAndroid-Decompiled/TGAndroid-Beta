package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

public abstract class BaseCell extends ViewGroup {
    private boolean checkingForLongPress;
    private CheckForLongPress pendingCheckForLongPress;
    private CheckForTap pendingCheckForTap;
    private int pressCount;

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    protected boolean onLongPress() {
        return true;
    }

    static int access$104(BaseCell baseCell) {
        int i = baseCell.pressCount + 1;
        baseCell.pressCount = i;
        return i;
    }

    public final class CheckForTap implements Runnable {
        private CheckForTap() {
            BaseCell.this = r1;
        }

        @Override
        public void run() {
            if (BaseCell.this.pendingCheckForLongPress == null) {
                BaseCell baseCell = BaseCell.this;
                baseCell.pendingCheckForLongPress = new CheckForLongPress();
            }
            BaseCell.this.pendingCheckForLongPress.currentPressCount = BaseCell.access$104(BaseCell.this);
            BaseCell baseCell2 = BaseCell.this;
            baseCell2.postDelayed(baseCell2.pendingCheckForLongPress, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
        }
    }

    public class CheckForLongPress implements Runnable {
        public int currentPressCount;

        CheckForLongPress() {
            BaseCell.this = r1;
        }

        @Override
        public void run() {
            if (BaseCell.this.checkingForLongPress && BaseCell.this.getParent() != null && this.currentPressCount == BaseCell.this.pressCount) {
                BaseCell.this.checkingForLongPress = false;
                if (BaseCell.this.onLongPress()) {
                    BaseCell.this.performHapticFeedback(0);
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    BaseCell.this.onTouchEvent(obtain);
                    obtain.recycle();
                }
            }
        }
    }

    public BaseCell(Context context) {
        super(context);
        this.checkingForLongPress = false;
        this.pendingCheckForLongPress = null;
        this.pressCount = 0;
        this.pendingCheckForTap = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static void setDrawableBounds(Drawable drawable, int i, int i2) {
        setDrawableBounds(drawable, i, i2, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static void setDrawableBounds(Drawable drawable, float f, float f2) {
        setDrawableBounds(drawable, (int) f, (int) f2, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static float setDrawableBounds(Drawable drawable, float f, float f2, float f3) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f3) / drawable.getIntrinsicHeight();
        setDrawableBounds(drawable, (int) f, (int) f2, (int) intrinsicWidth, (int) f3);
        return intrinsicWidth;
    }

    public static void setDrawableBounds(Drawable drawable, int i, int i2, int i3, int i4) {
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, i4 + i2);
        }
    }

    public void startCheckLongPress() {
        if (this.checkingForLongPress) {
            return;
        }
        this.checkingForLongPress = true;
        if (this.pendingCheckForTap == null) {
            this.pendingCheckForTap = new CheckForTap();
        }
        postDelayed(this.pendingCheckForTap, ViewConfiguration.getTapTimeout());
    }

    public void cancelCheckLongPress() {
        this.checkingForLongPress = false;
        CheckForLongPress checkForLongPress = this.pendingCheckForLongPress;
        if (checkForLongPress != null) {
            removeCallbacks(checkForLongPress);
        }
        CheckForTap checkForTap = this.pendingCheckForTap;
        if (checkForTap != null) {
            removeCallbacks(checkForTap);
        }
    }
}
