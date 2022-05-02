package org.telegram.ui.Charts.view_data;

public class ChartBottomSignatureData {
    public int alpha;
    public int fixedAlpha = 255;
    public final int step;
    public final int stepMax;
    public final int stepMin;

    public ChartBottomSignatureData(int i, int i2, int i3) {
        this.step = i;
        this.stepMax = i2;
        this.stepMin = i3;
    }
}
