package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class u81 extends View {
    public t81 f28663a;
    public int f28664b;
    public final RectF f28665c;
    public CharSequence d;
    public v01 e;
    public boolean f28666f;
    public mp0 h;
    public final e6 f28667n;
    public final w81 f28668r;

    public u81(w81 w81Var, Context context) {
        super(context);
        this.f28668r = w81Var;
        this.f28665c = new RectF();
        this.f28667n = new e6(this, 360L, qr.h);
    }

    @Override
    public int getId() {
        return this.f28663a.f28354a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t81 t81Var = this.f28663a;
        if (t81Var != null && (i10 = this.f28668r.G) != -1 && t81Var.f28354a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        t81 t81Var = this.f28663a;
        w81 w81Var = this.f28668r;
        setMeasuredDimension(AndroidUtilities.dp(w81Var.f29981r * 2) + t81Var.a(w81Var.f29964c) + w81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f28666f == z10) {
            return;
        }
        this.f28666f = z10;
        invalidate();
    }
}
