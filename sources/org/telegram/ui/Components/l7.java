package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class l7 extends ch0 {
    public final b8 D;
    public float f35542r;
    public float f35543s;
    public boolean f35544w;
    public final m.f3 f35545x;
    public final float f35546y;

    public l7(b8 b8Var, Context context, float f10) {
        super(context);
        this.D = b8Var;
        this.f35546y = f10;
        this.f35545x = new m.f3(this, 24);
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
