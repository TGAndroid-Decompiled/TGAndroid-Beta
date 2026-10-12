package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class u7 extends ik0 {
    public float f31085r;
    public float f31086s;
    public boolean v;
    public final org.telegram.ui.Cells.l7 f31087w;
    public final float f31088x;
    public final l8 f31089y;

    public u7(l8 l8Var, Context context, float f7) {
        super(context);
        this.f31089y = l8Var;
        this.f31088x = f7;
        this.f31087w = new org.telegram.ui.Cells.l7(this, 2);
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
