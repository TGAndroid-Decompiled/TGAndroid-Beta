package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class e91 extends View {
    public d91 f26083a;
    public int f26084b;
    public final RectF f26085c;
    public CharSequence d;
    public f11 f26086e;
    public boolean f26087f;
    public sp0 h;
    public final e6 f26088n;
    public final g91 f26089r;

    public e91(g91 g91Var, Context context) {
        super(context);
        this.f26089r = g91Var;
        this.f26085c = new RectF();
        this.f26088n = new e6(this, 360L, tr.h);
    }

    @Override
    public int getId() {
        return this.f26083a.f25731a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d91 d91Var = this.f26083a;
        if (d91Var != null && (i10 = this.f26089r.G) != -1 && d91Var.f25731a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d91 d91Var = this.f26083a;
        g91 g91Var = this.f26089r;
        setMeasuredDimension(AndroidUtilities.dp(g91Var.f26789r * 2) + d91Var.a(g91Var.f26771c) + g91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f26087f == z10) {
            return;
        }
        this.f26087f = z10;
        invalidate();
    }
}
