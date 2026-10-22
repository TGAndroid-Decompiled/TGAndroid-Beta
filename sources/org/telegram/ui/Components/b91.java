package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class b91 extends View {
    public a91 f24836a;
    public int f24837b;
    public final RectF f24838c;
    public CharSequence d;
    public f11 e;
    public boolean f24839f;
    public vp0 h;
    public final f6 f24840n;
    public final d91 f24841r;

    public b91(d91 d91Var, Context context) {
        super(context);
        this.f24841r = d91Var;
        this.f24838c = new RectF();
        this.f24840n = new f6(this, 360L, bs.h);
    }

    @Override
    public int getId() {
        return this.f24836a.f24558a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a91 a91Var = this.f24836a;
        if (a91Var != null && (i10 = this.f24841r.G) != -1 && a91Var.f24558a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        a91 a91Var = this.f24836a;
        d91 d91Var = this.f24841r;
        setMeasuredDimension(AndroidUtilities.dp(d91Var.f25415r * 2) + a91Var.a(d91Var.f25398c) + d91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f24839f == z10) {
            return;
        }
        this.f24839f = z10;
        invalidate();
    }
}
