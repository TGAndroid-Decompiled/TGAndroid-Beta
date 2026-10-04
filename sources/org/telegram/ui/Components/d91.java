package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class d91 extends View {
    public c91 f25667a;
    public int f25668b;
    public final RectF f25669c;
    public CharSequence d;
    public e11 f25670e;
    public boolean f25671f;
    public rp0 h;
    public final e6 f25672n;
    public final f91 f25673r;

    public d91(f91 f91Var, Context context) {
        super(context);
        this.f25673r = f91Var;
        this.f25669c = new RectF();
        this.f25672n = new e6(this, 360L, tr.h);
    }

    @Override
    public int getId() {
        return this.f25667a.f25277a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c91 c91Var = this.f25667a;
        if (c91Var != null && (i10 = this.f25673r.G) != -1 && c91Var.f25277a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c91 c91Var = this.f25667a;
        f91 f91Var = this.f25673r;
        setMeasuredDimension(AndroidUtilities.dp(f91Var.f26415r * 2) + c91Var.a(f91Var.f26397c) + f91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f25671f == z10) {
            return;
        }
        this.f25671f = z10;
        invalidate();
    }
}
