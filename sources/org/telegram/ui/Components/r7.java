package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class r7 extends kj0 {
    public final q7 E;
    public long F;
    public final float G;
    public final j8 H;
    public float f26609r;
    public float f26610s;
    public int v;
    public long f26611w;
    public long f26612x;
    public final q7 f26613y;

    public r7(j8 j8Var, Context context, float f7) {
        super(context);
        this.H = j8Var;
        this.G = f7;
        this.v = 0;
        this.f26613y = new q7(this, 0);
        this.E = new q7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
