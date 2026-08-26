package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

public final class ChatActivity$16$$ExternalSyntheticLambda2 implements MessagesStorage.IntCallback {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public ChatActivity$16$$ExternalSyntheticLambda2(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run(int i) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity.AnonymousClass16) this.f$0).lambda$onItemClick$3(this.f$1, i);
                break;
            default:
                ((ChatActivity.AnonymousClass16.AnonymousClass1) this.f$0).lambda$run$1(this.f$1, i);
                break;
        }
    }
}
