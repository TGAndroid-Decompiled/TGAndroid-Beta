package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

public final class l7 extends ri0 {

    public float f30311r;

    public float f30312s;
    public boolean v;

    public final m.i3 f30313w;

    public final float f30314x;

    public final b8 f30315y;

    public l7(b8 b8Var, Context context, float f10) {
        super(context);
        this.f30315y = b8Var;
        this.f30314x = f10;
        this.f30313w = new m.i3(this, 10);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
