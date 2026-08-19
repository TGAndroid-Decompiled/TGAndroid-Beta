package org.telegram.ui.Charts.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.SegmentTree;

public class StackLinearChartData extends ChartData {
    public int simplifiedSize;
    public long[][] simplifiedY;
    long[] ySum;
    SegmentTree ySumSegmentTree;

    public StackLinearChartData(JSONObject jSONObject, boolean z) {
        super(jSONObject);
        if (z) {
            long[] jArr = new long[this.lines.size()];
            int[] iArr = new int[this.lines.size()];
            long j = 0;
            for (int i = 0; i < this.lines.size(); i++) {
                int length = this.x.length;
                for (int i2 = 0; i2 < length; i2++) {
                    long j2 = ((ChartData.Line) this.lines.get(i)).y[i2];
                    jArr[i] = jArr[i] + j2;
                    if (j2 == 0) {
                        iArr[i] = iArr[i] + 1;
                    }
                }
                j += jArr[i];
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < this.lines.size(); i3++) {
                if (jArr[i3] / j < 0.01d && iArr[i3] > this.x.length / 2.0f) {
                    arrayList.add((ChartData.Line) this.lines.get(i3));
                }
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                this.lines.remove((ChartData.Line) obj);
            }
        }
        int length2 = ((ChartData.Line) this.lines.get(0)).y.length;
        int size2 = this.lines.size();
        this.ySum = new long[length2];
        for (int i5 = 0; i5 < length2; i5++) {
            this.ySum[i5] = 0;
            for (int i6 = 0; i6 < size2; i6++) {
                long[] jArr2 = this.ySum;
                jArr2[i5] = jArr2[i5] + ((ChartData.Line) this.lines.get(i6)).y[i5];
            }
        }
        this.ySumSegmentTree = new SegmentTree(this.ySum);
    }

    public StackLinearChartData(ChartData chartData, long j) {
        int iBinarySearch = Arrays.binarySearch(chartData.x, j);
        int length = iBinarySearch - 4;
        int length2 = iBinarySearch + 4;
        if (length < 0) {
            length2 += -length;
            length = 0;
        }
        long[] jArr = chartData.x;
        if (length2 > jArr.length - 1) {
            length -= length2 - jArr.length;
            length2 = jArr.length - 1;
        }
        length = length < 0 ? 0 : length;
        int i = (length2 - length) + 1;
        this.x = new long[i];
        this.xPercentage = new float[i];
        this.lines = new ArrayList();
        for (int i2 = 0; i2 < chartData.lines.size(); i2++) {
            ChartData.Line line = new ChartData.Line();
            line.y = new long[i];
            line.id = ((ChartData.Line) chartData.lines.get(i2)).id;
            line.name = ((ChartData.Line) chartData.lines.get(i2)).name;
            line.colorKey = ((ChartData.Line) chartData.lines.get(i2)).colorKey;
            line.color = ((ChartData.Line) chartData.lines.get(i2)).color;
            line.colorDark = ((ChartData.Line) chartData.lines.get(i2)).colorDark;
            this.lines.add(line);
        }
        int i3 = 0;
        while (length <= length2) {
            this.x[i3] = chartData.x[length];
            for (int i4 = 0; i4 < this.lines.size(); i4++) {
                ((ChartData.Line) this.lines.get(i4)).y[i3] = ((ChartData.Line) chartData.lines.get(i4)).y[length];
            }
            i3++;
            length++;
        }
        this.timeStep = 86400000L;
        measure();
    }

    @Override
    protected void measure() {
        super.measure();
        this.simplifiedSize = 0;
        int length = this.xPercentage.length;
        int size = this.lines.size();
        int iMax = Math.max(1, Math.round(length / 140.0f));
        int i = length / iMax;
        this.simplifiedY = (long[][]) Array.newInstance((Class<?>) Long.TYPE, size, i);
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < size; i3++) {
                long j = ((ChartData.Line) this.lines.get(i3)).y[i2];
                if (j > jArr[i3]) {
                    jArr[i3] = j;
                }
            }
            if (i2 % iMax == 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    this.simplifiedY[i4][this.simplifiedSize] = jArr[i4];
                    jArr[i4] = 0;
                }
                int i5 = this.simplifiedSize + 1;
                this.simplifiedSize = i5;
                if (i5 >= i) {
                    return;
                }
            }
        }
    }
}
