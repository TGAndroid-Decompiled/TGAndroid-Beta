package org.telegram.ui;

import android.content.DialogInterface;

public final class LinkManager$$ExternalSyntheticLambda4 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final Object f$0;

    public LinkManager$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager) this.f$0).lambda$init$23(dialogInterface);
                break;
            case 1:
                ((ChatActivity) this.f$0).lambda$new$1(dialogInterface);
                break;
            case 2:
                ((ChatEditActivity) this.f$0).lambda$processDone$68(dialogInterface);
                break;
            default:
                ((ChatLinkActivity) this.f$0).lambda$showLinkAlert$7(dialogInterface);
                break;
        }
    }
}
