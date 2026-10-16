package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class v7 extends bk0 {
    public float f29582r;
    public float f29583s;
    public boolean v;
    public final org.telegram.ui.Cells.l7 f29584w;
    public final float f29585x;
    public final m8 f29586y;

    public v7(m8 m8Var, Context context, float f7) {
        super(context);
        this.f29586y = m8Var;
        this.f29585x = f7;
        this.f29584w = new org.telegram.ui.Cells.l7(this, 2);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
