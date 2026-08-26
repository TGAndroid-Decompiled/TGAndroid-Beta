package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class ShadowSectionCell extends View {
    public final int backgroundColor;
    public boolean bottom;
    public int size;
    public boolean top;

    public ShadowSectionCell(Context context) {
        this(context, (Object) null);
    }

    private int getBackgroundResId() {
        boolean z = this.top;
        if (z && this.bottom) {
            return R.drawable.greydivider;
        }
        if (z) {
            return R.drawable.greydivider_bottom;
        }
        return this.bottom ? R.drawable.greydivider_top : R.drawable.transparent;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.size), 1073741824));
    }

    public void setSize(int i) {
        this.size = i;
    }

    public ShadowSectionCell(Context context, int i) {
        this(context, (Object) null);
    }

    public ShadowSectionCell(Context context, Object obj) {
        super(context);
        this.top = true;
        this.bottom = true;
        this.size = 12;
        int i = this.backgroundColor;
        if (i == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i);
        }
    }

    public ShadowSectionCell(Context context, int i, int i2) {
        super(context);
        this.top = true;
        this.bottom = true;
        this.backgroundColor = i;
        this.size = 12;
        if (i == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i);
        }
    }
}
