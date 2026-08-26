package org.telegram.ui;

import android.content.DialogInterface;

public final class ChatRightsEditActivity$$ExternalSyntheticLambda11 implements DialogInterface.OnClickListener {
    public final int $r8$classId;

    public ChatRightsEditActivity$$ExternalSyntheticLambda11(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                ChatRightsEditActivity.lambda$createView$1(dialogInterface, i);
                break;
            default:
                ChatRightsEditActivity.lambda$createView$3(dialogInterface, i);
                break;
        }
    }
}
