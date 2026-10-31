package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class x3 extends View {
    public final int f23569a;
    public final int f23570b;

    public x3(Context context, int i10, int i11) {
        super(context);
        this.f23569a = i11;
        this.f23570b = i10;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f23569a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.f23570b), 1073741824));
                return;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.f23570b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23570b, 1073741824));
                return;
        }
    }

    public x3(Context context, int i10) {
        super(context);
        this.f23569a = 0;
        this.f23570b = i10;
    }
}
