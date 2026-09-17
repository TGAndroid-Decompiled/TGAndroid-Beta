package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class g81 extends View {
    public f81 f24117a;
    public int f24118b;
    public final RectF f24119c;
    public CharSequence d;
    public h01 e;
    public boolean f24120f;
    public zo0 h;
    public final c6 f24121n;
    public final i81 f24122r;

    public g81(i81 i81Var, Context context) {
        super(context);
        this.f24122r = i81Var;
        this.f24119c = new RectF();
        this.f24121n = new c6(this, 360L, qr.h);
    }

    @Override
    public int getId() {
        return this.f24117a.f23821a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        f81 f81Var = this.f24117a;
        if (f81Var != null && (i10 = this.f24122r.G) != -1 && f81Var.f23821a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        f81 f81Var = this.f24117a;
        i81 i81Var = this.f24122r;
        setMeasuredDimension(AndroidUtilities.dp(i81Var.f24891r * 2) + f81Var.a(i81Var.f24874c) + i81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f24120f == z10) {
            return;
        }
        this.f24120f = z10;
        invalidate();
    }
}
