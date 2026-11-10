package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class j7 extends ch0 {
    public final i7 D;
    public final i7 E;
    public long F;
    public final float G;
    public final a8 H;
    public float f34853r;
    public float f34854s;
    public int f34855w;
    public long f34856x;
    public long f34857y;

    public j7(a8 a8Var, Context context, float f10) {
        super(context);
        this.H = a8Var;
        this.G = f10;
        this.f34855w = 0;
        this.D = new i7(this, 0);
        this.E = new i7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
