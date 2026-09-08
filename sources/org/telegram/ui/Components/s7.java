package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s7 extends aj0 {
    public final r7 E;
    public long F;
    public final float G;
    public final k8 H;
    public float f30238r;
    public float f30239s;
    public int v;
    public long f30240w;
    public long f30241x;
    public final r7 f30242y;

    public s7(k8 k8Var, Context context, float f7) {
        super(context);
        this.H = k8Var;
        this.G = f7;
        this.v = 0;
        this.f30242y = new r7(this, 0);
        this.E = new r7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
