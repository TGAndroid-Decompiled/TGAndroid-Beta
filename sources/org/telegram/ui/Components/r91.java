package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class r91 extends View {
    public q91 f30109a;
    public int f30110b;
    public final RectF f30111c;
    public CharSequence d;
    public r11 f30112e;
    public boolean f30113f;
    public jq0 h;
    public final g6 f30114n;
    public final t91 f30115r;

    public r91(t91 t91Var, Context context) {
        super(context);
        this.f30115r = t91Var;
        this.f30111c = new RectF();
        this.f30114n = new g6(this, 360L, js.h);
    }

    @Override
    public int getId() {
        return this.f30109a.f29784a;
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
        q91 q91Var = this.f30109a;
        if (q91Var != null && (i10 = this.f30115r.G) != -1 && q91Var.f29784a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        q91 q91Var = this.f30109a;
        t91 t91Var = this.f30115r;
        setMeasuredDimension(AndroidUtilities.dp(t91Var.f30825r * 2) + q91Var.a(t91Var.f30807c) + t91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f30113f == z10) {
            return;
        }
        this.f30113f = z10;
        invalidate();
    }
}
