package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class v81 extends View {
    public u81 f29074a;
    public int f29075b;
    public final RectF f29076c;
    public CharSequence d;
    public v01 e;
    public boolean f29077f;
    public np0 h;
    public final e6 f29078n;
    public final x81 f29079r;

    public v81(x81 x81Var, Context context) {
        super(context);
        this.f29079r = x81Var;
        this.f29076c = new RectF();
        this.f29078n = new e6(this, 360L, sr.h);
    }

    @Override
    public int getId() {
        return this.f29074a.f28847a;
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
        u81 u81Var = this.f29074a;
        if (u81Var != null && (i10 = this.f29079r.G) != -1 && u81Var.f28847a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        u81 u81Var = this.f29074a;
        x81 x81Var = this.f29079r;
        setMeasuredDimension(AndroidUtilities.dp(x81Var.f30372r * 2) + u81Var.a(x81Var.f30355c) + x81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f29077f == z10) {
            return;
        }
        this.f29077f = z10;
        invalidate();
    }
}
