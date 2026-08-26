package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ChatLinkActivity.ListAdapter.AnonymousClass1 f$0;
    public final TLRPC.Chat f$1;
    public final boolean f$2;
    public final Runnable f$3;

    public ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda1(ChatLinkActivity.ListAdapter.AnonymousClass1 anonymousClass1, TLRPC.Chat chat, boolean z, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
        this.f$1 = chat;
        this.f$2 = z;
        this.f$3 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onJoinToSendToggle$9(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$onJoinRequestToggle$3(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
