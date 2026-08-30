package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class h51 extends View {
    public final int f34764a;
    public final Integer f34765b;

    public h51(Context context, Integer num, int i10) {
        super(context);
        this.f34764a = i10;
        this.f34765b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f34764a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f34765b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f34765b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
