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
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class ChartHorizontalLinesData {
    public int alpha;
    public int fixedAlpha;
    public DecimalFormat formatterTON;
    public final StaticLayout[] layouts;
    public final StaticLayout[] layouts2;
    public final long[] values;
    public final CharSequence[] valuesStr;
    public final CharSequence[] valuesStr2;

    public ChartHorizontalLinesData(long j, long j2, boolean z, float f, int i, TextPaint textPaint, TextPaint textPaint2) {
        float f2;
        int i2;
        long j3;
        long jMax;
        float f3;
        long j4;
        long jMax2;
        long j5;
        int i3;
        int iMax;
        boolean z2;
        int i4;
        float f4;
        long j6;
        ?? obj = new Object();
        obj.fixedAlpha = 255;
        if (z) {
            long j7 = j - j2;
            if (j7 == 0) {
                j3 = j2 - 1;
                f2 = 1.0f;
                i2 = 3;
            } else {
                if (j7 < 6) {
                    jMax = Math.max(2L, j7 + 1);
                } else {
                    long j8 = j7 / 2;
                    if (j8 < 6) {
                        int i5 = (int) ((j7 % 2) + j8 + 1);
                        j3 = j2;
                        i2 = i5;
                        f2 = 2.0f;
                    } else {
                        float f5 = j7 / 5.0f;
                        if (f5 <= 0.0f) {
                            jMax = Math.max(2L, j7 + 1);
                        } else {
                            f2 = f5;
                            i2 = 6;
                            j3 = j2;
                        }
                    }
                }
                j3 = j2;
                i2 = (int) jMax;
                f2 = 1.0f;
            }
            obj.values = new long[i2];
            obj.valuesStr = new CharSequence[i2];
            obj.layouts = new StaticLayout[i2];
            if (f > 0.0f) {
                obj.valuesStr2 = new CharSequence[i2];
                obj.layouts2 = new StaticLayout[i2];
            }
            boolean z3 = f2 / f < 1.0f;
            int i6 = 0;
            ChartHorizontalLinesData chartHorizontalLinesData = obj;
            while (i6 < i2) {
                long j9 = ((long) (i6 * f2)) + j3;
                chartHorizontalLinesData.values[i6] = j9;
                chartHorizontalLinesData.valuesStr[i6] = chartHorizontalLinesData.format(0, textPaint, j9, i);
                if (f > 0.0f) {
                    float f6 = chartHorizontalLinesData.values[i6] / f;
                    if (z3) {
                        long j10 = (long) f6;
                        if (f6 - j10 < 0.01f || i == 1 || i == 2) {
                            chartHorizontalLinesData.valuesStr2[i6] = chartHorizontalLinesData.format(1, textPaint2, j10, i);
                        } else {
                            chartHorizontalLinesData.valuesStr2[i6] = "";
                        }
                    } else {
                        chartHorizontalLinesData.valuesStr2[i6] = chartHorizontalLinesData.format(1, textPaint2, (long) f6, i);
                    }
                }
                i6++;
                chartHorizontalLinesData = this;
            }
            return;
        }
        if (j > 100) {
            f3 = 0.0f;
            if ((j / 5) % 10.0f != 0.0f) {
                j4 = 10 * ((j / 10) + 1);
            }
            jMax2 = Math.max(1L, (long) Math.ceil(j4 / 5.0d));
            if (j4 < 6) {
                j5 = j4 / 2;
                if (j5 < 6) {
                    iMax = (int) (j5 + 1);
                    if (j4 % 2 != 0) {
                        iMax++;
                    }
                } else {
                    i3 = 6;
                }
                obj.values = new long[i3];
                obj.valuesStr = new CharSequence[i3];
                obj.layouts = new StaticLayout[i3];
                if (f > f3) {
                    obj.valuesStr2 = new CharSequence[i3];
                    obj.layouts2 = new StaticLayout[i3];
                }
                if (jMax2 / f < 1.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                for (i4 = 1; i4 < i3; i4++) {
                    long j11 = ((long) i4) * jMax2;
                    obj.values[i4] = j11;
                    obj.valuesStr[i4] = obj.format(0, textPaint, j11, i);
                    if (f > f3) {
                        f4 = obj.values[i4] / f;
                        if (z2) {
                            j6 = (long) f4;
                            if (f4 - j6 >= 0.01f || i == 1 || i == 2) {
                                obj.valuesStr2[i4] = obj.format(1, textPaint2, j6, i);
                            } else {
                                obj.valuesStr2[i4] = "";
                            }
                        } else {
                            obj.valuesStr2[i4] = obj.format(1, textPaint2, (long) f4, i);
                        }
                    }
                }
            }
            iMax = (int) Math.max(2L, j4 + 1);
            i3 = iMax;
            obj.values = new long[i3];
            obj.valuesStr = new CharSequence[i3];
            obj.layouts = new StaticLayout[i3];
            if (f > f3) {
                obj.valuesStr2 = new CharSequence[i3];
                obj.layouts2 = new StaticLayout[i3];
            }
            if (jMax2 / f < 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            while (i4 < i3) {
                long j12 = ((long) i4) * jMax2;
                obj.values[i4] = j12;
                obj.valuesStr[i4] = obj.format(0, textPaint, j12, i);
                if (f > f3) {
                    f4 = obj.values[i4] / f;
                    if (z2) {
                        j6 = (long) f4;
                        if (f4 - j6 >= 0.01f) {
                            obj.valuesStr2[i4] = obj.format(1, textPaint2, j6, i);
                        } else {
                            obj.valuesStr2[i4] = obj.format(1, textPaint2, j6, i);
                        }
                    } else {
                        obj.valuesStr2[i4] = obj.format(1, textPaint2, (long) f4, i);
                    }
                }
            }
        }
        f3 = 0.0f;
        j4 = j;
        jMax2 = Math.max(1L, (long) Math.ceil(j4 / 5.0d));
        if (j4 < 6) {
            j5 = j4 / 2;
            if (j5 < 6) {
                iMax = (int) (j5 + 1);
                if (j4 % 2 != 0) {
                    iMax++;
                }
            } else {
                i3 = 6;
            }
            obj.values = new long[i3];
            obj.valuesStr = new CharSequence[i3];
            obj.layouts = new StaticLayout[i3];
            if (f > f3) {
                obj.valuesStr2 = new CharSequence[i3];
                obj.layouts2 = new StaticLayout[i3];
            }
            if (jMax2 / f < 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            while (i4 < i3) {
                long j13 = ((long) i4) * jMax2;
                obj.values[i4] = j13;
                obj.valuesStr[i4] = obj.format(0, textPaint, j13, i);
                if (f > f3) {
                    f4 = obj.values[i4] / f;
                    if (z2) {
                        j6 = (long) f4;
                        if (f4 - j6 >= 0.01f) {
                            obj.valuesStr2[i4] = obj.format(1, textPaint2, j6, i);
                        } else {
                            obj.valuesStr2[i4] = obj.format(1, textPaint2, j6, i);
                        }
                    } else {
                        obj.valuesStr2[i4] = obj.format(1, textPaint2, (long) f4, i);
                    }
                }
            }
        }
        iMax = (int) Math.max(2L, j4 + 1);
        i3 = iMax;
        obj.values = new long[i3];
        obj.valuesStr = new CharSequence[i3];
        obj.layouts = new StaticLayout[i3];
        if (f > f3) {
            obj.valuesStr2 = new CharSequence[i3];
            obj.layouts2 = new StaticLayout[i3];
        }
        if (jMax2 / f < 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        while (i4 < i3) {
            long j14 = ((long) i4) * jMax2;
            obj.values[i4] = j14;
            obj.valuesStr[i4] = obj.format(0, textPaint, j14, i);
            if (f > f3) {
                f4 = obj.values[i4] / f;
                if (z2) {
                    j6 = (long) f4;
                    if (f4 - j6 >= 0.01f) {
                        obj.valuesStr2[i4] = obj.format(1, textPaint2, j6, i);
                    } else {
                        obj.valuesStr2[i4] = obj.format(1, textPaint2, j6, i);
                    }
                } else {
                    obj.valuesStr2[i4] = obj.format(1, textPaint2, (long) f4, i);
                }
            }
        }
    }

    public final void drawText(Canvas canvas, float f, int i, int i2, float f2, TextPaint textPaint) {
        StaticLayout[] staticLayoutArr = this.layouts2;
        StaticLayout[] staticLayoutArr2 = this.layouts;
        StaticLayout staticLayout = (i == 0 ? staticLayoutArr2 : staticLayoutArr)[i2];
        if (staticLayout == null) {
            CharSequence charSequence = (i == 0 ? this.valuesStr : this.valuesStr2)[i2];
            if (i == 0) {
                staticLayoutArr = staticLayoutArr2;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            staticLayoutArr[i2] = staticLayout2;
            staticLayout = staticLayout2;
        }
        canvas.save();
        canvas.translate(f, textPaint.ascent() + f2);
        staticLayout.draw(canvas);
        canvas.restore();
    }

    public final CharSequence format(int i, TextPaint textPaint, long j, int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                return AndroidUtilities.formatWholeNumber((int) j, 0);
            }
            if (i != 1) {
                return StarsIntroActivity.replaceStarsWithPlain(false, BillingController$$ExternalSyntheticOutline0.m(j, ' ', new StringBuilder("XTR ")), 0.65f, null);
            }
            return "≈" + BillingController.getInstance().formatCurrency(j, "USD");
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
}
