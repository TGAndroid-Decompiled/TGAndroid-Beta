package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class tq extends View {
    public final sq f40023a;

    public tq(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setVisibility(8);
        sq sqVar = new sq(this, true, h6Var);
        this.f40023a = sqVar;
        sqVar.G = true;
    }

    public float getEnterProgress() {
        int i7;
        sq sqVar = this.f40023a;
        float f10 = sqVar.f39668l;
        if (f10 != 1.0f && ((i7 = sqVar.f39661c) == 0 || i7 == 1)) {
            if (i7 == 0) {
                return f10;
            }
            return 1.0f - f10;
        } else if (sqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f40023a.a(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f40023a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i7) {
        this.f40023a.f39681z = i7;
    }

    public void setReverse(boolean z10) {
        this.f40023a.D = z10;
    }
}
