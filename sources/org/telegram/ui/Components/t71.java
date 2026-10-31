package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class t71 extends View {
    public s71 f30473a;
    public int f30474b;
    public final RectF f30475c;
    public CharSequence d;
    public qz0 e;
    public boolean f30476f;
    public fo0 h;
    public final t5 f30477n;
    public final v71 f30478r;

    public t71(v71 v71Var, Context context) {
        super(context);
        this.f30478r = v71Var;
        this.f30475c = new RectF();
        this.f30477n = new t5(this, 360L, gr.h);
    }

    @Override
    public int getId() {
        return this.f30473a.f30173a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t71.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s71 s71Var = this.f30473a;
        if (s71Var != null && (i10 = this.f30478r.G) != -1 && s71Var.f30173a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        s71 s71Var = this.f30473a;
        v71 v71Var = this.f30478r;
        setMeasuredDimension(org.telegram.messenger.i0.L(v71Var.f31181r * 2) + s71Var.a(v71Var.f31164c) + v71Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f30476f == z10) {
            return;
        }
        this.f30476f = z10;
        invalidate();
    }
}
