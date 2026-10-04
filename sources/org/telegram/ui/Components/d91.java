package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class d91 extends View {
    public c91 f25672a;
    public int f25673b;
    public final RectF f25674c;
    public CharSequence d;
    public e11 f25675e;
    public boolean f25676f;
    public rp0 h;
    public final e6 f25677n;
    public final f91 f25678r;

    public d91(f91 f91Var, Context context) {
        super(context);
        this.f25678r = f91Var;
        this.f25674c = new RectF();
        this.f25677n = new e6(this, 360L, tr.h);
    }

    @Override
    public int getId() {
        return this.f25672a.f25282a;
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
        c91 c91Var = this.f25672a;
        if (c91Var != null && (i10 = this.f25678r.G) != -1 && c91Var.f25282a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c91 c91Var = this.f25672a;
        f91 f91Var = this.f25678r;
        setMeasuredDimension(AndroidUtilities.dp(f91Var.f26420r * 2) + c91Var.a(f91Var.f26402c) + f91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f25676f == z10) {
            return;
        }
        this.f25676f = z10;
        invalidate();
    }
}
