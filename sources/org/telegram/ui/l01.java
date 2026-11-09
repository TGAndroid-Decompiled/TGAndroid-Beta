package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class l01 extends View {
    public final int f47441a;
    public final Integer f47442b;

    public l01(Context context, Integer num, int i7) {
        super(context);
        this.f47441a = i7;
        this.f47442b = num;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f47441a) {
            case 0:
                super.onMeasure(i7, i10);
                Integer num = this.f47442b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                Integer num2 = this.f47442b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
