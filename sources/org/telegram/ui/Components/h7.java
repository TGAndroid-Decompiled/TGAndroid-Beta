package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class h7 extends fh0 {
    public final g7 E;
    public final g7 F;
    public long G;
    public final float H;
    public final y7 I;
    public float f35182r;
    public float f35183s;
    public int f35184w;
    public long f35185x;
    public long f35186y;

    public h7(y7 y7Var, Context context, float f10) {
        super(context);
        this.I = y7Var;
        this.H = f10;
        this.f35184w = 0;
        this.E = new g7(this, 0);
        this.F = new g7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
