package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class f61 extends View {
    public final int f37655a;
    public final Integer f37656b;

    public f61(Context context, Integer num, int i10) {
        super(context);
        this.f37655a = i10;
        this.f37656b = num;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f37655a) {
            case 0:
                super.onMeasure(i10, i11);
                Integer num = this.f37656b;
                if (num != null) {
                    setPivotX(num.intValue());
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                Integer num2 = this.f37656b;
                if (num2 != null) {
                    setPivotX(num2.intValue());
                    return;
                }
                return;
        }
    }
}
