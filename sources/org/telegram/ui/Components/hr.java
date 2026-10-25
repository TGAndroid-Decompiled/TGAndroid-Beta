package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class hr extends View {
    public final gr f29038a;

    public hr(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        setVisibility(8);
        gr grVar = new gr(this, true, u6Var);
        this.f29038a = grVar;
        grVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        gr grVar = this.f29038a;
        float f7 = grVar.f28689l;
        if (f7 != 1.0f && ((i10 = grVar.f28683c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (grVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f29038a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29038a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f29038a.f28702z = i10;
    }

    public void setReverse(boolean z10) {
        this.f29038a.D = z10;
    }
}
