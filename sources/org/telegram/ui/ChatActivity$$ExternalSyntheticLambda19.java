package org.telegram.ui;

import android.content.DialogInterface;

public final class ChatActivity$$ExternalSyntheticLambda19 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda19(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity.AnonymousClass33 anonymousClass33 = this.f$0.fragmentContextView;
                if (anonymousClass33 != null) {
                    anonymousClass33.checkImport(false);
                }
                break;
            case 1:
                this.f$0.lambda$showChatThemeBottomSheet$398();
                break;
            case 2:
                this.f$0.dimBehindView(false, true, 0.0f);
                break;
            case 3:
                this.f$0.dimBehindView(false, true, 0.0f);
                break;
            case 4:
                this.f$0.dimBehindView(false, true, 0.0f);
                break;
            case 5:
                this.f$0.dimBehindView(false, true, 0.0f);
                break;
            case 6:
                this.f$0.dimBehindView(false, true, 0.0f);
                break;
            case 7:
                this.f$0.dimBehindView(false, true, 0.0f);
                break;
            default:
                this.f$0.quoteMessageUpdateAlert = null;
                break;
        }
    }
}
