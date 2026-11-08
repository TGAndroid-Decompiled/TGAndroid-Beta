package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class j01 extends View {
    public final int f46808a;
    public final Integer f46809b;

    public j01(Context context, Integer num, int i7) {
        super(context);
        this.f46808a = i7;
        this.f46809b = num;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f46808a) {
            case 0:
                super.onMeasure(i7, i10);
                Integer num = this.f46809b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                Integer num2 = this.f46809b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
