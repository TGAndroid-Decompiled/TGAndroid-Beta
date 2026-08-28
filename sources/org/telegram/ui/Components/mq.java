package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class mq extends View {
    public final lq f30905a;

    public mq(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        setVisibility(8);
        lq lqVar = new lq(this, true, b6Var);
        this.f30905a = lqVar;
        lqVar.G = true;
    }

    public float getEnterProgress() {
        int i9;
        lq lqVar = this.f30905a;
        float f10 = lqVar.f30523l;
        if (f10 != 1.0f && ((i9 = lqVar.f30516c) == 0 || i9 == 1)) {
            if (i9 == 0) {
                return f10;
            }
            return 1.0f - f10;
        } else if (lqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f30905a.a(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.f30905a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i9) {
        this.f30905a.f30536z = i9;
    }

    public void setReverse(boolean z10) {
        this.f30905a.D = z10;
    }
}
