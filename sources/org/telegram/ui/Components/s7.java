package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s7 extends nj0 {
    public float f28179r;
    public float f28180s;
    public boolean v;
    public final org.telegram.ui.Cells.t6 f28181w;
    public final float f28182x;
    public final j8 f28183y;

    public s7(j8 j8Var, Context context, float f7) {
        super(context);
        this.f28183y = j8Var;
        this.f28182x = f7;
        this.f28181w = new org.telegram.ui.Cells.t6(this, 4);
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
