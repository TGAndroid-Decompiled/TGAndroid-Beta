package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class l91 extends View {
    public k91 f28394a;
    public int f28395b;
    public final RectF f28396c;
    public CharSequence d;
    public l11 f28397e;
    public boolean f28398f;
    public dq0 h;
    public final g6 f28399n;
    public final n91 f28400r;

    public l91(n91 n91Var, Context context) {
        super(context);
        this.f28400r = n91Var;
        this.f28396c = new RectF();
        this.f28399n = new g6(this, 360L, hs.h);
    }

    @Override
    public int getId() {
        return this.f28394a.f27909a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        k91 k91Var = this.f28394a;
        if (k91Var != null && (i10 = this.f28400r.G) != -1 && k91Var.f27909a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        k91 k91Var = this.f28394a;
        n91 n91Var = this.f28400r;
        setMeasuredDimension(AndroidUtilities.dp(n91Var.f29117r * 2) + k91Var.a(n91Var.f29099c) + n91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f28398f == z10) {
            return;
        }
        this.f28398f = z10;
        invalidate();
    }
}
