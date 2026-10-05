package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class zq extends View {
    public final yq f33626a;

    public zq(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setVisibility(8);
        yq yqVar = new yq(this, true, d6Var);
        this.f33626a = yqVar;
        yqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        yq yqVar = this.f33626a;
        float f7 = yqVar.f33320l;
        if (f7 != 1.0f && ((i10 = yqVar.f33313c) == 0 || i10 == 1)) {
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
        this.f33626a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f33626a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f33626a.f33333z = i10;
    }

    public void setReverse(boolean z10) {
        this.f33626a.D = z10;
    }
}
