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
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
public class FlickerLoadingView extends View implements Theme.Colorable {
    private Paint backgroundPaint;
    private int color0;
    private int color1;
    private int colorKey1;
    private int colorKey2;
    private int colorKey3;
    FlickerLoadingView globalGradientView;
    private LinearGradient gradient;
    private int gradientWidth;
    private Paint headerPaint;
    private boolean ignoreHeightCheck;
    private boolean isSingleCell;
    private int itemsCount;
    private long lastUpdateTime;
    private Matrix matrix;
    private float memberRequestButtonWidth;
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

    public int getAdditionalHeight() {
        return 0;
    }

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

    public void setColors(int i, int i2, int i3) {
        this.colorKey1 = i;
        this.colorKey2 = i2;
        this.colorKey3 = i3;
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
        this.colorKey1 = Theme.key_actionBarDefaultSubmenuBackground;
        this.colorKey2 = Theme.key_listSelector;
        this.colorKey3 = -1;
        this.itemsCount = 1;
        this.resourcesProvider = resourcesProvider;
        this.matrix = new Matrix();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        if (this.isSingleCell) {
            int i3 = this.itemsCount;
            if (i3 > 1 && this.ignoreHeightCheck) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((getCellHeight(View.MeasureSpec.getSize(i)) * this.itemsCount) + getAdditionalHeight(), 1073741824));
                return;
            } else if (i3 > 1 && View.MeasureSpec.getSize(i2) > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getCellHeight(View.MeasureSpec.getSize(i)) * this.itemsCount) + getAdditionalHeight(), 1073741824));
                return;
            } else {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCellHeight(View.MeasureSpec.getSize(i)) + getAdditionalHeight(), 1073741824));
                return;
            }
        }
        super.onMeasure(i, i2);
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
        int dp11;
        int dp12;
        int dp13;
        int dp14;
        int dp15;
        int dp16;
        int dp17;
        int dp18;
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
            int dp19 = i + AndroidUtilities.dp(32.0f);
            int i2 = this.colorKey3;
            if (i2 >= 0) {
                this.headerPaint.setColor(getThemedColor(i2));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(32.0f), this.colorKey3 >= 0 ? this.headerPaint : paint2);
            i = dp19;
        }
        float f2 = 10.0f;
        float f3 = 28.0f;
        int i3 = 0;
        int i4 = 1;
        if (getViewType() == 7) {
            while (i <= getMeasuredHeight()) {
                int cellHeight = getCellHeight(getMeasuredWidth());
                canvas.drawCircle(checkRtl(AndroidUtilities.dp(f2) + dp18), (cellHeight >> 1) + i, AndroidUtilities.dp(f3), paint2);
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
                int i5 = i3 + 1;
                if (this.isSingleCell && i5 >= this.itemsCount) {
                    break;
                }
                i3 = i5;
                f2 = 10.0f;
                f3 = 28.0f;
            }
        } else {
            float f4 = 14.0f;
            if (getViewType() == 24) {
                while (i <= getMeasuredHeight()) {
                    canvas.drawCircle(checkRtl(AndroidUtilities.dp(10.0f) + dp17), AndroidUtilities.dp(10.0f) + i + dp17, AndroidUtilities.dp(f4), paint2);
                    canvas.save();
                    canvas.translate(0.0f, -AndroidUtilities.dp(4.0f));
                    this.rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i, AndroidUtilities.dp(148.0f), i + AndroidUtilities.dp(24.0f));
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                    this.rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(38.0f) + i, AndroidUtilities.dp(268.0f), AndroidUtilities.dp(46.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                    if (SharedConfig.useThreeLinesLayout) {
                        this.rectF.set(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(54.0f) + i, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(62.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                    }
                    if (this.showDate) {
                        this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                    }
                    canvas.restore();
                    i += getCellHeight(getMeasuredWidth());
                    int i6 = i3 + 1;
                    if (this.isSingleCell && i6 >= this.itemsCount) {
                        break;
                    }
                    i3 = i6;
                    f4 = 14.0f;
                }
            } else {
                float f5 = 42.0f;
                if (getViewType() == 18) {
                    int i7 = i;
                    while (i7 <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(9.0f) + dp16), AndroidUtilities.dp(32.0f) + i7, AndroidUtilities.dp(25.0f), paint2);
                        float f6 = 76;
                        int i8 = (i3 % 2 == 0 ? 52 : 72) + 76;
                        this.rectF.set(AndroidUtilities.dp(f6), AndroidUtilities.dp(20.0f) + i7, AndroidUtilities.dp(i8), AndroidUtilities.dp(28.0f) + i7);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        int i9 = i8 + 8;
                        this.rectF.set(AndroidUtilities.dp(i9), AndroidUtilities.dp(20.0f) + i7, AndroidUtilities.dp(i9 + 84), AndroidUtilities.dp(28.0f) + i7);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        this.rectF.set(AndroidUtilities.dp(f6), AndroidUtilities.dp(42.0f) + i7, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + i7);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        canvas.drawLine(AndroidUtilities.dp(f6), getCellHeight(getMeasuredWidth()) + i7, getMeasuredWidth(), getCellHeight(getMeasuredWidth()) + i7, paint2);
                        i7 += getCellHeight(getMeasuredWidth());
                        int i10 = i3 + 1;
                        if (this.isSingleCell && i10 >= this.itemsCount) {
                            break;
                        }
                        i3 = i10;
                    }
                } else if (getViewType() == 19) {
                    int i11 = i;
                    while (i11 <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(9.0f) + dp15), AndroidUtilities.dp(29.0f) + i11, AndroidUtilities.dp(20.0f), paint2);
                        float f7 = 76;
                        this.rectF.set(AndroidUtilities.dp(f7), AndroidUtilities.dp(16.0f) + i11, AndroidUtilities.dp((i3 % 2 == 0 ? 92 : 128) + 76), AndroidUtilities.dp(24.0f) + i11);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        this.rectF.set(AndroidUtilities.dp(f7), AndroidUtilities.dp(38.0f) + i11, AndroidUtilities.dp(240), AndroidUtilities.dp(46.0f) + i11);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        canvas.drawLine(AndroidUtilities.dp(f7), getCellHeight(getMeasuredWidth()) + i11, getMeasuredWidth(), getCellHeight(getMeasuredWidth()) + i11, paint2);
                        i11 += getCellHeight(getMeasuredWidth());
                        int i12 = i3 + 1;
                        if (this.isSingleCell && i12 >= this.itemsCount) {
                            break;
                        }
                        i3 = i12;
                    }
                } else if (getViewType() == 1) {
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(AndroidUtilities.dp(9.0f) + dp14), (AndroidUtilities.dp(78.0f) >> 1) + i, AndroidUtilities.dp(25.0f), paint2);
                        this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(20.0f) + i, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(28.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        this.rectF.set(AndroidUtilities.dp(68.0f), AndroidUtilities.dp(42.0f) + i, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(50.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        if (this.showDate) {
                            this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(20.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        }
                        i += getCellHeight(getMeasuredWidth());
                        int i13 = i3 + 1;
                        if (this.isSingleCell && i13 >= this.itemsCount) {
                            break;
                        }
                        i3 = i13;
                    }
                } else if (getViewType() == 2 || getViewType() == 27) {
                    int measuredWidth = (getMeasuredWidth() - (AndroidUtilities.dp(2.0f) * (getColumnsCount() - 1))) / getColumnsCount();
                    int i14 = getViewType() == 27 ? (int) (measuredWidth * 1.25f) : measuredWidth;
                    int i15 = i;
                    int i16 = 0;
                    while (true) {
                        if (i15 >= getMeasuredHeight() && !this.isSingleCell) {
                            break;
                        }
                        for (int i17 = 0; i17 < getColumnsCount(); i17++) {
                            if (i16 != 0 || i17 >= this.skipDrawItemsCount) {
                                canvas.drawRect((AndroidUtilities.dp(2.0f) + measuredWidth) * i17, i15, dp + measuredWidth, i15 + i14, paint2);
                            }
                        }
                        i15 += AndroidUtilities.dp(2.0f) + i14;
                        i16++;
                        if (this.isSingleCell && i16 >= 2) {
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
                        int i18 = i3 + 1;
                        if (this.isSingleCell && i18 >= this.itemsCount) {
                            break;
                        }
                        i3 = i18;
                    }
                } else if (getViewType() == 4) {
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(AndroidUtilities.dp(12.0f) + dp13), AndroidUtilities.dp(6.0f) + i + dp13, AndroidUtilities.dp(44.0f) >> 1, paint2);
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
                        int i19 = i3 + 1;
                        if (this.isSingleCell && i19 >= this.itemsCount) {
                            break;
                        }
                        i3 = i19;
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
                        int i20 = i3 + 1;
                        if (this.isSingleCell && i20 >= this.itemsCount) {
                            break;
                        }
                        i3 = i20;
                    }
                } else if (getViewType() == 6 || getViewType() == 10) {
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(9.0f) + dp2), (AndroidUtilities.dp(64.0f) >> 1) + i, AndroidUtilities.dp(23.0f), paint2);
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
                        int i21 = i3 + 1;
                        if (this.isSingleCell && i21 >= this.itemsCount) {
                            break;
                        }
                        i3 = i21;
                    }
                } else if (getViewType() == 29) {
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(9.0f) + dp12), (AndroidUtilities.dp(64.0f) >> 1) + i, AndroidUtilities.dp(23.0f), paint2);
                        this.rectF.set(this.paddingLeft + AndroidUtilities.dp(68.0f), AndroidUtilities.dp(17.0f) + i, this.paddingLeft + AndroidUtilities.dp(260.0f), AndroidUtilities.dp(25.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        this.rectF.set(this.paddingLeft + AndroidUtilities.dp(68.0f), AndroidUtilities.dp(39.0f) + i, this.paddingLeft + AndroidUtilities.dp(140.0f), AndroidUtilities.dp(47.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        i += getCellHeight(getMeasuredWidth());
                        int i22 = i3 + 1;
                        if (this.isSingleCell && i22 >= this.itemsCount) {
                            break;
                        }
                        i3 = i22;
                    }
                } else if (getViewType() == 30) {
                    while (i <= getMeasuredHeight()) {
                        i += getCellHeight(getMeasuredWidth());
                        this.rectF.set(0.0f, i, getMeasuredWidth(), i);
                        checkRtl(this.rectF);
                        canvas.drawRect(this.rectF, paint2);
                        int i23 = i3 + 1;
                        if (this.isSingleCell && i23 >= this.itemsCount) {
                            break;
                        }
                        i3 = i23;
                    }
                } else if (getViewType() == 8) {
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(11.0f) + dp11), (AndroidUtilities.dp(64.0f) >> 1) + i, AndroidUtilities.dp(23.0f), paint2);
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
                        int i24 = i3 + 1;
                        if (this.isSingleCell && i24 >= this.itemsCount) {
                            break;
                        }
                        i3 = i24;
                    }
                } else if (getViewType() == 9) {
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(AndroidUtilities.dp(35.0f)), (getCellHeight(getMeasuredWidth()) >> 1) + i, AndroidUtilities.dp(f) / 2, paint2);
                        this.rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(16.0f) + i, AndroidUtilities.dp(268.0f), i + AndroidUtilities.dp(24.0f));
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        this.rectF.set(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(38.0f) + i, AndroidUtilities.dp(140.0f), i + AndroidUtilities.dp(46.0f));
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        if (this.showDate) {
                            this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(50.0f), AndroidUtilities.dp(16.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        }
                        i += getCellHeight(getMeasuredWidth());
                        int i25 = i3 + 1;
                        if (this.isSingleCell && i25 >= this.itemsCount) {
                            break;
                        }
                        i3 = i25;
                        f = 32.0f;
                    }
                } else if (getViewType() == 11) {
                    int i26 = 0;
                    while (i <= getMeasuredHeight()) {
                        this.rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.randomParams[0] * 40.0f), AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(8.0f));
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.randomParams[0] * 20.0f), AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(8.0f));
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        i += getCellHeight(getMeasuredWidth());
                        i26++;
                        if (this.isSingleCell && i26 >= this.itemsCount) {
                            break;
                        }
                    }
                } else if (getViewType() == 12) {
                    int dp20 = i + AndroidUtilities.dp(14.0f);
                    while (dp20 <= getMeasuredHeight()) {
                        int measuredWidth2 = getMeasuredWidth() / 4;
                        for (int i27 = 0; i27 < 4; i27++) {
                            float f8 = (measuredWidth2 * i27) + (measuredWidth2 / 2.0f);
                            canvas.drawCircle(f8, AndroidUtilities.dp(7.0f) + dp20 + (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(28.0f), paint2);
                            float dp21 = AndroidUtilities.dp(7.0f) + dp20 + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(16.0f);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(f8 - AndroidUtilities.dp(24.0f), dp21 - AndroidUtilities.dp(4.0f), f8 + AndroidUtilities.dp(24.0f), dp21 + AndroidUtilities.dp(4.0f));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        }
                        dp20 += getCellHeight(getMeasuredWidth());
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
                        paint3.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground));
                    }
                    for (int i28 = 0; i28 < 3; i28++) {
                        canvas.drawCircle((getMeasuredWidth() - AndroidUtilities.dp(56.0f)) + AndroidUtilities.dp(13.0f) + (AndroidUtilities.dp(12.0f) * i28), measuredHeight, AndroidUtilities.dp(13.0f), this.backgroundPaint);
                        canvas.drawCircle((getMeasuredWidth() - AndroidUtilities.dp(56.0f)) + AndroidUtilities.dp(13.0f) + (AndroidUtilities.dp(12.0f) * i28), measuredHeight, AndroidUtilities.dp(12.0f), paint2);
                    }
                } else {
                    float f9 = 21.0f;
                    if (getViewType() == 14 || getViewType() == 17) {
                        int dp22 = AndroidUtilities.dp(12.0f);
                        int dp23 = AndroidUtilities.dp(77.0f);
                        int dp24 = AndroidUtilities.dp(4.0f);
                        float dp25 = AndroidUtilities.dp(21.0f);
                        float dp26 = AndroidUtilities.dp(41.0f);
                        while (dp22 < getMeasuredWidth()) {
                            if (this.backgroundPaint == null) {
                                this.backgroundPaint = new Paint(i4);
                            }
                            this.backgroundPaint.setColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            int i29 = dp22 + dp23;
                            rectF3.set(AndroidUtilities.dp(4.0f) + dp22, AndroidUtilities.dp(4.0f), i29 - AndroidUtilities.dp(4.0f), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                            canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
                            if (getViewType() == 14) {
                                float dp27 = AndroidUtilities.dp(8.0f) + dp24;
                                float f10 = dp22;
                                float dp28 = AndroidUtilities.dp(22.0f) + dp24 + f10;
                                this.rectF.set(dp28, dp27, dp28 + dp26, dp27 + dp25);
                                RectF rectF4 = this.rectF;
                                canvas.drawRoundRect(rectF4, rectF4.height() * 0.5f, this.rectF.height() * 0.5f, this.backgroundPaint);
                                float dp29 = dp27 + AndroidUtilities.dp(4.0f) + dp25;
                                float dp30 = f10 + AndroidUtilities.dp(5.0f) + dp24;
                                this.rectF.set(dp30, dp29, dp30 + dp26, dp29 + dp25);
                                RectF rectF5 = this.rectF;
                                canvas.drawRoundRect(rectF5, rectF5.height() * 0.5f, this.rectF.height() * 0.5f, this.backgroundPaint);
                            } else if (getViewType() == 17) {
                                float dp31 = AndroidUtilities.dp(5.0f);
                                float dp32 = AndroidUtilities.dp(32.0f);
                                float f11 = dp22 + ((dp23 - dp32) / 2.0f);
                                rectF3.set(f11, AndroidUtilities.dp(f9), dp32 + f11, dp3 + AndroidUtilities.dp(32.0f));
                                canvas.drawRoundRect(rectF3, dp31, dp31, this.backgroundPaint);
                                canvas.drawCircle(dp22 + (dp23 / 2), getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(8.0f), this.backgroundPaint);
                                dp22 = i29;
                                i4 = 1;
                                f9 = 21.0f;
                            }
                            canvas.drawCircle(dp22 + (dp23 / 2), getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(8.0f), this.backgroundPaint);
                            dp22 = i29;
                            i4 = 1;
                            f9 = 21.0f;
                        }
                    } else if (getViewType() == 15) {
                        int dp33 = AndroidUtilities.dp(23.0f);
                        int dp34 = AndroidUtilities.dp(4.0f);
                        while (i <= getMeasuredHeight()) {
                            canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(12.0f) + dp33), AndroidUtilities.dp(8.0f) + i + dp33, dp33, paint2);
                            this.rectF.set(this.paddingLeft + AndroidUtilities.dp(74.0f), AndroidUtilities.dp(12.0f) + i, this.paddingLeft + AndroidUtilities.dp(260.0f), AndroidUtilities.dp(20.0f) + i);
                            checkRtl(this.rectF);
                            float f12 = dp34;
                            canvas.drawRoundRect(this.rectF, f12, f12, paint2);
                            this.rectF.set(this.paddingLeft + AndroidUtilities.dp(74.0f), AndroidUtilities.dp(36.0f) + i, this.paddingLeft + AndroidUtilities.dp(140.0f), i + AndroidUtilities.dp(f5));
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, f12, f12, paint2);
                            if (this.memberRequestButtonWidth > 0.0f) {
                                this.rectF.set(this.paddingLeft + AndroidUtilities.dp(73.0f), AndroidUtilities.dp(62.0f) + i, this.paddingLeft + AndroidUtilities.dp(73.0f) + this.memberRequestButtonWidth, AndroidUtilities.dp(94.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, f12, f12, paint2);
                            }
                            i += getCellHeight(getMeasuredWidth());
                            int i30 = i3 + 1;
                            if (this.isSingleCell && i30 >= this.itemsCount) {
                                break;
                            }
                            i3 = i30;
                            f5 = 42.0f;
                        }
                    } else if (getViewType() == 16 || getViewType() == 23) {
                        int i31 = 0;
                        while (i <= getMeasuredHeight()) {
                            canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(8.0f) + dp4), AndroidUtilities.dp(24.0f) + i, AndroidUtilities.dp(18.0f), paint2);
                            this.rectF.set(this.paddingLeft + AndroidUtilities.dp(58.0f), AndroidUtilities.dp(20.0f) + i, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint2);
                            if (i31 < 4) {
                                canvas.drawCircle(checkRtl((getWidth() - AndroidUtilities.dp(12.0f)) - dp5), AndroidUtilities.dp(24.0f) + i, AndroidUtilities.dp(12.0f), paint2);
                            }
                            i += getCellHeight(getMeasuredWidth());
                            i31++;
                            if (this.isSingleCell && i31 >= this.itemsCount) {
                                break;
                            }
                        }
                        this.rectF.set(this.paddingLeft + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(20.0f) + i, getWidth() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(28.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint2);
                        this.rectF.set(this.paddingLeft + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(36.0f) + i, getWidth() - AndroidUtilities.dp(53.0f), i + AndroidUtilities.dp(44.0f));
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint2);
                    } else {
                        int i32 = this.viewType;
                        if (i32 == 21) {
                            while (i <= getMeasuredHeight()) {
                                canvas.drawCircle(checkRtl(AndroidUtilities.dp(20.0f) + dp10), (AndroidUtilities.dp(58.0f) >> 1) + i, AndroidUtilities.dp(46.0f) >> 1, paint2);
                                this.rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(16.0f) + i, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                this.rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(38.0f) + i, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                i += getCellHeight(getMeasuredWidth());
                                int i33 = i3 + 1;
                                if (this.isSingleCell && i33 >= this.itemsCount) {
                                    break;
                                }
                                i3 = i33;
                            }
                        } else if (i32 == 22) {
                            while (i <= getMeasuredHeight()) {
                                canvas.drawCircle(checkRtl(AndroidUtilities.dp(20.0f) + dp9), AndroidUtilities.dp(6.0f) + i + dp9, AndroidUtilities.dp(48.0f) >> 1, paint2);
                                this.rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                this.rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                i += getCellHeight(getMeasuredWidth());
                                int i34 = i3 + 1;
                                if (this.isSingleCell && i34 >= this.itemsCount) {
                                    break;
                                }
                                i3 = i34;
                            }
                        } else if (i32 == 25) {
                            while (i <= getMeasuredHeight()) {
                                canvas.drawCircle(AndroidUtilities.dp(17.0f) + dp8, AndroidUtilities.dp(6.0f) + i + dp8, AndroidUtilities.dp(38.0f) >> 1, paint2);
                                this.rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(21.0f) + i, AndroidUtilities.dp(220.0f), AndroidUtilities.dp(29.0f) + i);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                i += getCellHeight(getMeasuredWidth());
                                int i35 = i3 + 1;
                                if (this.isSingleCell && i35 >= this.itemsCount) {
                                    break;
                                }
                                i3 = i35;
                            }
                        } else if (i32 == 26) {
                            while (i <= getMeasuredHeight()) {
                                canvas.drawCircle(LocaleController.isRTL ? (getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - dp7 : AndroidUtilities.dp(21.0f) + dp7, AndroidUtilities.dp(16.0f) + i + dp7, AndroidUtilities.dp(21.0f) >> 1, paint2);
                                this.rectF.set(AndroidUtilities.dp(60.0f), AndroidUtilities.dp(21.0f) + i, AndroidUtilities.dp(190.0f), AndroidUtilities.dp(29.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(21.0f) + i, getMeasuredWidth() - AndroidUtilities.dp(62.0f), AndroidUtilities.dp(29.0f) + i);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                i += getCellHeight(getMeasuredWidth());
                                int i36 = i3 + 1;
                                if (this.isSingleCell && i36 >= this.itemsCount) {
                                    break;
                                }
                                i3 = i36;
                            }
                        } else if (getViewType() == 28) {
                            while (i <= getMeasuredHeight()) {
                                canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(10.0f) + dp6), (AndroidUtilities.dp(58.0f) >> 1) + i, AndroidUtilities.dp(24.0f), paint2);
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
                                int i37 = i3 + 1;
                                if (this.isSingleCell && i37 >= this.itemsCount) {
                                    break;
                                }
                                i3 = i37;
                            }
                        } else if (getViewType() == 31) {
                            while (i <= getMeasuredHeight()) {
                                int cellHeight2 = getCellHeight(getMeasuredWidth());
                                float f13 = i;
                                this.rectF.set(this.paddingLeft + AndroidUtilities.dp(18.0f), ((cellHeight2 - AndroidUtilities.dp(22.0f)) / 2.0f) + f13, this.paddingLeft + AndroidUtilities.dp(40.0f), ((AndroidUtilities.dp(22.0f) + cellHeight2) / 2.0f) + f13);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), paint2);
                                this.rectF.set(this.paddingLeft + AndroidUtilities.dp(58.0f), ((cellHeight2 - AndroidUtilities.dp(8.0f)) / 2.0f) + f13, Math.min(this.paddingLeft + AndroidUtilities.dp(132.0f), getMeasuredWidth() - AndroidUtilities.dp(19.0f)), f13 + ((AndroidUtilities.dp(8.0f) + cellHeight2) / 2.0f));
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                i += cellHeight2;
                                int i38 = i3 + 1;
                                if (this.isSingleCell && i38 >= this.itemsCount) {
                                    break;
                                }
                                i3 = i38;
                            }
                        } else if (getViewType() == 32) {
                            while (i <= getMeasuredHeight()) {
                                int cellHeight3 = getCellHeight(getMeasuredWidth());
                                float f14 = i;
                                this.rectF.set(this.paddingLeft + AndroidUtilities.dp(10.0f), ((cellHeight3 - AndroidUtilities.dp(32.0f)) / 2.0f) + f14, this.paddingLeft + AndroidUtilities.dp(42.0f), ((AndroidUtilities.dp(32.0f) + cellHeight3) / 2.0f) + f14);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
                                this.rectF.set(this.paddingLeft + AndroidUtilities.dp(64.0f), (((cellHeight3 - AndroidUtilities.dp(14.0f)) - AndroidUtilities.dp(10.0f)) / 2.0f) + f14, Math.min(this.paddingLeft + AndroidUtilities.dp(118.0f), getMeasuredWidth() - AndroidUtilities.dp(19.0f)), (((cellHeight3 - AndroidUtilities.dp(14.0f)) + AndroidUtilities.dp(10.0f)) / 2.0f) + f14);
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                this.rectF.set(this.paddingLeft + AndroidUtilities.dp(64.0f), (((AndroidUtilities.dp(14.0f) + cellHeight3) - AndroidUtilities.dp(8.0f)) / 2.0f) + f14, Math.min(this.paddingLeft + AndroidUtilities.dp(144.0f), getMeasuredWidth() - AndroidUtilities.dp(19.0f)), f14 + (((AndroidUtilities.dp(14.0f) + cellHeight3) + AndroidUtilities.dp(8.0f)) / 2.0f));
                                checkRtl(this.rectF);
                                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                                i += cellHeight3;
                                int i39 = i3 + 1;
                                if (this.isSingleCell && i39 >= this.itemsCount) {
                                    break;
                                }
                                i3 = i39;
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

    @Override
    public void updateColors() {
        int i;
        FlickerLoadingView flickerLoadingView = this.globalGradientView;
        if (flickerLoadingView != null) {
            flickerLoadingView.updateColors();
            return;
        }
        int themedColor = getThemedColor(this.colorKey1);
        int themedColor2 = getThemedColor(this.colorKey2);
        if (this.color1 == themedColor2 && this.color0 == themedColor) {
            return;
        }
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

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
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

    public void setIgnoreHeightCheck(boolean z) {
        this.ignoreHeightCheck = z;
    }

    public void setMemberRequestButton(boolean z) {
        int i;
        String str;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        float dp = AndroidUtilities.dp(34.0f);
        if (z) {
            i = R.string.AddToChannel;
            str = "AddToChannel";
        } else {
            i = R.string.AddToGroup;
            str = "AddToGroup";
        }
        this.memberRequestButtonWidth = dp + textPaint.measureText(LocaleController.getString(str, i));
    }
}
