package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class m7 extends jj0 {
    public float f26956r;
    public float f26957s;
    public boolean v;
    public final m2.b f26958w;
    public final float f26959x;
    public final c8 f26960y;

    public m7(c8 c8Var, Context context, float f10) {
        super(context);
        this.f26960y = c8Var;
        this.f26959x = f10;
        this.f26958w = new m2.b(this, 12);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
