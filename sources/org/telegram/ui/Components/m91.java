package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
public final class m91 extends View {
    public l91 f28808a;
    public int f28809b;
    public final RectF f28810c;
    public CharSequence d;
    public m11 f28811e;
    public boolean f28812f;
    public eq0 h;
    public final g6 f28813n;
    public final o91 f28814r;

    public m91(o91 o91Var, Context context) {
        super(context);
        this.f28814r = o91Var;
        this.f28810c = new RectF();
        this.f28813n = new g6(this, 360L, is.h);
    }

    @Override
    public int getId() {
        return this.f28808a.f28314a;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        l91 l91Var = this.f28808a;
        if (l91Var != null && (i10 = this.f28814r.G) != -1 && l91Var.f28314a == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setSelected(z10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        l91 l91Var = this.f28808a;
        o91 o91Var = this.f28814r;
        setMeasuredDimension(AndroidUtilities.dp(o91Var.f29452r * 2) + l91Var.a(o91Var.f29434c) + o91Var.I, View.MeasureSpec.getSize(i11));
    }

    public void setReordering(boolean z10) {
        if (this.f28812f == z10) {
            return;
        }
        this.f28812f = z10;
        invalidate();
    }
}
