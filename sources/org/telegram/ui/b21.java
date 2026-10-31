package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class b21 extends View {
    public final int f35963a;
    public final Integer f35964b;

    public b21(Context context, Integer num, int i10) {
        super(context);
        this.f35963a = i10;
        this.f35964b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f35963a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f35964b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f35964b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
