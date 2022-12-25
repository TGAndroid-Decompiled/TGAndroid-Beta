package org.telegram.p009ui.Components.Premium;

import android.annotation.SuppressLint;
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
import org.telegram.messenger.C1072R;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.CheckBoxBase;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.PremiumPreviewFragment;

public class PremiumTierCell extends ViewGroup {
    private CheckBox2 checkBox;
    private int color0;
    private int color1;
    private String colorKey1;
    private String colorKey2;
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
        this.colorKey1 = "windowBackgroundWhite";
        this.colorKey2 = "windowBackgroundGray";
        this.paint = new Paint();
        this.matrix = new Matrix();
        CheckBox2 checkBox2 = new CheckBox2(context, 24);
        this.checkBox = checkBox2;
        checkBox2.setDrawBackgroundAsArc(10);
        this.checkBox.setColor("radioBackground", "radioBackground", "checkboxCheck");
        addView(this.checkBox);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 16.0f);
        this.titleView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleView.setSingleLine();
        addView(this.titleView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.discountView = textView2;
        textView2.setTextSize(1, 14.0f);
        this.discountView.setTextColor(-1);
        this.discountView.setPadding(AndroidUtilities.m35dp(3.0f), 0, AndroidUtilities.m35dp(3.0f), 0);
        this.discountView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        addView(this.discountView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.pricePerYearStrikeView = textView3;
        textView3.setTextSize(1, 14.0f);
        this.pricePerYearStrikeView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        this.pricePerYearStrikeView.getPaint().setStrikeThruText(true);
        this.pricePerYearStrikeView.setSingleLine();
        addView(this.pricePerYearStrikeView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.pricePerYearView = textView4;
        textView4.setTextSize(1, 14.0f);
        this.pricePerYearView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        this.pricePerYearView.setSingleLine();
        addView(this.pricePerYearView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.pricePerMonthView = textView5;
        textView5.setTextSize(1, 15.0f);
        this.pricePerMonthView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        this.pricePerMonthView.setSingleLine();
        addView(this.pricePerMonthView, LayoutHelper.createFrame(-2, -2, 8388613));
        setPadding(AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.hasDivider) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, this.titleView.getRight(), getHeight() - 1, Theme.dividerPaint);
            } else {
                canvas.drawLine(this.titleView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    public void setParentXOffset(float f) {
        this.parentXOffset = f;
    }

    public void setGlobalGradientView(PremiumTierCell premiumTierCell) {
        this.globalGradientView = premiumTierCell;
    }

    public void setProgressDelegate(CheckBoxBase.ProgressDelegate progressDelegate) {
        this.checkBox.setProgressDelegate(progressDelegate);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.checkBox.setCirclePaintProvider(genericProvider);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(AndroidUtilities.m35dp(this.leftPaddingToCheckboxDp) + getPaddingLeft(), (int) ((getMeasuredHeight() - this.checkBox.getMeasuredHeight()) / 2.0f), 0, 0);
        checkRtlAndLayout(this.checkBox);
        int measuredHeight = (int) ((getMeasuredHeight() - this.pricePerMonthView.getMeasuredHeight()) / 2.0f);
        if (AndroidUtilities.m35dp(this.leftPaddingToCheckboxDp + this.leftPaddingToTextDp + 24) + this.checkBox.getMeasuredWidth() + this.pricePerYearStrikeView.getMeasuredWidth() + this.pricePerYearView.getMeasuredWidth() + getPaddingLeft() > getMeasuredWidth() - this.pricePerMonthView.getMeasuredWidth() && this.discountView.getVisibility() == 0) {
            measuredHeight = getPaddingTop() + AndroidUtilities.m35dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - this.pricePerMonthView.getMeasuredWidth()) - AndroidUtilities.m35dp(16.0f)) - getPaddingRight(), measuredHeight, 0, 0);
        checkRtlAndLayout(this.pricePerMonthView);
        rect.set(AndroidUtilities.m35dp(this.leftPaddingToCheckboxDp + this.leftPaddingToTextDp) + this.checkBox.getMeasuredWidth() + getPaddingLeft(), this.pricePerYearView.getVisibility() == 8 ? (int) ((getMeasuredHeight() - this.titleView.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        checkRtlAndLayout(this.titleView);
        if (this.discountView.getVisibility() == 0) {
            rect.set(AndroidUtilities.m35dp(this.leftPaddingToCheckboxDp + this.leftPaddingToTextDp + 6) + this.checkBox.getMeasuredWidth() + getPaddingLeft() + this.titleView.getMeasuredWidth(), getPaddingTop() + AndroidUtilities.m35dp(2.0f), 0, 0);
            checkRtlAndLayout(this.discountView);
        }
        rect.set(AndroidUtilities.m35dp(this.leftPaddingToCheckboxDp + this.leftPaddingToTextDp) + this.checkBox.getMeasuredWidth() + getPaddingLeft(), (getMeasuredHeight() - this.pricePerYearStrikeView.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        checkRtlAndLayout(this.pricePerYearStrikeView);
        rect.set(AndroidUtilities.m35dp(this.leftPaddingToCheckboxDp + this.leftPaddingToTextDp + 6) + this.checkBox.getMeasuredWidth() + this.pricePerYearStrikeView.getMeasuredWidth() + getPaddingLeft(), (getMeasuredHeight() - this.pricePerYearView.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        checkRtlAndLayout(this.pricePerYearView);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.isDrawingGradient) {
            Paint paint = this.paint;
            PremiumTierCell premiumTierCell = this.globalGradientView;
            if (premiumTierCell != null) {
                paint = premiumTierCell.paint;
            }
            drawChild(canvas, this.checkBox, getDrawingTime());
            updateColors();
            updateGradient();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.pricePerMonthView.getLeft(), this.pricePerMonthView.getTop() + AndroidUtilities.m35dp(4.0f), this.pricePerMonthView.getRight(), this.pricePerMonthView.getBottom() - AndroidUtilities.m35dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), paint);
            rectF.set(this.pricePerYearStrikeView.getLeft(), this.pricePerYearStrikeView.getTop() + AndroidUtilities.m35dp(3.0f), this.pricePerYearStrikeView.getRight(), this.pricePerYearStrikeView.getBottom() - AndroidUtilities.m35dp(3.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), paint);
            rectF.set(this.titleView.getLeft(), this.titleView.getTop() + AndroidUtilities.m35dp(4.0f), this.titleView.getRight(), this.titleView.getBottom() - AndroidUtilities.m35dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), paint);
            invalidate();
            return;
        }
        super.dispatchDraw(canvas);
    }

    private void checkRtlAndLayout(View view) {
        Rect rect = AndroidUtilities.rectTmp2;
        rect.right = rect.left + view.getMeasuredWidth();
        int measuredHeight = rect.top + view.getMeasuredHeight();
        rect.bottom = measuredHeight;
        if (LocaleController.isRTL) {
            int i = rect.right;
            rect.right = rect.left;
            rect.left = i;
        }
        view.layout(rect.left, rect.top, rect.right, measuredHeight);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int m35dp = AndroidUtilities.m35dp(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(28.0f), 1073741824);
        this.checkBox.measure(makeMeasureSpec, makeMeasureSpec);
        this.pricePerMonthView.measure(View.MeasureSpec.makeMeasureSpec(size - this.checkBox.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE));
        this.titleView.measure(View.MeasureSpec.makeMeasureSpec((size - this.checkBox.getMeasuredWidth()) - this.pricePerMonthView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE));
        if (this.discountView.getVisibility() == 0) {
            this.discountView.measure(View.MeasureSpec.makeMeasureSpec((size - this.checkBox.getMeasuredWidth()) - this.pricePerMonthView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE));
        } else {
            this.discountView.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        this.pricePerYearStrikeView.measure(View.MeasureSpec.makeMeasureSpec(size - this.checkBox.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE));
        this.pricePerYearView.measure(View.MeasureSpec.makeMeasureSpec(((size - this.checkBox.getMeasuredWidth()) - this.pricePerYearStrikeView.getMeasuredWidth()) - AndroidUtilities.m35dp(6.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(m35dp, Integer.MIN_VALUE));
        if (this.pricePerYearView.getVisibility() != 0) {
            m35dp -= AndroidUtilities.m35dp(8.0f);
        }
        setMeasuredDimension(size, m35dp);
    }

    public PremiumPreviewFragment.SubscriptionTier getTier() {
        return this.tier;
    }

    public void setChecked(boolean z, boolean z2) {
        this.checkBox.setChecked(z, z2);
    }

    @SuppressLint({"SetTextI18n"})
    public void bind(PremiumPreviewFragment.SubscriptionTier subscriptionTier, boolean z) {
        this.tier = subscriptionTier;
        this.hasDivider = z;
        int months = subscriptionTier.getMonths();
        if (months == 1) {
            this.titleView.setText(LocaleController.getString(C1072R.string.PremiumTierMonthly));
        } else if (months == 6) {
            this.titleView.setText(LocaleController.getString(C1072R.string.PremiumTierSemiannual));
        } else if (months != 12) {
            this.titleView.setText(LocaleController.formatPluralString("Months", subscriptionTier.getMonths(), new Object[0]));
        } else {
            this.titleView.setText(LocaleController.getString(C1072R.string.PremiumTierAnnual));
        }
        boolean z2 = !BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || subscriptionTier.getOfferDetails() == null);
        this.isDrawingGradient = z2;
        if (!z2) {
            if (subscriptionTier.getDiscount() <= 0) {
                this.discountView.setVisibility(8);
                this.pricePerYearStrikeView.setVisibility(8);
                this.pricePerYearView.setVisibility(8);
            } else {
                this.discountView.setText(LocaleController.formatString(C1072R.string.GiftPremiumOptionDiscount, Integer.valueOf(subscriptionTier.getDiscount())));
                this.discountView.setVisibility(0);
                this.pricePerYearStrikeView.setVisibility(0);
                this.pricePerYearView.setVisibility(0);
            }
            this.pricePerYearStrikeView.setText(subscriptionTier.getFormattedPricePerYearRegular());
            this.pricePerYearView.setText(LocaleController.formatString(C1072R.string.PricePerYear, subscriptionTier.getFormattedPricePerYear()));
            this.pricePerMonthView.setText(LocaleController.formatString(C1072R.string.PricePerMonthMe, subscriptionTier.getFormattedPricePerMonth()));
        } else {
            this.discountView.setText(LocaleController.formatString(C1072R.string.GiftPremiumOptionDiscount, 10));
            this.discountView.setVisibility(0);
            this.pricePerYearStrikeView.setVisibility(0);
            this.pricePerYearView.setVisibility(0);
            this.pricePerYearStrikeView.setText("USD00.00");
            this.pricePerYearView.setText(LocaleController.formatString(C1072R.string.PricePerYear, 1000));
            this.pricePerMonthView.setText(LocaleController.formatString(C1072R.string.PricePerMonthMe, 100));
        }
        requestLayout();
    }

    public void updateGradient() {
        PremiumTierCell premiumTierCell = this.globalGradientView;
        if (premiumTierCell != null) {
            premiumTierCell.updateGradient();
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
        this.lastUpdateTime = elapsedRealtime;
        int i2 = (int) (this.totalTranslation + (((float) (abs * i)) / 400.0f));
        this.totalTranslation = i2;
        if (i2 >= i * 4) {
            this.totalTranslation = (-this.gradientWidth) * 2;
        }
        this.matrix.setTranslate(this.totalTranslation + this.parentXOffset, 0.0f);
        LinearGradient linearGradient = this.gradient;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(this.matrix);
        }
    }

    public void updateColors() {
        PremiumTierCell premiumTierCell = this.globalGradientView;
        if (premiumTierCell != null) {
            premiumTierCell.updateColors();
            return;
        }
        int color = Theme.getColor(this.colorKey1);
        int color2 = Theme.getColor(this.colorKey2);
        if (this.color1 == color2 && this.color0 == color) {
            return;
        }
        this.color0 = color;
        this.color1 = color2;
        int m35dp = AndroidUtilities.m35dp(200.0f);
        this.gradientWidth = m35dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, m35dp, 0.0f, new int[]{color2, color, color, color2}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.gradient = linearGradient;
        this.paint.setShader(linearGradient);
    }
}
