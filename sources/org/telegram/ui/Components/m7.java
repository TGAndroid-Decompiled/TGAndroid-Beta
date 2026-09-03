package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class m7 extends jj0 {
    public float f26975r;
    public float f26976s;
    public boolean v;
    public final m2.b f26977w;
    public final float f26978x;
    public final c8 f26979y;

    public m7(c8 c8Var, Context context, float f10) {
        super(context);
        this.f26979y = c8Var;
        this.f26978x = f10;
        this.f26977w = new m2.b(this, 12);
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
