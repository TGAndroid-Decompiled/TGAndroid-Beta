package org.telegram.ui.Charts.data;

import org.json.JSONException;
import org.json.JSONObject;

public class DoubleLinearChartData extends ChartData {
    public float[] linesK;

    public DoubleLinearChartData(JSONObject jSONObject) throws JSONException {
        super(jSONObject);
    }

    @Override
    public void measure() {
        super.measure();
        int size = this.lines.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = this.lines.get(i2).maxValue;
            if (i3 > i) {
                i = i3;
            }
        }
        this.linesK = new float[size];
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = this.lines.get(i4).maxValue;
            if (i == i5) {
                this.linesK[i4] = 1.0f;
            } else {
                this.linesK[i4] = i / i5;
            }
        }
    }
}
