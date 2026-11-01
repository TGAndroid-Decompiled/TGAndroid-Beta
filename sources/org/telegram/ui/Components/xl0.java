package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class xl0 extends n5 {
    public final t5 d;
    public final int e;
    public final ScrollSlidingTextTabStrip f32601f;

    public xl0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i10) {
        super(context);
        this.f32601f = scrollSlidingTextTabStrip;
        this.e = i10;
        this.d = new t5(this, 360L, gr.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.d.d(this.f32601f.f24183n0);
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (org.telegram.messenger.i0.T1(1.0f, 0.5f, d) * 255.0f));
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
        if (i10 > 0) {
            canvas2.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f32601f.f24184r == this.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }
}
