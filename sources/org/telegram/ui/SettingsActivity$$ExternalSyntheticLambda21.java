package org.telegram.ui;

import android.content.DialogInterface;

public final class SettingsActivity$$ExternalSyntheticLambda21 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final int f$0;

    public SettingsActivity$$ExternalSyntheticLambda21(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                SettingsActivity.lambda$openDebugMenu$20(this.f$0, dialogInterface, i);
                break;
            default:
                ProfileActivity.AnonymousClass15.lambda$onItemClick$2(this.f$0, dialogInterface, i);
                break;
        }
    }
}
