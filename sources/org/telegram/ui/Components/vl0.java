package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class vl0 extends s5 {
    public final y5 d;
    public final int f33407e;
    public final ScrollSlidingTextTabStrip f33408f;

    public vl0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i9) {
        super(context);
        this.f33408f = scrollSlidingTextTabStrip;
        this.f33407e = i9;
        this.d = new y5(this, 360L, gr.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.d.e(this.f33408f.f26526j0);
        int i9 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i9 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (AndroidUtilities.lerp(1.0f, 0.5f, e10) * 255.0f));
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        if (i9 > 0) {
            canvas2.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f33408f.f26528r == this.f33407e) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }
}
