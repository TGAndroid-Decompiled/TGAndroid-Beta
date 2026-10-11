package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class u7 extends hk0 {
    public float f31305r;
    public float f31306s;
    public boolean v;
    public final org.telegram.ui.Cells.t6 f31307w;
    public final float f31308x;
    public final l8 f31309y;

    public u7(l8 l8Var, Context context, float f7) {
        super(context);
        this.f31309y = l8Var;
        this.f31308x = f7;
        this.f31307w = new org.telegram.ui.Cells.t6(this, 3);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
