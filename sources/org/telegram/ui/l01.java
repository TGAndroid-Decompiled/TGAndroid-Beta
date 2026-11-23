package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class l01 extends View {
    public final int f49445a;
    public final Integer f49446b;

    public l01(Context context, Integer num, int i7) {
        super(context);
        this.f49445a = i7;
        this.f49446b = num;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f49445a) {
            case 0:
                super.onMeasure(i7, i10);
                Integer num = this.f49446b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                Integer num2 = this.f49446b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
