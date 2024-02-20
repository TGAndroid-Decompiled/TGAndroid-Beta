package org.telegram.ui.Charts.view_data;
public class ChartHorizontalLinesData {
    public int alpha;
    public int fixedAlpha;
    public int[] values;
    public String[] valuesStr;
    public String[] valuesStr2;

    public ChartHorizontalLinesData(int i, int i2, boolean z) {
        this(i, i2, z, 0.0f);
    }

    public ChartHorizontalLinesData(int r8, int r9, boolean r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.view_data.ChartHorizontalLinesData.<init>(int, int, boolean, float):void");
    }

    public static int lookupHeight(int i) {
        if (i > 100) {
            i = round(i);
        }
        return ((int) Math.ceil(i / 5.0f)) * 5;
    }

    private static int round(int i) {
        return ((float) (i / 5)) % 10.0f == 0.0f ? i : ((i / 10) + 1) * 10;
    }
}
