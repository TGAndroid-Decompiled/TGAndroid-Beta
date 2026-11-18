package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class d71 extends View {
    public c71 f34293a;
    public int f34294b;
    public final RectF f34295c;
    public CharSequence d;
    public vy0 f34296e;
    public boolean f34297f;
    public rn0 h;
    public final c6 f34298n;
    public final f71 f34299r;

    public d71(f71 f71Var, Context context) {
        super(context);
        this.f34299r = f71Var;
        this.f34295c = new RectF();
        this.f34298n = new c6(this, 360L, lr.h);
    }

    @Override
    public int getId() {
        return this.f34293a.f33908a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d71.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c71 c71Var = this.f34293a;
        if (c71Var != null && (i7 = this.f34299r.H) != -1 && c71Var.f33908a == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        c71 c71Var = this.f34293a;
        f71 f71Var = this.f34299r;
        setMeasuredDimension(org.telegram.messenger.g0.L(f71Var.f35012r * 2) + c71Var.a(f71Var.f34994c) + f71Var.J, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z10) {
        if (this.f34297f == z10) {
            return;
        }
        this.f34297f = z10;
        invalidate();
    }
}
