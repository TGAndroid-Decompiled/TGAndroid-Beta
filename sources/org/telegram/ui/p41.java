package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class p41 extends View {
    public final int f40056a;
    public final Integer f40057b;

    public p41(Context context, Integer num, int i10) {
        super(context);
        this.f40056a = i10;
        this.f40057b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f40056a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f40057b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f40057b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
