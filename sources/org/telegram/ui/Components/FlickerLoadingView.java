package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;

public class FlickerLoadingView extends View {
    private Paint backgroundPaint;
    private int color0;
    private int color1;
    private String colorKey1;
    private String colorKey2;
    private String colorKey3;
    FlickerLoadingView globalGradientView;
    private LinearGradient gradient;
    private int gradientWidth;
    private Paint headerPaint;
    private boolean isSingleCell;
    private int itemsCount;
    private long lastUpdateTime;
    private Matrix matrix;
    private int paddingLeft;
    private int paddingTop;
    private Paint paint;
    private int parentHeight;
    private int parentWidth;
    private float parentXOffset;
    float[] randomParams;
    private RectF rectF;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean showDate;
    private int skipDrawItemsCount;
    private int totalTranslation;
    private boolean useHeaderOffset;
    private int viewType;

    public int getColumnsCount() {
        return 2;
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

    public void setIsSingleCell(boolean z) {
        this.isSingleCell = z;
    }

    public int getViewType() {
        return this.viewType;
    }

    public void setColors(String str, String str2, String str3) {
        this.colorKey1 = str;
        this.colorKey2 = str2;
        this.colorKey3 = str3;
        invalidate();
    }

    public FlickerLoadingView(Context context) {
        this(context, null);
    }

    public FlickerLoadingView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.paint = new Paint();
        this.headerPaint = new Paint();
        this.rectF = new RectF();
        this.showDate = true;
        this.colorKey1 = "windowBackgroundWhite";
        this.colorKey2 = "windowBackgroundGray";
        this.itemsCount = 1;
        this.resourcesProvider = resourcesProvider;
        this.matrix = new Matrix();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (!this.isSingleCell) {
            super.onMeasure(i, i2);
        } else if (this.itemsCount > 1 && ignoreHeightCheck()) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCellHeight(View.MeasureSpec.getSize(i)) * this.itemsCount, 1073741824));
        } else if (this.itemsCount <= 1 || View.MeasureSpec.getSize(i2) <= 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCellHeight(View.MeasureSpec.getSize(i)), 1073741824));
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getCellHeight(View.MeasureSpec.getSize(i)) * this.itemsCount), 1073741824));
        }
    }

    private boolean ignoreHeightCheck() {
        return this.viewType == 18;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int dp;
        int dp2;
        int dp3;
        int dp4;
        int dp5;
        int dp6;
        int dp7;
        int dp8;
        int dp9;
        int dp10;
        Paint paint = this.paint;
        if (this.globalGradientView != null) {
            if (getParent() != null) {
                View view = (View) getParent();
                this.globalGradientView.setParentSize(view.getMeasuredWidth(), view.getMeasuredHeight(), -getX());
            }
            paint = this.globalGradientView.paint;
        }
        Paint paint2 = paint;
        updateColors();
        updateGradient();
        int i = this.paddingTop;
        float f = 32.0f;
        if (this.useHeaderOffset) {
            i += AndroidUtilities.dp(32.0f);
            String str = this.colorKey3;
            if (str != null) {
                this.headerPaint.setColor(getThemedColor(str));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(32.0f), this.colorKey3 != null ? this.headerPaint : paint2);
        }
        float f2 = 28.0f;
        int i2 = 0;
        int i3 = 1;
        float f3 = 4.0f;
        if (getViewType() == 7) {
            while (i <= getMeasuredHeight()) {
                int cellHeight = getCellHeight(getMeasuredWidth());
                canvas.drawCircle(checkRtl(AndroidUtilities.dp(10.0f) + dp10), (cellHeight >> 1) + i, AndroidUtilities.dp(f2), paint2);
                this.rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i, AndroidUtilities.dp(148.0f), i + AndroidUtilities.dp(24.0f));
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                this.rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + i);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                if (SharedConfig.useThreeLinesLayout) {
                    this.rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(54.0f) + i, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                }
                if (this.showDate) {
                    this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                }
                i += getCellHeight(getMeasuredWidth());
                i2++;
                if (this.isSingleCell && i2 >= this.itemsCount) {
                    break;
                }
                f2 = 28.0f;
            }
        } else {
            float f4 = 25.0f;
            float f5 = 42.0f;
            if (getViewType() == 18) {
                int i4 = i;
                int i5 = 0;
                while (i4 <= getMeasuredHeight()) {
                    canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(9.0f) + dp9), AndroidUtilities.dp(f) + i4, AndroidUtilities.dp(25.0f), paint2);
                    float f6 = 76;
                    int i6 = (i5 % 2 == 0 ? 52 : 72) + 76;
                    this.rectF.set(AndroidUtilities.dp(f6), AndroidUtilities.dp(20.0f) + i4, AndroidUtilities.dp(i6), i4 + AndroidUtilities.dp(28.0f));
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                    int i7 = i6 + 8;
                    this.rectF.set(AndroidUtilities.dp(i7), AndroidUtilities.dp(20.0f) + i4, AndroidUtilities.dp(i7 + 84), AndroidUtilities.dp(28.0f) + i4);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                    this.rectF.set(AndroidUtilities.dp(f6), AndroidUtilities.dp(42.0f) + i4, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + i4);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                    canvas.drawLine(AndroidUtilities.dp(f6), getCellHeight(getMeasuredWidth()) + i4, getMeasuredWidth(), getCellHeight(getMeasuredWidth()) + i4, paint2);
                    i4 += getCellHeight(getMeasuredWidth());
                    i5++;
                    if (this.isSingleCell && i5 >= this.itemsCount) {
                        break;
                    }
                    f = 32.0f;
                }
            } else {
                float f7 = 140.0f;
                if (getViewType() == 1) {
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(AndroidUtilities.dp(9.0f) + dp8), (AndroidUtilities.dp(78.0f) >> 1) + i, AndroidUtilities.dp(f4), paint2);
                        this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(20.0f) + i, AndroidUtilities.dp(f7), i + AndroidUtilities.dp(28.0f));
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(42.0f) + i, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(50.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        if (this.showDate) {
                            this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), i + AndroidUtilities.dp(28.0f));
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        }
                        i += getCellHeight(getMeasuredWidth());
                        i2++;
                        if (this.isSingleCell && i2 >= this.itemsCount) {
                            break;
                        }
                        f7 = 140.0f;
                        f4 = 25.0f;
                    }
                } else {
                    int i8 = 2;
                    if (getViewType() == 2) {
                        int measuredWidth = (getMeasuredWidth() - (AndroidUtilities.dp(2.0f) * (getColumnsCount() - 1))) / getColumnsCount();
                        int i9 = i;
                        int i10 = 0;
                        while (true) {
                            if (i9 >= getMeasuredHeight() && !this.isSingleCell) {
                                break;
                            }
                            for (int i11 = 0; i11 < getColumnsCount(); i11++) {
                                if (i10 != 0 || i11 >= this.skipDrawItemsCount) {
                                    canvas.drawRect((measuredWidth + AndroidUtilities.dp(2.0f)) * i11, i9, dp7 + measuredWidth, i9 + measuredWidth, paint2);
                                }
                            }
                            i9 += measuredWidth + AndroidUtilities.dp(2.0f);
                            i10++;
                            if (this.isSingleCell && i10 >= 2) {
                                break;
                            }
                        }
                    } else if (getViewType() == 3) {
                        while (i <= getMeasuredHeight()) {
                            this.rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f) + i, AndroidUtilities.dp(52.0f), AndroidUtilities.dp(48.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            if (this.showDate) {
                                this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            }
                            i += getCellHeight(getMeasuredWidth());
                            i2++;
                            if (this.isSingleCell && i2 >= this.itemsCount) {
                                break;
                            }
                        }
                    } else if (getViewType() == 4) {
                        while (i <= getMeasuredHeight()) {
                            canvas.drawCircle(checkRtl(AndroidUtilities.dp(12.0f) + dp6), AndroidUtilities.dp(6.0f) + i + dp6, AndroidUtilities.dp(44.0f) >> 1, paint2);
                            this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(42.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            if (this.showDate) {
                                this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            }
                            i += getCellHeight(getMeasuredWidth());
                            i2++;
                            if (this.isSingleCell && i2 >= this.itemsCount) {
                                break;
                            }
                        }
                    } else if (getViewType() == 5) {
                        while (i <= getMeasuredHeight()) {
                            this.rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(11.0f) + i, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(63.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(12.0f) + i, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(20.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(34.0f) + i, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(42.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(54.0f) + i, AndroidUtilities.dp(188.0f), AndroidUtilities.dp(62.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            if (this.showDate) {
                                this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(12.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            }
                            i += getCellHeight(getMeasuredWidth());
                            i2++;
                            if (this.isSingleCell && i2 >= this.itemsCount) {
                                break;
                            }
                        }
                    } else if (getViewType() == 6 || getViewType() == 10) {
                        while (i <= getMeasuredHeight()) {
                            canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(9.0f) + dp), (AndroidUtilities.dp(64.0f) >> 1) + i, AndroidUtilities.dp(23.0f), paint2);
                            this.rectF.set(this.paddingLeft + AndroidUtilities.dp(68.0f), AndroidUtilities.dp(17.0f) + i, this.paddingLeft + AndroidUtilities.dp(260.0f), AndroidUtilities.dp(25.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(this.paddingLeft + AndroidUtilities.dp(68.0f), AndroidUtilities.dp(39.0f) + i, this.paddingLeft + AndroidUtilities.dp(140.0f), AndroidUtilities.dp(47.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            if (this.showDate) {
                                this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            }
                            i += getCellHeight(getMeasuredWidth());
                            i2++;
                            if (this.isSingleCell && i2 >= this.itemsCount) {
                                break;
                            }
                        }
                    } else if (getViewType() == 8) {
                        while (i <= getMeasuredHeight()) {
                            canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(11.0f) + dp5), (AndroidUtilities.dp(64.0f) >> 1) + i, AndroidUtilities.dp(23.0f), paint2);
                            this.rectF.set(this.paddingLeft + AndroidUtilities.dp(68.0f), AndroidUtilities.dp(17.0f) + i, this.paddingLeft + AndroidUtilities.dp(140.0f), AndroidUtilities.dp(25.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(this.paddingLeft + AndroidUtilities.dp(68.0f), AndroidUtilities.dp(39.0f) + i, this.paddingLeft + AndroidUtilities.dp(260.0f), AndroidUtilities.dp(47.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            if (this.showDate) {
                                this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            }
                            i += getCellHeight(getMeasuredWidth());
                            i2++;
                            if (this.isSingleCell && i2 >= this.itemsCount) {
                                break;
                            }
                        }
                    } else if (getViewType() == 9) {
                        while (i <= getMeasuredHeight()) {
                            canvas.drawCircle(checkRtl(AndroidUtilities.dp(35.0f)), (getCellHeight(getMeasuredWidth()) >> 1) + i, AndroidUtilities.dp(32.0f) / i8, paint2);
                            this.rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(16.0f) + i, AndroidUtilities.dp(268.0f), i + AndroidUtilities.dp(24.0f));
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(38.0f) + i, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(46.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            if (this.showDate) {
                                this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            }
                            i += getCellHeight(getMeasuredWidth());
                            i2++;
                            if (this.isSingleCell && i2 >= this.itemsCount) {
                                break;
                            }
                            i8 = 2;
                        }
                    } else {
                        float f8 = 0.5f;
                        if (getViewType() == 11) {
                            int i12 = 0;
                            while (i <= getMeasuredHeight()) {
                                this.rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.randomParams[0] * 40.0f), AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(8.0f));
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.randomParams[0] * 20.0f), AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(8.0f));
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                i += getCellHeight(getMeasuredWidth());
                                i12++;
                                if (this.isSingleCell && i12 >= this.itemsCount) {
                                    break;
                                }
                            }
                        } else if (getViewType() == 12) {
                            int dp11 = i + AndroidUtilities.dp(14.0f);
                            while (dp11 <= getMeasuredHeight()) {
                                int measuredWidth2 = getMeasuredWidth() / 4;
                                int i13 = 0;
                                for (int i14 = 4; i13 < i14; i14 = 4) {
                                    float f9 = (measuredWidth2 * i13) + (measuredWidth2 / 2.0f);
                                    canvas.drawCircle(f9, AndroidUtilities.dp(7.0f) + dp11 + (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(28.0f), paint2);
                                    float dp12 = AndroidUtilities.dp(7.0f) + dp11 + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(16.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(f9 - AndroidUtilities.dp(24.0f), dp12 - AndroidUtilities.dp(4.0f), f9 + AndroidUtilities.dp(24.0f), dp12 + AndroidUtilities.dp(4.0f));
                                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                    i13++;
                                }
                                dp11 += getCellHeight(getMeasuredWidth());
                                if (this.isSingleCell) {
                                    break;
                                }
                            }
                        } else if (getViewType() == 13) {
                            float measuredHeight = getMeasuredHeight() / 2.0f;
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(AndroidUtilities.dp(40.0f), measuredHeight - AndroidUtilities.dp(4.0f), getMeasuredWidth() - AndroidUtilities.dp(120.0f), AndroidUtilities.dp(4.0f) + measuredHeight);
                            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            if (this.backgroundPaint == null) {
                                Paint paint3 = new Paint(1);
                                this.backgroundPaint = paint3;
                                paint3.setColor(Theme.getColor("actionBarDefaultSubmenuBackground"));
                            }
                            while (i2 < 3) {
                                canvas.drawCircle((getMeasuredWidth() - AndroidUtilities.dp(56.0f)) + AndroidUtilities.dp(13.0f) + (AndroidUtilities.dp(12.0f) * i2), measuredHeight, AndroidUtilities.dp(13.0f), this.backgroundPaint);
                                canvas.drawCircle((getMeasuredWidth() - AndroidUtilities.dp(56.0f)) + AndroidUtilities.dp(13.0f) + (AndroidUtilities.dp(12.0f) * i2), measuredHeight, AndroidUtilities.dp(12.0f), paint2);
                                i2++;
                            }
                        } else if (getViewType() == 14 || getViewType() == 17) {
                            int dp13 = AndroidUtilities.dp(12.0f);
                            int dp14 = AndroidUtilities.dp(77.0f);
                            int dp15 = AndroidUtilities.dp(4.0f);
                            float dp16 = AndroidUtilities.dp(21.0f);
                            float dp17 = AndroidUtilities.dp(41.0f);
                            while (dp13 < getMeasuredWidth()) {
                                if (this.backgroundPaint == null) {
                                    Paint paint4 = new Paint(i3);
                                    this.backgroundPaint = paint4;
                                    paint4.setColor(Theme.getColor("dialogBackground"));
                                }
                                RectF rectF3 = AndroidUtilities.rectTmp;
                                int i15 = dp13 + dp14;
                                rectF3.set(AndroidUtilities.dp(f3) + dp13, AndroidUtilities.dp(f3), i15 - AndroidUtilities.dp(f3), getMeasuredHeight() - AndroidUtilities.dp(f3));
                                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
                                if (getViewType() == 14) {
                                    float dp18 = AndroidUtilities.dp(8.0f) + dp15;
                                    float f10 = dp13;
                                    float dp19 = AndroidUtilities.dp(22.0f) + dp15 + f10;
                                    this.rectF.set(dp19, dp18, dp19 + dp17, dp18 + dp16);
                                    RectF rectF4 = this.rectF;
                                    canvas.drawRoundRect(rectF4, rectF4.height() * f8, this.rectF.height() * f8, this.backgroundPaint);
                                    float dp20 = dp18 + AndroidUtilities.dp(4.0f) + dp16;
                                    float dp21 = f10 + AndroidUtilities.dp(5.0f) + dp15;
                                    this.rectF.set(dp21, dp20, dp21 + dp17, dp20 + dp16);
                                    RectF rectF5 = this.rectF;
                                    canvas.drawRoundRect(rectF5, rectF5.height() * f8, this.rectF.height() * f8, this.backgroundPaint);
                                } else if (getViewType() == 17) {
                                    float dp22 = AndroidUtilities.dp(5.0f);
                                    float dp23 = AndroidUtilities.dp(32.0f);
                                    float f11 = dp13 + ((dp14 - dp23) / 2.0f);
                                    rectF3.set(f11, AndroidUtilities.dp(21.0f), dp23 + f11, dp2 + AndroidUtilities.dp(32.0f));
                                    canvas.drawRoundRect(rectF3, dp22, dp22, this.backgroundPaint);
                                    canvas.drawCircle(dp13 + (dp14 / 2), getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(8.0f), this.backgroundPaint);
                                    dp13 = i15;
                                    f8 = 0.5f;
                                    i3 = 1;
                                    f3 = 4.0f;
                                }
                                canvas.drawCircle(dp13 + (dp14 / 2), getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(8.0f), this.backgroundPaint);
                                dp13 = i15;
                                f8 = 0.5f;
                                i3 = 1;
                                f3 = 4.0f;
                            }
                        } else if (getViewType() == 15) {
                            int dp24 = AndroidUtilities.dp(23.0f);
                            int dp25 = AndroidUtilities.dp(4.0f);
                            while (i <= getMeasuredHeight()) {
                                float f12 = dp24;
                                canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(12.0f)) + f12, AndroidUtilities.dp(8.0f) + i + dp24, f12, paint2);
                                this.rectF.set(this.paddingLeft + AndroidUtilities.dp(74.0f), AndroidUtilities.dp(12.0f) + i, this.paddingLeft + AndroidUtilities.dp(260.0f), AndroidUtilities.dp(20.0f) + i);
                                checkRtl(this.rectF);
                                float f13 = dp25;
                                canvas.drawRoundRect(this.rectF, f13, f13, paint2);
                                this.rectF.set(this.paddingLeft + AndroidUtilities.dp(74.0f), AndroidUtilities.dp(36.0f) + i, this.paddingLeft + AndroidUtilities.dp(140.0f), i + AndroidUtilities.dp(f5));
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, f13, f13, paint2);
                                i += getCellHeight(getMeasuredWidth());
                                i2++;
                                if (this.isSingleCell && i2 >= this.itemsCount) {
                                    break;
                                }
                                f5 = 42.0f;
                            }
                        } else if (getViewType() == 16) {
                            while (i <= getMeasuredHeight()) {
                                canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(8.0f) + dp3), AndroidUtilities.dp(24.0f) + i, AndroidUtilities.dp(18.0f), paint2);
                                this.rectF.set(this.paddingLeft + AndroidUtilities.dp(58.0f), AndroidUtilities.dp(20.0f) + i, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint2);
                                if (i2 < 4) {
                                    canvas.drawCircle(checkRtl((getWidth() - AndroidUtilities.dp(12.0f)) - dp4), AndroidUtilities.dp(24.0f) + i, AndroidUtilities.dp(12.0f), paint2);
                                }
                                i += getCellHeight(getMeasuredWidth());
                                i2++;
                                if (this.isSingleCell && i2 >= this.itemsCount) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        invalidate();
    }

    public void updateGradient() {
        FlickerLoadingView flickerLoadingView = this.globalGradientView;
        if (flickerLoadingView != null) {
            flickerLoadingView.updateGradient();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.lastUpdateTime - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int i = this.parentWidth;
        if (i == 0) {
            i = getMeasuredWidth();
        }
        int i2 = this.parentHeight;
        if (i2 == 0) {
            i2 = getMeasuredHeight();
        }
        this.lastUpdateTime = elapsedRealtime;
        if (this.isSingleCell || this.viewType == 13 || getViewType() == 14 || getViewType() == 17) {
            int i3 = (int) (this.totalTranslation + (((float) (abs * i)) / 400.0f));
            this.totalTranslation = i3;
            if (i3 >= i * 2) {
                this.totalTranslation = (-this.gradientWidth) * 2;
            }
            this.matrix.setTranslate(this.totalTranslation + this.parentXOffset, 0.0f);
        } else {
            int i4 = (int) (this.totalTranslation + (((float) (abs * i2)) / 400.0f));
            this.totalTranslation = i4;
            if (i4 >= i2 * 2) {
                this.totalTranslation = (-this.gradientWidth) * 2;
            }
            this.matrix.setTranslate(this.parentXOffset, this.totalTranslation);
        }
        LinearGradient linearGradient = this.gradient;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(this.matrix);
        }
    }

    public void updateColors() {
        int i;
        FlickerLoadingView flickerLoadingView = this.globalGradientView;
        if (flickerLoadingView != null) {
            flickerLoadingView.updateColors();
            return;
        }
        int themedColor = getThemedColor(this.colorKey1);
        int themedColor2 = getThemedColor(this.colorKey2);
        if (this.color1 != themedColor2 || this.color0 != themedColor) {
            this.color0 = themedColor;
            this.color1 = themedColor2;
            if (this.isSingleCell || (i = this.viewType) == 13 || i == 14 || i == 17) {
                int dp = AndroidUtilities.dp(200.0f);
                this.gradientWidth = dp;
                this.gradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{themedColor2, themedColor, themedColor, themedColor2}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            } else {
                int dp2 = AndroidUtilities.dp(600.0f);
                this.gradientWidth = dp2;
                this.gradient = new LinearGradient(0.0f, 0.0f, 0.0f, dp2, new int[]{themedColor2, themedColor, themedColor, themedColor2}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            }
            this.paint.setShader(this.gradient);
        }
    }

    private float checkRtl(float f) {
        return LocaleController.isRTL ? getMeasuredWidth() - f : f;
    }

    private void checkRtl(RectF rectF) {
        if (LocaleController.isRTL) {
            rectF.left = getMeasuredWidth() - rectF.left;
            rectF.right = getMeasuredWidth() - rectF.right;
        }
    }

    private int getCellHeight(int i) {
        switch (getViewType()) {
            case 1:
                return AndroidUtilities.dp(78.0f) + 1;
            case 2:
                return ((i - (AndroidUtilities.dp(2.0f) * (getColumnsCount() - 1))) / getColumnsCount()) + AndroidUtilities.dp(2.0f);
            case 3:
            case 4:
                return AndroidUtilities.dp(56.0f);
            case 5:
                return AndroidUtilities.dp(80.0f);
            case 6:
            case R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom:
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
            default:
                return 0;
            case 15:
                return AndroidUtilities.dp(107.0f);
            case 16:
                return AndroidUtilities.dp(48.0f);
        }
    }

    public void showDate(boolean z) {
        this.showDate = z;
    }

    public void setUseHeaderOffset(boolean z) {
        this.useHeaderOffset = z;
    }

    public void skipDrawItemsCount(int i) {
        this.skipDrawItemsCount = i;
    }

    public void setPaddingTop(int i) {
        this.paddingTop = i;
        invalidate();
    }

    public void setPaddingLeft(int i) {
        this.paddingLeft = i;
        invalidate();
    }

    public void setItemsCount(int i) {
        this.itemsCount = i;
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    public void setGlobalGradientView(FlickerLoadingView flickerLoadingView) {
        this.globalGradientView = flickerLoadingView;
    }

    public void setParentSize(int i, int i2, float f) {
        this.parentWidth = i;
        this.parentHeight = i2;
        this.parentXOffset = f;
    }

    public Paint getPaint() {
        return this.paint;
    }
}
