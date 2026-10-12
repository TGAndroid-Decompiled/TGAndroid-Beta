package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class u7 extends bk0 {
    public final t7 E;
    public long F;
    public final float G;
    public final m8 H;
    public float f29592r;
    public float f29593s;
    public int v;
    public long f29594w;
    public long f29595x;
    public final t7 f29596y;

    public u7(m8 m8Var, Context context, float f7) {
        super(context);
        this.H = m8Var;
        this.G = f7;
        this.v = 0;
        this.f29596y = new t7(this, 0);
        this.E = new t7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
