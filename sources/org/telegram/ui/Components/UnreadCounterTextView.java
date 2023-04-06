package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
public class UnreadCounterTextView extends View {
    boolean animatedFromBottom;
    private int circleWidth;
    int counterColor;
    private int currentCounter;
    private String currentCounterString;
    private Drawable icon;
    private Drawable iconOut;
    CharSequence lastText;
    private TextPaint layoutPaint;
    private int layoutTextWidth;
    private Paint paint;
    int panelBackgroundColor;
    private RectF rect;
    ValueAnimator replaceAnimator;
    float replaceProgress;
    private int rippleColor;
    Drawable selectableBackground;
    int textColor;
    String textColorKey;
    private StaticLayout textLayout;
    private StaticLayout textLayoutOut;
    private TextPaint textPaint;
    private int textWidth;

    protected Theme.ResourcesProvider getResourceProvider() {
        return null;
    }

    protected float getTopOffset() {
        return 0.0f;
    }

    protected boolean isTouchFullWidth() {
        return false;
    }

    public UnreadCounterTextView(Context context) {
        super(context);
        this.textPaint = new TextPaint(1);
        this.paint = new Paint(1);
        this.rect = new RectF();
        this.layoutPaint = new TextPaint(1);
        this.replaceProgress = 1.0f;
        this.textColorKey = "chat_fieldOverlayText";
        this.textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.layoutPaint.setTextSize(AndroidUtilities.dp(15.0f));
        this.layoutPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
    }

