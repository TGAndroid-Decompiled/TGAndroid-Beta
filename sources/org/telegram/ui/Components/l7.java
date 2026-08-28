package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class l7 extends pi0 {
    public float f30386r;
    public float f30387s;
    public boolean v;
    public final m.i3 f30388w;
    public final float f30389x;
    public final c8 f30390y;

    public l7(c8 c8Var, Context context, float f10) {
        super(context);
        this.f30390y = c8Var;
        this.f30389x = f10;
        this.f30388w = new m.i3(this, 10);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
