package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class yq extends View {
    public final xq f30687a;

    public yq(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setVisibility(8);
        xq xqVar = new xq(this, true, d6Var);
        this.f30687a = xqVar;
        xqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        xq xqVar = this.f30687a;
        float f7 = xqVar.f30441l;
        if (f7 != 1.0f && ((i10 = xqVar.f30435c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (xqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f30687a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f30687a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f30687a.f30454z = i10;
    }

    public void setReverse(boolean z10) {
        this.f30687a.D = z10;
    }
}
