package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class dq extends View {
    public final cq f33180a;

    public dq(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setVisibility(8);
        cq cqVar = new cq(this, true, e6Var);
        this.f33180a = cqVar;
        cqVar.G = true;
    }

    public float getEnterProgress() {
        int i3;
        cq cqVar = this.f33180a;
        float f10 = cqVar.f32805l;
        if (f10 != 1.0f && ((i3 = cqVar.f32798c) == 0 || i3 == 1)) {
            if (i3 == 0) {
                return f10;
            }
            return 1.0f - f10;
        } else if (cqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f33180a.a(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        this.f33180a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i3) {
        this.f33180a.f32818z = i3;
    }

    public void setReverse(boolean z10) {
        this.f33180a.D = z10;
    }
}
