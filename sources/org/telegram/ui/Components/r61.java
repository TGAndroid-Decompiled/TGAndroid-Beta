package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class r61 extends View {
    public q61 f37558a;
    public int f37559b;
    public final RectF f37560c;
    public CharSequence d;
    public ly0 f37561e;
    public boolean f37562f;
    public en0 h;
    public final w5 f37563n;
    public final t61 f37564r;

    public r61(t61 t61Var, Context context) {
        super(context);
        this.f37564r = t61Var;
        this.f37560c = new RectF();
        this.f37563n = new w5(this, 360L, xq.h);
    }

    @Override
    public int getId() {
        return this.f37558a.f37165a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r61.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q61 q61Var = this.f37558a;
        if (q61Var != null && (i7 = this.f37564r.G) != -1 && q61Var.f37165a == i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setSelected(z9);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        q61 q61Var = this.f37558a;
        t61 t61Var = this.f37564r;
        setMeasuredDimension(org.telegram.messenger.g0.L(t61Var.f38264r * 2) + q61Var.a(t61Var.f38246c) + t61Var.I, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z9) {
        if (this.f37562f == z9) {
            return;
        }
        this.f37562f = z9;
        invalidate();
    }
}
