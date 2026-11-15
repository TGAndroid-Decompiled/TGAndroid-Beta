package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class i7 extends fh0 {
    public final y7 E;
    public float f35475r;
    public float f35476s;
    public boolean f35477w;
    public final j6.o f35478x;
    public final float f35479y;

    public i7(y7 y7Var, Context context, float f10) {
        super(context);
        this.E = y7Var;
        this.f35479y = f10;
        this.f35478x = new j6.o(this, 27);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
