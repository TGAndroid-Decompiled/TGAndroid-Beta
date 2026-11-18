package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class rq extends View {
    public final qq f39274a;

    public rq(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setVisibility(8);
        qq qqVar = new qq(this, true, i6Var);
        this.f39274a = qqVar;
        qqVar.G = true;
    }

    public float getEnterProgress() {
        int i7;
        qq qqVar = this.f39274a;
        float f10 = qqVar.f38872l;
        if (f10 != 1.0f && ((i7 = qqVar.f38865c) == 0 || i7 == 1)) {
            if (i7 == 0) {
                return f10;
            }
            return 1.0f - f10;
        } else if (qqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f39274a.a(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f39274a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i7) {
        this.f39274a.f38885z = i7;
    }

    public void setReverse(boolean z10) {
        this.f39274a.D = z10;
    }
}
