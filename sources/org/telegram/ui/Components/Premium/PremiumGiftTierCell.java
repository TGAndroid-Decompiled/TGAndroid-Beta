package org.telegram.ui.Components.Premium;

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
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet;

public class PremiumGiftTierCell extends ViewGroup {
    private CheckBox2 checkBox;
    private int color0;
    private int color1;
    private int colorKey1;
    private int colorKey2;
    protected TextView discountView;
    private PremiumGiftTierCell globalGradientView;
    private LinearGradient gradient;
    private int gradientWidth;
    private boolean isDrawingGradient;
    private long lastUpdateTime;
    private int leftPaddingToTextDp;
    private Matrix matrix;
    private Paint paint;
    private int parentWidth;
    private float parentXOffset;
    private TextView pricePerMonthView;
    private TextView priceTotalView;
    protected GiftPremiumBottomSheet.GiftTier tier;
    private TextView titleView;
    private int totalTranslation;

    public PremiumGiftTierCell(Context context) {
        super(context);
        this.leftPaddingToTextDp = 24;
        this.colorKey1 = Theme.key_windowBackgroundWhite;
        this.colorKey2 = Theme.key_windowBackgroundGray;
        this.paint = new Paint();
        this.matrix = new Matrix();
        CheckBox2 checkBox2 = new CheckBox2(context, 24);
        this.checkBox = checkBox2;
        checkBox2.setDrawBackgroundAsArc(10);
        CheckBox2 checkBox22 = this.checkBox;
        int i = Theme.key_radioBackground;
        checkBox22.setColor(i, i, Theme.key_checkboxCheck);
        addView(this.checkBox);
        TextView textView = new TextView(context);
        this.titleView = textView;
        textView.setTextSize(1, 16.0f);
        this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        addView(this.titleView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.discountView = textView2;
        textView2.setTextSize(1, 14.0f);
        this.discountView.setTextColor(-1);
        this.discountView.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        this.discountView.setTypeface(AndroidUtilities.bold());
        addView(this.discountView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.pricePerMonthView = textView3;
        textView3.setTextSize(1, 14.0f);
        TextView textView4 = this.pricePerMonthView;
        int i2 = Theme.key_windowBackgroundWhiteGrayText;
        textView4.setTextColor(Theme.getColor(i2));
        addView(this.pricePerMonthView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.priceTotalView = textView5;
        textView5.setTextSize(1, 16.0f);
        this.priceTotalView.setTextColor(Theme.getColor(i2));
        addView(this.priceTotalView, LayoutHelper.createFrame(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public void setParentXOffset(float f) {
        this.parentXOffset = f;
    }

    public void setGlobalGradientView(PremiumGiftTierCell premiumGiftTierCell) {
        this.globalGradientView = premiumGiftTierCell;
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
        rect.set(AndroidUtilities.dp(8.0f) + getPaddingLeft(), (int) ((getMeasuredHeight() - this.checkBox.getMeasuredHeight()) / 2.0f), 0, 0);
        checkRtlAndLayout(this.checkBox);
        rect.set(((getMeasuredWidth() - this.priceTotalView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), (int) ((getMeasuredHeight() - this.priceTotalView.getMeasuredHeight()) / 2.0f), 0, 0);
        checkRtlAndLayout(this.priceTotalView);
        rect.set(AndroidUtilities.dp(this.leftPaddingToTextDp + 8) + this.checkBox.getMeasuredWidth() + getPaddingLeft(), getPaddingTop(), 0, 0);
        checkRtlAndLayout(this.titleView);
        if (this.discountView.getVisibility() == 0) {
            rect.set(AndroidUtilities.dp(this.leftPaddingToTextDp + 8) + this.checkBox.getMeasuredWidth() + getPaddingLeft(), (getMeasuredHeight() - this.discountView.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
            checkRtlAndLayout(this.discountView);
        }
        rect.set(AndroidUtilities.dp(this.leftPaddingToTextDp + 8 + (this.discountView.getVisibility() == 0 ? 6 : 0)) + this.checkBox.getMeasuredWidth() + this.discountView.getMeasuredWidth() + getPaddingLeft(), (getMeasuredHeight() - this.pricePerMonthView.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        checkRtlAndLayout(this.pricePerMonthView);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.isDrawingGradient) {
            Paint paint = this.paint;
            PremiumGiftTierCell premiumGiftTierCell = this.globalGradientView;
            if (premiumGiftTierCell != null) {
                paint = premiumGiftTierCell.paint;
            }
            drawChild(canvas, this.checkBox, getDrawingTime());
            updateColors();
            updateGradient();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(this.priceTotalView.getLeft(), this.priceTotalView.getTop() + AndroidUtilities.dp(4.0f), this.priceTotalView.getRight(), this.priceTotalView.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            rectF.set(this.pricePerMonthView.getLeft(), AndroidUtilities.dp(42.0f), this.pricePerMonthView.getRight(), AndroidUtilities.dp(54.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            rectF.set(this.titleView.getLeft(), this.titleView.getTop() + AndroidUtilities.dp(4.0f), this.titleView.getRight(), this.titleView.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            invalidate();
            return;
        }
        super.dispatchDraw(canvas);
    }

    private void checkRtlAndLayout(View view) {
        Rect rect = AndroidUtilities.rectTmp2;
        rect.right = rect.left + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
        if (LocaleController.isRTL) {
            int i = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int dp = AndroidUtilities.dp(68.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824);
        this.checkBox.measure(makeMeasureSpec, makeMeasureSpec);
        this.priceTotalView.measure(View.MeasureSpec.makeMeasureSpec(size - this.checkBox.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        this.titleView.measure(View.MeasureSpec.makeMeasureSpec((size - this.checkBox.getMeasuredWidth()) - this.priceTotalView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        if (this.discountView.getVisibility() == 0) {
            this.discountView.measure(View.MeasureSpec.makeMeasureSpec((size - this.checkBox.getMeasuredWidth()) - this.priceTotalView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        } else {
            this.discountView.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        this.pricePerMonthView.measure(View.MeasureSpec.makeMeasureSpec(((size - this.checkBox.getMeasuredWidth()) - this.priceTotalView.getMeasuredWidth()) - this.discountView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        setMeasuredDimension(size, dp);
    }

    public void setChecked(boolean z, boolean z2) {
        this.checkBox.setChecked(z, z2);
    }

    @SuppressLint({"SetTextI18n"})
    public void bind(GiftPremiumBottomSheet.GiftTier giftTier) {
        this.tier = giftTier;
        this.titleView.setText(LocaleController.formatPluralString("Months", giftTier.getMonths(), new Object[0]));
        boolean z = !BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || giftTier.getGooglePlayProductDetails() == null);
        this.isDrawingGradient = z;
        if (!z) {
            if (giftTier.getDiscount() <= 0) {
                this.discountView.setVisibility(8);
            } else {
                this.discountView.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(giftTier.getDiscount())));
                this.discountView.setVisibility(0);
            }
            this.pricePerMonthView.setText(LocaleController.formatString(R.string.PricePerMonth, giftTier.getFormattedPricePerMonth()));
            this.priceTotalView.setText(giftTier.getFormattedPrice());
        } else {
            this.discountView.setText(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, 10));
            this.discountView.setVisibility(0);
            this.pricePerMonthView.setText(LocaleController.formatString(R.string.PricePerMonth, 100));
            this.priceTotalView.setText("USD00,00");
        }
        requestLayout();
    }

    public void updateGradient() {
        PremiumGiftTierCell premiumGiftTierCell = this.globalGradientView;
        if (premiumGiftTierCell != null) {
            premiumGiftTierCell.updateGradient();
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
        PremiumGiftTierCell premiumGiftTierCell = this.globalGradientView;
        if (premiumGiftTierCell != null) {
            premiumGiftTierCell.updateColors();
            return;
        }
        int color = Theme.getColor(this.colorKey1);
        int color2 = Theme.getColor(this.colorKey2);
        if (this.color1 == color2 && this.color0 == color) {
            return;
        }
        this.color0 = color;
        this.color1 = color2;
        int dp = AndroidUtilities.dp(200.0f);
        this.gradientWidth = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{color2, color, color, color2}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.gradient = linearGradient;
        this.paint.setShader(linearGradient);
    }
}
