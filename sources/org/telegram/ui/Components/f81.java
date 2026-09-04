package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class f81 extends View {
    public e81 f25955a;
    public int f25956b;
    public final RectF f25957c;
    public CharSequence d;
    public f01 f25958e;
    public boolean f25959f;
    public zo0 h;
    public final e6 f25960n;
    public final h81 f25961r;

    public f81(h81 h81Var, Context context) {
        super(context);
        this.f25961r = h81Var;
        this.f25957c = new RectF();
        this.f25960n = new e6(this, 360L, pr.h);
    }

    @Override
    public int getId() {
        return this.f25955a.f25602a;
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
        e81 e81Var = this.f25955a;
        if (e81Var != null && (i10 = this.f25961r.G) != -1 && e81Var.f25602a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        e81 e81Var = this.f25955a;
        h81 h81Var = this.f25961r;
        setMeasuredDimension(AndroidUtilities.dp(h81Var.f26654r * 2) + e81Var.a(h81Var.f26636c) + h81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f25959f == z10) {
            return;
        }
        this.f25959f = z10;
        invalidate();
    }
}
