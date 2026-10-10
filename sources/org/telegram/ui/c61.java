package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class c61 extends View {
    public final int f36582a;
    public final Integer f36583b;

    public c61(Context context, Integer num, int i10) {
        super(context);
        this.f36582a = i10;
        this.f36583b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f36582a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f36583b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f36583b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
