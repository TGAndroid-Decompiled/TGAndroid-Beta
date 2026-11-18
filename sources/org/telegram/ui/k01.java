package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class k01 extends View {
    public final int f49146a;
    public final Integer f49147b;

    public k01(Context context, Integer num, int i7) {
        super(context);
        this.f49146a = i7;
        this.f49147b = num;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f49146a) {
            case 0:
                super.onMeasure(i7, i10);
                Integer num = this.f49147b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                Integer num2 = this.f49147b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
