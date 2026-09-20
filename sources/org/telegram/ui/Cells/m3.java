package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class m3 extends FrameLayout {
    public int f20645a;

    public m3(Context context) {
        this(context, 8);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f20645a, 1073741824));
    }

    public void setHeight(int i10) {
        if (this.f20645a != i10) {
            this.f20645a = i10;
            requestLayout();
        }
    }

    public m3(Context context, int i10) {
        super(context);
        this.f20645a = i10;
    }
}
