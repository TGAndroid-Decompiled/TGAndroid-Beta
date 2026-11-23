package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class h71 extends View {
    public g71 f35678a;
    public int f35679b;
    public final RectF f35680c;
    public CharSequence d;
    public wy0 f35681e;
    public boolean f35682f;
    public sn0 h;
    public final c6 f35683n;
    public final j71 f35684r;

    public h71(j71 j71Var, Context context) {
        super(context);
        this.f35684r = j71Var;
        this.f35680c = new RectF();
        this.f35683n = new c6(this, 360L, kr.h);
    }

    @Override
    public int getId() {
        return this.f35678a.f35349a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h71.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g71 g71Var = this.f35678a;
        if (g71Var != null && (i7 = this.f35684r.H) != -1 && g71Var.f35349a == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        g71 g71Var = this.f35678a;
        j71 j71Var = this.f35684r;
        setMeasuredDimension(org.telegram.messenger.g0.L(j71Var.f36344r * 2) + g71Var.a(j71Var.f36326c) + j71Var.J, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z10) {
        if (this.f35682f == z10) {
            return;
        }
        this.f35682f = z10;
        invalidate();
    }
}
