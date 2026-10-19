package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class a91 extends View {
    public z81 f24524a;
    public int f24525b;
    public final RectF f24526c;
    public CharSequence d;
    public e11 e;
    public boolean f24527f;
    public up0 h;
    public final f6 f24528n;
    public final c91 f24529r;

    public a91(c91 c91Var, Context context) {
        super(context);
        this.f24529r = c91Var;
        this.f24526c = new RectF();
        this.f24528n = new f6(this, 360L, bs.h);
    }

    @Override
    public int getId() {
        return this.f24524a.f32886a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z81 z81Var = this.f24524a;
        if (z81Var != null && (i10 = this.f24529r.G) != -1 && z81Var.f32886a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        z81 z81Var = this.f24524a;
        c91 c91Var = this.f24529r;
        setMeasuredDimension(AndroidUtilities.dp(c91Var.f25146r * 2) + z81Var.a(c91Var.f25129c) + c91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f24527f == z10) {
            return;
        }
        this.f24527f = z10;
        invalidate();
    }
}
