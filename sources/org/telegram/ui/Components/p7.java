package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class p7 extends aj0 {
    public final o7 A;
    public long B;
    public final float C;
    public final g8 D;
    public float f31606r;
    public float f31607s;
    public int v;
    public long f31608w;
    public long f31609x;
    public final o7 f31610y;

    public p7(g8 g8Var, Context context, float f9) {
        super(context);
        this.D = g8Var;
        this.C = f9;
        this.v = 0;
        this.f31610y = new o7(this, 0);
        this.A = new o7(this, 1);
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
