package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class t61 extends View {
    public s61 f39558a;
    public int f39559b;
    public final RectF f39560c;
    public CharSequence d;
    public oy0 f39561e;
    public boolean f39562f;
    public in0 h;
    public final u5 f39563n;
    public final v61 f39564r;

    public t61(v61 v61Var, Context context) {
        super(context);
        this.f39564r = v61Var;
        this.f39560c = new RectF();
        this.f39563n = new u5(this, 360L, er.h);
    }

    @Override
    public int getId() {
        return this.f39558a.f39188a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t61.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s61 s61Var = this.f39558a;
        if (s61Var != null && (i7 = this.f39564r.H) != -1 && s61Var.f39188a == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        s61 s61Var = this.f39558a;
        v61 v61Var = this.f39564r;
        setMeasuredDimension(org.telegram.messenger.g0.L(v61Var.f40313r * 2) + s61Var.a(v61Var.f40295c) + v61Var.J, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z10) {
        if (this.f39562f == z10) {
            return;
        }
        this.f39562f = z10;
        invalidate();
    }
}
