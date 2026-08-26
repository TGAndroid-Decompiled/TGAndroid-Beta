package org.telegram.ui.Stars;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;

public final class StarGiftSheet$$ExternalSyntheticLambda67 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog f$0;

    public StarGiftSheet$$ExternalSyntheticLambda67(AlertDialog alertDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = alertDialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.dismiss();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.MessageNotFound)).ignoreDetach().show();
                }
                break;
            default:
                this.f$0.dismiss();
                break;
        }
    }
}
