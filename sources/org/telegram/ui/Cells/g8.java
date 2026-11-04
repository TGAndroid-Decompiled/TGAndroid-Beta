package org.telegram.ui.Cells;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class g8 extends LinearLayout {
    public TextView f29275a;
    public boolean f29276b;

    @Override
    public final void onMeasure(int i3, int i10) {
        View view;
        int measuredHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
        if (this.f29276b && (view = (View) getParent()) != null && getMeasuredHeight() < (measuredHeight = ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - org.telegram.messenger.g0.L(24.0f))) {
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f29275a.setOnClickListener(onClickListener);
    }

    public void setIsLast(boolean z10) {
        this.f29276b = z10;
        requestLayout();
    }
}
