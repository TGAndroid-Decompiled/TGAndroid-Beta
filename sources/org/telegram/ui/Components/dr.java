package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class dr extends View {
    public final cr f25811a;

    public dr(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setVisibility(8);
        cr crVar = new cr(this, true, g6Var);
        this.f25811a = crVar;
        crVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        cr crVar = this.f25811a;
        float f7 = crVar.f25445l;
        if (f7 != 1.0f && ((i10 = crVar.f25439c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (crVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f25811a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f25811a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f25811a.f25458z = i10;
    }

    public void setReverse(boolean z10) {
        this.f25811a.D = z10;
    }
}
