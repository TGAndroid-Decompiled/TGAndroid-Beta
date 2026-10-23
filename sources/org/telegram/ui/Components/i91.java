package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class i91 extends View {
    public h91 f27251a;
    public int f27252b;
    public final RectF f27253c;
    public CharSequence d;
    public i11 e;
    public boolean f27254f;
    public zp0 h;
    public final f6 f27255n;
    public final k91 f27256r;

    public i91(k91 k91Var, Context context) {
        super(context);
        this.f27256r = k91Var;
        this.f27253c = new RectF();
        this.f27255n = new f6(this, 360L, bs.h);
    }

    @Override
    public int getId() {
        return this.f27251a.f26867a;
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
        h91 h91Var = this.f27251a;
        if (h91Var != null && (i10 = this.f27256r.G) != -1 && h91Var.f26867a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        h91 h91Var = this.f27251a;
        k91 k91Var = this.f27256r;
        setMeasuredDimension(AndroidUtilities.dp(k91Var.f27981r * 2) + h91Var.a(k91Var.f27964c) + k91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f27254f == z10) {
            return;
        }
        this.f27254f = z10;
        invalidate();
    }
}
