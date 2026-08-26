package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

public final class ShadowSectionCell extends View {
    public final int backgroundColor;
    public boolean bottom;
    public final Theme.ResourcesProvider resourcesProvider;
    public int size;
    public boolean top;

    public ShadowSectionCell(Context context) {
        this(context, null, 0);
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

    public ShadowSectionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, resourcesProvider, 0);
    }

    public ShadowSectionCell(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        super(context);
        this.top = true;
        this.bottom = true;
        this.resourcesProvider = resourcesProvider;
        this.size = 12;
        int i2 = this.backgroundColor;
        if (i2 == 0) {
            setBackground(null);
        } else {
            setBackgroundColor(i2);
        }
    }

    public ShadowSectionCell(Context context, int i) {
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
