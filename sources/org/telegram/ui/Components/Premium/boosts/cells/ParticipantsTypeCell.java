package org.telegram.ui.Components.Premium.boosts.cells;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$TL_help_country;
import org.telegram.ui.ActionBar.Theme;

@SuppressLint({"ViewConstructor"})
public class ParticipantsTypeCell extends BaseCell {
    public static int TYPE_ALL = 0;
    public static int TYPE_NEW = 1;
    private int selectedType;

    @Override
    protected boolean needCheck() {
        return true;
    }

    public ParticipantsTypeCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.imageView.setVisibility(8);
    }

    public int getSelectedType() {
        return this.selectedType;
    }

    public void setType(int i, boolean z, boolean z2, List<TLRPC$TL_help_country> list, TLRPC$Chat tLRPC$Chat) {
        this.selectedType = i;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat);
        if (i == TYPE_ALL) {
            this.titleTextView.setText(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingAllSubscribers : R.string.BoostingAllMembers, new Object[0]));
        } else if (i == TYPE_NEW) {
            this.titleTextView.setText(LocaleController.formatString(isChannelAndNotMegaGroup ? R.string.BoostingNewSubscribers : R.string.BoostingNewMembers, new Object[0]));
        }
        this.radioButton.setChecked(z, false);
        setDivider(z2);
        this.subtitleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlue2, this.resourcesProvider));
        if (list.size() == 0) {
            setSubtitle(withArrow(LocaleController.getString("BoostingFromAllCountries", R.string.BoostingFromAllCountries)));
            return;
        }
        if (list.size() <= 3) {
            if (list.size() == 1) {
                setSubtitle(withArrow(LocaleController.formatString("BoostingFromAllCountries1", R.string.BoostingFromAllCountries1, list.get(0).default_name)));
                return;
            } else if (list.size() == 2) {
                setSubtitle(withArrow(LocaleController.formatString("BoostingFromAllCountries2", R.string.BoostingFromAllCountries2, list.get(0).default_name, list.get(1).default_name)));
                return;
            } else {
                setSubtitle(withArrow(LocaleController.formatString("BoostingFromAllCountries3", R.string.BoostingFromAllCountries3, list.get(0).default_name, list.get(1).default_name, list.get(2).default_name)));
                return;
            }
        }
        setSubtitle(withArrow(LocaleController.formatPluralString("BoostingFromCountriesCount", list.size(), new Object[0])));
    }
}
