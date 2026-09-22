package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class r7 extends nj0 {
    public float f27834r;
    public float f27835s;
    public boolean v;
    public final org.telegram.ui.Cells.u6 f27836w;
    public final float f27837x;
    public final i8 f27838y;

    public r7(i8 i8Var, Context context, float f7) {
        super(context);
        this.f27838y = i8Var;
        this.f27837x = f7;
        this.f27836w = new org.telegram.ui.Cells.u6(this, 4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
