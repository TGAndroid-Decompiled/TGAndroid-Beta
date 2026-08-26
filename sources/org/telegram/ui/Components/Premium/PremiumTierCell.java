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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.PremiumPreviewFragment;

public class PremiumTierCell extends ViewGroup {
    public final CheckBox2 checkBox;
    public int color0;
    public int color1;
    public final int colorKey1;
    public final int colorKey2;
    public final TextView discountView;
    public PremiumTierCell globalGradientView;
    public LinearGradient gradient;
    public int gradientWidth;
    public boolean hasDivider;
    public boolean isDrawingGradient;
    public long lastUpdateTime;
    public final int leftPaddingToCheckboxDp;
    public final int leftPaddingToTextDp;
    public final Matrix matrix;
    public final Paint paint;
    public float parentXOffset;
    public final TextView pricePerMonthView;
    public final TextView pricePerYearStrikeView;
    public final TextView pricePerYearView;
    public PremiumPreviewFragment.SubscriptionTier tier;
    public final TextView titleView;
    public int totalTranslation;

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
        int i = Theme.key_radioBackground;
        checkBox2.checkBoxBase.setColor(i, i, Theme.key_checkboxCheck);
        addView(checkBox2);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.discountView = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        textView2.setTypeface(AndroidUtilities.bold());
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.pricePerYearStrikeView = textView3;
        textView3.setTextSize(1, 14.0f);
        int i2 = Theme.key_windowBackgroundWhiteGrayText;
        textView3.setTextColor(Theme.getColor(null, i2, false));
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        addView(textView3, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.pricePerYearView = textView4;
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(Theme.getColor(null, i2, false));
        textView4.setSingleLine();
        addView(textView4, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.pricePerMonthView = textView5;
        textView5.setTextSize(1, 15.0f);
        textView5.setTextColor(Theme.getColor(null, i2, false));
        textView5.setSingleLine();
        addView(textView5, LayoutHelper.createFrame(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void bind(PremiumPreviewFragment.SubscriptionTier subscriptionTier, boolean z) {
        boolean z2;
        String currency;
        this.tier = subscriptionTier;
        this.hasDivider = z;
        int i = subscriptionTier.subscriptionOption.months;
        TextView textView = this.titleView;
        if (i == 1) {
            textView.setText(LocaleController.getString(R.string.PremiumTierMonthly));
        } else if (i == 6) {
            textView.setText(LocaleController.getString(R.string.PremiumTierSemiannual));
        } else if (i != 12) {
            textView.setText((i <= 12 || i % 12 != 0) ? LocaleController.formatPluralString("Months", i, new Object[0]) : LocaleController.formatPluralString("PremiumTierAnnualYears", i / 12, new Object[0]));
        } else {
            textView.setText(LocaleController.getString(R.string.PremiumTierAnnual));
        }
        if (BuildVars.useInvoiceBilling()) {
            z2 = false;
        } else {
            if (BillingController.getInstance().isReady()) {
                subscriptionTier.checkOfferDetails();
                if (subscriptionTier.offerDetails != null) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        this.isDrawingGradient = z2;
        TextView textView2 = this.pricePerMonthView;
        TextView textView3 = this.pricePerYearStrikeView;
        TextView textView4 = this.discountView;
        TextView textView5 = this.pricePerYearView;
        if (z2) {
            textView4.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, 10));
            textView4.setVisibility(0);
            textView3.setVisibility(0);
            textView5.setVisibility(0);
            textView3.setText("USD00.00");
            textView5.setText(LocaleController.formatString(R.string.PricePerYear, 1000));
            textView2.setText(LocaleController.formatString(R.string.PricePerMonthMe, 100));
        } else {
            if (subscriptionTier.getDiscount() <= 0) {
                textView4.setVisibility(8);
                textView3.setVisibility(8);
                textView5.setVisibility(8);
            } else {
                textView4.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(subscriptionTier.getDiscount())));
                textView4.setVisibility(0);
                textView3.setVisibility(0);
                textView5.setVisibility(0);
            }
            boolean zUseInvoiceBilling = BuildVars.useInvoiceBilling();
            String currency2 = "";
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = subscriptionTier.subscriptionOption;
            if (zUseInvoiceBilling || tL_premiumSubscriptionOption.store_product == null) {
                currency = BillingController.getInstance().formatCurrency(subscriptionTier.pricePerYearRegular, subscriptionTier.getCurrency());
            } else {
                currency = subscriptionTier.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(subscriptionTier.pricePerYearRegular, subscriptionTier.getCurrency(), 6);
            }
            textView3.setText(currency);
            int i2 = R.string.PricePerYear;
            if (BuildVars.useInvoiceBilling() || tL_premiumSubscriptionOption.store_product == null) {
                currency2 = BillingController.getInstance().formatCurrency(subscriptionTier.getPricePerYear(), subscriptionTier.getCurrency());
            } else if (subscriptionTier.googlePlayProductDetails != null) {
                currency2 = BillingController.getInstance().formatCurrency(subscriptionTier.getPricePerYear(), subscriptionTier.getCurrency(), 6);
            }
            textView5.setText(LocaleController.formatString(i2, currency2));
            textView2.setText(LocaleController.formatString(R.string.PricePerMonthMe, subscriptionTier.getFormattedPricePerMonth()));
            if (tL_premiumSubscriptionOption.current) {
                textView5.setVisibility(0);
                textView5.setText(LocaleController.getString(R.string.YourCurrentPlan));
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
        TextView textView = this.pricePerMonthView;
        rectF.set(textView.getLeft(), AndroidUtilities.dp(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        TextView textView2 = this.pricePerYearStrikeView;
        rectF.set(textView2.getLeft(), AndroidUtilities.dp(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - AndroidUtilities.dp(3.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        TextView textView3 = this.titleView;
        rectF.set(textView3.getLeft(), AndroidUtilities.dp(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
        invalidate();
    }

    public PremiumPreviewFragment.SubscriptionTier getTier() {
        return this.tier;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.hasDivider) {
            boolean z = LocaleController.isRTL;
            TextView textView = this.titleView;
            if (z) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, Theme.dividerPaint);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        Rect rect = AndroidUtilities.rectTmp2;
        int i5 = this.leftPaddingToCheckboxDp;
        int paddingLeft = getPaddingLeft() + AndroidUtilities.dp(i5);
        int measuredHeight = getMeasuredHeight();
        CheckBox2 checkBox2 = this.checkBox;
        rect.set(paddingLeft, (int) ((measuredHeight - checkBox2.getMeasuredHeight()) / 2.0f), 0, 0);
        checkRtlAndLayout(checkBox2);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.pricePerMonthView;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i6 = i5 + this.leftPaddingToTextDp;
        int measuredWidth = checkBox2.getMeasuredWidth() + AndroidUtilities.dp(i6 + 24);
        TextView textView2 = this.pricePerYearStrikeView;
        int measuredWidth2 = measuredWidth + (textView2.getVisibility() == 0 ? textView2.getMeasuredWidth() : 0);
        TextView textView3 = this.pricePerYearView;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + measuredWidth2;
        int measuredWidth3 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.discountView;
        if (paddingLeft2 > measuredWidth3 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        checkRtlAndLayout(textView);
        float f = i6;
        int paddingLeft3 = getPaddingLeft() + checkBox2.getMeasuredWidth() + AndroidUtilities.dp(f);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.titleView;
        rect.set(paddingLeft3, visibility == 8 ? (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f) : getPaddingTop(), 0, 0);
        checkRtlAndLayout(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + checkBox2.getMeasuredWidth() + AndroidUtilities.dp(i6 + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            checkRtlAndLayout(textView4);
        }
        rect.set(getPaddingLeft() + checkBox2.getMeasuredWidth() + AndroidUtilities.dp(f), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        checkRtlAndLayout(textView2);
        int measuredWidth4 = checkBox2.getMeasuredWidth() + AndroidUtilities.dp(f);
        if (textView2.getVisibility() == 0) {
            iDp = AndroidUtilities.dp(6.0f) + textView2.getMeasuredWidth();
        } else {
            iDp = 0;
        }
        rect.set(getPaddingLeft() + measuredWidth4 + iDp, (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        checkRtlAndLayout(textView3);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.dp(58.0f);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824);
        CheckBox2 checkBox2 = this.checkBox;
        checkBox2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        TextView textView = this.pricePerMonthView;
        textView.measure(View.MeasureSpec.makeMeasureSpec(size - checkBox2.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        this.titleView.measure(View.MeasureSpec.makeMeasureSpec((size - checkBox2.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        TextView textView2 = this.discountView;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - checkBox2.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        TextView textView3 = this.pricePerYearStrikeView;
        textView3.measure(View.MeasureSpec.makeMeasureSpec(size - checkBox2.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        TextView textView4 = this.pricePerYearView;
        textView4.measure(OKLCH.m((size - checkBox2.getMeasuredWidth()) - (textView3.getVisibility() == 0 ? textView3.getMeasuredWidth() : 0), 6.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        if (textView4.getVisibility() != 0) {
            iDp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, iDp);
    }

    public final void setChecked(boolean z, boolean z2) {
        this.checkBox.checkBoxBase.setChecked(-1, z, z2);
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

    public void setParentXOffset(float f) {
        this.parentXOffset = f;
    }

    public void setProgressDelegate(CheckBoxBase.ProgressDelegate progressDelegate) {
        this.checkBox.setProgressDelegate(progressDelegate);
    }

    public final void updateColors() {
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

    public final void updateGradient() {
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
        int measuredWidth = getMeasuredWidth();
        this.lastUpdateTime = jElapsedRealtime;
        int i = (int) (((jAbs * ((long) measuredWidth)) / 400.0f) + this.totalTranslation);
        this.totalTranslation = i;
        if (i >= measuredWidth * 4) {
            this.totalTranslation = (-this.gradientWidth) * 2;
        }
        Matrix matrix = this.matrix;
        matrix.setTranslate(this.totalTranslation + this.parentXOffset, 0.0f);
        LinearGradient linearGradient = this.gradient;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }
}
