package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class uk0 extends q5 {
    public final w5 d;
    public final int f38745e;
    public final ScrollSlidingTextTabStrip f38746f;

    public uk0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i7) {
        super(context);
        this.f38746f = scrollSlidingTextTabStrip;
        this.f38745e = i7;
        this.d = new w5(this, 360L, xq.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(this.f38746f.f31544n0);
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i7 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (org.telegram.messenger.g0.T1(1.0f, 0.5f, d) * 255.0f));
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        if (i7 > 0) {
            canvas2.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f38746f.f31545r == this.f38745e) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setSelected(z9);
    }
}
