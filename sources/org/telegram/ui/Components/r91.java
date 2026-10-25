package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class r91 extends View {
    public q91 f32178a;
    public int f32179b;
    public final RectF f32180c;
    public CharSequence d;
    public q11 e;
    public boolean f32181f;
    public eq0 h;
    public final h6 f32182n;
    public final t91 f32183r;

    public r91(t91 t91Var, Context context) {
        super(context);
        this.f32183r = t91Var;
        this.f32180c = new RectF();
        this.f32182n = new h6(this, 360L, ds.h);
    }

    @Override
    public int getId() {
        return this.f32178a.f31862a;
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
        q91 q91Var = this.f32178a;
        if (q91Var != null && (i10 = this.f32183r.G) != -1 && q91Var.f31862a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        q91 q91Var = this.f32178a;
        t91 t91Var = this.f32183r;
        setMeasuredDimension(AndroidUtilities.dp(t91Var.f32940r * 2) + q91Var.a(t91Var.f32923c) + t91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f32181f == z10) {
            return;
        }
        this.f32181f = z10;
        invalidate();
    }
}
