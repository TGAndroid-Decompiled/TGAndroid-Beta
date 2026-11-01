package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class u71 extends View {
    public t71 f30891a;
    public int f30892b;
    public final RectF f30893c;
    public CharSequence d;
    public rz0 e;
    public boolean f30894f;
    public go0 h;
    public final t5 f30895n;
    public final w71 f30896r;

    public u71(w71 w71Var, Context context) {
        super(context);
        this.f30896r = w71Var;
        this.f30893c = new RectF();
        this.f30895n = new t5(this, 360L, gr.h);
    }

    @Override
    public int getId() {
        return this.f30891a.f30548a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u71.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t71 t71Var = this.f30891a;
        if (t71Var != null && (i10 = this.f30896r.G) != -1 && t71Var.f30548a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        t71 t71Var = this.f30891a;
        w71 w71Var = this.f30896r;
        setMeasuredDimension(org.telegram.messenger.i0.L(w71Var.f32159r * 2) + t71Var.a(w71Var.f32142c) + w71Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f30894f == z10) {
            return;
        }
        this.f30894f = z10;
        invalidate();
    }
}
