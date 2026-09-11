package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class b61 extends View {
    public final int f34638a;
    public final Integer f34639b;

    public b61(Context context, Integer num, int i10) {
        super(context);
        this.f34638a = i10;
        this.f34639b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f34638a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f34639b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f34639b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
