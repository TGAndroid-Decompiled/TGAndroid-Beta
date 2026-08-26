package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.RLottieDrawable;

public final class ContactAddActivity$$ExternalSyntheticLambda19 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final ContactAddActivity f$0;
    public final RLottieDrawable f$1;

    public ContactAddActivity$$ExternalSyntheticLambda19(ContactAddActivity contactAddActivity, RLottieDrawable rLottieDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = contactAddActivity;
        this.f$1 = rLottieDrawable;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$7(this.f$1, dialogInterface);
                break;
            default:
                this.f$0.lambda$createView$4(this.f$1, dialogInterface);
                break;
        }
    }
}
