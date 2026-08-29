package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class i3 extends FrameLayout {
    public int f24475a;

    public i3(Context context) {
        this(context, 8);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24475a, 1073741824));
    }

    public void setHeight(int i10) {
        if (this.f24475a != i10) {
            this.f24475a = i10;
            requestLayout();
        }
    }

    public i3(Context context, int i10) {
        super(context);
        this.f24475a = i10;
    }
}
