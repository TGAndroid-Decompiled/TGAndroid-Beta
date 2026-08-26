package org.telegram.ui.Charts;

import android.animation.ValueAnimator;
import org.telegram.ui.Charts.view_data.StackLinearViewData;

public final class PieChartViewData extends StackLinearViewData {
    public ValueAnimator animator;
    public float drawingPart;
    public float selectionA;
}
