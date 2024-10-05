package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.ui.ActionBar.AlertDialog;

public class DarkAlertDialog extends AlertDialog {

    public static class Builder extends AlertDialog.Builder {
        public Builder(Context context) {
            super(new DarkAlertDialog(context, 0));
        }
    }

    public DarkAlertDialog(Context context, int i) {
        super(context, i);
    }

    @Override
    public int getThemedColor(int i) {
        if (i == Theme.key_dialogBackground) {
            return -14277082;
        }
        if (i == Theme.key_dialogTextBlack || i == Theme.key_dialogButton || i == Theme.key_dialogScrollGlow) {
            return -1;
        }
        return super.getThemedColor(i);
    }
}
