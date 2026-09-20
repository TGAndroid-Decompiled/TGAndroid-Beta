package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class u81 extends View {
    public t81 f28622a;
    public int f28623b;
    public final RectF f28624c;
    public CharSequence d;
    public u01 e;
    public boolean f28625f;
    public lp0 h;
    public final d6 f28626n;
    public final w81 f28627r;

    public u81(w81 w81Var, Context context) {
        super(context);
        this.f28627r = w81Var;
        this.f28624c = new RectF();
        this.f28626n = new d6(this, 360L, qr.h);
    }

    @Override
    public int getId() {
        return this.f28622a.f28348a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t81 t81Var = this.f28622a;
        if (t81Var != null && (i10 = this.f28627r.G) != -1 && t81Var.f28348a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        t81 t81Var = this.f28622a;
        w81 w81Var = this.f28627r;
        setMeasuredDimension(AndroidUtilities.dp(w81Var.f30002r * 2) + t81Var.a(w81Var.f29985c) + w81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f28625f == z10) {
            return;
        }
        this.f28625f = z10;
        invalidate();
    }
}
