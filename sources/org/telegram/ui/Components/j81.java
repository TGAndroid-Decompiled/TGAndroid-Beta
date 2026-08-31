package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class j81 extends View {
    public i81 f28074a;
    public int f28075b;
    public final RectF f28076c;
    public CharSequence d;
    public l01 f28077e;
    public boolean f28078f;
    public dp0 h;
    public final z5 f28079n;
    public final l81 f28080r;

    public j81(l81 l81Var, Context context) {
        super(context);
        this.f28080r = l81Var;
        this.f28076c = new RectF();
        this.f28079n = new z5(this, 360L, pr.h);
    }

    @Override
    public int getId() {
        return this.f28074a.f27698a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        i81 i81Var = this.f28074a;
        if (i81Var != null && (i10 = this.f28080r.D) != -1 && i81Var.f27698a == i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityNodeInfo.setSelected(z4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        i81 i81Var = this.f28074a;
        l81 l81Var = this.f28080r;
        setMeasuredDimension(AndroidUtilities.dp(l81Var.f28667r * 2) + i81Var.a(l81Var.f28651c) + l81Var.F, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z4) {
        if (this.f28078f == z4) {
            return;
        }
        this.f28078f = z4;
        invalidate();
    }
}
