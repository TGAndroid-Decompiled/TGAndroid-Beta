package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class a61 extends View {
    public final int f31726a;
    public final Integer f31727b;

    public a61(Context context, Integer num, int i10) {
        super(context);
        this.f31726a = i10;
        this.f31727b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f31726a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f31727b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f31727b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
