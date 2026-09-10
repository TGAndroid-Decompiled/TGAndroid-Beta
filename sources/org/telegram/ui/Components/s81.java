package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class s81 extends View {
    public r81 f26977a;
    public int f26978b;
    public final RectF f26979c;
    public CharSequence d;
    public t01 e;
    public boolean f26980f;
    public jp0 h;
    public final d6 f26981n;
    public final u81 f26982r;

    public s81(u81 u81Var, Context context) {
        super(context);
        this.f26982r = u81Var;
        this.f26979c = new RectF();
        this.f26981n = new d6(this, 360L, wr.h);
    }

    @Override
    public int getId() {
        return this.f26977a.f26629a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        r81 r81Var = this.f26977a;
        if (r81Var != null && (i10 = this.f26982r.G) != -1 && r81Var.f26629a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        r81 r81Var = this.f26977a;
        u81 u81Var = this.f26982r;
        setMeasuredDimension(AndroidUtilities.dp(u81Var.f27635r * 2) + r81Var.a(u81Var.f27618c) + u81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f26980f == z10) {
            return;
        }
        this.f26980f = z10;
        invalidate();
    }
}
