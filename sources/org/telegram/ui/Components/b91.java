package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class b91 extends View {
    public a91 f24833a;
    public int f24834b;
    public final RectF f24835c;
    public CharSequence d;
    public f11 e;
    public boolean f24836f;
    public vp0 h;
    public final f6 f24837n;
    public final d91 f24838r;

    public b91(d91 d91Var, Context context) {
        super(context);
        this.f24838r = d91Var;
        this.f24835c = new RectF();
        this.f24837n = new f6(this, 360L, bs.h);
    }

    @Override
    public int getId() {
        return this.f24833a.f24555a;
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
        a91 a91Var = this.f24833a;
        if (a91Var != null && (i10 = this.f24838r.G) != -1 && a91Var.f24555a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        a91 a91Var = this.f24833a;
        d91 d91Var = this.f24838r;
        setMeasuredDimension(AndroidUtilities.dp(d91Var.f25412r * 2) + a91Var.a(d91Var.f25395c) + d91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f24836f == z10) {
            return;
        }
        this.f24836f = z10;
        invalidate();
    }
}
