package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class g7 extends fi0 {
    public final f7 D;
    public final f7 E;
    public long F;
    public final float G;
    public final w7 H;
    public float f26325r;
    public float f26326s;
    public int f26327w;
    public long f26328x;
    public long f26329y;

    public g7(w7 w7Var, Context context, float f7) {
        super(context);
        this.H = w7Var;
        this.G = f7;
        this.f26327w = 0;
        this.D = new f7(this, 0);
        this.E = new f7(this, 1);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g7.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
