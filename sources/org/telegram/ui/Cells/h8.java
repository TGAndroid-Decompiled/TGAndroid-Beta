package org.telegram.ui.Cells;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class h8 extends LinearLayout {
    public TextView f29299a;
    public boolean f29300b;

    @Override
    public final void onMeasure(int i7, int i10) {
        View view;
        int measuredHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
        if (this.f29300b && (view = (View) getParent()) != null && getMeasuredHeight() < (measuredHeight = ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - org.telegram.messenger.g0.L(24.0f))) {
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f29299a.setOnClickListener(onClickListener);
    }

    public void setIsLast(boolean z9) {
        this.f29300b = z9;
        requestLayout();
    }
}
