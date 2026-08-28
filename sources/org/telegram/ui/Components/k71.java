package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class k71 extends View {
    public j71 f30022a;
    public int f30023b;
    public final RectF f30024c;
    public CharSequence d;
    public nz0 f30025e;
    public boolean f30026f;
    public ho0 h;
    public final y5 f30027n;
    public final m71 f30028r;

    public k71(m71 m71Var, Context context) {
        super(context);
        this.f30028r = m71Var;
        this.f30024c = new RectF();
        this.f30027n = new y5(this, 360L, gr.h);
    }

    @Override
    public int getId() {
        return this.f30022a.f29664a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k71.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j71 j71Var = this.f30022a;
        if (j71Var != null && (i9 = this.f30028r.C) != -1 && j71Var.f29664a == i9) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        j71 j71Var = this.f30022a;
        m71 m71Var = this.f30028r;
        setMeasuredDimension(AndroidUtilities.dp(m71Var.f30755r * 2) + j71Var.a(m71Var.f30740c) + m71Var.E, View.MeasureSpec.getSize(i10));
    }

    public void setReordering(boolean z10) {
        if (this.f30026f == z10) {
            return;
        }
        this.f30026f = z10;
        invalidate();
    }
}
