package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class q7 extends ak0 {
    public final p7 E;
    public long F;
    public final float G;
    public final i8 H;
    public float f29813r;
    public float f29814s;
    public int v;
    public long f29815w;
    public long f29816x;
    public final p7 f29817y;

    public q7(i8 i8Var, Context context, float f7) {
        super(context);
        this.H = i8Var;
        this.G = f7;
        this.v = 0;
        this.f29817y = new p7(this, 0);
        this.E = new p7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
