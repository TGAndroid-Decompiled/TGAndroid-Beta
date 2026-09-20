package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class q7 extends kj0 {
    public final p7 E;
    public long F;
    public final float G;
    public final i8 H;
    public float f27527r;
    public float f27528s;
    public int v;
    public long f27529w;
    public long f27530x;
    public final p7 f27531y;

    public q7(i8 i8Var, Context context, float f7) {
        super(context);
        this.H = i8Var;
        this.G = f7;
        this.v = 0;
        this.f27531y = new p7(this, 0);
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
