package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class t7 extends bk0 {
    public float f30655r;
    public float f30656s;
    public boolean v;
    public final org.telegram.ui.Cells.u5 f30657w;
    public final float f30658x;
    public final k8 f30659y;

    public t7(k8 k8Var, Context context, float f7) {
        super(context);
        this.f30659y = k8Var;
        this.f30658x = f7;
        this.f30657w = new org.telegram.ui.Cells.u5(this, 4);
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
