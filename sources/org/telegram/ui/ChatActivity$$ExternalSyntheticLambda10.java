package org.telegram.ui;

public final class ChatActivity$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final String f$1;

    public ChatActivity$$ExternalSyntheticLambda10(ChatActivity chatActivity, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didLongPressLink$411(this.f$1);
                break;
            case 1:
                this.f$0.lambda$didLongPressLink$413(this.f$1);
                break;
            case 2:
                this.f$0.lambda$createView$73(this.f$1);
                break;
            case 3:
                this.f$0.lambda$didLongPressLink$416(this.f$1);
                break;
            case 4:
                this.f$0.lambda$didLongPressUsername$429(this.f$1);
                break;
            case 5:
                this.f$0.lambda$didPressPhoneNumber$452(this.f$1);
                break;
            case 6:
                this.f$0.lambda$didPressPhoneNumber$453(this.f$1);
                break;
            case 7:
                this.f$0.lambda$didPressPhoneNumber$446(this.f$1);
                break;
            case 8:
                this.f$0.lambda$didPressPhoneNumber$447(this.f$1);
                break;
            case 9:
                this.f$0.lambda$didPressPhoneNumber$448(this.f$1);
                break;
            case 10:
                this.f$0.lambda$openSearchWithText$367(this.f$1);
                break;
            default:
                this.f$0.lambda$openHashtagSearch$368(this.f$1);
                break;
        }
    }
}
