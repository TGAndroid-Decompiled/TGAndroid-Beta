package org.telegram.ui.Charts.view_data;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Charts.data.ChartData;

public class LineViewData {
    public float alpha;
    public ValueAnimator animatorIn;
    public ValueAnimator animatorOut;
    public final Paint bottomLinePaint;
    public final Path bottomLinePath;
    public final Path chartPath;
    public final Path chartPathPicker;
    public boolean enabled;
    public final ChartData.Line line;
    public int lineColor;
    public float[] linesPath;
    public float[] linesPathBottom;
    public int linesPathBottomSize;
    public final Paint paint;
    private Theme.ResourcesProvider resourcesProvider;
    public final Paint selectionPaint;

    public LineViewData(ChartData.Line line, boolean z) {
        this(line, z, null);
    }

    public LineViewData(ChartData.Line line, boolean z, Theme.ResourcesProvider resourcesProvider) {
        Paint paint = new Paint(1);
        this.bottomLinePaint = paint;
        Paint paint2 = new Paint(1);
        this.paint = paint2;
        Paint paint3 = new Paint(1);
        this.selectionPaint = paint3;
        this.bottomLinePath = new Path();
        this.chartPath = new Path();
        this.chartPathPicker = new Path();
        this.enabled = true;
        this.alpha = 1.0f;
        this.resourcesProvider = resourcesProvider;
        this.line = line;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        if (!BaseChartView.USE_LINES) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(line.color);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(line.color);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(10.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(line.color);
        long[] jArr = line.y;
        this.linesPath = new float[z ? jArr.length * 8 : jArr.length << 2];
        long[] jArr2 = line.y;
        this.linesPathBottom = new float[z ? jArr2.length * 8 : jArr2.length << 2];
    }

    public void updateColors() {
        int i = this.line.colorKey;
        if (i >= 0 && Theme.hasThemeKey(i)) {
            this.lineColor = Theme.getColor(this.line.colorKey, this.resourcesProvider);
        } else {
            this.lineColor = (ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)) > 0.5d ? 1 : (ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)) == 0.5d ? 0 : -1)) < 0 ? this.line.colorDark : this.line.color;
        }
        this.paint.setColor(this.lineColor);
        this.bottomLinePaint.setColor(this.lineColor);
        this.selectionPaint.setColor(this.lineColor);
    }
}
