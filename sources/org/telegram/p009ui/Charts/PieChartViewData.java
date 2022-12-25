package org.telegram.p009ui.Charts;

import android.animation.Animator;
import org.telegram.p009ui.Charts.data.ChartData;
import org.telegram.p009ui.Charts.view_data.StackLinearViewData;

public class PieChartViewData extends StackLinearViewData {
    Animator animator;
    float drawingPart;
    float selectionA;

    public PieChartViewData(ChartData.Line line) {
        super(line);
    }
}
