package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class l3 extends FrameLayout {
    public int f24647a;

    public l3(Context context) {
        this(context, 8);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24647a, 1073741824));
    }

    public void setHeight(int i9) {
        if (this.f24647a != i9) {
            this.f24647a = i9;
            requestLayout();
        }
    }

    public l3(Context context, int i9) {
        super(context);
        this.f24647a = i9;
    }
}
