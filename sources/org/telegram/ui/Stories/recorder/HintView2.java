package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
public class HintView2 extends View {
    private float arrowHalfWidth;
    private float arrowHeight;
    private float arrowX;
    private float arrowY;
    private final Paint backgroundPaint;
    private final ButtonBounce bounce;
    private ValueAnimator bounceAnimator;
    private float bounceT;
    private final RectF bounds;
    private final Rect boundsWithArrow;
    private boolean closeButton;
    private Drawable closeButtonDrawable;
    private float closeButtonMargin;
    private Paint cutSelectorPaint;
    private int direction;
    private long duration;
    private boolean firstDraw;
    private boolean hideByTouch;
    private final Runnable hideRunnable;
    private final RectF innerPadding;
    private float joint;
    private float jointTranslate;
    private LinkSpanDrawable.LinkCollector links;
    private boolean multiline;
    private Runnable onHidden;
    private LinkSpanDrawable.LinksTextView.OnLinkPress onLongPressListener;
    private LinkSpanDrawable.LinksTextView.OnLinkPress onPressListener;
    private final Path path;
    private float pathLastHeight;
    private float pathLastWidth;
    private boolean pathSet;
    private LinkSpanDrawable<ClickableSpan> pressedLink;
    private boolean repeatedBounce;
    private float rounding;
    private Drawable selectorDrawable;
    private AnimatedFloat show;
    private boolean shown;
    private AnimatedTextView.AnimatedTextDrawable textDrawable;
    private StaticLayout textLayout;
    private Layout.Alignment textLayoutAlignment;
    private float textLayoutLeft;
    private float textLayoutWidth;
    private int textMaxWidth;
    private final TextPaint textPaint;
    private CharSequence textToSet;
    private float textX;
    private float textY;
    private boolean useAlpha;
    private boolean useScale;

