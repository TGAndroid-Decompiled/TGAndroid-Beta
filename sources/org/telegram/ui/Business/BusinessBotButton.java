package org.telegram.ui.Business;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ClickableAnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda2;

public final class BusinessBotButton extends FrameLayout {
    public final AvatarDrawable avatarDrawable;
    public final BackupImageView avatarView;
    public long botId;
    public final int currentAccount;
    public long dialogId;
    public int flags;
    public float leftMargin;
    public String manageUrl;
    public final ImageView menuView;
    public final ClickableAnimatedTextView pauseButton;
    public boolean paused;
    public final AnimatedTextView subtitleView;
    public final LinearLayout textLayout;
    public final AnimatedTextView titleView;

    public BusinessBotButton(Context context, ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = chatActivity.getCurrentAccount();
        this.paused = false;
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarView = backupImageView;
        TLRPC.User user = chatActivity.getMessagesController().getUser(Long.valueOf(this.botId));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.setInfo(user);
        backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
        backupImageView.setForUserOrChat(user, avatarDrawable);
        addView(backupImageView, LayoutHelper.createFrame(32, 32.0f, 19, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.textLayout = linearLayout;
        linearLayout.setOrientation(1);
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.titleView = animatedTextView;
        animatedTextView.adaptWidth = false;
        animatedTextView.getDrawable().setHacks(true, true, false);
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView.setText(UserObject.getUserName(user));
        animatedTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        animatedTextView.setEllipsizeByGradient(true);
        linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-1, 17, 0.0f, 0.0f, 0.0f, 1.0f));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
        this.subtitleView = animatedTextView2;
        animatedTextView2.adaptWidth = false;
        animatedTextView2.getDrawable().setHacks(true, true, false);
        animatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextView2.setText(LocaleController.getString(R.string.BizBotStatusManages));
        animatedTextView2.setTextColor(Theme.getColor(Theme.key_chat_topPanelMessage, resourcesProvider));
        animatedTextView2.setEllipsizeByGradient(true);
        linearLayout.addView(animatedTextView2, LayoutHelper.createLinear(-1, 17));
        addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 16, 52.0f, 0.0f, 49.0f, 0.0f));
        ClickableAnimatedTextView clickableAnimatedTextView = new ClickableAnimatedTextView(context);
        this.pauseButton = clickableAnimatedTextView;
        clickableAnimatedTextView.getDrawable().setHacks(true, true, true);
        clickableAnimatedTextView.setAnimationProperties(0.75f, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        clickableAnimatedTextView.setScaleProperty(0.6f);
        clickableAnimatedTextView.setTypeface(AndroidUtilities.bold());
        int iDp = AndroidUtilities.dp(14.0f);
        int i = Theme.key_featuredStickers_addButton;
        int color = Theme.getColor(i, resourcesProvider);
        int iBlendOver = Theme.blendOver(Theme.getColor(i, resourcesProvider), Theme.multAlpha(0.12f, -1));
        clickableAnimatedTextView.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, iBlendOver, iBlendOver));
        clickableAnimatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        clickableAnimatedTextView.setGravity(5);
        clickableAnimatedTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        clickableAnimatedTextView.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
        clickableAnimatedTextView.setOnClickListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, 6));
        clickableAnimatedTextView.setOnWidthUpdatedListener(new BusinessBotButton$$ExternalSyntheticLambda1(this, 0));
        clickableAnimatedTextView.setText(LocaleController.getString(this.paused ? R.string.BizBotStart : R.string.BizBotStop));
        addView(clickableAnimatedTextView, LayoutHelper.createFrame(64, 28.0f, 21, 0.0f, 0.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.menuView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_mini_customize);
        imageView.setBackground(Theme.createCircleSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 0, 0));
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_topPanelClose, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(this, chatActivity, resourcesProvider, 1));
        addView(imageView, LayoutHelper.createFrame(32, 32.0f, 21, 8.0f, 0.0f, 6.0f, 0.0f));
    }

    public void setLeftMargin(float f) {
        this.leftMargin = f;
        this.avatarView.setTranslationX(f);
        this.textLayout.setTranslationX(f);
        updateTextRightPadding();
    }

    public final void updateTextRightPadding() {
        float f = this.leftMargin;
        ClickableAnimatedTextView clickableAnimatedTextView = this.pauseButton;
        float currentWidth = clickableAnimatedTextView.getDrawable().getCurrentWidth() + f + clickableAnimatedTextView.getPaddingLeft() + clickableAnimatedTextView.getPaddingRight() + AndroidUtilities.dp(12.0f);
        this.titleView.setRightPadding(currentWidth);
        this.subtitleView.setRightPadding(currentWidth);
    }
}
