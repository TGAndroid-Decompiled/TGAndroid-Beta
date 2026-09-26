package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class u81 extends View {
    public t81 f28741a;
    public int f28742b;
    public final RectF f28743c;
    public CharSequence d;
    public u01 e;
    public boolean f28744f;
    public mp0 h;
    public final e6 f28745n;
    public final w81 f28746r;

    public u81(w81 w81Var, Context context) {
        super(context);
        this.f28746r = w81Var;
        this.f28743c = new RectF();
        this.f28745n = new e6(this, 360L, sr.h);
    }

    @Override
    public int getId() {
        return this.f28741a.f28507a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t81 t81Var = this.f28741a;
        if (t81Var != null && (i10 = this.f28746r.G) != -1 && t81Var.f28507a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        t81 t81Var = this.f28741a;
        w81 w81Var = this.f28746r;
        setMeasuredDimension(AndroidUtilities.dp(w81Var.f29952r * 2) + t81Var.a(w81Var.f29935c) + w81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f28744f == z10) {
            return;
        }
        this.f28744f = z10;
        invalidate();
    }
}
