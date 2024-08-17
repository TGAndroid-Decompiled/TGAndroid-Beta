package org.telegram.ui.Components.Premium.boosts;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

public class DiscountSpan extends ReplacementSpan {
    private int color;
    int discount;
    float height;
    StaticLayout layout;
    float width;
    TextPaint textPaint = new TextPaint(1);
    Paint bgPaint = new Paint(1);

    public static CharSequence applySpan(CharSequence charSequence, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
        spannableStringBuilder.append(charSequence);
        DiscountSpan discountSpan = new DiscountSpan(11.0f, i);
        discountSpan.setColor(Theme.getColor(Theme.key_premiumGradient1));
        spannableStringBuilder.setSpan(discountSpan, 0, 1, 0);
        return spannableStringBuilder;
    }

    public DiscountSpan(float f, int i) {
        this.textPaint.setTypeface(AndroidUtilities.bold());
        this.bgPaint.setStyle(Paint.Style.FILL);
        this.textPaint.setTextSize(AndroidUtilities.dp(f));
        this.discount = i;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void makeLayout() {
        if (this.layout == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.formatString(R.string.GiftPremiumOptionDiscount, Integer.valueOf(this.discount)), this.textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.layout = staticLayout;
            this.width = staticLayout.getLineWidth(0);
            this.height = this.layout.getHeight();
        }
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        makeLayout();
        return (int) (AndroidUtilities.dp(13.0f) + this.width);
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        makeLayout();
        int i6 = this.color;
        if (i6 == 0) {
            i6 = paint.getColor();
        }
        this.bgPaint.setColor(i6);
        this.textPaint.setColor(AndroidUtilities.computePerceivedBrightness(i6) > 0.721f ? -16777216 : -1);
        float dp = f + AndroidUtilities.dp(10.0f);
        float dp2 = (i4 - this.height) + AndroidUtilities.dp(2.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp, dp2, this.width + dp, this.height + dp2);
        float dp3 = AndroidUtilities.dp(4.0f);
        rectF.inset(AndroidUtilities.dp(-4.5f), AndroidUtilities.dp(-1.66f));
        canvas.drawRoundRect(rectF, dp3, dp3, this.bgPaint);
        canvas.save();
        canvas.translate(dp, dp2);
        this.layout.draw(canvas);
        canvas.restore();
    }
}
