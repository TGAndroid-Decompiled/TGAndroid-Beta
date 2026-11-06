package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class k7 extends ch0 {
    public final j7 D;
    public final j7 E;
    public long F;
    public final float G;
    public final b8 H;
    public float f35190r;
    public float f35191s;
    public int f35192w;
    public long f35193x;
    public long f35194y;

    public k7(b8 b8Var, Context context, float f10) {
        super(context);
        this.H = b8Var;
        this.G = f10;
        this.f35192w = 0;
        this.D = new j7(this, 0);
        this.E = new j7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
