package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
import org.telegram.ui.ActionBar.AlertDialog;

public final class LaunchActivity$$ExternalSyntheticLambda16 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final int f$0;
    public final HashMap f$1;
    public final boolean f$2;
    public final boolean f$3;

    public LaunchActivity$$ExternalSyntheticLambda16(int i, HashMap map, boolean z, boolean z2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = map;
        this.f$2 = z;
        this.f$3 = z2;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        boolean z = this.f$3;
        boolean z2 = this.f$2;
        HashMap<String, ContactsController.Contact> map = this.f$1;
        int i2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                ContactsController.getInstance(i2).syncPhoneBookByAlert(map, z2, z, false);
                break;
            case 1:
                Pattern pattern2 = LaunchActivity.PREFIX_T_ME_PATTERN;
                ContactsController.getInstance(i2).syncPhoneBookByAlert(map, z2, z, true);
                break;
            default:
                Pattern pattern3 = LaunchActivity.PREFIX_T_ME_PATTERN;
                ContactsController.getInstance(i2).syncPhoneBookByAlert(map, z2, z, true);
                break;
        }
    }
}
