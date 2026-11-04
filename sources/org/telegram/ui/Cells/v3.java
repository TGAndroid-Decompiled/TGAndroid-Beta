package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class v3 extends View {
    public final int f30719a;
    public final int f30720b;

    public v3(Context context, int i3, int i10) {
        super(context);
        this.f30719a = i10;
        this.f30720b = i3;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.f30719a) {
            case 0:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30720b), 1073741824));
                return;
            case 1:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30720b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f30720b, 1073741824));
                return;
        }
    }

    public v3(Context context, int i3) {
        super(context);
        this.f30719a = 0;
        this.f30720b = i3;
    }
}
