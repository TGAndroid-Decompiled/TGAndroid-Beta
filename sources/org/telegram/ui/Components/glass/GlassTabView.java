package org.telegram.ui.Components.glass;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;

public class GlassTabView extends FrameLayout implements FactorAnimator.Target {
    private static final RectF tmpRectF = new RectF();
    private int colorDefault;
    private int colorSelected;
    private final AnimatedTextView.AnimatedTextDrawable counter;
    private float gestureSelectedOverride;
    private boolean hasGestureSelectedOverride;
    private Drawable iconFilled;
    private Drawable iconOutline;
    private final RLottieImageView imageView;
    private final BoolAnimator isHasCounterAnimator;
    private final BoolAnimator isHasCounterErrorAnimator;
    private final BoolAnimator isSelectedAnimator;
    private int lastAnimation;
    private final Paint paintCounterBackground;
    private Theme.ResourcesProvider resourcesProvider;
    private TabAnimation tabAnimation;
    private final TextView textView;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public GlassTabView(Context context) {
        super(context);
        this.paintCounterBackground = new Paint(1);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.isSelectedAnimator = new BoolAnimator(0, this, cubicBezierInterpolator, 380L);
        this.isHasCounterAnimator = new BoolAnimator(1, this, cubicBezierInterpolator, 380L);
        this.isHasCounterErrorAnimator = new BoolAnimator(2, this, cubicBezierInterpolator, 380L);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        addView(rLottieImageView, LayoutHelper.createFrame(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextSize(1, 11.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 29.0f, 0.0f, 0.0f));
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.counter = animatedTextDrawable;
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setGravity(17);
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(10.0f));
    }

    public void setGestureSelectedOverride(float f, boolean z) {
        this.gestureSelectedOverride = f;
        this.hasGestureSelectedOverride = z;
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float floatValue = this.hasGestureSelectedOverride ? this.gestureSelectedOverride : this.isSelectedAnimator.getFloatValue();
        if (floatValue > 0.0f) {
            this.paintCounterBackground.setColor(Theme.multAlpha(this.colorSelected, AnimatorUtils.DECELERATE_INTERPOLATOR.getInterpolation(floatValue) * 0.09f));
            RectF rectF = tmpRectF;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float fLerp = AndroidUtilities.lerp(0.4f, 1.0f, floatValue);
            canvas.save();
            canvas.scale(fLerp, fLerp, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, fMin, fMin, this.paintCounterBackground);
            canvas.restore();
        }
        float floatValue2 = this.isHasCounterAnimator.getFloatValue();
        boolean z = floatValue2 > 0.0f;
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (this.iconFilled != null && this.iconOutline != null) {
            int floatValue3 = (int) ((1.0f - this.isSelectedAnimator.getFloatValue()) * 255.0f);
            int floatValue4 = (int) (this.isSelectedAnimator.getFloatValue() * 255.0f);
            if (floatValue3 > 0) {
                this.iconOutline.setAlpha(floatValue3);
                this.iconOutline.draw(canvas);
            }
            if (floatValue4 > 0) {
                this.iconFilled.setAlpha(floatValue4);
                this.iconFilled.draw(canvas);
            }
        }
        if (floatValue2 > 0.0f) {
            canvas.save();
            float fDpf2 = AndroidUtilities.dpf2(1.33f);
            float width = (getWidth() / 2.0f) + AndroidUtilities.dpf2(11.0f);
            float fDpf22 = AndroidUtilities.dpf2(10.0f);
            float fDpf23 = AndroidUtilities.dpf2(16.0f);
            float fMax = Math.max(fDpf23, this.counter.getCurrentWidth() + AndroidUtilities.dp(8.0f));
            float fDpf24 = AndroidUtilities.dpf2(9.333f);
            float fDpf25 = AndroidUtilities.dpf2(8.0f);
            RectF rectF2 = tmpRectF;
            float f = fMax / 2.0f;
            float f2 = fDpf23 / 2.0f;
            rectF2.set((width - f) - fDpf2, (fDpf22 - f2) - fDpf2, f + width + fDpf2, f2 + fDpf22 + fDpf2);
            canvas.scale(floatValue2, floatValue2, width, fDpf22);
            canvas.drawRoundRect(rectF2, fDpf24, fDpf24, Theme.PAINT_CLEAR);
            rectF2.inset(fDpf2, fDpf2);
            this.paintCounterBackground.setColor(ColorUtils.blendARGB(this.colorSelected, Theme.getColor(Theme.key_fill_RedNormal), this.isHasCounterErrorAnimator.getFloatValue()));
            canvas.drawRoundRect(rectF2, fDpf25, fDpf25, this.paintCounterBackground);
            this.counter.setBounds(rectF2);
            this.counter.draw(canvas);
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
    }

    public void setCounter(String str, boolean z, boolean z2) {
        this.counter.setText(str, z2);
        this.isHasCounterAnimator.setValue(!TextUtils.isEmpty(str), z2);
        this.isHasCounterErrorAnimator.setValue(z, z2);
    }

    public void setSelected(boolean z, boolean z2) {
        this.isSelectedAnimator.setValue(z, z2);
        checkPlayAnimation(z2);
    }

    @Override
    public boolean isSelected() {
        return this.isSelectedAnimator.getValue();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = (getWidth() / 2) - AndroidUtilities.dp(12.0f);
        int iDp = AndroidUtilities.dp(24.0f) + width;
        int iDp2 = AndroidUtilities.dp(4.0f);
        int iDp3 = AndroidUtilities.dp(28.0f);
        Drawable drawable = this.iconFilled;
        if (drawable != null) {
            drawable.setBounds(width, iDp2, iDp, iDp3);
        }
        Drawable drawable2 = this.iconOutline;
        if (drawable2 != null) {
            drawable2.setBounds(width, iDp2, iDp, iDp3);
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            updateColors();
        }
        invalidate();
    }

    private void updateColors() {
        int iBlendARGB = ColorUtils.blendARGB(this.colorDefault, this.colorSelected, this.isSelectedAnimator.getFloatValue());
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN);
        this.imageView.setColorFilter(porterDuffColorFilter);
        Drawable drawable = this.iconFilled;
        if (drawable != null) {
            drawable.setColorFilter(porterDuffColorFilter);
        }
        Drawable drawable2 = this.iconOutline;
        if (drawable2 != null) {
            drawable2.setColorFilter(porterDuffColorFilter);
        }
        this.textView.setTextColor(iBlendARGB);
    }

