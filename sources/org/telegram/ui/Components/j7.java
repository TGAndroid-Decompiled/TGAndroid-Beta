package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class j7 extends fh0 {
    public final z7 E;
    public float f34974r;
    public float f34975s;
    public boolean f34976w;
    public final mi.b0 f34977x;
    public final float f34978y;

    public j7(z7 z7Var, Context context, float f10) {
        super(context);
        this.E = z7Var;
        this.f34978y = f10;
        this.f34977x = new mi.b0(this, 23);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
