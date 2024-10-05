package org.telegram.ui.Charts.data;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.graphics.ColorUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.ThemeColors;

public class ChartData {
    public String[] daysLookup;
    public ArrayList lines;
    public long maxValue;
    public long minValue;
    public float oneDayPercentage;
    protected long timeStep;
    public long[] x;
    public float[] xPercentage;
    public int xTickFormatter;
    public int xTooltipFormatter;
    public float yRate;
    public int yTickFormatter;
    public int yTooltipFormatter;

    public class Line {
        public int colorKey;
        public String id;
        public String name;
        public SegmentTree segmentTree;
        public long[] y;
        public long maxValue = 0;
        public long minValue = Long.MAX_VALUE;
        public int color = -16777216;
        public int colorDark = -1;

        public Line() {
        }
    }

    public ChartData() {
        this.lines = new ArrayList();
        this.maxValue = 0L;
        this.minValue = Long.MAX_VALUE;
        this.oneDayPercentage = 0.0f;
        this.xTickFormatter = 0;
        this.xTooltipFormatter = 0;
        this.yRate = 0.0f;
        this.yTickFormatter = 0;
        this.yTooltipFormatter = 0;
    }

    public ChartData(JSONObject jSONObject) {
        this.lines = new ArrayList();
        this.maxValue = 0L;
        this.minValue = Long.MAX_VALUE;
        this.oneDayPercentage = 0.0f;
        this.xTickFormatter = 0;
        this.xTooltipFormatter = 0;
        this.yRate = 0.0f;
        this.yTickFormatter = 0;
        this.yTooltipFormatter = 0;
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.x = new long[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    this.x[i2] = jSONArray2.getLong(i3);
                    i2 = i3;
                }
            } else {
                Line line = new Line();
                this.lines.add(line);
                int length2 = jSONArray2.length() - 1;
                line.id = jSONArray2.getString(0);
                line.y = new long[length2];
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = i4 + 1;
                    line.y[i4] = jSONArray2.getLong(i5);
                    long j = line.y[i4];
                    if (j > line.maxValue) {
                        line.maxValue = j;
                    }
                    if (j < line.minValue) {
                        line.minValue = j;
                    }
                    i4 = i5;
                }
            }
            long[] jArr = this.x;
            if (jArr.length > 1) {
                this.timeStep = jArr[1] - jArr[0];
            } else {
                this.timeStep = 86400000L;
            }
            measure();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        try {
            this.xTickFormatter = getFormatter(jSONObject.getString("xTickFormatter"));
            this.yTickFormatter = getFormatter(jSONObject.getString("yTickFormatter"));
            this.xTooltipFormatter = getFormatter(jSONObject.getString("xTooltipFormatter"));
            this.yTooltipFormatter = getFormatter(jSONObject.getString("yTooltipFormatter"));
        } catch (Exception unused) {
        }
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i6 = 0; i6 < this.lines.size(); i6++) {
            Line line2 = (Line) this.lines.get(i6);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(line2.id));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        line2.colorKey = ThemeColors.stringKeyToInt("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    line2.color = parseColor;
                    line2.colorDark = ColorUtils.blendARGB(-1, parseColor, 0.85f);
                }
            }
            if (optJSONObject2 != null) {
                line2.name = optJSONObject2.getString(line2.id);
            }
        }
    }

    public int findEndIndex(int i, float f) {
        int length = this.xPercentage.length - 1;
        if (f == 1.0f) {
            return length;
        }
        int i2 = length;
        while (i <= i2) {
            int i3 = (i2 + i) >> 1;
            float[] fArr = this.xPercentage;
            float f2 = fArr[i3];
            if ((f > f2 && (i3 == length || f < fArr[i3 + 1])) || f == f2) {
                return i3;
            }
            if (f < f2) {
                i2 = i3 - 1;
            } else if (f > f2) {
                i = i3 + 1;
            }
        }
        return i2;
    }

    public int findIndex(int i, int i2, float f) {
        float[] fArr = this.xPercentage;
        int length = fArr.length;
        if (f <= fArr[i]) {
            return i;
        }
        if (f >= fArr[i2]) {
            return i2;
        }
        while (i <= i2) {
            int i3 = (i2 + i) >> 1;
            float[] fArr2 = this.xPercentage;
            float f2 = fArr2[i3];
            if ((f > f2 && (i3 == length - 1 || f < fArr2[i3 + 1])) || f == f2) {
                return i3;
            }
            if (f < f2) {
                i2 = i3 - 1;
            } else if (f > f2) {
                i = i3 + 1;
            }
        }
        return i2;
    }

    public int findStartIndex(float f) {
        int length;
        int i = 0;
        if (f == 0.0f || (length = this.xPercentage.length) < 2) {
            return 0;
        }
        int i2 = length - 1;
        while (i <= i2) {
            int i3 = (i2 + i) >> 1;
            float[] fArr = this.xPercentage;
            float f2 = fArr[i3];
            if ((f < f2 && (i3 == 0 || f > fArr[i3 - 1])) || f == f2) {
                return i3;
            }
            if (f < f2) {
                i2 = i3 - 1;
            } else if (f > f2) {
                i = i3 + 1;
            }
        }
        return i;
    }

    public String getDayString(int i) {
        String[] strArr = this.daysLookup;
        long[] jArr = this.x;
        return strArr[(int) ((jArr[i] - jArr[0]) / this.timeStep)];
    }

    public int getFormatter(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.contains("TON")) {
            return 1;
        }
        return str.contains("XTR") ? 2 : 0;
    }

    public void measure() {
        long[] jArr = this.x;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        long j = jArr[0];
        long j2 = jArr[length - 1];
        float[] fArr = new float[length];
        this.xPercentage = fArr;
        if (length == 1) {
            fArr[0] = 1.0f;
        } else {
            for (int i = 0; i < length; i++) {
                this.xPercentage[i] = ((float) (this.x[i] - j)) / ((float) (j2 - j));
            }
        }
        for (int i2 = 0; i2 < this.lines.size(); i2++) {
            if (((Line) this.lines.get(i2)).maxValue > this.maxValue) {
                this.maxValue = ((Line) this.lines.get(i2)).maxValue;
            }
            if (((Line) this.lines.get(i2)).minValue < this.minValue) {
                this.minValue = ((Line) this.lines.get(i2)).minValue;
            }
            ((Line) this.lines.get(i2)).segmentTree = new SegmentTree(((Line) this.lines.get(i2)).y);
        }
        long j3 = this.timeStep;
        this.daysLookup = new String[((int) ((j2 - j) / j3)) + 10];
        SimpleDateFormat simpleDateFormat = j3 == 1 ? null : j3 < 86400000 ? new SimpleDateFormat("HH:mm") : new SimpleDateFormat("MMM d");
        int i3 = 0;
        while (true) {
            String[] strArr = this.daysLookup;
            if (i3 >= strArr.length) {
                float f = (float) this.timeStep;
                long[] jArr2 = this.x;
                this.oneDayPercentage = f / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                return;
            } else {
                if (this.timeStep == 1) {
                    strArr[i3] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i3));
                } else {
                    strArr[i3] = simpleDateFormat.format(new Date((i3 * this.timeStep) + j));
                }
                i3++;
            }
        }
    }
}
