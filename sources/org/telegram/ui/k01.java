package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k01 extends View {
    public final int f49123a;
    public final Integer f49124b;

    public k01(Context context, Integer num, int i7) {
        super(context);
        this.f49123a = i7;
        this.f49124b = num;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f49123a) {
            case 0:
                super.onMeasure(i7, i10);
                Integer num = this.f49124b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                Integer num2 = this.f49124b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
