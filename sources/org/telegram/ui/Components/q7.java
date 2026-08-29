package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class q7 extends aj0 {
    public float f31862r;
    public float f31863s;
    public boolean v;
    public final lh.m7 f31864w;
    public final float f31865x;
    public final g8 f31866y;

    public q7(g8 g8Var, Context context, float f9) {
        super(context);
        this.f31866y = g8Var;
        this.f31865x = f9;
        this.f31864w = new lh.m7(this, 13);
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
