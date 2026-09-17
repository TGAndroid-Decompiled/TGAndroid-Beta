package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class q7 extends bj0 {
    public float f27229r;
    public float f27230s;
    public boolean v;
    public final org.telegram.ui.Cells.l7 f27231w;
    public final float f27232x;
    public final h8 f27233y;

    public q7(h8 h8Var, Context context, float f7) {
        super(context);
        this.f27233y = h8Var;
        this.f27232x = f7;
        this.f27231w = new org.telegram.ui.Cells.l7(this, 3);
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
