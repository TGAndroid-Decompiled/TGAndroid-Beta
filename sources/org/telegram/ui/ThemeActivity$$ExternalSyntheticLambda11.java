package org.telegram.ui;

import android.content.DialogInterface;

public final class ThemeActivity$$ExternalSyntheticLambda11 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public ThemeActivity$$ExternalSyntheticLambda11(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((ThemeActivity) this.f$0).lambda$createView$11(this.f$1, dialogInterface, i);
                break;
            case 1:
                ((EditWidgetActivity.AnonymousClass2) this.f$0).lambda$onItemClick$0(this.f$1, dialogInterface, i);
                break;
            default:
                ((NotificationsSettingsActivity) this.f$0).lambda$createView$9(this.f$1, dialogInterface, i);
                break;
        }
    }
}
