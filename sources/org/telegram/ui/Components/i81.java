package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class i81 extends View {
    public h81 f25622a;
    public int f25623b;
    public final RectF f25624c;
    public CharSequence d;
    public k01 e;
    public boolean f25625f;
    public cp0 h;
    public final z5 f25626n;
    public final k81 f25627r;

    public i81(k81 k81Var, Context context) {
        super(context);
        this.f25627r = k81Var;
        this.f25624c = new RectF();
        this.f25626n = new z5(this, 360L, nr.h);
    }

    @Override
    public int getId() {
        return this.f25622a.f25354a;
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
        h81 h81Var = this.f25622a;
        if (h81Var != null && (i10 = this.f25627r.D) != -1 && h81Var.f25354a == i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityNodeInfo.setSelected(z4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        h81 h81Var = this.f25622a;
        k81 k81Var = this.f25627r;
        setMeasuredDimension(AndroidUtilities.dp(k81Var.f26225r * 2) + h81Var.a(k81Var.f26210c) + k81Var.F, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z4) {
        if (this.f25625f == z4) {
            return;
        }
        this.f25625f = z4;
        invalidate();
    }
}
