package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class wq extends View {
    public final vq f29769a;

    public wq(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setVisibility(8);
        vq vqVar = new vq(this, true, e6Var);
        this.f29769a = vqVar;
        vqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        vq vqVar = this.f29769a;
        float f7 = vqVar.f29401l;
        if (f7 != 1.0f && ((i10 = vqVar.f29395c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f7;
            }
            return 1.0f - f7;
        } else if (vqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f29769a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f29769a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f29769a.f29414z = i10;
    }

    public void setReverse(boolean z10) {
        this.f29769a.D = z10;
    }
}
