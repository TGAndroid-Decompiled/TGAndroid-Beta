package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class k61 extends View {
    public j61 f35329a;
    public int f35330b;
    public final RectF f35331c;
    public CharSequence d;
    public ly0 f35332e;
    public boolean f35333f;
    public hn0 h;
    public final u5 f35334n;
    public final m61 f35335r;

    public k61(m61 m61Var, Context context) {
        super(context);
        this.f35335r = m61Var;
        this.f35331c = new RectF();
        this.f35334n = new u5(this, 360L, xq.h);
    }

    @Override
    public int getId() {
        return this.f35329a.f34971a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k61.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j61 j61Var = this.f35329a;
        if (j61Var != null && (i3 = this.f35335r.H) != -1 && j61Var.f34971a == i3) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        j61 j61Var = this.f35329a;
        m61 m61Var = this.f35335r;
        setMeasuredDimension(org.telegram.messenger.g0.L(m61Var.f36048r * 2) + j61Var.a(m61Var.f36030c) + m61Var.J, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z10) {
        if (this.f35333f == z10) {
            return;
        }
        this.f35333f = z10;
        invalidate();
    }
}
