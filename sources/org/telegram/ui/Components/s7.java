package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s7 extends nj0 {
    public float f30707r;
    public float f30708s;
    public boolean v;
    public final org.telegram.ui.Cells.t6 f30709w;
    public final float f30710x;
    public final j8 f30711y;

    public s7(j8 j8Var, Context context, float f7) {
        super(context);
        this.f30711y = j8Var;
        this.f30710x = f7;
        this.f30709w = new org.telegram.ui.Cells.t6(this, 4);
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
