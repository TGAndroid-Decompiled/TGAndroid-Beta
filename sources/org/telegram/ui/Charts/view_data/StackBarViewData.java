package org.telegram.ui.Charts.view_data;

import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
public class StackBarViewData extends LineViewData {
    public int blendColor;
    public final Paint unselectedPaint;

    @Override
    public void updateColors() {
        super.updateColors();
        this.blendColor = ColorUtils.blendARGB(Theme.getColor("windowBackgroundWhite"), this.lineColor, 0.3f);
    }

    public StackBarViewData(ChartData.Line line) {
        super(line);
        Paint paint = new Paint();
        this.unselectedPaint = paint;
        this.blendColor = 0;
        this.paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        this.paint.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.STROKE);
        this.paint.setAntiAlias(false);
    }
}
