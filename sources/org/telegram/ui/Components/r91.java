package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class r91 extends View {
    public q91 f32180a;
    public int f32181b;
    public final RectF f32182c;
    public CharSequence d;
    public q11 e;
    public boolean f32183f;
    public eq0 h;
    public final h6 f32184n;
    public final t91 f32185r;

    public r91(t91 t91Var, Context context) {
        super(context);
        this.f32185r = t91Var;
        this.f32182c = new RectF();
        this.f32184n = new h6(this, 360L, ds.h);
    }

    @Override
    public int getId() {
        return this.f32180a.f31864a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q91 q91Var = this.f32180a;
        if (q91Var != null && (i10 = this.f32185r.G) != -1 && q91Var.f31864a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        q91 q91Var = this.f32180a;
        t91 t91Var = this.f32185r;
        setMeasuredDimension(AndroidUtilities.dp(t91Var.f32943r * 2) + q91Var.a(t91Var.f32926c) + t91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f32183f == z10) {
            return;
        }
        this.f32183f = z10;
        invalidate();
    }
}