    public void playAnimationOnce() {
        if (this.imageView.isPlaying() || this.imageView.getAnimatedDrawable() == null) {
            return;
        }
        this.imageView.getAnimatedDrawable().setCurrentFrame(0);
        this.imageView.playAnimation();
    }

    public static GlassTabView create(Context context, Theme.ResourcesProvider resourcesProvider, int i, int i2, final Runnable runnable) {
        GlassTabView glassTabView = new GlassTabView(context);
        glassTabView.textView.setText(LocaleController.getString(i2));
        glassTabView.imageView.setImageResource(i);
        glassTabView.imageView.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 6.0f, 0.0f, 0.0f));
        int i3 = Theme.key_glass_defaultIcon;
        glassTabView.colorDefault = ColorUtils.setAlphaComponent(Theme.getColor(i3, resourcesProvider), 153);
        glassTabView.colorSelected = ColorUtils.setAlphaComponent(Theme.getColor(i3, resourcesProvider), 255);
        glassTabView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                runnable.run();
            }
        });
        glassTabView.updateColors();
        ScaleStateListAnimator.apply(glassTabView);
        return glassTabView;
    }

    public void updateColorsLottie() {
        this.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, this.resourcesProvider);
        this.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, this.resourcesProvider);
        updateColors();
        invalidate();
    }

    private void checkPlayAnimation(boolean z) {
        if (this.tabAnimation == null) {
            return;
        }
        int i = this.isSelectedAnimator.getValue() ? this.tabAnimation.fromOutlineToFilled : this.tabAnimation.fromFilledToOutline;
        if (this.lastAnimation != i) {
            this.lastAnimation = i;
            this.imageView.setAnimation(i, 24, 24);
            if (z) {
                this.imageView.getAnimatedDrawable().setCurrentFrame(0);
                this.imageView.playAnimation();
                return;
            } else {
                this.imageView.getAnimatedDrawable().setProgress(0.99f);
                return;
            }
        }
        if (!z || this.imageView.isPlaying()) {
            return;
        }
        this.imageView.getAnimatedDrawable().setCurrentFrame(0);
        this.imageView.playAnimation();
    }

    public static GlassTabView createMainTab(Context context, Theme.ResourcesProvider resourcesProvider, TabAnimation tabAnimation, int i) {
        GlassTabView glassTabView = new GlassTabView(context);
        glassTabView.resourcesProvider = resourcesProvider;
        glassTabView.tabAnimation = tabAnimation;
        glassTabView.textView.setText(LocaleController.getString(i));
        glassTabView.checkPlayAnimation(false);
        glassTabView.imageView.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
        glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
        glassTabView.updateColors();
        return glassTabView;
    }

    public static GlassTabView createAvatar(Context context, Theme.ResourcesProvider resourcesProvider, int i, int i2) {
        GlassTabView glassTabView = new GlassTabView(context);
        glassTabView.textView.setText(LocaleController.getString(i2));
        glassTabView.imageView.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(UserConfig.getInstance(i).getClientUserId()));
        AvatarDrawable avatarDrawable = new AvatarDrawable(user);
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setForUserOrChat(user, avatarDrawable);
        backupImageView.setRoundRadius(AndroidUtilities.dp(11.0f));
        glassTabView.addView(backupImageView, LayoutHelper.createFrame(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        glassTabView.colorDefault = ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), 226);
        glassTabView.colorSelected = ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider), 255);
        glassTabView.updateColors();
        return glassTabView;
    }

    public enum TabAnimation {
        CONTACTS(R.raw.tab_contacts, R.raw.tab_contacts_reverse),
        CALLS(R.raw.tab_calls, R.raw.tab_calls_reverse),
        CHATS(R.raw.tab_chats, R.raw.tab_chats_reverse);

        public final int fromFilledToOutline;
        public final int fromOutlineToFilled;

        TabAnimation(int i, int i2) {
            this.fromOutlineToFilled = i;
            this.fromFilledToOutline = i2;
        }
    }
}
