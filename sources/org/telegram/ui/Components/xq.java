package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class xq extends View {
    public final wq f30385a;

    public xq(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setVisibility(8);
        wq wqVar = new wq(this, true, d6Var);
        this.f30385a = wqVar;
        wqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        wq wqVar = this.f30385a;
        float f7 = wqVar.f30156l;
        if (f7 != 1.0f && ((i10 = wqVar.f30150c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (wqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f30385a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f30385a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f30385a.f30169z = i10;
    }

    public void setReverse(boolean z10) {
        this.f30385a.D = z10;
    }
}
