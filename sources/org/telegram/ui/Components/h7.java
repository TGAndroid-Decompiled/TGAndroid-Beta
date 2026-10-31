package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class h7 extends ei0 {
    public final w7 D;
    public float f26636r;
    public float f26637s;
    public boolean f26638w;
    public final mg.c2 f26639x;
    public final float f26640y;

    public h7(w7 w7Var, Context context, float f7) {
        super(context);
        this.D = w7Var;
        this.f26640y = f7;
        this.f26639x = new mg.c2(this, 22);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
