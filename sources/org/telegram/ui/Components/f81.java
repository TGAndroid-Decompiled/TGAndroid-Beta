package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class f81 extends View {
    public e81 f25956a;
    public int f25957b;
    public final RectF f25958c;
    public CharSequence d;
    public f01 f25959e;
    public boolean f25960f;
    public zo0 h;
    public final e6 f25961n;
    public final h81 f25962r;

    public f81(h81 h81Var, Context context) {
        super(context);
        this.f25962r = h81Var;
        this.f25958c = new RectF();
        this.f25961n = new e6(this, 360L, pr.h);
    }

    @Override
    public int getId() {
        return this.f25956a.f25603a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        e81 e81Var = this.f25956a;
        if (e81Var != null && (i10 = this.f25962r.G) != -1 && e81Var.f25603a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        e81 e81Var = this.f25956a;
        h81 h81Var = this.f25962r;
        setMeasuredDimension(AndroidUtilities.dp(h81Var.f26655r * 2) + e81Var.a(h81Var.f26637c) + h81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f25960f == z10) {
            return;
        }
        this.f25960f = z10;
        invalidate();
    }
}
