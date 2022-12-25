package org.telegram.p009ui.Charts.view_data;

import android.graphics.Paint;
import org.telegram.p009ui.Charts.BaseChartView;
import org.telegram.p009ui.Charts.data.ChartData;

public class StackLinearViewData extends LineViewData {
    public StackLinearViewData(ChartData.Line line) {
        super(line);
        this.paint.setStyle(Paint.Style.FILL);
        if (BaseChartView.USE_LINES) {
            this.paint.setAntiAlias(false);
        }
    }
}
