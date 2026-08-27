package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

public final class k7 extends ri0 {
    public final j7 A;
    public long B;
    public final float C;
    public final b8 D;

    public float f30018r;

    public float f30019s;
    public int v;

    public long f30020w;

    public long f30021x;

    public final j7 f30022y;

    public k7(b8 b8Var, Context context, float f10) {
        super(context);
        this.D = b8Var;
        this.C = f10;
        this.v = 0;
        this.f30022y = new j7(this, 0);
        this.A = new j7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
