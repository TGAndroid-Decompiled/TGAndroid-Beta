package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class m3 extends FrameLayout {
    public int f29547a;

    public m3(Context context) {
        this(context, 8);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f29547a, 1073741824));
    }

    public void setHeight(int i7) {
        if (this.f29547a != i7) {
            this.f29547a = i7;
            requestLayout();
        }
    }

    public m3(Context context, int i7) {
        super(context);
        this.f29547a = i7;
    }
}
