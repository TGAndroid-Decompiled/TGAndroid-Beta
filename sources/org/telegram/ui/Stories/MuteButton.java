package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;

public class MuteButton extends FrameLayout {
    private ValueAnimator animator;
    private final StrokeDrawable background;
    private boolean connected;
    private final View filledBackgroundView;
    private final ImageView image;
    private final FrameLayout layout;
    private final View loadingView;
    private ValueAnimator loadingViewAnimator;
    private boolean muted;
    private float mutedT;

    public MuteButton(Context context, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        super(context);
        ScaleStateListAnimator.apply(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.layout = frameLayout;
        StrokeDrawable strokeDrawable = new StrokeDrawable();
        this.background = strokeDrawable;
        strokeDrawable.setColorProvider(blurredBackgroundColorProvider);
        strokeDrawable.setBackgroundColor(-14670806);
        strokeDrawable.setPadding(AndroidUtilities.dp(1.0f));
        frameLayout.setBackground(strokeDrawable);
        addView(frameLayout, LayoutHelper.createFrame(40, 40, 17));
        View view = new View(context);
        this.filledBackgroundView = view;
        view.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, LayoutHelper.createFrame(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        View view2 = new View(context) {
            private final CircularProgressDrawable progressDrawable = new CircularProgressDrawable(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);

            @Override
            protected void onDraw(Canvas canvas) {
                int iDp = AndroidUtilities.dp(1.0f);
                this.progressDrawable.setBounds(iDp, iDp, (getWidth() - iDp) - iDp, (getHeight() - iDp) - iDp);
                this.progressDrawable.draw(canvas);
                invalidate();
            }
        };
        this.loadingView = view2;
        addView(view2, LayoutHelper.createFrame(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.image = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, LayoutHelper.createFrame(40, 40, 17));
        setMuted(false, false);
    }

    public void setConnected(boolean z, boolean z2) {
        boolean z3 = true;
        if (this.connected == z && z2) {
            return;
        }
        this.connected = z;
        ValueAnimator valueAnimator = this.loadingViewAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.loadingViewAnimator = null;
        }
        if (!z2) {
            this.loadingView.setAlpha(z ? 0.0f : 1.0f);
            this.loadingView.setVisibility(z ? 8 : 0);
        } else {
            this.loadingView.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.loadingView.getAlpha(), z ? 0.0f : 1.0f);
            this.loadingViewAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.loadingView.setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
            this.loadingViewAnimator.setDuration(320L);
            this.loadingViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.loadingViewAnimator.start();
        }
        if (!this.muted && z) {
            z3 = false;
        }
        updateFill(z3, z2);
    }

    public void setMuted(boolean z, boolean z2) {
        this.muted = z;
        if (!z2) {
            AndroidUtilities.updateImageViewImageAnimated(this.image, z ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        } else {
            this.image.setImageResource(z ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        }
        updateFill(z || !this.connected, z2);
    }

    private void updateFill(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        if (!z2) {
            float f = z ? 1.0f : 0.0f;
            this.mutedT = f;
            this.filledBackgroundView.setAlpha(1.0f - f);
            this.filledBackgroundView.setScaleX(1.0f - this.mutedT);
            this.filledBackgroundView.setScaleY(1.0f - this.mutedT);
            this.image.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -2960428, this.mutedT), PorterDuff.Mode.SRC_IN));
            this.layout.invalidate();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mutedT, z ? 1.0f : 0.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                MuteButton.m4331$r8$lambda$slVReqTgRBlp2qRiEYjaysTAGU(this.f$0, valueAnimator2);
            }
        });
        this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.animator.setDuration(420L);
        this.animator.start();
    }

    public static void m4331$r8$lambda$slVReqTgRBlp2qRiEYjaysTAGU(MuteButton muteButton, ValueAnimator valueAnimator) {
        muteButton.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        muteButton.mutedT = fFloatValue;
        muteButton.filledBackgroundView.setAlpha(1.0f - fFloatValue);
        muteButton.filledBackgroundView.setScaleX(1.0f - muteButton.mutedT);
        muteButton.filledBackgroundView.setScaleY(1.0f - muteButton.mutedT);
        muteButton.image.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -2960428, muteButton.mutedT), PorterDuff.Mode.SRC_IN));
        muteButton.layout.invalidate();
    }
}
