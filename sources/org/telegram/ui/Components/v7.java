package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class v7 extends bk0 {
    public float f29905r;
    public float f29906s;
    public boolean v;
    public final org.telegram.ui.Cells.t6 f29907w;
    public final float f29908x;
    public final m8 f29909y;

    public v7(m8 m8Var, Context context, float f7) {
        super(context);
        this.f29909y = m8Var;
        this.f29908x = f7;
        this.f29907w = new org.telegram.ui.Cells.t6(this, 3);
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
