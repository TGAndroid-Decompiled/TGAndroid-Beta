package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class jr extends View {
    public final ir f26123a;

    public jr(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setVisibility(8);
        ir irVar = new ir(this, true, c6Var);
        this.f26123a = irVar;
        irVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        ir irVar = this.f26123a;
        float f7 = irVar.f25725l;
        if (f7 != 1.0f && ((i10 = irVar.f25719c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (irVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f26123a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f26123a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f26123a.f25738z = i10;
    }

    public void setReverse(boolean z10) {
        this.f26123a.D = z10;
    }
}
