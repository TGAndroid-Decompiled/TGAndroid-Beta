package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class m61 extends View {
    public l61 f35944a;
    public int f35945b;
    public final RectF f35946c;
    public CharSequence d;
    public ly0 f35947e;
    public boolean f35948f;
    public en0 h;
    public final w5 f35949n;
    public final o61 f35950r;

    public m61(o61 o61Var, Context context) {
        super(context);
        this.f35950r = o61Var;
        this.f35946c = new RectF();
        this.f35949n = new w5(this, 360L, xq.h);
    }

    @Override
    public int getId() {
        return this.f35944a.f35530a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m61.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        l61 l61Var = this.f35944a;
        if (l61Var != null && (i7 = this.f35950r.G) != -1 && l61Var.f35530a == i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setSelected(z9);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        l61 l61Var = this.f35944a;
        o61 o61Var = this.f35950r;
        setMeasuredDimension(org.telegram.messenger.g0.L(o61Var.f36662r * 2) + l61Var.a(o61Var.f36644c) + o61Var.I, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z9) {
        if (this.f35948f == z9) {
            return;
        }
        this.f35948f = z9;
        invalidate();
    }
}
