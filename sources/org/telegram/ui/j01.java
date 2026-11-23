package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j01 extends View {
    public final int f48961a;
    public final Integer f48962b;

    public j01(Context context, Integer num, int i7) {
        super(context);
        this.f48961a = i7;
        this.f48962b = num;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f48961a) {
            case 0:
                super.onMeasure(i7, i10);
                Integer num = this.f48962b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                Integer num2 = this.f48962b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
