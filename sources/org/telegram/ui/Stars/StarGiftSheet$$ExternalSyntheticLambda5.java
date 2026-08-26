package org.telegram.ui.Stars;

import android.content.DialogInterface;

public final class StarGiftSheet$$ExternalSyntheticLambda5 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final StarGiftSheet f$0;

    public StarGiftSheet$$ExternalSyntheticLambda5(StarGiftSheet starGiftSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.button.setLoading(false);
                break;
            default:
                this.f$0.button.setLoading(false);
                break;
        }
    }
}
