package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class t61 extends View {
    public s61 f39556a;
    public int f39557b;
    public final RectF f39558c;
    public CharSequence d;
    public oy0 f39559e;
    public boolean f39560f;
    public in0 h;
    public final u5 f39561n;
    public final v61 f39562r;

    public t61(v61 v61Var, Context context) {
        super(context);
        this.f39562r = v61Var;
        this.f39558c = new RectF();
        this.f39561n = new u5(this, 360L, er.h);
    }

    @Override
    public int getId() {
        return this.f39556a.f39185a;
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
        s61 s61Var = this.f39556a;
        if (s61Var != null && (i7 = this.f39562r.H) != -1 && s61Var.f39185a == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        s61 s61Var = this.f39556a;
        v61 v61Var = this.f39562r;
        setMeasuredDimension(org.telegram.messenger.g0.L(v61Var.f40313r * 2) + s61Var.a(v61Var.f40295c) + v61Var.J, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z10) {
        if (this.f39560f == z10) {
            return;
        }
        this.f39560f = z10;
        invalidate();
    }
}
