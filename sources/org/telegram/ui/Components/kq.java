package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public final class kq extends View {

    public final jq f30167a;

    public kq(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setVisibility(8);
        jq jqVar = new jq(this, true, c6Var);
        this.f30167a = jqVar;
        jqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        jq jqVar = this.f30167a;
        float f10 = jqVar.f29784l;
        if (f10 == 1.0f || !((i10 = jqVar.f29777c) == 0 || i10 == 1)) {
            return jqVar.h == 0 ? 0.0f : 1.0f;
        }
        return i10 == 0 ? f10 : 1.0f - f10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f30167a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f30167a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f30167a.f29797z = i10;
    }

    public void setReverse(boolean z10) {
        this.f30167a.D = z10;
    }
}
