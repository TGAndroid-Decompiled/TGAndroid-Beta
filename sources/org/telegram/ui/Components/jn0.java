package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class jn0 extends z5 {
    public final f6 d;
    public final int e;
    public final ScrollSlidingTextTabStrip f27611f;

    public jn0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i10) {
        super(context);
        this.f27611f = scrollSlidingTextTabStrip;
        this.e = i10;
        this.d = new f6(this, 360L, bs.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.d.e(this.f27611f.f24366n0);
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
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f27611f.f24367r == this.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }
}
