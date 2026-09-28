package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class v81 extends View {
    public u81 f29015a;
    public int f29016b;
    public final RectF f29017c;
    public CharSequence d;
    public v01 e;
    public boolean f29018f;
    public np0 h;
    public final e6 f29019n;
    public final x81 f29020r;

    public v81(x81 x81Var, Context context) {
        super(context);
        this.f29020r = x81Var;
        this.f29017c = new RectF();
        this.f29019n = new e6(this, 360L, sr.h);
    }

    @Override
    public int getId() {
        return this.f29015a.f28786a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        u81 u81Var = this.f29015a;
        if (u81Var != null && (i10 = this.f29020r.G) != -1 && u81Var.f28786a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        u81 u81Var = this.f29015a;
        x81 x81Var = this.f29020r;
        setMeasuredDimension(AndroidUtilities.dp(x81Var.f30343r * 2) + u81Var.a(x81Var.f30326c) + x81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f29018f == z10) {
            return;
        }
        this.f29018f = z10;
        invalidate();
    }
}
