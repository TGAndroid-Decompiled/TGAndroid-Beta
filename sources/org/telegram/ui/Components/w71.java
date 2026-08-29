package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class w71 extends View {
    public v71 f34343a;
    public int f34344b;
    public final RectF f34345c;
    public CharSequence d;
    public zz0 f34346e;
    public boolean f34347f;
    public so0 h;
    public final d6 f34348n;
    public final y71 f34349r;

    public w71(y71 y71Var, Context context) {
        super(context);
        this.f34349r = y71Var;
        this.f34345c = new RectF();
        this.f34348n = new d6(this, 360L, jr.h);
    }

    @Override
    public int getId() {
        return this.f34343a.f33488a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w71.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        v71 v71Var = this.f34343a;
        if (v71Var != null && (i10 = this.f34349r.C) != -1 && v71Var.f33488a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        v71 v71Var = this.f34343a;
        y71 y71Var = this.f34349r;
        setMeasuredDimension(AndroidUtilities.dp(y71Var.f34959r * 2) + v71Var.a(y71Var.f34944c) + y71Var.E, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f34347f == z10) {
            return;
        }
        this.f34347f = z10;
        invalidate();
    }
}
