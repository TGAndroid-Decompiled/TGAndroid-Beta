package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class tk0 extends p5 {
    public final v5 d;
    public final int f38333e;
    public final ScrollSlidingTextTabStrip f38334f;

    public tk0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i7) {
        super(context);
        this.f38334f = scrollSlidingTextTabStrip;
        this.f38333e = i7;
        this.d = new v5(this, 360L, wq.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(this.f38334f.f31555n0);
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
        if (this.f38334f.f31556r == this.f38333e) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setSelected(z9);
    }
}
