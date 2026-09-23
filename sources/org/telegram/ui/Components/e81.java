package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class e81 extends View {
    public d81 f23599a;
    public int f23600b;
    public final RectF f23601c;
    public CharSequence d;
    public f01 e;
    public boolean f23602f;
    public yo0 h;
    public final e6 f23603n;
    public final g81 f23604r;

    public e81(g81 g81Var, Context context) {
        super(context);
        this.f23604r = g81Var;
        this.f23601c = new RectF();
        this.f23603n = new e6(this, 360L, rr.h);
    }

    @Override
    public int getId() {
        return this.f23599a.f23322a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d81 d81Var = this.f23599a;
        if (d81Var != null && (i10 = this.f23604r.G) != -1 && d81Var.f23322a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d81 d81Var = this.f23599a;
        g81 g81Var = this.f23604r;
        setMeasuredDimension(AndroidUtilities.dp(g81Var.f24229r * 2) + d81Var.a(g81Var.f24212c) + g81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f23602f == z10) {
            return;
        }
        this.f23602f = z10;
        invalidate();
    }
}
