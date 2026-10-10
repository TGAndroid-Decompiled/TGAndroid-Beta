package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class m91 extends View {
    public l91 f28730a;
    public int f28731b;
    public final RectF f28732c;
    public CharSequence d;
    public m11 f28733e;
    public boolean f28734f;
    public eq0 h;
    public final g6 f28735n;
    public final o91 f28736r;

    public m91(o91 o91Var, Context context) {
        super(context);
        this.f28736r = o91Var;
        this.f28732c = new RectF();
        this.f28735n = new g6(this, 360L, is.h);
    }

    @Override
    public int getId() {
        return this.f28730a.f28275a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        l91 l91Var = this.f28730a;
        if (l91Var != null && (i10 = this.f28736r.G) != -1 && l91Var.f28275a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l91 l91Var = this.f28730a;
        o91 o91Var = this.f28736r;
        setMeasuredDimension(AndroidUtilities.dp(o91Var.f29422r * 2) + l91Var.a(o91Var.f29404c) + o91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f28734f == z10) {
            return;
        }
        this.f28734f = z10;
        invalidate();
    }
}
