package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class r91 extends View {
    public q91 f30108a;
    public int f30109b;
    public final RectF f30110c;
    public CharSequence d;
    public r11 f30111e;
    public boolean f30112f;
    public jq0 h;
    public final g6 f30113n;
    public final t91 f30114r;

    public r91(t91 t91Var, Context context) {
        super(context);
        this.f30114r = t91Var;
        this.f30110c = new RectF();
        this.f30113n = new g6(this, 360L, js.h);
    }

    @Override
    public int getId() {
        return this.f30108a.f29806a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q91 q91Var = this.f30108a;
        if (q91Var != null && (i10 = this.f30114r.G) != -1 && q91Var.f29806a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        q91 q91Var = this.f30108a;
        t91 t91Var = this.f30114r;
        setMeasuredDimension(AndroidUtilities.dp(t91Var.f30822r * 2) + q91Var.a(t91Var.f30804c) + t91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f30112f == z10) {
            return;
        }
        this.f30112f = z10;
        invalidate();
    }
}
