package org.telegram.ui.Components.Premium.boosts.cells;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories$TL_prepaidGiveaway;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.LayoutHelper;

public class BoostTypeSingleCell extends BoostTypeCell {
    public BoostTypeSingleCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
    }

    @Override
    protected boolean needCheck() {
        return false;
    }

    public void setGiveaway(TL_stories$TL_prepaidGiveaway tL_stories$TL_prepaidGiveaway) {
        AvatarDrawable avatarDrawable;
        int i;
        int i2;
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        this.avatarDrawable.setAvatarType(16);
        this.titleTextView.setText(LocaleController.formatString("BoostingPreparedGiveawayOne", R.string.BoostingPreparedGiveawayOne, new Object[0]));
        setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", tL_stories$TL_prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_stories$TL_prepaidGiveaway.months, new Object[0])));
        int i3 = tL_stories$TL_prepaidGiveaway.months;
        if (i3 == 12) {
            avatarDrawable = this.avatarDrawable;
            i = -31392;
            i2 = -2796986;
        } else if (i3 == 6) {
            avatarDrawable = this.avatarDrawable;
            i = -10703110;
            i2 = -12481584;
        } else {
            avatarDrawable = this.avatarDrawable;
            i = -6631068;
            i2 = -11945404;
        }
        avatarDrawable.setColor(i, i2);
        this.imageView.setImageDrawable(this.avatarDrawable);
        this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    @Override
    public void updateLayouts() {
        this.imageView.setLayoutParams(LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        SimpleTextView simpleTextView = this.titleTextView;
        boolean z = LocaleController.isRTL;
        simpleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 69.0f, 0.0f, z ? 69.0f : 20.0f, 0.0f));
        SimpleTextView simpleTextView2 = this.subtitleTextView;
        boolean z2 = LocaleController.isRTL;
        simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 69.0f, 0.0f, z2 ? 69.0f : 20.0f, 0.0f));
    }
}
