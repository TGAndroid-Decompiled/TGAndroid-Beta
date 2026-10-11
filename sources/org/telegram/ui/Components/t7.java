package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class t7 extends gk0 {
    public final s7 E;
    public long F;
    public final float G;
    public final l8 H;
    public float f31129r;
    public float f31130s;
    public int v;
    public long f31131w;
    public long f31132x;
    public final s7 f31133y;

    public t7(l8 l8Var, Context context, float f7) {
        super(context);
        this.H = l8Var;
        this.G = f7;
        this.v = 0;
        this.f31133y = new s7(this, 0);
        this.E = new s7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
