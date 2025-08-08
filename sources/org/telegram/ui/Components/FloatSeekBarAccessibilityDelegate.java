package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public abstract class FloatSeekBarAccessibilityDelegate extends SeekBarAccessibilityDelegate {
    private final boolean setPercentsEnabled;

    public float getDelta() {
        return 0.05f;
    }

    protected float getMaxValue() {
        return 1.0f;
    }

    protected float getMinValue() {
        return 0.0f;
    }

    protected abstract float getProgress();

    protected abstract void setProgress(float f);

    public FloatSeekBarAccessibilityDelegate() {
        this(false);
    }

    public FloatSeekBarAccessibilityDelegate(boolean z) {
        this.setPercentsEnabled = z;
    }

    @Override
    public void onInitializeAccessibilityNodeInfoInternal(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfoInternal(view, accessibilityNodeInfo);
        if (this.setPercentsEnabled) {
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            wrap.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            wrap.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, getMinValue(), getMaxValue(), getProgress()));
        }
    }

    @Override
    public boolean performAccessibilityActionInternal(View view, int i, Bundle bundle) {
        if (super.performAccessibilityActionInternal(view, i, bundle)) {
            return true;
        }
        if (i != AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS.getId()) {
            return false;
        }
        setProgress(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
        return true;
    }

    @Override
    protected void doScroll(View view, boolean z) {
        float delta = getDelta();
        if (z) {
            delta *= -1.0f;
        }
        setProgress(Math.min(getMaxValue(), Math.max(getMinValue(), getProgress() + delta)));
    }

    @Override
    protected boolean canScrollBackward(View view) {
        return getProgress() > getMinValue();
    }

    @Override
    protected boolean canScrollForward(View view) {
        return getProgress() < getMaxValue();
    }
}
