package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class qq extends View {
    public final pq f32029a;

    public qq(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setVisibility(8);
        pq pqVar = new pq(this, true, c6Var);
        this.f32029a = pqVar;
        pqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        pq pqVar = this.f32029a;
        float f9 = pqVar.f31740l;
        if (f9 != 1.0f && ((i10 = pqVar.f31733c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f9;
            }
            return 1.0f - f9;
        } else if (pqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f32029a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32029a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f32029a.f31753z = i10;
    }

    public void setReverse(boolean z10) {
        this.f32029a.D = z10;
    }
}
