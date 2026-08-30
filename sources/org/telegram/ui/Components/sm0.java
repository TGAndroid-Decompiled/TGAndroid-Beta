package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class sm0 extends t5 {
    public final z5 d;
    public final int e;
    public final ScrollSlidingTextTabStrip f28779f;

    public sm0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i10) {
        super(context);
        this.f28779f = scrollSlidingTextTabStrip;
        this.e = i10;
        this.d = new z5(this, 360L, nr.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.d.e(this.f28779f.f23167k0);
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (AndroidUtilities.lerp(1.0f, 0.5f, e) * 255.0f));
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
        boolean z4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f28779f.f23169r == this.e) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityNodeInfo.setSelected(z4);
    }
}
