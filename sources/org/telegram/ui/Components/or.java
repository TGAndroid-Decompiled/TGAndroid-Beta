package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class or extends View {
    public final nr f29272a;

    public or(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setVisibility(8);
        nr nrVar = new nr(this, true, c6Var);
        this.f29272a = nrVar;
        nrVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        nr nrVar = this.f29272a;
        float f7 = nrVar.f28934l;
        if (f7 != 1.0f && ((i10 = nrVar.f28927c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (nrVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f29272a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29272a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f29272a.f28947z = i10;
    }

    public void setReverse(boolean z10) {
        this.f29272a.D = z10;
    }
}
