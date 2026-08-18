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
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Stars.StarsIntroActivity;

public class ChartHorizontalLinesData {
    public int alpha;
    public int fixedAlpha = 255;
    private DecimalFormat formatterTON;
    private StaticLayout[] layouts;
    private StaticLayout[] layouts2;
    public long[] values;
    public CharSequence[] valuesStr;
    public CharSequence[] valuesStr2;

    public ChartHorizontalLinesData(long j, long j2, boolean z, float f, int i, TextPaint textPaint, TextPaint textPaint2) {
        long j3;
        float f2;
        int i2;
        long jMax;
        boolean z2;
        int i3;
        int i4;
        ChartHorizontalLinesData chartHorizontalLinesData;
        float f3;
        long j4;
        int i5;
        int iMax;
        boolean z3;
        int i6;
        float f4;
        long j5;
        if (!z) {
            long jRound = j > 100 ? round(j) : j;
            long jMax2 = Math.max(1L, (long) Math.ceil(jRound / 5.0d));
            if (jRound < 6) {
                iMax = (int) Math.max(2L, jRound + 1);
            } else {
                long j6 = jRound / 2;
                if (j6 < 6) {
                    iMax = (int) (j6 + 1);
                    if (jRound % 2 != 0) {
                        iMax++;
                    }
                } else {
                    i5 = 6;
                }
                this.values = new long[i5];
                this.valuesStr = new CharSequence[i5];
                this.layouts = new StaticLayout[i5];
                if (f > 0.0f) {
                    this.valuesStr2 = new CharSequence[i5];
                    this.layouts2 = new StaticLayout[i5];
                }
                if (jMax2 / f < 1.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i6 = 1;
                while (i6 < i5) {
                    long j7 = ((long) i6) * jMax2;
                    this.values[i6] = j7;
                    long j8 = jMax2;
                    this.valuesStr[i6] = format(0, textPaint, j7, i);
                    if (f > 0.0f) {
                        f4 = this.values[i6] / f;
                        if (z3) {
                            j5 = (long) f4;
                            if (f4 - j5 >= 0.01f || i == 1 || i == 2) {
                                this.valuesStr2[i6] = format(1, textPaint2, j5, i);
                            } else {
                                this.valuesStr2[i6] = "";
                            }
                        } else {
                            this.valuesStr2[i6] = format(1, textPaint2, (long) f4, i);
                        }
                    }
                    i6++;
                    jMax2 = j8;
                }
                return;
            }
            i5 = iMax;
            this.values = new long[i5];
            this.valuesStr = new CharSequence[i5];
            this.layouts = new StaticLayout[i5];
            if (f > 0.0f) {
                this.valuesStr2 = new CharSequence[i5];
                this.layouts2 = new StaticLayout[i5];
            }
            if (jMax2 / f < 1.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            i6 = 1;
            while (i6 < i5) {
                long j9 = ((long) i6) * jMax2;
                this.values[i6] = j9;
                long j10 = jMax2;
                this.valuesStr[i6] = format(0, textPaint, j9, i);
                if (f > 0.0f) {
                    f4 = this.values[i6] / f;
                    if (z3) {
                        j5 = (long) f4;
                        if (f4 - j5 >= 0.01f) {
                            this.valuesStr2[i6] = format(1, textPaint2, j5, i);
                        } else {
                            this.valuesStr2[i6] = format(1, textPaint2, j5, i);
                        }
                    } else {
                        this.valuesStr2[i6] = format(1, textPaint2, (long) f4, i);
                    }
                }
                i6++;
                jMax2 = j10;
            }
            return;
        }
        ChartHorizontalLinesData chartHorizontalLinesData2 = this;
        long j11 = j - j2;
        if (j11 == 0) {
            j3 = j2 - 1;
            i2 = 3;
        } else {
            if (j11 < 6) {
                jMax = Math.max(2L, j11 + 1);
            } else {
                long j12 = j11 / 2;
                if (j12 < 6) {
                    j3 = j2;
                    i2 = (int) (j12 + (j11 % 2) + 1);
                    f2 = 2.0f;
                } else {
                    float f5 = j11 / 5.0f;
                    if (f5 <= 0.0f) {
                        jMax = Math.max(2L, j11 + 1);
                    } else {
                        j3 = j2;
                        f2 = f5;
                        i2 = 6;
                    }
                }
                chartHorizontalLinesData2.values = new long[i2];
                chartHorizontalLinesData2.valuesStr = new CharSequence[i2];
                chartHorizontalLinesData2.layouts = new StaticLayout[i2];
                if (f > 0.0f) {
                    chartHorizontalLinesData2.valuesStr2 = new CharSequence[i2];
                    chartHorizontalLinesData2.layouts2 = new StaticLayout[i2];
                }
                if (f2 / f < 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i3 = 0;
                while (i3 < i2) {
                    long j13 = j3 + ((long) (i3 * f2));
                    chartHorizontalLinesData2.values[i3] = j13;
                    i4 = i3;
                    chartHorizontalLinesData = chartHorizontalLinesData2;
                    chartHorizontalLinesData2.valuesStr[i4] = format(0, textPaint, j13, i);
                    if (f > 0.0f) {
                        f3 = chartHorizontalLinesData.values[i4] / f;
                        if (z2) {
                            j4 = (long) f3;
                            if (f3 - j4 < 0.01f && i != 1) {
                                if (i != 2) {
                                    chartHorizontalLinesData.valuesStr2[i4] = "";
                                }
                            }
                            chartHorizontalLinesData.valuesStr2[i4] = format(1, textPaint2, j4, i);
                        } else {
                            chartHorizontalLinesData.valuesStr2[i4] = format(1, textPaint2, (long) f3, i);
                        }
                        i3 = i4 + 1;
                        chartHorizontalLinesData2 = chartHorizontalLinesData;
                    }
                    i3 = i4 + 1;
                    chartHorizontalLinesData2 = chartHorizontalLinesData;
                }
            }
            j3 = j2;
            i2 = (int) jMax;
        }
        f2 = 1.0f;
        chartHorizontalLinesData2.values = new long[i2];
        chartHorizontalLinesData2.valuesStr = new CharSequence[i2];
        chartHorizontalLinesData2.layouts = new StaticLayout[i2];
        if (f > 0.0f) {
            chartHorizontalLinesData2.valuesStr2 = new CharSequence[i2];
            chartHorizontalLinesData2.layouts2 = new StaticLayout[i2];
        }
        if (f2 / f < 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        i3 = 0;
        while (i3 < i2) {
            long j14 = j3 + ((long) (i3 * f2));
            chartHorizontalLinesData2.values[i3] = j14;
            i4 = i3;
            chartHorizontalLinesData = chartHorizontalLinesData2;
            chartHorizontalLinesData2.valuesStr[i4] = format(0, textPaint, j14, i);
            if (f > 0.0f) {
                f3 = chartHorizontalLinesData.values[i4] / f;
                if (z2) {
                    j4 = (long) f3;
                    if (f3 - j4 < 0.01f) {
                    }
                    chartHorizontalLinesData.valuesStr2[i4] = format(1, textPaint2, j4, i);
                } else {
                    chartHorizontalLinesData.valuesStr2[i4] = format(1, textPaint2, (long) f3, i);
                }
                i3 = i4 + 1;
                chartHorizontalLinesData2 = chartHorizontalLinesData;
            }
            i3 = i4 + 1;
            chartHorizontalLinesData2 = chartHorizontalLinesData;
        }
    }

    public CharSequence format(int i, TextPaint textPaint, long j, int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return AndroidUtilities.formatWholeNumber((int) j, 0);
            }
            if (i == 1) {
                return "≈" + BillingController.getInstance().formatCurrency(j, "USD");
            }
            return StarsIntroActivity.replaceStarsWithPlain("XTR " + LocaleController.formatNumber(j, ' '), 0.65f);
        }
        if (i == 1) {
            return "≈" + BillingController.getInstance().formatCurrency(j, "USD");
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
        this.formatterTON.setMaximumFractionDigits(j <= 1000000000 ? 6 : 2);
        return ChannelMonetizationLayout.replaceTON("TON " + this.formatterTON.format(j / 1.0E9d), textPaint, 0.8f, -AndroidUtilities.dp(0.66f), false);
    }

    public static long lookupHeight(long j) {
        if (j > 100) {
            j = round(j);
        }
        return ((long) Math.ceil(j / 5.0f)) * 5;
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
