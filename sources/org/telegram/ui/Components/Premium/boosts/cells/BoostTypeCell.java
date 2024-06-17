package org.telegram.ui.Components.Premium.boosts.cells;

import android.annotation.SuppressLint;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

@SuppressLint({"ViewConstructor"})
public class BoostTypeCell extends BaseCell {
    public static int TYPE_GIVEAWAY = 0;
    public static int TYPE_SPECIFIC_USERS = 1;
    private int selectedType;

    @Override
    protected boolean needCheck() {
        return true;
    }

    public BoostTypeCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
    }

    @Override
    public void updateLayouts() {
        this.imageView.setLayoutParams(LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        SimpleTextView simpleTextView = this.titleTextView;
        boolean z = LocaleController.isRTL;
        simpleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 109.0f, 0.0f, z ? 109.0f : 20.0f, 0.0f));
        SimpleTextView simpleTextView2 = this.subtitleTextView;
        boolean z2 = LocaleController.isRTL;
        simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 109.0f, 0.0f, z2 ? 109.0f : 20.0f, 0.0f));
        this.radioButton.setLayoutParams(LayoutHelper.createFrame(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.selectedType;
    }

    public void setType(int i, int i2, TLRPC$User tLRPC$User, boolean z) {
        this.selectedType = i;
        if (i == TYPE_GIVEAWAY) {
            this.titleTextView.setText(LocaleController.formatString("BoostingCreateGiveaway", R.string.BoostingCreateGiveaway, new Object[0]));
            setSubtitle(LocaleController.formatString("BoostingWinnersRandomly", R.string.BoostingWinnersRandomly, new Object[0]));
            this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
            this.avatarDrawable.setAvatarType(16);
            this.avatarDrawable.setColor(-15292942, -15630089);
            setDivider(true);
            setBackground(Theme.getThemedDrawableByKey(getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
        } else if (i == TYPE_SPECIFIC_USERS) {
            this.titleTextView.setText(LocaleController.formatString("BoostingAwardSpecificUsers", R.string.BoostingAwardSpecificUsers, new Object[0]));
            if (i2 == 1 && tLRPC$User != null) {
                setSubtitle(withArrow(Emoji.replaceEmoji(UserObject.getUserName(tLRPC$User), this.subtitleTextView.getPaint().getFontMetricsInt(), false)));
            } else if (i2 > 0) {
                setSubtitle(withArrow(LocaleController.formatPluralString("Recipient", i2, new Object[0])));
            } else {
                setSubtitle(withArrow(LocaleController.getString("BoostingSelectRecipients", R.string.BoostingSelectRecipients)));
            }
            this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, this.resourcesProvider));
            this.avatarDrawable.setAvatarType(6);
            this.avatarDrawable.setColor(-3905294, -6923014);
            setDivider(false);
            setBackground(Theme.getThemedDrawableByKey(getContext(), R.drawable.greydivider_top, Theme.key_windowBackgroundGrayShadow));
        }
        this.radioButton.setChecked(z, false);
        this.imageView.setImageDrawable(this.avatarDrawable);
        this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
    }
}
