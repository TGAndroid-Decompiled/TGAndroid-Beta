package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;

public class FragmentFloatingButton extends FrameLayout implements FactorAnimator.Target {
    private final int ANIMATOR_ID_BUTTON_VISIBLE;
    private final int ANIMATOR_ID_PROGRESS_VISIBLE;
    private ArrayList additionalContentViews;
    private float additionalTranslationY;
    private final BoolAnimator animatorButtonVisible;
    private final BoolAnimator animatorProgressVisible;
    private BlurredBackgroundDrawable iBlur3Background;
    private BlurredBackgroundColorProviderThemed iBlur3ColorProviderTabs;
    private BlurredBackgroundSourceColor iBlur3SourceColor;
    public final RLottieImageView imageView;
    private float internalTranslationY;
    private final boolean isSubButton;
    public final RadialProgressView progressView;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean setTranslationInternal;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public FragmentFloatingButton(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, resourcesProvider, false);
    }

    public FragmentFloatingButton(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.ANIMATOR_ID_BUTTON_VISIBLE = 0;
        this.ANIMATOR_ID_PROGRESS_VISIBLE = 1;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorButtonVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, true);
        this.animatorProgressVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 380L);
        this.resourcesProvider = resourcesProvider;
        this.isSubButton = z;
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(rLottieImageView, LayoutHelper.createFrame(-1, -1.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, LayoutHelper.createFrame(-1, -1.0f));
        setAnimatedVisibility(radialProgressView, 0.0f);
        ScaleStateListAnimator.apply(this);
        if (!z) {
            setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_OVAL);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z) {
            this.iBlur3ColorProviderTabs = new BlurredBackgroundColorProviderThemed(null, Theme.key_dialogBackground) {
                @Override
                public int getStrokeColorTop() {
                    return isDark() ? 117440511 : 285212672;
                }

                @Override
                public int getStrokeColorBottom() {
                    return isDark() ? 301989887 : 536870912;
                }

                @Override
                public int getShadowColor() {
                    return isDark() ? 83886079 : 536870912;
                }
            };
            BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
            this.iBlur3SourceColor = blurredBackgroundSourceColor;
            BlurredBackgroundDrawable blurredBackgroundDrawableCreateDrawable = blurredBackgroundSourceColor.createDrawable();
            this.iBlur3Background = blurredBackgroundDrawableCreateDrawable;
            blurredBackgroundDrawableCreateDrawable.setColorProvider(this.iBlur3ColorProviderTabs);
            this.iBlur3Background.setStrokeWidth(AndroidUtilities.dpf2(0.4f), AndroidUtilities.dpf2(0.4f));
            this.iBlur3Background.setRadius(AndroidUtilities.dp(18.0f));
            this.iBlur3Background.setPadding(AndroidUtilities.dp(5.66f));
        }
        updateColors();
    }

    public void setProgressVisible(boolean z, boolean z2) {
        this.animatorProgressVisible.setValue(z, z2);
    }

    public void setButtonVisible(boolean z, boolean z2) {
        this.animatorButtonVisible.setValue(z, z2);
    }

    public boolean getButtonVisible() {
        return this.animatorButtonVisible.getValue();
    }

    public boolean getProgressVisible() {
        return this.animatorProgressVisible.getValue();
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        int i2 = 0;
        if (i == 0) {
            setAnimatedVisibility(this, f);
            setClickable(f >= 0.99f);
            setAdditionalTranslationY(AndroidUtilities.dp(this.isSubButton ? 64.0f : 40.0f) * (1.0f - f));
        } else if (i == 1) {
            setAnimatedVisibility(this.progressView, f);
            float f3 = 1.0f - f;
            setAnimatedVisibility(this.imageView, f3);
            ArrayList arrayList = this.additionalContentViews;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    setAnimatedVisibility((View) obj, f3);
                }
            }
        }
    }

    public void setAnimation(int i, int i2) {
        this.imageView.setAnimation(i, i2, i2);
    }

    public void setImageResource(int i) {
        this.imageView.setImageResource(i);
    }

    public void updateColors() {
        if (this.isSubButton) {
            RLottieImageView rLottieImageView = this.imageView;
            int i = Theme.key_actionBarDefaultIcon;
            rLottieImageView.setColorFilter(Theme.getColor(i, this.resourcesProvider), PorterDuff.Mode.SRC_IN);
            this.progressView.setProgressColor(Theme.getColor(i, this.resourcesProvider));
            this.iBlur3SourceColor.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            this.iBlur3ColorProviderTabs.updateColors();
            this.iBlur3Background.updateColors();
            invalidate();
            setBackground(Theme.createInsetRoundRectDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f)));
            return;
        }
        RLottieImageView rLottieImageView2 = this.imageView;
        int i2 = Theme.key_chats_actionIcon;
        rLottieImageView2.setColorFilter(Theme.getColor(i2, this.resourcesProvider), PorterDuff.Mode.SRC_IN);
        this.progressView.setProgressColor(Theme.getColor(i2, this.resourcesProvider));
        setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(48.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButtonPressed, this.resourcesProvider)));
    }

    public static FrameLayout.LayoutParams createSubButtonLayoutParams() {
        return LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams createDefaultLayoutParams() {
        return LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams createDefaultLayoutParamsBig() {
        return LayoutHelper.createFrame(56, 56.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    private void setAdditionalTranslationY(float f) {
        if (this.additionalTranslationY != f) {
            this.setTranslationInternal = true;
            super.setTranslationY(this.internalTranslationY + f);
            this.setTranslationInternal = false;
            this.additionalTranslationY = f;
        }
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.iBlur3Background;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.setBounds(0, 0, i, i2);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.iBlur3Background;
        if (blurredBackgroundDrawable != null) {
            blurredBackgroundDrawable.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override
    public void setTranslationY(float f) {
        if (this.internalTranslationY != f) {
            this.setTranslationInternal = true;
            super.setTranslationY(this.additionalTranslationY + f);
            this.setTranslationInternal = false;
            this.internalTranslationY = f;
        }
    }

    @Override
    public float getTranslationY() {
        if (this.setTranslationInternal) {
            return super.getTranslationY();
        }
        return this.internalTranslationY;
    }

    public void addAdditionalView(View view) {
        if (this.additionalContentViews == null) {
            this.additionalContentViews = new ArrayList();
        }
        this.additionalContentViews.add(view);
        setAnimatedVisibility(view, 1.0f - this.animatorProgressVisible.getFloatValue());
    }

    public static void setAnimatedVisibility(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
        view.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f));
        view.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f));
        view.setVisibility(f > 0.0f ? 0 : 8);
    }
}
