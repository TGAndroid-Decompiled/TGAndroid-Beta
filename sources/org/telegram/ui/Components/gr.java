package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class gr extends View {
    public final fr f26654a;

    public gr(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setVisibility(8);
        fr frVar = new fr(this, true, d6Var);
        this.f26654a = frVar;
        frVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        fr frVar = this.f26654a;
        float f7 = frVar.f26351l;
        if (f7 != 1.0f && ((i10 = frVar.f26345c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (frVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f26654a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f26654a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f26654a.f26364z = i10;
    }

    public void setReverse(boolean z10) {
        this.f26654a.D = z10;
    }
}
