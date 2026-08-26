package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
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

public final class ChecksHintView extends FrameLayout {
    public AnimatorSet animatorSet;
    public final ImageView arrowImageView;
    public Bulletin$2$$ExternalSyntheticLambda1 hideRunnable;
    public final RLottieImageView[] imageView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView[] textView;
    public float translationY;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ChecksHintView this$0;

        public AnonymousClass1(ChecksHintView checksHintView, int i) {
            this.$r8$classId = i;
            this.this$0 = checksHintView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ChecksHintView checksHintView = this.this$0;
                    checksHintView.animatorSet = null;
                    Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1 = new Bulletin$2$$ExternalSyntheticLambda1(this, 21);
                    checksHintView.hideRunnable = bulletin$2$$ExternalSyntheticLambda1;
                    AndroidUtilities.runOnUIThread(bulletin$2$$ExternalSyntheticLambda1, 3000L);
                    break;
                default:
                    ChecksHintView checksHintView2 = this.this$0;
                    checksHintView2.setVisibility(4);
                    checksHintView2.getClass();
                    checksHintView2.getClass();
                    checksHintView2.animatorSet = null;
                    break;
            }
        }
    }

    public ChecksHintView(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        this.textView = new TextView[2];
        this.imageView = new RLottieImageView[2];
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_chat_gifSaveHintBackground, resourcesProvider)));
        int i = 0;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(frameLayout, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 6.0f));
        while (i < 2) {
            this.imageView[i] = new RLottieImageView(activity);
            this.imageView[i].setScaleType(ImageView.ScaleType.CENTER);
            frameLayout.addView(this.imageView[i], LayoutHelper.createFrame(24, 24.0f, 51, 0.0f, i == 0 ? 0.0f : 24.0f, 0.0f, 0.0f));
            this.textView[i] = new TextView(activity);
            this.textView[i].setTextColor(Theme.getColor(Theme.key_chat_gifSaveHintText, this.resourcesProvider));
            this.textView[i].setTextSize(1, 14.0f);
            this.textView[i].setMaxLines(1);
            this.textView[i].setSingleLine(true);
            this.textView[i].setMaxWidth(AndroidUtilities.dp(250.0f));
            this.textView[i].setGravity(51);
            this.textView[i].setPivotX(0.0f);
            frameLayout.addView(this.textView[i], LayoutHelper.createFrame(-2, -2.0f, 51, 32.0f, i == 0 ? 2.0f : 26.0f, 10.0f, 0.0f));
            if (i == 0) {
                this.imageView[i].setAnimation(R.raw.ticks_single, 24, 24, null);
                this.textView[i].setText(LocaleController.getString(R.string.HintSent));
            } else {
                this.imageView[i].setAnimation(R.raw.ticks_double, 24, 24, null);
                this.textView[i].setText(LocaleController.getString(R.string.HintRead));
            }
            this.imageView[i].playAnimation();
            i++;
        }
        ImageView imageView = new ImageView(activity);
        this.arrowImageView = imageView;
        imageView.setImageResource(R.drawable.tooltip_arrow);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_gifSaveHintBackground, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        addView(imageView, LayoutHelper.createFrame(14, 6.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public float getBaseTranslationY() {
        return this.translationY;
    }

    public final void hide() {
        int i = 1;
        if (getTag() == null) {
            return;
        }
        setTag(null);
        Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1 = this.hideRunnable;
        if (bulletin$2$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(bulletin$2$$ExternalSyntheticLambda1);
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
        this.animatorSet.addListener(new AnonymousClass1(this, i));
        this.animatorSet.setDuration(180L);
        this.animatorSet.start();
    }
}
