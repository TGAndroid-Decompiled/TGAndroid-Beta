package org.telegram.ui;

import android.content.DialogInterface;

public final class ChatActivity$$ExternalSyntheticLambda192 implements DialogInterface.OnShowListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda192(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.showPinnedProgress(false);
                break;
            default:
                this.f$0.showPinnedProgress(false);
                break;
        }
    }
}
