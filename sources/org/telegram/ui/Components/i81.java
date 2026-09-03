package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class i81 extends View {
    public h81 f27738a;
    public int f27739b;
    public final RectF f27740c;
    public CharSequence d;
    public k01 f27741e;
    public boolean f27742f;
    public cp0 h;
    public final z5 f27743n;
    public final k81 f27744r;

    public i81(k81 k81Var, Context context) {
        super(context);
        this.f27744r = k81Var;
        this.f27740c = new RectF();
        this.f27743n = new z5(this, 360L, pr.h);
    }

    @Override
    public int getId() {
        return this.f27738a.f27413a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h81 h81Var = this.f27738a;
        if (h81Var != null && (i10 = this.f27744r.D) != -1 && h81Var.f27413a == i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityNodeInfo.setSelected(z4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        h81 h81Var = this.f27738a;
        k81 k81Var = this.f27744r;
        setMeasuredDimension(AndroidUtilities.dp(k81Var.f28342r * 2) + h81Var.a(k81Var.f28326c) + k81Var.F, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z4) {
        if (this.f27742f == z4) {
            return;
        }
        this.f27742f = z4;
        invalidate();
    }
}
