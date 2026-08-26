package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;

public class UnreadCounterTextView extends View {
    public boolean animatedFromBottom;
    public int circleWidth;
    public int counterColor;
    public int currentCounter;
    public String currentCounterString;
    public Drawable icon;
    public Drawable iconOut;
    public String lastText;
    public final TextPaint layoutPaint;
    public int layoutTextWidth;
    public final Paint paint;
    public int panelBackgroundColor;
    public final RectF rect;
    public ValueAnimator replaceAnimator;
    public float replaceProgress;
    public int rippleColor;
    public BaseCell.RippleDrawableSafe selectableBackground;
    public int textColor;
    public int textColorKey;
    public StaticLayout textLayout;
    public StaticLayout textLayoutOut;
    public final TextPaint textPaint;
    public int textWidth;

    public UnreadCounterTextView(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.paint = new Paint(1);
        this.rect = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.layoutPaint = textPaint2;
        this.replaceProgress = 1.0f;
        this.textColorKey = Theme.key_chat_fieldOverlayText;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectableBackground;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.setState(getDrawableState());
        }
    }

    public Theme.ResourcesProvider getResourceProvider() {
        return null;
    }

    public float getTopOffset() {
        return 0.0f;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectableBackground;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        int iDp;
        int iDp2;
        float f2;
        float f3;
        int iDp3;
        StaticLayout staticLayout = this.textLayout;
        int color = Theme.getColor(isEnabled() ? this.textColorKey : Theme.key_windowBackgroundWhiteGrayText, getResourceProvider());
        int i = this.textColor;
        TextPaint textPaint = this.layoutPaint;
        if (i != color) {
            this.textColor = color;
            textPaint.setColor(color);
        }
        int color2 = Theme.getColor(Theme.key_chat_messagePanelBackground, getResourceProvider());
        int i2 = this.panelBackgroundColor;
        TextPaint textPaint2 = this.textPaint;
        if (i2 != color2) {
            this.panelBackgroundColor = color2;
            textPaint2.setColor(color2);
        }
        int color3 = Theme.getColor(Theme.key_chat_goDownButtonCounterBackground, getResourceProvider());
        int i3 = this.counterColor;
        Paint paint = this.paint;
        if (i3 != color3) {
            this.counterColor = color3;
            paint.setColor(color3);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.rippleColor != Theme.getColor(this.textColorKey, getResourceProvider()) || this.selectableBackground == null) {
                int iDp4 = AndroidUtilities.dp(60.0f);
                int color4 = Theme.getColor(this.textColorKey, getResourceProvider());
                this.rippleColor = color4;
                BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(iDp4, 0, ColorUtils.setAlphaComponent(color4, 26));
                this.selectableBackground = rippleDrawableSafeCreateSimpleSelectorCircleDrawable;
                rippleDrawableSafeCreateSimpleSelectorCircleDrawable.setCallback(this);
            }
            int iDp5 = getLeft() + measuredWidth2 <= 0 ? measuredWidth2 - AndroidUtilities.dp(20.0f) : measuredWidth2;
            int iDp6 = measuredWidth2 + measuredWidth;
            if (iDp6 > ((View) getParent()).getMeasuredWidth()) {
                iDp6 += AndroidUtilities.dp(20.0f);
            }
            int i4 = measuredWidth / 2;
            this.selectableBackground.setBounds(iDp5, (getMeasuredHeight() / 2) - i4, iDp6, (getMeasuredHeight() / 2) + i4);
            this.selectableBackground.draw(canvas);
        }
        if (this.textLayout != null) {
            canvas.save();
            if (this.replaceProgress == 1.0f || this.textLayoutOut == null) {
                f = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.layoutTextWidth) / 2) - (this.circleWidth / 2);
                Drawable drawable = this.icon;
                if (drawable != null) {
                    iDp = AndroidUtilities.dp(3.0f) + (drawable.getIntrinsicWidth() / 2);
                } else {
                    iDp = 0;
                }
                canvas.translate(measuredWidth3 + iDp, getTopOffset() + ((getMeasuredHeight() - this.textLayout.getHeight()) / 2));
                Drawable drawable2 = this.icon;
                if (drawable2 != null) {
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.textLayout.getHeight() - this.icon.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.icon.getIntrinsicHeight() + this.textLayout.getHeight()) / 2));
                    this.icon.setAlpha(255);
                    this.icon.draw(canvas);
                }
                this.textLayout.draw(canvas);
            } else {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.textLayoutOut.getWidth()) / 2) - (this.circleWidth / 2), getTopOffset() + ((getMeasuredHeight() - this.textLayout.getHeight()) / 2));
                Drawable drawable3 = this.iconOut;
                if (drawable3 != null) {
                    iDp2 = AndroidUtilities.dp(3.0f) + (drawable3.getIntrinsicWidth() / 2);
                } else {
                    iDp2 = 0;
                }
                canvas.translate(iDp2, (this.animatedFromBottom ? -1.0f : 1.0f) * AndroidUtilities.dp(18.0f) * this.replaceProgress);
                Drawable drawable4 = this.iconOut;
                if (drawable4 != null) {
                    f = 6.0f;
                    f2 = 3.0f;
                    f3 = 1.0f;
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.textLayout.getHeight() - this.iconOut.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.iconOut.getIntrinsicHeight() + this.textLayout.getHeight()) / 2));
                    this.iconOut.setAlpha((int) ((1.0f - this.replaceProgress) * alpha));
                    this.iconOut.draw(canvas);
                } else {
                    f = 6.0f;
                    f2 = 3.0f;
                    f3 = 1.0f;
                }
                float f4 = alpha;
                textPaint.setAlpha((int) ((f3 - this.replaceProgress) * f4));
                this.textLayoutOut.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.layoutTextWidth) / 2) - (this.circleWidth / 2), getTopOffset() + ((getMeasuredHeight() - this.textLayout.getHeight()) / 2));
                Drawable drawable5 = this.icon;
                if (drawable5 != null) {
                    iDp3 = AndroidUtilities.dp(f2) + (drawable5.getIntrinsicWidth() / 2);
                } else {
                    iDp3 = 0;
                }
                canvas.translate(iDp3, (f3 - this.replaceProgress) * (this.animatedFromBottom ? 1.0f : -1.0f) * AndroidUtilities.dp(18.0f));
                Drawable drawable6 = this.icon;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - AndroidUtilities.dp(f), AndroidUtilities.dp(f3) + ((this.textLayout.getHeight() - this.icon.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(f), AndroidUtilities.dp(f3) + ((this.icon.getIntrinsicHeight() + this.textLayout.getHeight()) / 2));
                    this.icon.setAlpha((int) (this.replaceProgress * f4));
                    this.icon.draw(canvas);
                }
                textPaint.setAlpha((int) (f4 * this.replaceProgress));
                this.textLayout.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f = 6.0f;
        }
        if (this.currentCounterString == null || staticLayout == null) {
            return;
        }
        int iCeil = (int) Math.ceil(staticLayout.getLineWidth(0));
        int iDp7 = AndroidUtilities.dp(f) + ((((getMeasuredWidth() - iCeil) / 2) + iCeil) - (this.circleWidth / 2));
        RectF rectF = this.rect;
        rectF.set(iDp7, (getMeasuredHeight() / 2) - AndroidUtilities.dp(10.0f), iDp7 + this.circleWidth, AndroidUtilities.dp(10.0f) + (getMeasuredHeight() / 2));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
        canvas.drawText(this.currentCounterString, rectF.centerX() - (this.textWidth / 2.0f), rectF.top + AndroidUtilities.dp(14.5f), textPaint2);
    }

    public void setCounter(int i) {
        if (this.currentCounter != i) {
            this.currentCounter = i;
            if (i == 0) {
                this.currentCounterString = null;
                this.circleWidth = 0;
            } else {
                String wholeNumber = AndroidUtilities.formatWholeNumber(i, 0);
                this.currentCounterString = wholeNumber;
                this.textWidth = (int) Math.ceil(this.textPaint.measureText(wholeNumber));
                int iMax = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f) + this.textWidth);
                if (this.circleWidth != iMax) {
                    this.circleWidth = iMax;
                }
            }
            invalidate();
        }
    }

    public final void setText(String str, boolean z) {
        if (this.lastText == str) {
            return;
        }
        this.lastText = str;
        this.animatedFromBottom = z;
        this.textLayoutOut = this.textLayout;
        this.iconOut = this.icon;
        Typeface typefaceBold = AndroidUtilities.bold();
        TextPaint textPaint = this.layoutPaint;
        textPaint.setTypeface(typefaceBold);
        this.layoutTextWidth = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
        this.icon = null;
        this.textLayout = new StaticLayout(str, textPaint, this.layoutTextWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(str);
        invalidate();
        if (this.textLayoutOut == null && this.iconOut == null) {
            return;
        }
        ValueAnimator valueAnimator = this.replaceAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.replaceProgress = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.replaceAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 29));
        this.replaceAnimator.setDuration(150L);
        this.replaceAnimator.start();
    }

    public void setTextColorKey(int i) {
        this.textColorKey = i;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.layoutPaint;
        textPaint.setTypeface(null);
        this.layoutTextWidth = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.icon = null;
        this.textLayout = new StaticLayout(charSequence, textPaint, this.layoutTextWidth + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectableBackground;
        if (rippleDrawableSafe != null) {
            return rippleDrawableSafe == drawable || super.verifyDrawable(drawable);
        }
        return super.verifyDrawable(drawable);
    }

    public void setText(CharSequence charSequence) {
        TextPaint textPaint = this.layoutPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        this.layoutTextWidth = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.icon = null;
        this.textLayout = new StaticLayout(charSequence, textPaint, this.layoutTextWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }
}
