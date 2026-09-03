package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class o51 extends View {
    public final int f39542a;
    public final Integer f39543b;

    public o51(Context context, Integer num, int i10) {
        super(context);
        this.f39542a = i10;
        this.f39543b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f39542a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f39543b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f39543b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
