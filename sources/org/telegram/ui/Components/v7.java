package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class v7 extends ak0 {
    public float f33587r;
    public float f33588s;
    public boolean v;
    public final m.g3 f33589w;
    public final float f33590x;
    public final m8 f33591y;

    public v7(m8 m8Var, Context context, float f7) {
        super(context);
        this.f33591y = m8Var;
        this.f33590x = f7;
        this.f33589w = new m.g3(this, 8);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
