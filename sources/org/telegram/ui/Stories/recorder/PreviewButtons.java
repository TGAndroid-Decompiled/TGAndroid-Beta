package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.recorder.PreviewButtons;
public class PreviewButtons extends FrameLayout {
    private ValueAnimator appearAnimator;
    private float appearT;
    private boolean appearing;
    private ArrayList<View> buttons;
    private boolean isShareEnabled;
    private Utilities.Callback<Integer> onClickListener;
    private View shadowView;
    public ShareButtonView shareButton;
    private String shareText;

    public PreviewButtons(Context context) {
        super(context);
        this.buttons = new ArrayList<>();
        this.isShareEnabled = true;
        View view = new View(context);
        this.shadowView = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        addView(this.shadowView, LayoutHelper.createFrame(-1, -1, 119));
        addButton(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        addButton(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        addButton(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        addButton(3, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        int i = R.string.Send;
        String string = LocaleController.getString("Send", i);
        this.shareText = string;
        ShareButtonView shareButtonView = new ShareButtonView(context, string);
        this.shareButton = shareButtonView;
        shareButtonView.setContentDescription(LocaleController.getString(i));
        addView(this.shareButton, LayoutHelper.createFrame(-2, -2.0f));
        updateAppearT();
    }

    public void setShareText(String str) {
        if (TextUtils.equals(str, this.shareText)) {
            return;
        }
        removeView(this.shareButton);
        ShareButtonView shareButtonView = new ShareButtonView(getContext(), str);
        this.shareButton = shareButtonView;
        shareButtonView.setContentDescription(str);
        addView(this.shareButton, LayoutHelper.createFrame(-2, -2.0f));
        updateAppearT();
    }

    private void addButton(int i, int i2, CharSequence charSequence) {
        ButtonView buttonView = new ButtonView(getContext(), i, i2);
        buttonView.setContentDescription(charSequence);
        this.buttons.add(buttonView);
        addView(buttonView);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.shadowView.layout(0, 0, i5, i6);
        ShareButtonView shareButtonView = this.shareButton;
        shareButtonView.layout(i5 - shareButtonView.getMeasuredWidth(), (i6 - this.shareButton.getMeasuredHeight()) / 2, i5, (this.shareButton.getMeasuredHeight() + i6) / 2);
        int min = Math.min(AndroidUtilities.dp(20.0f), this.buttons.size() < 2 ? 0 : (((i5 - AndroidUtilities.dp(32.33f)) - this.shareButton.getMeasuredWidth()) - (this.buttons.size() * AndroidUtilities.dp(40.0f))) / (this.buttons.size() - 1));
        int dp = (i6 - AndroidUtilities.dp(40.0f)) / 2;
        int dp2 = (i6 + AndroidUtilities.dp(40.0f)) / 2;
        int dp3 = AndroidUtilities.dp(12.33f);
        for (int i7 = 0; i7 < this.buttons.size(); i7++) {
            this.buttons.get(i7).layout(dp3, dp, AndroidUtilities.dp(40.0f) + dp3, dp2);
            dp3 += AndroidUtilities.dp(40.0f) + min;
        }
    }

    public void setOnClickListener(Utilities.Callback<Integer> callback) {
        this.onClickListener = callback;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }

    public void setShareEnabled(boolean z) {
        if (this.isShareEnabled != z) {
            this.isShareEnabled = z;
            ShareButtonView shareButtonView = this.shareButton;
            shareButtonView.enabled = z;
            shareButtonView.invalidate();
        }
    }

    public boolean isShareEnabled() {
        return this.isShareEnabled;
    }

    public void appear(boolean z, boolean z2) {
        if (this.appearing == z) {
            return;
        }
        ValueAnimator valueAnimator = this.appearAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.appearing = z;
        if (z2) {
            float[] fArr = new float[2];
            fArr[0] = this.appearT;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.appearAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    PreviewButtons.this.lambda$appear$0(valueAnimator2);
                }
            });
            if (this.appearing) {
                this.appearAnimator.setDuration(450L);
                this.appearAnimator.setInterpolator(new LinearInterpolator());
            } else {
                this.appearAnimator.setDuration(350L);
                this.appearAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            this.appearAnimator.start();
            return;
        }
        this.appearT = z ? 1.0f : 0.0f;
        updateAppearT();
    }

    public void lambda$appear$0(ValueAnimator valueAnimator) {
        this.appearT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateAppearT();
    }

    private void updateAppearT() {
        this.shadowView.setAlpha(this.appearT);
        this.shadowView.setTranslationY((1.0f - this.appearT) * AndroidUtilities.dp(16.0f));
        for (int i = 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            float f = this.appearT;
            if (this.appearing) {
                f = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(AndroidUtilities.cascade(f, i - 1, getChildCount() - 1, 3.0f));
            }
            childAt.setAlpha(f);
            childAt.setTranslationY((1.0f - f) * AndroidUtilities.dp(24.0f));
        }
    }

    public class ShareButtonView extends View {
        ValueAnimator backAnimator;
        private final Paint buttonPaint;
        private final Paint darkenPaint;
        public boolean enabled;
        private AnimatedFloat enabledT;
        private final int h;
        private float left;
        float pressedProgress;
        private final StaticLayout staticLayout;
        private final TextPaint textPaint;
        private final int w;
        private float width;

        public ShareButtonView(Context context, String str) {
            super(context);
            SpannableStringBuilder append;
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            Paint paint = new Paint(1);
            this.buttonPaint = paint;
            Paint paint2 = new Paint(1);
            this.darkenPaint = paint2;
            this.enabledT = new AnimatedFloat(this, 0L, 220L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.enabled = true;
            paint.setColor(-15098625);
            paint2.setColor(1610612736);
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            textPaint.setColor(-1);
            textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            SpannableString spannableString = new SpannableString(">");
            Drawable mutate = getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            mutate.setBounds(0, 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
            if (LocaleController.isRTL) {
                append = new SpannableStringBuilder(spannableString).append((CharSequence) "\u2009").append((CharSequence) str.toUpperCase());
            } else {
                append = new SpannableStringBuilder(str.toUpperCase()).append((CharSequence) "\u2009").append((CharSequence) spannableString);
            }
            StaticLayout staticLayout = new StaticLayout(append, textPaint, AndroidUtilities.dp(180.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.staticLayout = staticLayout;
            this.left = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
            float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
            this.width = lineWidth;
            this.w = ((int) lineWidth) + AndroidUtilities.dp(48.0f);
            this.h = AndroidUtilities.dp(40.0f);
            setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PreviewButtons.ShareButtonView.this.lambda$new$0(view);
                }
            });
        }

        public void lambda$new$0(View view) {
            if (!PreviewButtons.this.appearing || PreviewButtons.this.onClickListener == null) {
                return;
            }
            PreviewButtons.this.onClickListener.run(4);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    float min = f + (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 80.0f);
                    this.pressedProgress = min;
                    this.pressedProgress = Utilities.clamp(min, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float f2 = this.enabledT.set(this.enabled ? 1.0f : 0.5f);
            int saveCount = canvas.getSaveCount();
            if (f2 < 1.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f2 * 255.0f), 31);
            }
            float f3 = ((1.0f - this.pressedProgress) * 0.1f) + 0.9f;
            canvas.save();
            canvas.scale(f3, f3, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.drawRect(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(25.0f), getHeight() - AndroidUtilities.dp(4.0f), this.darkenPaint);
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(10.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.buttonPaint);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(26.0f) - this.left, (getHeight() - this.staticLayout.getHeight()) / 2.0f);
            this.staticLayout.draw(canvas);
            canvas.restore();
            canvas.restoreToCount(saveCount);
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            if (isPressed() != z) {
                super.setPressed(z);
                invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            PreviewButtons.ShareButtonView.this.lambda$setPressed$1(valueAnimator2);
                        }
                    });
                    this.backAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            ShareButtonView.this.backAnimator = null;
                        }
                    });
                    this.backAnimator.setInterpolator(new OvershootInterpolator(1.5f));
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }

        public void lambda$setPressed$1(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
        }
    }

    public class ButtonView extends ImageView {
        public ButtonView(Context context, final int i, int i2) {
            super(context);
            setBackground(Theme.createSelectorDrawable(1090519039));
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(i2);
            setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PreviewButtons.ButtonView.this.lambda$new$0(i, view);
                }
            });
        }

        public void lambda$new$0(int i, View view) {
            if (!PreviewButtons.this.appearing || PreviewButtons.this.onClickListener == null) {
                return;
            }
            PreviewButtons.this.onClickListener.run(Integer.valueOf(i));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
        }
    }
}
