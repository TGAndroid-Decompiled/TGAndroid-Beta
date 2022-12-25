package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Cells.ChatMessageCell;
import org.telegram.p009ui.Components.ChecksHintView;

public class ChecksHintView extends FrameLayout {
    private AnimatorSet animatorSet;
    private ImageView arrowImageView;
    private View currentView;
    private Runnable hideRunnable;
    private RLottieImageView[] imageView;
    private ChatMessageCell messageCell;
    private final Theme.ResourcesProvider resourcesProvider;
    private TextView[] textView;
    private float translationY;

    public ChecksHintView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.textView = new TextView[2];
        this.imageView = new RLottieImageView[2];
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.m35dp(6.0f), getThemedColor("chat_gifSaveHintBackground")));
        int i = 0;
        frameLayout.setPadding(AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), 0, AndroidUtilities.m35dp(8.0f));
        addView(frameLayout, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
        while (i < 2) {
            this.imageView[i] = new RLottieImageView(context);
            this.imageView[i].setScaleType(ImageView.ScaleType.CENTER);
            frameLayout.addView(this.imageView[i], LayoutHelper.createFrame(24, 24.0f, 51, 0.0f, i == 0 ? 0.0f : 24.0f, 0.0f, 0.0f));
            this.textView[i] = new TextView(context);
            this.textView[i].setTextColor(getThemedColor("chat_gifSaveHintText"));
            this.textView[i].setTextSize(1, 14.0f);
            this.textView[i].setMaxLines(1);
            this.textView[i].setSingleLine(true);
            this.textView[i].setMaxWidth(AndroidUtilities.m35dp(250.0f));
            this.textView[i].setGravity(51);
            this.textView[i].setPivotX(0.0f);
            frameLayout.addView(this.textView[i], LayoutHelper.createFrame(-2, -2.0f, 51, 32.0f, i == 0 ? 2.0f : 26.0f, 10.0f, 0.0f));
            if (i == 0) {
                this.imageView[i].setAnimation(C1010R.raw.ticks_single, 24, 24);
                this.textView[i].setText(LocaleController.getString("HintSent", C1010R.string.HintSent));
            } else {
                this.imageView[i].setAnimation(C1010R.raw.ticks_double, 24, 24);
                this.textView[i].setText(LocaleController.getString("HintRead", C1010R.string.HintRead));
            }
            this.imageView[i].playAnimation();
            i++;
        }
        ImageView imageView = new ImageView(context);
        this.arrowImageView = imageView;
        imageView.setImageResource(C1010R.C1011drawable.tooltip_arrow);
        this.arrowImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor("chat_gifSaveHintBackground"), PorterDuff.Mode.MULTIPLY));
        addView(this.arrowImageView, LayoutHelper.createFrame(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public float getBaseTranslationY() {
        return this.translationY;
    }

    public boolean showForMessageCell(ChatMessageCell chatMessageCell, boolean z) {
        Runnable runnable = this.hideRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.hideRunnable = null;
        }
        int[] iArr = new int[2];
        chatMessageCell.getLocationInWindow(iArr);
        int i = iArr[1];
        ((View) getParent()).getLocationInWindow(iArr);
        int i2 = i - iArr[1];
        View view = (View) chatMessageCell.getParent();
        measure(View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1000, Integer.MIN_VALUE));
        final int i3 = 0;
        if (i2 <= getMeasuredHeight() + AndroidUtilities.m35dp(10.0f)) {
            return false;
        }
        int checksY = i2 + chatMessageCell.getChecksY() + AndroidUtilities.m35dp(6.0f);
        int checksX = chatMessageCell.getChecksX() + AndroidUtilities.m35dp(5.0f);
        int measuredWidth = view.getMeasuredWidth();
        float measuredHeight = checksY - getMeasuredHeight();
        this.translationY = measuredHeight;
        setTranslationY(measuredHeight);
        int left = chatMessageCell.getLeft() + checksX;
        int m35dp = AndroidUtilities.m35dp(15.0f);
        if (left > view.getMeasuredWidth() / 2) {
            int measuredWidth2 = (measuredWidth - getMeasuredWidth()) - AndroidUtilities.m35dp(20.0f);
            setTranslationX(measuredWidth2);
            m35dp += measuredWidth2;
        } else {
            setTranslationX(0.0f);
        }
        float left2 = ((chatMessageCell.getLeft() + checksX) - m35dp) - (this.arrowImageView.getMeasuredWidth() / 2);
        this.arrowImageView.setTranslationX(left2);
        if (left > view.getMeasuredWidth() / 2) {
            if (left2 < AndroidUtilities.m35dp(10.0f)) {
                float m35dp2 = left2 - AndroidUtilities.m35dp(10.0f);
                setTranslationX(getTranslationX() + m35dp2);
                this.arrowImageView.setTranslationX(left2 - m35dp2);
            }
        } else if (left2 > getMeasuredWidth() - AndroidUtilities.m35dp(24.0f)) {
            float measuredWidth3 = (left2 - getMeasuredWidth()) + AndroidUtilities.m35dp(24.0f);
            setTranslationX(measuredWidth3);
            this.arrowImageView.setTranslationX(left2 - measuredWidth3);
        } else if (left2 < AndroidUtilities.m35dp(10.0f)) {
            float m35dp3 = left2 - AndroidUtilities.m35dp(10.0f);
            setTranslationX(getTranslationX() + m35dp3);
            this.arrowImageView.setTranslationX(left2 - m35dp3);
        }
        setPivotX(left2);
        setPivotY(getMeasuredHeight());
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.0f, 1.0f));
            this.animatorSet.addListener(new C20521());
            this.animatorSet.setDuration(180L);
            this.animatorSet.start();
            while (i3 < 2) {
                this.textView[i3].animate().scaleX(1.04f).scaleY(1.04f).setInterpolator(CubicBezierInterpolator.EASE_IN).setStartDelay((i3 == 0 ? 132 : 500) + 140).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ChecksHintView.this.textView[i3].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT).setStartDelay(0L).setDuration(100L).start();
                    }
                }).start();
                i3++;
            }
        } else {
            setAlpha(1.0f);
        }
        return true;
    }

    public class C20521 extends AnimatorListenerAdapter {
        C20521() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ChecksHintView.this.animatorSet = null;
            AndroidUtilities.runOnUIThread(ChecksHintView.this.hideRunnable = new Runnable() {
                @Override
                public final void run() {
                    ChecksHintView.C20521.this.lambda$onAnimationEnd$0();
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.0f));
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

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
