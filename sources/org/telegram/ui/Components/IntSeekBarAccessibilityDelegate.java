package org.telegram.ui.Components;

import android.view.View;

public abstract class IntSeekBarAccessibilityDelegate extends SeekBarAccessibilityDelegate {
    protected int getDelta() {
        return 1;
    }

    protected abstract int getMaxValue();

    protected int getMinValue() {
        return 0;
    }

    protected abstract int getProgress();

    protected abstract void setProgress(int i);

    @Override
    protected void doScroll(View view, boolean z) {
        int delta = getDelta();
        if (z) {
            delta *= -1;
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
