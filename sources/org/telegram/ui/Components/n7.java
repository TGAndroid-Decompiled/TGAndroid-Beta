package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class n7 extends qh0 {
    public final m7 E;
    public final m7 F;
    public long G;
    public final float H;
    public final e8 I;
    public float f37694r;
    public float f37695s;
    public int f37696w;
    public long f37697x;
    public long f37698y;

    public n7(e8 e8Var, Context context, float f10) {
        super(context);
        this.I = e8Var;
        this.H = f10;
        this.f37696w = 0;
        this.E = new m7(this, 0);
        this.F = new m7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
