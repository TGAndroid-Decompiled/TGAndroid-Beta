package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class p41 extends View {
    public final int f40065a;
    public final Integer f40066b;

    public p41(Context context, Integer num, int i10) {
        super(context);
        this.f40065a = i10;
        this.f40066b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f40065a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f40066b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f40066b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
