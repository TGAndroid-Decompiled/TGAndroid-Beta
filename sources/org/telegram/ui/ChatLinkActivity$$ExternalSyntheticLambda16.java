package org.telegram.ui;

import android.content.DialogInterface;

public final class ChatLinkActivity$$ExternalSyntheticLambda16 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final ChatLinkActivity f$0;
    public final int f$1;

    public ChatLinkActivity$$ExternalSyntheticLambda16(ChatLinkActivity chatLinkActivity, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatLinkActivity;
        this.f$1 = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$3(this.f$1, dialogInterface);
                break;
            default:
                this.f$0.lambda$linkChat$14(this.f$1, dialogInterface);
                break;
        }
    }
}
