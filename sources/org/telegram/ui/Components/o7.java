package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class o7 extends qh0 {
    public final e8 E;
    public float f38046r;
    public float f38047s;
    public boolean f38048w;
    public final i6.g f38049x;
    public final float f38050y;

    public o7(e8 e8Var, Context context, float f10) {
        super(context);
        this.E = e8Var;
        this.f38050y = f10;
        this.f38049x = new i6.g(this, 28);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
