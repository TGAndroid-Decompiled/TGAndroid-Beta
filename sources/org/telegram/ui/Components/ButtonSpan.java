package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;

public final class ButtonSpan extends ReplacementSpan {
    public final Paint backgroundPaint = new Paint(1);
    public ButtonBounce bounce;
    public Integer forcedColor;
    public final Runnable onClickListener;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Text text;

    public class TextViewButtons extends LinkSpanDrawable.LinksTextView {
        public ButtonSpan buttonToBeAdded;
        public ButtonSpan pressedSpan;

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.buttonToBeAdded == null || getMeasuredWidth() <= 0) {
                return;
            }
            SpannableString spannableString = new SpannableString(" btn");
            spannableString.setSpan(this.buttonToBeAdded, 1, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.buttonToBeAdded.getSize()) - AndroidUtilities.dp(4.0f), TextUtils.TruncateAt.END));
            spannableStringBuilder.append((CharSequence) spannableString);
            setText(spannableStringBuilder);
            this.buttonToBeAdded = null;
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            ButtonSpan buttonSpan;
            Runnable runnable;
            ButtonSpan buttonSpan2;
            Layout layout;
            int action = motionEvent.getAction();
            float x = motionEvent.getX() - getPaddingLeft();
            int y = ((int) motionEvent.getY()) - getPaddingTop();
            if (!(getText() instanceof Spanned) || (layout = getLayout()) == null) {
                buttonSpan = null;
                break;
            }
            int lineForVertical = layout.getLineForVertical(y);
            Spanned spanned = (Spanned) getText();
            ButtonSpan[] buttonSpanArr = (ButtonSpan[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), ButtonSpan.class);
            int i = 0;
            while (true) {
                if (i >= buttonSpanArr.length) {
                    buttonSpan = null;
                    break;
                }
                buttonSpan = buttonSpanArr[i];
                float primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(buttonSpan));
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanned.getSpanEnd(buttonSpan));
                if (primaryHorizontal2 < primaryHorizontal) {
                    primaryHorizontal2 = primaryHorizontal;
                    primaryHorizontal = primaryHorizontal2;
                }
                if (x >= primaryHorizontal && x <= primaryHorizontal2) {
                    break;
                }
                i++;
            }
            if (action == 0) {
                this.pressedSpan = buttonSpan;
                if (buttonSpan != null) {
                    if (buttonSpan.bounce == null) {
                        buttonSpan.bounce = new ButtonBounce(this, 1.0f, 5.0f);
                    }
                    buttonSpan.bounce.setPressed(true);
                    return true;
                }
            } else if (action == 1 || action == 3) {
                ButtonSpan buttonSpan3 = this.pressedSpan;
                if (buttonSpan3 != null) {
                    if (buttonSpan3.bounce == null) {
                        buttonSpan3.bounce = new ButtonBounce(this, 1.0f, 5.0f);
                    }
                    buttonSpan3.bounce.setPressed(false);
                    if (action == 1 && (runnable = this.pressedSpan.onClickListener) != null) {
                        runnable.run();
                    }
                }
                this.pressedSpan = null;
            } else if (action == 2 && (buttonSpan2 = this.pressedSpan) != null && buttonSpan2 != buttonSpan) {
                if (buttonSpan2.bounce == null) {
                    buttonSpan2.bounce = new ButtonBounce(this, 1.0f, 5.0f);
                }
                buttonSpan2.bounce.setPressed(false);
                this.pressedSpan = null;
            }
            return this.pressedSpan != null || super.onTouchEvent(motionEvent);
        }
    }

    public ButtonSpan(Runnable runnable, String str, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.onClickListener = runnable;
        this.text = new Text(str, 12.0f, null);
    }

    public static SpannableString make(String str, Runnable runnable, Theme.ResourcesProvider resourcesProvider, Integer num) {
        SpannableString spannableString = new SpannableString("btn");
        ButtonSpan buttonSpan = new ButtonSpan(runnable, str, resourcesProvider);
        spannableString.setSpan(buttonSpan, 0, spannableString.length(), 33);
        buttonSpan.forcedColor = num;
        return spannableString;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float fDpf2 = AndroidUtilities.dpf2(17.0f);
        float f2 = (i3 + i5) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f3 = fDpf2 / 2.0f;
        rectF.set(f, f2 - f3, getSize() + f, f2 + f3);
        ButtonBounce buttonBounce = this.bounce;
        float scale = buttonBounce == null ? 1.0f : buttonBounce.getScale(0.025f);
        canvas.save();
        canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
        Integer num = this.forcedColor;
        int iIntValue = num != null ? num.intValue() : Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider);
        Paint paint2 = this.backgroundPaint;
        paint2.setColor(Theme.multAlpha(0.15f, iIntValue));
        canvas.drawRoundRect(rectF, f3, f3, paint2);
        this.text.draw(f + AndroidUtilities.dp(7.0f), f2, 1.0f, iIntValue, canvas);
        canvas.restore();
    }

    public final int getSize() {
        return (int) (this.text.width + AndroidUtilities.dp(14.0f));
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return getSize();
    }
}
