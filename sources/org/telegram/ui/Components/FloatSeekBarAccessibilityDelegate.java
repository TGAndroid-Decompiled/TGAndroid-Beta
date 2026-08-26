package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

public abstract class FloatSeekBarAccessibilityDelegate extends SeekBarAccessibilityDelegate {
    public final boolean setPercentsEnabled;

    public FloatSeekBarAccessibilityDelegate() {
        this.setPercentsEnabled = false;
    }

    @Override
    public final boolean canScrollBackward() {
        return getProgress() > getMinValue();
    }

    @Override
    public final boolean canScrollForward() {
        return getProgress() < getMaxValue();
    }

    @Override
    public final void doScroll(boolean z) {
        float delta = getDelta();
        if (z) {
            delta *= -1.0f;
        }
        setProgress(Math.min(getMaxValue(), Math.max(getMinValue(), getProgress() + delta)));
    }

    public float getDelta() {
        return 0.05f;
    }

    public float getMaxValue() {
        return 1.0f;
    }

    public float getMinValue() {
        return 0.0f;
    }

    public abstract float getProgress();

    @Override
    public final void onInitializeAccessibilityNodeInfoInternal(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfoInternal(view, accessibilityNodeInfo);
        if (this.setPercentsEnabled) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS.mAction);
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, getMinValue(), getMaxValue(), getProgress()));
        }
    }

    @Override
    public final boolean performAccessibilityActionInternal(View view, int i, Bundle bundle) {
        if (super.performAccessibilityActionInternal(view, i, bundle)) {
            return true;
        }
        if (i != ((AccessibilityNodeInfo.AccessibilityAction) AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS.mAction).getId()) {
            return false;
        }
        setProgress(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
        return true;
    }

    public abstract void setProgress(float f);

    public FloatSeekBarAccessibilityDelegate(boolean z) {
        this.setPercentsEnabled = z;
    }
}
