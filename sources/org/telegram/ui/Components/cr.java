package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class cr extends View {
    public final br f22215a;

    public cr(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setVisibility(8);
        br brVar = new br(this, true, f6Var);
        this.f22215a = brVar;
        brVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        br brVar = this.f22215a;
        float f7 = brVar.f21877l;
        if (f7 != 1.0f && ((i10 = brVar.f21871c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (brVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f22215a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f22215a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f22215a.f21890z = i10;
    }

    public void setReverse(boolean z10) {
        this.f22215a.D = z10;
    }
}
