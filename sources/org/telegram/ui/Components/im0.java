package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class im0 extends x5 {
    public final d6 d;
    public final int f29431e;
    public final ScrollSlidingTextTabStrip f29432f;

    public im0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i10) {
        super(context);
        this.f29432f = scrollSlidingTextTabStrip;
        this.f29431e = i10;
        this.d = new d6(this, 360L, jr.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e10 = this.d.e(this.f29432f.f26537j0);
        int i10 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (AndroidUtilities.lerp(1.0f, 0.5f, e10) * 255.0f));
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
        if (this.f29432f.f26539r == this.f29431e) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }
}
