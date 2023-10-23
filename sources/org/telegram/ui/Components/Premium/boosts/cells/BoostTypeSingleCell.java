package org.telegram.ui.Components.Premium.boosts.cells;

import android.annotation.SuppressLint;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories$TL_prepaidGiveaway;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
@SuppressLint({"ViewConstructor"})
public class BoostTypeSingleCell extends BoostTypeCell {
    @Override
    protected boolean needCheck() {
        return false;
    }

    public BoostTypeSingleCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
    }

    public void setGiveaway(TL_stories$TL_prepaidGiveaway tL_stories$TL_prepaidGiveaway) {
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        this.avatarDrawable.setAvatarType(16);
        this.titleTextView.setText(LocaleController.formatString("BoostingPreparedGiveawayOne", R.string.BoostingPreparedGiveawayOne, new Object[0]));
        setSubtitle(LocaleController.formatString("BoostingPreparedGiveawaySubscriptions", R.string.BoostingPreparedGiveawaySubscriptions, Integer.valueOf(tL_stories$TL_prepaidGiveaway.quantity), LocaleController.formatPluralString("Months", tL_stories$TL_prepaidGiveaway.months, new Object[0])));
        int i = tL_stories$TL_prepaidGiveaway.months;
        if (i == 12) {
            this.avatarDrawable.setColor(-31392, -2796986);
        } else if (i == 6) {
            this.avatarDrawable.setColor(-10703110, -12481584);
        } else {
            this.avatarDrawable.setColor(-6631068, -11945404);
        }
        this.imageView.setImageDrawable(this.avatarDrawable);
        this.imageView.setRoundRadius(AndroidUtilities.dp(20.0f));
    }

    @Override
    protected void updateLayouts() {
        this.imageView.setLayoutParams(LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        SimpleTextView simpleTextView = this.titleTextView;
        boolean z = LocaleController.isRTL;
        simpleTextView.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 16, z ? 20.0f : 69.0f, 0.0f, z ? 69.0f : 20.0f, 0.0f));
        SimpleTextView simpleTextView2 = this.subtitleTextView;
        boolean z2 = LocaleController.isRTL;
        simpleTextView2.setLayoutParams(LayoutHelper.createFrame(-1, -2.0f, (z2 ? 5 : 3) | 16, z2 ? 20.0f : 69.0f, 0.0f, z2 ? 69.0f : 20.0f, 0.0f));
    }
}
