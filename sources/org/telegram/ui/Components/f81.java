package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class f81 extends View {
    public e81 f23848a;
    public int f23849b;
    public final RectF f23850c;
    public CharSequence d;
    public g01 e;
    public boolean f23851f;
    public yo0 h;
    public final c6 f23852n;
    public final h81 f23853r;

    public f81(h81 h81Var, Context context) {
        super(context);
        this.f23853r = h81Var;
        this.f23850c = new RectF();
        this.f23852n = new c6(this, 360L, qr.h);
    }

    @Override
    public int getId() {
        return this.f23848a.f23580a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        e81 e81Var = this.f23848a;
        if (e81Var != null && (i10 = this.f23853r.G) != -1 && e81Var.f23580a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        e81 e81Var = this.f23848a;
        h81 h81Var = this.f23853r;
        setMeasuredDimension(AndroidUtilities.dp(h81Var.f24612r * 2) + e81Var.a(h81Var.f24595c) + h81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f23851f == z10) {
            return;
        }
        this.f23851f = z10;
        invalidate();
    }
}
