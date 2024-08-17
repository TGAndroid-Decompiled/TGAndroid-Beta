package org.telegram.ui.Stories;

import android.annotation.SuppressLint;
import android.content.Context;
import org.telegram.ui.Components.AvatarsImageView;

@SuppressLint({"ViewConstructor"})
class HwAvatarsImageView extends AvatarsImageView {
    public HwAvatarsImageView(Context context, boolean z) {
        super(context, z);
    }

    @Override
    public void invalidate() {
        if (HwFrameLayout.hwEnabled) {
            HwFrameLayout.hwViews.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public void invalidate(int i, int i2, int i3, int i4) {
        if (HwFrameLayout.hwEnabled) {
            HwFrameLayout.hwViews.add(this);
        } else {
            super.invalidate(i, i2, i3, i4);
        }
    }
}
