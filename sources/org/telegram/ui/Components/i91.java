package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class i91 extends View {
    public h91 f27374a;
    public int f27375b;
    public final RectF f27376c;
    public CharSequence d;
    public h11 e;
    public boolean f27377f;
    public yp0 h;
    public final d6 f27378n;
    public final k91 f27379r;

    public i91(k91 k91Var, Context context) {
        super(context);
        this.f27379r = k91Var;
        this.f27376c = new RectF();
        this.f27378n = new d6(this, 360L, zr.h);
    }

    @Override
    public int getId() {
        return this.f27374a.f26971a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h91 h91Var = this.f27374a;
        if (h91Var != null && (i10 = this.f27379r.G) != -1 && h91Var.f26971a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        h91 h91Var = this.f27374a;
        k91 k91Var = this.f27379r;
        setMeasuredDimension(AndroidUtilities.dp(k91Var.f27984r * 2) + h91Var.a(k91Var.f27967c) + k91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f27377f == z10) {
            return;
        }
        this.f27377f = z10;
        invalidate();
    }
}
