package org.telegram.ui;

public final class ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final ChatLinkActivity.ListAdapter.AnonymousClass1 f$0;
    public final Runnable f$1;

    public ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda5(ChatLinkActivity.ListAdapter.AnonymousClass1 anonymousClass1, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
        this.f$1 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onJoinRequestToggle$2(this.f$1);
                break;
            case 1:
                this.f$0.lambda$onJoinToSendToggle$8(this.f$1);
                break;
            default:
                this.f$0.lambda$overrideCancel$4(this.f$1);
                break;
        }
    }
}
