package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class g71 extends View {
    public f71 f35406a;
    public int f35407b;
    public final RectF f35408c;
    public CharSequence d;
    public xy0 f35409e;
    public boolean f35410f;
    public tn0 h;
    public final d6 f35411n;
    public final i71 f35412r;

    public g71(i71 i71Var, Context context) {
        super(context);
        this.f35412r = i71Var;
        this.f35408c = new RectF();
        this.f35411n = new d6(this, 360L, nr.h);
    }

    @Override
    public int getId() {
        return this.f35406a.f35083a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g71.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f71 f71Var = this.f35406a;
        if (f71Var != null && (i7 = this.f35412r.H) != -1 && f71Var.f35083a == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        f71 f71Var = this.f35406a;
        i71 i71Var = this.f35412r;
        setMeasuredDimension(org.telegram.messenger.g0.L(i71Var.f36170r * 2) + f71Var.a(i71Var.f36152c) + i71Var.J, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z10) {
        if (this.f35410f == z10) {
            return;
        }
        this.f35410f = z10;
        invalidate();
    }
}
