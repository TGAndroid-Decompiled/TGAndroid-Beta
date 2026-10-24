package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class r7 extends ak0 {
    public float f30080r;
    public float f30081s;
    public boolean v;
    public final org.telegram.ui.Cells.u5 f30082w;
    public final float f30083x;
    public final i8 f30084y;

    public r7(i8 i8Var, Context context, float f7) {
        super(context);
        this.f30084y = i8Var;
        this.f30083x = f7;
        this.f30082w = new org.telegram.ui.Cells.u5(this, 4);
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
