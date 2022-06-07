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
import org.telegram.tgnet.ConnectionsManager;
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
    private boolean ignoreHeightCheck;
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
        if (this.isSingleCell) {
            int i3 = this.itemsCount;
            if (i3 > 1 && this.ignoreHeightCheck) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCellHeight(View.MeasureSpec.getSize(i)) * this.itemsCount, 1073741824));
            } else if (i3 <= 1 || View.MeasureSpec.getSize(i2) <= 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getCellHeight(View.MeasureSpec.getSize(i)), 1073741824));
            } else {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getCellHeight(View.MeasureSpec.getSize(i)) * this.itemsCount), 1073741824));
            }
        } else {
            super.onMeasure(i, i2);
        }
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
        if (this.useHeaderOffset) {
            i += AndroidUtilities.dp(32.0f);
            String str = this.colorKey3;
            if (str != null) {
                this.headerPaint.setColor(getThemedColor(str));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(32.0f), this.colorKey3 != null ? this.headerPaint : paint2);
        }
        float f = 28.0f;
        int i2 = 0;
        int i3 = 1;
        if (getViewType() == 7) {
            while (i <= getMeasuredHeight()) {
                int cellHeight = getCellHeight(getMeasuredWidth());
                canvas.drawCircle(checkRtl(AndroidUtilities.dp(10.0f) + dp13), (cellHeight >> i3) + i, AndroidUtilities.dp(f), paint2);
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
                int i4 = i2 + 1;
                if (this.isSingleCell && i4 >= this.itemsCount) {
                    break;
                }
                i2 = i4;
                i3 = 1;
                f = 28.0f;
            }
        } else if (getViewType() == 18) {
            int i5 = i;
            while (i5 <= getMeasuredHeight()) {
                canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(9.0f) + dp12), AndroidUtilities.dp(32.0f) + i5, AndroidUtilities.dp(25.0f), paint2);
                float f2 = 76;
                int i6 = (i2 % 2 == 0 ? 52 : 72) + 76;
                this.rectF.set(AndroidUtilities.dp(f2), AndroidUtilities.dp(20.0f) + i5, AndroidUtilities.dp(i6), AndroidUtilities.dp(28.0f) + i5);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                int i7 = i6 + 8;
                this.rectF.set(AndroidUtilities.dp(i7), AndroidUtilities.dp(20.0f) + i5, AndroidUtilities.dp(i7 + 84), AndroidUtilities.dp(28.0f) + i5);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                this.rectF.set(AndroidUtilities.dp(f2), AndroidUtilities.dp(42.0f) + i5, AndroidUtilities.dp(140), AndroidUtilities.dp(50.0f) + i5);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                canvas.drawLine(AndroidUtilities.dp(f2), getCellHeight(getMeasuredWidth()) + i5, getMeasuredWidth(), getCellHeight(getMeasuredWidth()) + i5, paint2);
                i5 += getCellHeight(getMeasuredWidth());
                int i8 = i2 + 1;
                if (this.isSingleCell && i8 >= this.itemsCount) {
                    break;
                }
                i2 = i8;
            }
        } else if (getViewType() == 19) {
            int i9 = i;
            while (i9 <= getMeasuredHeight()) {
                canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(9.0f) + dp11), AndroidUtilities.dp(29.0f) + i9, AndroidUtilities.dp(20.0f), paint2);
                float f3 = 76;
                this.rectF.set(AndroidUtilities.dp(f3), AndroidUtilities.dp(16.0f) + i9, AndroidUtilities.dp((i2 % 2 == 0 ? 92 : ConnectionsManager.RequestFlagNeedQuickAck) + 76), AndroidUtilities.dp(24.0f) + i9);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                this.rectF.set(AndroidUtilities.dp(f3), AndroidUtilities.dp(38.0f) + i9, AndroidUtilities.dp(240), AndroidUtilities.dp(46.0f) + i9);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                canvas.drawLine(AndroidUtilities.dp(f3), getCellHeight(getMeasuredWidth()) + i9, getMeasuredWidth(), getCellHeight(getMeasuredWidth()) + i9, paint2);
                i9 += getCellHeight(getMeasuredWidth());
                int i10 = i2 + 1;
                if (this.isSingleCell && i10 >= this.itemsCount) {
                    break;
                }
                i2 = i10;
            }
        } else if (getViewType() == 1) {
            while (i <= getMeasuredHeight()) {
                canvas.drawCircle(checkRtl(AndroidUtilities.dp(9.0f) + dp10), (AndroidUtilities.dp(78.0f) >> 1) + i, AndroidUtilities.dp(25.0f), paint2);
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
                int i11 = i2 + 1;
                if (this.isSingleCell && i11 >= this.itemsCount) {
                    break;
                }
                i2 = i11;
            }
        } else if (getViewType() == 2) {
            int measuredWidth = (getMeasuredWidth() - (AndroidUtilities.dp(2.0f) * (getColumnsCount() - 1))) / getColumnsCount();
            int i12 = i;
            int i13 = 0;
            while (true) {
                if (i12 >= getMeasuredHeight() && !this.isSingleCell) {
                    break;
                }
                for (int i14 = 0; i14 < getColumnsCount(); i14++) {
                    if (i13 != 0 || i14 >= this.skipDrawItemsCount) {
                        canvas.drawRect((measuredWidth + AndroidUtilities.dp(2.0f)) * i14, i12, dp9 + measuredWidth, i12 + measuredWidth, paint2);
                    }
                }
                i12 += measuredWidth + AndroidUtilities.dp(2.0f);
                i13++;
                if (this.isSingleCell && i13 >= 2) {
                    break;
                }
            }
        } else {
            int i15 = 2;
            if (getViewType() == 3) {
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
                    int i16 = i2 + 1;
                    if (this.isSingleCell && i16 >= this.itemsCount) {
                        break;
                    }
                    i2 = i16;
                }
            } else if (getViewType() == 4) {
                while (i <= getMeasuredHeight()) {
                    canvas.drawCircle(checkRtl(AndroidUtilities.dp(12.0f) + dp8), AndroidUtilities.dp(6.0f) + i + dp8, AndroidUtilities.dp(44.0f) >> 1, paint2);
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
                    int i17 = i2 + 1;
                    if (this.isSingleCell && i17 >= this.itemsCount) {
                        break;
                    }
                    i2 = i17;
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
                    int i18 = i2 + 1;
                    if (this.isSingleCell && i18 >= this.itemsCount) {
                        break;
                    }
                    i2 = i18;
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
                    int i19 = i2 + 1;
                    if (this.isSingleCell && i19 >= this.itemsCount) {
                        break;
                    }
                    i2 = i19;
                }
            } else if (getViewType() == 8) {
                while (i <= getMeasuredHeight()) {
                    canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(11.0f) + dp7), (AndroidUtilities.dp(64.0f) >> 1) + i, AndroidUtilities.dp(23.0f), paint2);
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
                    int i20 = i2 + 1;
                    if (this.isSingleCell && i20 >= this.itemsCount) {
                        break;
                    }
                    i2 = i20;
                }
            } else if (getViewType() == 9) {
                while (i <= getMeasuredHeight()) {
                    canvas.drawCircle(checkRtl(AndroidUtilities.dp(35.0f)), (getCellHeight(getMeasuredWidth()) >> 1) + i, AndroidUtilities.dp(32.0f) / i15, paint2);
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
                    int i21 = i2 + 1;
                    if (this.isSingleCell && i21 >= this.itemsCount) {
                        break;
                    }
                    i2 = i21;
                    i15 = 2;
                }
            } else {
                float f4 = 0.5f;
                if (getViewType() == 11) {
                    int i22 = 0;
                    while (i <= getMeasuredHeight()) {
                        this.rectF.set(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.dp(this.randomParams[0] * 40.0f), AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(8.0f));
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        this.rectF.set(getMeasuredWidth() - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.dp(this.randomParams[0] * 20.0f), AndroidUtilities.dp(14.0f) + AndroidUtilities.dp(8.0f));
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        i += getCellHeight(getMeasuredWidth());
                        i22++;
                        if (this.isSingleCell && i22 >= this.itemsCount) {
                            break;
                        }
                    }
                } else if (getViewType() == 12) {
                    int dp14 = i + AndroidUtilities.dp(14.0f);
                    while (dp14 <= getMeasuredHeight()) {
                        int measuredWidth2 = getMeasuredWidth() / 4;
                        for (int i23 = 0; i23 < 4; i23++) {
                            float f5 = (measuredWidth2 * i23) + (measuredWidth2 / 2.0f);
                            canvas.drawCircle(f5, AndroidUtilities.dp(7.0f) + dp14 + (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(28.0f), paint2);
                            float dp15 = AndroidUtilities.dp(7.0f) + dp14 + AndroidUtilities.dp(56.0f) + AndroidUtilities.dp(16.0f);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(f5 - AndroidUtilities.dp(24.0f), dp15 - AndroidUtilities.dp(4.0f), f5 + AndroidUtilities.dp(24.0f), dp15 + AndroidUtilities.dp(4.0f));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                        }
                        dp14 += getCellHeight(getMeasuredWidth());
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
                    for (int i24 = 0; i24 < 3; i24++) {
                        canvas.drawCircle((getMeasuredWidth() - AndroidUtilities.dp(56.0f)) + AndroidUtilities.dp(13.0f) + (AndroidUtilities.dp(12.0f) * i24), measuredHeight, AndroidUtilities.dp(13.0f), this.backgroundPaint);
                        canvas.drawCircle((getMeasuredWidth() - AndroidUtilities.dp(56.0f)) + AndroidUtilities.dp(13.0f) + (AndroidUtilities.dp(12.0f) * i24), measuredHeight, AndroidUtilities.dp(12.0f), paint2);
                    }
                } else if (getViewType() == 14 || getViewType() == 17) {
                    int dp16 = AndroidUtilities.dp(12.0f);
                    int dp17 = AndroidUtilities.dp(77.0f);
                    int dp18 = AndroidUtilities.dp(4.0f);
                    float dp19 = AndroidUtilities.dp(21.0f);
                    float dp20 = AndroidUtilities.dp(41.0f);
                    while (dp16 < getMeasuredWidth()) {
                        if (this.backgroundPaint == null) {
                            Paint paint4 = new Paint(1);
                            this.backgroundPaint = paint4;
                            paint4.setColor(Theme.getColor("dialogBackground"));
                        }
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        int i25 = dp16 + dp17;
                        rectF3.set(AndroidUtilities.dp(4.0f) + dp16, AndroidUtilities.dp(4.0f), i25 - AndroidUtilities.dp(4.0f), getMeasuredHeight() - AndroidUtilities.dp(4.0f));
                        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
                        if (getViewType() == 14) {
                            float dp21 = AndroidUtilities.dp(8.0f) + dp18;
                            float f6 = dp16;
                            float dp22 = AndroidUtilities.dp(22.0f) + dp18 + f6;
                            this.rectF.set(dp22, dp21, dp22 + dp20, dp21 + dp19);
                            RectF rectF4 = this.rectF;
                            canvas.drawRoundRect(rectF4, rectF4.height() * f4, this.rectF.height() * f4, this.backgroundPaint);
                            float dp23 = dp21 + AndroidUtilities.dp(4.0f) + dp19;
                            float dp24 = f6 + AndroidUtilities.dp(5.0f) + dp18;
                            this.rectF.set(dp24, dp23, dp24 + dp20, dp23 + dp19);
                            RectF rectF5 = this.rectF;
                            canvas.drawRoundRect(rectF5, rectF5.height() * f4, this.rectF.height() * f4, this.backgroundPaint);
                        } else if (getViewType() == 17) {
                            float dp25 = AndroidUtilities.dp(5.0f);
                            float dp26 = AndroidUtilities.dp(32.0f);
                            float f7 = dp16 + ((dp17 - dp26) / 2.0f);
                            rectF3.set(f7, AndroidUtilities.dp(21.0f), dp26 + f7, dp2 + AndroidUtilities.dp(32.0f));
                            canvas.drawRoundRect(rectF3, dp25, dp25, this.backgroundPaint);
                            canvas.drawCircle(dp16 + (dp17 / 2), getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(8.0f), this.backgroundPaint);
                            dp16 = i25;
                            f4 = 0.5f;
                        }
                        canvas.drawCircle(dp16 + (dp17 / 2), getMeasuredHeight() - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(8.0f), this.backgroundPaint);
                        dp16 = i25;
                        f4 = 0.5f;
                    }
                } else if (getViewType() == 15) {
                    int dp27 = AndroidUtilities.dp(23.0f);
                    int dp28 = AndroidUtilities.dp(4.0f);
                    while (i <= getMeasuredHeight()) {
                        float f8 = dp27;
                        canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(12.0f)) + f8, AndroidUtilities.dp(8.0f) + i + dp27, f8, paint2);
                        this.rectF.set(this.paddingLeft + AndroidUtilities.dp(74.0f), AndroidUtilities.dp(12.0f) + i, this.paddingLeft + AndroidUtilities.dp(260.0f), AndroidUtilities.dp(20.0f) + i);
                        checkRtl(this.rectF);
                        float f9 = dp28;
                        canvas.drawRoundRect(this.rectF, f9, f9, paint2);
                        this.rectF.set(this.paddingLeft + AndroidUtilities.dp(74.0f), AndroidUtilities.dp(36.0f) + i, this.paddingLeft + AndroidUtilities.dp(140.0f), AndroidUtilities.dp(42.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, f9, f9, paint2);
                        i += getCellHeight(getMeasuredWidth());
                        int i26 = i2 + 1;
                        if (this.isSingleCell && i26 >= this.itemsCount) {
                            break;
                        }
                        i2 = i26;
                    }
                } else if (getViewType() == 16) {
                    int i27 = 0;
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.dp(8.0f) + dp5), AndroidUtilities.dp(24.0f) + i, AndroidUtilities.dp(18.0f), paint2);
                        this.rectF.set(this.paddingLeft + AndroidUtilities.dp(58.0f), AndroidUtilities.dp(20.0f) + i, getWidth() - AndroidUtilities.dp(53.0f), AndroidUtilities.dp(28.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint2);
                        if (i27 < 4) {
                            canvas.drawCircle(checkRtl((getWidth() - AndroidUtilities.dp(12.0f)) - dp6), AndroidUtilities.dp(24.0f) + i, AndroidUtilities.dp(12.0f), paint2);
                        }
                        i += getCellHeight(getMeasuredWidth());
                        i27++;
                        if (this.isSingleCell && i27 >= this.itemsCount) {
                            break;
                        }
                    }
                } else {
                    int i28 = this.viewType;
                    if (i28 == 21) {
                        while (i <= getMeasuredHeight()) {
                            canvas.drawCircle(checkRtl(AndroidUtilities.dp(20.0f) + dp4), (AndroidUtilities.dp(58.0f) >> 1) + i, AndroidUtilities.dp(46.0f) >> 1, paint2);
                            this.rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(16.0f) + i, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(AndroidUtilities.dp(74.0f), AndroidUtilities.dp(38.0f) + i, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            i += getCellHeight(getMeasuredWidth());
                            int i29 = i2 + 1;
                            if (this.isSingleCell && i29 >= this.itemsCount) {
                                break;
                            }
                            i2 = i29;
                        }
                    } else if (i28 == 22) {
                        while (i <= getMeasuredHeight()) {
                            canvas.drawCircle(checkRtl(AndroidUtilities.dp(20.0f) + dp3), AndroidUtilities.dp(6.0f) + i + dp3, AndroidUtilities.dp(48.0f) >> 1, paint2);
                            this.rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(16.0f) + i, AndroidUtilities.dp(140.0f), AndroidUtilities.dp(24.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            this.rectF.set(AndroidUtilities.dp(76.0f), AndroidUtilities.dp(38.0f) + i, AndroidUtilities.dp(260.0f), AndroidUtilities.dp(46.0f) + i);
                            checkRtl(this.rectF);
                            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                            i += getCellHeight(getMeasuredWidth());
                            int i30 = i2 + 1;
                            if (this.isSingleCell && i30 >= this.itemsCount) {
                                break;
                            }
                            i2 = i30;
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
            case R.styleable.MapAttrs_uiZoomControls:
            default:
                return 0;
            case 15:
                return AndroidUtilities.dp(107.0f);
            case 16:
                return AndroidUtilities.dp(48.0f);
            case R.styleable.MapAttrs_uiTiltGestures:
                return AndroidUtilities.dp(58.0f);
            case R.styleable.MapAttrs_uiZoomGestures:
                return AndroidUtilities.dp(58.0f);
            case R.styleable.MapAttrs_useViewLifecycle:
                return AndroidUtilities.dp(60.0f);
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

    public void setIgnoreHeightCheck(boolean z) {
        this.ignoreHeightCheck = z;
    }
}
