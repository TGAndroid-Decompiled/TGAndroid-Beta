package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class wq extends View {
    public final vq f32815a;

    public wq(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setVisibility(8);
        vq vqVar = new vq(this, true, g6Var);
        this.f32815a = vqVar;
        vqVar.G = true;
    }

    public float getEnterProgress() {
        int i10;
        vq vqVar = this.f32815a;
        float f10 = vqVar.f32516l;
        if (f10 != 1.0f && ((i10 = vqVar.f32509c) == 0 || i10 == 1)) {
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
        this.f32815a.a(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f32815a.d(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setGravity(int i10) {
        this.f32815a.f32529z = i10;
    }

    public void setReverse(boolean z4) {
        this.f32815a.D = z4;
    }
}
