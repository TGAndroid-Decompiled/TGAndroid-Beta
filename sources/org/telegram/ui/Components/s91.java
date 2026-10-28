package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class s91 extends View {
    public r91 f32530a;
    public int f32531b;
    public final RectF f32532c;
    public CharSequence d;
    public r11 e;
    public boolean f32533f;
    public fq0 h;
    public final h6 f32534n;
    public final u91 f32535r;

    public s91(u91 u91Var, Context context) {
        super(context);
        this.f32535r = u91Var;
        this.f32532c = new RectF();
        this.f32534n = new h6(this, 360L, ds.h);
    }

    @Override
    public int getId() {
        return this.f32530a.f32186a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        r91 r91Var = this.f32530a;
        if (r91Var != null && (i10 = this.f32535r.G) != -1 && r91Var.f32186a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        r91 r91Var = this.f32530a;
        u91 u91Var = this.f32535r;
        setMeasuredDimension(AndroidUtilities.dp(u91Var.f33317r * 2) + r91Var.a(u91Var.f33300c) + u91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f32533f == z10) {
            return;
        }
        this.f32533f = z10;
        invalidate();
    }
}
