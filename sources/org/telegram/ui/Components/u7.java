package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class u7 extends fk0 {
    public float f31384r;
    public float f31385s;
    public boolean v;
    public final org.telegram.ui.Cells.t6 f31386w;
    public final float f31387x;
    public final l8 f31388y;

    public u7(l8 l8Var, Context context, float f7) {
        super(context);
        this.f31388y = l8Var;
        this.f31387x = f7;
        this.f31386w = new org.telegram.ui.Cells.t6(this, 3);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
