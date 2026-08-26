package org.telegram.ui.Components;

public abstract class IntSeekBarAccessibilityDelegate extends SeekBarAccessibilityDelegate {
    @Override
    public final boolean canScrollBackward() {
        return getProgress() > 0;
    }

    @Override
    public final boolean canScrollForward() {
        return getProgress() < getMaxValue();
    }

    @Override
    public final void doScroll(boolean z) {
        int delta = getDelta();
        if (z) {
            delta *= -1;
        }
        setProgress(Math.min(getMaxValue(), Math.max(0, getProgress() + delta)));
    }

    public int getDelta() {
        return 1;
    }

    public abstract int getMaxValue();

    public abstract int getProgress();

    public abstract void setProgress(int i);
}
