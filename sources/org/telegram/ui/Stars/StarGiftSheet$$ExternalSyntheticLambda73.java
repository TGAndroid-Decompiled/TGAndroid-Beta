package org.telegram.ui.Stars;

import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.LaunchActivity;

public final class StarGiftSheet$$ExternalSyntheticLambda73 implements Runnable {
    public final int $r8$classId;
    public final AlertDialog f$0;

    public StarGiftSheet$$ExternalSyntheticLambda73(AlertDialog alertDialog, int i) {
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
                    Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(safeLastFragment).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
                    bulletinCreateSimpleBulletinWithIconSize.ignoreDetach = true;
                    bulletinCreateSimpleBulletinWithIconSize.show();
                }
                break;
            case 1:
                try {
                    this.f$0.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 2:
                this.f$0.dismiss();
                break;
            default:
                this.f$0.dismiss();
                break;
        }
    }
}
