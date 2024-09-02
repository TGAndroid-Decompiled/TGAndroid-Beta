package org.telegram.ui.Cells;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.SizeNotifierFrameLayout;

public abstract class BaseCell extends ViewGroup implements SizeNotifierFrameLayout.IViewWithInvalidateCallback {
    private boolean cachingBottom;
    private boolean cachingTop;
    private boolean checkingForLongPress;
    private boolean forceNotCacheNextFrame;
    protected Runnable invalidateCallback;
    private CheckForLongPress pendingCheckForLongPress;
    private CheckForTap pendingCheckForTap;
    private int pressCount;
    private RenderNode renderNode;
    protected boolean updatedContent;

    protected boolean allowCaching() {
        return true;
    }

    public int getBoundsLeft() {
        return 0;
    }

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

    private final class CheckForTap implements Runnable {
        private CheckForTap() {
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

    class CheckForLongPress implements Runnable {
        public int currentPressCount;

        CheckForLongPress() {
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

    public static void setDrawableBounds(Drawable drawable, float f, float f2, int i, int i2) {
        if (drawable != null) {
            int i3 = (int) f;
            int i4 = (int) f2;
            drawable.setBounds(i3, i4, i + i3, i2 + i4);
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

    public int getBoundsRight() {
        return getWidth();
    }

    @Override
    public void listenInvalidate(Runnable runnable) {
        this.invalidateCallback = runnable;
    }

    public void invalidateLite() {
        super.invalidate();
    }

    @Override
    public void invalidate() {
        Runnable runnable = this.invalidateCallback;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public void setCaching(boolean z, boolean z2) {
        if (z) {
            this.cachingTop = SharedConfig.useNewBlur && z2;
        } else {
            this.cachingBottom = SharedConfig.useNewBlur && z2;
        }
    }

    public void forceNotCacheNextFrame() {
        this.forceNotCacheNextFrame = true;
    }

    public void drawCached(Canvas canvas) {
        RenderNode renderNode;
        if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.renderNode) != null && renderNode.hasDisplayList() && canvas.isHardwareAccelerated() && !this.updatedContent) {
            canvas.drawRenderNode(this.renderNode);
        } else {
            draw(canvas);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        boolean z = (this.cachingTop || this.cachingBottom || SharedConfig.useNewBlur) && allowCaching();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z != (this.renderNode != null)) {
                if (z) {
                    RenderNode renderNode = new RenderNode("basecell");
                    this.renderNode = renderNode;
                    renderNode.setClipToBounds(false);
                    this.updatedContent = true;
                } else {
                    this.renderNode = null;
                }
            }
        }
        if (i >= 29 && this.renderNode != null && !this.forceNotCacheNextFrame && canvas.isHardwareAccelerated()) {
            this.renderNode.setPosition(0, 0, getWidth(), getHeight());
            super.draw(this.renderNode.beginRecording());
            this.renderNode.endRecording();
            canvas.drawRenderNode(this.renderNode);
        } else {
            super.draw(canvas);
        }
        this.forceNotCacheNextFrame = false;
        this.updatedContent = false;
    }

    public static class RippleDrawableSafe extends RippleDrawable {
        public RippleDrawableSafe(ColorStateList colorStateList, Drawable drawable, Drawable drawable2) {
            super(colorStateList, drawable, drawable2);
        }

        @Override
        public boolean setState(int[] iArr) {
            if (getCallback() instanceof BaseCell) {
                ((BaseCell) getCallback()).forceNotCacheNextFrame();
            }
            return super.setState(iArr);
        }

        @Override
        public void draw(Canvas canvas) {
            try {
                super.draw(canvas);
            } catch (Exception e) {
                FileLog.e("probably forgot to put setCallback", e);
            }
        }
    }
}
