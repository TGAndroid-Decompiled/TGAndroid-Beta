package org.telegram.ui.Components.Premium.boosts.cells.selector;

import android.annotation.SuppressLint;
import android.content.Context;
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
@SuppressLint({"ViewConstructor"})
public class SelectorUserCell extends BaseCell {
    private TL_stories$TL_myBoost boost;
    private TLRPC$Chat chat;
    private final CheckBox2 checkBox;
    private final boolean[] isOnline;
    private TLRPC$User user;

    @Override
    protected boolean needCheck() {
        return true;
    }

    public SelectorUserCell(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context, resourcesProvider);
        this.isOnline = new boolean[1];
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.radioButton.setVisibility(8);
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        if (z) {
            checkBox2.setColor(Theme.key_checkbox, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
        } else {
            checkBox2.setColor(Theme.key_dialogRoundCheckBox, Theme.key_checkboxDisabled, Theme.key_dialogRoundCheckBoxCheck);
        }
        checkBox2.setDrawUnchecked(true);
        checkBox2.setDrawBackgroundAsArc(10);
        addView(checkBox2);
        checkBox2.setChecked(false, false);
        checkBox2.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
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
        if (this.checkBox.getVisibility() == 0) {
            this.checkBox.setChecked(z, z2);
        }
    }

    public void setCheckboxAlpha(float f, boolean z) {
        if (z) {
            if (Math.abs(this.checkBox.getAlpha() - f) > 0.1d) {
                this.checkBox.animate().cancel();
                this.checkBox.animate().alpha(f).start();
                return;
            }
            return;
        }
        this.checkBox.animate().cancel();
        this.checkBox.setAlpha(f);
    }

    public void setUser(TLRPC$User tLRPC$User) {
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
        this.checkBox.setAlpha(1.0f);
    }

    public void setChat(TLRPC$Chat tLRPC$Chat, int i) {
        String string;
        this.chat = tLRPC$Chat;
        this.user = null;
        this.avatarDrawable.setInfo(tLRPC$Chat);
        this.imageView.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(tLRPC$Chat) ? 12.0f : 20.0f));
        this.imageView.setForUserOrChat(tLRPC$Chat, this.avatarDrawable);
        this.titleTextView.setText(tLRPC$Chat.title);
        if (i <= 0) {
            i = tLRPC$Chat.participants_count;
        }
        if (i >= 1) {
            string = LocaleController.formatPluralString("Subscribers", i, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.DiscussChannel);
        }
        setSubtitle(string);
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        setCheckboxAlpha(i > 200 ? 0.3f : 1.0f, false);
    }

    public void setBoost(TL_stories$TL_myBoost tL_stories$TL_myBoost) {
        this.boost = tL_stories$TL_myBoost;
        TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_stories$TL_myBoost.peer)));
        this.chat = chat;
        this.avatarDrawable.setInfo(chat);
        this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
        this.imageView.setForUserOrChat(this.chat, this.avatarDrawable);
        this.titleTextView.setText(this.chat.title);
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        setSubtitle(LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.getInstance().formatterBoostExpired.format(new Date(tL_stories$TL_myBoost.expires * 1000))));
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
        setSubtitle(LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.getInstance().formatterBoostExpired.format(new Date(this.boost.expires * 1000))));
        if (this.titleTextView.getAlpha() < 1.0f) {
            this.titleTextView.animate().alpha(1.0f).start();
            this.subtitleTextView.animate().alpha(1.0f).start();
            setCheckboxAlpha(1.0f, true);
            return;
        }
        this.titleTextView.setAlpha(1.0f);
        this.subtitleTextView.setAlpha(1.0f);
        setCheckboxAlpha(1.0f, false);
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
}
