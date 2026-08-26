package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class ChatActivity$$ExternalSyntheticLambda107 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final long f$2;

    public ChatActivity$$ExternalSyntheticLambda107(Object obj, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$updateTopPanel$241(this.f$1, this.f$2, (Long) obj);
                break;
            default:
                ((ChatActivity.AnonymousClass16) this.f$0).lambda$onItemClick$2(this.f$1, this.f$2, (Long) obj);
                break;
        }
    }
}
