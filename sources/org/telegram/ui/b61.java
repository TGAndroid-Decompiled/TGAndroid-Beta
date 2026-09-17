package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class b61 extends View {
    public final int f34639a;
    public final Integer f34640b;

    public b61(Context context, Integer num, int i10) {
        super(context);
        this.f34639a = i10;
        this.f34640b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f34639a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f34640b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f34640b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
