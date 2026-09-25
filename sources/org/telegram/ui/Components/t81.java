package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class t81 extends View {
    public s81 f28449a;
    public int f28450b;
    public final RectF f28451c;
    public CharSequence d;
    public t01 e;
    public boolean f28452f;
    public lp0 h;
    public final e6 f28453n;
    public final v81 f28454r;

    public t81(v81 v81Var, Context context) {
        super(context);
        this.f28454r = v81Var;
        this.f28451c = new RectF();
        this.f28453n = new e6(this, 360L, rr.h);
    }

    @Override
    public int getId() {
        return this.f28449a.f28204a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        s81 s81Var = this.f28449a;
        if (s81Var != null && (i10 = this.f28454r.G) != -1 && s81Var.f28204a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        s81 s81Var = this.f28449a;
        v81 v81Var = this.f28454r;
        setMeasuredDimension(AndroidUtilities.dp(v81Var.f29102r * 2) + s81Var.a(v81Var.f29085c) + v81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f28452f == z10) {
            return;
        }
        this.f28452f = z10;
        invalidate();
    }
}
