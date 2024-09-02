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
        long j = 0;
        for (int i = 0; i < size; i++) {
            long j2 = this.lines.get(i).maxValue;
            if (j2 > j) {
                j = j2;
            }
        }
        this.linesK = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            long j3 = this.lines.get(i2).maxValue;
            if (j == j3) {
                this.linesK[i2] = 1.0f;
            } else {
                this.linesK[i2] = (float) (j / j3);
            }
        }
    }
}
