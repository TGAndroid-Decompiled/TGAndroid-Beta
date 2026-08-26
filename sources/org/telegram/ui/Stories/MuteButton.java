package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BoostsActivity;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.StrokeDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;

public final class MuteButton extends FrameLayout {
    public ValueAnimator animator;
    public boolean connected;
    public final View filledBackgroundView;
    public final ImageView image;
    public final FrameLayout layout;
    public final BoostsActivity.AnonymousClass3 loadingView;
    public ValueAnimator loadingViewAnimator;
    public boolean muted;
    public float mutedT;

    public MuteButton(Context context, BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed) {
        super(context);
        ScaleStateListAnimator.apply(this, 0.1f, 1.5f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.layout = frameLayout;
        StrokeDrawable strokeDrawable = new StrokeDrawable();
        strokeDrawable.colorProvider = blurredBackgroundColorProviderThemed;
        Paint paint = strokeDrawable.paintStrokeTop;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = strokeDrawable.paintStrokeBottom;
        paint2.setStyle(style);
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed2 = strokeDrawable.colorProvider;
        if (blurredBackgroundColorProviderThemed2 != null) {
            strokeDrawable.strokeColorTop = Theme.multAlpha(strokeDrawable.alpha, blurredBackgroundColorProviderThemed2.getStrokeColorTop());
            strokeDrawable.strokeColorBottom = Theme.multAlpha(strokeDrawable.alpha, strokeDrawable.colorProvider.getStrokeColorBottom());
            paint.setColor(strokeDrawable.strokeColorTop);
            paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            paint2.setColor(strokeDrawable.strokeColorBottom);
            paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
        }
        strokeDrawable.paintFill.setColor(-14670806);
        strokeDrawable.invalidateSelf();
        strokeDrawable.padding = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(strokeDrawable);
        addView(frameLayout, LayoutHelper.createFrame(40, 40, 17));
        View view = new View(context);
        this.filledBackgroundView = view;
        view.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, LayoutHelper.createFrame(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        BoostsActivity.AnonymousClass3 anonymousClass3 = new BoostsActivity.AnonymousClass3(context);
        this.loadingView = anonymousClass3;
        addView(anonymousClass3, LayoutHelper.createFrame(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.image = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, LayoutHelper.createFrame(40, 40, 17));
        setMuted(false, false);
    }

    public final void setConnected(boolean z, boolean z2) {
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
        BoostsActivity.AnonymousClass3 anonymousClass3 = this.loadingView;
        if (z2) {
            anonymousClass3.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(anonymousClass3.getAlpha(), z ? 0.0f : 1.0f);
            this.loadingViewAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new MuteButton$$ExternalSyntheticLambda0(this, 0));
            this.loadingViewAnimator.setDuration(320L);
            this.loadingViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.loadingViewAnimator.start();
        } else {
            anonymousClass3.setAlpha(z ? 0.0f : 1.0f);
            anonymousClass3.setVisibility(z ? 8 : 0);
        }
        if (!this.muted && z) {
            z3 = false;
        }
        updateFill(z3, z2);
    }

    public final void setMuted(boolean z, boolean z2) {
        this.muted = z;
        ImageView imageView = this.image;
        if (z2) {
            imageView.setImageResource(z ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        } else {
            AndroidUtilities.updateImageViewImageAnimated(imageView, z ? R.drawable.msg_voice_muted : R.drawable.msg_voice_unmuted);
        }
        updateFill(z || !this.connected, z2);
    }

    public final void updateFill(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mutedT, z ? 1.0f : 0.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new MuteButton$$ExternalSyntheticLambda0(this, 1));
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.animator.setDuration(420L);
            this.animator.start();
            return;
        }
        float f = z ? 1.0f : 0.0f;
        this.mutedT = f;
        View view = this.filledBackgroundView;
        view.setAlpha(1.0f - f);
        view.setScaleX(1.0f - this.mutedT);
        view.setScaleY(1.0f - this.mutedT);
        this.image.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(this.mutedT, -1, -2960428), PorterDuff.Mode.SRC_IN));
        this.layout.invalidate();
    }
}
