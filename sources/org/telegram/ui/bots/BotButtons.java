package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.common.base.Splitter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.voip.CellFlickerDrawable;

public abstract class BotButtons extends FrameLayout {
    public final AnimatedColor background;
    public final Paint backgroundPaint;
    public final Button[] buttons;
    public final AnimatedFloat height;
    public Button pressedButton;
    public final Paint separatorPaint;
    public Splitter state;
    public Utilities.Callback whenClicked;
    public Runnable whenResized;

    public final class Button {
        public final AnimatedFloat alpha;
        public final AnimatedColor backgroundColor;
        public final Paint backgroundPaint;
        public final ButtonBounce bounce;
        public final RectF bounds = new RectF();
        public final CellFlickerDrawable flicker;
        public final AnimatedFloat flickerAlpha;
        public final CircularProgressDrawable progress;
        public final AnimatedFloat progressAlpha;
        public final BaseCell.RippleDrawableSafe ripple;
        public int rippleColor;
        public final AnimatedColor textColor;
        public final AnimatedTextView.AnimatedTextDrawable textDrawable;
        public final AnimatedFloat w;
        public final AnimatedFloat x;
        public final AnimatedFloat y;

        public Button(BotButtons botButtons) {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.alpha = new AnimatedFloat(botButtons, 0L, 320L, cubicBezierInterpolator);
            this.x = new AnimatedFloat(botButtons, 0L, 320L, cubicBezierInterpolator);
            this.y = new AnimatedFloat(botButtons, 0L, 320L, cubicBezierInterpolator);
            this.w = new AnimatedFloat(botButtons, 0L, 320L, cubicBezierInterpolator);
            this.backgroundColor = new AnimatedColor(botButtons, 320L, cubicBezierInterpolator, 0);
            this.textColor = new AnimatedColor(botButtons, 320L, cubicBezierInterpolator, 0);
            this.progressAlpha = new AnimatedFloat(botButtons, 0L, 320L, cubicBezierInterpolator);
            this.flickerAlpha = new AnimatedFloat(botButtons, 0L, 320L, cubicBezierInterpolator);
            this.bounce = new ButtonBounce(botButtons, 1.0f, 5.0f);
            this.backgroundPaint = new Paint(1);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, false, true, false);
            this.textDrawable = animatedTextDrawable;
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateRadSelectorDrawable = Theme.createRadSelectorDrawable(0, 9, 9);
            this.ripple = rippleDrawableSafeCreateRadSelectorDrawable;
            CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(-1);
            this.progress = circularProgressDrawable;
            CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
            this.flicker = cellFlickerDrawable;
            animatedTextDrawable.gravity = 17;
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x * 4;
            animatedTextDrawable.ellipsizeByGradient = true;
            animatedTextDrawable.invalidateSelf();
            animatedTextDrawable.setCallback(botButtons);
            circularProgressDrawable.setCallback(botButtons);
            rippleDrawableSafeCreateRadSelectorDrawable.setCallback(botButtons);
            cellFlickerDrawable.frameInside = true;
            cellFlickerDrawable.repeatProgress = 2.0f;
        }
    }

    public final class ButtonState {
        public boolean active;
        public int color;
        public long emojiId;
        public String position;
        public boolean progressVisible;
        public boolean shineEffect;
        public String text;
        public int textColor;
        public boolean visible;
    }

    public BotButtons(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        this.separatorPaint = paint2;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.height = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.background = new AnimatedColor(this, 320L, cubicBezierInterpolator, 0);
        Splitter splitter = new Splitter((char) 0, 23);
        splitter.trimmer = new ButtonState();
        splitter.strategy = new ButtonState();
        this.state = splitter;
        this.buttons = new Button[]{new Button(this), new Button(this)};
        setWillNotDraw(false);
        paint2.setColor(Theme.multAlpha(0.1f, -16777216));
        Splitter splitter2 = this.state;
        int color = Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider);
        splitter2.limit = color;
        paint.setColor(color);
    }

    public static void setText(AnimatedTextView.AnimatedTextDrawable animatedTextDrawable, ButtonState buttonState, boolean z) {
        animatedTextDrawable.cancelAnimation();
        if (buttonState.emojiId == 0) {
            animatedTextDrawable.setText(buttonState.text, z, true);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.append((CharSequence) buttonState.text);
        spannableStringBuilder.setSpan(new AnimatedEmojiSpan(buttonState.emojiId, 1.4f, animatedTextDrawable.textPaint.getFontMetricsInt()), 0, 1, 33);
        animatedTextDrawable.setText(spannableStringBuilder, z, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z = false;
        float height = getHeight() - this.height.set(getTotalHeight(), false);
        canvas.drawRect(0.0f, height - 1.0f, getWidth(), height, this.separatorPaint);
        Paint paint = this.backgroundPaint;
        paint.setColor(this.background.set(this.state.limit, false));
        canvas.drawRect(0.0f, height, getWidth(), getHeight(), paint);
        float f6 = height;
        String str = ((ButtonState) this.state.strategy).position;
        Button[] buttonArr = this.buttons;
        int i = 1;
        int i2 = buttonArr[1].alpha.value < buttonArr[0].alpha.value ? 1 : 0;
        int i3 = i2;
        while (true) {
            if (i2 != 0) {
                if (i3 < 0) {
                    return;
                }
            } else if (i3 > i) {
                return;
            }
            Button button = buttonArr[i3];
            ButtonState buttonState = (ButtonState) (i3 == 0 ? this.state.trimmer : this.state.strategy);
            float f7 = button.alpha.set(buttonState.visible);
            boolean z2 = buttonState.visible;
            AnimatedFloat animatedFloat = button.x;
            if (z2) {
                Splitter splitter = this.state;
                if (((ButtonState) splitter.strategy).visible && ((ButtonState) splitter.trimmer).visible) {
                    f = (!"left".equalsIgnoreCase(str) ? !(!"right".equalsIgnoreCase(str) || i3 == 0) : i3 == 0) ? 0 : 1;
                } else {
                    f = 0.0f;
                }
                f2 = animatedFloat.set(f, z);
            } else {
                f2 = animatedFloat.value;
            }
            boolean z3 = buttonState.visible;
            AnimatedFloat animatedFloat2 = button.y;
            if (z3) {
                Splitter splitter2 = this.state;
                if (((ButtonState) splitter2.strategy).visible && ((ButtonState) splitter2.trimmer).visible) {
                    f3 = (!"top".equalsIgnoreCase(str) ? !(!"bottom".equalsIgnoreCase(str) || i3 == 0) : i3 == 0) ? 0 : 1;
                } else {
                    f3 = 0.0f;
                }
                f4 = animatedFloat2.set(f3, false);
            } else {
                f4 = animatedFloat2.value;
            }
            boolean z4 = buttonState.visible;
            AnimatedFloat animatedFloat3 = button.w;
            if (z4) {
                Splitter splitter3 = this.state;
                f5 = animatedFloat3.set((((ButtonState) splitter3.strategy).visible && ((ButtonState) splitter3.trimmer).visible && ("left".equalsIgnoreCase(str) || "right".equalsIgnoreCase(str))) ? 0.0f : 1.0f, false);
            } else {
                f5 = animatedFloat3.value;
            }
            float fLerp = AndroidUtilities.lerp((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f, getWidth() - AndroidUtilities.dp(16.0f), f5);
            float fDp = AndroidUtilities.dp(44.0f);
            float f8 = fLerp / 2.0f;
            float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ((getWidth() - AndroidUtilities.dp(26.0f)) / 2.0f) + AndroidUtilities.dp(18.0f), f2) + f8;
            float f9 = fDp / 2.0f;
            float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(58.0f), f4) + f9;
            RectF rectF = button.bounds;
            float f10 = fLerp3 + f6;
            rectF.set(fLerp2 - f8, f10 - f9, f8 + fLerp2, f9 + f10);
            float f11 = button.progressAlpha.set(buttonState.progressVisible);
            float f12 = button.flickerAlpha.set(buttonState.shineEffect);
            canvas.save();
            String str2 = str;
            float fLerp4 = AndroidUtilities.lerp(0.7f, 1.0f, f7) * button.bounce.getScale(0.02f);
            canvas.scale(fLerp4, fLerp4, fLerp2, f10);
            Paint paint2 = button.backgroundPaint;
            float f13 = f6;
            paint2.setColor(Theme.multAlpha(f7, button.backgroundColor.set(buttonState.color, false)));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint2);
            AnimatedColor animatedColor = button.textColor;
            if (f11 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - f11;
                float fLerp5 = AndroidUtilities.lerp(0.75f, 1.0f, f14);
                canvas.scale(fLerp5, fLerp5, fLerp2, f10);
                canvas.translate(0.0f, AndroidUtilities.dp(-10.0f) * f11);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = button.textDrawable;
                float f15 = f14 * f7;
                int iMultAlpha = Theme.multAlpha(f15, animatedColor.set(buttonState.textColor, false));
                if (animatedTextDrawable.emojiColor != iMultAlpha) {
                    animatedTextDrawable.emojiColor = iMultAlpha;
                    animatedTextDrawable.emojiColorFilter = new PorterDuffColorFilter(iMultAlpha, PorterDuff.Mode.SRC_IN);
                }
                int iMultAlpha2 = Theme.multAlpha(f15, animatedColor.set(buttonState.textColor, false));
                animatedTextDrawable.textPaint.setColor(iMultAlpha2);
                animatedTextDrawable.alpha = Color.alpha(iMultAlpha2);
                animatedTextDrawable.setBounds(rectF);
                animatedTextDrawable.draw(canvas);
                canvas.restore();
            } else {
                f12 = f12;
            }
            if (f11 > 0.0f) {
                canvas.save();
                float fLerp6 = AndroidUtilities.lerp(0.75f, 1.0f, f11);
                canvas.scale(fLerp6, fLerp6, fLerp2, f10);
                canvas.translate(0.0f, (1.0f - f11) * AndroidUtilities.dp(10.0f));
                CircularProgressDrawable circularProgressDrawable = button.progress;
                circularProgressDrawable.paint.setColor(Theme.multAlpha(f11 * f7, animatedColor.set(buttonState.textColor, false)));
                circularProgressDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                circularProgressDrawable.draw(canvas);
                canvas.restore();
            }
            if (f12 > 0.0f) {
                z = false;
                button.flicker.setColors(Theme.multAlpha(f7 * f12, animatedColor.set(buttonState.textColor, false)), 64);
                button.flicker.draw(AndroidUtilities.dp(8.0f), canvas, rectF, this);
            } else {
                z = false;
            }
            int i4 = button.rippleColor;
            int iMultAlpha3 = Theme.multAlpha(0.15f, buttonState.textColor);
            BaseCell.RippleDrawableSafe rippleDrawableSafe = button.ripple;
            if (i4 != iMultAlpha3) {
                int iMultAlpha4 = Theme.multAlpha(0.15f, buttonState.textColor);
                button.rippleColor = iMultAlpha4;
                i = 1;
                Theme.setSelectorDrawableColor(rippleDrawableSafe, iMultAlpha4, true);
            } else {
                i = 1;
            }
            rippleDrawableSafe.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            rippleDrawableSafe.draw(canvas);
            canvas.restore();
            i3 += i2 != 0 ? -1 : 1;
            buttonArr = buttonArr;
            str = str2;
            f6 = f13;
            i2 = i2;
        }
    }

    public float getAnimatedTotalHeight() {
        return this.height.value;
    }

    public final Button getHitButton(float f, float f2) {
        int i = 0;
        while (true) {
            Button[] buttonArr = this.buttons;
            if (i >= buttonArr.length) {
                return null;
            }
            ButtonState buttonState = (ButtonState) (i == 0 ? this.state.trimmer : this.state.strategy);
            if (buttonArr[i].bounds.contains(f, f2) && buttonState.visible && buttonState.active) {
                return buttonArr[i];
            }
            i++;
        }
    }

    public int getTotalHeight() {
        Splitter splitter = this.state;
        boolean z = ((ButtonState) splitter.trimmer).visible;
        int i = (z || ((ButtonState) splitter.strategy).visible) ? 1 : 0;
        if (z) {
            ButtonState buttonState = (ButtonState) splitter.strategy;
            if (buttonState.visible && ("top".equalsIgnoreCase(buttonState.position) || "bottom".equalsIgnoreCase(((ButtonState) this.state.strategy).position))) {
                i++;
            }
        }
        if (i == 0) {
            return 0;
        }
        return i == 1 ? AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(109.0f);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), zzkm.m(109.0f, 1));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            Button hitButton = getHitButton(motionEvent.getX(), motionEvent.getY());
            this.pressedButton = hitButton;
            if (hitButton != null) {
                hitButton.bounce.setPressed(true);
                this.pressedButton.ripple.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.pressedButton.ripple.setState(new int[]{16842919, 16842910});
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.pressedButton != null) {
            if (motionEvent.getAction() == 1) {
                Button hitButton2 = getHitButton(motionEvent.getX(), motionEvent.getY());
                Button button = this.pressedButton;
                if (hitButton2 == button && (callback = this.whenClicked) != null) {
                    callback.run(Boolean.valueOf(button == this.buttons[0]));
                }
            }
            this.pressedButton.bounce.setPressed(false);
            this.pressedButton.ripple.setState(new int[0]);
            this.pressedButton = null;
        }
        return this.pressedButton != null;
    }

    public void setOnButtonClickListener(Utilities.Callback<Boolean> callback) {
        this.whenClicked = callback;
    }

    public void setOnResizeListener(Runnable runnable) {
        this.whenResized = runnable;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        Button[] buttonArr = this.buttons;
        Button button = buttonArr[0];
        if (button.ripple != drawable && button.progress != drawable) {
            Button button2 = buttonArr[1];
            if (button2.ripple != drawable && button2.progress != drawable && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
