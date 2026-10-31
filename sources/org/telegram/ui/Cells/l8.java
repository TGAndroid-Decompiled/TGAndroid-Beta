package org.telegram.ui.Cells;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class l8 extends LinearLayout {
    public TextView f22257a;
    public boolean f22258b;

    @Override
    public final void onMeasure(int i10, int i11) {
        View view;
        int measuredHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        if (this.f22258b && (view = (View) getParent()) != null && getMeasuredHeight() < (measuredHeight = ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - org.telegram.messenger.i0.L(24.0f))) {
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f22257a.setOnClickListener(onClickListener);
    }

    public void setIsLast(boolean z10) {
        this.f22258b = z10;
        requestLayout();
    }
}
