package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s7 extends bj0 {
    public float f27860r;
    public float f27861s;
    public boolean v;
    public final org.telegram.ui.Cells.l7 f27862w;
    public final float f27863x;
    public final j8 f27864y;

    public s7(j8 j8Var, Context context, float f7) {
        super(context);
        this.f27864y = j8Var;
        this.f27863x = f7;
        this.f27862w = new org.telegram.ui.Cells.l7(this, 3);
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
