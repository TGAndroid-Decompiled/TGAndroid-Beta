package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class v81 extends View {
    public u81 f29083a;
    public int f29084b;
    public final RectF f29085c;
    public CharSequence d;
    public w01 e;
    public boolean f29086f;
    public op0 h;
    public final e6 f29087n;
    public final x81 f29088r;

    public v81(x81 x81Var, Context context) {
        super(context);
        this.f29088r = x81Var;
        this.f29085c = new RectF();
        this.f29087n = new e6(this, 360L, tr.h);
    }

    @Override
    public int getId() {
        return this.f29083a.f28799a;
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
        u81 u81Var = this.f29083a;
        if (u81Var != null && (i10 = this.f29088r.G) != -1 && u81Var.f28799a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        u81 u81Var = this.f29083a;
        x81 x81Var = this.f29088r;
        setMeasuredDimension(AndroidUtilities.dp(x81Var.f30200r * 2) + u81Var.a(x81Var.f30183c) + x81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f29086f == z10) {
            return;
        }
        this.f29086f = z10;
        invalidate();
    }
}
