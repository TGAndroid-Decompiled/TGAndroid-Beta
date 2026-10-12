package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class h91 extends View {
    public g91 f25578a;
    public int f25579b;
    public final RectF f25580c;
    public CharSequence d;
    public h11 e;
    public boolean f25581f;
    public zp0 h;
    public final g6 f25582n;
    public final j91 f25583r;

    public h91(j91 j91Var, Context context) {
        super(context);
        this.f25583r = j91Var;
        this.f25580c = new RectF();
        this.f25582n = new g6(this, 360L, es.h);
    }

    @Override
    public int getId() {
        return this.f25578a.f25238a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g91 g91Var = this.f25578a;
        if (g91Var != null && (i10 = this.f25583r.G) != -1 && g91Var.f25238a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        g91 g91Var = this.f25578a;
        j91 j91Var = this.f25583r;
        setMeasuredDimension(AndroidUtilities.dp(j91Var.f26294r * 2) + g91Var.a(j91Var.f26277c) + j91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f25581f == z10) {
            return;
        }
        this.f25581f = z10;
        invalidate();
    }
}
