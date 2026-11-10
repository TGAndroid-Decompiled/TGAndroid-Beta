package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s61 extends View {
    public r61 f37878a;
    public int f37879b;
    public final RectF f37880c;
    public CharSequence d;
    public my0 f37881e;
    public boolean f37882f;
    public en0 h;
    public final v5 f37883n;
    public final u61 f37884r;

    public s61(u61 u61Var, Context context) {
        super(context);
        this.f37884r = u61Var;
        this.f37880c = new RectF();
        this.f37883n = new v5(this, 360L, wq.h);
    }

    @Override
    public int getId() {
        return this.f37878a.f37523a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s61.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        r61 r61Var = this.f37878a;
        if (r61Var != null && (i7 = this.f37884r.G) != -1 && r61Var.f37523a == i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setSelected(z9);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        r61 r61Var = this.f37878a;
        u61 u61Var = this.f37884r;
        setMeasuredDimension(org.telegram.messenger.g0.L(u61Var.f38578r * 2) + r61Var.a(u61Var.f38560c) + u61Var.I, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z9) {
        if (this.f37882f == z9) {
            return;
        }
        this.f37882f = z9;
        invalidate();
    }
}
