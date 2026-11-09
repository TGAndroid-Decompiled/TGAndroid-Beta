package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class cq extends View {
    public final bq f32743a;

    public cq(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setVisibility(8);
        bq bqVar = new bq(this, true, g6Var);
        this.f32743a = bqVar;
        bqVar.G = true;
    }

    public float getEnterProgress() {
        int i7;
        bq bqVar = this.f32743a;
        float f10 = bqVar.f32371l;
        if (f10 != 1.0f && ((i7 = bqVar.f32364c) == 0 || i7 == 1)) {
            if (i7 == 0) {
                return f10;
            }
            return 1.0f - f10;
        } else if (bqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f32743a.a(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f32743a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i7) {
        this.f32743a.f32384z = i7;
    }

    public void setReverse(boolean z9) {
        this.f32743a.D = z9;
    }
}
