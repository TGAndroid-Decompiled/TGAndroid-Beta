package org.telegram.ui.Components;

import android.view.View;

public abstract class IntSeekBarAccessibilityDelegate extends SeekBarAccessibilityDelegate {
    @Override
    public boolean canScrollBackward(View view) {
        return getProgress() > getMinValue();
    }

    @Override
    public boolean canScrollForward(View view) {
        return getProgress() < getMaxValue();
    }

    @Override
    public void doScroll(View view, boolean z) {
        int delta = getDelta();
        if (z) {
            delta *= -1;
        }
        setProgress(Math.min(getMaxValue(), Math.max(getMinValue(), getProgress() + delta)));
    }

    public int getDelta() {
        return 1;
    }

    public abstract int getMaxValue();

    public int getMinValue() {
        return 0;
    }

    public abstract int getProgress();

    public abstract void setProgress(int i);
}
