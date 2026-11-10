package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class k7 extends ch0 {
    public final a8 D;
    public float f35227r;
    public float f35228s;
    public boolean f35229w;
    public final m.f3 f35230x;
    public final float f35231y;

    public k7(a8 a8Var, Context context, float f10) {
        super(context);
        this.D = a8Var;
        this.f35231y = f10;
        this.f35230x = new m.f3(this, 24);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
