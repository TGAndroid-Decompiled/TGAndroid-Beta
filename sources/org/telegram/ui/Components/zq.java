package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class zq extends View {
    public final yq f31050a;

    public zq(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setVisibility(8);
        yq yqVar = new yq(this, true, d6Var);
        this.f31050a = yqVar;
        yqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        yq yqVar = this.f31050a;
        float f7 = yqVar.f30783l;
        if (f7 != 1.0f && ((i10 = yqVar.f30777c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (yqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f31050a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31050a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f31050a.f30796z = i10;
    }

    public void setReverse(boolean z10) {
        this.f31050a.D = z10;
    }
}
