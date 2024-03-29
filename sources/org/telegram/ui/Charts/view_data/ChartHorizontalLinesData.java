package org.telegram.ui.Charts.view_data;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.ui.ChannelMonetizationLayout;
public class ChartHorizontalLinesData {
    public int alpha;
    public int fixedAlpha = 255;
    private DecimalFormat formatterTON;
    private StaticLayout[] layouts;
    private StaticLayout[] layouts2;
    public long[] values;
    public CharSequence[] valuesStr;
    public CharSequence[] valuesStr2;

    public ChartHorizontalLinesData(long r23, long r25, boolean r27, float r28, int r29, android.text.TextPaint r30, android.text.TextPaint r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Charts.view_data.ChartHorizontalLinesData.<init>(long, long, boolean, float, int, android.text.TextPaint, android.text.TextPaint):void");
    }

    public CharSequence format(int i, TextPaint textPaint, long j, int i2) {
        if (i2 == 1) {
            if (i == 1) {
                return "~" + BillingController.getInstance().formatCurrency(j, "USD");
            }
            if (this.formatterTON == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                this.formatterTON = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                this.formatterTON.setMaximumFractionDigits(6);
                this.formatterTON.setGroupingUsed(false);
            }
            this.formatterTON.setMaximumFractionDigits(j > 1000000000 ? 2 : 6);
            StringBuilder sb = new StringBuilder();
            sb.append("TON ");
            DecimalFormat decimalFormat2 = this.formatterTON;
            double d = j;
            Double.isNaN(d);
            sb.append(decimalFormat2.format(d / 1.0E9d));
            return ChannelMonetizationLayout.replaceTON(sb.toString(), textPaint, 0.8f, -AndroidUtilities.dp(0.66f), false);
        }
        return AndroidUtilities.formatWholeNumber((int) j, 0);
    }

    public static int lookupHeight(long j) {
        if (j > 100) {
            j = round(j);
        }
        return ((int) Math.ceil(((float) j) / 5.0f)) * 5;
    }

    private static long round(long j) {
        return ((float) (j / 5)) % 10.0f == 0.0f ? j : ((j / 10) + 1) * 10;
    }

    public void drawText(Canvas canvas, int i, int i2, float f, float f2, TextPaint textPaint) {
        StaticLayout staticLayout = (i == 0 ? this.layouts : this.layouts2)[i2];
        if (staticLayout == null) {
            CharSequence charSequence = (i == 0 ? this.valuesStr : this.valuesStr2)[i2];
            StaticLayout[] staticLayoutArr = i == 0 ? this.layouts : this.layouts2;
            staticLayout = new StaticLayout(charSequence, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr[i2] = staticLayout;
        }
        canvas.save();
        canvas.translate(f, f2 + textPaint.ascent());
        staticLayout.draw(canvas);
        canvas.restore();
    }
}
