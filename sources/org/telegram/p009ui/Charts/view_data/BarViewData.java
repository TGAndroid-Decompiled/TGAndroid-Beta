package org.telegram.p009ui.Charts.view_data;

import android.graphics.Paint;
import org.telegram.p009ui.Charts.data.ChartData;

public class BarViewData extends LineViewData {
    public int blendColor = 0;
    public final Paint unselectedPaint;

    public BarViewData(ChartData.Line line) {
        super(line);
        Paint paint = new Paint();
        this.unselectedPaint = paint;
        this.paint.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.STROKE);
        this.paint.setAntiAlias(false);
    }

    @Override
    public void updateColors() {
        super.updateColors();
    }
}