    public HintView2(Context context, int i) {
        super(context);
        this.joint = 0.5f;
        this.jointTranslate = 0.0f;
        this.duration = 3500L;
        this.useScale = true;
        this.useAlpha = true;
        this.textMaxWidth = -1;
        this.rounding = AndroidUtilities.dp(8.0f);
        this.innerPadding = new RectF(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(7.0f));
        this.closeButtonMargin = AndroidUtilities.dp(2.0f);
        this.arrowHalfWidth = AndroidUtilities.dp(7.0f);
        this.arrowHeight = AndroidUtilities.dp(6.0f);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        this.textPaint = new TextPaint(1);
        this.textLayoutAlignment = Layout.Alignment.ALIGN_NORMAL;
        this.links = new LinkSpanDrawable.LinkCollector();
        this.hideByTouch = true;
        this.repeatedBounce = true;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.show = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
        this.hideRunnable = new Runnable() {
            @Override
            public final void run() {
                HintView2.this.hide();
            }
        };
        this.bounceT = 1.0f;
        this.bounce = new ButtonBounce(this, 2.0f, 5.0f);
        this.boundsWithArrow = new Rect();
        this.bounds = new RectF();
        this.path = new Path();
        this.firstDraw = true;
        this.direction = i;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.rounding));
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, false);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.4f, 0L, 320L, cubicBezierInterpolator);
        this.textDrawable.setCallback(this);
        setTextSize(14);
        setTextColor(-1);
    }

    public HintView2 setRounding(float f) {
        this.rounding = AndroidUtilities.dp(f);
        this.backgroundPaint.setPathEffect(new CornerPathEffect(this.rounding));
        Paint paint = this.cutSelectorPaint;
        if (paint != null) {
            paint.setPathEffect(new CornerPathEffect(this.rounding));
        }
        return this;
    }

    public HintView2 setMultilineText(boolean z) {
        this.multiline = z;
        if (z) {
            this.innerPadding.set(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            this.closeButtonMargin = AndroidUtilities.dp(6.0f);
        } else {
            this.innerPadding.set(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.closeButton ? 15.0f : 11.0f), AndroidUtilities.dp(7.0f));
            this.closeButtonMargin = AndroidUtilities.dp(2.0f);
        }
        return this;
    }

    public HintView2 setText(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.textToSet = charSequence;
        } else if (!this.multiline) {
            this.textDrawable.setText(charSequence, false);
        } else {
            makeLayout(charSequence, getTextMaxWidth());
        }
        return this;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.textToSet;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.multiline) {
            return this.textDrawable.getText();
        }
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public HintView2 setText(CharSequence charSequence, boolean z) {
        if (getMeasuredWidth() < 0) {
            this.textToSet = charSequence;
        } else {
            this.textDrawable.setText(charSequence, !LocaleController.isRTL && z);
        }
        return this;
    }

    public HintView2 setTextSize(int i) {
        float f = i;
        this.textDrawable.setTextSize(AndroidUtilities.dp(f));
        this.textPaint.setTextSize(AndroidUtilities.dp(f));
        return this;
    }

    public HintView2 setCloseButton(boolean z) {
        this.closeButton = z;
        if (!this.multiline) {
            this.innerPadding.set(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.closeButton ? 15.0f : 11.0f), AndroidUtilities.dp(7.0f));
        }
        return this;
    }

    public HintView2 setMaxWidth(float f) {
        this.textMaxWidth = AndroidUtilities.dp(f);
        return this;
    }

    public HintView2 setMaxWidthPx(int i) {
        this.textMaxWidth = i;
        return this;
    }

    public static int cutInFancyHalf(CharSequence charSequence, TextPaint textPaint) {
        int length = charSequence.length() / 2;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = Float.MAX_VALUE;
        int i = 0;
        while (i < 10) {
            while (length > 0 && charSequence.charAt(length) != ' ') {
                length--;
            }
            f2 = textPaint.measureText(charSequence.subSequence(0, length).toString());
            f3 = textPaint.measureText(charSequence.subSequence(length, charSequence.length()).toString().trim());
            if (f2 != f || f3 != f4) {
                length = f2 < f3 ? length + 1 : length - 1;
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i++;
                f = f2;
                f4 = f3;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f2, f3));
    }

    public HintView2 setDuration(long j) {
        this.duration = j;
        return this;
    }

    public HintView2 setAnimatedTextHacks(boolean z, boolean z2, boolean z3) {
        this.textDrawable.setHacks(z, z2, z3);
        return this;
    }

    public HintView2 setInnerPadding(int i, int i2, int i3, int i4) {
        this.innerPadding.set(AndroidUtilities.dp(i), AndroidUtilities.dp(i2), AndroidUtilities.dp(i3), AndroidUtilities.dp(i4));
        return this;
    }

    public HintView2 setTextColor(int i) {
        this.textDrawable.setTextColor(i);
        this.textPaint.setColor(i);
        return this;
    }

    public HintView2 setSelectorColor(int i) {
        if (Build.VERSION.SDK_INT < 21) {
            return this;
        }
        Paint paint = new Paint(1);
        this.cutSelectorPaint = paint;
        paint.setPathEffect(new CornerPathEffect(this.rounding));
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new Drawable() {
            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i2) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            @Override
            public void draw(Canvas canvas) {
                canvas.save();
                canvas.drawPath(HintView2.this.path, HintView2.this.cutSelectorPaint);
                canvas.restore();
            }
        });
        this.selectorDrawable = rippleDrawable;
        rippleDrawable.setCallback(this);
        return this;
    }

    public HintView2 setBounce(boolean z) {
        this.repeatedBounce = z;
        return this;
    }

    public HintView2 setTextAlign(Layout.Alignment alignment) {
        this.textLayoutAlignment = alignment;
        return this;
    }

    public HintView2 setBgColor(int i) {
        this.backgroundPaint.setColor(i);
        return this;
    }

    public HintView2 setOnHiddenListener(Runnable runnable) {
        this.onHidden = runnable;
        return this;
    }

    public HintView2 setJoint(float f, float f2) {
        if (Math.abs(this.joint - f) >= 1.0f || Math.abs(this.jointTranslate - AndroidUtilities.dp(f2)) >= 1.0f) {
            this.pathSet = false;
            invalidate();
        }
        this.joint = f;
        this.jointTranslate = AndroidUtilities.dp(f2);
        return this;
    }

    public HintView2 setJointPx(float f, float f2) {
        if (Math.abs(this.joint - f) >= 1.0f || Math.abs(this.jointTranslate - f2) >= 1.0f) {
            this.pathSet = false;
            invalidate();
        }
        this.joint = f;
        this.jointTranslate = f2;
        return this;
    }

    public TextPaint getTextPaint() {
        if (this.multiline) {
            return this.textPaint;
        }
        return this.textDrawable.getPaint();
    }

    public HintView2 show() {
        if (this.shown) {
            bounceShow();
        }
        this.shown = true;
        invalidate();
        AndroidUtilities.cancelRunOnUIThread(this.hideRunnable);
        long j = this.duration;
        if (j > 0) {
            AndroidUtilities.runOnUIThread(this.hideRunnable, j);
        }
        Runnable runnable = this.onHidden;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        return this;
    }

    private void bounceShow() {
        if (this.repeatedBounce) {
            ValueAnimator valueAnimator = this.bounceAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.bounceAnimator = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.bounceAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    HintView2.this.lambda$bounceShow$0(valueAnimator2);
                }
            });
            this.bounceAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    HintView2.this.bounceT = 1.0f;
                    HintView2.this.invalidate();
                }
            });
            this.bounceAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_BACK);
            this.bounceAnimator.setDuration(300L);
            this.bounceAnimator.start();
        }
    }

    public void lambda$bounceShow$0(ValueAnimator valueAnimator) {
        this.bounceT = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        invalidate();
    }

    public void hide() {
        hide(true);
    }

    public void hide(boolean z) {
        AndroidUtilities.cancelRunOnUIThread(this.hideRunnable);
        Runnable runnable = this.onHidden;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.shown = false;
        if (!z) {
            this.show.set(false, false);
        }
        invalidate();
        Runnable runnable2 = this.onHidden;
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2, this.show.get() * ((float) this.show.getDuration()));
        }
        this.links.clear();
    }

    public void pause() {
        AndroidUtilities.cancelRunOnUIThread(this.hideRunnable);
    }

    public void unpause() {
        AndroidUtilities.cancelRunOnUIThread(this.hideRunnable);
        long j = this.duration;
        if (j > 0) {
            AndroidUtilities.runOnUIThread(this.hideRunnable, j);
        }
    }

    public boolean shown() {
        return this.shown;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.innerPadding;
        int i = measuredWidth - ((int) (rectF.left + rectF.right));
        int i2 = this.textMaxWidth;
        if (i2 > 0) {
            i = Math.min(i2, i);
        }
        return Math.max(0, i);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.pathSet = false;
        int textMaxWidth = getTextMaxWidth();
        this.textDrawable.setOverrideFullWidth(textMaxWidth);
        if (this.multiline) {
            CharSequence charSequence = this.textToSet;
            if (charSequence == null) {
                StaticLayout staticLayout = this.textLayout;
                if (staticLayout == null) {
                    return;
                }
                charSequence = staticLayout.getText();
            }
            StaticLayout staticLayout2 = this.textLayout;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                makeLayout(charSequence, textMaxWidth);
            }
        } else {
            CharSequence charSequence2 = this.textToSet;
            if (charSequence2 != null) {
                this.textDrawable.setText(charSequence2, false);
            }
        }
        this.textToSet = null;
    }

    private void makeLayout(CharSequence charSequence, int i) {
        this.textLayout = new StaticLayout(charSequence, this.textPaint, i, this.textLayoutAlignment, 1.0f, 0.0f, false);
        float f = i;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < this.textLayout.getLineCount(); i2++) {
            f = Math.min(f, this.textLayout.getLineLeft(i2));
            f2 = Math.max(f2, this.textLayout.getLineRight(i2));
        }
        this.textLayoutWidth = Math.max(0.0f, f2 - f);
        this.textLayoutLeft = f;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float height;
        if (this.multiline && this.textLayout == null) {
            return;
        }
        float f = this.show.set(this.shown && !this.firstDraw);
        if (this.firstDraw) {
            this.firstDraw = false;
            invalidate();
        }
        if (f <= 0.0f) {
            return;
        }
        float currentWidth = this.multiline ? this.textLayoutWidth : this.textDrawable.getCurrentWidth();
        if (this.multiline) {
            StaticLayout staticLayout = this.textLayout;
            height = staticLayout != null ? staticLayout.getHeight() : 0;
        } else {
            height = this.textDrawable.getHeight();
        }
        if (this.closeButton) {
            if (this.closeButtonDrawable == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                this.closeButtonDrawable = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            currentWidth += this.closeButtonMargin + this.closeButtonDrawable.getIntrinsicWidth();
            height = Math.max(this.closeButtonDrawable.getIntrinsicHeight(), height);
        }
        RectF rectF = this.innerPadding;
        float f2 = rectF.left + currentWidth + rectF.right;
        float f3 = rectF.top + height + rectF.bottom;
        if (!this.pathSet || Math.abs(f2 - this.pathLastWidth) > 0.1f || Math.abs(f3 - this.pathLastHeight) > 0.1f) {
            this.pathLastWidth = f2;
            this.pathLastHeight = f3;
            rewindPath(f2, f3);
        }
        float f4 = this.useAlpha ? f : 1.0f;
        canvas.save();
        if (f < 1.0f && this.useScale) {
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, f);
            canvas.scale(lerp, lerp, this.arrowX, this.arrowY);
        }
        float scale = this.bounce.getScale(0.025f);
        if (scale != 1.0f) {
            canvas.scale(scale, scale, this.arrowX, this.arrowY);
        }
        if (this.bounceT != 1.0f) {
            int i = this.direction;
            if (i == 3 || i == 1) {
                canvas.translate(0.0f, (this.bounceT - 1.0f) * Math.max(i == 3 ? getPaddingBottom() : getPaddingTop(), AndroidUtilities.dp(24.0f)) * (this.direction == 1 ? -1 : 1));
            } else {
                canvas.translate((this.bounceT - 1.0f) * Math.max(i == 0 ? getPaddingLeft() : getPaddingRight(), AndroidUtilities.dp(24.0f)) * (this.direction == 0 ? -1 : 1), 0.0f);
            }
        }
        int alpha = this.backgroundPaint.getAlpha();
        this.backgroundPaint.setAlpha((int) (alpha * f4));
        canvas.drawPath(this.path, this.backgroundPaint);
        this.backgroundPaint.setAlpha(alpha);
        Drawable drawable = this.selectorDrawable;
        if (drawable != null) {
            drawable.setAlpha((int) (f4 * 255.0f));
            this.selectorDrawable.setBounds(this.boundsWithArrow);
            this.selectorDrawable.draw(canvas);
        }
        if (this.multiline) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f3), (int) (f4 * 255.0f), 31);
            RectF rectF2 = this.bounds;
            float f5 = rectF2.left;
            RectF rectF3 = this.innerPadding;
            float f6 = (f5 + rectF3.left) - this.textLayoutLeft;
            this.textX = f6;
            float f7 = rectF2.top + rectF3.top;
            this.textY = f7;
            canvas.translate(f6, f7);
            if (this.links.draw(canvas)) {
                invalidate();
            }
            this.textLayout.draw(canvas);
            canvas.restore();
        } else {
            CharSequence charSequence = this.textToSet;
            if (charSequence != null) {
                this.textDrawable.setText(charSequence, this.shown);
                this.textToSet = null;
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
            RectF rectF4 = this.bounds;
            float f8 = rectF4.left;
            RectF rectF5 = this.innerPadding;
            float f9 = rectF5.left;
            animatedTextDrawable.setBounds((int) (f8 + f9), (int) (rectF4.top + rectF5.top), (int) (f8 + f9 + currentWidth), (int) (rectF4.bottom - rectF5.bottom));
            this.textDrawable.setAlpha((int) (f4 * 255.0f));
            this.textDrawable.draw(canvas);
        }
        if (this.closeButton) {
            if (this.closeButtonDrawable == null) {
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                this.closeButtonDrawable = mutate2;
                mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
            }
            this.closeButtonDrawable.setAlpha((int) (f4 * 255.0f));
            Drawable drawable2 = this.closeButtonDrawable;
            RectF rectF6 = this.bounds;
            drawable2.setBounds((int) ((this.bounds.right - (this.innerPadding.right * 0.66f)) - drawable2.getIntrinsicWidth()), (int) (this.bounds.centerY() - (this.closeButtonDrawable.getIntrinsicHeight() / 2.0f)), (int) (rectF6.right - (this.innerPadding.right * 0.66f)), (int) (rectF6.centerY() + (this.closeButtonDrawable.getIntrinsicHeight() / 2.0f)));
            this.closeButtonDrawable.draw(canvas);
        }
        canvas.restore();
    }

    private void rewindPath(float f, float f2) {
        float clamp;
        int i = this.direction;
        if (i == 1 || i == 3) {
            float clamp2 = Utilities.clamp(AndroidUtilities.lerp(getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), this.joint) + this.jointTranslate, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min = Math.min(Math.max(getPaddingLeft(), clamp2 - (f / 2.0f)) + f, getMeasuredWidth() - getPaddingRight());
            float f3 = min - f;
            float f4 = this.rounding;
            float f5 = this.arrowHalfWidth;
            clamp = Utilities.clamp(clamp2, (min - f4) - f5, f4 + f3 + f5);
            if (this.direction == 1) {
                this.bounds.set(f3, getPaddingTop() + this.arrowHeight, min, getPaddingTop() + this.arrowHeight + f2);
            } else {
                this.bounds.set(f3, ((getMeasuredHeight() - this.arrowHeight) - getPaddingBottom()) - f2, min, (getMeasuredHeight() - this.arrowHeight) - getPaddingBottom());
            }
        } else {
            float clamp3 = Utilities.clamp(AndroidUtilities.lerp(getPaddingTop(), getMeasuredHeight() - getPaddingBottom(), this.joint) + this.jointTranslate, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min2 = Math.min(Math.max(getPaddingTop(), clamp3 - (f2 / 2.0f)) + f2, getMeasuredHeight() - getPaddingBottom());
            float f6 = min2 - f2;
            float f7 = this.rounding;
            float f8 = this.arrowHalfWidth;
            clamp = Utilities.clamp(clamp3, (min2 - f7) - f8, f7 + f6 + f8);
            if (this.direction == 0) {
                this.bounds.set(getPaddingLeft() + this.arrowHeight, f6, getPaddingLeft() + this.arrowHeight + f, min2);
            } else {
                this.bounds.set(((getMeasuredWidth() - getPaddingRight()) - this.arrowHeight) - f, f6, (getMeasuredWidth() - getPaddingRight()) - this.arrowHeight, min2);
            }
        }
        Rect rect = this.boundsWithArrow;
        RectF rectF = this.bounds;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.path.rewind();
        Path path = this.path;
        RectF rectF2 = this.bounds;
        path.moveTo(rectF2.left, rectF2.bottom);
        if (this.direction == 0) {
            this.path.lineTo(this.bounds.left, this.arrowHalfWidth + clamp + AndroidUtilities.dp(2.0f));
            this.path.lineTo(this.bounds.left, this.arrowHalfWidth + clamp);
            this.path.lineTo(this.bounds.left - this.arrowHeight, AndroidUtilities.dp(1.0f) + clamp);
            float f9 = this.bounds.left;
            float f10 = this.arrowHeight;
            this.arrowX = f9 - f10;
            this.arrowY = clamp;
            this.path.lineTo(f9 - f10, clamp - AndroidUtilities.dp(1.0f));
            this.path.lineTo(this.bounds.left, clamp - this.arrowHalfWidth);
            this.path.lineTo(this.bounds.left, (clamp - this.arrowHalfWidth) - AndroidUtilities.dp(2.0f));
            Rect rect2 = this.boundsWithArrow;
            rect2.left = (int) (rect2.left - this.arrowHeight);
        }
        Path path2 = this.path;
        RectF rectF3 = this.bounds;
        path2.lineTo(rectF3.left, rectF3.top);
        if (this.direction == 1) {
            this.path.lineTo((clamp - this.arrowHalfWidth) - AndroidUtilities.dp(2.0f), this.bounds.top);
            this.path.lineTo(clamp - this.arrowHalfWidth, this.bounds.top);
            this.path.lineTo(clamp - AndroidUtilities.dp(1.0f), this.bounds.top - this.arrowHeight);
            this.arrowX = clamp;
            this.arrowY = this.bounds.top - this.arrowHeight;
            this.path.lineTo(AndroidUtilities.dp(1.0f) + clamp, this.bounds.top - this.arrowHeight);
            this.path.lineTo(this.arrowHalfWidth + clamp, this.bounds.top);
            this.path.lineTo(this.arrowHalfWidth + clamp + AndroidUtilities.dp(2.0f), this.bounds.top);
            Rect rect3 = this.boundsWithArrow;
            rect3.top = (int) (rect3.top - this.arrowHeight);
        }
        Path path3 = this.path;
        RectF rectF4 = this.bounds;
        path3.lineTo(rectF4.right, rectF4.top);
        if (this.direction == 2) {
            this.path.lineTo(this.bounds.right, (clamp - this.arrowHalfWidth) - AndroidUtilities.dp(2.0f));
            this.path.lineTo(this.bounds.right, clamp - this.arrowHalfWidth);
            this.path.lineTo(this.bounds.right + this.arrowHeight, clamp - AndroidUtilities.dp(1.0f));
            float f11 = this.bounds.right;
            float f12 = this.arrowHeight;
            this.arrowX = f11 + f12;
            this.arrowY = clamp;
            this.path.lineTo(f11 + f12, AndroidUtilities.dp(1.0f) + clamp);
            this.path.lineTo(this.bounds.right, this.arrowHalfWidth + clamp);
            this.path.lineTo(this.bounds.right, this.arrowHalfWidth + clamp + AndroidUtilities.dp(2.0f));
            Rect rect4 = this.boundsWithArrow;
            rect4.right = (int) (rect4.right + this.arrowHeight);
        }
        Path path4 = this.path;
        RectF rectF5 = this.bounds;
        path4.lineTo(rectF5.right, rectF5.bottom);
        if (this.direction == 3) {
            this.path.lineTo(this.arrowHalfWidth + clamp + AndroidUtilities.dp(2.0f), this.bounds.bottom);
            this.path.lineTo(this.arrowHalfWidth + clamp, this.bounds.bottom);
            this.path.lineTo(AndroidUtilities.dp(1.0f) + clamp, this.bounds.bottom + this.arrowHeight);
            this.arrowX = clamp;
            this.arrowY = this.bounds.bottom + this.arrowHeight;
            this.path.lineTo(clamp - AndroidUtilities.dp(1.0f), this.bounds.bottom + this.arrowHeight);
            this.path.lineTo(clamp - this.arrowHalfWidth, this.bounds.bottom);
            this.path.lineTo((clamp - this.arrowHalfWidth) - AndroidUtilities.dp(2.0f), this.bounds.bottom);
            Rect rect5 = this.boundsWithArrow;
            rect5.bottom = (int) (rect5.bottom + this.arrowHeight);
        }
        this.path.close();
        this.pathSet = true;
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.textDrawable || drawable == this.selectorDrawable || super.verifyDrawable(drawable);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((this.hideByTouch || hasOnClickListeners()) && this.shown) {
            return checkTouchLinks(motionEvent) || checkTouchTap(motionEvent);
        }
        return false;
    }

    public boolean containsTouch(MotionEvent motionEvent, float f, float f2) {
        return this.bounds.contains(motionEvent.getX() - f, motionEvent.getY() - f2);
    }

    private boolean checkTouchTap(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() == 0 && containsTouch(motionEvent, 0.0f, 0.0f)) {
            this.bounce.setPressed(true);
            Drawable drawable = this.selectorDrawable;
            if (drawable != null && Build.VERSION.SDK_INT >= 21) {
                drawable.setHotspot(x, y);
                this.selectorDrawable.setState(new int[]{16842919, 16842910});
            }
            return true;
        } else if (motionEvent.getAction() == 1) {
            if (hasOnClickListeners()) {
                performClick();
            } else if (this.hideByTouch) {
                hide();
            }
            this.bounce.setPressed(false);
            Drawable drawable2 = this.selectorDrawable;
            if (drawable2 != null) {
                drawable2.setState(new int[0]);
            }
            return true;
        } else if (motionEvent.getAction() == 3) {
            this.bounce.setPressed(false);
            Drawable drawable3 = this.selectorDrawable;
            if (drawable3 != null) {
                drawable3.setState(new int[0]);
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean checkTouchLinks(MotionEvent motionEvent) {
        if (this.textLayout != null) {
            final ClickableSpan hitLink = hitLink((int) motionEvent.getX(), (int) motionEvent.getY());
            if (hitLink != null && motionEvent.getAction() == 0) {
                final LinkSpanDrawable<ClickableSpan> linkSpanDrawable = new LinkSpanDrawable<>(hitLink, null, motionEvent.getX(), motionEvent.getY());
                this.pressedLink = linkSpanDrawable;
                this.links.addLink(linkSpanDrawable);
                SpannableString spannableString = new SpannableString(this.textLayout.getText());
                int spanStart = spannableString.getSpanStart(this.pressedLink.getSpan());
                int spanEnd = spannableString.getSpanEnd(this.pressedLink.getSpan());
                LinkPath obtainNewPath = this.pressedLink.obtainNewPath();
                obtainNewPath.setCurrentLayout(this.textLayout, spanStart, 0.0f);
                this.textLayout.getSelectionPath(spanStart, spanEnd, obtainNewPath);
                invalidate();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        HintView2.this.lambda$checkTouchLinks$1(linkSpanDrawable, hitLink);
                    }
                }, ViewConfiguration.getLongPressTimeout());
                pause();
                return true;
            }
            if (motionEvent.getAction() == 1) {
                this.links.clear();
                invalidate();
                unpause();
                LinkSpanDrawable<ClickableSpan> linkSpanDrawable2 = this.pressedLink;
                if (linkSpanDrawable2 != null && linkSpanDrawable2.getSpan() == hitLink) {
                    LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress = this.onPressListener;
                    if (onLinkPress != null) {
                        onLinkPress.run(this.pressedLink.getSpan());
                    } else if (this.pressedLink.getSpan() != null) {
                        this.pressedLink.getSpan().onClick(this);
                    }
                    this.pressedLink = null;
                    return true;
                }
                this.pressedLink = null;
            }
            if (motionEvent.getAction() == 3) {
                this.links.clear();
                invalidate();
                unpause();
                this.pressedLink = null;
            }
        }
        return this.pressedLink != null;
    }

    public void lambda$checkTouchLinks$1(LinkSpanDrawable linkSpanDrawable, ClickableSpan clickableSpan) {
        LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress = this.onLongPressListener;
        if (onLinkPress == null || this.pressedLink != linkSpanDrawable) {
            return;
        }
        onLinkPress.run(clickableSpan);
        this.pressedLink = null;
        this.links.clear();
    }

    private ClickableSpan hitLink(int i, int i2) {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout == null) {
            return null;
        }
        int i3 = (int) (i2 - this.textY);
        int lineForVertical = staticLayout.getLineForVertical(i3);
        float f = (int) (i - this.textX);
        int offsetForHorizontal = this.textLayout.getOffsetForHorizontal(lineForVertical, f);
        float lineLeft = this.textLayout.getLineLeft(lineForVertical);
        if (lineLeft <= f && lineLeft + this.textLayout.getLineWidth(lineForVertical) >= f && i3 >= 0 && i3 <= this.textLayout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(this.textLayout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }
}
