package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class v3 extends View {
    public final int f30629a;
    public final int f30630b;

    public v3(Context context, int i7, int i10) {
        super(context);
        this.f30629a = i10;
        this.f30630b = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f30629a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30630b), 1073741824));
                return;
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f30630b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f30630b, 1073741824));
                return;
        }
    }

    public v3(Context context, int i7) {
        super(context);
        this.f30629a = 0;
        this.f30630b = i7;
    }
}
