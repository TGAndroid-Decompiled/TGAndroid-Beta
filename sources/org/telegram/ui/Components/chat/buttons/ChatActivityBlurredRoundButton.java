package org.telegram.ui.Components.chat.buttons;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;

public final class ChatActivityBlurredRoundButton extends FrameLayout implements FactorAnimator.Target {
    public final BoolAnimator animatorIsEnabled;
    public final BoolAnimator animatorLoadingVisibility;
    public BlurredBackgroundDrawable backgroundDrawable;
    public float buttonScaleY;
    public ImageView imageView;
    public CircularProgressDrawable loadingIndicatorDrawable;
    public ImageView loadingIndicatorView;
    public Theme.ResourcesProvider resourcesProvider;

    public ChatActivityBlurredRoundButton(Context context) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorLoadingVisibility = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, false);
        this.animatorIsEnabled = new BoolAnimator(1, this, cubicBezierInterpolator, 320L, true);
        this.buttonScaleY = 1.0f;
    }

    public static ChatActivityBlurredRoundButton create(Context context, Theme.ResourcesProvider resourcesProvider, ChatActivity.AnonymousClass14 anonymousClass14, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        int color = Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider);
        ChatActivityBlurredRoundButton chatActivityBlurredRoundButton = new ChatActivityBlurredRoundButton(context);
        chatActivityBlurredRoundButton.resourcesProvider = resourcesProvider;
        chatActivityBlurredRoundButton.setBlurredBackgroundDrawable(blurredBackgroundDrawableViewFactory.create(chatActivityBlurredRoundButton, anonymousClass14, false));
        chatActivityBlurredRoundButton.setIconColor(color);
        int iDp = AndroidUtilities.dp(22.0f);
        int iMultAlpha = Theme.multAlpha(0.15f, color);
        int iDp2 = AndroidUtilities.dp(6.0f);
        chatActivityBlurredRoundButton.setBackground(Theme.createInsetRoundRectDrawable(iDp, iMultAlpha, iDp2, iDp2, iDp2, iDp2));
        return chatActivityBlurredRoundButton;
    }

    public final void checkUi_IconViewVisibility() {
        float f = 1.0f - this.animatorLoadingVisibility.floatValue;
        float fLerp = AndroidUtilities.lerp(f / 2.0f, f, this.animatorIsEnabled.floatValue);
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setAlpha(fLerp);
            this.imageView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f));
            this.imageView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f) * this.buttonScaleY);
            this.imageView.setVisibility(f > 0.0f ? 0 : 8);
        }
    }

    public final void checkUi_LoadingViewVisibility() {
        float f = this.animatorLoadingVisibility.floatValue;
        float fLerp = AndroidUtilities.lerp(f / 2.0f, f, this.animatorIsEnabled.floatValue);
        ImageView imageView = this.loadingIndicatorView;
        if (imageView != null) {
            imageView.setAlpha(fLerp);
            this.loadingIndicatorView.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f));
            this.loadingIndicatorView.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f));
            int i = f > 0.0f ? 0 : 8;
            if (this.loadingIndicatorView.getVisibility() != i) {
                this.loadingIndicatorView.setVisibility(i);
                this.loadingIndicatorDrawable.start = -1L;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        this.backgroundDrawable.draw(canvas);
        super.draw(canvas);
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            checkUi_IconViewVisibility();
            checkUi_LoadingViewVisibility();
        }
        if (i == 1) {
            checkUi_IconViewVisibility();
            checkUi_LoadingViewVisibility();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.backgroundDrawable.setBounds(0, 0, i, i2);
    }

    public void setBlurredBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.backgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(6.0f));
        this.backgroundDrawable.setRadius(AndroidUtilities.dp(22.0f));
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.animatorIsEnabled.setValue(z, false);
    }

    public void setIcon(int i) {
        if (this.imageView == null) {
            if (i == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrame(48, 48, 17));
            checkUi_IconViewVisibility();
        }
        this.imageView.setImageResource(i);
    }

    public void setIconColor(int i) {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_IN));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIconPadding(int i) {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setPadding(0, i, 0, 0);
        }
    }

    public final void showLoading(boolean z, boolean z2) {
        if (this.loadingIndicatorView == null) {
            if (!z) {
                return;
            }
            CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            this.loadingIndicatorDrawable = circularProgressDrawable;
            circularProgressDrawable.angleOffset = 90.0f;
            ImageView imageView = new ImageView(getContext());
            this.loadingIndicatorView = imageView;
            imageView.setBackground(this.loadingIndicatorDrawable);
            this.loadingIndicatorView.setVisibility(8);
            addView(this.loadingIndicatorView, LayoutHelper.createFrame(46, 46, 17));
        }
        BoolAnimator boolAnimator = this.animatorLoadingVisibility;
        if (!boolAnimator.value && boolAnimator.floatValue == 0.0f) {
            this.loadingIndicatorDrawable.start = -1L;
        }
        boolAnimator.setValue(z, z2);
    }

    public final void updateColors$1() {
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.backgroundDrawable;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.updateColors();
            invalidate();
        }
        int i = Theme.key_glass_defaultIcon;
        int color = Theme.getColor(i, this.resourcesProvider);
        setIconColor(Theme.getColor(i, this.resourcesProvider));
        int iDp = AndroidUtilities.dp(22.0f);
        int iMultAlpha = Theme.multAlpha(0.15f, color);
        int iDp2 = AndroidUtilities.dp(6.0f);
        setBackground(Theme.createInsetRoundRectDrawable(iDp, iMultAlpha, iDp2, iDp2, iDp2, iDp2));
    }

    public final void setEnabled(boolean z, boolean z2) {
        super.setEnabled(z);
        this.animatorIsEnabled.setValue(z, z2);
    }

    public static ChatActivityBlurredRoundButton create(Context context, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundColorProvider blurredBackgroundColorProvider, Theme.ResourcesProvider resourcesProvider, int i, int i2) {
        int color = Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider);
        ChatActivityBlurredRoundButton chatActivityBlurredRoundButton = new ChatActivityBlurredRoundButton(context);
        chatActivityBlurredRoundButton.resourcesProvider = resourcesProvider;
        chatActivityBlurredRoundButton.setBlurredBackgroundDrawable(blurredBackgroundDrawableViewFactory.create(chatActivityBlurredRoundButton, blurredBackgroundColorProvider, false));
        if (chatActivityBlurredRoundButton.imageView != null) {
            chatActivityBlurredRoundButton.imageView.setImageResource(i);
        } else if (i != 0) {
            ImageView imageView = new ImageView(chatActivityBlurredRoundButton.getContext());
            chatActivityBlurredRoundButton.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            chatActivityBlurredRoundButton.addView(chatActivityBlurredRoundButton.imageView, LayoutHelper.createFrame(i2, i2, 17));
            chatActivityBlurredRoundButton.checkUi_IconViewVisibility();
            chatActivityBlurredRoundButton.imageView.setImageResource(i);
        }
        chatActivityBlurredRoundButton.setIconColor(color);
        int iDp = AndroidUtilities.dp(22.0f);
        int iMultAlpha = Theme.multAlpha(0.15f, color);
        int iDp2 = AndroidUtilities.dp(6.0f);
        chatActivityBlurredRoundButton.setBackground(Theme.createInsetRoundRectDrawable(iDp, iMultAlpha, iDp2, iDp2, iDp2, iDp2));
        return chatActivityBlurredRoundButton;
    }
}
