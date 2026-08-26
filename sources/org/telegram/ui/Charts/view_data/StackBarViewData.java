package org.telegram.ui.Charts.view_data;

import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;

public final class StackBarViewData extends LineViewData {
    public int blendColor;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Paint unselectedPaint;

    public StackBarViewData(ChartData.Line line, Theme.ResourcesProvider resourcesProvider) {
        super(line, false, null);
        Paint paint = new Paint();
        this.unselectedPaint = paint;
        this.blendColor = 0;
        this.resourcesProvider = resourcesProvider;
        this.paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.paint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.paint.setAntiAlias(false);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        this.blendColor = ColorUtils.blendARGB(0.3f, Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider), this.lineColor);
    }
}
