package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class m3 extends FrameLayout {
    public int f29627a;

    public m3(Context context) {
        this(context, 8);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f29627a, 1073741824));
    }

    public void setHeight(int i3) {
        if (this.f29627a != i3) {
            this.f29627a = i3;
            requestLayout();
        }
    }

    public m3(Context context, int i3) {
        super(context);
        this.f29627a = i3;
    }
}
