package org.telegram.ui.Components.Premium.boosts.cells;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public final class BoostTypeSingleCell extends BoostTypeCell {
    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        UserCell2.AnonymousClass1 anonymousClass1 = this.titleTextView;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        if (z) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            avatarDrawable.setAvatarType(26);
            anonymousClass1.setText(LocaleController.formatPluralStringComma("BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            anonymousClass1.setText(LocaleController.getString(R.string.BoostingPreparedGiveawayOne));
            avatarDrawable.setAvatarType(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i = tL_prepaidGiveaway.months;
            if (i == 12) {
                avatarDrawable.setColor(-31392, -2796986);
            } else if (i == 6) {
                avatarDrawable.setColor(-10703110, -12481584);
            } else {
                avatarDrawable.setColor(-6631068, -11945404);
            }
            setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_prepaidGiveaway.months, new Object[0])));
        }
        BackupImageView backupImageView = this.imageView;
        backupImageView.setImageDrawable(avatarDrawable);
        backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    @Override
    public final void updateLayouts() {
        this.imageView.setLayoutParams(LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z = LocaleController.isRTL;
        this.titleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 69.0f, 0.0f, z ? 69.0f : 20.0f, 0.0f));
        boolean z2 = LocaleController.isRTL;
        this.subtitleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 69.0f, 0.0f, z2 ? 69.0f : 20.0f, 0.0f));
    }
}
