package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class xk0 extends o5 {
    public final u5 d;
    public final int f40387e;
    public final ScrollSlidingTextTabStrip f40388f;

    public xk0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i3) {
        super(context);
        this.f40388f = scrollSlidingTextTabStrip;
        this.f40387e = i3;
        this.d = new u5(this, 360L, xq.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(this.f40388f.f31612o0);
        int i3 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i3 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (org.telegram.messenger.g0.T1(1.0f, 0.5f, d) * 255.0f));
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        if (i3 > 0) {
            canvas2.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f40388f.f31613r == this.f40387e) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }
}
