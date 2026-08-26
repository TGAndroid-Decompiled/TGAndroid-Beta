package org.telegram.ui;

import android.content.DialogInterface;

public final class ChatActivity$$ExternalSyntheticLambda62 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final int f$1;

    public ChatActivity$$ExternalSyntheticLambda62(ChatActivity chatActivity, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = chatActivity;
        this.f$1 = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processSelectedOption$334(this.f$1, dialogInterface);
                break;
            case 1:
                this.f$0.lambda$processSelectedOption$344(this.f$1, dialogInterface);
                break;
            case 2:
                this.f$0.lambda$processSelectedOption$337(this.f$1, dialogInterface);
                break;
            default:
                this.f$0.lambda$showRequestUrlAlert$387(this.f$1, dialogInterface);
                break;
        }
    }
}
