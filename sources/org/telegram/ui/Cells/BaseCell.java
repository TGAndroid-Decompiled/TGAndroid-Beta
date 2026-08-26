package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.gms.cast.internal.zzr;
import org.telegram.messenger.FileLog;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.SizeNotifierFrameLayout;

public abstract class BaseCell extends ViewGroup implements SizeNotifierFrameLayout.IViewWithInvalidateCallback {
    public boolean checkingForLongPress;
    public Runnable invalidateCallback;
    public zzr pendingCheckForLongPress;
    public BubbleActivity.AnonymousClass1 pendingCheckForTap;
    public int pressCount;

    public final class RippleDrawableSafe extends RippleDrawable {
        @Override
        public final void draw(Canvas canvas) {
            int iSave = canvas.save();
            try {
                super.draw(canvas);
            } catch (Exception e) {
                FileLog.e("probably forgot to put setCallback", e);
            } finally {
                canvas.restoreToCount(iSave);
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

    public static void setDrawableBounds(int i, int i2, Drawable drawable) {
        setDrawableBounds(drawable, i, i2, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public final void cancelCheckLongPress() {
        this.checkingForLongPress = false;
        zzr zzrVar = this.pendingCheckForLongPress;
        if (zzrVar != null) {
            removeCallbacks(zzrVar);
        }
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.pendingCheckForTap;
        if (anonymousClass1 != null) {
            removeCallbacks(anonymousClass1);
        }
    }

    public int getBoundsLeft() {
        return 0;
    }

    public int getBoundsRight() {
        return getWidth();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void invalidate() {
        Runnable runnable = this.invalidateCallback;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public void invalidateLite() {
        super.invalidate();
    }

    @Override
    public final void listenInvalidate(Runnable runnable) {
        this.invalidateCallback = runnable;
    }

    public boolean onLongPress() {
        return true;
    }

    public final void startCheckLongPress$1() {
        if (this.checkingForLongPress) {
            return;
        }
        this.checkingForLongPress = true;
        if (this.pendingCheckForTap == null) {
            this.pendingCheckForTap = new BubbleActivity.AnonymousClass1(this, 4);
        }
        postDelayed(this.pendingCheckForTap, ViewConfiguration.getTapTimeout());
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
}
