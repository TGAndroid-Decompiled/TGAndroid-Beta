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
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;

public final class FragmentFloatingButton extends FrameLayout implements FactorAnimator.Target {
    public ArrayList additionalContentViews;
    public float additionalTranslationY;
    public final BoolAnimator animatorButtonVisible;
    public final BoolAnimator animatorProgressVisible;
    public final BlurredBackgroundDrawableSource iBlur3Background;
    public final AnonymousClass1 iBlur3ColorProviderTabs;
    public final BlurredBackgroundSourceColor iBlur3SourceColor;
    public final RLottieImageView imageView;
    public float internalTranslationY;
    public final boolean isSubButton;
    public final RadialProgressView progressView;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean setTranslationInternal;

    public final class AnonymousClass1 extends BlurredBackgroundColorProviderThemed {
        public final int $r8$classId;

        public AnonymousClass1(int i, Theme.ResourcesProvider resourcesProvider) {
            super(i, resourcesProvider);
            this.$r8$classId = 0;
        }

        @Override
        public int getShadowColor() {
            switch (this.$r8$classId) {
                case 0:
                    return isDark() ? 83886079 : 536870912;
                default:
                    return super.getShadowColor();
            }
        }

        @Override
        public int getStrokeColorBottom() {
            switch (this.$r8$classId) {
                case 0:
                    return isDark() ? 301989887 : 536870912;
                default:
                    return super.getStrokeColorBottom();
            }
        }

        @Override
        public int getStrokeColorTop() {
            switch (this.$r8$classId) {
                case 0:
                    return isDark() ? 117440511 : 285212672;
                default:
                    return super.getStrokeColorTop();
            }
        }

        @Override
        public boolean isDark() {
            switch (this.$r8$classId) {
                case 1:
                    return true;
                case 2:
                    return true;
                default:
                    return super.isDark();
            }
        }

        public AnonymousClass1(Theme.ResourcesProvider resourcesProvider, int i, float f, int i2) {
            super(resourcesProvider, i, f);
            this.$r8$classId = i2;
        }
    }

    public FragmentFloatingButton(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, resourcesProvider, false);
    }

    public static FrameLayout.LayoutParams createDefaultLayoutParams() {
        return LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams createSubButtonLayoutParams() {
        return LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    private void setAdditionalTranslationY(float f) {
        if (this.additionalTranslationY != f) {
            this.setTranslationInternal = true;
            super.setTranslationY(this.internalTranslationY + f);
            this.setTranslationInternal = false;
            this.additionalTranslationY = f;
        }
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

    public final void addAdditionalView(View view) {
        if (this.additionalContentViews == null) {
            this.additionalContentViews = new ArrayList();
        }
        this.additionalContentViews.add(view);
        setAnimatedVisibility(view, 1.0f - this.animatorProgressVisible.floatValue);
    }

    @Override
    public final void draw(Canvas canvas) {
        BlurredBackgroundDrawableSource blurredBackgroundDrawableSource = this.iBlur3Background;
        if (blurredBackgroundDrawableSource != null) {
            blurredBackgroundDrawableSource.drawSource(canvas, blurredBackgroundDrawableSource.source);
        }
        super.draw(canvas);
    }

    public boolean getButtonVisible() {
        return this.animatorButtonVisible.value;
    }

    public boolean getProgressVisible() {
        return this.animatorProgressVisible.value;
    }

    @Override
    public float getTranslationY() {
        return this.setTranslationInternal ? super.getTranslationY() : this.internalTranslationY;
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        int i2 = 0;
        if (i == 0) {
            setAnimatedVisibility(this, f);
            setClickable(f >= 0.99f);
            setAdditionalTranslationY((1.0f - f) * AndroidUtilities.dp(this.isSubButton ? 64.0f : 40.0f));
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

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        BlurredBackgroundDrawableSource blurredBackgroundDrawableSource = this.iBlur3Background;
        if (blurredBackgroundDrawableSource != null) {
            blurredBackgroundDrawableSource.setBounds(0, 0, i, i2);
        }
    }

    public void setImageResource(int i) {
        this.imageView.setImageResource(i);
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

    public final void updateColors$1() {
        RadialProgressView radialProgressView = this.progressView;
        RLottieImageView rLottieImageView = this.imageView;
        boolean z = this.isSubButton;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (!z) {
            int i = Theme.key_chats_actionIcon;
            rLottieImageView.setColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(Theme.getColor(i, resourcesProvider));
            setBackground(Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(48.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider)));
            return;
        }
        int i2 = Theme.key_actionBarDefaultIcon;
        rLottieImageView.setColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(Theme.getColor(i2, resourcesProvider));
        this.iBlur3SourceColor.paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        this.iBlur3ColorProviderTabs.updateColors();
        this.iBlur3Background.updateColors();
        invalidate();
        int iDp = AndroidUtilities.dp(18.0f);
        int color = Theme.getColor(Theme.key_listSelector, resourcesProvider);
        int iDp2 = AndroidUtilities.dp(6.0f);
        setBackground(Theme.createInsetRoundRectDrawable(iDp, color, iDp2, iDp2, iDp2, iDp2));
    }

    public FragmentFloatingButton(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorButtonVisible = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, true);
        this.animatorProgressVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 380L, false);
        this.resourcesProvider = resourcesProvider;
        this.isSubButton = z;
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(rLottieImageView, LayoutHelper.createFrame(-1.0f, -1));
        Theme.ResourcesProvider resourcesProvider2 = null;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.progressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, LayoutHelper.createFrame(-1.0f, -1));
        setAnimatedVisibility(radialProgressView, 0.0f);
        ScaleStateListAnimator.apply(this, 0.1f, 1.5f);
        if (!z) {
            setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_OVAL);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(Theme.key_dialogBackground, resourcesProvider2);
            this.iBlur3ColorProviderTabs = anonymousClass1;
            BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
            this.iBlur3SourceColor = blurredBackgroundSourceColor;
            BlurredBackgroundDrawableSource blurredBackgroundDrawableSource = new BlurredBackgroundDrawableSource(blurredBackgroundSourceColor);
            this.iBlur3Background = blurredBackgroundDrawableSource;
            blurredBackgroundDrawableSource.setColorProvider(anonymousClass1);
            float fDpf2 = AndroidUtilities.dpf2(0.4f);
            float fDpf3 = AndroidUtilities.dpf2(0.4f);
            BlurredBackgroundDrawable.Props props = blurredBackgroundDrawableSource.boundProps;
            props.strokeWidthTop = fDpf2;
            props.strokeWidthBottom = fDpf3;
            blurredBackgroundDrawableSource.setRadius(AndroidUtilities.dp(18.0f));
            blurredBackgroundDrawableSource.setPadding(AndroidUtilities.dp(5.66f));
        }
        updateColors$1();
    }
}
