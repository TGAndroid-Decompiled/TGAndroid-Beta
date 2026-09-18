package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class q7 extends bj0 {
    public float f27232r;
    public float f27233s;
    public boolean v;
    public final org.telegram.ui.Cells.l7 f27234w;
    public final float f27235x;
    public final h8 f27236y;

    public q7(h8 h8Var, Context context, float f7) {
        super(context);
        this.f27236y = h8Var;
        this.f27235x = f7;
        this.f27234w = new org.telegram.ui.Cells.l7(this, 3);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
