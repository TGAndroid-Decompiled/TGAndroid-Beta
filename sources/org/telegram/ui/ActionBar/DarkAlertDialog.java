package org.telegram.ui.ActionBar;

import android.content.Context;

public final class DarkAlertDialog extends AlertDialog {

    public final class Builder extends AlertDialog.Builder {
        public final int $r8$classId = 0;

        public Builder(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context, i, resourcesProvider);
        }

        @Override
        public AlertDialog createAlertDialog(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            switch (this.$r8$classId) {
                case 1:
                    return new AlertDialogDecor(context, i, resourcesProvider);
                default:
                    return super.createAlertDialog(context, i, resourcesProvider);
            }
        }

        public Builder(Context context) {
            super(new DarkAlertDialog(context, 0, null));
        }
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
