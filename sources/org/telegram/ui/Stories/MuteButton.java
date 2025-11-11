package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;

public class MuteButton extends FrameLayout {
    private ValueAnimator animator;
    private final StrokeDrawable background;
    private final RLottieDrawable icon;
    private final BackupImageView image;
    private final FrameLayout layout;
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
        BackupImageView backupImageView = new BackupImageView(context);
        this.image = backupImageView;
        int i = R.raw.call_mute;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f), true, null);
        this.icon = rLottieDrawable;
        rLottieDrawable.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        rLottieDrawable.setAllowDecodeSingleFrame(true);
        rLottieDrawable.multiplySpeed(16.0f);
        backupImageView.setImageDrawable(rLottieDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40, 17));
        setMuted(false, false);
    }

    public void setMuted(boolean z, boolean z2) {
        int framesCount = z ? this.icon.getFramesCount() : 0;
        if (!z2) {
            this.icon.setCurrentFrame(framesCount);
            this.icon.setCustomEndFrame(framesCount);
        } else {
            this.icon.setCustomEndFrame(framesCount);
            this.icon.start();
        }
        updateFill(z, z2);
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
            this.background.setBackgroundColor(ColorUtils.blendARGB(-13522392, -14670806, f));
            this.layout.invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.mutedT, z ? 1.0f : 0.0f);
        this.animator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                MuteButton.this.lambda$updateFill$0(valueAnimator2);
            }
        });
        this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.animator.setDuration(200L);
        this.animator.start();
    }

    public void lambda$updateFill$0(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.mutedT = floatValue;
        this.background.setBackgroundColor(ColorUtils.blendARGB(-13522392, -14670806, floatValue));
        this.layout.invalidate();
    }
}
