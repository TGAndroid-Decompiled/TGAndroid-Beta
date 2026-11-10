package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class m01 extends View {
    public final int f47768a;
    public final Integer f47769b;

    public m01(Context context, Integer num, int i7) {
        super(context);
        this.f47768a = i7;
        this.f47769b = num;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f47768a) {
            case 0:
                super.onMeasure(i7, i10);
                Integer num = this.f47769b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                Integer num2 = this.f47769b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
