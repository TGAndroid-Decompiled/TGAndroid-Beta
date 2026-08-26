package org.telegram.ui;

public final class ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChatLinkActivity.ListAdapter.AnonymousClass1 f$0;

    public ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda2(ChatLinkActivity.ListAdapter.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onJoinToSendToggle$5();
                break;
            default:
                this.f$0.lambda$onJoinRequestToggle$1();
                break;
        }
    }
}
