package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class d61 extends View {
    public final int f31846a;
    public final Integer f31847b;

    public d61(Context context, Integer num, int i10) {
        super(context);
        this.f31846a = i10;
        this.f31847b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f31846a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f31847b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f31847b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
