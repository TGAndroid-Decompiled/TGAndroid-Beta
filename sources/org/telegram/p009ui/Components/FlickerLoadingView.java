package org.telegram.p009ui.Components;

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
import org.telegram.messenger.SharedConfig;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.tgnet.ConnectionsManager;

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
        this.colorKey1 = "actionBarDefaultSubmenuBackground";
        this.colorKey2 = "listSelectorSDK21";
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
        int m35dp;
        int m35dp2;
        int m35dp3;
        int m35dp4;
        int m35dp5;
        int m35dp6;
        int m35dp7;
        int m35dp8;
        int m35dp9;
        int m35dp10;
        int m35dp11;
        int m35dp12;
        int m35dp13;
        int m35dp14;
        int m35dp15;
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
            int m35dp16 = i + AndroidUtilities.m35dp(32.0f);
            String str = this.colorKey3;
            if (str != null) {
                this.headerPaint.setColor(getThemedColor(str));
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.m35dp(32.0f), this.colorKey3 != null ? this.headerPaint : paint2);
            i = m35dp16;
        }
        float f = 28.0f;
        int i2 = 0;
        int i3 = 1;
        if (getViewType() == 7) {
            while (i <= getMeasuredHeight()) {
                int cellHeight = getCellHeight(getMeasuredWidth());
                canvas.drawCircle(checkRtl(AndroidUtilities.m35dp(10.0f) + m35dp15), (cellHeight >> i3) + i, AndroidUtilities.m35dp(f), paint2);
                this.rectF.set(AndroidUtilities.m35dp(76.0f), AndroidUtilities.m35dp(16.0f) + i, AndroidUtilities.m35dp(148.0f), i + AndroidUtilities.m35dp(24.0f));
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                this.rectF.set(AndroidUtilities.m35dp(76.0f), AndroidUtilities.m35dp(38.0f) + i, AndroidUtilities.m35dp(268.0f), AndroidUtilities.m35dp(46.0f) + i);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                if (SharedConfig.useThreeLinesLayout) {
                    this.rectF.set(AndroidUtilities.m35dp(76.0f), AndroidUtilities.m35dp(54.0f) + i, AndroidUtilities.m35dp(220.0f), AndroidUtilities.m35dp(62.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                }
                if (this.showDate) {
                    this.rectF.set(getMeasuredWidth() - AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(16.0f) + i, getMeasuredWidth() - AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(24.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
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
        } else if (getViewType() == 24) {
            while (i <= getMeasuredHeight()) {
                canvas.drawCircle(checkRtl(AndroidUtilities.m35dp(10.0f) + m35dp14), AndroidUtilities.m35dp(10.0f) + i + m35dp14, AndroidUtilities.m35dp(14.0f), paint2);
                canvas.save();
                canvas.translate(0.0f, -AndroidUtilities.m35dp(4.0f));
                this.rectF.set(AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(16.0f) + i, AndroidUtilities.m35dp(148.0f), AndroidUtilities.m35dp(24.0f) + i);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                this.rectF.set(AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(38.0f) + i, AndroidUtilities.m35dp(268.0f), AndroidUtilities.m35dp(46.0f) + i);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                if (SharedConfig.useThreeLinesLayout) {
                    this.rectF.set(AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(54.0f) + i, AndroidUtilities.m35dp(220.0f), AndroidUtilities.m35dp(62.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                }
                if (this.showDate) {
                    this.rectF.set(getMeasuredWidth() - AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(16.0f) + i, getMeasuredWidth() - AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(24.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                }
                canvas.restore();
                i += getCellHeight(getMeasuredWidth());
                int i5 = i2 + 1;
                if (this.isSingleCell && i5 >= this.itemsCount) {
                    break;
                }
                i2 = i5;
            }
        } else if (getViewType() == 18) {
            int i6 = i;
            while (i6 <= getMeasuredHeight()) {
                canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.m35dp(9.0f) + m35dp13), AndroidUtilities.m35dp(32.0f) + i6, AndroidUtilities.m35dp(25.0f), paint2);
                float f2 = 76;
                int i7 = (i2 % 2 == 0 ? 52 : 72) + 76;
                this.rectF.set(AndroidUtilities.m35dp(f2), AndroidUtilities.m35dp(20.0f) + i6, AndroidUtilities.m35dp(i7), AndroidUtilities.m35dp(28.0f) + i6);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                int i8 = i7 + 8;
                this.rectF.set(AndroidUtilities.m35dp(i8), AndroidUtilities.m35dp(20.0f) + i6, AndroidUtilities.m35dp(i8 + 84), AndroidUtilities.m35dp(28.0f) + i6);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                this.rectF.set(AndroidUtilities.m35dp(f2), AndroidUtilities.m35dp(42.0f) + i6, AndroidUtilities.m35dp(140), AndroidUtilities.m35dp(50.0f) + i6);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                canvas.drawLine(AndroidUtilities.m35dp(f2), getCellHeight(getMeasuredWidth()) + i6, getMeasuredWidth(), getCellHeight(getMeasuredWidth()) + i6, paint2);
                i6 += getCellHeight(getMeasuredWidth());
                int i9 = i2 + 1;
                if (this.isSingleCell && i9 >= this.itemsCount) {
                    break;
                }
                i2 = i9;
            }
        } else if (getViewType() == 19) {
            int i10 = i;
            while (i10 <= getMeasuredHeight()) {
                canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.m35dp(9.0f) + m35dp12), AndroidUtilities.m35dp(29.0f) + i10, AndroidUtilities.m35dp(20.0f), paint2);
                float f3 = 76;
                this.rectF.set(AndroidUtilities.m35dp(f3), AndroidUtilities.m35dp(16.0f) + i10, AndroidUtilities.m35dp((i2 % 2 == 0 ? 92 : ConnectionsManager.RequestFlagNeedQuickAck) + 76), AndroidUtilities.m35dp(24.0f) + i10);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                this.rectF.set(AndroidUtilities.m35dp(f3), AndroidUtilities.m35dp(38.0f) + i10, AndroidUtilities.m35dp(240), AndroidUtilities.m35dp(46.0f) + i10);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                canvas.drawLine(AndroidUtilities.m35dp(f3), getCellHeight(getMeasuredWidth()) + i10, getMeasuredWidth(), getCellHeight(getMeasuredWidth()) + i10, paint2);
                i10 += getCellHeight(getMeasuredWidth());
                int i11 = i2 + 1;
                if (this.isSingleCell && i11 >= this.itemsCount) {
                    break;
                }
                i2 = i11;
            }
        } else if (getViewType() == 1) {
            while (i <= getMeasuredHeight()) {
                canvas.drawCircle(checkRtl(AndroidUtilities.m35dp(9.0f) + m35dp11), (AndroidUtilities.m35dp(78.0f) >> 1) + i, AndroidUtilities.m35dp(25.0f), paint2);
                this.rectF.set(AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(20.0f) + i, AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(28.0f) + i);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                this.rectF.set(AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(42.0f) + i, AndroidUtilities.m35dp(260.0f), AndroidUtilities.m35dp(50.0f) + i);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                if (this.showDate) {
                    this.rectF.set(getMeasuredWidth() - AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(20.0f) + i, getMeasuredWidth() - AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(28.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                }
                i += getCellHeight(getMeasuredWidth());
                int i12 = i2 + 1;
                if (this.isSingleCell && i12 >= this.itemsCount) {
                    break;
                }
                i2 = i12;
            }
        } else if (getViewType() == 2) {
            int measuredWidth = (getMeasuredWidth() - (AndroidUtilities.m35dp(2.0f) * (getColumnsCount() - 1))) / getColumnsCount();
            int i13 = i;
            int i14 = 0;
            while (true) {
                if (i13 >= getMeasuredHeight() && !this.isSingleCell) {
                    break;
                }
                for (int i15 = 0; i15 < getColumnsCount(); i15++) {
                    if (i14 != 0 || i15 >= this.skipDrawItemsCount) {
                        canvas.drawRect((measuredWidth + AndroidUtilities.m35dp(2.0f)) * i15, i13, m35dp10 + measuredWidth, i13 + measuredWidth, paint2);
                    }
                }
                i13 += measuredWidth + AndroidUtilities.m35dp(2.0f);
                i14++;
                if (this.isSingleCell && i14 >= 2) {
                    break;
                }
            }
        } else {
            int i16 = 2;
            if (getViewType() == 3) {
                while (i <= getMeasuredHeight()) {
                    this.rectF.set(AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(8.0f) + i, AndroidUtilities.m35dp(52.0f), AndroidUtilities.m35dp(48.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    this.rectF.set(AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(12.0f) + i, AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(20.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    this.rectF.set(AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(34.0f) + i, AndroidUtilities.m35dp(260.0f), AndroidUtilities.m35dp(42.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    if (this.showDate) {
                        this.rectF.set(getMeasuredWidth() - AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(12.0f) + i, getMeasuredWidth() - AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(20.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    }
                    i += getCellHeight(getMeasuredWidth());
                    int i17 = i2 + 1;
                    if (this.isSingleCell && i17 >= this.itemsCount) {
                        break;
                    }
                    i2 = i17;
                }
            } else if (getViewType() == 4) {
                while (i <= getMeasuredHeight()) {
                    canvas.drawCircle(checkRtl(AndroidUtilities.m35dp(12.0f) + m35dp9), AndroidUtilities.m35dp(6.0f) + i + m35dp9, AndroidUtilities.m35dp(44.0f) >> 1, paint2);
                    this.rectF.set(AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(12.0f) + i, AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(20.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    this.rectF.set(AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(34.0f) + i, AndroidUtilities.m35dp(260.0f), AndroidUtilities.m35dp(42.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    if (this.showDate) {
                        this.rectF.set(getMeasuredWidth() - AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(12.0f) + i, getMeasuredWidth() - AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(20.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    }
                    i += getCellHeight(getMeasuredWidth());
                    int i18 = i2 + 1;
                    if (this.isSingleCell && i18 >= this.itemsCount) {
                        break;
                    }
                    i2 = i18;
                }
            } else if (getViewType() == 5) {
                while (i <= getMeasuredHeight()) {
                    this.rectF.set(AndroidUtilities.m35dp(10.0f), AndroidUtilities.m35dp(11.0f) + i, AndroidUtilities.m35dp(62.0f), AndroidUtilities.m35dp(63.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    this.rectF.set(AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(12.0f) + i, AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(20.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    this.rectF.set(AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(34.0f) + i, AndroidUtilities.m35dp(268.0f), AndroidUtilities.m35dp(42.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    this.rectF.set(AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(54.0f) + i, AndroidUtilities.m35dp(188.0f), AndroidUtilities.m35dp(62.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    if (this.showDate) {
                        this.rectF.set(getMeasuredWidth() - AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(12.0f) + i, getMeasuredWidth() - AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(20.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    }
                    i += getCellHeight(getMeasuredWidth());
                    int i19 = i2 + 1;
                    if (this.isSingleCell && i19 >= this.itemsCount) {
                        break;
                    }
                    i2 = i19;
                }
            } else if (getViewType() == 6 || getViewType() == 10) {
                while (i <= getMeasuredHeight()) {
                    canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.m35dp(9.0f) + m35dp), (AndroidUtilities.m35dp(64.0f) >> 1) + i, AndroidUtilities.m35dp(23.0f), paint2);
                    this.rectF.set(this.paddingLeft + AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(17.0f) + i, this.paddingLeft + AndroidUtilities.m35dp(260.0f), AndroidUtilities.m35dp(25.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    this.rectF.set(this.paddingLeft + AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(39.0f) + i, this.paddingLeft + AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(47.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    if (this.showDate) {
                        this.rectF.set(getMeasuredWidth() - AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(20.0f) + i, getMeasuredWidth() - AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(28.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    }
                    i += getCellHeight(getMeasuredWidth());
                    int i20 = i2 + 1;
                    if (this.isSingleCell && i20 >= this.itemsCount) {
                        break;
                    }
                    i2 = i20;
                }
            } else if (getViewType() == 8) {
                while (i <= getMeasuredHeight()) {
                    canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.m35dp(11.0f) + m35dp8), (AndroidUtilities.m35dp(64.0f) >> 1) + i, AndroidUtilities.m35dp(23.0f), paint2);
                    this.rectF.set(this.paddingLeft + AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(17.0f) + i, this.paddingLeft + AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(25.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    this.rectF.set(this.paddingLeft + AndroidUtilities.m35dp(68.0f), AndroidUtilities.m35dp(39.0f) + i, this.paddingLeft + AndroidUtilities.m35dp(260.0f), AndroidUtilities.m35dp(47.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    if (this.showDate) {
                        this.rectF.set(getMeasuredWidth() - AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(20.0f) + i, getMeasuredWidth() - AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(28.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    }
                    i += getCellHeight(getMeasuredWidth());
                    int i21 = i2 + 1;
                    if (this.isSingleCell && i21 >= this.itemsCount) {
                        break;
                    }
                    i2 = i21;
                }
            } else if (getViewType() == 9) {
                while (i <= getMeasuredHeight()) {
                    canvas.drawCircle(checkRtl(AndroidUtilities.m35dp(35.0f)), (getCellHeight(getMeasuredWidth()) >> 1) + i, AndroidUtilities.m35dp(32.0f) / i16, paint2);
                    this.rectF.set(AndroidUtilities.m35dp(72.0f), AndroidUtilities.m35dp(16.0f) + i, AndroidUtilities.m35dp(268.0f), i + AndroidUtilities.m35dp(24.0f));
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    this.rectF.set(AndroidUtilities.m35dp(72.0f), AndroidUtilities.m35dp(38.0f) + i, AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(46.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    if (this.showDate) {
                        this.rectF.set(getMeasuredWidth() - AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(16.0f) + i, getMeasuredWidth() - AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(24.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    }
                    i += getCellHeight(getMeasuredWidth());
                    int i22 = i2 + 1;
                    if (this.isSingleCell && i22 >= this.itemsCount) {
                        break;
                    }
                    i2 = i22;
                    i16 = 2;
                }
            } else if (getViewType() == 11) {
                int i23 = 0;
                while (i <= getMeasuredHeight()) {
                    this.rectF.set(AndroidUtilities.m35dp(18.0f), AndroidUtilities.m35dp(14.0f), (getMeasuredWidth() * 0.5f) + AndroidUtilities.m35dp(this.randomParams[0] * 40.0f), AndroidUtilities.m35dp(14.0f) + AndroidUtilities.m35dp(8.0f));
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    this.rectF.set(getMeasuredWidth() - AndroidUtilities.m35dp(18.0f), AndroidUtilities.m35dp(14.0f), (getMeasuredWidth() - (getMeasuredWidth() * 0.2f)) - AndroidUtilities.m35dp(this.randomParams[0] * 20.0f), AndroidUtilities.m35dp(14.0f) + AndroidUtilities.m35dp(8.0f));
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    i += getCellHeight(getMeasuredWidth());
                    i23++;
                    if (this.isSingleCell && i23 >= this.itemsCount) {
                        break;
                    }
                }
            } else if (getViewType() == 12) {
                int m35dp17 = i + AndroidUtilities.m35dp(14.0f);
                while (m35dp17 <= getMeasuredHeight()) {
                    int measuredWidth2 = getMeasuredWidth() / 4;
                    for (int i24 = 0; i24 < 4; i24++) {
                        float f4 = (measuredWidth2 * i24) + (measuredWidth2 / 2.0f);
                        canvas.drawCircle(f4, AndroidUtilities.m35dp(7.0f) + m35dp17 + (AndroidUtilities.m35dp(56.0f) / 2.0f), AndroidUtilities.m35dp(28.0f), paint2);
                        float m35dp18 = AndroidUtilities.m35dp(7.0f) + m35dp17 + AndroidUtilities.m35dp(56.0f) + AndroidUtilities.m35dp(16.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(f4 - AndroidUtilities.m35dp(24.0f), m35dp18 - AndroidUtilities.m35dp(4.0f), f4 + AndroidUtilities.m35dp(24.0f), m35dp18 + AndroidUtilities.m35dp(4.0f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                    }
                    m35dp17 += getCellHeight(getMeasuredWidth());
                    if (this.isSingleCell) {
                        break;
                    }
                }
            } else if (getViewType() == 13) {
                float measuredHeight = getMeasuredHeight() / 2.0f;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.m35dp(40.0f), measuredHeight - AndroidUtilities.m35dp(4.0f), getMeasuredWidth() - AndroidUtilities.m35dp(120.0f), AndroidUtilities.m35dp(4.0f) + measuredHeight);
                canvas.drawRoundRect(rectF2, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                if (this.backgroundPaint == null) {
                    Paint paint3 = new Paint(1);
                    this.backgroundPaint = paint3;
                    paint3.setColor(Theme.getColor("actionBarDefaultSubmenuBackground"));
                }
                for (int i25 = 0; i25 < 3; i25++) {
                    canvas.drawCircle((getMeasuredWidth() - AndroidUtilities.m35dp(56.0f)) + AndroidUtilities.m35dp(13.0f) + (AndroidUtilities.m35dp(12.0f) * i25), measuredHeight, AndroidUtilities.m35dp(13.0f), this.backgroundPaint);
                    canvas.drawCircle((getMeasuredWidth() - AndroidUtilities.m35dp(56.0f)) + AndroidUtilities.m35dp(13.0f) + (AndroidUtilities.m35dp(12.0f) * i25), measuredHeight, AndroidUtilities.m35dp(12.0f), paint2);
                }
            } else if (getViewType() == 14 || getViewType() == 17) {
                int m35dp19 = AndroidUtilities.m35dp(12.0f);
                int m35dp20 = AndroidUtilities.m35dp(77.0f);
                int m35dp21 = AndroidUtilities.m35dp(4.0f);
                float m35dp22 = AndroidUtilities.m35dp(21.0f);
                float m35dp23 = AndroidUtilities.m35dp(41.0f);
                while (m35dp19 < getMeasuredWidth()) {
                    if (this.backgroundPaint == null) {
                        this.backgroundPaint = new Paint(1);
                    }
                    this.backgroundPaint.setColor(Theme.getColor("dialogBackground", this.resourcesProvider));
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    int i26 = m35dp19 + m35dp20;
                    rectF3.set(AndroidUtilities.m35dp(4.0f) + m35dp19, AndroidUtilities.m35dp(4.0f), i26 - AndroidUtilities.m35dp(4.0f), getMeasuredHeight() - AndroidUtilities.m35dp(4.0f));
                    canvas.drawRoundRect(rectF3, AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f), paint2);
                    if (getViewType() == 14) {
                        float m35dp24 = AndroidUtilities.m35dp(8.0f) + m35dp21;
                        float f5 = m35dp19;
                        float m35dp25 = AndroidUtilities.m35dp(22.0f) + m35dp21 + f5;
                        this.rectF.set(m35dp25, m35dp24, m35dp25 + m35dp23, m35dp24 + m35dp22);
                        RectF rectF4 = this.rectF;
                        canvas.drawRoundRect(rectF4, rectF4.height() * 0.5f, this.rectF.height() * 0.5f, this.backgroundPaint);
                        float m35dp26 = m35dp24 + AndroidUtilities.m35dp(4.0f) + m35dp22;
                        float m35dp27 = f5 + AndroidUtilities.m35dp(5.0f) + m35dp21;
                        this.rectF.set(m35dp27, m35dp26, m35dp27 + m35dp23, m35dp26 + m35dp22);
                        RectF rectF5 = this.rectF;
                        canvas.drawRoundRect(rectF5, rectF5.height() * 0.5f, this.rectF.height() * 0.5f, this.backgroundPaint);
                    } else if (getViewType() == 17) {
                        float m35dp28 = AndroidUtilities.m35dp(5.0f);
                        float m35dp29 = AndroidUtilities.m35dp(32.0f);
                        float f6 = m35dp19 + ((m35dp20 - m35dp29) / 2.0f);
                        rectF3.set(f6, AndroidUtilities.m35dp(21.0f), m35dp29 + f6, m35dp2 + AndroidUtilities.m35dp(32.0f));
                        canvas.drawRoundRect(rectF3, m35dp28, m35dp28, this.backgroundPaint);
                    }
                    canvas.drawCircle(m35dp19 + (m35dp20 / 2), getMeasuredHeight() - AndroidUtilities.m35dp(20.0f), AndroidUtilities.m35dp(8.0f), this.backgroundPaint);
                    m35dp19 = i26;
                }
            } else if (getViewType() == 15) {
                int m35dp30 = AndroidUtilities.m35dp(23.0f);
                int m35dp31 = AndroidUtilities.m35dp(4.0f);
                while (i <= getMeasuredHeight()) {
                    float f7 = m35dp30;
                    canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.m35dp(12.0f)) + f7, AndroidUtilities.m35dp(8.0f) + i + m35dp30, f7, paint2);
                    this.rectF.set(this.paddingLeft + AndroidUtilities.m35dp(74.0f), AndroidUtilities.m35dp(12.0f) + i, this.paddingLeft + AndroidUtilities.m35dp(260.0f), AndroidUtilities.m35dp(20.0f) + i);
                    checkRtl(this.rectF);
                    float f8 = m35dp31;
                    canvas.drawRoundRect(this.rectF, f8, f8, paint2);
                    this.rectF.set(this.paddingLeft + AndroidUtilities.m35dp(74.0f), AndroidUtilities.m35dp(36.0f) + i, this.paddingLeft + AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(42.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, f8, f8, paint2);
                    i += getCellHeight(getMeasuredWidth());
                    int i27 = i2 + 1;
                    if (this.isSingleCell && i27 >= this.itemsCount) {
                        break;
                    }
                    i2 = i27;
                }
            } else if (getViewType() == 16 || getViewType() == 23) {
                int i28 = 0;
                while (i <= getMeasuredHeight()) {
                    canvas.drawCircle(checkRtl(this.paddingLeft + AndroidUtilities.m35dp(8.0f) + m35dp3), AndroidUtilities.m35dp(24.0f) + i, AndroidUtilities.m35dp(18.0f), paint2);
                    this.rectF.set(this.paddingLeft + AndroidUtilities.m35dp(58.0f), AndroidUtilities.m35dp(20.0f) + i, getWidth() - AndroidUtilities.m35dp(53.0f), AndroidUtilities.m35dp(28.0f) + i);
                    checkRtl(this.rectF);
                    canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), paint2);
                    if (i28 < 4) {
                        canvas.drawCircle(checkRtl((getWidth() - AndroidUtilities.m35dp(12.0f)) - m35dp4), AndroidUtilities.m35dp(24.0f) + i, AndroidUtilities.m35dp(12.0f), paint2);
                    }
                    i += getCellHeight(getMeasuredWidth());
                    i28++;
                    if (this.isSingleCell && i28 >= this.itemsCount) {
                        break;
                    }
                }
                this.rectF.set(this.paddingLeft + AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(20.0f) + i, getWidth() - AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(28.0f) + i);
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), paint2);
                this.rectF.set(this.paddingLeft + AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(36.0f) + i, getWidth() - AndroidUtilities.m35dp(53.0f), i + AndroidUtilities.m35dp(44.0f));
                checkRtl(this.rectF);
                canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), paint2);
            } else {
                int i29 = this.viewType;
                if (i29 == 21) {
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(AndroidUtilities.m35dp(20.0f) + m35dp7), (AndroidUtilities.m35dp(58.0f) >> 1) + i, AndroidUtilities.m35dp(46.0f) >> 1, paint2);
                        this.rectF.set(AndroidUtilities.m35dp(74.0f), AndroidUtilities.m35dp(16.0f) + i, AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(24.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                        this.rectF.set(AndroidUtilities.m35dp(74.0f), AndroidUtilities.m35dp(38.0f) + i, AndroidUtilities.m35dp(260.0f), AndroidUtilities.m35dp(46.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                        i += getCellHeight(getMeasuredWidth());
                        int i30 = i2 + 1;
                        if (this.isSingleCell && i30 >= this.itemsCount) {
                            break;
                        }
                        i2 = i30;
                    }
                } else if (i29 == 22) {
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(checkRtl(AndroidUtilities.m35dp(20.0f) + m35dp6), AndroidUtilities.m35dp(6.0f) + i + m35dp6, AndroidUtilities.m35dp(48.0f) >> 1, paint2);
                        this.rectF.set(AndroidUtilities.m35dp(76.0f), AndroidUtilities.m35dp(16.0f) + i, AndroidUtilities.m35dp(140.0f), AndroidUtilities.m35dp(24.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                        this.rectF.set(AndroidUtilities.m35dp(76.0f), AndroidUtilities.m35dp(38.0f) + i, AndroidUtilities.m35dp(260.0f), AndroidUtilities.m35dp(46.0f) + i);
                        checkRtl(this.rectF);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                        i += getCellHeight(getMeasuredWidth());
                        int i31 = i2 + 1;
                        if (this.isSingleCell && i31 >= this.itemsCount) {
                            break;
                        }
                        i2 = i31;
                    }
                } else if (i29 == 25) {
                    while (i <= getMeasuredHeight()) {
                        canvas.drawCircle(AndroidUtilities.m35dp(17.0f) + m35dp5, AndroidUtilities.m35dp(6.0f) + i + m35dp5, AndroidUtilities.m35dp(38.0f) >> 1, paint2);
                        this.rectF.set(AndroidUtilities.m35dp(76.0f), AndroidUtilities.m35dp(21.0f) + i, AndroidUtilities.m35dp(220.0f), AndroidUtilities.m35dp(29.0f) + i);
                        canvas.drawRoundRect(this.rectF, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(4.0f), paint2);
                        i += getCellHeight(getMeasuredWidth());
                        int i32 = i2 + 1;
                        if (this.isSingleCell && i32 >= this.itemsCount) {
                            break;
                        }
                        i2 = i32;
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
        if (this.color1 == themedColor2 && this.color0 == themedColor) {
            return;
        }
        this.color0 = themedColor;
        this.color1 = themedColor2;
        if (this.isSingleCell || (i = this.viewType) == 13 || i == 14 || i == 17) {
            int m35dp = AndroidUtilities.m35dp(200.0f);
            this.gradientWidth = m35dp;
            this.gradient = new LinearGradient(0.0f, 0.0f, m35dp, 0.0f, new int[]{themedColor2, themedColor, themedColor, themedColor2}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            int m35dp2 = AndroidUtilities.m35dp(600.0f);
            this.gradientWidth = m35dp2;
            this.gradient = new LinearGradient(0.0f, 0.0f, 0.0f, m35dp2, new int[]{themedColor2, themedColor, themedColor, themedColor2}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
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
                return AndroidUtilities.m35dp(78.0f) + 1;
            case 2:
                return ((i - (AndroidUtilities.m35dp(2.0f) * (getColumnsCount() - 1))) / getColumnsCount()) + AndroidUtilities.m35dp(2.0f);
            case 3:
            case 4:
                return AndroidUtilities.m35dp(56.0f);
            case 5:
                return AndroidUtilities.m35dp(80.0f);
            case 6:
            case 18:
                return AndroidUtilities.m35dp(64.0f);
            case 7:
                return AndroidUtilities.m35dp((SharedConfig.useThreeLinesLayout ? 78 : 72) + 1);
            case 8:
                return AndroidUtilities.m35dp(61.0f);
            case 9:
                return AndroidUtilities.m35dp(66.0f);
            case 10:
                return AndroidUtilities.m35dp(58.0f);
            case 11:
                return AndroidUtilities.m35dp(36.0f);
            case 12:
                return AndroidUtilities.m35dp(103.0f);
            case 13:
            case 14:
            case 17:
            case 20:
            default:
                return 0;
            case 15:
                return AndroidUtilities.m35dp(107.0f);
            case 16:
            case 23:
                return AndroidUtilities.m35dp(48.0f);
            case 19:
                return AndroidUtilities.m35dp(58.0f);
            case 21:
                return AndroidUtilities.m35dp(58.0f);
            case 22:
                return AndroidUtilities.m35dp(60.0f);
            case 24:
                return AndroidUtilities.m35dp((SharedConfig.useThreeLinesLayout ? 76 : 64) + 1);
            case 25:
                return AndroidUtilities.m35dp(51.0f);
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
