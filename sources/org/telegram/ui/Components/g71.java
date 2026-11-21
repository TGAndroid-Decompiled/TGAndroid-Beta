package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class g71 extends View {
    public f71 f35425a;
    public int f35426b;
    public final RectF f35427c;
    public CharSequence d;
    public xy0 f35428e;
    public boolean f35429f;
    public tn0 h;
    public final d6 f35430n;
    public final i71 f35431r;

    public g71(i71 i71Var, Context context) {
        super(context);
        this.f35431r = i71Var;
        this.f35427c = new RectF();
        this.f35430n = new d6(this, 360L, nr.h);
    }

    @Override
    public int getId() {
        return this.f35425a.f35106a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g71.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f71 f71Var = this.f35425a;
        if (f71Var != null && (i7 = this.f35431r.H) != -1 && f71Var.f35106a == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        f71 f71Var = this.f35425a;
        i71 i71Var = this.f35431r;
        setMeasuredDimension(org.telegram.messenger.g0.L(i71Var.f36222r * 2) + f71Var.a(i71Var.f36204c) + i71Var.J, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z10) {
        if (this.f35429f == z10) {
            return;
        }
        this.f35429f = z10;
        invalidate();
    }
}
