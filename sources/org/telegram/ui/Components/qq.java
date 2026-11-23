package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class qq extends View {
    public final pq f38979a;

    public qq(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setVisibility(8);
        pq pqVar = new pq(this, true, i6Var);
        this.f38979a = pqVar;
        pqVar.G = true;
    }

    public float getEnterProgress() {
        int i7;
        pq pqVar = this.f38979a;
        float f10 = pqVar.f38550l;
        if (f10 != 1.0f && ((i7 = pqVar.f38543c) == 0 || i7 == 1)) {
            if (i7 == 0) {
                return f10;
            }
            return 1.0f - f10;
        } else if (pqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f38979a.a(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f38979a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i7) {
        this.f38979a.f38563z = i7;
    }

    public void setReverse(boolean z10) {
        this.f38979a.D = z10;
    }
}
