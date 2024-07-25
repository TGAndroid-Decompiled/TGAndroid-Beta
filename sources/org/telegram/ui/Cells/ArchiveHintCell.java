package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.BottomPagesView;
public class ArchiveHintCell extends FrameLayout {
    private BottomPagesView bottomPages;
    private ViewPager viewPager;

    @Override
    public void invalidate() {
        super.invalidate();
        this.bottomPages.invalidate();
    }

    public ViewPager getViewPager() {
        return this.viewPager;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(204.0f), 1073741824));
    }
}
