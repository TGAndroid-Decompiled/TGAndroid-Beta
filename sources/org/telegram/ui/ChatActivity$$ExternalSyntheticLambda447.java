package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Stars.StarsController;

public final class ChatActivity$$ExternalSyntheticLambda447 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final long f$2;
    public final Long f$3;

    public ChatActivity$$ExternalSyntheticLambda447(Object obj, long j, long j2, Long l, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = l;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$updateTopPanel$240(this.f$1, this.f$2, this.f$3, (Boolean) obj);
                break;
            default:
                StarsController.getInstance(((BaseFragment) ChatActivity.this).currentAccount, false).stopPaidMessages(this.f$1, this.f$2, this.f$3.longValue() > 0 && ((Boolean) obj).booleanValue(), true);
                break;
        }
    }
}
