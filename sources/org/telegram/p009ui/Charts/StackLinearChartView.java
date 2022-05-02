package org.telegram.p009ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.Charts.data.ChartData;
import org.telegram.p009ui.Charts.data.StackLinearChartData;
import org.telegram.p009ui.Charts.view_data.StackLinearViewData;

public class StackLinearChartView<T extends StackLinearViewData> extends BaseChartView<StackLinearChartData, T> {
    boolean[] skipPoints;
    float[] startFromY;
    private Matrix matrix = new Matrix();
    private float[] mapPoints = new float[2];
    Path ovalPath = new Path();

    @Override
    public int findMaxValue(int i, int i2) {
        return 100;
    }

    @Override
    protected float getMinDistance() {
        return 0.1f;
    }

    public StackLinearChartView(Context context) {
        super(context);
        this.superDraw = true;
        this.useAlphaSignature = true;
        this.drawPointOnSelection = false;
    }

    @Override
    public T createLineViewData(ChartData.Line line) {
        return (T) new StackLinearViewData(line);
    }

    @Override
    protected void drawChart(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Charts.StackLinearChartView.drawChart(android.graphics.Canvas):void");
    }

    private int quarterForPoint(float f, float f2) {
        float centerX = this.chartArea.centerX();
        float centerY = this.chartArea.centerY() + AndroidUtilities.m34dp(16.0f);
        if (f >= centerX && f2 <= centerY) {
            return 0;
        }
        if (f < centerX || f2 < centerY) {
            return (f >= centerX || f2 < centerY) ? 3 : 2;
        }
        return 1;
    }

    @Override
    protected void drawPickerChart(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Charts.StackLinearChartView.drawPickerChart(android.graphics.Canvas):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        tick();
        drawChart(canvas);
        drawBottomLine(canvas);
        this.tmpN = this.horizontalLines.size();
        int i = 0;
        while (true) {
            this.tmpI = i;
            int i2 = this.tmpI;
            if (i2 < this.tmpN) {
                drawHorizontalLines(canvas, this.horizontalLines.get(i2));
                drawSignaturesToHorizontalLines(canvas, this.horizontalLines.get(this.tmpI));
                i = this.tmpI + 1;
            } else {
                drawBottomSignature(canvas);
                drawPicker(canvas);
                drawSelection(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public void fillTransitionParams(org.telegram.p009ui.Charts.view_data.TransitionParams r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Charts.StackLinearChartView.fillTransitionParams(org.telegram.ui.Charts.view_data.TransitionParams):void");
    }
}
