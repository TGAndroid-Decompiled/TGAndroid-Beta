package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;

public class MuteButton extends FrameLayout {
    private ValueAnimator animator;
    private final StrokeDrawable background;
    private final ImageView image;
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
        ImageView imageView = new ImageView(context);
        this.image = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, LayoutHelper.createFrame(40, 40, 17));
        setMuted(false, false);
    }

    public void setMuted(boolean z, boolean z2) {
        if (!z2) {
            AndroidUtilities.updateImageViewImageAnimated(this.image, z ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        } else {
            this.image.setImageResource(z ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
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
            this.image.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -2960428, this.mutedT), PorterDuff.Mode.SRC_IN));
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
        this.image.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -2960428, this.mutedT), PorterDuff.Mode.SRC_IN));
        this.layout.invalidate();
    }
}
