package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
public final class w3 extends View {
    public final int f32323a;
    public final int f32324b;

    public w3(Context context, int i7, int i10) {
        super(context);
        this.f32323a = i10;
        this.f32324b = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f32323a) {
            case 0:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f32324b), 1073741824));
                return;
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.f32324b), 1073741824));
                return;
            default:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32324b, 1073741824));
                return;
        }
    }

    public w3(Context context, int i7) {
        super(context);
        this.f32323a = 0;
        this.f32324b = i7;
    }
}