    public void setText(CharSequence charSequence, boolean z) {
        if (this.lastText == charSequence) {
            return;
        }
        this.lastText = charSequence;
        this.animatedFromBottom = z;
        this.textLayoutOut = this.textLayout;
        this.iconOut = this.icon;
        this.layoutPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.layoutTextWidth = (int) Math.ceil(this.layoutPaint.measureText(charSequence, 0, charSequence.length()));
        this.icon = null;
        this.textLayout = new StaticLayout(charSequence, this.layoutPaint, this.layoutTextWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
        if (this.textLayoutOut == null && this.iconOut == null) {
            return;
        }
        ValueAnimator valueAnimator = this.replaceAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.replaceProgress = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.replaceAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                UnreadCounterTextView.this.lambda$setText$0(valueAnimator2);
            }
        });
        this.replaceAnimator.setDuration(150L);
        this.replaceAnimator.start();
    }

    public void lambda$setText$0(ValueAnimator valueAnimator) {
        this.replaceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        this.layoutPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.layoutTextWidth = (int) Math.ceil(this.layoutPaint.measureText(charSequence, 0, charSequence.length()));
        this.icon = null;
        this.textLayout = new StaticLayout(charSequence, this.layoutPaint, this.layoutTextWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        this.layoutPaint.setTypeface(null);
        this.layoutTextWidth = (int) Math.ceil(this.layoutPaint.measureText(charSequence, 0, charSequence.length()));
        this.icon = null;
        this.textLayout = new StaticLayout(charSequence, this.layoutPaint, this.layoutTextWidth + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextInfo(Drawable drawable, CharSequence charSequence) {
        this.layoutPaint.setTypeface(null);
        this.layoutTextWidth = (int) Math.ceil(this.layoutPaint.measureText(charSequence, 0, charSequence.length()));
        this.icon = drawable;
        this.textLayout = new StaticLayout(charSequence, this.layoutPaint, this.layoutTextWidth + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.selectableBackground;
        if (drawable != null) {
            drawable.setState(getDrawableState());
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.selectableBackground;
        if (drawable2 != null) {
            return drawable2 == drawable || super.verifyDrawable(drawable);
        }
        return super.verifyDrawable(drawable);
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.selectableBackground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int dp;
        if (motionEvent.getAction() == 0 && (staticLayout = this.textLayout) != null) {
            int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
            if (getMeasuredWidth() == ((View) getParent()).getMeasuredWidth()) {
                dp = getMeasuredWidth() - AndroidUtilities.dp(96.0f);
            } else if (isTouchFullWidth()) {
                dp = getMeasuredWidth();
            } else {
                int i = this.circleWidth;
                dp = ceil + (i > 0 ? i + AndroidUtilities.dp(8.0f) : 0) + AndroidUtilities.dp(48.0f);
            }
            int measuredWidth = (getMeasuredWidth() - dp) / 2;
            float f = dp / 2.0f;
            this.rect.set(measuredWidth, (getMeasuredHeight() / 2.0f) - f, measuredWidth + dp, (getMeasuredHeight() / 2.0f) + f);
            if (!this.rect.contains(motionEvent.getX(), motionEvent.getY())) {
                setPressed(false);
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCounter(int i) {
        if (this.currentCounter != i) {
            this.currentCounter = i;
            if (i == 0) {
                this.currentCounterString = null;
                this.circleWidth = 0;
            } else {
                String formatWholeNumber = AndroidUtilities.formatWholeNumber(i, 0);
                this.currentCounterString = formatWholeNumber;
                this.textWidth = (int) Math.ceil(this.textPaint.measureText(formatWholeNumber));
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f) + this.textWidth);
                if (this.circleWidth != max) {
                    this.circleWidth = max;
                }
            }
            invalidate();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int measuredWidth;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        StaticLayout staticLayout = this.textLayout;
        int color = Theme.getColor(isEnabled() ? this.textColorKey : "windowBackgroundWhiteGrayText", getResourceProvider());
        if (this.textColor != color) {
            TextPaint textPaint = this.layoutPaint;
            this.textColor = color;
            textPaint.setColor(color);
        }
        int color2 = Theme.getColor("chat_messagePanelBackground", getResourceProvider());
        if (this.panelBackgroundColor != color2) {
            TextPaint textPaint2 = this.textPaint;
            this.panelBackgroundColor = color2;
            textPaint2.setColor(color2);
        }
        int color3 = Theme.getColor("chat_goDownButtonCounterBackground", getResourceProvider());
        if (this.counterColor != color3) {
            Paint paint = this.paint;
            this.counterColor = color3;
            paint.setColor(color3);
        }
        if (getParent() != null) {
            int measuredWidth2 = getMeasuredWidth();
            int measuredWidth3 = (getMeasuredWidth() - measuredWidth2) / 2;
            if (this.rippleColor != Theme.getColor(this.textColorKey, getResourceProvider()) || this.selectableBackground == null) {
                int dp = AndroidUtilities.dp(60.0f);
                int color4 = Theme.getColor(this.textColorKey, getResourceProvider());
                this.rippleColor = color4;
                Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(dp, 0, ColorUtils.setAlphaComponent(color4, 26));
                this.selectableBackground = createSimpleSelectorCircleDrawable;
                createSimpleSelectorCircleDrawable.setCallback(this);
            }
            int dp2 = getLeft() + measuredWidth3 <= 0 ? measuredWidth3 - AndroidUtilities.dp(20.0f) : measuredWidth3;
            int i = measuredWidth3 + measuredWidth2;
            if (i > ((View) getParent()).getMeasuredWidth()) {
                i += AndroidUtilities.dp(20.0f);
            }
            int i2 = measuredWidth2 / 2;
            this.selectableBackground.setBounds(dp2, (getMeasuredHeight() / 2) - i2, i, (getMeasuredHeight() / 2) + i2);
            this.selectableBackground.draw(canvas);
        }
        if (this.textLayout != null) {
            canvas.save();
            if (this.replaceProgress != 1.0f && this.textLayoutOut != null) {
                int alpha = this.layoutPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.textLayoutOut.getWidth()) / 2) - (this.circleWidth / 2), ((getMeasuredHeight() - this.textLayout.getHeight()) / 2) + getTopOffset());
                canvas.translate(this.iconOut != null ? (drawable2.getIntrinsicWidth() / 2) + AndroidUtilities.dp(3.0f) : 0, (this.animatedFromBottom ? -1.0f : 1.0f) * AndroidUtilities.dp(18.0f) * this.replaceProgress);
                Drawable drawable4 = this.iconOut;
                if (drawable4 != null) {
                    drawable4.setBounds((-drawable4.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), ((this.textLayout.getHeight() - this.iconOut.getIntrinsicHeight()) / 2) + AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(6.0f), ((this.textLayout.getHeight() + this.iconOut.getIntrinsicHeight()) / 2) + AndroidUtilities.dp(1.0f));
                    this.iconOut.setAlpha((int) (alpha * (1.0f - this.replaceProgress)));
                    this.iconOut.draw(canvas);
                }
                float f = alpha;
                this.layoutPaint.setAlpha((int) ((1.0f - this.replaceProgress) * f));
                this.textLayoutOut.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.layoutTextWidth) / 2) - (this.circleWidth / 2), ((getMeasuredHeight() - this.textLayout.getHeight()) / 2) + getTopOffset());
                canvas.translate(this.icon != null ? (drawable3.getIntrinsicWidth() / 2) + AndroidUtilities.dp(3.0f) : 0, (this.animatedFromBottom ? 1.0f : -1.0f) * AndroidUtilities.dp(18.0f) * (1.0f - this.replaceProgress));
                Drawable drawable5 = this.icon;
                if (drawable5 != null) {
                    drawable5.setBounds((-drawable5.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), ((this.textLayout.getHeight() - this.icon.getIntrinsicHeight()) / 2) + AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(6.0f), ((this.textLayout.getHeight() + this.icon.getIntrinsicHeight()) / 2) + AndroidUtilities.dp(1.0f));
                    this.icon.setAlpha((int) (this.replaceProgress * f));
                    this.icon.draw(canvas);
                }
                this.layoutPaint.setAlpha((int) (f * this.replaceProgress));
                this.textLayout.draw(canvas);
                canvas.restore();
                this.layoutPaint.setAlpha(alpha);
            } else {
                int measuredWidth4 = ((getMeasuredWidth() - this.layoutTextWidth) / 2) - (this.circleWidth / 2);
                canvas.translate(measuredWidth4 + (this.icon != null ? (drawable.getIntrinsicWidth() / 2) + AndroidUtilities.dp(3.0f) : 0), ((getMeasuredHeight() - this.textLayout.getHeight()) / 2) + getTopOffset());
                Drawable drawable6 = this.icon;
                if (drawable6 != null) {
                    drawable6.setBounds((-drawable6.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), ((this.textLayout.getHeight() - this.icon.getIntrinsicHeight()) / 2) + AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(6.0f), ((this.textLayout.getHeight() + this.icon.getIntrinsicHeight()) / 2) + AndroidUtilities.dp(1.0f));
                    this.icon.setAlpha(255);
                    this.icon.draw(canvas);
                }
                this.textLayout.draw(canvas);
            }
            canvas.restore();
        }
        if (this.currentCounterString == null || staticLayout == null) {
            return;
        }
        int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
        this.rect.set(((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.circleWidth / 2)) + AndroidUtilities.dp(6.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(10.0f), measuredWidth + this.circleWidth, (getMeasuredHeight() / 2) + AndroidUtilities.dp(10.0f));
        canvas.drawRoundRect(this.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.paint);
        canvas.drawText(this.currentCounterString, this.rect.centerX() - (this.textWidth / 2.0f), this.rect.top + AndroidUtilities.dp(14.5f), this.textPaint);
    }

    public void setTextColorKey(String str) {
        this.textColorKey = str;
        invalidate();
    }
}
