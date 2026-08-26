package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;

public final class PhonebookShareAlert$$ExternalSyntheticLambda2 implements DialogInterface.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PhonebookShareAlert$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((PhonebookShareAlert) this.f$0).lambda$new$1((AndroidUtilities.VcardItem) this.f$1, dialogInterface, i);
                break;
            default:
                ((SharedMediaLayout.AnonymousClass49) this.f$0).lambda$onLinkPress$0((String) this.f$1, dialogInterface, i);
                break;
        }
    }
}
