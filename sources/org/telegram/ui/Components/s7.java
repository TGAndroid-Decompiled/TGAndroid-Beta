package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s7 extends kj0 {
    public float f26961r;
    public float f26962s;
    public boolean v;
    public final org.telegram.ui.Cells.l9 f26963w;
    public final float f26964x;
    public final j8 f26965y;

    public s7(j8 j8Var, Context context, float f7) {
        super(context);
        this.f26965y = j8Var;
        this.f26964x = f7;
        this.f26963w = new org.telegram.ui.Cells.l9(this, 1);
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
