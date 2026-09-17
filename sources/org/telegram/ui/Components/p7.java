package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class p7 extends bj0 {
    public final o7 E;
    public long F;
    public final float G;
    public final h8 H;
    public float f26947r;
    public float f26948s;
    public int v;
    public long f26949w;
    public long f26950x;
    public final o7 f26951y;

    public p7(h8 h8Var, Context context, float f7) {
        super(context);
        this.H = h8Var;
        this.G = f7;
        this.v = 0;
        this.f26951y = new o7(this, 0);
        this.E = new o7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
