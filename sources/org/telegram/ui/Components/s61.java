package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class s61 extends View {
    public r61 f37919a;
    public int f37920b;
    public final RectF f37921c;
    public CharSequence d;
    public my0 f37922e;
    public boolean f37923f;
    public en0 h;
    public final w5 f37924n;
    public final u61 f37925r;

    public s61(u61 u61Var, Context context) {
        super(context);
        this.f37925r = u61Var;
        this.f37921c = new RectF();
        this.f37924n = new w5(this, 360L, xq.h);
    }

    @Override
    public int getId() {
        return this.f37919a.f37511a;
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
        r61 r61Var = this.f37919a;
        if (r61Var != null && (i7 = this.f37925r.G) != -1 && r61Var.f37511a == i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setSelected(z9);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        r61 r61Var = this.f37919a;
        u61 u61Var = this.f37925r;
        setMeasuredDimension(org.telegram.messenger.g0.L(u61Var.f38532r * 2) + r61Var.a(u61Var.f38514c) + u61Var.I, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z9) {
        if (this.f37923f == z9) {
            return;
        }
        this.f37923f = z9;
        invalidate();
    }
}
