package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class f81 extends View {
    public e81 f25982a;
    public int f25983b;
    public final RectF f25984c;
    public CharSequence d;
    public f01 f25985e;
    public boolean f25986f;
    public zo0 h;
    public final e6 f25987n;
    public final h81 f25988r;

    public f81(h81 h81Var, Context context) {
        super(context);
        this.f25988r = h81Var;
        this.f25984c = new RectF();
        this.f25987n = new e6(this, 360L, pr.h);
    }

    @Override
    public int getId() {
        return this.f25982a.f25629a;
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
        e81 e81Var = this.f25982a;
        if (e81Var != null && (i10 = this.f25988r.G) != -1 && e81Var.f25629a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        e81 e81Var = this.f25982a;
        h81 h81Var = this.f25988r;
        setMeasuredDimension(AndroidUtilities.dp(h81Var.f26681r * 2) + e81Var.a(h81Var.f26663c) + h81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f25986f == z10) {
            return;
        }
        this.f25986f = z10;
        invalidate();
    }
}
