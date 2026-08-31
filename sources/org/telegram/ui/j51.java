package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j51 extends View {
    public final int f38018a;
    public final Integer f38019b;

    public j51(Context context, Integer num, int i10) {
        super(context);
        this.f38018a = i10;
        this.f38019b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f38018a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f38019b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f38019b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
