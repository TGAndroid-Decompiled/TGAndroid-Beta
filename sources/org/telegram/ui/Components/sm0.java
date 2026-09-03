package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class sm0 extends t5 {
    public final z5 d;
    public final int f31134e;
    public final ScrollSlidingTextTabStrip f31135f;

    public sm0(ScrollSlidingTextTabStrip scrollSlidingTextTabStrip, Context context, int i10) {
        super(context);
        this.f31135f = scrollSlidingTextTabStrip;
        this.f31134e = i10;
        this.d = new z5(this, 360L, pr.h);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float e6 = this.d.e(this.f31135f.f25027k0);
        int i10 = (e6 > 0.0f ? 1 : (e6 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (AndroidUtilities.lerp(1.0f, 0.5f, e6) * 255.0f));
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
        if (this.f31135f.f25029r == this.f31134e) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityNodeInfo.setSelected(z4);
    }
}
