package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class z81 extends View {
    public y81 f32868a;
    public int f32869b;
    public final RectF f32870c;
    public CharSequence d;
    public d11 e;
    public boolean f32871f;
    public up0 h;
    public final f6 f32872n;
    public final b91 f32873r;

    public z81(b91 b91Var, Context context) {
        super(context);
        this.f32873r = b91Var;
        this.f32870c = new RectF();
        this.f32872n = new f6(this, 360L, bs.h);
    }

    @Override
    public int getId() {
        return this.f32868a.f32578a;
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
        y81 y81Var = this.f32868a;
        if (y81Var != null && (i10 = this.f32873r.G) != -1 && y81Var.f32578a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        y81 y81Var = this.f32868a;
        b91 b91Var = this.f32873r;
        setMeasuredDimension(AndroidUtilities.dp(b91Var.f24873r * 2) + y81Var.a(b91Var.f24856c) + b91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f32871f == z10) {
            return;
        }
        this.f32871f = z10;
        invalidate();
    }
}
