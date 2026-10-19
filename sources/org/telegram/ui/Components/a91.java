package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class a91 extends View {
    public z81 f24526a;
    public int f24527b;
    public final RectF f24528c;
    public CharSequence d;
    public e11 e;
    public boolean f24529f;
    public up0 h;
    public final f6 f24530n;
    public final c91 f24531r;

    public a91(c91 c91Var, Context context) {
        super(context);
        this.f24531r = c91Var;
        this.f24528c = new RectF();
        this.f24530n = new f6(this, 360L, bs.h);
    }

    @Override
    public int getId() {
        return this.f24526a.f32888a;
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
        z81 z81Var = this.f24526a;
        if (z81Var != null && (i10 = this.f24531r.G) != -1 && z81Var.f32888a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        z81 z81Var = this.f24526a;
        c91 c91Var = this.f24531r;
        setMeasuredDimension(AndroidUtilities.dp(c91Var.f25148r * 2) + z81Var.a(c91Var.f25131c) + c91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f24529f == z10) {
            return;
        }
        this.f24529f = z10;
        invalidate();
    }
}
