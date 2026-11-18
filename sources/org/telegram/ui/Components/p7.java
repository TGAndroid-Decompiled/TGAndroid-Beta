package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class p7 extends ph0 {
    public final g8 E;
    public float f38298r;
    public float f38299s;
    public boolean f38300w;
    public final j6.o f38301x;
    public final float f38302y;

    public p7(g8 g8Var, Context context, float f10) {
        super(context);
        this.E = g8Var;
        this.f38302y = f10;
        this.f38301x = new j6.o(this, 27);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
