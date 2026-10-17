package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class z81 extends View {
    public y81 f32861a;
    public int f32862b;
    public final RectF f32863c;
    public CharSequence d;
    public d11 e;
    public boolean f32864f;
    public up0 h;
    public final f6 f32865n;
    public final b91 f32866r;

    public z81(b91 b91Var, Context context) {
        super(context);
        this.f32866r = b91Var;
        this.f32863c = new RectF();
        this.f32865n = new f6(this, 360L, bs.h);
    }

    @Override
    public int getId() {
        return this.f32861a.f32571a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y81 y81Var = this.f32861a;
        if (y81Var != null && (i10 = this.f32866r.G) != -1 && y81Var.f32571a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        y81 y81Var = this.f32861a;
        b91 b91Var = this.f32866r;
        setMeasuredDimension(AndroidUtilities.dp(b91Var.f24866r * 2) + y81Var.a(b91Var.f24849c) + b91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f32864f == z10) {
            return;
        }
        this.f32864f = z10;
        invalidate();
    }
}
