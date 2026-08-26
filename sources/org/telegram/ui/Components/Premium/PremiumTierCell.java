package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.PremiumPreviewFragment;

public class PremiumTierCell extends ViewGroup {
    private CheckBox2 checkBox;
    private int color0;
    private int color1;
    private int colorKey1;
    private int colorKey2;
    protected TextView discountView;
    private PremiumTierCell globalGradientView;
    private LinearGradient gradient;
    private int gradientWidth;
    private boolean hasDivider;
    private boolean isDrawingGradient;
    private long lastUpdateTime;
    private int leftPaddingToCheckboxDp;
    private int leftPaddingToTextDp;
    private Matrix matrix;
    private Paint paint;
    private int parentHeight;
    private int parentWidth;
    private float parentXOffset;
    private TextView pricePerMonthView;
    private TextView pricePerYearStrikeView;
    private TextView pricePerYearView;
    protected PremiumPreviewFragment.SubscriptionTier tier;
    private TextView titleView;
    private int totalTranslation;

    public PremiumTierCell(Context context) {
        super(context);
        this.leftPaddingToTextDp = 12;
        this.leftPaddingToCheckboxDp = 8;
        this.colorKey1 = Theme.key_windowBackgroundWhite;
        this.colorKey2 = Theme.key_windowBackgroundGray;
        this.paint = new Paint();
        this.matrix = new Matrix();
        CheckBox2 checkBox2 = new CheckBox2(context, 24);
        this.checkBox = checkBox2;
        checkBox2.setDrawBackgroundAsArc(10);
        CheckBox2 checkBox3 = this.checkBox;
        int i = Theme.key_radioBackground;
        checkBox3.setColor(i, i, Theme.key_checkboxCheck);
        addView(this.checkBox);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 16.0f);
        this.titleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        this.titleView.setTypeface(AndroidUtilities.bold());
        this.titleView.setSingleLine();
        addView(this.titleView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.discountView = textView2;
        textView2.setTextSize(1, 14.0f);
        this.discountView.setTextColor(-1);
        this.discountView.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        this.discountView.setTypeface(AndroidUtilities.bold());
        addView(this.discountView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.pricePerYearStrikeView = textView3;
        textView3.setTextSize(1, 14.0f);
        TextView textView4 = this.pricePerYearStrikeView;
        int i2 = Theme.key_windowBackgroundWhiteGrayText;
        textView4.setTextColor(Theme.getColor(null, i2, false));
        this.pricePerYearStrikeView.getPaint().setStrikeThruText(true);
        this.pricePerYearStrikeView.setSingleLine();
        addView(this.pricePerYearStrikeView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.pricePerYearView = textView5;
        textView5.setTextSize(1, 14.0f);
        this.pricePerYearView.setTextColor(Theme.getColor(null, i2, false));
        this.pricePerYearView.setSingleLine();
        addView(this.pricePerYearView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView6 = new TextView(context);
        this.pricePerMonthView = textView6;
        textView6.setTextSize(1, 15.0f);
        this.pricePerMonthView.setTextColor(Theme.getColor(null, i2, false));
        this.pricePerMonthView.setSingleLine();
        addView(this.pricePerMonthView, LayoutHelper.createFrame(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public void bind(PremiumPreviewFragment.SubscriptionTier subscriptionTier, boolean z) {
        this.tier = subscriptionTier;
        this.hasDivider = z;
        int months = subscriptionTier.getMonths();
        if (months == 1) {
            this.titleView.setText(LocaleController.getString(R.string.PremiumTierMonthly));
        } else if (months == 6) {
            this.titleView.setText(LocaleController.getString(R.string.PremiumTierSemiannual));
        } else if (months != 12) {
            this.titleView.setText((subscriptionTier.getMonths() <= 12 || subscriptionTier.getMonths() % 12 != 0) ? LocaleController.formatPluralString("Months", subscriptionTier.getMonths(), new Object[0]) : LocaleController.formatPluralString("PremiumTierAnnualYears", subscriptionTier.getMonths() / 12, new Object[0]));
        } else {
            this.titleView.setText(LocaleController.getString(R.string.PremiumTierAnnual));
        }
        boolean z2 = !BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || subscriptionTier.getOfferDetails() == null);
        this.isDrawingGradient = z2;
        if (z2) {
            this.discountView.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, 10));
            this.discountView.setVisibility(0);
            this.pricePerYearStrikeView.setVisibility(0);
            this.pricePerYearView.setVisibility(0);
            this.pricePerYearStrikeView.setText("USD00.00");
            this.pricePerYearView.setText(LocaleController.formatString(R.string.PricePerYear, 1000));
            this.pricePerMonthView.setText(LocaleController.formatString(R.string.PricePerMonthMe, 100));
        } else {
            if (subscriptionTier.getDiscount() <= 0) {
                this.discountView.setVisibility(8);
                this.pricePerYearStrikeView.setVisibility(8);
                this.pricePerYearView.setVisibility(8);
            } else {
                this.discountView.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(subscriptionTier.getDiscount())));
                this.discountView.setVisibility(0);
                this.pricePerYearStrikeView.setVisibility(0);
                this.pricePerYearView.setVisibility(0);
            }
            this.pricePerYearStrikeView.setText(subscriptionTier.getFormattedPricePerYearRegular());
            this.pricePerYearView.setText(LocaleController.formatString(R.string.PricePerYear, subscriptionTier.getFormattedPricePerYear()));
            this.pricePerMonthView.setText(LocaleController.formatString(R.string.PricePerMonthMe, subscriptionTier.getFormattedPricePerMonth()));
            if (subscriptionTier.subscriptionOption.current) {
                this.pricePerYearView.setVisibility(0);
                this.pricePerYearView.setText(LocaleController.getString(R.string.YourCurrentPlan));
            }
        }
        requestLayout();
    }

    public final void checkRtlAndLayout(View view) {
        Rect rect = AndroidUtilities.rectTmp2;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (LocaleController.isRTL) {
            int i = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (!this.isDrawingGradient) {
            super.dispatchDraw(canvas);
            return;
        }
        Paint paint = this.paint;
        PremiumTierCell premiumTierCell = this.globalGradientView;
        if (premiumTierCell != null) {
            paint = premiumTierCell.paint;
        }
        drawChild(canvas, this.checkBox, getDrawingTime());
        updateColors();
        updateGradient();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.pricePerMonthView.getLeft(), AndroidUtilities.dp(4.0f) + this.pricePerMonthView.getTop(), this.pricePerMonthView.getRight(), this.pricePerMonthView.getBottom() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        rectF.set(this.pricePerYearStrikeView.getLeft(), AndroidUtilities.dp(3.0f) + this.pricePerYearStrikeView.getTop(), this.pricePerYearStrikeView.getRight(), this.pricePerYearStrikeView.getBottom() - AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        rectF.set(this.titleView.getLeft(), AndroidUtilities.dp(4.0f) + this.titleView.getTop(), this.titleView.getRight(), this.titleView.getBottom() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        invalidate();
    }

    public PremiumPreviewFragment.SubscriptionTier getTier() {
        return this.tier;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.hasDivider) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, this.titleView.getRight(), getHeight() - 1, Theme.dividerPaint);
            } else {
                canvas.drawLine(this.titleView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(getPaddingLeft() + AndroidUtilities.dp(this.leftPaddingToCheckboxDp), (int) ((getMeasuredHeight() - this.checkBox.getMeasuredHeight()) / 2.0f), 0, 0);
        checkRtlAndLayout(this.checkBox);
        int measuredHeight = (int) ((getMeasuredHeight() - this.pricePerMonthView.getMeasuredHeight()) / 2.0f);
        if (getPaddingLeft() + this.pricePerYearView.getMeasuredWidth() + this.checkBox.getMeasuredWidth() + AndroidUtilities.dp(this.leftPaddingToCheckboxDp + this.leftPaddingToTextDp + 24) + (this.pricePerYearStrikeView.getVisibility() == 0 ? this.pricePerYearStrikeView.getMeasuredWidth() : 0) > getMeasuredWidth() - this.pricePerMonthView.getMeasuredWidth() && this.discountView.getVisibility() == 0) {
            measuredHeight = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - this.pricePerMonthView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight, 0, 0);
        checkRtlAndLayout(this.pricePerMonthView);
        rect.set(getPaddingLeft() + this.checkBox.getMeasuredWidth() + AndroidUtilities.dp(this.leftPaddingToCheckboxDp + this.leftPaddingToTextDp), this.pricePerYearView.getVisibility() == 8 ? (int) ((getMeasuredHeight() - this.titleView.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        checkRtlAndLayout(this.titleView);
        if (this.discountView.getVisibility() == 0) {
            rect.set(this.titleView.getMeasuredWidth() + getPaddingLeft() + this.checkBox.getMeasuredWidth() + AndroidUtilities.dp(this.leftPaddingToCheckboxDp + this.leftPaddingToTextDp + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            checkRtlAndLayout(this.discountView);
        }
        rect.set(getPaddingLeft() + this.checkBox.getMeasuredWidth() + AndroidUtilities.dp(this.leftPaddingToCheckboxDp + this.leftPaddingToTextDp), (getMeasuredHeight() - this.pricePerYearStrikeView.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        checkRtlAndLayout(this.pricePerYearStrikeView);
        int measuredWidth = this.checkBox.getMeasuredWidth() + AndroidUtilities.dp(this.leftPaddingToCheckboxDp + this.leftPaddingToTextDp);
        if (this.pricePerYearStrikeView.getVisibility() == 0) {
            iDp = AndroidUtilities.dp(6.0f) + this.pricePerYearStrikeView.getMeasuredWidth();
        } else {
            iDp = 0;
        }
        rect.set(getPaddingLeft() + measuredWidth + iDp, (getMeasuredHeight() - this.pricePerYearView.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        checkRtlAndLayout(this.pricePerYearView);
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.dp(58.0f);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824);
        this.checkBox.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        this.pricePerMonthView.measure(View.MeasureSpec.makeMeasureSpec(size - this.checkBox.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        this.titleView.measure(View.MeasureSpec.makeMeasureSpec((size - this.checkBox.getMeasuredWidth()) - this.pricePerMonthView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        if (this.discountView.getVisibility() == 0) {
            this.discountView.measure(View.MeasureSpec.makeMeasureSpec((size - this.checkBox.getMeasuredWidth()) - this.pricePerMonthView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        } else {
            this.discountView.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        this.pricePerYearStrikeView.measure(View.MeasureSpec.makeMeasureSpec(size - this.checkBox.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        this.pricePerYearView.measure(OKLCH.m(6.0f, (size - this.checkBox.getMeasuredWidth()) - (this.pricePerYearStrikeView.getVisibility() == 0 ? this.pricePerYearStrikeView.getMeasuredWidth() : 0), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        if (this.pricePerYearView.getVisibility() != 0) {
            iDp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, iDp);
    }

    public void setChecked(boolean z, boolean z2) {
        this.checkBox.setChecked(z, z2);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.checkBox.setCirclePaintProvider(genericProvider);
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.titleView.setAlpha(z ? 1.0f : 0.6f);
        this.pricePerMonthView.setAlpha(z ? 1.0f : 0.6f);
        this.checkBox.setAlpha(z ? 1.0f : 0.6f);
    }

    public void setGlobalGradientView(PremiumTierCell premiumTierCell) {
        this.globalGradientView = premiumTierCell;
    }

    public void setParentSize(int i, int i2, float f) {
        this.parentWidth = i;
        this.parentHeight = i2;
        this.parentXOffset = f;
    }

    public void setParentXOffset(float f) {
        this.parentXOffset = f;
    }

    public void setProgressDelegate(CheckBoxBase.ProgressDelegate progressDelegate) {
        this.checkBox.setProgressDelegate(progressDelegate);
    }

    public void updateColors() {
        PremiumTierCell premiumTierCell = this.globalGradientView;
        if (premiumTierCell != null) {
            premiumTierCell.updateColors();
            return;
        }
        int color = Theme.getColor(null, this.colorKey1, false);
        int color2 = Theme.getColor(null, this.colorKey2, false);
        if (this.color1 == color2 && this.color0 == color) {
            return;
        }
        this.color0 = color;
        this.color1 = color2;
        int iDp = AndroidUtilities.dp(200.0f);
        this.gradientWidth = iDp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, iDp, 0.0f, new int[]{color2, color, color, color2}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.gradient = linearGradient;
        this.paint.setShader(linearGradient);
    }

    public void updateGradient() {
        PremiumTierCell premiumTierCell = this.globalGradientView;
        if (premiumTierCell != null) {
            premiumTierCell.updateGradient();
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
        int measuredWidth = this.parentWidth;
        if (measuredWidth == 0) {
            measuredWidth = getMeasuredWidth();
        }
        this.lastUpdateTime = jElapsedRealtime;
        int i = (int) (((jAbs * ((long) measuredWidth)) / 400.0f) + this.totalTranslation);
        this.totalTranslation = i;
        if (i >= measuredWidth * 4) {
            this.totalTranslation = (-this.gradientWidth) * 2;
        }
        this.matrix.setTranslate(this.totalTranslation + this.parentXOffset, 0.0f);
        LinearGradient linearGradient = this.gradient;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(this.matrix);
        }
    }
}
