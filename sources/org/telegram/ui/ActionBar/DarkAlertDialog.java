package org.telegram.ui.ActionBar;

import android.content.Context;

public final class DarkAlertDialog extends AlertDialog {
    public DarkAlertDialog(Context context) {
        super(context, 0, null);
    }

    @Override
    public final int getThemedColor(int i) {
        if (i == Theme.key_dialogBackground) {
            return -14277082;
        }
        if (i == Theme.key_dialogTextBlack || i == Theme.key_dialogButton || i == Theme.key_dialogScrollGlow) {
            return -1;
        }
        return Theme.getColor(i, this.resourcesProvider);
    }
}
