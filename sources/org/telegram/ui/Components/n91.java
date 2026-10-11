package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class n91 extends View {
    public m91 f29015a;
    public int f29016b;
    public final RectF f29017c;
    public CharSequence d;
    public n11 f29018e;
    public boolean f29019f;
    public fq0 h;
    public final g6 f29020n;
    public final p91 f29021r;

    public n91(p91 p91Var, Context context) {
        super(context);
        this.f29021r = p91Var;
        this.f29017c = new RectF();
        this.f29020n = new g6(this, 360L, is.h);
    }

    @Override
    public int getId() {
        return this.f29015a.f28633a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m91 m91Var = this.f29015a;
        if (m91Var != null && (i10 = this.f29021r.G) != -1 && m91Var.f28633a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        m91 m91Var = this.f29015a;
        p91 p91Var = this.f29021r;
        setMeasuredDimension(AndroidUtilities.dp(p91Var.f29680r * 2) + m91Var.a(p91Var.f29662c) + p91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f29019f == z10) {
            return;
        }
        this.f29019f = z10;
        invalidate();
    }
}
