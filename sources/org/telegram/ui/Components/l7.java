package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class l7 extends dh0 {
    public final b8 D;
    public float f35625r;
    public float f35626s;
    public boolean f35627w;
    public final m.f3 f35628x;
    public final float f35629y;

    public l7(b8 b8Var, Context context, float f10) {
        super(context);
        this.D = b8Var;
        this.f35629y = f10;
        this.f35628x = new m.f3(this, 24);
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
