package org.telegram.ui.Charts.data;

import org.telegram.messenger.SegmentTree;

public final class StackBarChartData extends ChartData {
    public long[] ySum;
    public SegmentTree ySumSegmentTree;
}
