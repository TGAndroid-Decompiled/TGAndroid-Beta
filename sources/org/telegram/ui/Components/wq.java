package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class wq extends View {
    public final vq f32837a;

    public wq(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setVisibility(8);
        vq vqVar = new vq(this, true, g6Var);
        this.f32837a = vqVar;
        vqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        vq vqVar = this.f32837a;
        float f10 = vqVar.f32513l;
        if (f10 != 1.0f && ((i10 = vqVar.f32506c) == 0 || i10 == 1)) {
            if (i10 == 0) {
                return f10;
            }
            return 1.0f - f10;
        } else if (vqVar.h != 0) {
            return 1.0f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f32837a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32837a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f32837a.f32526z = i10;
    }

    public void setReverse(boolean z4) {
        this.f32837a.D = z4;
    }
}
