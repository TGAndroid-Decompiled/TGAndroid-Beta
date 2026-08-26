package org.telegram.ui;

public final class ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ChatLinkActivity.ListAdapter.AnonymousClass1 f$0;

    public ChatLinkActivity$ListAdapter$1$$ExternalSyntheticLambda3(ChatLinkActivity.ListAdapter.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatLinkActivity.this.joinRequestProgress = false;
                break;
            default:
                ChatLinkActivity.this.joinRequestProgress = false;
                break;
        }
    }
}
