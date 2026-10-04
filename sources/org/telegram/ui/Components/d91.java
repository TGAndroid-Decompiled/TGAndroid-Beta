package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class d91 extends View {
    public c91 f25666a;
    public int f25667b;
    public final RectF f25668c;
    public CharSequence d;
    public e11 f25669e;
    public boolean f25670f;
    public rp0 h;
    public final e6 f25671n;
    public final f91 f25672r;

    public d91(f91 f91Var, Context context) {
        super(context);
        this.f25672r = f91Var;
        this.f25668c = new RectF();
        this.f25671n = new e6(this, 360L, tr.h);
    }

    @Override
    public int getId() {
        return this.f25666a.f25276a;
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
        c91 c91Var = this.f25666a;
        if (c91Var != null && (i10 = this.f25672r.G) != -1 && c91Var.f25276a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c91 c91Var = this.f25666a;
        f91 f91Var = this.f25672r;
        setMeasuredDimension(AndroidUtilities.dp(f91Var.f26414r * 2) + c91Var.a(f91Var.f26396c) + f91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f25670f == z10) {
            return;
        }
        this.f25670f = z10;
        invalidate();
    }
}
