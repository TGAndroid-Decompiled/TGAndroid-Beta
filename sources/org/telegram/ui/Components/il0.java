package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class il0 extends x5 {
    public final d6 d;
    public final int f36279e;
    public final ScrollSlidingTextTabStrip f36280f;

    public il0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i7) {
        super(context);
        this.f36280f = scrollSlidingTextTabStrip;
        this.f36279e = i7;
        this.d = new d6(this, 360L, nr.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(this.f36280f.f33152o0);
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
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f36280f.f33153r == this.f36279e) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }
}
