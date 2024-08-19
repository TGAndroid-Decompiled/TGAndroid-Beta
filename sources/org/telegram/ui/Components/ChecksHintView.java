package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ChecksHintView;

public class ChecksHintView extends FrameLayout {
    private AnimatorSet animatorSet;
    private ImageView arrowImageView;
    private View currentView;
    private Runnable hideRunnable;
    private RLottieImageView[] imageView;
    private ChatMessageCell messageCell;
    private final Theme.ResourcesProvider resourcesProvider;
    private long showingDuration;
    private TextView[] textView;
    private float translationY;

    public ChecksHintView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.textView = new TextView[2];
        this.imageView = new RLottieImageView[2];
        this.showingDuration = 2000L;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), getThemedColor(Theme.key_chat_gifSaveHintBackground)));
        int i = 0;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
        while (i < 2) {
            this.imageView[i] = new RLottieImageView(context);
            this.imageView[i].setScaleType(ImageView.ScaleType.CENTER);
            frameLayout.addView(this.imageView[i], LayoutHelper.createFrame(24, 24.0f, 51, 0.0f, i == 0 ? 0.0f : 24.0f, 0.0f, 0.0f));
            this.textView[i] = new TextView(context);
            this.textView[i].setTextColor(getThemedColor(Theme.key_chat_gifSaveHintText));
            this.textView[i].setTextSize(1, 14.0f);
            this.textView[i].setMaxLines(1);
            this.textView[i].setSingleLine(true);
            this.textView[i].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.textView[i].setGravity(51);
            this.textView[i].setPivotX(0.0f);
            frameLayout.addView(this.textView[i], LayoutHelper.createFrame(-2, -2.0f, 51, 32.0f, i == 0 ? 2.0f : 26.0f, 10.0f, 0.0f));
            if (i == 0) {
                this.imageView[i].setAnimation(R.raw.ticks_single, 24, 24);
                this.textView[i].setText(LocaleController.getString(R.string.HintSent));
            } else {
                this.imageView[i].setAnimation(R.raw.ticks_double, 24, 24);
                this.textView[i].setText(LocaleController.getString(R.string.HintRead));
            }
            this.imageView[i].playAnimation();
            i++;
        }
        ImageView imageView = new ImageView(context);
        this.arrowImageView = imageView;
        imageView.setImageResource(R.drawable.tooltip_arrow);
        this.arrowImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_gifSaveHintBackground), PorterDuff.Mode.MULTIPLY));
        addView(this.arrowImageView, LayoutHelper.createFrame(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public float getBaseTranslationY() {
        return this.translationY;
    }

    public boolean showForMessageCell(ChatMessageCell chatMessageCell, boolean z) {
        final int i = 0;
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hideRunnable = null;
        }
        int[] iArr = new int[2];
        chatMessageCell.getLocationInWindow(iArr);
        int i2 = iArr[1];
        ((View) getParent()).getLocationInWindow(iArr);
        int i3 = i2 - iArr[1];
        View view = (View) chatMessageCell.getParent();
        measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
        if (i3 <= getMeasuredHeight() + AndroidUtilities.dp(10.0f)) {
            return false;
        }
        int checksY = i3 + chatMessageCell.getChecksY() + AndroidUtilities.dp(6.0f);
        int checksX = chatMessageCell.getChecksX() + AndroidUtilities.dp(5.0f);
        int measuredWidth = view.getMeasuredWidth();
        float measuredHeight = checksY - getMeasuredHeight();
        this.translationY = measuredHeight;
        setTranslationY(measuredHeight);
        int left = chatMessageCell.getLeft() + checksX;
        int dp = AndroidUtilities.dp(15.0f);
        if (left > view.getMeasuredWidth() / 2) {
            int measuredWidth2 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
            setTranslationX(measuredWidth2);
            dp += measuredWidth2;
        } else {
            setTranslationX(0.0f);
        }
        float left2 = ((chatMessageCell.getLeft() + checksX) - dp) - (this.arrowImageView.getMeasuredWidth() / 2);
        this.arrowImageView.setTranslationX(left2);
        if (left > view.getMeasuredWidth() / 2) {
            if (left2 < AndroidUtilities.dp(10.0f)) {
                float dp2 = left2 - AndroidUtilities.dp(10.0f);
                setTranslationX(getTranslationX() + dp2);
                this.arrowImageView.setTranslationX(left2 - dp2);
            }
        } else if (left2 > getMeasuredWidth() - AndroidUtilities.dp(24.0f)) {
            float measuredWidth3 = (left2 - getMeasuredWidth()) + AndroidUtilities.dp(24.0f);
            setTranslationX(measuredWidth3);
            this.arrowImageView.setTranslationX(left2 - measuredWidth3);
        } else if (left2 < AndroidUtilities.dp(10.0f)) {
            float dp3 = left2 - AndroidUtilities.dp(10.0f);
            setTranslationX(getTranslationX() + dp3);
            this.arrowImageView.setTranslationX(left2 - dp3);
        }
        setPivotX(left2);
        setPivotY(getMeasuredHeight());
        this.messageCell = chatMessageCell;
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        setTag(1);
        setVisibility(0);
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<ChecksHintView, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<ChecksHintView, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, (Property<ChecksHintView, Float>) View.SCALE_Y, 0.0f, 1.0f));
            this.animatorSet.addListener(new AnonymousClass1());
            this.animatorSet.setDuration(180L);
            this.animatorSet.start();
            while (i < 2) {
                this.textView[i].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(CubicBezierInterpolator.EASE_IN).setStartDelay((i == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChecksHintView.this.textView[i].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT).setStartDelay(0L).setDuration(100L).start();
                    }
                }).start();
                i++;
            }
        } else {
            setAlpha(1.0f);
        }
        return true;
    }

    public class AnonymousClass1 extends AnimatorListenerAdapter {
        AnonymousClass1() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ChecksHintView.this.animatorSet = null;
            AndroidUtilities.runOnUIThread(ChecksHintView.this.hideRunnable = new Runnable() {
                @Override
                public final void run() {
                    ChecksHintView.AnonymousClass1.this.lambda$onAnimationEnd$0();
                }
            }, 3000L);
        }

        public void lambda$onAnimationEnd$0() {
            ChecksHintView.this.hide();
        }
    }

    public void hide() {
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hideRunnable = null;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.animatorSet = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.animatorSet = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<ChecksHintView, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, (Property<ChecksHintView, Float>) View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, (Property<ChecksHintView, Float>) View.SCALE_Y, 0.0f));
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ChecksHintView.this.setVisibility(4);
                ChecksHintView.this.currentView = null;
                ChecksHintView.this.messageCell = null;
                ChecksHintView.this.animatorSet = null;
            }
        });
        this.animatorSet.setDuration(180L);
        this.animatorSet.start();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
