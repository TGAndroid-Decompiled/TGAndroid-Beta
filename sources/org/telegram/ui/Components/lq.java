package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class lq extends View {
    public final kq f28240a;

    public lq(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        setVisibility(8);
        kq kqVar = new kq(this, true, p6Var);
        this.f28240a = kqVar;
        kqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        kq kqVar = this.f28240a;
        float f7 = kqVar.f27928l;
        if (f7 != 1.0f && ((i10 = kqVar.f27922c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (kqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f28240a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f28240a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f28240a.f27941z = i10;
    }

    public void setReverse(boolean z10) {
        this.f28240a.D = z10;
    }
}
