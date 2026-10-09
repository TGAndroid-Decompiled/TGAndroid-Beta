package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class mr extends View {
    public final lr f28891a;

    public mr(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setVisibility(8);
        lr lrVar = new lr(this, true, e6Var);
        this.f28891a = lrVar;
        lrVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        lr lrVar = this.f28891a;
        float f7 = lrVar.f28559l;
        if (f7 != 1.0f && ((i10 = lrVar.f28552c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (lrVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f28891a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28891a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f28891a.f28572z = i10;
    }

    public void setReverse(boolean z10) {
        this.f28891a.D = z10;
    }
}
