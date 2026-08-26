package org.telegram.ui;

import android.content.DialogInterface;

public final class ChatActivity$$ExternalSyntheticLambda50 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda50(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showChatThemeBottomSheet$398(dialogInterface);
                break;
            case 1:
                this.f$0.lambda$onResume$244(dialogInterface);
                break;
            case 2:
                this.f$0.lambda$createMenu$298(dialogInterface);
                break;
            case 3:
                this.f$0.lambda$processSelectedOption$325(dialogInterface);
                break;
            case 4:
                this.f$0.lambda$processSelectedOption$317(dialogInterface);
                break;
            case 5:
                this.f$0.lambda$processSelectedOption$318(dialogInterface);
                break;
            case 6:
                this.f$0.lambda$processSelectedOption$353(dialogInterface);
                break;
            case 7:
                this.f$0.lambda$processSelectedOption$340(dialogInterface);
                break;
            default:
                this.f$0.lambda$showQuoteMessageUpdate$196(dialogInterface);
                break;
        }
    }
}
