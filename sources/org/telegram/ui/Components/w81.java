package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class w81 extends View {
    public v81 f29973a;
    public int f29974b;
    public final RectF f29975c;
    public CharSequence d;
    public w01 e;
    public boolean f29976f;
    public np0 h;
    public final d6 f29977n;
    public final y81 f29978r;

    public w81(y81 y81Var, Context context) {
        super(context);
        this.f29978r = y81Var;
        this.f29975c = new RectF();
        this.f29977n = new d6(this, 360L, qr.h);
    }

    @Override
    public int getId() {
        return this.f29973a.f29031a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        v81 v81Var = this.f29973a;
        if (v81Var != null && (i10 = this.f29978r.G) != -1 && v81Var.f29031a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        v81 v81Var = this.f29973a;
        y81 y81Var = this.f29978r;
        setMeasuredDimension(AndroidUtilities.dp(y81Var.f30604r * 2) + v81Var.a(y81Var.f30587c) + y81Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f29976f == z10) {
            return;
        }
        this.f29976f = z10;
        invalidate();
    }
}
