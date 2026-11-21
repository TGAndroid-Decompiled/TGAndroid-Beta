package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class p7 extends rh0 {
    public final f8 E;
    public float f38521r;
    public float f38522s;
    public boolean f38523w;
    public final j6.o f38524x;
    public final float f38525y;

    public p7(f8 f8Var, Context context, float f10) {
        super(context);
        this.E = f8Var;
        this.f38525y = f10;
        this.f38524x = new j6.o(this, 27);
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
