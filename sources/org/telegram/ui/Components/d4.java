package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
public final class d4 extends LinearLayout {
    public final int f32929a;
    public boolean f32930b;
    public final cb0 f32931c;

    public d4(Context context, cb0 cb0Var, int i3) {
        super(context);
        this.f32929a = i3;
        this.f32931c = cb0Var;
        this.f32930b = false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        switch (this.f32929a) {
            case 0:
                c4 c4Var = (c4) this.f32931c;
                this.f32930b = true;
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                c4Var.setItemCount(i11);
                c4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.f32930b = false;
                super.onMeasure(i3, i10);
                return;
            case 1:
                h4 h4Var = (h4) this.f32931c;
                this.f32930b = true;
                Point point2 = org.telegram.messenger.g0.f22608q;
                if (point2.x > point2.y) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                h4Var.setItemCount(i12);
                h4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.f32930b = false;
                super.onMeasure(i3, i10);
                return;
            default:
                this.f32930b = true;
                this.f32931c.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * 8;
                this.f32930b = false;
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.f32929a) {
            case 0:
                if (!this.f32930b) {
                    super.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!this.f32930b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.f32930b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }
}
