package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class kq extends View {
    public final jq f36586a;

    public kq(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setVisibility(8);
        jq jqVar = new jq(this, true, e6Var);
        this.f36586a = jqVar;
        jqVar.G = true;
    }

    public float getEnterProgress() {
        int i7;
        jq jqVar = this.f36586a;
        float f10 = jqVar.f36148l;
        if (f10 != 1.0f && ((i7 = jqVar.f36141c) == 0 || i7 == 1)) {
            if (i7 == 0) {
                return f10;
            }
            return 1.0f - f10;
        } else if (jqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f36586a.a(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f36586a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i7) {
        this.f36586a.f36161z = i7;
    }

    public void setReverse(boolean z10) {
        this.f36586a.D = z10;
    }
}
