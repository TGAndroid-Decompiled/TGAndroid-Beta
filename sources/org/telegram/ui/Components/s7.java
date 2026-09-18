package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s7 extends lj0 {
    public float f28070r;
    public float f28071s;
    public boolean v;
    public final org.telegram.ui.Cells.t6 f28072w;
    public final float f28073x;
    public final j8 f28074y;

    public s7(j8 j8Var, Context context, float f7) {
        super(context);
        this.f28074y = j8Var;
        this.f28073x = f7;
        this.f28072w = new org.telegram.ui.Cells.t6(this, 4);
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
