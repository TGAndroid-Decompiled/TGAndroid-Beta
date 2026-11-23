package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class o7 extends rh0 {
    public final n7 E;
    public final n7 F;
    public long G;
    public final float H;
    public final f8 I;
    public float f38108r;
    public float f38109s;
    public int f38110w;
    public long f38111x;
    public long f38112y;

    public o7(f8 f8Var, Context context, float f10) {
        super(context);
        this.I = f8Var;
        this.H = f10;
        this.f38110w = 0;
        this.E = new n7(this, 0);
        this.F = new n7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
