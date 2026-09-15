package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class q7 extends aj0 {
    public float f27274r;
    public float f27275s;
    public boolean v;
    public final org.telegram.ui.Cells.l7 f27276w;
    public final float f27277x;
    public final h8 f27278y;

    public q7(h8 h8Var, Context context, float f7) {
        super(context);
        this.f27278y = h8Var;
        this.f27277x = f7;
        this.f27276w = new org.telegram.ui.Cells.l7(this, 3);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
