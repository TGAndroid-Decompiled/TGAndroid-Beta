package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class i7 extends fh0 {
    public final h7 E;
    public final h7 F;
    public long G;
    public final float H;
    public final z7 I;
    public float f34623r;
    public float f34624s;
    public int f34625w;
    public long f34626x;
    public long f34627y;

    public i7(z7 z7Var, Context context, float f10) {
        super(context);
        this.I = z7Var;
        this.H = f10;
        this.f34625w = 0;
        this.E = new h7(this, 0);
        this.F = new h7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
