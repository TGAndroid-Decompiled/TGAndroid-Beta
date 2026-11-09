package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class t61 extends View {
    public s61 f38305a;
    public int f38306b;
    public final RectF f38307c;
    public CharSequence d;
    public ny0 f38308e;
    public boolean f38309f;
    public fn0 h;
    public final w5 f38310n;
    public final v61 f38311r;

    public t61(v61 v61Var, Context context) {
        super(context);
        this.f38311r = v61Var;
        this.f38307c = new RectF();
        this.f38310n = new w5(this, 360L, xq.h);
    }

    @Override
    public int getId() {
        return this.f38305a.f37938a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t61.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s61 s61Var = this.f38305a;
        if (s61Var != null && (i7 = this.f38311r.G) != -1 && s61Var.f37938a == i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setSelected(z9);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        s61 s61Var = this.f38305a;
        v61 v61Var = this.f38311r;
        setMeasuredDimension(org.telegram.messenger.g0.L(v61Var.f38983r * 2) + s61Var.a(v61Var.f38965c) + v61Var.I, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z9) {
        if (this.f38309f == z9) {
            return;
        }
        this.f38309f = z9;
        invalidate();
    }
}
