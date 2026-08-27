package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;

public final class yl0 extends s5 {
    public final y5 d;

    public final int f34918e;

    public final ScrollSlidingTextTabStrip f34919f;

    public yl0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i10) {
        super(context);
        this.f34919f = scrollSlidingTextTabStrip;
        this.f34918e = i10;
        this.d = new y5(this, 360L, er.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float fE = this.d.e(this.f34919f.f26522j0);
        if (fE > 0.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (AndroidUtilities.lerp(1.0f, 0.5f, fE) * 255.0f));
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        if (fE > 0.0f) {
            canvas2.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setSelected(this.f34919f.f26524r == this.f34918e);
    }
}
