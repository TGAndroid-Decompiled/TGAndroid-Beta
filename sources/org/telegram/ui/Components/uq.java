package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class uq extends View {
    public final tq f29272a;

    public uq(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setVisibility(8);
        tq tqVar = new tq(this, true, f6Var);
        this.f29272a = tqVar;
        tqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        tq tqVar = this.f29272a;
        float f10 = tqVar.f29011l;
        if (f10 != 1.0f && ((i10 = tqVar.f29005c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f10;
            }
            return 1.0f - f10;
        } else if (tqVar.h != 0) {
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
        this.f29272a.f29024z = i10;
    }

    public void setReverse(boolean z4) {
        this.f29272a.D = z4;
    }
}
