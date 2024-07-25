package org.telegram.ui.Stories;

import android.content.Context;
import android.view.TextureView;
class HwTextureView extends TextureView {
    public HwTextureView(Context context) {
        super(context);
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
