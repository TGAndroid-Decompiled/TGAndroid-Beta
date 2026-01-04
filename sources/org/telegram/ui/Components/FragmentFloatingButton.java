package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ActionBar.Theme;

public class FragmentFloatingButton extends FrameLayout implements FactorAnimator.Target {
    private final int ANIMATOR_ID_BUTTON_VISIBLE;
    private final int ANIMATOR_ID_PROGRESS_VISIBLE;
    private ArrayList additionalContentViews;
    private float additionalTranslationY;
    private final BoolAnimator animatorButtonVisible;
    private final BoolAnimator animatorProgressVisible;
    public final RLottieImageView imageView;
    private float internalTranslationY;
    private final boolean isSubButton;
    public final RadialProgressView progressView;
    private final Theme.ResourcesProvider resourcesProvider;

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
        setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_OVAL);
        setTranslationZ(AndroidUtilities.dpf2(z ? 0.5f : 1.0f));
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
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    setAnimatedVisibility((View) it.next(), f3);
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
            int iDp = AndroidUtilities.dp(36.0f);
            int i2 = Theme.key_actionBarDefault;
            setBackground(Theme.createSimpleSelectorCircleDrawable(iDp, Theme.getColor(i2, this.resourcesProvider), ColorUtils.compositeColors(Theme.getColor(Theme.key_listSelector), Theme.getColor(i2))));
            return;
        }
        RLottieImageView rLottieImageView2 = this.imageView;
        int i3 = Theme.key_chats_actionIcon;
        rLottieImageView2.setColorFilter(Theme.getColor(i3, this.resourcesProvider), PorterDuff.Mode.SRC_IN);
        this.progressView.setProgressColor(Theme.getColor(i3, this.resourcesProvider));
        setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(48.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButtonPressed, this.resourcesProvider)));
    }

    public static FrameLayout.LayoutParams createSubButtonLayoutParams() {
        return LayoutHelper.createFrame(36, 36.0f, (LocaleController.isRTL ? 3 : 5) | 80, 26.0f, 0.0f, 26.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams createDefaultLayoutParams() {
        return LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams createDefaultLayoutParamsBig() {
        return LayoutHelper.createFrame(56, 56.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    private void setAdditionalTranslationY(float f) {
        if (this.additionalTranslationY != f) {
            super.setTranslationY(this.internalTranslationY + f);
            this.additionalTranslationY = f;
        }
    }

    @Override
    public void setTranslationY(float f) {
        if (this.internalTranslationY != f) {
            super.setTranslationY(this.additionalTranslationY + f);
            this.internalTranslationY = f;
        }
    }

    @Override
    public float getTranslationY() {
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
