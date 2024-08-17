package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.tl.TL_stories$TL_myBoost;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.cells.BaseCell;
import org.telegram.ui.Components.StatusBadgeComponent;

@SuppressLint({"ViewConstructor"})
public class SelectorUserCell extends BaseCell {
    private TL_stories$TL_myBoost boost;
    private TLRPC$Chat chat;
    private final CheckBox2 checkBox;
    private final boolean[] isOnline;
    private final ImageView optionsView;
    StatusBadgeComponent statusBadgeComponent;
    private TLRPC$User user;

    public SelectorUserCell(Context context, boolean z, Theme.ResourcesProvider resourcesProvider, boolean z2) {
        super(context, resourcesProvider);
        this.isOnline = new boolean[1];
        this.statusBadgeComponent = new StatusBadgeComponent(this);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.radioButton.setVisibility(8);
        if (z) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            if (z2) {
                checkBox2.setColor(Theme.key_checkbox, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
            } else {
                checkBox2.setColor(Theme.key_dialogRoundCheckBox, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
            }
            checkBox2.setDrawUnchecked(true);
            checkBox2.setDrawBackgroundAsArc(10);
            addView(checkBox2);
            checkBox2.setChecked(false, false);
            checkBox2.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            updateLayouts();
        } else {
            this.checkBox = null;
        }
        ImageView imageView = new ImageView(context);
        this.optionsView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_inMenu, resourcesProvider), PorterDuff.Mode.SRC_IN));
        addView(imageView, LayoutHelper.createFrame(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
    }

    public void setOptions(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            this.optionsView.setVisibility(0);
            this.optionsView.setOnClickListener(onClickListener);
        } else {
            this.optionsView.setVisibility(8);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.statusBadgeComponent.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.statusBadgeComponent.onDetachedFromWindow();
    }

    public TLRPC$User getUser() {
        return this.user;
    }

    public TLRPC$Chat getChat() {
        return this.chat;
    }

    public TL_stories$TL_myBoost getBoost() {
        return this.boost;
    }

    @Override
    public void setChecked(boolean z, boolean z2) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null && checkBox2.getVisibility() == 0) {
            this.checkBox.setChecked(z, z2);
        }
    }

    public void setCheckboxAlpha(float f, boolean z) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null) {
            return;
        }
        if (!z) {
            checkBox2.animate().cancel();
            this.checkBox.setAlpha(f);
        } else if (Math.abs(checkBox2.getAlpha() - f) > 0.1d) {
            this.checkBox.animate().cancel();
            this.checkBox.animate().alpha(f).start();
        }
    }

    public void setUser(TLRPC$User tLRPC$User) {
        this.optionsView.setVisibility(8);
        this.user = tLRPC$User;
        this.chat = null;
        this.avatarDrawable.setInfo(tLRPC$User);
        this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        this.imageView.setForUserOrChat(tLRPC$User, this.avatarDrawable);
        this.titleTextView.setText(UserObject.getUserName(tLRPC$User));
        boolean[] zArr = this.isOnline;
        zArr[0] = false;
        setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, tLRPC$User, zArr));
        this.subtitleTextView.setTextColor(Theme.getColor(this.isOnline[0] ? Theme.key_dialogTextBlue2 : Theme.key_dialogTextGray3, this.resourcesProvider));
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.setAlpha(1.0f);
        }
        this.titleTextView.setRightDrawable(this.statusBadgeComponent.updateDrawable(tLRPC$User, Theme.getColor(Theme.key_chats_verifiedBackground), false));
    }

    public void setChat(TLRPC$Chat tLRPC$Chat, int i) {
        String string;
        this.optionsView.setVisibility(8);
        this.chat = tLRPC$Chat;
        this.user = null;
        this.avatarDrawable.setInfo(tLRPC$Chat);
        this.imageView.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(tLRPC$Chat) ? 12.0f : 20.0f));
        this.imageView.setForUserOrChat(tLRPC$Chat, this.avatarDrawable);
        this.titleTextView.setText(tLRPC$Chat.title);
        if (i <= 0) {
            i = tLRPC$Chat.participants_count;
        }
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat);
        if (i >= 1) {
            string = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i, new Object[0]);
        } else {
            string = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
        }
        setSubtitle(string);
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        setCheckboxAlpha(i > 200 ? 0.3f : 1.0f, false);
    }

    public void setBoost(TL_stories$TL_myBoost tL_stories$TL_myBoost) {
        this.optionsView.setVisibility(8);
        this.boost = tL_stories$TL_myBoost;
        TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_stories$TL_myBoost.peer)));
        this.chat = chat;
        this.avatarDrawable.setInfo(chat);
        this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        this.imageView.setForUserOrChat(this.chat, this.avatarDrawable);
        this.titleTextView.setText(this.chat.title);
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        setSubtitle(LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_stories$TL_myBoost.expires * 1000))));
        int i = tL_stories$TL_myBoost.cooldown_until_date;
        if (i > 0) {
            setSubtitle(LocaleController.formatString("BoostingAvailableIn", R.string.BoostingAvailableIn, buildCountDownTime((i * 1000) - System.currentTimeMillis())));
            this.titleTextView.setAlpha(0.65f);
            this.subtitleTextView.setAlpha(0.65f);
            setCheckboxAlpha(0.3f, false);
            return;
        }
        this.titleTextView.setAlpha(1.0f);
        this.subtitleTextView.setAlpha(1.0f);
        setCheckboxAlpha(1.0f, false);
    }

    public void updateTimer() {
        int i = this.boost.cooldown_until_date;
        if (i > 0) {
            setSubtitle(LocaleController.formatString("BoostingAvailableIn", R.string.BoostingAvailableIn, buildCountDownTime((i * 1000) - System.currentTimeMillis())));
            this.titleTextView.setAlpha(0.65f);
            this.subtitleTextView.setAlpha(0.65f);
            setCheckboxAlpha(0.3f, false);
            return;
        }
        setSubtitle(LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(this.boost.expires * 1000))));
        if (this.titleTextView.getAlpha() < 1.0f) {
            this.titleTextView.animate().alpha(1.0f).start();
            this.subtitleTextView.animate().alpha(1.0f).start();
            setCheckboxAlpha(1.0f, true);
        } else {
            this.titleTextView.setAlpha(1.0f);
            this.subtitleTextView.setAlpha(1.0f);
            setCheckboxAlpha(1.0f, false);
        }
    }

    private String buildCountDownTime(long j) {
        long j2 = j / 3600000;
        long j3 = j % 3600000;
        long j4 = j3 / 60000;
        long j5 = (j3 % 60000) / 1000;
        StringBuilder sb = new StringBuilder();
        if (j2 > 0) {
            sb.append(String.format("%02d", Long.valueOf(j2)));
            sb.append(":");
        }
        sb.append(String.format("%02d", Long.valueOf(j4)));
        sb.append(":");
        sb.append(String.format("%02d", Long.valueOf(j5)));
        return sb.toString();
    }

    @Override
    protected boolean needCheck() {
        return this.checkBox != null;
    }
}
