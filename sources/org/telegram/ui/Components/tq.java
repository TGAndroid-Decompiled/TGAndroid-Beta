package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class tq extends View {
    public final sq f29016a;

    public tq(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setVisibility(8);
        sq sqVar = new sq(this, true, f6Var);
        this.f29016a = sqVar;
        sqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        sq sqVar = this.f29016a;
        float f10 = sqVar.f28783l;
        if (f10 != 1.0f && ((i10 = sqVar.f28777c) == 0 || i10 == 1)) {
            if (i10 == 0) {
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
        this.f29016a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29016a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f29016a.f28796z = i10;
    }

    public void setReverse(boolean z4) {
        this.f29016a.D = z4;
    }
}
