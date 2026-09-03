package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class i81 extends View {
    public h81 f25643a;
    public int f25644b;
    public final RectF f25645c;
    public CharSequence d;
    public k01 e;
    public boolean f25646f;
    public bp0 h;
    public final z5 f25647n;
    public final k81 f25648r;

    public i81(k81 k81Var, Context context) {
        super(context);
        this.f25648r = k81Var;
        this.f25645c = new RectF();
        this.f25647n = new z5(this, 360L, mr.h);
    }

    @Override
    public int getId() {
        return this.f25643a.f25336a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z4;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h81 h81Var = this.f25643a;
        if (h81Var != null && (i10 = this.f25648r.D) != -1 && h81Var.f25336a == i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        accessibilityNodeInfo.setSelected(z4);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        h81 h81Var = this.f25643a;
        k81 k81Var = this.f25648r;
        setMeasuredDimension(AndroidUtilities.dp(k81Var.f26227r * 2) + h81Var.a(k81Var.f26212c) + k81Var.F, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z4) {
        if (this.f25646f == z4) {
            return;
        }
        this.f25646f = z4;
        invalidate();
    }
}
