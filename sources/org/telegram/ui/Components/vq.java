package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class vq extends View {
    public final uq f31962a;

    public vq(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setVisibility(8);
        uq uqVar = new uq(this, true, f6Var);
        this.f31962a = uqVar;
        uqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        uq uqVar = this.f31962a;
        float f7 = uqVar.f30944l;
        if (f7 != 1.0f && ((i10 = uqVar.f30937c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (uqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f31962a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f31962a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f31962a.f30957z = i10;
    }

    public void setReverse(boolean z10) {
        this.f31962a.D = z10;
    }
}
