package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class r7 extends kj0 {
    public float f27786r;
    public float f27787s;
    public boolean v;
    public final org.telegram.ui.Cells.u6 f27788w;
    public final float f27789x;
    public final i8 f27790y;

    public r7(i8 i8Var, Context context, float f7) {
        super(context);
        this.f27790y = i8Var;
        this.f27789x = f7;
        this.f27788w = new org.telegram.ui.Cells.u6(this, 4);
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
