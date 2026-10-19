package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class t7 extends xj0 {
    public float f30441r;
    public float f30442s;
    public boolean v;
    public final org.telegram.ui.Cells.k7 f30443w;
    public final float f30444x;
    public final k8 f30445y;

    public t7(k8 k8Var, Context context, float f7) {
        super(context);
        this.f30445y = k8Var;
        this.f30444x = f7;
        this.f30443w = new org.telegram.ui.Cells.k7(this, 2);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
