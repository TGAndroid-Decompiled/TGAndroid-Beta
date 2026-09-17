package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class t7 extends aj0 {
    public float f30542r;
    public float f30543s;
    public boolean v;
    public final org.telegram.ui.Cells.l7 f30544w;
    public final float f30545x;
    public final k8 f30546y;

    public t7(k8 k8Var, Context context, float f7) {
        super(context);
        this.f30546y = k8Var;
        this.f30545x = f7;
        this.f30544w = new org.telegram.ui.Cells.l7(this, 3);
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
