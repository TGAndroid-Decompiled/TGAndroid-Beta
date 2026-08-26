package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_label.zzcx;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;

public class FlickerLoadingView extends View implements Theme.Colorable {
    public Paint backgroundPaint;
    public int color0;
    public int color1;
    public int colorKey1;
    public int colorKey2;
    public int colorKey3;
    public FlickerLoadingView globalGradientView;
    public LinearGradient gradient;
    public int gradientWidth;
    public final Paint headerPaint;
    public boolean ignoreHeightCheck;
    public boolean isSingleCell;
    public int itemsCount;
    public long lastUpdateTime;
    public final Matrix matrix;
    public float memberRequestButtonWidth;
    public int paddingLeft;
    public int paddingTop;
    public final Paint paint;
    public int parentHeight;
    public int parentWidth;
    public float parentXOffset;
    public float[] randomParams;
    public final RectF rectF;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean showDate;
    public int skipDrawItemsCount;
    public int totalTranslation;
    public boolean useHeaderOffset;
    public int viewType;

    public FlickerLoadingView(Context context) {
        this(context, null);
    }

    public final float checkRtl(float f) {
        return LocaleController.isRTL ? getMeasuredWidth() - f : f;
    }

    public int getAdditionalHeight() {
        return 0;
    }

    public final int getCellHeight(int i) {
        switch (getViewType()) {
            case 1:
                return AndroidUtilities.dp(78.0f) + 1;
            case 2:
                return AndroidUtilities.dp(2.0f) + ((i - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount());
            case 3:
            case 4:
                return AndroidUtilities.dp(56.0f);
            case 5:
                return AndroidUtilities.dp(80.0f);
            case 6:
            case 18:
                return AndroidUtilities.dp(64.0f);
            case 7:
                return AndroidUtilities.dp((SharedConfig.useThreeLinesLayout ? 78 : 72) + 1);
            case 8:
                return AndroidUtilities.dp(61.0f);
            case 9:
                return AndroidUtilities.dp(66.0f);
            case 10:
                return AndroidUtilities.dp(58.0f);
            case 11:
                return AndroidUtilities.dp(36.0f);
            case 12:
                return AndroidUtilities.dp(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            case 27:
            default:
                return 0;
            case 15:
                return AndroidUtilities.dp(107.0f);
            case 16:
            case 23:
                return AndroidUtilities.dp(50.0f);
            case 19:
                return AndroidUtilities.dp(58.0f);
            case 21:
                return AndroidUtilities.dp(58.0f);
            case 22:
                return AndroidUtilities.dp(60.0f);
            case 24:
                return AndroidUtilities.dp((SharedConfig.useThreeLinesLayout ? 76 : 64) + 1);
            case 25:
                return AndroidUtilities.dp(51.0f);
            case 26:
                return AndroidUtilities.dp(50.0f) + 1;
            case 28:
                return AndroidUtilities.dp(58.0f);
            case 29:
                return AndroidUtilities.dp(60.0f) + 1;
            case 30:
                return AndroidUtilities.dp(32.0f);
            case 31:
                return AndroidUtilities.dp(48.0f) + 1;
            case 32:
                return AndroidUtilities.dp(56.0f) + 1;
            case 33:
                return AndroidUtilities.dp(58.0f);
            case 34:
                return AndroidUtilities.dp(140.0f);
            case 35:
                return AndroidUtilities.dp(112.0f);
            case 36:
                return AndroidUtilities.dp(108.0f);
        }
    }

    public int[] getColorKeys() {
        return null;
    }

    public int getColumnsCount() {
        return 2;
    }

    public Paint getPaint() {
        return this.paint;
    }

    public final int getThemedColor$24(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public int getViewType() {
        return this.viewType;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float f;
        Paint paint2 = this.paint;
        if (this.globalGradientView != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                this.globalGradientView.setParentSize(-getX(), view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            paint2 = this.globalGradientView.paint;
        }
        Paint paint3 = paint2;
        if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
            this.parentXOffset = -getX();
        }
        updateColors$1();
        updateGradient();
        int iM = this.paddingTop;
        if (this.useHeaderOffset) {
            int iDp = AndroidUtilities.dp(32.0f) + iM;
            int i = this.colorKey3;
            if (i >= 0) {
                this.headerPaint.setColor(getThemedColor$24(i));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(32.0f), this.colorKey3 >= 0 ? this.headerPaint : paint3);
            canvas2 = canvas;
            iM = iDp;
        } else {
            canvas2 = canvas;
        }
        int viewType = getViewType();
        RectF rectF = this.rectF;
        float f2 = 76.0f;
        int i2 = 1;
        int i3 = 0;
        if (viewType == 7) {
            while (iM <= getMeasuredHeight()) {
                int cellHeight = getCellHeight(getMeasuredWidth());
                int iDp2 = AndroidUtilities.dp(28.0f);
                canvas2.drawCircle(checkRtl(AndroidUtilities.dp(10.0f) + iDp2), (cellHeight >> 1) + iM, iDp2, paint3);
                rectF.set(AndroidUtilities.dp(f2), AndroidUtilities.dp(16.0f) + iM, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + iM);
                checkRtl(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + iM, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + iM);
                checkRtl(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(54.0f) + iM, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + iM);
                    checkRtl(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                if (this.showDate) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + iM);
                    checkRtl(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                iM = zzcx.m(this, iM);
                int i4 = i3 + 1;
                if (this.isSingleCell && i4 >= this.itemsCount) {
                    break;
                }
                i3 = i4;
                f2 = 76.0f;
            }
        } else if (getViewType() == 24) {
            while (iM <= getMeasuredHeight()) {
                int iDp3 = AndroidUtilities.dp(14.0f);
                canvas2.drawCircle(checkRtl(AndroidUtilities.dp(10.0f) + iDp3), RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(iM, 10.0f, iDp3), iDp3, paint3);
                canvas2.save();
                canvas2.translate(0.0f, -AndroidUtilities.dp(4.0f));
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + iM, AndroidUtilities.dp(148.0f), AndroidUtilities.dp(24.0f) + iM);
                checkRtl(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(38.0f) + iM, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + iM);
                checkRtl(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                if (SharedConfig.useThreeLinesLayout) {
                    rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(54.0f) + iM, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + iM);
                    checkRtl(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                if (this.showDate) {
                    rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + iM);
                    checkRtl(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                }
                canvas2.restore();
                iM += getCellHeight(getMeasuredWidth());
                int i5 = i3 + 1;
                if (this.isSingleCell && i5 >= this.itemsCount) {
                    break;
                } else {
                    i3 = i5;
                }
            }
        } else if (getViewType() == 18) {
            int iM2 = iM;
            while (iM2 <= getMeasuredHeight()) {
                int iDp4 = AndroidUtilities.dp(25.0f);
                canvas2.drawCircle(checkRtl(RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.paddingLeft, 9.0f, iDp4)), AndroidUtilities.dp(32.0f) + iM2, iDp4, paint3);
                int i6 = i3 % 2 == 0 ? 52 : 72;
                float f3 = 76;
                rectF.set(AndroidUtilities.dp(f3), AndroidUtilities.dp(20.0f) + iM2, AndroidUtilities.dp(i6 + 76), AndroidUtilities.dp(28.0f) + iM2);
                checkRtl(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(i6 + 84), AndroidUtilities.dp(20.0f) + iM2, AndroidUtilities.dp(i6 + 168), AndroidUtilities.dp(28.0f) + iM2);
                checkRtl(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                rectF.set(AndroidUtilities.dp(f3), AndroidUtilities.dp(42.0f) + iM2, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + iM2);
                checkRtl(rectF);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                Canvas canvas3 = canvas2;
                Paint paint4 = paint3;
                canvas3.drawLine(AndroidUtilities.dp(f3), zzcx.m(this, iM2), getMeasuredWidth(), zzcx.m(this, iM2), paint4);
                canvas2 = canvas3;
                iM2 = zzcx.m(this, iM2);
                int i7 = i3 + 1;
                if (this.isSingleCell && i7 >= this.itemsCount) {
                    break;
                }
                i3 = i7;
                paint3 = paint4;
            }
        } else {
            Paint paint5 = paint3;
            if (getViewType() == 19) {
                int iM3 = iM;
                while (iM3 <= getMeasuredHeight()) {
                    int iDp5 = AndroidUtilities.dp(20.0f);
                    canvas2.drawCircle(checkRtl(RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.paddingLeft, 9.0f, iDp5)), AndroidUtilities.dp(29.0f) + iM3, iDp5, paint5);
                    float f4 = 76;
                    rectF.set(AndroidUtilities.dp(f4), AndroidUtilities.dp(16.0f) + iM3, AndroidUtilities.dp((i3 % 2 == 0 ? 92 : 128) + 76), AndroidUtilities.dp(24.0f) + iM3);
                    checkRtl(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    rectF.set(AndroidUtilities.dp(f4), AndroidUtilities.dp(38.0f) + iM3, AndroidUtilities.dp(240), AndroidUtilities.dp(46.0f) + iM3);
                    checkRtl(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    Canvas canvas4 = canvas2;
                    Paint paint6 = paint5;
                    canvas4.drawLine(AndroidUtilities.dp(f4), zzcx.m(this, iM3), getMeasuredWidth(), zzcx.m(this, iM3), paint6);
                    canvas2 = canvas4;
                    paint5 = paint6;
                    iM3 = zzcx.m(this, iM3);
                    int i8 = i3 + 1;
                    if (this.isSingleCell && i8 >= this.itemsCount) {
                        break;
                    } else {
                        i3 = i8;
                    }
                }
            } else if (getViewType() == 1) {
                while (iM <= getMeasuredHeight()) {
                    int iDp6 = AndroidUtilities.dp(25.0f);
                    canvas2.drawCircle(checkRtl(AndroidUtilities.dp(9.0f) + iDp6), (AndroidUtilities.dp(78.0f) >> 1) + iM, iDp6, paint5);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(20.0f) + iM, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(28.0f) + iM);
                    checkRtl(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(42.0f) + iM, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(50.0f) + iM);
                    checkRtl(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    if (this.showDate) {
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    }
                    iM = zzcx.m(this, iM);
                    int i9 = i3 + 1;
                    if (this.isSingleCell && i9 >= this.itemsCount) {
                        break;
                    } else {
                        i3 = i9;
                    }
                }
            } else if (getViewType() == 2 || getViewType() == 27) {
                int measuredWidth = (getMeasuredWidth() - ((getColumnsCount() - 1) * AndroidUtilities.dp(2.0f))) / getColumnsCount();
                int i10 = getViewType() == 27 ? (int) (measuredWidth * 1.25f) : measuredWidth;
                int iM4 = iM;
                int i11 = 0;
                while (true) {
                    if (iM4 >= getMeasuredHeight() && !this.isSingleCell) {
                        break;
                    }
                    int i12 = 0;
                    while (i12 < getColumnsCount()) {
                        if (i11 != 0 || i12 >= this.skipDrawItemsCount) {
                            int iDp7 = (AndroidUtilities.dp(2.0f) + measuredWidth) * i12;
                            paint = paint5;
                            canvas.drawRect(iDp7, iM4, iDp7 + measuredWidth, iM4 + i10, paint);
                        } else {
                            paint = paint5;
                        }
                        i12++;
                        paint5 = paint;
                    }
                    Paint paint7 = paint5;
                    iM4 = RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(i10, 2.0f, iM4);
                    i11++;
                    if (this.isSingleCell && i11 >= 2) {
                        break;
                    }
                    paint5 = paint7;
                }
            } else {
                float f5 = 8.0f;
                if (getViewType() == 3) {
                    while (iM <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f) + iM, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(48.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + iM, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + iM, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.showDate) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iM = zzcx.m(this, iM);
                        int i13 = i3 + 1;
                        if (this.isSingleCell && i13 >= this.itemsCount) {
                            break;
                        } else {
                            i3 = i13;
                        }
                    }
                } else if (getViewType() == 4) {
                    while (iM <= getMeasuredHeight()) {
                        int iDp8 = AndroidUtilities.dp(44.0f) >> 1;
                        canvas2.drawCircle(checkRtl(AndroidUtilities.dp(12.0f) + iDp8), RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(iM, 6.0f, iDp8), iDp8, paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + iM, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + iM, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.showDate) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iM = zzcx.m(this, iM);
                        int i14 = i3 + 1;
                        if (this.isSingleCell && i14 >= this.itemsCount) {
                            break;
                        } else {
                            i3 = i14;
                        }
                    }
                } else if (getViewType() == 5) {
                    while (iM <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(11.0f) + iM, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(63.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + iM, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + iM, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(42.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(54.0f) + iM, AndroidUtilities.dp(188.0f), AndroidUtilities.dp(62.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.showDate) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iM = zzcx.m(this, iM);
                        int i15 = i3 + 1;
                        if (this.isSingleCell && i15 >= this.itemsCount) {
                            break;
                        } else {
                            i3 = i15;
                        }
                    }
                } else if (getViewType() == 6 || getViewType() == 10) {
                    while (iM <= getMeasuredHeight()) {
                        int iDp9 = AndroidUtilities.dp(23.0f);
                        canvas2.drawCircle(checkRtl(RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.paddingLeft, 9.0f, iDp9)), (AndroidUtilities.dp(64.0f) >> 1) + iM, iDp9, paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.paddingLeft, AndroidUtilities.dp(17.0f) + iM, AndroidUtilities.dp(260.0f) + this.paddingLeft, AndroidUtilities.dp(25.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.paddingLeft, AndroidUtilities.dp(39.0f) + iM, AndroidUtilities.dp(140.0f) + this.paddingLeft, AndroidUtilities.dp(47.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.showDate) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iM = zzcx.m(this, iM);
                        int i16 = i3 + 1;
                        if (this.isSingleCell && i16 >= this.itemsCount) {
                            break;
                        } else {
                            i3 = i16;
                        }
                    }
                } else if (getViewType() == 29) {
                    while (iM <= getMeasuredHeight()) {
                        int iDp10 = AndroidUtilities.dp(23.0f);
                        canvas2.drawCircle(checkRtl(RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.paddingLeft, 9.0f, iDp10)), (AndroidUtilities.dp(64.0f) >> 1) + iM, iDp10, paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.paddingLeft, AndroidUtilities.dp(17.0f) + iM, AndroidUtilities.dp(260.0f) + this.paddingLeft, AndroidUtilities.dp(25.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.paddingLeft, AndroidUtilities.dp(39.0f) + iM, AndroidUtilities.dp(140.0f) + this.paddingLeft, AndroidUtilities.dp(47.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        iM = zzcx.m(this, iM);
                        int i17 = i3 + 1;
                        if (this.isSingleCell && i17 >= this.itemsCount) {
                            break;
                        } else {
                            i3 = i17;
                        }
                    }
                } else if (getViewType() == 33) {
                    while (iM <= getMeasuredHeight()) {
                        int iDp11 = AndroidUtilities.dp(23.0f);
                        canvas2.drawCircle(checkRtl(RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.paddingLeft, 13.0f, iDp11)), (AndroidUtilities.dp(58.0f) >> 1) + iM, iDp11, paint5);
                        rectF.set(AndroidUtilities.dp(72.0f) + this.paddingLeft, AndroidUtilities.dp(17.0f) + iM, AndroidUtilities.dp(260.0f) + this.paddingLeft, AndroidUtilities.dp(25.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f) + this.paddingLeft, AndroidUtilities.dp(39.0f) + iM, AndroidUtilities.dp(140.0f) + this.paddingLeft, AndroidUtilities.dp(47.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        iM = zzcx.m(this, iM);
                        int i18 = i3 + 1;
                        if (this.isSingleCell && i18 >= this.itemsCount) {
                            break;
                        } else {
                            i3 = i18;
                        }
                    }
                } else if (getViewType() == 30) {
                    while (iM <= getMeasuredHeight()) {
                        iM += getCellHeight(getMeasuredWidth());
                        rectF.set(0.0f, iM, getMeasuredWidth(), iM);
                        checkRtl(rectF);
                        canvas2.drawRect(rectF, paint5);
                        int i19 = i3 + 1;
                        if (this.isSingleCell && i19 >= this.itemsCount) {
                            break;
                        } else {
                            i3 = i19;
                        }
                    }
                } else if (getViewType() == 8) {
                    while (iM <= getMeasuredHeight()) {
                        int iDp12 = AndroidUtilities.dp(23.0f);
                        canvas2.drawCircle(checkRtl(RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.paddingLeft, 11.0f, iDp12)), (AndroidUtilities.dp(64.0f) >> 1) + iM, iDp12, paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.paddingLeft, AndroidUtilities.dp(17.0f) + iM, AndroidUtilities.dp(140.0f) + this.paddingLeft, AndroidUtilities.dp(25.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(68.0f) + this.paddingLeft, AndroidUtilities.dp(39.0f) + iM, AndroidUtilities.dp(260.0f) + this.paddingLeft, AndroidUtilities.dp(47.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.showDate) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iM = zzcx.m(this, iM);
                        int i20 = i3 + 1;
                        if (this.isSingleCell && i20 >= this.itemsCount) {
                            break;
                        } else {
                            i3 = i20;
                        }
                    }
                } else if (getViewType() == 9) {
                    while (iM <= getMeasuredHeight()) {
                        canvas2.drawCircle(checkRtl(AndroidUtilities.dp(35.0f)), (getCellHeight(getMeasuredWidth()) >> 1) + iM, AndroidUtilities.dp(32.0f) / 2, paint5);
                        rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(16.0f) + iM, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(24.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(38.0f) + iM, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(46.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        if (this.showDate) {
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iM = zzcx.m(this, iM);
                        int i21 = i3 + 1;
                        if (this.isSingleCell && i21 >= this.itemsCount) {
                            break;
                        } else {
                            i3 = i21;
                        }
                    }
                } else if (getViewType() == 11) {
                    int i22 = 0;
                    while (iM <= getMeasuredHeight()) {
                        rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.randomParams[0] * 40.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.randomParams[0] * 20.0f), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(14.0f));
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        iM = zzcx.m(this, iM);
                        i22++;
                        if (this.isSingleCell && i22 >= this.itemsCount) {
                            break;
                        }
                    }
                } else if (getViewType() == 12) {
                    int iDp13 = AndroidUtilities.dp(14.0f) + iM;
                    while (iDp13 <= getMeasuredHeight()) {
                        int measuredWidth2 = getMeasuredWidth() / 4;
                        for (int i23 = 0; i23 < 4; i23++) {
                            float f6 = (measuredWidth2 / 2.0f) + (measuredWidth2 * i23);
                            canvas2.drawCircle(f6, (AndroidUtilities.dp(56.0f) / 2.0f) + AndroidUtilities.dp(7.0f) + iDp13, AndroidUtilities.dp(28.0f), paint5);
                            float fDp = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(7.0f) + iDp13;
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(f6 - AndroidUtilities.dp(24.0f), fDp - AndroidUtilities.dp(4.0f), f6 + AndroidUtilities.dp(24.0f), fDp + AndroidUtilities.dp(4.0f));
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                        }
                        iDp13 = zzcx.m(this, iDp13);
                        if (this.isSingleCell) {
                            break;
                        }
                    }
                } else if (getViewType() == 13) {
                    float measuredHeight = getMeasuredHeight() / 2.0f;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    rectF3.set(AndroidUtilities.dp(40.0f), measuredHeight - AndroidUtilities.dp(4.0f), getMeasuredWidth() - AndroidUtilities.dp(120.0f), AndroidUtilities.dp(4.0f) + measuredHeight);
                    canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                    if (this.backgroundPaint == null) {
                        Paint paint8 = new Paint(1);
                        this.backgroundPaint = paint8;
                        paint8.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground));
                    }
                    for (int i24 = 0; i24 < 3; i24++) {
                        canvas2.drawCircle(RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(i24, 12.0f, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight, AndroidUtilities.dp(13.0f), this.backgroundPaint);
                        canvas2.drawCircle(RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(i24, 12.0f, AndroidUtilities.dp(13.0f) + (getMeasuredWidth() - AndroidUtilities.dp(56.0f))), measuredHeight, AndroidUtilities.dp(12.0f), paint5);
                    }
                } else if (getViewType() == 14 || getViewType() == 17) {
                    int iDp14 = AndroidUtilities.dp(12.0f);
                    int iDp15 = AndroidUtilities.dp(77.0f);
                    int iDp16 = AndroidUtilities.dp(4.0f);
                    float fDp2 = AndroidUtilities.dp(21.0f);
                    float fDp3 = AndroidUtilities.dp(41.0f);
                    while (iDp14 < getMeasuredWidth()) {
                        if (this.backgroundPaint == null) {
                            this.backgroundPaint = new Paint(i2);
                        }
                        this.backgroundPaint.setColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        int i25 = iDp14 + iDp15;
                        rectF4.set(AndroidUtilities.dp(4.0f) + iDp14, AndroidUtilities.dp(4.0f), i25 - AndroidUtilities.dp(4.0f), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                        canvas2.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                        if (getViewType() == 14) {
                            float fDp4 = AndroidUtilities.dp(f5) + iDp16;
                            float f7 = iDp14;
                            float fDp5 = AndroidUtilities.dp(22.0f) + iDp16 + f7;
                            rectF.set(fDp5, fDp4, fDp5 + fDp3, fDp4 + fDp2);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.backgroundPaint);
                            float fDp6 = AndroidUtilities.dp(5.0f) + iDp16;
                            float fDp7 = AndroidUtilities.dp(4.0f) + fDp2 + fDp4;
                            float f8 = f7 + fDp6;
                            rectF.set(f8, fDp7, f8 + fDp3, fDp7 + fDp2);
                            canvas2.drawRoundRect(rectF, rectF.height() * 0.5f, rectF.height() * 0.5f, this.backgroundPaint);
                        } else {
                            if (getViewType() == 17) {
                                float fDp8 = AndroidUtilities.dp(5.0f);
                                float fDp9 = AndroidUtilities.dp(32.0f);
                                f = 8.0f;
                                float fM = ImageReceiver$$ExternalSyntheticOutline0.m(iDp15, fDp9, 2.0f, iDp14);
                                int iDp17 = AndroidUtilities.dp(21.0f);
                                rectF4.set(fM, iDp17, fDp9 + fM, AndroidUtilities.dp(32.0f) + iDp17);
                                canvas2.drawRoundRect(rectF4, fDp8, fDp8, this.backgroundPaint);
                            }
                            canvas2.drawCircle((iDp15 / 2) + iDp14, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f), this.backgroundPaint);
                            iDp14 = i25;
                            i2 = 1;
                            f5 = 8.0f;
                        }
                        f = 8.0f;
                        canvas2.drawCircle((iDp15 / 2) + iDp14, getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(f), this.backgroundPaint);
                        iDp14 = i25;
                        i2 = 1;
                        f5 = 8.0f;
                    }
                } else if (getViewType() == 15) {
                    int iDp18 = AndroidUtilities.dp(23.0f);
                    int iDp19 = AndroidUtilities.dp(4.0f);
                    while (iM <= getMeasuredHeight()) {
                        canvas2.drawCircle(checkRtl(RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.paddingLeft, 12.0f, iDp18)), RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(iM, 8.0f, iDp18), iDp18, paint5);
                        rectF.set(AndroidUtilities.dp(74.0f) + this.paddingLeft, AndroidUtilities.dp(12.0f) + iM, AndroidUtilities.dp(260.0f) + this.paddingLeft, AndroidUtilities.dp(20.0f) + iM);
                        checkRtl(rectF);
                        float f9 = iDp19;
                        canvas2.drawRoundRect(rectF, f9, f9, paint5);
                        rectF.set(AndroidUtilities.dp(74.0f) + this.paddingLeft, AndroidUtilities.dp(36.0f) + iM, AndroidUtilities.dp(140.0f) + this.paddingLeft, AndroidUtilities.dp(42.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, f9, f9, paint5);
                        if (this.memberRequestButtonWidth > 0.0f) {
                            rectF.set(AndroidUtilities.dp(73.0f) + this.paddingLeft, AndroidUtilities.dp(62.0f) + iM, AndroidUtilities.dp(73.0f) + this.paddingLeft + this.memberRequestButtonWidth, AndroidUtilities.dp(94.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, f9, f9, paint5);
                        }
                        iM = zzcx.m(this, iM);
                        int i26 = i3 + 1;
                        if (this.isSingleCell && i26 >= this.itemsCount) {
                            break;
                        } else {
                            i3 = i26;
                        }
                    }
                } else if (getViewType() == 16 || getViewType() == 23) {
                    int i27 = 0;
                    while (iM <= getMeasuredHeight()) {
                        int iDp20 = AndroidUtilities.dp(18.0f);
                        canvas2.drawCircle(checkRtl(RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.paddingLeft, 8.0f, iDp20)), AndroidUtilities.dp(24.0f) + iM, iDp20, paint5);
                        rectF.set(AndroidUtilities.dp(58.0f) + this.paddingLeft, AndroidUtilities.dp(20.0f) + iM, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + iM);
                        checkRtl(rectF);
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                        if (i27 < 4) {
                            int iDp21 = AndroidUtilities.dp(12.0f);
                            canvas2.drawCircle(checkRtl(RichMessageLayout$$ExternalSyntheticOutline2.m(getWidth(), 12.0f, iDp21)), AndroidUtilities.dp(24.0f) + iM, iDp21, paint5);
                        }
                        iM = zzcx.m(this, iM);
                        i27++;
                        if (this.isSingleCell && i27 >= this.itemsCount) {
                            break;
                        }
                    }
                    rectF.set(AndroidUtilities.dp(8.0f) + this.paddingLeft, AndroidUtilities.dp(20.0f) + iM, getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(28.0f) + iM);
                    checkRtl(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                    rectF.set(AndroidUtilities.dp(8.0f) + this.paddingLeft, AndroidUtilities.dp(36.0f) + iM, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(44.0f) + iM);
                    checkRtl(rectF);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint5);
                } else {
                    int i28 = this.viewType;
                    if (i28 == 21) {
                        while (iM <= getMeasuredHeight()) {
                            int iDp22 = AndroidUtilities.dp(46.0f) >> 1;
                            canvas2.drawCircle(checkRtl(AndroidUtilities.dp(20.0f) + iDp22), (AndroidUtilities.dp(58.0f) >> 1) + iM, iDp22, paint5);
                            rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(16.0f) + iM, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(38.0f) + iM, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iM = zzcx.m(this, iM);
                            int i29 = i3 + 1;
                            if (this.isSingleCell && i29 >= this.itemsCount) {
                                break;
                            } else {
                                i3 = i29;
                            }
                        }
                    } else if (i28 == 22) {
                        while (iM <= getMeasuredHeight()) {
                            int iDp23 = AndroidUtilities.dp(48.0f) >> 1;
                            canvas2.drawCircle(checkRtl(AndroidUtilities.dp(20.0f) + iDp23), RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(iM, 6.0f, iDp23), iDp23, paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + iM, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + iM, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iM = zzcx.m(this, iM);
                            int i30 = i3 + 1;
                            if (this.isSingleCell && i30 >= this.itemsCount) {
                                break;
                            } else {
                                i3 = i30;
                            }
                        }
                    } else if (i28 == 25) {
                        while (iM <= getMeasuredHeight()) {
                            int iDp24 = AndroidUtilities.dp(38.0f) >> 1;
                            canvas2.drawCircle(AndroidUtilities.dp(17.0f) + iDp24, RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(iM, 6.0f, iDp24), iDp24, paint5);
                            rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(21.0f) + iM, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(29.0f) + iM);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iM = zzcx.m(this, iM);
                            int i31 = i3 + 1;
                            if (this.isSingleCell && i31 >= this.itemsCount) {
                                break;
                            } else {
                                i3 = i31;
                            }
                        }
                    } else if (i28 == 26) {
                        while (iM <= getMeasuredHeight()) {
                            int iDp25 = AndroidUtilities.dp(21.0f) >> 1;
                            canvas2.drawCircle(LocaleController.isRTL ? RichMessageLayout$$ExternalSyntheticOutline2.m(getMeasuredWidth(), 21.0f, iDp25) : AndroidUtilities.dp(21.0f) + iDp25, RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(iM, 16.0f, iDp25), iDp25, paint5);
                            rectF.set(AndroidUtilities.dp(60.0f), AndroidUtilities.dp(21.0f) + iM, AndroidUtilities.dp(190.0f), AndroidUtilities.dp(29.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(getMeasuredWidth() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(21.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(62.0f), AndroidUtilities.dp(29.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iM = zzcx.m(this, iM);
                            int i32 = i3 + 1;
                            if (this.isSingleCell && i32 >= this.itemsCount) {
                                break;
                            } else {
                                i3 = i32;
                            }
                        }
                    } else if (getViewType() == 28) {
                        while (iM <= getMeasuredHeight()) {
                            int iDp26 = AndroidUtilities.dp(24.0f);
                            canvas2.drawCircle(checkRtl(RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(this.paddingLeft, 10.0f, iDp26)), (AndroidUtilities.dp(58.0f) >> 1) + iM, iDp26, paint5);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.paddingLeft, AndroidUtilities.dp(17.0f) + iM, AndroidUtilities.dp(260.0f) + this.paddingLeft, AndroidUtilities.dp(25.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(68.0f) + this.paddingLeft, AndroidUtilities.dp(39.0f) + iM, AndroidUtilities.dp(140.0f) + this.paddingLeft, AndroidUtilities.dp(47.0f) + iM);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            if (this.showDate) {
                                rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + iM, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + iM);
                                checkRtl(rectF);
                                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            }
                            iM = zzcx.m(this, iM);
                            int i33 = i3 + 1;
                            if (this.isSingleCell && i33 >= this.itemsCount) {
                                break;
                            } else {
                                i3 = i33;
                            }
                        }
                    } else if (getViewType() == 31) {
                        while (iM <= getMeasuredHeight()) {
                            int cellHeight2 = getCellHeight(getMeasuredWidth());
                            float f10 = iM;
                            rectF.set(AndroidUtilities.dp(18.0f) + this.paddingLeft, ((cellHeight2 - AndroidUtilities.dp(22.0f)) / 2.0f) + f10, AndroidUtilities.dp(40.0f) + this.paddingLeft, ((AndroidUtilities.dp(22.0f) + cellHeight2) / 2.0f) + f10);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint5);
                            rectF.set(AndroidUtilities.dp(58.0f) + this.paddingLeft, ((cellHeight2 - AndroidUtilities.dp(8.0f)) / 2.0f) + f10, Math.min(AndroidUtilities.dp(132.0f) + this.paddingLeft, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + cellHeight2) / 2.0f) + f10);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iM += cellHeight2;
                            int i34 = i3 + 1;
                            if (this.isSingleCell && i34 >= this.itemsCount) {
                                break;
                            } else {
                                i3 = i34;
                            }
                        }
                    } else if (getViewType() == 32) {
                        while (iM <= getMeasuredHeight()) {
                            int cellHeight3 = getCellHeight(getMeasuredWidth());
                            float f11 = iM;
                            rectF.set(AndroidUtilities.dp(10.0f) + this.paddingLeft, ((cellHeight3 - AndroidUtilities.dp(32.0f)) / 2.0f) + f11, AndroidUtilities.dp(42.0f) + this.paddingLeft, ((AndroidUtilities.dp(32.0f) + cellHeight3) / 2.0f) + f11);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                            rectF.set(AndroidUtilities.dp(64.0f) + this.paddingLeft, (((cellHeight3 - AndroidUtilities.dp(14.0f)) - AndroidUtilities.dp(10.0f)) / 2.0f) + f11, Math.min(AndroidUtilities.dp(118.0f) + this.paddingLeft, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(10.0f) + (cellHeight3 - AndroidUtilities.dp(14.0f))) / 2.0f) + f11);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            rectF.set(AndroidUtilities.dp(64.0f) + this.paddingLeft, (((AndroidUtilities.dp(14.0f) + cellHeight3) - AndroidUtilities.dp(8.0f)) / 2.0f) + f11, Math.min(AndroidUtilities.dp(144.0f) + this.paddingLeft, getMeasuredWidth() - AndroidUtilities.dp(19.0f)), ((AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(14.0f) + cellHeight3)) / 2.0f) + f11);
                            checkRtl(rectF);
                            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint5);
                            iM += cellHeight3;
                            int i35 = i3 + 1;
                            if (this.isSingleCell && i35 >= this.itemsCount) {
                                break;
                            } else {
                                i3 = i35;
                            }
                        }
                    } else if (getViewType() == 34 || getViewType() == 35 || getViewType() == 36) {
                        rectF.set(this.paddingLeft, this.paddingTop, getMeasuredWidth() - this.paddingLeft, getMeasuredHeight() - this.paddingTop);
                        rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint5);
                    }
                }
            }
        }
        invalidate();
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (!this.isSingleCell) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = this.itemsCount;
        if (i3 > 1 && this.ignoreHeightCheck) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + (getCellHeight(View.MeasureSpec.getSize(i)) * this.itemsCount), 1073741824));
        } else if (i3 <= 1 || View.MeasureSpec.getSize(i2) <= 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + getCellHeight(View.MeasureSpec.getSize(i)), 1073741824));
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAdditionalHeight() + Math.min(View.MeasureSpec.getSize(i2), getCellHeight(View.MeasureSpec.getSize(i)) * this.itemsCount), 1073741824));
        }
    }

    public void setGlobalGradientView(FlickerLoadingView flickerLoadingView) {
        this.globalGradientView = flickerLoadingView;
    }

    public void setIgnoreHeightCheck(boolean z) {
        this.ignoreHeightCheck = z;
    }

    public void setIsSingleCell(boolean z) {
        this.isSingleCell = z;
    }

    public void setItemsCount(int i) {
        this.itemsCount = i;
    }

    public void setMemberRequestButton(boolean z) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.memberRequestButtonWidth = textPaint.measureText(LocaleController.getString(z ? R.string.AddToChannel : R.string.AddToGroup)) + AndroidUtilities.dp(34.0f);
    }

    public void setPaddingLeft(int i) {
        this.paddingLeft = i;
        invalidate();
    }

    public void setPaddingTop(int i) {
        this.paddingTop = i;
        invalidate();
    }

    public final void setParentSize(float f, int i, int i2) {
        this.parentWidth = i;
        this.parentHeight = i2;
        this.parentXOffset = f;
    }

    public void setUseHeaderOffset(boolean z) {
        this.useHeaderOffset = z;
    }

    public void setViewType(int i) {
        this.viewType = i;
        if (i == 11) {
            Random random = new Random();
            this.randomParams = new float[2];
            for (int i2 = 0; i2 < 2; i2++) {
                this.randomParams[i2] = Math.abs(random.nextInt() % 1000) / 1000.0f;
            }
        }
        invalidate();
    }

    public final void showDate() {
        this.showDate = false;
    }

    @Override
    public final void updateColors$1() {
        int i;
        FlickerLoadingView flickerLoadingView = this.globalGradientView;
        if (flickerLoadingView != null) {
            flickerLoadingView.updateColors$1();
            return;
        }
        int i2 = this.colorKey1;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(i2, resourcesProvider);
        int color2 = Theme.getColor(this.colorKey2, resourcesProvider);
        if (this.color1 == color2 && this.color0 == color) {
            return;
        }
        this.color0 = color;
        this.color1 = color2;
        int i3 = this.viewType;
        if (i3 == 34 || i3 == 35 || i3 == 36) {
            this.gradientWidth = AndroidUtilities.displaySize.x;
        } else if (this.isSingleCell || i3 == 13 || i3 == 14 || i3 == 17) {
            this.gradientWidth = AndroidUtilities.dp(200.0f);
        } else {
            this.gradientWidth = AndroidUtilities.dp(600.0f);
        }
        if (this.isSingleCell || (i = this.viewType) == 13 || i == 14 || i == 17) {
            this.gradient = new LinearGradient(0.0f, 0.0f, this.gradientWidth, 0.0f, new int[]{color2, color, color, color2}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.gradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.gradientWidth, new int[]{color2, color, color, color2}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.paint.setShader(this.gradient);
    }

    public final void updateGradient() {
        FlickerLoadingView flickerLoadingView = this.globalGradientView;
        if (flickerLoadingView != null) {
            flickerLoadingView.updateGradient();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jAbs = Math.abs(this.lastUpdateTime - jElapsedRealtime);
        if (jAbs > 17) {
            jAbs = 16;
        }
        if (jAbs < 4) {
            jAbs = 0;
        }
        int iMax = this.parentWidth;
        if (iMax == 0) {
            iMax = getMeasuredWidth();
        }
        int i = this.viewType;
        if (i == 34 || i == 35 || i == 36) {
            iMax = Math.max(iMax, AndroidUtilities.displaySize.x);
        }
        int measuredHeight = this.parentHeight;
        if (measuredHeight == 0) {
            measuredHeight = getMeasuredHeight();
        }
        this.lastUpdateTime = jElapsedRealtime;
        boolean z = this.isSingleCell;
        Matrix matrix = this.matrix;
        if (z || this.viewType == 13 || getViewType() == 14 || getViewType() == 17) {
            int i2 = (int) (((jAbs * ((long) iMax)) / 400.0f) + this.totalTranslation);
            this.totalTranslation = i2;
            if (i2 >= iMax * 2) {
                this.totalTranslation = (-this.gradientWidth) * 2;
            }
            matrix.setTranslate(this.totalTranslation + this.parentXOffset, 0.0f);
        } else {
            int i3 = (int) (((jAbs * ((long) measuredHeight)) / 400.0f) + this.totalTranslation);
            this.totalTranslation = i3;
            if (i3 >= measuredHeight * 2) {
                this.totalTranslation = (-this.gradientWidth) * 2;
            }
            matrix.setTranslate(this.parentXOffset, this.totalTranslation);
        }
        LinearGradient linearGradient = this.gradient;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public FlickerLoadingView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.paint = new Paint();
        this.headerPaint = new Paint();
        this.rectF = new RectF();
        this.showDate = true;
        this.colorKey1 = Theme.key_actionBarDefaultSubmenuBackground;
        this.colorKey2 = Theme.key_listSelector;
        this.colorKey3 = -1;
        this.itemsCount = 1;
        this.resourcesProvider = resourcesProvider;
        this.matrix = new Matrix();
    }

    public final void checkRtl(RectF rectF) {
        if (LocaleController.isRTL) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }
}
