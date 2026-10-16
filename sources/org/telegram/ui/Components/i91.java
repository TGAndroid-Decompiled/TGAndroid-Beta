package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class i91 extends View {
    public h91 f25606a;
    public int f25607b;
    public final RectF f25608c;
    public CharSequence d;
    public i11 e;
    public boolean f25609f;
    public zp0 h;
    public final g6 f25610n;
    public final k91 f25611r;

    public i91(k91 k91Var, Context context) {
        super(context);
        this.f25611r = k91Var;
        this.f25608c = new RectF();
        this.f25610n = new g6(this, 360L, es.h);
    }

    @Override
    public int getId() {
        return this.f25606a.f25223a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h91 h91Var = this.f25606a;
        if (h91Var != null && (i10 = this.f25611r.G) != -1 && h91Var.f25223a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        h91 h91Var = this.f25606a;
        k91 k91Var = this.f25611r;
        setMeasuredDimension(AndroidUtilities.dp(k91Var.f26326r * 2) + h91Var.a(k91Var.f26309c) + k91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f25609f == z10) {
            return;
        }
        this.f25609f = z10;
        invalidate();
    }
}
