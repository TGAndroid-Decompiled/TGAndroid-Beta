package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s7 extends nj0 {
    public float f28144r;
    public float f28145s;
    public boolean v;
    public final org.telegram.ui.Cells.t6 f28146w;
    public final float f28147x;
    public final j8 f28148y;

    public s7(j8 j8Var, Context context, float f7) {
        super(context);
        this.f28148y = j8Var;
        this.f28147x = f7;
        this.f28146w = new org.telegram.ui.Cells.t6(this, 4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
