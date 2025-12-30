package org.telegram.ui.Components.glass;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;

public class GlassTabView extends FrameLayout implements FactorAnimator.Target {
    private int colorDefault;
    private int colorSelected;
    private final RLottieImageView imageView;
    private final BoolAnimator isSelectedAnimator;
    private Theme.ResourcesProvider resourcesProvider;
    private final TextView textView;

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public GlassTabView(Context context) {
        super(context);
        this.isSelectedAnimator = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 300L);
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
    }

    public void setSelected(boolean z, boolean z2) {
        this.isSelectedAnimator.setValue(z, z2);
    }

    @Override
    public boolean isSelected() {
        return this.isSelectedAnimator.getValue();
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        updateColors();
    }

    private void updateColors() {
        int iBlendARGB = ColorUtils.blendARGB(this.colorDefault, this.colorSelected, this.isSelectedAnimator.getFloatValue());
        this.imageView.setColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN));
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
        this.colorDefault = ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), 226);
        this.colorSelected = ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_messagePanelSend, this.resourcesProvider), 255);
        updateColors();
        invalidate();
    }

    public static GlassTabView createLottie(Context context, Theme.ResourcesProvider resourcesProvider, int i, int i2) {
        GlassTabView glassTabView = new GlassTabView(context);
        glassTabView.resourcesProvider = resourcesProvider;
        glassTabView.textView.setText(LocaleController.getString(i2));
        glassTabView.imageView.setAnimation(i, 44, 44);
        glassTabView.imageView.setLayoutParams(LayoutHelper.createFrame(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        glassTabView.colorDefault = ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider), 226);
        glassTabView.colorSelected = ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_chat_messagePanelSend, resourcesProvider), 255);
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
}
