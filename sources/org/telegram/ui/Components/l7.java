package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class l7 extends kj0 {
    public final k7 B;
    public long C;
    public final float D;
    public final c8 E;
    public float f28649r;
    public float f28650s;
    public int v;
    public long f28651w;
    public long f28652x;
    public final k7 f28653y;

    public l7(c8 c8Var, Context context, float f10) {
        super(context);
        this.E = c8Var;
        this.D = f10;
        this.v = 0;
        this.f28653y = new k7(this, 0);
        this.B = new k7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
