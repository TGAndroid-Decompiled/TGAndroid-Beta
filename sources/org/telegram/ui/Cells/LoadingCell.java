package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;

public class LoadingCell extends FrameLayout {
    private int height;
    private RadialProgressView progressBar;

    public LoadingCell(Context context) {
        this(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(54.0f));
    }

    public LoadingCell(Context context, int i, int i2) {
        super(context);
        this.height = i2;
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressBar = radialProgressView;
        radialProgressView.setSize(i);
        addView(this.progressBar, LayoutHelper.createFrame(-2, -2, 17));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.height, 1073741824));
    }
}
