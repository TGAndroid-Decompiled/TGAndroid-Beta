package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class m7 extends kj0 {
    public float f28989r;
    public float f28990s;
    public boolean v;
    public final m2.b f28991w;
    public final float f28992x;
    public final c8 f28993y;

    public m7(c8 c8Var, Context context, float f10) {
        super(context);
        this.f28993y = c8Var;
        this.f28992x = f10;
        this.f28991w = new m2.b(this, 12);
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
