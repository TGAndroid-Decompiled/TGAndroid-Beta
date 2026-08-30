package org.telegram.ui.Cells;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class l8 extends LinearLayout {
    public TextView f21363a;
    public boolean f21364b;

    @Override
    public final void onMeasure(int i10, int i11) {
        View view;
        int measuredHeight;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
        if (this.f21364b && (view = (View) getParent()) != null && getMeasuredHeight() < (measuredHeight = ((view.getMeasuredHeight() - view.getPaddingBottom()) - view.getPaddingTop()) - AndroidUtilities.dp(24.0f))) {
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f21363a.setOnClickListener(onClickListener);
    }

    public void setIsLast(boolean z4) {
        this.f21364b = z4;
        requestLayout();
    }
}
