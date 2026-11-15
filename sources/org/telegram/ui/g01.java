package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class g01 extends View {
    public final int f47255a;
    public final Integer f47256b;

    public g01(Context context, Integer num, int i7) {
        super(context);
        this.f47255a = i7;
        this.f47256b = num;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f47255a) {
            case 0:
                super.onMeasure(i7, i10);
                Integer num = this.f47256b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                Integer num2 = this.f47256b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
