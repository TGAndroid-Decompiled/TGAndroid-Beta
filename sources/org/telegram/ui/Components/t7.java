package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class t7 extends xj0 {
    public float f30479r;
    public float f30480s;
    public boolean v;
    public final org.telegram.ui.Cells.k7 f30481w;
    public final float f30482x;
    public final k8 f30483y;

    public t7(k8 k8Var, Context context, float f7) {
        super(context);
        this.f30483y = k8Var;
        this.f30482x = f7;
        this.f30481w = new org.telegram.ui.Cells.k7(this, 2);
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
